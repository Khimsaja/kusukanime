package y0;

import e4.InterfaceC0821a;
import w0.AbstractC2182Q;
import z0.C2471u;

/* renamed from: y0.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2353H extends kotlin.jvm.internal.m implements InterfaceC0821a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ K f17698l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e0 f17699m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f17700n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2353H(K k7, e0 e0Var, long j7) {
        super(0);
        this.f17698l = k7;
        this.f17699m = e0Var;
        this.f17700n = j7;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        O oN0;
        K k7 = this.f17698l;
        AbstractC2182Q placementScope = null;
        if (AbstractC2359f.r(k7.a)) {
            Y y7 = k7.a().f17827x;
            if (y7 != null) {
                placementScope = y7.f17773s;
            }
        } else {
            Y y8 = k7.a().f17827x;
            if (y8 != null && (oN0 = y8.N0()) != null) {
                placementScope = oN0.f17773s;
            }
        }
        if (placementScope == null) {
            placementScope = ((C2471u) this.f17699m).getPlacementScope();
        }
        O oN02 = k7.a().N0();
        kotlin.jvm.internal.l.c(oN02);
        AbstractC2182Q.e(placementScope, oN02, this.f17700n);
        return O3.C.a;
    }
}
