package q;

import e5.AbstractC0832b;
import f1.AbstractC0870c;
import f6.AbstractC0915m;
import g0.AbstractC0932a;
import h0.AbstractC0966K;
import h0.AbstractC0968M;
import h0.AbstractC0993p;
import h0.C0963H;
import h0.C0964I;
import h0.C0965J;
import h0.C0987j;
import h0.C0998u;
import h0.InterfaceC0973S;
import j0.C1296b;
import j0.InterfaceC1298d;
import y0.AbstractC2359f;
import y0.C2351F;
import y0.InterfaceC2368o;

/* renamed from: q.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1833o extends a0.p implements InterfaceC2368o, y0.a0 {

    /* renamed from: A, reason: collision with root package name */
    public InterfaceC0973S f14589A;

    /* renamed from: B, reason: collision with root package name */
    public long f14590B;

    /* renamed from: C, reason: collision with root package name */
    public T0.k f14591C;

    /* renamed from: D, reason: collision with root package name */
    public AbstractC0966K f14592D;

    /* renamed from: E, reason: collision with root package name */
    public InterfaceC0973S f14593E;

    /* renamed from: x, reason: collision with root package name */
    public long f14594x;

    /* renamed from: y, reason: collision with root package name */
    public AbstractC0993p f14595y;

    /* renamed from: z, reason: collision with root package name */
    public float f14596z;

    @Override // y0.a0
    public final void K() {
        this.f14590B = 9205357640488583168L;
        this.f14591C = null;
        this.f14592D = null;
        this.f14593E = null;
        AbstractC2359f.n(this);
    }

    @Override // y0.InterfaceC2368o
    public final void f(C2351F c2351f) {
        C0987j c0987j;
        if (this.f14589A == AbstractC0968M.a) {
            if (!C0998u.c(this.f14594x, C0998u.f11834g)) {
                InterfaceC1298d.R(c2351f, this.f14594x, 0L, 0L, 0.0f, 126);
            }
            AbstractC0993p abstractC0993p = this.f14595y;
            if (abstractC0993p != null) {
                InterfaceC1298d.o0(c2351f, abstractC0993p, 0L, 0L, this.f14596z, null, 118);
            }
        } else {
            kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
            C1296b c1296b = c2351f.f17696k;
            if (g0.f.a(c1296b.d(), this.f14590B) && c2351f.getLayoutDirection() == this.f14591C && kotlin.jvm.internal.l.a(this.f14593E, this.f14589A)) {
                AbstractC0966K abstractC0966K = this.f14592D;
                kotlin.jvm.internal.l.c(abstractC0966K);
                xVar.f12720k = abstractC0966K;
            } else {
                AbstractC2359f.s(this, new A.j(xVar, this, c2351f, 4));
            }
            this.f14592D = (AbstractC0966K) xVar.f12720k;
            this.f14590B = c1296b.d();
            this.f14591C = c2351f.getLayoutDirection();
            this.f14593E = this.f14589A;
            Object obj = xVar.f12720k;
            kotlin.jvm.internal.l.c(obj);
            AbstractC0966K abstractC0966K2 = (AbstractC0966K) obj;
            if (!C0998u.c(this.f14594x, C0998u.f11834g)) {
                AbstractC0968M.m(c2351f, abstractC0966K2, this.f14594x);
            }
            AbstractC0993p abstractC0993p2 = this.f14595y;
            if (abstractC0993p2 != null) {
                float f5 = this.f14596z;
                j0.g gVar = j0.g.a;
                if (abstractC0966K2 instanceof C0964I) {
                    g0.d dVar = ((C0964I) abstractC0966K2).a;
                    c2351f.e(abstractC0993p2, AbstractC0832b.e(dVar.a, dVar.f11659b), AbstractC0870c.F(dVar.c(), dVar.b()), f5, gVar);
                } else {
                    if (abstractC0966K2 instanceof C0965J) {
                        C0965J c0965j = (C0965J) abstractC0966K2;
                        c0987j = c0965j.f11781b;
                        if (c0987j == null) {
                            g0.e eVar = c0965j.a;
                            float fB = AbstractC0932a.b(eVar.f11668h);
                            c2351f.f(abstractC0993p2, AbstractC0832b.e(eVar.a, eVar.f11662b), AbstractC0870c.F(eVar.b(), eVar.a()), AbstractC0915m.a(fB, fB), f5, gVar);
                        }
                    } else {
                        if (!(abstractC0966K2 instanceof C0963H)) {
                            throw new D6.r();
                        }
                        c0987j = ((C0963H) abstractC0966K2).a;
                    }
                    c2351f.N(c0987j, abstractC0993p2, f5, gVar, 3);
                }
            }
        }
        c2351f.b();
    }
}
