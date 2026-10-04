package R4;

import X4.AbstractC0605b;
import X4.AbstractC0613j;
import X4.AbstractC0618o;

/* loaded from: classes.dex */
public final class K extends AbstractC0613j implements X4.w {

    /* renamed from: l, reason: collision with root package name */
    public int f8226l;

    /* renamed from: m, reason: collision with root package name */
    public int f8227m;

    /* renamed from: n, reason: collision with root package name */
    public int f8228n;

    /* renamed from: o, reason: collision with root package name */
    public L f8229o;

    public static K g() {
        K k7 = new K();
        k7.f8227m = -1;
        k7.f8229o = L.PACKAGE;
        return k7;
    }

    @Override // X4.AbstractC0613j
    public final AbstractC0605b c() {
        M mF = f();
        if (mF.a()) {
            return mF;
        }
        throw new D6.r();
    }

    public final Object clone() {
        K kG = g();
        kG.h(f());
        return kG;
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
            R4.a r0 = R4.M.f8236s     // Catch: java.lang.Throwable -> Lf X4.r -> L11
            r0.getClass()     // Catch: java.lang.Throwable -> Lf X4.r -> L11
            R4.M r0 = new R4.M     // Catch: java.lang.Throwable -> Lf X4.r -> L11
            r0.<init>(r2)     // Catch: java.lang.Throwable -> Lf X4.r -> L11
            r1.h(r0)
            return r1
        Lf:
            r2 = move-exception
            goto L19
        L11:
            r2 = move-exception
            X4.b r0 = r2.f9907k     // Catch: java.lang.Throwable -> Lf
            R4.M r0 = (R4.M) r0     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: R4.K.d(X4.f, X4.h):X4.j");
    }

    @Override // X4.AbstractC0613j
    public final /* bridge */ /* synthetic */ AbstractC0613j e(AbstractC0618o abstractC0618o) {
        h((M) abstractC0618o);
        return this;
    }

    public final M f() {
        M m7 = new M(this);
        int i7 = this.f8226l;
        int i8 = (i7 & 1) != 1 ? 0 : 1;
        m7.f8239m = this.f8227m;
        if ((i7 & 2) == 2) {
            i8 |= 2;
        }
        m7.f8240n = this.f8228n;
        if ((i7 & 4) == 4) {
            i8 |= 4;
        }
        m7.f8241o = this.f8229o;
        m7.f8238l = i8;
        return m7;
    }

    public final void h(M m7) {
        if (m7 == M.f8235r) {
            return;
        }
        int i7 = m7.f8238l;
        if ((i7 & 1) == 1) {
            int i8 = m7.f8239m;
            this.f8226l = 1 | this.f8226l;
            this.f8227m = i8;
        }
        if ((i7 & 2) == 2) {
            int i9 = m7.f8240n;
            this.f8226l = 2 | this.f8226l;
            this.f8228n = i9;
        }
        if ((i7 & 4) == 4) {
            L l7 = m7.f8241o;
            l7.getClass();
            this.f8226l = 4 | this.f8226l;
            this.f8229o = l7;
        }
        this.f9896k = this.f9896k.h(m7.f8237k);
    }
}
