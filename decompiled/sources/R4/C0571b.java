package R4;

import X4.AbstractC0605b;
import X4.AbstractC0608e;
import X4.AbstractC0613j;
import X4.AbstractC0618o;

/* renamed from: R4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0571b extends AbstractC0613j implements X4.w {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f8370l;

    /* renamed from: m, reason: collision with root package name */
    public int f8371m;

    /* renamed from: n, reason: collision with root package name */
    public int f8372n;

    /* renamed from: o, reason: collision with root package name */
    public Object f8373o;

    public /* synthetic */ C0571b(int i7) {
        this.f8370l = i7;
    }

    @Override // X4.AbstractC0613j
    public final AbstractC0605b c() {
        switch (this.f8370l) {
            case 0:
                C0575f c0575fF = f();
                if (c0575fF.a()) {
                    return c0575fF;
                }
                throw new D6.r();
            default:
                C0581l c0581lG = g();
                if (c0581lG.a()) {
                    return c0581lG;
                }
                throw new D6.r();
        }
    }

    public final Object clone() {
        switch (this.f8370l) {
            case 0:
                C0571b c0571b = new C0571b(0);
                c0571b.f8373o = C0574e.f8432z;
                c0571b.h(f());
                return c0571b;
            default:
                C0571b c0571b2 = new C0571b(1);
                c0571b2.f8373o = AbstractC0608e.f9883k;
                c0571b2.i(g());
                return c0571b2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003f  */
    @Override // X4.AbstractC0613j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X4.AbstractC0613j d(X4.C0609f r3, X4.C0611h r4) throws java.lang.Throwable {
        /*
            r2 = this;
            int r0 = r2.f8370l
            switch(r0) {
                case 0: goto L24;
                default: goto L5;
            }
        L5:
            r4 = 0
            R4.a r0 = R4.C0581l.f8559r     // Catch: java.lang.Throwable -> L14 X4.r -> L16
            r0.getClass()     // Catch: java.lang.Throwable -> L14 X4.r -> L16
            R4.l r0 = new R4.l     // Catch: java.lang.Throwable -> L14 X4.r -> L16
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L14 X4.r -> L16
            r2.i(r0)
            return r2
        L14:
            r3 = move-exception
            goto L1e
        L16:
            r3 = move-exception
            X4.b r0 = r3.f9907k     // Catch: java.lang.Throwable -> L14
            R4.l r0 = (R4.C0581l) r0     // Catch: java.lang.Throwable -> L14
            throw r3     // Catch: java.lang.Throwable -> L1c
        L1c:
            r3 = move-exception
            r4 = r0
        L1e:
            if (r4 == 0) goto L23
            r2.i(r4)
        L23:
            throw r3
        L24:
            r0 = 0
            R4.a r1 = R4.C0575f.f8454r     // Catch: java.lang.Throwable -> L33 X4.r -> L35
            r1.getClass()     // Catch: java.lang.Throwable -> L33 X4.r -> L35
            R4.f r1 = new R4.f     // Catch: java.lang.Throwable -> L33 X4.r -> L35
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L33 X4.r -> L35
            r2.h(r1)
            return r2
        L33:
            r3 = move-exception
            goto L3d
        L35:
            r3 = move-exception
            X4.b r4 = r3.f9907k     // Catch: java.lang.Throwable -> L33
            R4.f r4 = (R4.C0575f) r4     // Catch: java.lang.Throwable -> L33
            throw r3     // Catch: java.lang.Throwable -> L3b
        L3b:
            r3 = move-exception
            r0 = r4
        L3d:
            if (r0 == 0) goto L42
            r2.h(r0)
        L42:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: R4.C0571b.d(X4.f, X4.h):X4.j");
    }

    @Override // X4.AbstractC0613j
    public final /* bridge */ /* synthetic */ AbstractC0613j e(AbstractC0618o abstractC0618o) {
        switch (this.f8370l) {
            case 0:
                h((C0575f) abstractC0618o);
                break;
            default:
                i((C0581l) abstractC0618o);
                break;
        }
        return this;
    }

    public C0575f f() {
        C0575f c0575f = new C0575f(this);
        int i7 = this.f8371m;
        int i8 = (i7 & 1) != 1 ? 0 : 1;
        c0575f.f8457m = this.f8372n;
        if ((i7 & 2) == 2) {
            i8 |= 2;
        }
        c0575f.f8458n = (C0574e) this.f8373o;
        c0575f.f8456l = i8;
        return c0575f;
    }

    public C0581l g() {
        C0581l c0581l = new C0581l(this);
        int i7 = this.f8371m;
        int i8 = (i7 & 1) != 1 ? 0 : 1;
        c0581l.f8562m = this.f8372n;
        if ((i7 & 2) == 2) {
            i8 |= 2;
        }
        c0581l.f8563n = (X4.v) this.f8373o;
        c0581l.f8561l = i8;
        return c0581l;
    }

    public void h(C0575f c0575f) {
        C0574e c0574e;
        if (c0575f == C0575f.f8453q) {
            return;
        }
        int i7 = c0575f.f8456l;
        if ((i7 & 1) == 1) {
            int i8 = c0575f.f8457m;
            this.f8371m = 1 | this.f8371m;
            this.f8372n = i8;
        }
        if ((i7 & 2) == 2) {
            C0574e c0574e2 = c0575f.f8458n;
            if ((this.f8371m & 2) != 2 || (c0574e = (C0574e) this.f8373o) == C0574e.f8432z) {
                this.f8373o = c0574e2;
            } else {
                C0572c c0572cJ = C0574e.j(c0574e);
                c0572cJ.h(c0574e2);
                this.f8373o = c0572cJ.f();
            }
            this.f8371m |= 2;
        }
        this.f9896k = this.f9896k.h(c0575f.f8455k);
    }

    public void i(C0581l c0581l) {
        if (c0581l == C0581l.f8558q) {
            return;
        }
        int i7 = c0581l.f8561l;
        if ((i7 & 1) == 1) {
            int i8 = c0581l.f8562m;
            this.f8371m = 1 | this.f8371m;
            this.f8372n = i8;
        }
        if ((i7 & 2) == 2) {
            X4.v vVar = c0581l.f8563n;
            vVar.getClass();
            this.f8371m = 2 | this.f8371m;
            this.f8373o = vVar;
        }
        this.f9896k = this.f9896k.h(c0581l.f8560k);
    }
}
