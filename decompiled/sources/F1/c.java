package F1;

import B1.AbstractC0015b;
import B1.K;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class c {
    public final u a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2156b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2157c;

    /* renamed from: d, reason: collision with root package name */
    public E1.k f2158d;

    /* renamed from: e, reason: collision with root package name */
    public long f2159e;

    /* renamed from: f, reason: collision with root package name */
    public File f2160f;

    /* renamed from: g, reason: collision with root package name */
    public OutputStream f2161g;

    /* renamed from: h, reason: collision with root package name */
    public long f2162h;

    /* renamed from: i, reason: collision with root package name */
    public long f2163i;

    /* renamed from: j, reason: collision with root package name */
    public s f2164j;

    public c(u uVar) {
        uVar.getClass();
        this.a = uVar;
        this.f2156b = 5242880L;
        this.f2157c = 20480;
    }

    public final void a() throws IOException {
        OutputStream outputStream = this.f2161g;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            K.f(this.f2161g);
            this.f2161g = null;
            File file = this.f2160f;
            this.f2160f = null;
            long j7 = this.f2162h;
            u uVar = this.a;
            synchronized (uVar) {
                if (file.exists()) {
                    if (j7 == 0) {
                        file.delete();
                        return;
                    }
                    v vVarB = v.b(file, j7, -9223372036854775807L, uVar.f2217c);
                    vVarB.getClass();
                    k kVarK = uVar.f2217c.k(vVarB.f2190k);
                    kVarK.getClass();
                    AbstractC0015b.h(kVarK.a(vVarB.f2191l, vVarB.f2192m));
                    long jA = o.a(kVarK.f2200e);
                    if (jA != -1) {
                        AbstractC0015b.h(vVarB.f2191l + vVarB.f2192m <= jA);
                    }
                    if (uVar.f2218d == null) {
                        uVar.b(vVarB);
                        uVar.f2217c.y();
                        uVar.notifyAll();
                        return;
                    }
                    try {
                        uVar.f2218d.e(vVarB.f2192m, vVarB.f2195p, file.getName());
                        uVar.b(vVarB);
                        try {
                            uVar.f2217c.y();
                            uVar.notifyAll();
                            return;
                        } catch (IOException e7) {
                            throw new a(e7);
                        }
                    } catch (IOException e8) {
                        throw new a(e8);
                    }
                }
            }
        } catch (Throwable th) {
            K.f(this.f2161g);
            this.f2161g = null;
            File file2 = this.f2160f;
            this.f2160f = null;
            file2.delete();
            throw th;
        }
    }

    public final void b(E1.k kVar) {
        File fileC;
        long j7 = kVar.f1887g;
        long jMin = j7 == -1 ? -1L : Math.min(j7 - this.f2163i, this.f2159e);
        u uVar = this.a;
        String str = kVar.f1888h;
        int i7 = K.a;
        long j8 = kVar.f1886f + this.f2163i;
        synchronized (uVar) {
            try {
                uVar.d();
                k kVarK = uVar.f2217c.k(str);
                kVarK.getClass();
                AbstractC0015b.h(kVarK.a(j8, jMin));
                if (!uVar.a.exists()) {
                    u.e(uVar.a);
                    uVar.m();
                }
                r rVar = uVar.f2216b;
                if (jMin != -1) {
                    rVar.a(uVar, jMin);
                } else {
                    rVar.getClass();
                }
                File file = new File(uVar.a, Integer.toString(uVar.f2220f.nextInt(10)));
                if (!file.exists()) {
                    u.e(file);
                }
                fileC = v.c(file, kVarK.a, j8, System.currentTimeMillis());
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f2160f = fileC;
        FileOutputStream fileOutputStream = new FileOutputStream(this.f2160f);
        if (this.f2157c > 0) {
            s sVar = this.f2164j;
            if (sVar == null) {
                this.f2164j = new s(fileOutputStream, this.f2157c);
            } else {
                sVar.b(fileOutputStream);
            }
            this.f2161g = this.f2164j;
        } else {
            this.f2161g = fileOutputStream;
        }
        this.f2162h = 0L;
    }
}
