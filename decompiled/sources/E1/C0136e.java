package E1;

import B1.K;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* renamed from: E1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0136e extends AbstractC0134c {

    /* renamed from: o, reason: collision with root package name */
    public final ContentResolver f1861o;

    /* renamed from: p, reason: collision with root package name */
    public Uri f1862p;

    /* renamed from: q, reason: collision with root package name */
    public AssetFileDescriptor f1863q;

    /* renamed from: r, reason: collision with root package name */
    public FileInputStream f1864r;

    /* renamed from: s, reason: collision with root package name */
    public long f1865s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f1866t;

    public C0136e(Context context) {
        super(false);
        this.f1861o = context.getContentResolver();
    }

    @Override // E1.h
    public final void close() {
        this.f1862p = null;
        try {
            try {
                FileInputStream fileInputStream = this.f1864r;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f1864r = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f1863q;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e7) {
                        throw new C0135d(e7, 2000);
                    }
                } finally {
                    this.f1863q = null;
                    if (this.f1866t) {
                        this.f1866t = false;
                        k();
                    }
                }
            } catch (IOException e8) {
                throw new C0135d(e8, 2000);
            }
        } catch (Throwable th) {
            this.f1864r = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f1863q;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f1863q = null;
                    if (this.f1866t) {
                        this.f1866t = false;
                        k();
                    }
                    throw th;
                } catch (IOException e9) {
                    throw new C0135d(e9, 2000);
                }
            } finally {
                this.f1863q = null;
                if (this.f1866t) {
                    this.f1866t = false;
                    k();
                }
            }
        }
    }

    @Override // E1.h
    public final long g(k kVar) throws IOException {
        int i7;
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        try {
            try {
                Uri uriNormalizeScheme = kVar.a.normalizeScheme();
                this.f1862p = uriNormalizeScheme;
                m();
                boolean zEquals = "content".equals(uriNormalizeScheme.getScheme());
                ContentResolver contentResolver = this.f1861o;
                if (zEquals) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(uriNormalizeScheme, "*/*", bundle);
                } else {
                    assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uriNormalizeScheme, "r");
                }
                this.f1863q = assetFileDescriptorOpenAssetFileDescriptor;
                if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                    i7 = 2000;
                    try {
                        throw new C0135d(new IOException("Could not open file descriptor for: " + uriNormalizeScheme), 2000);
                    } catch (IOException e7) {
                        e = e7;
                        if (e instanceof FileNotFoundException) {
                            i7 = 2005;
                        }
                        throw new C0135d(e, i7);
                    }
                }
                long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
                this.f1864r = fileInputStream;
                long j7 = kVar.f1886f;
                if (length != -1 && j7 > length) {
                    throw new C0135d(null, 2008);
                }
                long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
                long jSkip = fileInputStream.skip(startOffset + j7) - startOffset;
                if (jSkip != j7) {
                    throw new C0135d(null, 2008);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.f1865s = -1L;
                    } else {
                        long jPosition = size - channel.position();
                        this.f1865s = jPosition;
                        if (jPosition < 0) {
                            throw new C0135d(null, 2008);
                        }
                    }
                } else {
                    long j8 = length - jSkip;
                    this.f1865s = j8;
                    if (j8 < 0) {
                        throw new C0135d(null, 2008);
                    }
                }
                long j9 = kVar.f1887g;
                if (j9 != -1) {
                    long j10 = this.f1865s;
                    this.f1865s = j10 == -1 ? j9 : Math.min(j10, j9);
                }
                this.f1866t = true;
                q(kVar);
                return j9 != -1 ? j9 : this.f1865s;
            } catch (C0135d e8) {
                throw e8;
            }
        } catch (IOException e9) {
            e = e9;
            i7 = 2000;
        }
    }

    @Override // E1.h
    public final Uri getUri() {
        return this.f1862p;
    }

    @Override // y1.InterfaceC2385g
    public final int o(byte[] bArr, int i7, int i8) throws IOException {
        if (i8 == 0) {
            return 0;
        }
        long j7 = this.f1865s;
        if (j7 != 0) {
            if (j7 != -1) {
                try {
                    i8 = (int) Math.min(j7, i8);
                } catch (IOException e7) {
                    throw new C0135d(e7, 2000);
                }
            }
            FileInputStream fileInputStream = this.f1864r;
            int i9 = K.a;
            int i10 = fileInputStream.read(bArr, i7, i8);
            if (i10 != -1) {
                long j8 = this.f1865s;
                if (j8 != -1) {
                    this.f1865s = j8 - i10;
                }
                b(i10);
                return i10;
            }
        }
        return -1;
    }
}
