package y;

import O.C0486d;
import O.C0510p;
import l4.InterfaceC1440s;

/* renamed from: y.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2342w extends kotlin.jvm.internal.m implements e4.n {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1440s f17643l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a0.q f17644m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C2306F f17645n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ e4.n f17646o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2342w(InterfaceC1440s interfaceC1440s, a0.q qVar, C2306F c2306f, e4.n nVar, int i7) {
        super(2);
        this.f17643l = interfaceC1440s;
        this.f17644m = qVar;
        this.f17645n = c2306f;
        this.f17646o = nVar;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iV = C0486d.V(1);
        e3.c.b(this.f17643l, this.f17644m, this.f17645n, this.f17646o, (C0510p) obj, iV);
        return O3.C.a;
    }
}
