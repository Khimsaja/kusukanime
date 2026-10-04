package v;

import w0.AbstractC2182Q;
import w0.InterfaceC2172G;
import w0.InterfaceC2175J;

/* renamed from: v.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2137p extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ w0.S f16494l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2172G f16495m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2175J f16496n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f16497o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f16498p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C2138q f16499q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2137p(w0.S s7, InterfaceC2172G interfaceC2172G, InterfaceC2175J interfaceC2175J, int i7, int i8, C2138q c2138q) {
        super(1);
        this.f16494l = s7;
        this.f16495m = interfaceC2172G;
        this.f16496n = interfaceC2175J;
        this.f16497o = i7;
        this.f16498p = i8;
        this.f16499q = c2138q;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        T0.k layoutDirection = this.f16496n.getLayoutDirection();
        a0.i iVar = this.f16499q.a;
        AbstractC2136o.b((AbstractC2182Q) obj, this.f16494l, this.f16495m, layoutDirection, this.f16497o, this.f16498p, iVar);
        return O3.C.a;
    }
}
