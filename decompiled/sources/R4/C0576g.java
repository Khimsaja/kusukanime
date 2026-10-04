package R4;

import X4.AbstractC0605b;
import X4.AbstractC0613j;
import X4.AbstractC0618o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: R4.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0576g extends AbstractC0613j implements X4.w {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f8466l;

    /* renamed from: m, reason: collision with root package name */
    public int f8467m;

    /* renamed from: n, reason: collision with root package name */
    public List f8468n;

    /* renamed from: o, reason: collision with root package name */
    public int f8469o;

    public /* synthetic */ C0576g(int i7) {
        this.f8466l = i7;
    }

    public static C0576g h() {
        C0576g c0576g = new C0576g(1);
        c0576g.f8468n = Collections.EMPTY_LIST;
        c0576g.f8469o = -1;
        return c0576g;
    }

    @Override // X4.AbstractC0613j
    public final AbstractC0605b c() {
        switch (this.f8466l) {
            case 0:
                C0577h c0577hF = f();
                if (c0577hF.a()) {
                    return c0577hF;
                }
                throw new D6.r();
            default:
                a0 a0VarG = g();
                if (a0VarG.a()) {
                    return a0VarG;
                }
                throw new D6.r();
        }
    }

    public final Object clone() {
        switch (this.f8466l) {
            case 0:
                C0576g c0576g = new C0576g(0);
                c0576g.f8468n = Collections.EMPTY_LIST;
                c0576g.i(f());
                return c0576g;
            default:
                C0576g c0576gH = h();
                c0576gH.k(g());
                return c0576gH;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003d  */
    @Override // X4.AbstractC0613j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X4.AbstractC0613j d(X4.C0609f r3, X4.C0611h r4) throws java.lang.Throwable {
        /*
            r2 = this;
            int r0 = r2.f8466l
            switch(r0) {
                case 0: goto L24;
                default: goto L5;
            }
        L5:
            r0 = 0
            R4.a r1 = R4.a0.f8363r     // Catch: java.lang.Throwable -> L14 X4.r -> L16
            r1.getClass()     // Catch: java.lang.Throwable -> L14 X4.r -> L16
            R4.a0 r1 = new R4.a0     // Catch: java.lang.Throwable -> L14 X4.r -> L16
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L14 X4.r -> L16
            r2.k(r1)
            return r2
        L14:
            r3 = move-exception
            goto L1e
        L16:
            r3 = move-exception
            X4.b r4 = r3.f9907k     // Catch: java.lang.Throwable -> L14
            R4.a0 r4 = (R4.a0) r4     // Catch: java.lang.Throwable -> L14
            throw r3     // Catch: java.lang.Throwable -> L1c
        L1c:
            r3 = move-exception
            r0 = r4
        L1e:
            if (r0 == 0) goto L23
            r2.k(r0)
        L23:
            throw r3
        L24:
            r0 = 0
            R4.a r1 = R4.C0577h.f8483r     // Catch: java.lang.Throwable -> L31 X4.r -> L33
            java.lang.Object r3 = r1.a(r3, r4)     // Catch: java.lang.Throwable -> L31 X4.r -> L33
            R4.h r3 = (R4.C0577h) r3     // Catch: java.lang.Throwable -> L31 X4.r -> L33
            r2.i(r3)
            return r2
        L31:
            r3 = move-exception
            goto L3b
        L33:
            r3 = move-exception
            X4.b r4 = r3.f9907k     // Catch: java.lang.Throwable -> L31
            R4.h r4 = (R4.C0577h) r4     // Catch: java.lang.Throwable -> L31
            throw r3     // Catch: java.lang.Throwable -> L39
        L39:
            r3 = move-exception
            r0 = r4
        L3b:
            if (r0 == 0) goto L40
            r2.i(r0)
        L40:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: R4.C0576g.d(X4.f, X4.h):X4.j");
    }

    @Override // X4.AbstractC0613j
    public final /* bridge */ /* synthetic */ AbstractC0613j e(AbstractC0618o abstractC0618o) {
        switch (this.f8466l) {
            case 0:
                i((C0577h) abstractC0618o);
                break;
            default:
                k((a0) abstractC0618o);
                break;
        }
        return this;
    }

    public C0577h f() {
        C0577h c0577h = new C0577h(this);
        int i7 = this.f8467m;
        int i8 = (i7 & 1) != 1 ? 0 : 1;
        c0577h.f8486m = this.f8469o;
        if ((i7 & 2) == 2) {
            this.f8468n = Collections.unmodifiableList(this.f8468n);
            this.f8467m &= -3;
        }
        c0577h.f8487n = this.f8468n;
        c0577h.f8485l = i8;
        return c0577h;
    }

    public a0 g() {
        a0 a0Var = new a0(this);
        int i7 = this.f8467m;
        if ((i7 & 1) == 1) {
            this.f8468n = Collections.unmodifiableList(this.f8468n);
            this.f8467m &= -2;
        }
        a0Var.f8366m = this.f8468n;
        int i8 = (i7 & 2) != 2 ? 0 : 1;
        a0Var.f8367n = this.f8469o;
        a0Var.f8365l = i8;
        return a0Var;
    }

    public void i(C0577h c0577h) {
        if (c0577h == C0577h.f8482q) {
            return;
        }
        if ((c0577h.f8485l & 1) == 1) {
            int i7 = c0577h.f8486m;
            this.f8467m = 1 | this.f8467m;
            this.f8469o = i7;
        }
        if (!c0577h.f8487n.isEmpty()) {
            if (this.f8468n.isEmpty()) {
                this.f8468n = c0577h.f8487n;
                this.f8467m &= -3;
            } else {
                if ((this.f8467m & 2) != 2) {
                    this.f8468n = new ArrayList(this.f8468n);
                    this.f8467m |= 2;
                }
                this.f8468n.addAll(c0577h.f8487n);
            }
        }
        this.f9896k = this.f9896k.h(c0577h.f8484k);
    }

    public void k(a0 a0Var) {
        if (a0Var == a0.f8362q) {
            return;
        }
        if (!a0Var.f8366m.isEmpty()) {
            if (this.f8468n.isEmpty()) {
                this.f8468n = a0Var.f8366m;
                this.f8467m &= -2;
            } else {
                if ((this.f8467m & 1) != 1) {
                    this.f8468n = new ArrayList(this.f8468n);
                    this.f8467m |= 1;
                }
                this.f8468n.addAll(a0Var.f8366m);
            }
        }
        if ((a0Var.f8365l & 1) == 1) {
            int i7 = a0Var.f8367n;
            this.f8467m |= 2;
            this.f8469o = i7;
        }
        this.f9896k = this.f9896k.h(a0Var.f8364k);
    }
}
