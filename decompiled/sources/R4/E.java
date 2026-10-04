package R4;

import X4.AbstractC0605b;
import X4.AbstractC0613j;
import X4.AbstractC0614k;
import X4.AbstractC0618o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class E extends AbstractC0614k {

    /* renamed from: n, reason: collision with root package name */
    public int f8146n;

    /* renamed from: o, reason: collision with root package name */
    public List f8147o;

    /* renamed from: p, reason: collision with root package name */
    public List f8148p;

    /* renamed from: q, reason: collision with root package name */
    public List f8149q;

    /* renamed from: r, reason: collision with root package name */
    public a0 f8150r;

    /* renamed from: s, reason: collision with root package name */
    public h0 f8151s;

    public static E h() {
        E e7 = new E();
        List list = Collections.EMPTY_LIST;
        e7.f8147o = list;
        e7.f8148p = list;
        e7.f8149q = list;
        e7.f8150r = a0.f8362q;
        e7.f8151s = h0.f8490o;
        return e7;
    }

    @Override // X4.AbstractC0613j
    public final AbstractC0605b c() {
        F fG = g();
        if (fG.a()) {
            return fG;
        }
        throw new D6.r();
    }

    public final Object clone() {
        E eH = h();
        eH.i(g());
        return eH;
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
            R4.a r1 = R4.F.f8153v     // Catch: java.lang.Throwable -> Lf X4.r -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf X4.r -> L11
            R4.F r1 = new R4.F     // Catch: java.lang.Throwable -> Lf X4.r -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf X4.r -> L11
            r2.i(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            X4.b r4 = r3.f9907k     // Catch: java.lang.Throwable -> Lf
            R4.F r4 = (R4.F) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: R4.E.d(X4.f, X4.h):X4.j");
    }

    @Override // X4.AbstractC0613j
    public final /* bridge */ /* synthetic */ AbstractC0613j e(AbstractC0618o abstractC0618o) {
        i((F) abstractC0618o);
        return this;
    }

    public final F g() {
        F f5 = new F(this);
        int i7 = this.f8146n;
        if ((i7 & 1) == 1) {
            this.f8147o = Collections.unmodifiableList(this.f8147o);
            this.f8146n &= -2;
        }
        f5.f8156n = this.f8147o;
        if ((this.f8146n & 2) == 2) {
            this.f8148p = Collections.unmodifiableList(this.f8148p);
            this.f8146n &= -3;
        }
        f5.f8157o = this.f8148p;
        if ((this.f8146n & 4) == 4) {
            this.f8149q = Collections.unmodifiableList(this.f8149q);
            this.f8146n &= -5;
        }
        f5.f8158p = this.f8149q;
        int i8 = (i7 & 8) != 8 ? 0 : 1;
        f5.f8159q = this.f8150r;
        if ((i7 & 16) == 16) {
            i8 |= 2;
        }
        f5.f8160r = this.f8151s;
        f5.f8155m = i8;
        return f5;
    }

    public final void i(F f5) {
        h0 h0Var;
        a0 a0Var;
        if (f5 == F.f8152u) {
            return;
        }
        if (!f5.f8156n.isEmpty()) {
            if (this.f8147o.isEmpty()) {
                this.f8147o = f5.f8156n;
                this.f8146n &= -2;
            } else {
                if ((this.f8146n & 1) != 1) {
                    this.f8147o = new ArrayList(this.f8147o);
                    this.f8146n |= 1;
                }
                this.f8147o.addAll(f5.f8156n);
            }
        }
        if (!f5.f8157o.isEmpty()) {
            if (this.f8148p.isEmpty()) {
                this.f8148p = f5.f8157o;
                this.f8146n &= -3;
            } else {
                if ((this.f8146n & 2) != 2) {
                    this.f8148p = new ArrayList(this.f8148p);
                    this.f8146n |= 2;
                }
                this.f8148p.addAll(f5.f8157o);
            }
        }
        if (!f5.f8158p.isEmpty()) {
            if (this.f8149q.isEmpty()) {
                this.f8149q = f5.f8158p;
                this.f8146n &= -5;
            } else {
                if ((this.f8146n & 4) != 4) {
                    this.f8149q = new ArrayList(this.f8149q);
                    this.f8146n |= 4;
                }
                this.f8149q.addAll(f5.f8158p);
            }
        }
        if ((f5.f8155m & 1) == 1) {
            a0 a0Var2 = f5.f8159q;
            if ((this.f8146n & 8) != 8 || (a0Var = this.f8150r) == a0.f8362q) {
                this.f8150r = a0Var2;
            } else {
                C0576g c0576gI = a0.i(a0Var);
                c0576gI.k(a0Var2);
                this.f8150r = c0576gI.g();
            }
            this.f8146n |= 8;
        }
        if ((f5.f8155m & 2) == 2) {
            h0 h0Var2 = f5.f8160r;
            if ((this.f8146n & 16) != 16 || (h0Var = this.f8151s) == h0.f8490o) {
                this.f8151s = h0Var2;
            } else {
                C0584o c0584o = new C0584o(2);
                c0584o.f8585n = Collections.EMPTY_LIST;
                c0584o.o(h0Var);
                c0584o.o(h0Var2);
                this.f8151s = c0584o.i();
            }
            this.f8146n |= 16;
        }
        f(f5);
        this.f9896k = this.f9896k.h(f5.f8154l);
    }
}
