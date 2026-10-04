package q;

import b1.AbstractC0703b;
import e5.AbstractC0832b;
import g0.AbstractC0932a;
import h0.C0975U;
import j0.C1296b;
import j0.InterfaceC1298d;
import y0.C2351F;

/* loaded from: classes.dex */
public final class r extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f14615l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0975U f14616m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f14617n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f14618o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ float f14619p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ long f14620q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f14621r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j0.h f14622s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(boolean z7, C0975U c0975u, long j7, float f5, float f7, long j8, long j9, j0.h hVar) {
        super(1);
        this.f14615l = z7;
        this.f14616m = c0975u;
        this.f14617n = j7;
        this.f14618o = f5;
        this.f14619p = f7;
        this.f14620q = j8;
        this.f14621r = j9;
        this.f14622s = hVar;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        C2351F c2351f = (C2351F) obj;
        c2351f.b();
        if (this.f14615l) {
            InterfaceC1298d.Z(c2351f, this.f14616m, 0L, 0L, this.f14617n, null, 246);
        } else {
            long j7 = this.f14617n;
            float fB = AbstractC0932a.b(j7);
            float f5 = this.f14618o;
            if (fB < f5) {
                float f7 = this.f14619p;
                C1296b c1296b = c2351f.f17696k;
                float fD = g0.f.d(c1296b.d());
                float f8 = this.f14619p;
                float f9 = fD - f8;
                float fB2 = g0.f.b(c1296b.d()) - f8;
                C0975U c0975u = this.f14616m;
                long j8 = this.f14617n;
                B2.l lVar = c1296b.f12205l;
                long jA = lVar.A();
                lVar.t().l();
                try {
                    ((B2.l) ((X4.y) lVar.f416l).f9916l).t().e(f7, f7, f9, fB2, 0);
                    InterfaceC1298d.Z(c2351f, c0975u, 0L, 0L, j8, null, 246);
                } finally {
                    AbstractC0703b.y(lVar, jA);
                }
            } else {
                InterfaceC1298d.Z(c2351f, this.f14616m, this.f14620q, this.f14621r, AbstractC0832b.D(f5, j7), this.f14622s, 208);
            }
        }
        return O3.C.a;
    }
}
