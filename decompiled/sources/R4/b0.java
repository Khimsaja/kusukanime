package R4;

import X4.AbstractC0605b;
import X4.AbstractC0613j;
import X4.AbstractC0614k;
import X4.AbstractC0618o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class b0 extends AbstractC0614k {

    /* renamed from: n, reason: collision with root package name */
    public int f8374n;

    /* renamed from: o, reason: collision with root package name */
    public int f8375o;

    /* renamed from: p, reason: collision with root package name */
    public int f8376p;

    /* renamed from: q, reason: collision with root package name */
    public U f8377q;

    /* renamed from: r, reason: collision with root package name */
    public int f8378r;

    /* renamed from: s, reason: collision with root package name */
    public U f8379s;

    /* renamed from: t, reason: collision with root package name */
    public int f8380t;

    /* renamed from: u, reason: collision with root package name */
    public List f8381u;

    /* renamed from: v, reason: collision with root package name */
    public C0574e f8382v;

    public static b0 h() {
        b0 b0Var = new b0();
        U u5 = U.f8290D;
        b0Var.f8377q = u5;
        b0Var.f8379s = u5;
        b0Var.f8381u = Collections.EMPTY_LIST;
        b0Var.f8382v = C0574e.f8432z;
        return b0Var;
    }

    @Override // X4.AbstractC0613j
    public final AbstractC0605b c() {
        c0 c0VarG = g();
        if (c0VarG.a()) {
            return c0VarG;
        }
        throw new D6.r();
    }

    public final Object clone() {
        b0 b0VarH = h();
        b0VarH.i(g());
        return b0VarH;
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
            R4.a r1 = R4.c0.f8396y     // Catch: java.lang.Throwable -> Lf X4.r -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf X4.r -> L11
            R4.c0 r1 = new R4.c0     // Catch: java.lang.Throwable -> Lf X4.r -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf X4.r -> L11
            r2.i(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            X4.b r4 = r3.f9907k     // Catch: java.lang.Throwable -> Lf
            R4.c0 r4 = (R4.c0) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: R4.b0.d(X4.f, X4.h):X4.j");
    }

    @Override // X4.AbstractC0613j
    public final /* bridge */ /* synthetic */ AbstractC0613j e(AbstractC0618o abstractC0618o) {
        i((c0) abstractC0618o);
        return this;
    }

    public final c0 g() {
        c0 c0Var = new c0(this);
        int i7 = this.f8374n;
        int i8 = (i7 & 1) != 1 ? 0 : 1;
        c0Var.f8399n = this.f8375o;
        if ((i7 & 2) == 2) {
            i8 |= 2;
        }
        c0Var.f8400o = this.f8376p;
        if ((i7 & 4) == 4) {
            i8 |= 4;
        }
        c0Var.f8401p = this.f8377q;
        if ((i7 & 8) == 8) {
            i8 |= 8;
        }
        c0Var.f8402q = this.f8378r;
        if ((i7 & 16) == 16) {
            i8 |= 16;
        }
        c0Var.f8403r = this.f8379s;
        if ((i7 & 32) == 32) {
            i8 |= 32;
        }
        c0Var.f8404s = this.f8380t;
        if ((i7 & 64) == 64) {
            this.f8381u = Collections.unmodifiableList(this.f8381u);
            this.f8374n &= -65;
        }
        c0Var.f8405t = this.f8381u;
        if ((i7 & 128) == 128) {
            i8 |= 64;
        }
        c0Var.f8406u = this.f8382v;
        c0Var.f8398m = i8;
        return c0Var;
    }

    public final void i(c0 c0Var) {
        C0574e c0574e;
        U u5;
        U u7;
        if (c0Var == c0.f8395x) {
            return;
        }
        int i7 = c0Var.f8398m;
        if ((i7 & 1) == 1) {
            int i8 = c0Var.f8399n;
            this.f8374n = 1 | this.f8374n;
            this.f8375o = i8;
        }
        if ((i7 & 2) == 2) {
            int i9 = c0Var.f8400o;
            this.f8374n = 2 | this.f8374n;
            this.f8376p = i9;
        }
        if ((i7 & 4) == 4) {
            U u8 = c0Var.f8401p;
            if ((this.f8374n & 4) != 4 || (u7 = this.f8377q) == U.f8290D) {
                this.f8377q = u8;
            } else {
                T tR = U.r(u7);
                tR.i(u8);
                this.f8377q = tR.g();
            }
            this.f8374n |= 4;
        }
        int i10 = c0Var.f8398m;
        if ((i10 & 8) == 8) {
            int i11 = c0Var.f8402q;
            this.f8374n = 8 | this.f8374n;
            this.f8378r = i11;
        }
        if ((i10 & 16) == 16) {
            U u9 = c0Var.f8403r;
            if ((this.f8374n & 16) != 16 || (u5 = this.f8379s) == U.f8290D) {
                this.f8379s = u9;
            } else {
                T tR2 = U.r(u5);
                tR2.i(u9);
                this.f8379s = tR2.g();
            }
            this.f8374n |= 16;
        }
        if ((c0Var.f8398m & 32) == 32) {
            int i12 = c0Var.f8404s;
            this.f8374n = 32 | this.f8374n;
            this.f8380t = i12;
        }
        if (!c0Var.f8405t.isEmpty()) {
            if (this.f8381u.isEmpty()) {
                this.f8381u = c0Var.f8405t;
                this.f8374n &= -65;
            } else {
                if ((this.f8374n & 64) != 64) {
                    this.f8381u = new ArrayList(this.f8381u);
                    this.f8374n |= 64;
                }
                this.f8381u.addAll(c0Var.f8405t);
            }
        }
        if ((c0Var.f8398m & 64) == 64) {
            C0574e c0574e2 = c0Var.f8406u;
            if ((this.f8374n & 128) != 128 || (c0574e = this.f8382v) == C0574e.f8432z) {
                this.f8382v = c0574e2;
            } else {
                C0572c c0572cJ = C0574e.j(c0574e);
                c0572cJ.h(c0574e2);
                this.f8382v = c0572cJ.f();
            }
            this.f8374n |= 128;
        }
        f(c0Var);
        this.f9896k = this.f9896k.h(c0Var.f8397l);
    }
}
