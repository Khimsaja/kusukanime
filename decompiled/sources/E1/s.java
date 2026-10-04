package E1;

import B1.K;
import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import v.c0;

/* loaded from: classes.dex */
public final class s extends AbstractC0134c {

    /* renamed from: o, reason: collision with root package name */
    public RandomAccessFile f1921o;

    /* renamed from: p, reason: collision with root package name */
    public Uri f1922p;

    /* renamed from: q, reason: collision with root package name */
    public long f1923q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f1924r;

    @Override // E1.h
    public final void close() {
        this.f1922p = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f1921o;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e7) {
                throw new r(e7, 2000);
            }
        } finally {
            this.f1921o = null;
            if (this.f1924r) {
                this.f1924r = false;
                k();
            }
        }
    }

    @Override // E1.h
    public final long g(k kVar) throws IOException {
        Uri uri = kVar.a;
        long j7 = kVar.f1886f;
        this.f1922p = uri;
        m();
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f1921o = randomAccessFile;
            try {
                randomAccessFile.seek(j7);
                long length = kVar.f1887g;
                if (length == -1) {
                    length = this.f1921o.length() - j7;
                }
                this.f1923q = length;
                if (length < 0) {
                    throw new r(null, null, 2008);
                }
                this.f1924r = true;
                q(kVar);
                return this.f1923q;
            } catch (IOException e7) {
                throw new r(e7, 2000);
            }
        } catch (FileNotFoundException e8) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new r(e8, ((e8.getCause() instanceof ErrnoException) && ((ErrnoException) e8.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder sbC = c0.c("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
            sbC.append(fragment);
            throw new r(sbC.toString(), e8, 1004);
        } catch (SecurityException e9) {
            throw new r(e9, 2006);
        } catch (RuntimeException e10) {
            throw new r(e10, 2000);
        }
    }

    @Override // E1.h
    public final Uri getUri() {
        return this.f1922p;
    }

    @Override // y1.InterfaceC2385g
    public final int o(byte[] bArr, int i7, int i8) throws IOException {
        if (i8 == 0) {
            return 0;
        }
        long j7 = this.f1923q;
        if (j7 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f1921o;
            int i9 = K.a;
            int i10 = randomAccessFile.read(bArr, i7, (int) Math.min(j7, i8));
            if (i10 > 0) {
                this.f1923q -= i10;
                b(i10);
            }
            return i10;
        } catch (IOException e7) {
            throw new r(e7, 2000);
        }
    }
}
