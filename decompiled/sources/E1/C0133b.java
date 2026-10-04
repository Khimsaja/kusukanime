package E1;

import B1.K;
import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: E1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0133b extends AbstractC0134c {

    /* renamed from: o, reason: collision with root package name */
    public final AssetManager f1852o;

    /* renamed from: p, reason: collision with root package name */
    public Uri f1853p;

    /* renamed from: q, reason: collision with root package name */
    public InputStream f1854q;

    /* renamed from: r, reason: collision with root package name */
    public long f1855r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1856s;

    public C0133b(Context context) {
        super(false);
        this.f1852o = context.getAssets();
    }

    @Override // E1.h
    public final void close() {
        this.f1853p = null;
        try {
            try {
                InputStream inputStream = this.f1854q;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e7) {
                throw new C0132a(e7, 2000);
            }
        } finally {
            this.f1854q = null;
            if (this.f1856s) {
                this.f1856s = false;
                k();
            }
        }
    }

    @Override // E1.h
    public final long g(k kVar) throws IOException {
        try {
            Uri uri = kVar.a;
            long j7 = kVar.f1886f;
            this.f1853p = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            m();
            InputStream inputStreamOpen = this.f1852o.open(path, 1);
            this.f1854q = inputStreamOpen;
            if (inputStreamOpen.skip(j7) < j7) {
                throw new C0132a(null, 2008);
            }
            long j8 = kVar.f1887g;
            if (j8 != -1) {
                this.f1855r = j8;
            } else {
                long jAvailable = this.f1854q.available();
                this.f1855r = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f1855r = -1L;
                }
            }
            this.f1856s = true;
            q(kVar);
            return this.f1855r;
        } catch (C0132a e7) {
            throw e7;
        } catch (IOException e8) {
            throw new C0132a(e8, e8 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // E1.h
    public final Uri getUri() {
        return this.f1853p;
    }

    @Override // y1.InterfaceC2385g
    public final int o(byte[] bArr, int i7, int i8) throws IOException {
        if (i8 == 0) {
            return 0;
        }
        long j7 = this.f1855r;
        if (j7 != 0) {
            if (j7 != -1) {
                try {
                    i8 = (int) Math.min(j7, i8);
                } catch (IOException e7) {
                    throw new C0132a(e7, 2000);
                }
            }
            InputStream inputStream = this.f1854q;
            int i9 = K.a;
            int i10 = inputStream.read(bArr, i7, i8);
            if (i10 != -1) {
                long j8 = this.f1855r;
                if (j8 != -1) {
                    this.f1855r = j8 - i10;
                }
                b(i10);
                return i10;
            }
        }
        return -1;
    }
}
