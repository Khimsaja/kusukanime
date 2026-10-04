package R4;

import X4.AbstractC0605b;
import X4.AbstractC0613j;
import X4.AbstractC0614k;
import X4.AbstractC0618o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class X extends AbstractC0614k {

    /* renamed from: n, reason: collision with root package name */
    public int f8337n;

    /* renamed from: o, reason: collision with root package name */
    public int f8338o;

    /* renamed from: p, reason: collision with root package name */
    public int f8339p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f8340q;

    /* renamed from: r, reason: collision with root package name */
    public Y f8341r;

    /* renamed from: s, reason: collision with root package name */
    public List f8342s;

    /* renamed from: t, reason: collision with root package name */
    public List f8343t;

    public static X h() {
        X x7 = new X();
        x7.f8341r = Y.INV;
        List list = Collections.EMPTY_LIST;
        x7.f8342s = list;
        x7.f8343t = list;
        return x7;
    }

    @Override // X4.AbstractC0613j
    public final AbstractC0605b c() {
        Z zG = g();
        if (zG.a()) {
            return zG;
        }
        throw new D6.r();
    }

    public final Object clone() {
        X xH = h();
        xH.i(g());
        return xH;
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
            R4.a r1 = R4.Z.f8350x     // Catch: java.lang.Throwable -> Lf X4.r -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf X4.r -> L11
            R4.Z r1 = new R4.Z     // Catch: java.lang.Throwable -> Lf X4.r -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf X4.r -> L11
            r2.i(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            X4.b r4 = r3.f9907k     // Catch: java.lang.Throwable -> Lf
            R4.Z r4 = (R4.Z) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: R4.X.d(X4.f, X4.h):X4.j");
    }

    @Override // X4.AbstractC0613j
    public final /* bridge */ /* synthetic */ AbstractC0613j e(AbstractC0618o abstractC0618o) {
        i((Z) abstractC0618o);
        return this;
    }

    public final Z g() {
        Z z7 = new Z(this);
        int i7 = this.f8337n;
        int i8 = (i7 & 1) != 1 ? 0 : 1;
        z7.f8353n = this.f8338o;
        if ((i7 & 2) == 2) {
            i8 |= 2;
        }
        z7.f8354o = this.f8339p;
        if ((i7 & 4) == 4) {
            i8 |= 4;
        }
        z7.f8355p = this.f8340q;
        if ((i7 & 8) == 8) {
            i8 |= 8;
        }
        z7.f8356q = this.f8341r;
        if ((i7 & 16) == 16) {
            this.f8342s = Collections.unmodifiableList(this.f8342s);
            this.f8337n &= -17;
        }
        z7.f8357r = this.f8342s;
        if ((this.f8337n & 32) == 32) {
            this.f8343t = Collections.unmodifiableList(this.f8343t);
            this.f8337n &= -33;
        }
        z7.f8358s = this.f8343t;
        z7.f8352m = i8;
        return z7;
    }

    public final void i(Z z7) {
        if (z7 == Z.f8349w) {
            return;
        }
        int i7 = z7.f8352m;
        if ((i7 & 1) == 1) {
            int i8 = z7.f8353n;
            this.f8337n = 1 | this.f8337n;
            this.f8338o = i8;
        }
        if ((i7 & 2) == 2) {
            int i9 = z7.f8354o;
            this.f8337n = 2 | this.f8337n;
            this.f8339p = i9;
        }
        if ((i7 & 4) == 4) {
            boolean z8 = z7.f8355p;
            this.f8337n = 4 | this.f8337n;
            this.f8340q = z8;
        }
        if ((i7 & 8) == 8) {
            Y y7 = z7.f8356q;
            y7.getClass();
            this.f8337n = 8 | this.f8337n;
            this.f8341r = y7;
        }
        if (!z7.f8357r.isEmpty()) {
            if (this.f8342s.isEmpty()) {
                this.f8342s = z7.f8357r;
                this.f8337n &= -17;
            } else {
                if ((this.f8337n & 16) != 16) {
                    this.f8342s = new ArrayList(this.f8342s);
                    this.f8337n |= 16;
                }
                this.f8342s.addAll(z7.f8357r);
            }
        }
        if (!z7.f8358s.isEmpty()) {
            if (this.f8343t.isEmpty()) {
                this.f8343t = z7.f8358s;
                this.f8337n &= -33;
            } else {
                if ((this.f8337n & 32) != 32) {
                    this.f8343t = new ArrayList(this.f8343t);
                    this.f8337n |= 32;
                }
                this.f8343t.addAll(z7.f8358s);
            }
        }
        f(z7);
        this.f9896k = this.f9896k.h(z7.f8351l);
    }
}
