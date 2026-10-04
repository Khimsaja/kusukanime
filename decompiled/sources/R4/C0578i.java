package R4;

import X4.AbstractC0605b;
import X4.AbstractC0613j;
import X4.AbstractC0614k;
import X4.AbstractC0618o;
import io.ktor.utils.io.ByteChannelKt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: R4.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0578i extends AbstractC0614k {

    /* renamed from: A, reason: collision with root package name */
    public List f8496A;

    /* renamed from: B, reason: collision with root package name */
    public List f8497B;

    /* renamed from: C, reason: collision with root package name */
    public List f8498C;

    /* renamed from: D, reason: collision with root package name */
    public int f8499D;

    /* renamed from: E, reason: collision with root package name */
    public U f8500E;

    /* renamed from: F, reason: collision with root package name */
    public int f8501F;

    /* renamed from: G, reason: collision with root package name */
    public List f8502G;

    /* renamed from: H, reason: collision with root package name */
    public a0 f8503H;
    public List I;
    public h0 J;

    /* renamed from: K, reason: collision with root package name */
    public List f8504K;

    /* renamed from: n, reason: collision with root package name */
    public int f8505n;

    /* renamed from: o, reason: collision with root package name */
    public int f8506o;

    /* renamed from: p, reason: collision with root package name */
    public int f8507p;

    /* renamed from: q, reason: collision with root package name */
    public int f8508q;

    /* renamed from: r, reason: collision with root package name */
    public List f8509r;

    /* renamed from: s, reason: collision with root package name */
    public List f8510s;

    /* renamed from: t, reason: collision with root package name */
    public List f8511t;

    /* renamed from: u, reason: collision with root package name */
    public List f8512u;

    /* renamed from: v, reason: collision with root package name */
    public List f8513v;

    /* renamed from: w, reason: collision with root package name */
    public List f8514w;

    /* renamed from: x, reason: collision with root package name */
    public List f8515x;

    /* renamed from: y, reason: collision with root package name */
    public List f8516y;

    /* renamed from: z, reason: collision with root package name */
    public List f8517z;

    public static C0578i h() {
        C0578i c0578i = new C0578i();
        c0578i.f8506o = 6;
        List list = Collections.EMPTY_LIST;
        c0578i.f8509r = list;
        c0578i.f8510s = list;
        c0578i.f8511t = list;
        c0578i.f8512u = list;
        c0578i.f8513v = list;
        c0578i.f8514w = list;
        c0578i.f8515x = list;
        c0578i.f8516y = list;
        c0578i.f8517z = list;
        c0578i.f8496A = list;
        c0578i.f8497B = list;
        c0578i.f8498C = list;
        c0578i.f8500E = U.f8290D;
        c0578i.f8502G = list;
        c0578i.f8503H = a0.f8362q;
        c0578i.I = list;
        c0578i.J = h0.f8490o;
        c0578i.f8504K = list;
        return c0578i;
    }

    @Override // X4.AbstractC0613j
    public final AbstractC0605b c() {
        C0580k c0580kG = g();
        if (c0580kG.a()) {
            return c0580kG;
        }
        throw new D6.r();
    }

    public final Object clone() {
        C0578i c0578iH = h();
        c0578iH.i(g());
        return c0578iH;
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
            R4.a r1 = R4.C0580k.f8528R     // Catch: java.lang.Throwable -> Lf X4.r -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf X4.r -> L11
            R4.k r1 = new R4.k     // Catch: java.lang.Throwable -> Lf X4.r -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf X4.r -> L11
            r2.i(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            X4.b r4 = r3.f9907k     // Catch: java.lang.Throwable -> Lf
            R4.k r4 = (R4.C0580k) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: R4.C0578i.d(X4.f, X4.h):X4.j");
    }

    @Override // X4.AbstractC0613j
    public final /* bridge */ /* synthetic */ AbstractC0613j e(AbstractC0618o abstractC0618o) {
        i((C0580k) abstractC0618o);
        return this;
    }

    public final C0580k g() {
        C0580k c0580k = new C0580k(this);
        int i7 = this.f8505n;
        int i8 = (i7 & 1) != 1 ? 0 : 1;
        c0580k.f8545n = this.f8506o;
        if ((i7 & 2) == 2) {
            i8 |= 2;
        }
        c0580k.f8546o = this.f8507p;
        if ((i7 & 4) == 4) {
            i8 |= 4;
        }
        c0580k.f8547p = this.f8508q;
        if ((i7 & 8) == 8) {
            this.f8509r = Collections.unmodifiableList(this.f8509r);
            this.f8505n &= -9;
        }
        c0580k.f8548q = this.f8509r;
        if ((this.f8505n & 16) == 16) {
            this.f8510s = Collections.unmodifiableList(this.f8510s);
            this.f8505n &= -17;
        }
        c0580k.f8549r = this.f8510s;
        if ((this.f8505n & 32) == 32) {
            this.f8511t = Collections.unmodifiableList(this.f8511t);
            this.f8505n &= -33;
        }
        c0580k.f8550s = this.f8511t;
        if ((this.f8505n & 64) == 64) {
            this.f8512u = Collections.unmodifiableList(this.f8512u);
            this.f8505n &= -65;
        }
        c0580k.f8552u = this.f8512u;
        if ((this.f8505n & 128) == 128) {
            this.f8513v = Collections.unmodifiableList(this.f8513v);
            this.f8505n &= -129;
        }
        c0580k.f8554w = this.f8513v;
        if ((this.f8505n & 256) == 256) {
            this.f8514w = Collections.unmodifiableList(this.f8514w);
            this.f8505n &= -257;
        }
        c0580k.f8555x = this.f8514w;
        if ((this.f8505n & 512) == 512) {
            this.f8515x = Collections.unmodifiableList(this.f8515x);
            this.f8505n &= -513;
        }
        c0580k.f8557z = this.f8515x;
        if ((this.f8505n & 1024) == 1024) {
            this.f8516y = Collections.unmodifiableList(this.f8516y);
            this.f8505n &= -1025;
        }
        c0580k.f8529A = this.f8516y;
        if ((this.f8505n & 2048) == 2048) {
            this.f8517z = Collections.unmodifiableList(this.f8517z);
            this.f8505n &= -2049;
        }
        c0580k.f8530B = this.f8517z;
        if ((this.f8505n & 4096) == 4096) {
            this.f8496A = Collections.unmodifiableList(this.f8496A);
            this.f8505n &= -4097;
        }
        c0580k.f8531C = this.f8496A;
        if ((this.f8505n & 8192) == 8192) {
            this.f8497B = Collections.unmodifiableList(this.f8497B);
            this.f8505n &= -8193;
        }
        c0580k.f8532D = this.f8497B;
        if ((this.f8505n & 16384) == 16384) {
            this.f8498C = Collections.unmodifiableList(this.f8498C);
            this.f8505n &= -16385;
        }
        c0580k.f8533E = this.f8498C;
        if ((i7 & 32768) == 32768) {
            i8 |= 8;
        }
        c0580k.f8535G = this.f8499D;
        if ((i7 & 65536) == 65536) {
            i8 |= 16;
        }
        c0580k.f8536H = this.f8500E;
        if ((i7 & 131072) == 131072) {
            i8 |= 32;
        }
        c0580k.I = this.f8501F;
        if ((this.f8505n & 262144) == 262144) {
            this.f8502G = Collections.unmodifiableList(this.f8502G);
            this.f8505n &= -262145;
        }
        c0580k.J = this.f8502G;
        if ((i7 & 524288) == 524288) {
            i8 |= 64;
        }
        c0580k.f8537K = this.f8503H;
        if ((this.f8505n & ByteChannelKt.CHANNEL_MAX_SIZE) == 1048576) {
            this.I = Collections.unmodifiableList(this.I);
            this.f8505n &= -1048577;
        }
        c0580k.f8538L = this.I;
        if ((i7 & 2097152) == 2097152) {
            i8 |= 128;
        }
        c0580k.f8539M = this.J;
        if ((this.f8505n & 4194304) == 4194304) {
            this.f8504K = Collections.unmodifiableList(this.f8504K);
            this.f8505n &= -4194305;
        }
        c0580k.f8540N = this.f8504K;
        c0580k.f8544m = i8;
        return c0580k;
    }

    public final void i(C0580k c0580k) {
        h0 h0Var;
        a0 a0Var;
        U u5;
        if (c0580k == C0580k.f8527Q) {
            return;
        }
        int i7 = c0580k.f8544m;
        if ((i7 & 1) == 1) {
            int i8 = c0580k.f8545n;
            this.f8505n = 1 | this.f8505n;
            this.f8506o = i8;
        }
        if ((i7 & 2) == 2) {
            int i9 = c0580k.f8546o;
            this.f8505n = 2 | this.f8505n;
            this.f8507p = i9;
        }
        if ((i7 & 4) == 4) {
            int i10 = c0580k.f8547p;
            this.f8505n = 4 | this.f8505n;
            this.f8508q = i10;
        }
        if (!c0580k.f8548q.isEmpty()) {
            if (this.f8509r.isEmpty()) {
                this.f8509r = c0580k.f8548q;
                this.f8505n &= -9;
            } else {
                if ((this.f8505n & 8) != 8) {
                    this.f8509r = new ArrayList(this.f8509r);
                    this.f8505n |= 8;
                }
                this.f8509r.addAll(c0580k.f8548q);
            }
        }
        if (!c0580k.f8549r.isEmpty()) {
            if (this.f8510s.isEmpty()) {
                this.f8510s = c0580k.f8549r;
                this.f8505n &= -17;
            } else {
                if ((this.f8505n & 16) != 16) {
                    this.f8510s = new ArrayList(this.f8510s);
                    this.f8505n |= 16;
                }
                this.f8510s.addAll(c0580k.f8549r);
            }
        }
        if (!c0580k.f8550s.isEmpty()) {
            if (this.f8511t.isEmpty()) {
                this.f8511t = c0580k.f8550s;
                this.f8505n &= -33;
            } else {
                if ((this.f8505n & 32) != 32) {
                    this.f8511t = new ArrayList(this.f8511t);
                    this.f8505n |= 32;
                }
                this.f8511t.addAll(c0580k.f8550s);
            }
        }
        if (!c0580k.f8552u.isEmpty()) {
            if (this.f8512u.isEmpty()) {
                this.f8512u = c0580k.f8552u;
                this.f8505n &= -65;
            } else {
                if ((this.f8505n & 64) != 64) {
                    this.f8512u = new ArrayList(this.f8512u);
                    this.f8505n |= 64;
                }
                this.f8512u.addAll(c0580k.f8552u);
            }
        }
        if (!c0580k.f8554w.isEmpty()) {
            if (this.f8513v.isEmpty()) {
                this.f8513v = c0580k.f8554w;
                this.f8505n &= -129;
            } else {
                if ((this.f8505n & 128) != 128) {
                    this.f8513v = new ArrayList(this.f8513v);
                    this.f8505n |= 128;
                }
                this.f8513v.addAll(c0580k.f8554w);
            }
        }
        if (!c0580k.f8555x.isEmpty()) {
            if (this.f8514w.isEmpty()) {
                this.f8514w = c0580k.f8555x;
                this.f8505n &= -257;
            } else {
                if ((this.f8505n & 256) != 256) {
                    this.f8514w = new ArrayList(this.f8514w);
                    this.f8505n |= 256;
                }
                this.f8514w.addAll(c0580k.f8555x);
            }
        }
        if (!c0580k.f8557z.isEmpty()) {
            if (this.f8515x.isEmpty()) {
                this.f8515x = c0580k.f8557z;
                this.f8505n &= -513;
            } else {
                if ((this.f8505n & 512) != 512) {
                    this.f8515x = new ArrayList(this.f8515x);
                    this.f8505n |= 512;
                }
                this.f8515x.addAll(c0580k.f8557z);
            }
        }
        if (!c0580k.f8529A.isEmpty()) {
            if (this.f8516y.isEmpty()) {
                this.f8516y = c0580k.f8529A;
                this.f8505n &= -1025;
            } else {
                if ((this.f8505n & 1024) != 1024) {
                    this.f8516y = new ArrayList(this.f8516y);
                    this.f8505n |= 1024;
                }
                this.f8516y.addAll(c0580k.f8529A);
            }
        }
        if (!c0580k.f8530B.isEmpty()) {
            if (this.f8517z.isEmpty()) {
                this.f8517z = c0580k.f8530B;
                this.f8505n &= -2049;
            } else {
                if ((this.f8505n & 2048) != 2048) {
                    this.f8517z = new ArrayList(this.f8517z);
                    this.f8505n |= 2048;
                }
                this.f8517z.addAll(c0580k.f8530B);
            }
        }
        if (!c0580k.f8531C.isEmpty()) {
            if (this.f8496A.isEmpty()) {
                this.f8496A = c0580k.f8531C;
                this.f8505n &= -4097;
            } else {
                if ((this.f8505n & 4096) != 4096) {
                    this.f8496A = new ArrayList(this.f8496A);
                    this.f8505n |= 4096;
                }
                this.f8496A.addAll(c0580k.f8531C);
            }
        }
        if (!c0580k.f8532D.isEmpty()) {
            if (this.f8497B.isEmpty()) {
                this.f8497B = c0580k.f8532D;
                this.f8505n &= -8193;
            } else {
                if ((this.f8505n & 8192) != 8192) {
                    this.f8497B = new ArrayList(this.f8497B);
                    this.f8505n |= 8192;
                }
                this.f8497B.addAll(c0580k.f8532D);
            }
        }
        if (!c0580k.f8533E.isEmpty()) {
            if (this.f8498C.isEmpty()) {
                this.f8498C = c0580k.f8533E;
                this.f8505n &= -16385;
            } else {
                if ((this.f8505n & 16384) != 16384) {
                    this.f8498C = new ArrayList(this.f8498C);
                    this.f8505n |= 16384;
                }
                this.f8498C.addAll(c0580k.f8533E);
            }
        }
        int i11 = c0580k.f8544m;
        if ((i11 & 8) == 8) {
            int i12 = c0580k.f8535G;
            this.f8505n |= 32768;
            this.f8499D = i12;
        }
        if ((i11 & 16) == 16) {
            U u7 = c0580k.f8536H;
            if ((this.f8505n & 65536) != 65536 || (u5 = this.f8500E) == U.f8290D) {
                this.f8500E = u7;
            } else {
                T tR = U.r(u5);
                tR.i(u7);
                this.f8500E = tR.g();
            }
            this.f8505n |= 65536;
        }
        if ((c0580k.f8544m & 32) == 32) {
            int i13 = c0580k.I;
            this.f8505n |= 131072;
            this.f8501F = i13;
        }
        if (!c0580k.J.isEmpty()) {
            if (this.f8502G.isEmpty()) {
                this.f8502G = c0580k.J;
                this.f8505n &= -262145;
            } else {
                if ((this.f8505n & 262144) != 262144) {
                    this.f8502G = new ArrayList(this.f8502G);
                    this.f8505n |= 262144;
                }
                this.f8502G.addAll(c0580k.J);
            }
        }
        if ((c0580k.f8544m & 64) == 64) {
            a0 a0Var2 = c0580k.f8537K;
            if ((this.f8505n & 524288) != 524288 || (a0Var = this.f8503H) == a0.f8362q) {
                this.f8503H = a0Var2;
            } else {
                C0576g c0576gI = a0.i(a0Var);
                c0576gI.k(a0Var2);
                this.f8503H = c0576gI.g();
            }
            this.f8505n |= 524288;
        }
        if (!c0580k.f8538L.isEmpty()) {
            if (this.I.isEmpty()) {
                this.I = c0580k.f8538L;
                this.f8505n &= -1048577;
            } else {
                if ((this.f8505n & ByteChannelKt.CHANNEL_MAX_SIZE) != 1048576) {
                    this.I = new ArrayList(this.I);
                    this.f8505n |= ByteChannelKt.CHANNEL_MAX_SIZE;
                }
                this.I.addAll(c0580k.f8538L);
            }
        }
        if ((c0580k.f8544m & 128) == 128) {
            h0 h0Var2 = c0580k.f8539M;
            if ((this.f8505n & 2097152) != 2097152 || (h0Var = this.J) == h0.f8490o) {
                this.J = h0Var2;
            } else {
                C0584o c0584o = new C0584o(2);
                c0584o.f8585n = Collections.EMPTY_LIST;
                c0584o.o(h0Var);
                c0584o.o(h0Var2);
                this.J = c0584o.i();
            }
            this.f8505n |= 2097152;
        }
        if (!c0580k.f8540N.isEmpty()) {
            if (this.f8504K.isEmpty()) {
                this.f8504K = c0580k.f8540N;
                this.f8505n &= -4194305;
            } else {
                if ((this.f8505n & 4194304) != 4194304) {
                    this.f8504K = new ArrayList(this.f8504K);
                    this.f8505n |= 4194304;
                }
                this.f8504K.addAll(c0580k.f8540N);
            }
        }
        f(c0580k);
        this.f9896k = this.f9896k.h(c0580k.f8543l);
    }
}
