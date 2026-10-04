package R4;

import X4.AbstractC0605b;
import X4.AbstractC0613j;
import X4.AbstractC0614k;
import X4.AbstractC0618o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: R4.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0590v extends AbstractC0614k {

    /* renamed from: n, reason: collision with root package name */
    public int f8625n;

    /* renamed from: o, reason: collision with root package name */
    public int f8626o;

    /* renamed from: p, reason: collision with root package name */
    public List f8627p;

    @Override // X4.AbstractC0613j
    public final AbstractC0605b c() {
        C0591w c0591wG = g();
        if (c0591wG.a()) {
            return c0591wG;
        }
        throw new D6.r();
    }

    public final Object clone() {
        C0590v c0590v = new C0590v();
        c0590v.f8627p = Collections.EMPTY_LIST;
        c0590v.h(g());
        return c0590v;
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
            R4.a r1 = R4.C0591w.f8629s     // Catch: java.lang.Throwable -> Lf X4.r -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf X4.r -> L11
            R4.w r1 = new R4.w     // Catch: java.lang.Throwable -> Lf X4.r -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf X4.r -> L11
            r2.h(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            X4.b r4 = r3.f9907k     // Catch: java.lang.Throwable -> Lf
            R4.w r4 = (R4.C0591w) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: R4.C0590v.d(X4.f, X4.h):X4.j");
    }

    @Override // X4.AbstractC0613j
    public final /* bridge */ /* synthetic */ AbstractC0613j e(AbstractC0618o abstractC0618o) {
        h((C0591w) abstractC0618o);
        return this;
    }

    public final C0591w g() {
        C0591w c0591w = new C0591w(this);
        int i7 = this.f8625n;
        int i8 = (i7 & 1) != 1 ? 0 : 1;
        c0591w.f8632n = this.f8626o;
        if ((i7 & 2) == 2) {
            this.f8627p = Collections.unmodifiableList(this.f8627p);
            this.f8625n &= -3;
        }
        c0591w.f8633o = this.f8627p;
        c0591w.f8631m = i8;
        return c0591w;
    }

    public final void h(C0591w c0591w) {
        if (c0591w == C0591w.f8628r) {
            return;
        }
        if ((c0591w.f8631m & 1) == 1) {
            int i7 = c0591w.f8632n;
            this.f8625n = 1 | this.f8625n;
            this.f8626o = i7;
        }
        if (!c0591w.f8633o.isEmpty()) {
            if (this.f8627p.isEmpty()) {
                this.f8627p = c0591w.f8633o;
                this.f8625n &= -3;
            } else {
                if ((this.f8625n & 2) != 2) {
                    this.f8627p = new ArrayList(this.f8627p);
                    this.f8625n |= 2;
                }
                this.f8627p.addAll(c0591w.f8633o);
            }
        }
        f(c0591w);
        this.f9896k = this.f9896k.h(c0591w.f8630l);
    }
}
