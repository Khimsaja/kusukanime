package E1;

import B1.K;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import io.ktor.sse.ServerSentEventKt;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.List;

/* loaded from: classes.dex */
public final class A extends AbstractC0134c {

    /* renamed from: o, reason: collision with root package name */
    public final Context f1830o;

    /* renamed from: p, reason: collision with root package name */
    public k f1831p;

    /* renamed from: q, reason: collision with root package name */
    public AssetFileDescriptor f1832q;

    /* renamed from: r, reason: collision with root package name */
    public FileInputStream f1833r;

    /* renamed from: s, reason: collision with root package name */
    public long f1834s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f1835t;

    public A(Context context) {
        super(false);
        this.f1830o = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i7) {
        return Uri.parse("rawresource:///" + i7);
    }

    @Override // E1.h
    public final void close() {
        this.f1831p = null;
        try {
            try {
                FileInputStream fileInputStream = this.f1833r;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f1833r = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f1832q;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e7) {
                        throw new z(null, e7, 2000);
                    }
                } finally {
                    this.f1832q = null;
                    if (this.f1835t) {
                        this.f1835t = false;
                        k();
                    }
                }
            } catch (IOException e8) {
                throw new z(null, e8, 2000);
            }
        } catch (Throwable th) {
            this.f1833r = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f1832q;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f1832q = null;
                    if (this.f1835t) {
                        this.f1835t = false;
                        k();
                    }
                    throw th;
                } catch (IOException e9) {
                    throw new z(null, e9, 2000);
                }
            } finally {
                this.f1832q = null;
                if (this.f1835t) {
                    this.f1835t = false;
                    k();
                }
            }
        }
    }

    @Override // E1.h
    public final long g(k kVar) throws Resources.NotFoundException, i, PackageManager.NameNotFoundException, NumberFormatException {
        Resources resourcesForApplication;
        int identifier;
        int i7;
        Resources resources;
        this.f1831p = kVar;
        m();
        Uri uriNormalizeScheme = kVar.a.normalizeScheme();
        boolean zEquals = TextUtils.equals("rawresource", uriNormalizeScheme.getScheme());
        Context context = this.f1830o;
        if (zEquals) {
            resources = context.getResources();
            List<String> pathSegments = uriNormalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                throw new z("rawresource:// URI must have exactly one path element, found " + pathSegments.size(), null, 2000);
            }
            try {
                i7 = Integer.parseInt(pathSegments.get(0));
            } catch (NumberFormatException unused) {
                throw new z("Resource identifier must be an integer.", null, 1004);
            }
        } else {
            if (!TextUtils.equals("android.resource", uriNormalizeScheme.getScheme())) {
                throw new z("Unsupported URI scheme (" + uriNormalizeScheme.getScheme() + "). Only android.resource is supported.", null, 1004);
            }
            String path = uriNormalizeScheme.getPath();
            path.getClass();
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            String packageName = TextUtils.isEmpty(uriNormalizeScheme.getHost()) ? context.getPackageName() : uriNormalizeScheme.getHost();
            if (packageName.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                } catch (PackageManager.NameNotFoundException e7) {
                    throw new z("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e7, 2005);
                }
            }
            if (path.matches("\\d+")) {
                try {
                    identifier = Integer.parseInt(path);
                } catch (NumberFormatException unused2) {
                    throw new z("Resource identifier must be an integer.", null, 1004);
                }
            } else {
                identifier = resourcesForApplication.getIdentifier(packageName + ServerSentEventKt.COLON + path, "raw", null);
                if (identifier == 0) {
                    throw new z("Resource not found.", null, 2005);
                }
            }
            i7 = identifier;
            resources = resourcesForApplication;
        }
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = resources.openRawResourceFd(i7);
            if (assetFileDescriptorOpenRawResourceFd == null) {
                throw new z("Resource is compressed: " + uriNormalizeScheme, null, 2000);
            }
            this.f1832q = assetFileDescriptorOpenRawResourceFd;
            long length = assetFileDescriptorOpenRawResourceFd.getLength();
            FileInputStream fileInputStream = new FileInputStream(this.f1832q.getFileDescriptor());
            this.f1833r = fileInputStream;
            long j7 = kVar.f1886f;
            try {
                if (length != -1 && j7 > length) {
                    throw new z(null, null, 2008);
                }
                long startOffset = this.f1832q.getStartOffset();
                long jSkip = fileInputStream.skip(startOffset + j7) - startOffset;
                if (jSkip != j7) {
                    throw new z(null, null, 2008);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    if (channel.size() == 0) {
                        this.f1834s = -1L;
                    } else {
                        long size = channel.size() - channel.position();
                        this.f1834s = size;
                        if (size < 0) {
                            throw new z(null, null, 2008);
                        }
                    }
                } else {
                    long j8 = length - jSkip;
                    this.f1834s = j8;
                    if (j8 < 0) {
                        throw new i(2008);
                    }
                }
                long j9 = kVar.f1887g;
                if (j9 != -1) {
                    long j10 = this.f1834s;
                    this.f1834s = j10 == -1 ? j9 : Math.min(j10, j9);
                }
                this.f1835t = true;
                q(kVar);
                return j9 != -1 ? j9 : this.f1834s;
            } catch (z e8) {
                throw e8;
            } catch (IOException e9) {
                throw new z(null, e9, 2000);
            }
        } catch (Resources.NotFoundException e10) {
            throw new z(null, e10, 2005);
        }
    }

    @Override // E1.h
    public final Uri getUri() {
        k kVar = this.f1831p;
        if (kVar != null) {
            return kVar.a;
        }
        return null;
    }

    @Override // y1.InterfaceC2385g
    public final int o(byte[] bArr, int i7, int i8) throws IOException {
        if (i8 == 0) {
            return 0;
        }
        long j7 = this.f1834s;
        if (j7 != 0) {
            if (j7 != -1) {
                try {
                    i8 = (int) Math.min(j7, i8);
                } catch (IOException e7) {
                    throw new z(null, e7, 2000);
                }
            }
            FileInputStream fileInputStream = this.f1833r;
            int i9 = K.a;
            int i10 = fileInputStream.read(bArr, i7, i8);
            if (i10 != -1) {
                long j8 = this.f1834s;
                if (j8 != -1) {
                    this.f1834s = j8 - i10;
                }
                b(i10);
                return i10;
            }
            if (this.f1834s != -1) {
                throw new z("End of stream reached having not read sufficient data.", new EOFException(), 2000);
            }
        }
        return -1;
    }
}
