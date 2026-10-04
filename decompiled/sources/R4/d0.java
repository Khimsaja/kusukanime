package R4;

import X4.AbstractC0605b;
import X4.AbstractC0613j;
import X4.AbstractC0618o;

/* loaded from: classes.dex */
public final class d0 extends AbstractC0613j implements X4.w {

    /* renamed from: l, reason: collision with root package name */
    public int f8424l;

    /* renamed from: m, reason: collision with root package name */
    public int f8425m;

    /* renamed from: n, reason: collision with root package name */
    public int f8426n;

    /* renamed from: o, reason: collision with root package name */
    public e0 f8427o;

    /* renamed from: p, reason: collision with root package name */
    public int f8428p;

    /* renamed from: q, reason: collision with root package name */
    public int f8429q;

    /* renamed from: r, reason: collision with root package name */
    public f0 f8430r;

    public static d0 g() {
        d0 d0Var = new d0();
        d0Var.f8427o = e0.ERROR;
        d0Var.f8430r = f0.LANGUAGE_VERSION;
        return d0Var;
    }

    @Override // X4.AbstractC0613j
    public final AbstractC0605b c() {
        g0 g0VarF = f();
        g0VarF.a();
        return g0VarF;
    }

    public final Object clone() {
        d0 d0VarG = g();
        d0VarG.h(f());
        return d0VarG;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // X4.AbstractC0613j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X4.AbstractC0613j d(X4.C0609f r2, X4.C0611h r3) throws java.lang.Throwable {
        /*
            r1 = this;
            r3 = 0
            R4.a r0 = R4.g0.f8471v     // Catch: java.lang.Throwable -> Lf X4.r -> L11
            r0.getClass()     // Catch: java.lang.Throwable -> Lf X4.r -> L11
            R4.g0 r0 = new R4.g0     // Catch: java.lang.Throwable -> Lf X4.r -> L11
            r0.<init>(r2)     // Catch: java.lang.Throwable -> Lf X4.r -> L11
            r1.h(r0)
            return r1
        Lf:
            r2 = move-exception
            goto L19
        L11:
            r2 = move-exception
            X4.b r0 = r2.f9907k     // Catch: java.lang.Throwable -> Lf
            R4.g0 r0 = (R4.g0) r0     // Catch: java.lang.Throwable -> Lf
            throw r2     // Catch: java.lang.Throwable -> L17
        L17:
            r2 = move-exception
            r3 = r0
        L19:
            if (r3 == 0) goto L1e
            r1.h(r3)
        L1e:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: R4.d0.d(X4.f, X4.h):X4.j");
    }

    @Override // X4.AbstractC0613j
    public final /* bridge */ /* synthetic */ AbstractC0613j e(AbstractC0618o abstractC0618o) {
        h((g0) abstractC0618o);
        return this;
    }

    public final g0 f() {
        g0 g0Var = new g0(this);
        int i7 = this.f8424l;
        int i8 = (i7 & 1) != 1 ? 0 : 1;
        g0Var.f8474m = this.f8425m;
        if ((i7 & 2) == 2) {
            i8 |= 2;
        }
        g0Var.f8475n = this.f8426n;
        if ((i7 & 4) == 4) {
            i8 |= 4;
        }
        g0Var.f8476o = this.f8427o;
        if ((i7 & 8) == 8) {
            i8 |= 8;
        }
        g0Var.f8477p = this.f8428p;
        if ((i7 & 16) == 16) {
            i8 |= 16;
        }
        g0Var.f8478q = this.f8429q;
        if ((i7 & 32) == 32) {
            i8 |= 32;
        }
        g0Var.f8479r = this.f8430r;
        g0Var.f8473l = i8;
        return g0Var;
    }

    public final void h(g0 g0Var) {
        if (g0Var == g0.f8470u) {
            return;
        }
        int i7 = g0Var.f8473l;
        if ((i7 & 1) == 1) {
            int i8 = g0Var.f8474m;
            this.f8424l = 1 | this.f8424l;
            this.f8425m = i8;
        }
        if ((i7 & 2) == 2) {
            int i9 = g0Var.f8475n;
            this.f8424l = 2 | this.f8424l;
            this.f8426n = i9;
        }
        if ((i7 & 4) == 4) {
            e0 e0Var = g0Var.f8476o;
            e0Var.getClass();
            this.f8424l = 4 | this.f8424l;
            this.f8427o = e0Var;
        }
        int i10 = g0Var.f8473l;
        if ((i10 & 8) == 8) {
            int i11 = g0Var.f8477p;
            this.f8424l = 8 | this.f8424l;
            this.f8428p = i11;
        }
        if ((i10 & 16) == 16) {
            int i12 = g0Var.f8478q;
            this.f8424l = 16 | this.f8424l;
            this.f8429q = i12;
        }
        if ((i10 & 32) == 32) {
            f0 f0Var = g0Var.f8479r;
            f0Var.getClass();
            this.f8424l = 32 | this.f8424l;
            this.f8430r = f0Var;
        }
        this.f9896k = this.f9896k.h(g0Var.f8472k);
    }
}
