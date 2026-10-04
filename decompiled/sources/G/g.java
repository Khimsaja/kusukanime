package G;

import D.AbstractC0047d0;
import D.L0;
import F0.h;
import F0.q;
import F0.s;
import F0.t;
import H0.B;
import H0.C0209a;
import H0.C0214f;
import H0.I;
import H0.r;
import I0.y;
import M0.i;
import P3.F;
import S0.j;
import T0.k;
import a0.p;
import h0.AbstractC0993p;
import h0.C0972Q;
import h0.C0998u;
import h0.InterfaceC0995r;
import j0.AbstractC1299e;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.l;
import l4.AbstractC1420H;
import l4.InterfaceC1443v;
import w0.AbstractC2185c;
import w0.C2196n;
import w0.InterfaceC2172G;
import w0.InterfaceC2174I;
import w0.InterfaceC2175J;
import w0.S;
import y0.AbstractC2359f;
import y0.C2351F;
import y0.InterfaceC2368o;
import y0.InterfaceC2375w;
import y0.N;
import y0.l0;

/* loaded from: classes.dex */
public final class g extends p implements InterfaceC2375w, InterfaceC2368o, l0 {

    /* renamed from: A, reason: collision with root package name */
    public int f2584A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f2585B;

    /* renamed from: C, reason: collision with root package name */
    public int f2586C;

    /* renamed from: D, reason: collision with root package name */
    public int f2587D;

    /* renamed from: E, reason: collision with root package name */
    public Map f2588E;

    /* renamed from: F, reason: collision with root package name */
    public d f2589F;

    /* renamed from: G, reason: collision with root package name */
    public f f2590G;

    /* renamed from: H, reason: collision with root package name */
    public e f2591H;

    /* renamed from: x, reason: collision with root package name */
    public String f2592x;

    /* renamed from: y, reason: collision with root package name */
    public I f2593y;

    /* renamed from: z, reason: collision with root package name */
    public i f2594z;

    public final d G0() {
        if (this.f2589F == null) {
            this.f2589F = new d(this.f2592x, this.f2593y, this.f2594z, this.f2584A, this.f2585B, this.f2586C, this.f2587D);
        }
        d dVar = this.f2589F;
        l.c(dVar);
        return dVar;
    }

    public final d H0(T0.b bVar) {
        d dVar;
        e eVar = this.f2591H;
        if (eVar != null && eVar.f2580c && (dVar = eVar.f2581d) != null) {
            dVar.c(bVar);
            return dVar;
        }
        d dVarG0 = G0();
        dVarG0.c(bVar);
        return dVarG0;
    }

    @Override // y0.InterfaceC2375w
    public final int b(N n7, InterfaceC2172G interfaceC2172G, int i7) {
        return AbstractC0047d0.k(H0(n7).d(n7.getLayoutDirection()).a());
    }

    @Override // y0.InterfaceC2375w
    public final int c(N n7, InterfaceC2172G interfaceC2172G, int i7) {
        return H0(n7).a(i7, n7.getLayoutDirection());
    }

    @Override // y0.InterfaceC2375w
    public final InterfaceC2174I e(InterfaceC2175J interfaceC2175J, InterfaceC2172G interfaceC2172G, long j7) {
        long jA;
        boolean z7;
        r rVar;
        int i7;
        d dVarH0 = H0(interfaceC2175J);
        k layoutDirection = interfaceC2175J.getLayoutDirection();
        if (dVarH0.f2567g > 1) {
            b bVar = dVarH0.f2573m;
            I i8 = dVarH0.f2562b;
            T0.b bVar2 = dVarH0.f2569i;
            l.c(bVar2);
            i iVar = dVarH0.f2563c;
            if ((bVar == null || layoutDirection != bVar.a || !l.a(i8, bVar.f2555b) || bVar2.a() != bVar.f2556c.f8834k || iVar != bVar.f2557d) && ((bVar = b.f2554h) == null || layoutDirection != bVar.a || !l.a(i8, bVar.f2555b) || bVar2.a() != bVar.f2556c.f8834k || iVar != bVar.f2557d)) {
                bVar = new b(layoutDirection, n6.d.X(i8, layoutDirection), new T0.c(bVar2.a(), bVar2.n()), iVar);
                b.f2554h = bVar;
            }
            dVarH0.f2573m = bVar;
            int i9 = dVarH0.f2567g;
            float f5 = bVar.f2560g;
            float f7 = bVar.f2559f;
            if (Float.isNaN(f5) || Float.isNaN(f7)) {
                String str = c.a;
                long jB = q0.c.b(0, 0, 15);
                T0.c cVar = bVar.f2556c;
                float fB = F.c(str, bVar.f2558e, jB, cVar, bVar.f2557d, 1, 96).b();
                float fB2 = F.c(c.f2561b, bVar.f2558e, q0.c.b(0, 0, 15), cVar, bVar.f2557d, 2, 96).b() - fB;
                bVar.f2560g = fB;
                bVar.f2559f = fB2;
                f7 = fB2;
                f5 = fB;
            }
            if (i9 != 1) {
                int iRound = Math.round((f7 * (i9 - 1)) + f5);
                i7 = iRound >= 0 ? iRound : 0;
                int iG = T0.a.g(j7);
                if (i7 > iG) {
                    i7 = iG;
                }
            } else {
                i7 = T0.a.i(j7);
            }
            jA = q0.c.a(T0.a.j(j7), T0.a.h(j7), i7, T0.a.g(j7));
        } else {
            jA = j7;
        }
        C0209a c0209a = dVarH0.f2570j;
        if (c0209a == null || (rVar = dVarH0.f2574n) == null || rVar.b() || layoutDirection != dVarH0.f2575o || (!T0.a.b(jA, dVarH0.f2576p) && (T0.a.h(jA) != T0.a.h(dVarH0.f2576p) || T0.a.g(jA) < c0209a.b() || c0209a.f3098d.f3922c))) {
            C0209a c0209aB = dVarH0.b(jA, layoutDirection);
            dVarH0.f2576p = jA;
            long jS = q0.c.s(jA, AbstractC1420H.a(AbstractC0047d0.k(c0209aB.d()), AbstractC0047d0.k(c0209aB.b())));
            dVarH0.f2572l = jS;
            dVarH0.f2571k = dVarH0.f2564d != 3 && (((float) ((int) (jS >> 32))) < c0209aB.d() || ((float) ((int) (jS & 4294967295L))) < c0209aB.b());
            dVarH0.f2570j = c0209aB;
            z7 = true;
        } else {
            if (!T0.a.b(jA, dVarH0.f2576p)) {
                C0209a c0209a2 = dVarH0.f2570j;
                l.c(c0209a2);
                long jS2 = q0.c.s(jA, AbstractC1420H.a(AbstractC0047d0.k(Math.min(c0209a2.a.f7700s.b(), c0209a2.d())), AbstractC0047d0.k(c0209a2.b())));
                dVarH0.f2572l = jS2;
                dVarH0.f2571k = dVarH0.f2564d != 3 && (((float) ((int) (jS2 >> 32))) < c0209a2.d() || ((float) ((int) (jS2 & 4294967295L))) < c0209a2.b());
                dVarH0.f2576p = jA;
            }
            z7 = false;
        }
        r rVar2 = dVarH0.f2574n;
        if (rVar2 != null) {
            rVar2.b();
        }
        C0209a c0209a3 = dVarH0.f2570j;
        l.c(c0209a3);
        long j8 = dVarH0.f2572l;
        if (z7) {
            AbstractC2359f.t(this, 2).V0();
            Map linkedHashMap = this.f2588E;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap(2);
            }
            C2196n c2196n = AbstractC2185c.a;
            y yVar = c0209a3.f3098d;
            linkedHashMap.put(c2196n, Integer.valueOf(Math.round(yVar.d(0))));
            linkedHashMap.put(AbstractC2185c.f16859b, Integer.valueOf(Math.round(yVar.d(yVar.f3925f - 1))));
            this.f2588E = linkedHashMap;
        }
        int i10 = (int) (j8 >> 32);
        int i11 = (int) (j8 & 4294967295L);
        int iMin = Math.min(i10, 262142);
        int iMin2 = i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i10, 262142);
        int iF = q0.c.f(iMin2 == Integer.MAX_VALUE ? iMin : iMin2);
        S sB = interfaceC2172G.b(q0.c.a(iMin, iMin2, Math.min(iF, i11), i11 != Integer.MAX_VALUE ? Math.min(iF, i11) : Integer.MAX_VALUE));
        Map map = this.f2588E;
        l.c(map);
        return interfaceC2175J.T(i10, i11, map, new L0(sB, 1));
    }

    @Override // y0.InterfaceC2368o
    public final void f(C2351F c2351f) {
        if (this.f10414w) {
            d dVarH0 = H0(c2351f);
            C0209a c0209a = dVarH0.f2570j;
            if (c0209a == null) {
                throw new IllegalArgumentException(("no paragraph (layoutCache=" + this.f2589F + ", textSubstitution=" + this.f2591H + ')').toString());
            }
            InterfaceC0995r interfaceC0995rT = c2351f.f17696k.f12205l.t();
            boolean z7 = dVarH0.f2571k;
            if (z7) {
                long j7 = dVarH0.f2572l;
                interfaceC0995rT.l();
                interfaceC0995rT.e(0.0f, 0.0f, (int) (j7 >> 32), (int) (j7 & 4294967295L), 1);
            }
            try {
                B b4 = this.f2593y.a;
                j jVar = b4.f3066m;
                if (jVar == null) {
                    jVar = j.f8715b;
                }
                j jVar2 = jVar;
                C0972Q c0972q = b4.f3067n;
                if (c0972q == null) {
                    c0972q = C0972Q.f11801d;
                }
                C0972Q c0972q2 = c0972q;
                AbstractC1299e abstractC1299e = b4.f3069p;
                if (abstractC1299e == null) {
                    abstractC1299e = j0.g.a;
                }
                AbstractC1299e abstractC1299e2 = abstractC1299e;
                AbstractC0993p abstractC0993pC = b4.a.c();
                if (abstractC0993pC != null) {
                    c0209a.g(interfaceC0995rT, abstractC0993pC, this.f2593y.a.a.a(), c0972q2, jVar2, abstractC1299e2);
                } else {
                    long jB = C0998u.f11834g;
                    if (jB == 16) {
                        jB = this.f2593y.b() != 16 ? this.f2593y.b() : C0998u.f11829b;
                    }
                    c0209a.f(interfaceC0995rT, jB, c0972q2, jVar2, abstractC1299e2);
                }
                if (z7) {
                    interfaceC0995rT.i();
                }
            } catch (Throwable th) {
                if (z7) {
                    interfaceC0995rT.i();
                }
                throw th;
            }
        }
    }

    @Override // y0.InterfaceC2375w
    public final int g(N n7, InterfaceC2172G interfaceC2172G, int i7) {
        return H0(n7).a(i7, n7.getLayoutDirection());
    }

    @Override // y0.InterfaceC2375w
    public final int i(N n7, InterfaceC2172G interfaceC2172G, int i7) {
        return AbstractC0047d0.k(H0(n7).d(n7.getLayoutDirection()).c());
    }

    @Override // y0.l0
    public final void y(F0.i iVar) {
        f fVar = this.f2590G;
        if (fVar == null) {
            fVar = new f(this, 0);
            this.f2590G = fVar;
        }
        C0214f c0214f = new C0214f(this.f2592x, null, 6);
        InterfaceC1443v[] interfaceC1443vArr = s.a;
        iVar.j(q.f2148u, P3.r.H(c0214f));
        e eVar = this.f2591H;
        if (eVar != null) {
            boolean z7 = eVar.f2580c;
            t tVar = q.f2150w;
            InterfaceC1443v[] interfaceC1443vArr2 = s.a;
            InterfaceC1443v interfaceC1443v = interfaceC1443vArr2[15];
            tVar.a(iVar, Boolean.valueOf(z7));
            C0214f c0214f2 = new C0214f(eVar.f2579b, null, 6);
            t tVar2 = q.f2149v;
            InterfaceC1443v interfaceC1443v2 = interfaceC1443vArr2[14];
            tVar2.a(iVar, c0214f2);
        }
        iVar.j(h.f2079j, new F0.a(null, new f(this, 1)));
        iVar.j(h.f2080k, new F0.a(null, new f(this, 2)));
        iVar.j(h.f2081l, new F0.a(null, new B.e(6, this)));
        s.c(iVar, fVar);
    }
}
