package R4;

import X4.AbstractC0605b;
import X4.AbstractC0613j;
import X4.AbstractC0614k;
import X4.AbstractC0618o;
import X4.C0621s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class G extends AbstractC0614k {

    /* renamed from: n, reason: collision with root package name */
    public int f8163n;

    /* renamed from: o, reason: collision with root package name */
    public O f8164o;

    /* renamed from: p, reason: collision with root package name */
    public N f8165p;

    /* renamed from: q, reason: collision with root package name */
    public F f8166q;

    /* renamed from: r, reason: collision with root package name */
    public List f8167r;

    public static G h() {
        G g4 = new G();
        g4.f8164o = O.f8250o;
        g4.f8165p = N.f8244o;
        g4.f8166q = F.f8152u;
        g4.f8167r = Collections.EMPTY_LIST;
        return g4;
    }

    @Override // X4.AbstractC0613j
    public final AbstractC0605b c() {
        H hG = g();
        if (hG.a()) {
            return hG;
        }
        throw new D6.r();
    }

    public final Object clone() {
        G gH = h();
        gH.i(g());
        return gH;
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
            R4.a r1 = R4.H.f8169u     // Catch: java.lang.Throwable -> Lf X4.r -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf X4.r -> L11
            R4.H r1 = new R4.H     // Catch: java.lang.Throwable -> Lf X4.r -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf X4.r -> L11
            r2.i(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            X4.b r4 = r3.f9907k     // Catch: java.lang.Throwable -> Lf
            R4.H r4 = (R4.H) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: R4.G.d(X4.f, X4.h):X4.j");
    }

    @Override // X4.AbstractC0613j
    public final /* bridge */ /* synthetic */ AbstractC0613j e(AbstractC0618o abstractC0618o) {
        i((H) abstractC0618o);
        return this;
    }

    public final H g() {
        H h7 = new H(this);
        int i7 = this.f8163n;
        int i8 = (i7 & 1) != 1 ? 0 : 1;
        h7.f8172n = this.f8164o;
        if ((i7 & 2) == 2) {
            i8 |= 2;
        }
        h7.f8173o = this.f8165p;
        if ((i7 & 4) == 4) {
            i8 |= 4;
        }
        h7.f8174p = this.f8166q;
        if ((i7 & 8) == 8) {
            this.f8167r = Collections.unmodifiableList(this.f8167r);
            this.f8163n &= -9;
        }
        h7.f8175q = this.f8167r;
        h7.f8171m = i8;
        return h7;
    }

    public final void i(H h7) {
        F f5;
        N n7;
        O o7;
        if (h7 == H.f8168t) {
            return;
        }
        if ((h7.f8171m & 1) == 1) {
            O o8 = h7.f8172n;
            if ((this.f8163n & 1) != 1 || (o7 = this.f8164o) == O.f8250o) {
                this.f8164o = o8;
            } else {
                C0584o c0584o = new C0584o(3);
                c0584o.f8585n = C0621s.f9908l;
                c0584o.n(o7);
                c0584o.n(o8);
                this.f8164o = c0584o.h();
            }
            this.f8163n |= 1;
        }
        if ((h7.f8171m & 2) == 2) {
            N n8 = h7.f8173o;
            if ((this.f8163n & 2) != 2 || (n7 = this.f8165p) == N.f8244o) {
                this.f8165p = n8;
            } else {
                C0584o c0584o2 = new C0584o(1);
                c0584o2.f8585n = Collections.EMPTY_LIST;
                c0584o2.l(n7);
                c0584o2.l(n8);
                this.f8165p = c0584o2.g();
            }
            this.f8163n |= 2;
        }
        if ((h7.f8171m & 4) == 4) {
            F f7 = h7.f8174p;
            if ((this.f8163n & 4) != 4 || (f5 = this.f8166q) == F.f8152u) {
                this.f8166q = f7;
            } else {
                E eH = E.h();
                eH.i(f5);
                eH.i(f7);
                this.f8166q = eH.g();
            }
            this.f8163n |= 4;
        }
        if (!h7.f8175q.isEmpty()) {
            if (this.f8167r.isEmpty()) {
                this.f8167r = h7.f8175q;
                this.f8163n &= -9;
            } else {
                if ((this.f8163n & 8) != 8) {
                    this.f8167r = new ArrayList(this.f8167r);
                    this.f8163n |= 8;
                }
                this.f8167r.addAll(h7.f8175q);
            }
        }
        f(h7);
        this.f9896k = this.f9896k.h(h7.f8170l);
    }
}
