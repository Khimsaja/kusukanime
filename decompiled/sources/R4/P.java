package R4;

import X4.AbstractC0605b;
import X4.AbstractC0613j;
import X4.AbstractC0618o;

/* loaded from: classes.dex */
public final class P extends AbstractC0613j implements X4.w {

    /* renamed from: l, reason: collision with root package name */
    public int f8256l;

    /* renamed from: m, reason: collision with root package name */
    public Q f8257m;

    /* renamed from: n, reason: collision with root package name */
    public U f8258n;

    /* renamed from: o, reason: collision with root package name */
    public int f8259o;

    public static P g() {
        P p7 = new P();
        p7.f8257m = Q.INV;
        p7.f8258n = U.f8290D;
        return p7;
    }

    @Override // X4.AbstractC0613j
    public final AbstractC0605b c() {
        S sF = f();
        if (sF.a()) {
            return sF;
        }
        throw new D6.r();
    }

    public final Object clone() {
        P pG = g();
        pG.h(f());
        return pG;
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
            R4.a r1 = R4.S.f8267s     // Catch: java.lang.Throwable -> Lf X4.r -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf X4.r -> L11
            R4.S r1 = new R4.S     // Catch: java.lang.Throwable -> Lf X4.r -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf X4.r -> L11
            r2.h(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            X4.b r4 = r3.f9907k     // Catch: java.lang.Throwable -> Lf
            R4.S r4 = (R4.S) r4     // Catch: java.lang.Throwable -> Lf
            throw r3     // Catch: java.lang.Throwable -> L17
        L17:
            r3 = move-exception
            r0 = r4
        L19:
            if (r0 == 0) goto L1e
            r2.h(r0)
        L1e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: R4.P.d(X4.f, X4.h):X4.j");
    }

    @Override // X4.AbstractC0613j
    public final /* bridge */ /* synthetic */ AbstractC0613j e(AbstractC0618o abstractC0618o) {
        h((S) abstractC0618o);
        return this;
    }

    public final S f() {
        S s7 = new S(this);
        int i7 = this.f8256l;
        int i8 = (i7 & 1) != 1 ? 0 : 1;
        s7.f8270m = this.f8257m;
        if ((i7 & 2) == 2) {
            i8 |= 2;
        }
        s7.f8271n = this.f8258n;
        if ((i7 & 4) == 4) {
            i8 |= 4;
        }
        s7.f8272o = this.f8259o;
        s7.f8269l = i8;
        return s7;
    }

    public final void h(S s7) {
        U u5;
        if (s7 == S.f8266r) {
            return;
        }
        if ((s7.f8269l & 1) == 1) {
            Q q6 = s7.f8270m;
            q6.getClass();
            this.f8256l = 1 | this.f8256l;
            this.f8257m = q6;
        }
        if ((s7.f8269l & 2) == 2) {
            U u7 = s7.f8271n;
            if ((this.f8256l & 2) != 2 || (u5 = this.f8258n) == U.f8290D) {
                this.f8258n = u7;
            } else {
                T tR = U.r(u5);
                tR.i(u7);
                this.f8258n = tR.g();
            }
            this.f8256l |= 2;
        }
        if ((s7.f8269l & 4) == 4) {
            int i7 = s7.f8272o;
            this.f8256l = 4 | this.f8256l;
            this.f8259o = i7;
        }
        this.f9896k = this.f9896k.h(s7.f8268k);
    }
}
