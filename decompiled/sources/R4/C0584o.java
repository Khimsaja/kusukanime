package R4;

import X4.AbstractC0605b;
import X4.AbstractC0613j;
import X4.AbstractC0618o;
import X4.C0621s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: R4.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0584o extends AbstractC0613j implements X4.w {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f8583l;

    /* renamed from: m, reason: collision with root package name */
    public int f8584m;

    /* renamed from: n, reason: collision with root package name */
    public List f8585n;

    public /* synthetic */ C0584o(int i7) {
        this.f8583l = i7;
    }

    @Override // X4.AbstractC0613j
    public final AbstractC0605b c() {
        switch (this.f8583l) {
            case 0:
                C0585p c0585pF = f();
                if (c0585pF.a()) {
                    return c0585pF;
                }
                throw new D6.r();
            case 1:
                N nG = g();
                if (nG.a()) {
                    return nG;
                }
                throw new D6.r();
            case 2:
                h0 h0VarI = i();
                h0VarI.a();
                return h0VarI;
            default:
                O oH = h();
                oH.a();
                return oH;
        }
    }

    public final Object clone() {
        switch (this.f8583l) {
            case 0:
                C0584o c0584o = new C0584o(0);
                c0584o.f8585n = Collections.EMPTY_LIST;
                c0584o.k(f());
                return c0584o;
            case 1:
                C0584o c0584o2 = new C0584o(1);
                c0584o2.f8585n = Collections.EMPTY_LIST;
                c0584o2.l(g());
                return c0584o2;
            case 2:
                C0584o c0584o3 = new C0584o(2);
                c0584o3.f8585n = Collections.EMPTY_LIST;
                c0584o3.o(i());
                return c0584o3;
            default:
                C0584o c0584o4 = new C0584o(3);
                c0584o4.f8585n = C0621s.f9908l;
                c0584o4.n(h());
                return c0584o4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x007d  */
    @Override // X4.AbstractC0613j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X4.AbstractC0613j d(X4.C0609f r3, X4.C0611h r4) throws java.lang.Throwable {
        /*
            r2 = this;
            int r0 = r2.f8583l
            switch(r0) {
                case 0: goto L62;
                case 1: goto L43;
                case 2: goto L24;
                default: goto L5;
            }
        L5:
            r4 = 0
            R4.a r0 = R4.O.f8251p     // Catch: java.lang.Throwable -> L14 X4.r -> L16
            r0.getClass()     // Catch: java.lang.Throwable -> L14 X4.r -> L16
            R4.O r0 = new R4.O     // Catch: java.lang.Throwable -> L14 X4.r -> L16
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L14 X4.r -> L16
            r2.n(r0)
            return r2
        L14:
            r3 = move-exception
            goto L1e
        L16:
            r3 = move-exception
            X4.b r0 = r3.f9907k     // Catch: java.lang.Throwable -> L14
            R4.O r0 = (R4.O) r0     // Catch: java.lang.Throwable -> L14
            throw r3     // Catch: java.lang.Throwable -> L1c
        L1c:
            r3 = move-exception
            r4 = r0
        L1e:
            if (r4 == 0) goto L23
            r2.n(r4)
        L23:
            throw r3
        L24:
            r0 = 0
            R4.a r1 = R4.h0.f8491p     // Catch: java.lang.Throwable -> L33 X4.r -> L35
            r1.getClass()     // Catch: java.lang.Throwable -> L33 X4.r -> L35
            R4.h0 r1 = new R4.h0     // Catch: java.lang.Throwable -> L33 X4.r -> L35
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L33 X4.r -> L35
            r2.o(r1)
            return r2
        L33:
            r3 = move-exception
            goto L3d
        L35:
            r3 = move-exception
            X4.b r4 = r3.f9907k     // Catch: java.lang.Throwable -> L33
            R4.h0 r4 = (R4.h0) r4     // Catch: java.lang.Throwable -> L33
            throw r3     // Catch: java.lang.Throwable -> L3b
        L3b:
            r3 = move-exception
            r0 = r4
        L3d:
            if (r0 == 0) goto L42
            r2.o(r0)
        L42:
            throw r3
        L43:
            r0 = 0
            R4.a r1 = R4.N.f8245p     // Catch: java.lang.Throwable -> L52 X4.r -> L54
            r1.getClass()     // Catch: java.lang.Throwable -> L52 X4.r -> L54
            R4.N r1 = new R4.N     // Catch: java.lang.Throwable -> L52 X4.r -> L54
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L52 X4.r -> L54
            r2.l(r1)
            return r2
        L52:
            r3 = move-exception
            goto L5c
        L54:
            r3 = move-exception
            X4.b r4 = r3.f9907k     // Catch: java.lang.Throwable -> L52
            R4.N r4 = (R4.N) r4     // Catch: java.lang.Throwable -> L52
            throw r3     // Catch: java.lang.Throwable -> L5a
        L5a:
            r3 = move-exception
            r0 = r4
        L5c:
            if (r0 == 0) goto L61
            r2.l(r0)
        L61:
            throw r3
        L62:
            r0 = 0
            R4.a r1 = R4.C0585p.f8587p     // Catch: java.lang.Throwable -> L71 X4.r -> L73
            r1.getClass()     // Catch: java.lang.Throwable -> L71 X4.r -> L73
            R4.p r1 = new R4.p     // Catch: java.lang.Throwable -> L71 X4.r -> L73
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L71 X4.r -> L73
            r2.k(r1)
            return r2
        L71:
            r3 = move-exception
            goto L7b
        L73:
            r3 = move-exception
            X4.b r4 = r3.f9907k     // Catch: java.lang.Throwable -> L71
            R4.p r4 = (R4.C0585p) r4     // Catch: java.lang.Throwable -> L71
            throw r3     // Catch: java.lang.Throwable -> L79
        L79:
            r3 = move-exception
            r0 = r4
        L7b:
            if (r0 == 0) goto L80
            r2.k(r0)
        L80:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: R4.C0584o.d(X4.f, X4.h):X4.j");
    }

    @Override // X4.AbstractC0613j
    public final /* bridge */ /* synthetic */ AbstractC0613j e(AbstractC0618o abstractC0618o) {
        switch (this.f8583l) {
            case 0:
                k((C0585p) abstractC0618o);
                break;
            case 1:
                l((N) abstractC0618o);
                break;
            case 2:
                o((h0) abstractC0618o);
                break;
            default:
                n((O) abstractC0618o);
                break;
        }
        return this;
    }

    public C0585p f() {
        C0585p c0585p = new C0585p(this);
        if ((this.f8584m & 1) == 1) {
            this.f8585n = Collections.unmodifiableList(this.f8585n);
            this.f8584m &= -2;
        }
        c0585p.f8589l = this.f8585n;
        return c0585p;
    }

    public N g() {
        N n7 = new N(this);
        if ((this.f8584m & 1) == 1) {
            this.f8585n = Collections.unmodifiableList(this.f8585n);
            this.f8584m &= -2;
        }
        n7.f8247l = this.f8585n;
        return n7;
    }

    public O h() {
        O o7 = new O(this);
        if ((this.f8584m & 1) == 1) {
            this.f8585n = ((X4.t) this.f8585n).e();
            this.f8584m &= -2;
        }
        o7.f8253l = (X4.t) this.f8585n;
        return o7;
    }

    public h0 i() {
        h0 h0Var = new h0(this);
        if ((this.f8584m & 1) == 1) {
            this.f8585n = Collections.unmodifiableList(this.f8585n);
            this.f8584m &= -2;
        }
        h0Var.f8493l = this.f8585n;
        return h0Var;
    }

    public void k(C0585p c0585p) {
        if (c0585p == C0585p.f8586o) {
            return;
        }
        if (!c0585p.f8589l.isEmpty()) {
            if (this.f8585n.isEmpty()) {
                this.f8585n = c0585p.f8589l;
                this.f8584m &= -2;
            } else {
                if ((this.f8584m & 1) != 1) {
                    this.f8585n = new ArrayList(this.f8585n);
                    this.f8584m |= 1;
                }
                this.f8585n.addAll(c0585p.f8589l);
            }
        }
        this.f9896k = this.f9896k.h(c0585p.f8588k);
    }

    public void l(N n7) {
        if (n7 == N.f8244o) {
            return;
        }
        if (!n7.f8247l.isEmpty()) {
            if (this.f8585n.isEmpty()) {
                this.f8585n = n7.f8247l;
                this.f8584m &= -2;
            } else {
                if ((this.f8584m & 1) != 1) {
                    this.f8585n = new ArrayList(this.f8585n);
                    this.f8584m |= 1;
                }
                this.f8585n.addAll(n7.f8247l);
            }
        }
        this.f9896k = this.f9896k.h(n7.f8246k);
    }

    public void n(O o7) {
        if (o7 == O.f8250o) {
            return;
        }
        if (!o7.f8253l.isEmpty()) {
            if (((X4.t) this.f8585n).isEmpty()) {
                this.f8585n = o7.f8253l;
                this.f8584m &= -2;
            } else {
                if ((this.f8584m & 1) != 1) {
                    this.f8585n = new C0621s((X4.t) this.f8585n);
                    this.f8584m |= 1;
                }
                ((X4.t) this.f8585n).addAll(o7.f8253l);
            }
        }
        this.f9896k = this.f9896k.h(o7.f8252k);
    }

    public void o(h0 h0Var) {
        if (h0Var == h0.f8490o) {
            return;
        }
        if (!h0Var.f8493l.isEmpty()) {
            if (this.f8585n.isEmpty()) {
                this.f8585n = h0Var.f8493l;
                this.f8584m &= -2;
            } else {
                if ((this.f8584m & 1) != 1) {
                    this.f8585n = new ArrayList(this.f8585n);
                    this.f8584m |= 1;
                }
                this.f8585n.addAll(h0Var.f8493l);
            }
        }
        this.f9896k = this.f9896k.h(h0Var.f8492k);
    }
}
