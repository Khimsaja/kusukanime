package O1;

import B1.AbstractC0015b;
import B1.C0020g;
import android.net.Uri;
import i2.C1070b;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class O {
    public final Uri a;

    /* renamed from: b, reason: collision with root package name */
    public final E1.B f7294b;

    /* renamed from: c, reason: collision with root package name */
    public final B2.l f7295c;

    /* renamed from: d, reason: collision with root package name */
    public final S f7296d;

    /* renamed from: e, reason: collision with root package name */
    public final C0020g f7297e;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f7299g;

    /* renamed from: i, reason: collision with root package name */
    public long f7301i;

    /* renamed from: j, reason: collision with root package name */
    public E1.k f7302j;

    /* renamed from: k, reason: collision with root package name */
    public V1.G f7303k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f7304l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ S f7305m;

    /* renamed from: f, reason: collision with root package name */
    public final V1.r f7298f = new V1.r();

    /* renamed from: h, reason: collision with root package name */
    public boolean f7300h = true;

    public O(S s7, Uri uri, E1.h hVar, B2.l lVar, S s8, C0020g c0020g) {
        this.f7305m = s7;
        this.a = uri;
        this.f7294b = new E1.B(hVar);
        this.f7295c = lVar;
        this.f7296d = s8;
        this.f7297e = c0020g;
        C0544s.a.getAndIncrement();
        this.f7302j = a(0L);
    }

    public final E1.k a(long j7) {
        Map map = Collections.EMPTY_MAP;
        this.f7305m.getClass();
        Map map2 = S.f7309Z;
        Uri uri = this.a;
        AbstractC0015b.j("The uri must be set.", uri);
        return new E1.k(uri, 0L, 1, null, map2, j7, -1L, null, 6);
    }

    public final void b() {
        E1.h rVar;
        V1.n nVar;
        int i7;
        int i8 = 0;
        while (i8 == 0 && !this.f7299g) {
            try {
                long j7 = this.f7298f.a;
                E1.k kVarA = a(j7);
                this.f7302j = kVarA;
                long jG = this.f7294b.g(kVarA);
                if (this.f7299g) {
                    if (i8 != 1 && this.f7295c.x() != -1) {
                        this.f7298f.a = this.f7295c.x();
                    }
                    E1.B b4 = this.f7294b;
                    if (b4 != null) {
                        try {
                            b4.close();
                            return;
                        } catch (IOException unused) {
                            return;
                        }
                    }
                    return;
                }
                if (jG != -1) {
                    jG += j7;
                    S s7 = this.f7305m;
                    s7.f7311A.post(new M(s7, 0));
                }
                long j8 = jG;
                this.f7305m.f7313C = C1070b.d(this.f7294b.f1836k.d());
                E1.B b7 = this.f7294b;
                C1070b c1070b = this.f7305m.f7313C;
                if (c1070b == null || (i7 = c1070b.f12002f) == -1) {
                    rVar = b7;
                } else {
                    rVar = new r(b7, i7, this);
                    S s8 = this.f7305m;
                    s8.getClass();
                    V1.G gB = s8.B(new Q(0, true));
                    this.f7303k = gB;
                    gB.a(S.f7310a0);
                }
                this.f7295c.G(rVar, this.a, this.f7294b.f1836k.d(), j7, j8, this.f7296d);
                if (this.f7305m.f7313C != null && (nVar = (V1.n) this.f7295c.f417m) != null && (nVar instanceof o2.d)) {
                    ((o2.d) nVar).f13584q = true;
                }
                if (this.f7300h) {
                    B2.l lVar = this.f7295c;
                    long j9 = this.f7301i;
                    V1.n nVar2 = (V1.n) lVar.f417m;
                    nVar2.getClass();
                    nVar2.e(j7, j9);
                    this.f7300h = false;
                }
                while (i8 == 0 && !this.f7299g) {
                    try {
                        C0020g c0020g = this.f7297e;
                        synchronized (c0020g) {
                            while (!c0020g.f328b) {
                                c0020g.wait();
                            }
                        }
                        B2.l lVar2 = this.f7295c;
                        V1.r rVar2 = this.f7298f;
                        V1.n nVar3 = (V1.n) lVar2.f417m;
                        nVar3.getClass();
                        V1.k kVar = (V1.k) lVar2.f418n;
                        kVar.getClass();
                        i8 = nVar3.i(kVar, rVar2);
                        long jX = this.f7295c.x();
                        if (jX > this.f7305m.f7342s + j7) {
                            C0020g c0020g2 = this.f7297e;
                            synchronized (c0020g2) {
                                c0020g2.f328b = false;
                            }
                            S s9 = this.f7305m;
                            s9.f7311A.post(s9.f7349z);
                            j7 = jX;
                        }
                    } catch (InterruptedException unused2) {
                        throw new InterruptedIOException();
                    }
                }
                if (i8 == 1) {
                    i8 = 0;
                } else if (this.f7295c.x() != -1) {
                    this.f7298f.a = this.f7295c.x();
                }
                E1.B b8 = this.f7294b;
                if (b8 != null) {
                    try {
                        b8.close();
                    } catch (IOException unused3) {
                    }
                }
            } catch (Throwable th) {
                if (i8 != 1 && this.f7295c.x() != -1) {
                    this.f7298f.a = this.f7295c.x();
                }
                E1.B b9 = this.f7294b;
                if (b9 != null) {
                    try {
                        b9.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        }
    }
}
