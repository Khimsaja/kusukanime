package L;

import O.C0486d;
import O.C0510p;
import h0.InterfaceC0973S;

/* loaded from: classes.dex */
public final class u2 extends kotlin.jvm.internal.m implements e4.n {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ y2 f5864l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f5865m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ u.j f5866n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ t2 f5867o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0973S f5868p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(y2 y2Var, boolean z7, u.j jVar, t2 t2Var, InterfaceC0973S interfaceC0973S, int i7) {
        super(2);
        y2 y2Var2 = y2.a;
        y2 y2Var3 = y2.a;
        this.f5864l = y2Var;
        this.f5865m = z7;
        this.f5866n = jVar;
        this.f5867o = t2Var;
        this.f5868p = interfaceC0973S;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        C0510p c0510p = (C0510p) obj;
        ((Number) obj2).intValue();
        int iV = C0486d.V(114822145);
        y2 y2Var = y2.a;
        y2 y2Var2 = y2.a;
        this.f5864l.a(this.f5865m, this.f5866n, this.f5867o, this.f5868p, c0510p, iV);
        return O3.C.a;
    }
}
