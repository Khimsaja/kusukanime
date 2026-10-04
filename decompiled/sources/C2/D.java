package C2;

import B1.AbstractC0015b;
import O1.S;
import V1.C0599d;
import V1.C0600e;
import android.util.SparseArray;
import io.ktor.client.utils.CIOKt;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* loaded from: classes.dex */
public final class D implements V1.n {

    /* renamed from: e, reason: collision with root package name */
    public boolean f651e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f652f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f653g;

    /* renamed from: h, reason: collision with root package name */
    public long f654h;

    /* renamed from: i, reason: collision with root package name */
    public A f655i;

    /* renamed from: j, reason: collision with root package name */
    public S f656j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f657k;
    public final B1.H a = new B1.H(0);

    /* renamed from: c, reason: collision with root package name */
    public final B1.B f649c = new B1.B(4096);

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray f648b = new SparseArray();

    /* renamed from: d, reason: collision with root package name */
    public final B f650d = new B(0);

    @Override // V1.n
    public final boolean b(V1.o oVar) throws EOFException, InterruptedIOException {
        byte[] bArr = new byte[14];
        V1.k kVar = (V1.k) oVar;
        kVar.h(bArr, 0, 14, false);
        if (442 == (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            kVar.b(bArr[13] & 7, false);
            kVar.h(bArr, 0, 3, false);
            if (1 == (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
                return true;
            }
        }
        return false;
    }

    @Override // V1.n
    public final void d(V1.p pVar) {
        this.f656j = (S) pVar;
    }

    @Override // V1.n
    public final void e(long j7, long j8) {
        long j9;
        B1.H h7 = this.a;
        synchronized (h7) {
            j9 = h7.f297b;
        }
        boolean z7 = j9 == -9223372036854775807L;
        if (!z7) {
            long jD = h7.d();
            z7 = (jD == -9223372036854775807L || jD == 0 || jD == j8) ? false : true;
        }
        if (z7) {
            h7.e(j8);
        }
        A a = this.f655i;
        if (a != null) {
            a.B(j8);
        }
        int i7 = 0;
        while (true) {
            SparseArray sparseArray = this.f648b;
            if (i7 >= sparseArray.size()) {
                return;
            }
            C c2 = (C) sparseArray.valueAt(i7);
            c2.f646f = false;
            c2.a.a();
            i7++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [boolean, int] */
    @Override // V1.n
    public final int i(V1.o oVar, V1.r rVar) {
        int i7;
        ?? r2;
        B1.B b4;
        InterfaceC0037j c0039l;
        AbstractC0015b.i(this.f656j);
        long j7 = ((V1.k) oVar).f9391m;
        int i8 = (j7 > (-1L) ? 1 : (j7 == (-1L) ? 0 : -1));
        long j8 = -9223372036854775807L;
        B b7 = this.f650d;
        if (i8 != 0 && !b7.f636d) {
            boolean z7 = b7.f638f;
            B1.B b8 = b7.f635c;
            if (!z7) {
                V1.k kVar = (V1.k) oVar;
                long j9 = kVar.f9391m;
                int iMin = (int) Math.min(20000L, j9);
                long j10 = j9 - iMin;
                if (kVar.f9392n != j10) {
                    rVar.a = j10;
                    return 1;
                }
                b8.C(iMin);
                kVar.f9394p = 0;
                kVar.h(b8.a, 0, iMin, false);
                int i9 = b8.f288b;
                int i10 = b8.f289c - 4;
                while (true) {
                    if (i10 < i9) {
                        break;
                    }
                    if (B.b(b8.a, i10) == 442) {
                        b8.F(i10 + 4);
                        long jC = B.c(b8);
                        if (jC != -9223372036854775807L) {
                            j8 = jC;
                            break;
                        }
                    }
                    i10--;
                }
                b7.f640h = j8;
                b7.f638f = true;
                return 0;
            }
            if (b7.f640h == -9223372036854775807L) {
                b7.a((V1.k) oVar);
                return 0;
            }
            if (b7.f637e) {
                long j11 = b7.f639g;
                if (j11 == -9223372036854775807L) {
                    b7.a((V1.k) oVar);
                    return 0;
                }
                B1.H h7 = b7.f634b;
                b7.f641i = h7.c(b7.f640h) - h7.b(j11);
                b7.a((V1.k) oVar);
                return 0;
            }
            V1.k kVar2 = (V1.k) oVar;
            int iMin2 = (int) Math.min(20000L, kVar2.f9391m);
            long j12 = 0;
            if (kVar2.f9392n != j12) {
                rVar.a = j12;
                return 1;
            }
            b8.C(iMin2);
            kVar2.f9394p = 0;
            kVar2.h(b8.a, 0, iMin2, false);
            int i11 = b8.f288b;
            int i12 = b8.f289c;
            while (true) {
                if (i11 >= i12 - 3) {
                    break;
                }
                if (B.b(b8.a, i11) == 442) {
                    b8.F(i11 + 4);
                    long jC2 = B.c(b8);
                    if (jC2 != -9223372036854775807L) {
                        j8 = jC2;
                        break;
                    }
                }
                i11++;
            }
            b7.f639g = j8;
            b7.f637e = true;
            return 0;
        }
        if (this.f657k) {
            i7 = i8;
            r2 = 0;
        } else {
            this.f657k = true;
            long j13 = b7.f641i;
            if (j13 != -9223372036854775807L) {
                i7 = i8;
                r2 = 0;
                A a = new A(new R1.i(2), new F.w(b7.f634b), j13, j13 + 1, 0L, j7, 188L, CIOKt.DEFAULT_HTTP_POOL_SIZE);
                this.f655i = a;
                this.f656j.k((C0599d) a.f9381c);
            } else {
                i7 = i8;
                r2 = 0;
                this.f656j.k(new V1.s(j13));
            }
        }
        A a7 = this.f655i;
        if (a7 != null && ((C0600e) a7.f9383e) != null) {
            return a7.u((V1.k) oVar, rVar);
        }
        V1.k kVar3 = (V1.k) oVar;
        kVar3.f9394p = r2;
        long jI = i7 != 0 ? j7 - kVar3.i() : -1L;
        if (jI != -1 && jI < 4) {
            return -1;
        }
        B1.B b9 = this.f649c;
        if (!kVar3.h(b9.a, r2, 4, true)) {
            return -1;
        }
        b9.F(r2);
        int iG = b9.g();
        if (iG == 441) {
            return -1;
        }
        if (iG == 442) {
            kVar3.h(b9.a, r2, 10, r2);
            b9.F(9);
            kVar3.f((b9.t() & 7) + 14);
            return r2;
        }
        if (iG == 443) {
            kVar3.h(b9.a, r2, 2, r2);
            b9.F(r2);
            kVar3.f(b9.z() + 6);
            return r2;
        }
        if (((iG & (-256)) >> 8) != 1) {
            kVar3.f(1);
            return r2;
        }
        int i13 = iG & 255;
        SparseArray sparseArray = this.f648b;
        C c2 = (C) sparseArray.get(i13);
        if (!this.f651e) {
            if (c2 == null) {
                if (i13 == 189) {
                    c0039l = new C0030c("video/mp2p");
                    this.f652f = true;
                    this.f654h = kVar3.f9392n;
                } else if ((iG & 224) == 192) {
                    c0039l = new v(null, r2, "video/mp2p");
                    this.f652f = true;
                    this.f654h = kVar3.f9392n;
                } else if ((iG & 240) == 224) {
                    c0039l = new C0039l(null, "video/mp2p");
                    this.f653g = true;
                    this.f654h = kVar3.f9392n;
                } else {
                    c0039l = null;
                }
                if (c0039l != null) {
                    c0039l.e(this.f656j, new K(i13, 256));
                    c2 = new C(c0039l, this.a);
                    sparseArray.put(i13, c2);
                }
            }
            if (kVar3.f9392n > ((this.f652f && this.f653g) ? this.f654h + 8192 : 1048576L)) {
                this.f651e = true;
                this.f656j.b();
            }
        }
        kVar3.h(b9.a, r2, 2, r2);
        b9.F(r2);
        int iZ = b9.z() + 6;
        if (c2 == null) {
            kVar3.f(iZ);
            return r2;
        }
        b9.C(iZ);
        kVar3.a(b9.a, r2, iZ, r2);
        b9.F(6);
        B1.A a8 = c2.f643c;
        b9.e(a8.f281b, r2, 3);
        a8.q(r2);
        a8.t(8);
        c2.f644d = a8.h();
        c2.f645e = a8.h();
        a8.t(6);
        b9.e(a8.f281b, r2, a8.i(8));
        a8.q(r2);
        c2.f647g = 0L;
        if (c2.f644d) {
            a8.t(4);
            a8.t(1);
            a8.t(1);
            long jI2 = (a8.i(3) << 30) | (a8.i(15) << 15) | a8.i(15);
            a8.t(1);
            boolean z8 = c2.f646f;
            B1.H h8 = c2.f642b;
            if (z8 || !c2.f645e) {
                b4 = b9;
            } else {
                a8.t(4);
                a8.t(1);
                b4 = b9;
                a8.t(1);
                a8.t(1);
                h8.b((a8.i(15) << 15) | (a8.i(3) << 30) | a8.i(15));
                c2.f646f = true;
            }
            c2.f647g = h8.b(jI2);
        } else {
            b4 = b9;
        }
        long j14 = c2.f647g;
        InterfaceC0037j interfaceC0037j = c2.a;
        interfaceC0037j.d(4, j14);
        interfaceC0037j.b(b4);
        interfaceC0037j.c(false);
        b4.E(b4.a.length);
        return 0;
    }

    @Override // V1.n
    public final void a() {
    }
}
