package R4;

import X4.AbstractC0605b;
import X4.AbstractC0613j;
import X4.AbstractC0614k;
import X4.AbstractC0618o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class A extends AbstractC0614k {

    /* renamed from: A, reason: collision with root package name */
    public a0 f8100A;

    /* renamed from: B, reason: collision with root package name */
    public List f8101B;

    /* renamed from: C, reason: collision with root package name */
    public C0585p f8102C;

    /* renamed from: D, reason: collision with root package name */
    public List f8103D;

    /* renamed from: E, reason: collision with root package name */
    public List f8104E;

    /* renamed from: F, reason: collision with root package name */
    public List f8105F;

    /* renamed from: n, reason: collision with root package name */
    public int f8106n;

    /* renamed from: o, reason: collision with root package name */
    public int f8107o;

    /* renamed from: p, reason: collision with root package name */
    public int f8108p;

    /* renamed from: q, reason: collision with root package name */
    public int f8109q;

    /* renamed from: r, reason: collision with root package name */
    public U f8110r;

    /* renamed from: s, reason: collision with root package name */
    public int f8111s;

    /* renamed from: t, reason: collision with root package name */
    public List f8112t;

    /* renamed from: u, reason: collision with root package name */
    public U f8113u;

    /* renamed from: v, reason: collision with root package name */
    public int f8114v;

    /* renamed from: w, reason: collision with root package name */
    public List f8115w;

    /* renamed from: x, reason: collision with root package name */
    public List f8116x;

    /* renamed from: y, reason: collision with root package name */
    public List f8117y;

    /* renamed from: z, reason: collision with root package name */
    public List f8118z;

    public static A h() {
        A a = new A();
        a.f8107o = 6;
        a.f8108p = 6;
        U u5 = U.f8290D;
        a.f8110r = u5;
        List list = Collections.EMPTY_LIST;
        a.f8112t = list;
        a.f8113u = u5;
        a.f8115w = list;
        a.f8116x = list;
        a.f8117y = list;
        a.f8118z = list;
        a.f8100A = a0.f8362q;
        a.f8101B = list;
        a.f8102C = C0585p.f8586o;
        a.f8103D = list;
        a.f8104E = list;
        a.f8105F = list;
        return a;
    }

    @Override // X4.AbstractC0613j
    public final AbstractC0605b c() {
        B bG = g();
        if (bG.a()) {
            return bG;
        }
        throw new D6.r();
    }

    public final Object clone() {
        A aH = h();
        aH.i(g());
        return aH;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // X4.AbstractC0613j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X4.AbstractC0613j d(X4.C0609f r3, X4.C0611h r4) throws java.lang.Throwable {
        /*
            r2 = this;
            r0 = 0
            R4.a r1 = R4.B.J     // Catch: java.lang.Throwable -> Lf X4.r -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf X4.r -> L11
            R4.B r1 = new R4.B     // Catch: java.lang.Throwable -> Lf X4.r -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf X4.r -> L11
            r2.i(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            X4.b r4 = r3.f9907k     // Catch: java.lang.Throwable -> Lf
            R4.B r4 = (R4.B) r4     // Catch: java.lang.Throwable -> Lf
            throw r3     // Catch: java.lang.Throwable -> L17
        L17:
            r3 = move-exception
            r0 = r4
        L19:
            if (r0 == 0) goto L1e
            r2.i(r0)
        L1e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: R4.A.d(X4.f, X4.h):X4.j");
    }

    @Override // X4.AbstractC0613j
    public final /* bridge */ /* synthetic */ AbstractC0613j e(AbstractC0618o abstractC0618o) {
        i((B) abstractC0618o);
        return this;
    }

    public final B g() {
        B b4 = new B(this);
        int i7 = this.f8106n;
        int i8 = (i7 & 1) != 1 ? 0 : 1;
        b4.f8129n = this.f8107o;
        if ((i7 & 2) == 2) {
            i8 |= 2;
        }
        b4.f8130o = this.f8108p;
        if ((i7 & 4) == 4) {
            i8 |= 4;
        }
        b4.f8131p = this.f8109q;
        if ((i7 & 8) == 8) {
            i8 |= 8;
        }
        b4.f8132q = this.f8110r;
        if ((i7 & 16) == 16) {
            i8 |= 16;
        }
        b4.f8133r = this.f8111s;
        if ((i7 & 32) == 32) {
            this.f8112t = Collections.unmodifiableList(this.f8112t);
            this.f8106n &= -33;
        }
        b4.f8134s = this.f8112t;
        if ((i7 & 64) == 64) {
            i8 |= 32;
        }
        b4.f8135t = this.f8113u;
        if ((i7 & 128) == 128) {
            i8 |= 64;
        }
        b4.f8136u = this.f8114v;
        if ((this.f8106n & 256) == 256) {
            this.f8115w = Collections.unmodifiableList(this.f8115w);
            this.f8106n &= -257;
        }
        b4.f8137v = this.f8115w;
        if ((this.f8106n & 512) == 512) {
            this.f8116x = Collections.unmodifiableList(this.f8116x);
            this.f8106n &= -513;
        }
        b4.f8138w = this.f8116x;
        if ((this.f8106n & 1024) == 1024) {
            this.f8117y = Collections.unmodifiableList(this.f8117y);
            this.f8106n &= -1025;
        }
        b4.f8140y = this.f8117y;
        if ((this.f8106n & 2048) == 2048) {
            this.f8118z = Collections.unmodifiableList(this.f8118z);
            this.f8106n &= -2049;
        }
        b4.f8141z = this.f8118z;
        if ((i7 & 4096) == 4096) {
            i8 |= 128;
        }
        b4.f8119A = this.f8100A;
        if ((this.f8106n & 8192) == 8192) {
            this.f8101B = Collections.unmodifiableList(this.f8101B);
            this.f8106n &= -8193;
        }
        b4.f8120B = this.f8101B;
        if ((i7 & 16384) == 16384) {
            i8 |= 256;
        }
        b4.f8121C = this.f8102C;
        if ((this.f8106n & 32768) == 32768) {
            this.f8103D = Collections.unmodifiableList(this.f8103D);
            this.f8106n &= -32769;
        }
        b4.f8122D = this.f8103D;
        if ((this.f8106n & 65536) == 65536) {
            this.f8104E = Collections.unmodifiableList(this.f8104E);
            this.f8106n &= -65537;
        }
        b4.f8123E = this.f8104E;
        if ((this.f8106n & 131072) == 131072) {
            this.f8105F = Collections.unmodifiableList(this.f8105F);
            this.f8106n &= -131073;
        }
        b4.f8124F = this.f8105F;
        b4.f8128m = i8;
        return b4;
    }

    public final void i(B b4) {
        C0585p c0585p;
        a0 a0Var;
        U u5;
        U u7;
        if (b4 == B.I) {
            return;
        }
        int i7 = b4.f8128m;
        if ((i7 & 1) == 1) {
            int i8 = b4.f8129n;
            this.f8106n = 1 | this.f8106n;
            this.f8107o = i8;
        }
        if ((i7 & 2) == 2) {
            int i9 = b4.f8130o;
            this.f8106n = 2 | this.f8106n;
            this.f8108p = i9;
        }
        if ((i7 & 4) == 4) {
            int i10 = b4.f8131p;
            this.f8106n = 4 | this.f8106n;
            this.f8109q = i10;
        }
        if ((i7 & 8) == 8) {
            U u8 = b4.f8132q;
            if ((this.f8106n & 8) != 8 || (u7 = this.f8110r) == U.f8290D) {
                this.f8110r = u8;
            } else {
                T tR = U.r(u7);
                tR.i(u8);
                this.f8110r = tR.g();
            }
            this.f8106n |= 8;
        }
        if ((b4.f8128m & 16) == 16) {
            int i11 = b4.f8133r;
            this.f8106n = 16 | this.f8106n;
            this.f8111s = i11;
        }
        if (!b4.f8134s.isEmpty()) {
            if (this.f8112t.isEmpty()) {
                this.f8112t = b4.f8134s;
                this.f8106n &= -33;
            } else {
                if ((this.f8106n & 32) != 32) {
                    this.f8112t = new ArrayList(this.f8112t);
                    this.f8106n |= 32;
                }
                this.f8112t.addAll(b4.f8134s);
            }
        }
        if ((b4.f8128m & 32) == 32) {
            U u9 = b4.f8135t;
            if ((this.f8106n & 64) != 64 || (u5 = this.f8113u) == U.f8290D) {
                this.f8113u = u9;
            } else {
                T tR2 = U.r(u5);
                tR2.i(u9);
                this.f8113u = tR2.g();
            }
            this.f8106n |= 64;
        }
        if ((b4.f8128m & 64) == 64) {
            int i12 = b4.f8136u;
            this.f8106n |= 128;
            this.f8114v = i12;
        }
        if (!b4.f8137v.isEmpty()) {
            if (this.f8115w.isEmpty()) {
                this.f8115w = b4.f8137v;
                this.f8106n &= -257;
            } else {
                if ((this.f8106n & 256) != 256) {
                    this.f8115w = new ArrayList(this.f8115w);
                    this.f8106n |= 256;
                }
                this.f8115w.addAll(b4.f8137v);
            }
        }
        if (!b4.f8138w.isEmpty()) {
            if (this.f8116x.isEmpty()) {
                this.f8116x = b4.f8138w;
                this.f8106n &= -513;
            } else {
                if ((this.f8106n & 512) != 512) {
                    this.f8116x = new ArrayList(this.f8116x);
                    this.f8106n |= 512;
                }
                this.f8116x.addAll(b4.f8138w);
            }
        }
        if (!b4.f8140y.isEmpty()) {
            if (this.f8117y.isEmpty()) {
                this.f8117y = b4.f8140y;
                this.f8106n &= -1025;
            } else {
                if ((this.f8106n & 1024) != 1024) {
                    this.f8117y = new ArrayList(this.f8117y);
                    this.f8106n |= 1024;
                }
                this.f8117y.addAll(b4.f8140y);
            }
        }
        if (!b4.f8141z.isEmpty()) {
            if (this.f8118z.isEmpty()) {
                this.f8118z = b4.f8141z;
                this.f8106n &= -2049;
            } else {
                if ((this.f8106n & 2048) != 2048) {
                    this.f8118z = new ArrayList(this.f8118z);
                    this.f8106n |= 2048;
                }
                this.f8118z.addAll(b4.f8141z);
            }
        }
        if ((b4.f8128m & 128) == 128) {
            a0 a0Var2 = b4.f8119A;
            if ((this.f8106n & 4096) != 4096 || (a0Var = this.f8100A) == a0.f8362q) {
                this.f8100A = a0Var2;
            } else {
                C0576g c0576gI = a0.i(a0Var);
                c0576gI.k(a0Var2);
                this.f8100A = c0576gI.g();
            }
            this.f8106n |= 4096;
        }
        if (!b4.f8120B.isEmpty()) {
            if (this.f8101B.isEmpty()) {
                this.f8101B = b4.f8120B;
                this.f8106n &= -8193;
            } else {
                if ((this.f8106n & 8192) != 8192) {
                    this.f8101B = new ArrayList(this.f8101B);
                    this.f8106n |= 8192;
                }
                this.f8101B.addAll(b4.f8120B);
            }
        }
        if ((b4.f8128m & 256) == 256) {
            C0585p c0585p2 = b4.f8121C;
            if ((this.f8106n & 16384) != 16384 || (c0585p = this.f8102C) == C0585p.f8586o) {
                this.f8102C = c0585p2;
            } else {
                C0584o c0584o = new C0584o(0);
                c0584o.f8585n = Collections.EMPTY_LIST;
                c0584o.k(c0585p);
                c0584o.k(c0585p2);
                this.f8102C = c0584o.f();
            }
            this.f8106n |= 16384;
        }
        if (!b4.f8122D.isEmpty()) {
            if (this.f8103D.isEmpty()) {
                this.f8103D = b4.f8122D;
                this.f8106n &= -32769;
            } else {
                if ((this.f8106n & 32768) != 32768) {
                    this.f8103D = new ArrayList(this.f8103D);
                    this.f8106n |= 32768;
                }
                this.f8103D.addAll(b4.f8122D);
            }
        }
        if (!b4.f8123E.isEmpty()) {
            if (this.f8104E.isEmpty()) {
                this.f8104E = b4.f8123E;
                this.f8106n &= -65537;
            } else {
                if ((this.f8106n & 65536) != 65536) {
                    this.f8104E = new ArrayList(this.f8104E);
                    this.f8106n |= 65536;
                }
                this.f8104E.addAll(b4.f8123E);
            }
        }
        if (!b4.f8124F.isEmpty()) {
            if (this.f8105F.isEmpty()) {
                this.f8105F = b4.f8124F;
                this.f8106n &= -131073;
            } else {
                if ((this.f8106n & 131072) != 131072) {
                    this.f8105F = new ArrayList(this.f8105F);
                    this.f8106n |= 131072;
                }
                this.f8105F.addAll(b4.f8124F);
            }
        }
        f(b4);
        this.f9896k = this.f9896k.h(b4.f8127l);
    }
}
