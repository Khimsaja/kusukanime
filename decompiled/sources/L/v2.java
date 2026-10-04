package L;

import O.C0510p;
import h0.InterfaceC0973S;

/* loaded from: classes.dex */
public final class v2 extends kotlin.jvm.internal.m implements e4.n {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f5877l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ u.j f5878m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ t2 f5879n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0973S f5880o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(boolean z7, u.j jVar, t2 t2Var, InterfaceC0973S interfaceC0973S) {
        super(2);
        this.f5877l = z7;
        this.f5878m = jVar;
        this.f5879n = t2Var;
        this.f5880o = interfaceC0973S;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        C0510p c0510p = (C0510p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0510p.y()) {
            c0510p.M();
        } else {
            y2 y2Var = y2.a;
            t2 t2Var = this.f5879n;
            y2Var.a(this.f5877l, this.f5878m, t2Var, this.f5880o, c0510p, 114822144);
        }
        return O3.C.a;
    }
}
