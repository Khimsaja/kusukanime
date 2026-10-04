package L;

import O.C0510p;
import h0.InterfaceC0973S;

/* renamed from: L.z1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0437z1 extends kotlin.jvm.internal.m implements e4.n {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f5979l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f5980m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ u.k f5981n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ t2 f5982o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0973S f5983p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0437z1(boolean z7, boolean z8, u.k kVar, t2 t2Var, InterfaceC0973S interfaceC0973S) {
        super(2);
        this.f5979l = z7;
        this.f5980m = z8;
        this.f5981n = kVar;
        this.f5982o = t2Var;
        this.f5983p = interfaceC0973S;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        C0510p c0510p = (C0510p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0510p.y()) {
            c0510p.M();
        } else {
            C0434y1.a.a(this.f5979l, this.f5980m, this.f5981n, null, this.f5982o, this.f5983p, 0.0f, 0.0f, c0510p, 100663296, 200);
        }
        return O3.C.a;
    }
}
