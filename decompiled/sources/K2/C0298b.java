package K2;

import B1.AbstractC0015b;
import d2.C0787c;
import e5.AbstractC0832b;
import f6.C0920r;
import java.io.EOFException;
import java.io.InterruptedIOException;
import s.EnumC1903a0;
import z5.AbstractC2510o;

/* renamed from: K2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0298b implements V1.o, V1.p {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f4550k;

    /* renamed from: l, reason: collision with root package name */
    public long f4551l;

    /* renamed from: m, reason: collision with root package name */
    public Object f4552m;

    public /* synthetic */ C0298b(int i7, long j7, Object obj) {
        this.f4550k = i7;
        this.f4551l = j7;
        this.f4552m = obj;
    }

    @Override // V1.o
    public boolean a(byte[] bArr, int i7, int i8, boolean z7) {
        return ((V1.k) this.f4552m).a(bArr, 0, i8, z7);
    }

    @Override // V1.p
    public void b() {
        ((O1.S) this.f4552m).b();
    }

    @Override // V1.o
    public long c() {
        return ((V1.k) this.f4552m).f9391m - this.f4551l;
    }

    @Override // V1.o
    public void e() {
        ((V1.k) this.f4552m).f9394p = 0;
    }

    @Override // V1.o
    public void f(int i7) {
        ((V1.k) this.f4552m).f(i7);
    }

    @Override // V1.o
    public boolean h(byte[] bArr, int i7, int i8, boolean z7) {
        return ((V1.k) this.f4552m).h(bArr, 0, i8, z7);
    }

    @Override // V1.o
    public long i() {
        return ((V1.k) this.f4552m).i() - this.f4551l;
    }

    @Override // V1.p
    public void k(V1.A a) {
        ((O1.S) this.f4552m).k(new C0787c(this, a, a));
    }

    @Override // V1.o
    public void l(byte[] bArr, int i7, int i8) {
        ((V1.k) this.f4552m).h(bArr, i7, i8, false);
    }

    @Override // V1.p
    public V1.G m(int i7, int i8) {
        return ((O1.S) this.f4552m).m(i7, i8);
    }

    @Override // V1.o
    public void n(int i7) throws EOFException, InterruptedIOException {
        ((V1.k) this.f4552m).b(i7, false);
    }

    @Override // y1.InterfaceC2385g
    public int o(byte[] bArr, int i7, int i8) {
        return ((V1.k) this.f4552m).o(bArr, i7, i8);
    }

    @Override // V1.o
    public long p() {
        return ((V1.k) this.f4552m).f9392n - this.f4551l;
    }

    public g0.c q(s0.r rVar, float f5) {
        float fAbs;
        long jE;
        long jH = g0.c.h(this.f4551l, g0.c.g(rVar.f15470c, rVar.f15474g));
        this.f4551l = jH;
        EnumC1903a0 enumC1903a0 = EnumC1903a0.f15260l;
        EnumC1903a0 enumC1903a02 = (EnumC1903a0) this.f4552m;
        if (enumC1903a02 == null) {
            fAbs = g0.c.c(jH);
        } else {
            fAbs = Math.abs(enumC1903a02 == enumC1903a0 ? g0.c.d(jH) : g0.c.e(jH));
        }
        if (fAbs < f5) {
            return null;
        }
        if (enumC1903a02 == null) {
            long j7 = this.f4551l;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32)) / g0.c.c(j7);
            jE = g0.c.g(this.f4551l, g0.c.i(f5, (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j7 & 4294967295L)) / r9) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32)));
        } else {
            long j8 = this.f4551l;
            float fD = enumC1903a02 == enumC1903a0 ? g0.c.d(j8) : g0.c.e(j8);
            long j9 = this.f4551l;
            float fSignum = fD - (Math.signum(enumC1903a02 == enumC1903a0 ? g0.c.d(j9) : g0.c.e(j9)) * f5);
            long j10 = this.f4551l;
            float fE = enumC1903a02 == enumC1903a0 ? g0.c.e(j10) : g0.c.d(j10);
            jE = enumC1903a02 == enumC1903a0 ? AbstractC0832b.e(fSignum, fE) : AbstractC0832b.e(fE, fSignum);
        }
        return new g0.c(jE);
    }

    public void r(int i7) {
        if (i7 < 64) {
            this.f4551l &= ~(1 << i7);
            return;
        }
        C0298b c0298b = (C0298b) this.f4552m;
        if (c0298b != null) {
            c0298b.r(i7 - 64);
        }
    }

    @Override // V1.o
    public void readFully(byte[] bArr, int i7, int i8) {
        ((V1.k) this.f4552m).a(bArr, i7, i8, false);
    }

    public int s(int i7) {
        C0298b c0298b = (C0298b) this.f4552m;
        if (c0298b == null) {
            return i7 >= 64 ? Long.bitCount(this.f4551l) : Long.bitCount(this.f4551l & ((1 << i7) - 1));
        }
        if (i7 < 64) {
            return Long.bitCount(this.f4551l & ((1 << i7) - 1));
        }
        return Long.bitCount(this.f4551l) + c0298b.s(i7 - 64);
    }

    public void t() {
        if (((C0298b) this.f4552m) == null) {
            this.f4552m = new C0298b();
        }
    }

    public String toString() {
        switch (this.f4550k) {
            case 0:
                if (((C0298b) this.f4552m) == null) {
                    return Long.toBinaryString(this.f4551l);
                }
                return ((C0298b) this.f4552m).toString() + "xx" + Long.toBinaryString(this.f4551l);
            default:
                return super.toString();
        }
    }

    public boolean u(int i7) {
        if (i7 < 64) {
            return (this.f4551l & (1 << i7)) != 0;
        }
        t();
        return ((C0298b) this.f4552m).u(i7 - 64);
    }

    public void v(int i7, boolean z7) {
        if (i7 >= 64) {
            t();
            ((C0298b) this.f4552m).v(i7 - 64, z7);
            return;
        }
        long j7 = this.f4551l;
        boolean z8 = (Long.MIN_VALUE & j7) != 0;
        long j8 = (1 << i7) - 1;
        this.f4551l = ((j7 & (~j8)) << 1) | (j7 & j8);
        if (z7) {
            z(i7);
        } else {
            r(i7);
        }
        if (z8 || ((C0298b) this.f4552m) != null) {
            t();
            ((C0298b) this.f4552m).v(0, z8);
        }
    }

    public C0920r w() {
        D4.S s7 = new D4.S(5, false);
        while (true) {
            String strS = ((w6.C) this.f4552m).s(this.f4551l);
            this.f4551l -= strS.length();
            if (strS.length() == 0) {
                return s7.l();
            }
            int iD0 = AbstractC2510o.d0(strS, ':', 1, 4);
            if (iD0 != -1) {
                String strSubstring = strS.substring(0, iD0);
                kotlin.jvm.internal.l.e("this as java.lang.String…ing(startIndex, endIndex)", strSubstring);
                String strSubstring2 = strS.substring(iD0 + 1);
                kotlin.jvm.internal.l.e("this as java.lang.String).substring(startIndex)", strSubstring2);
                s7.i(strSubstring, strSubstring2);
            } else if (strS.charAt(0) == ':') {
                String strSubstring3 = strS.substring(1);
                kotlin.jvm.internal.l.e("this as java.lang.String).substring(startIndex)", strSubstring3);
                s7.i("", strSubstring3);
            } else {
                s7.i("", strS);
            }
        }
    }

    public boolean x(int i7) {
        if (i7 >= 64) {
            t();
            return ((C0298b) this.f4552m).x(i7 - 64);
        }
        long j7 = 1 << i7;
        long j8 = this.f4551l;
        boolean z7 = (j8 & j7) != 0;
        long j9 = j8 & (~j7);
        this.f4551l = j9;
        long j10 = j7 - 1;
        this.f4551l = (j9 & j10) | Long.rotateRight((~j10) & j9, 1);
        C0298b c0298b = (C0298b) this.f4552m;
        if (c0298b != null) {
            if (c0298b.u(0)) {
                z(63);
            }
            ((C0298b) this.f4552m).x(0);
        }
        return z7;
    }

    public void y() {
        this.f4551l = 0L;
        C0298b c0298b = (C0298b) this.f4552m;
        if (c0298b != null) {
            c0298b.y();
        }
    }

    public void z(int i7) {
        if (i7 < 64) {
            this.f4551l |= 1 << i7;
        } else {
            t();
            ((C0298b) this.f4552m).z(i7 - 64);
        }
    }

    public C0298b(w6.C c2) {
        this.f4550k = 4;
        kotlin.jvm.internal.l.f("source", c2);
        this.f4552m = c2;
        this.f4551l = 262144L;
    }

    public C0298b(V1.k kVar, long j7) {
        this.f4550k = 2;
        this.f4552m = kVar;
        AbstractC0015b.c(kVar.f9392n >= j7);
        this.f4551l = j7;
    }

    public C0298b() {
        this.f4550k = 0;
        this.f4551l = 0L;
    }

    public C0298b(EnumC1903a0 enumC1903a0) {
        this.f4550k = 5;
        this.f4552m = enumC1903a0;
        this.f4551l = 0L;
    }
}
