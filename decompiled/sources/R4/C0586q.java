package R4;

import X4.AbstractC0605b;
import X4.AbstractC0613j;
import X4.AbstractC0618o;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: R4.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0586q extends AbstractC0613j implements X4.w {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f8592l;

    /* renamed from: m, reason: collision with root package name */
    public int f8593m;

    /* renamed from: n, reason: collision with root package name */
    public Serializable f8594n;

    /* renamed from: o, reason: collision with root package name */
    public Object f8595o;

    /* renamed from: p, reason: collision with root package name */
    public AbstractC0618o f8596p;

    /* renamed from: q, reason: collision with root package name */
    public Serializable f8597q;

    /* renamed from: r, reason: collision with root package name */
    public Serializable f8598r;

    public /* synthetic */ C0586q(int i7) {
        this.f8592l = i7;
    }

    public static C0586q h() {
        C0586q c0586q = new C0586q(0);
        c0586q.f8594n = EnumC0587s.RETURNS_CONSTANT;
        c0586q.f8595o = Collections.EMPTY_LIST;
        c0586q.f8596p = C0594z.f8649v;
        c0586q.f8597q = EnumC0588t.AT_MOST_ONCE;
        c0586q.f8598r = r.CONCLUSION_CONDITION;
        return c0586q;
    }

    public static C0586q i() {
        C0586q c0586q = new C0586q(1);
        c0586q.f8594n = U4.b.f9234q;
        U4.c cVar = U4.c.f9242q;
        c0586q.f8595o = cVar;
        c0586q.f8596p = cVar;
        c0586q.f8597q = cVar;
        c0586q.f8598r = cVar;
        return c0586q;
    }

    @Override // X4.AbstractC0613j
    public final AbstractC0605b c() {
        switch (this.f8592l) {
            case 0:
                C0589u c0589uF = f();
                if (c0589uF.a()) {
                    return c0589uF;
                }
                throw new D6.r();
            default:
                U4.d dVarG = g();
                dVarG.a();
                return dVarG;
        }
    }

    public final Object clone() {
        switch (this.f8592l) {
            case 0:
                C0586q c0586qH = h();
                c0586qH.k(f());
                return c0586qH;
            default:
                C0586q c0586qI = i();
                c0586qI.l(g());
                return c0586qI;
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
            int r0 = r2.f8592l
            switch(r0) {
                case 0: goto L24;
                default: goto L5;
            }
        L5:
            r0 = 0
            R4.a r1 = U4.d.f9251u     // Catch: java.lang.Throwable -> L14 X4.r -> L16
            r1.getClass()     // Catch: java.lang.Throwable -> L14 X4.r -> L16
            U4.d r1 = new U4.d     // Catch: java.lang.Throwable -> L14 X4.r -> L16
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L14 X4.r -> L16
            r2.l(r1)
            return r2
        L14:
            r3 = move-exception
            goto L1e
        L16:
            r3 = move-exception
            X4.b r4 = r3.f9907k     // Catch: java.lang.Throwable -> L14
            U4.d r4 = (U4.d) r4     // Catch: java.lang.Throwable -> L14
            throw r3     // Catch: java.lang.Throwable -> L1c
        L1c:
            r3 = move-exception
            r0 = r4
        L1e:
            if (r0 == 0) goto L23
            r2.l(r0)
        L23:
            throw r3
        L24:
            r0 = 0
            R4.a r1 = R4.C0589u.f8615u     // Catch: java.lang.Throwable -> L33 X4.r -> L35
            r1.getClass()     // Catch: java.lang.Throwable -> L33 X4.r -> L35
            R4.u r1 = new R4.u     // Catch: java.lang.Throwable -> L33 X4.r -> L35
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L33 X4.r -> L35
            r2.k(r1)
            return r2
        L33:
            r3 = move-exception
            goto L3d
        L35:
            r3 = move-exception
            X4.b r4 = r3.f9907k     // Catch: java.lang.Throwable -> L33
            R4.u r4 = (R4.C0589u) r4     // Catch: java.lang.Throwable -> L33
            throw r3     // Catch: java.lang.Throwable -> L3b
        L3b:
            r3 = move-exception
            r0 = r4
        L3d:
            if (r0 == 0) goto L42
            r2.k(r0)
        L42:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: R4.C0586q.d(X4.f, X4.h):X4.j");
    }

    @Override // X4.AbstractC0613j
    public final /* bridge */ /* synthetic */ AbstractC0613j e(AbstractC0618o abstractC0618o) {
        switch (this.f8592l) {
            case 0:
                k((C0589u) abstractC0618o);
                break;
            default:
                l((U4.d) abstractC0618o);
                break;
        }
        return this;
    }

    public C0589u f() {
        C0589u c0589u = new C0589u(this);
        int i7 = this.f8593m;
        int i8 = (i7 & 1) != 1 ? 0 : 1;
        c0589u.f8618m = (EnumC0587s) this.f8594n;
        if ((i7 & 2) == 2) {
            this.f8595o = Collections.unmodifiableList((List) this.f8595o);
            this.f8593m &= -3;
        }
        c0589u.f8619n = (List) this.f8595o;
        if ((i7 & 4) == 4) {
            i8 |= 2;
        }
        c0589u.f8620o = (C0594z) this.f8596p;
        if ((i7 & 8) == 8) {
            i8 |= 4;
        }
        c0589u.f8621p = (EnumC0588t) this.f8597q;
        if ((i7 & 16) == 16) {
            i8 |= 8;
        }
        c0589u.f8622q = (r) this.f8598r;
        c0589u.f8617l = i8;
        return c0589u;
    }

    public U4.d g() {
        U4.d dVar = new U4.d(this);
        int i7 = this.f8593m;
        int i8 = (i7 & 1) != 1 ? 0 : 1;
        dVar.f9254m = (U4.b) this.f8594n;
        if ((i7 & 2) == 2) {
            i8 |= 2;
        }
        dVar.f9255n = (U4.c) this.f8595o;
        if ((i7 & 4) == 4) {
            i8 |= 4;
        }
        dVar.f9256o = (U4.c) this.f8596p;
        if ((i7 & 8) == 8) {
            i8 |= 8;
        }
        dVar.f9257p = (U4.c) this.f8597q;
        if ((i7 & 16) == 16) {
            i8 |= 16;
        }
        dVar.f9258q = (U4.c) this.f8598r;
        dVar.f9253l = i8;
        return dVar;
    }

    public void k(C0589u c0589u) {
        C0594z c0594z;
        if (c0589u == C0589u.f8614t) {
            return;
        }
        if ((c0589u.f8617l & 1) == 1) {
            EnumC0587s enumC0587s = c0589u.f8618m;
            enumC0587s.getClass();
            this.f8593m |= 1;
            this.f8594n = enumC0587s;
        }
        if (!c0589u.f8619n.isEmpty()) {
            if (((List) this.f8595o).isEmpty()) {
                this.f8595o = c0589u.f8619n;
                this.f8593m &= -3;
            } else {
                if ((this.f8593m & 2) != 2) {
                    this.f8595o = new ArrayList((List) this.f8595o);
                    this.f8593m |= 2;
                }
                ((List) this.f8595o).addAll(c0589u.f8619n);
            }
        }
        if ((c0589u.f8617l & 2) == 2) {
            C0594z c0594z2 = c0589u.f8620o;
            if ((this.f8593m & 4) != 4 || (c0594z = (C0594z) this.f8596p) == C0594z.f8649v) {
                this.f8596p = c0594z2;
            } else {
                C0592x c0592xG = C0592x.g();
                c0592xG.h(c0594z);
                c0592xG.h(c0594z2);
                this.f8596p = c0592xG.f();
            }
            this.f8593m |= 4;
        }
        if ((c0589u.f8617l & 4) == 4) {
            EnumC0588t enumC0588t = c0589u.f8621p;
            enumC0588t.getClass();
            this.f8593m |= 8;
            this.f8597q = enumC0588t;
        }
        if ((c0589u.f8617l & 8) == 8) {
            r rVar = c0589u.f8622q;
            rVar.getClass();
            this.f8593m |= 16;
            this.f8598r = rVar;
        }
        this.f9896k = this.f9896k.h(c0589u.f8616k);
    }

    public void l(U4.d dVar) {
        U4.c cVar;
        U4.c cVar2;
        U4.c cVar3;
        U4.c cVar4;
        U4.b bVar;
        if (dVar == U4.d.f9250t) {
            return;
        }
        if ((dVar.f9253l & 1) == 1) {
            U4.b bVar2 = dVar.f9254m;
            if ((this.f8593m & 1) != 1 || (bVar = (U4.b) this.f8594n) == U4.b.f9234q) {
                this.f8594n = bVar2;
            } else {
                U4.a aVar = new U4.a(0);
                aVar.h(bVar);
                aVar.h(bVar2);
                this.f8594n = aVar.f();
            }
            this.f8593m |= 1;
        }
        if ((dVar.f9253l & 2) == 2) {
            U4.c cVar5 = dVar.f9255n;
            if ((this.f8593m & 2) != 2 || (cVar4 = (U4.c) this.f8595o) == U4.c.f9242q) {
                this.f8595o = cVar5;
            } else {
                U4.a aVarI = U4.c.i(cVar4);
                aVarI.i(cVar5);
                this.f8595o = aVarI.g();
            }
            this.f8593m |= 2;
        }
        if (dVar.i()) {
            U4.c cVar6 = dVar.f9256o;
            if ((this.f8593m & 4) != 4 || (cVar3 = (U4.c) this.f8596p) == U4.c.f9242q) {
                this.f8596p = cVar6;
            } else {
                U4.a aVarI2 = U4.c.i(cVar3);
                aVarI2.i(cVar6);
                this.f8596p = aVarI2.g();
            }
            this.f8593m |= 4;
        }
        if ((dVar.f9253l & 8) == 8) {
            U4.c cVar7 = dVar.f9257p;
            if ((this.f8593m & 8) != 8 || (cVar2 = (U4.c) this.f8597q) == U4.c.f9242q) {
                this.f8597q = cVar7;
            } else {
                U4.a aVarI3 = U4.c.i(cVar2);
                aVarI3.i(cVar7);
                this.f8597q = aVarI3.g();
            }
            this.f8593m |= 8;
        }
        if ((dVar.f9253l & 16) == 16) {
            U4.c cVar8 = dVar.f9258q;
            if ((this.f8593m & 16) != 16 || (cVar = (U4.c) this.f8598r) == U4.c.f9242q) {
                this.f8598r = cVar8;
            } else {
                U4.a aVarI4 = U4.c.i(cVar);
                aVarI4.i(cVar8);
                this.f8598r = aVarI4.g();
            }
            this.f8593m |= 16;
        }
        this.f9896k = this.f9896k.h(dVar.f9252k);
    }
}
