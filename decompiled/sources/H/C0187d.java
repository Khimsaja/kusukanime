package H;

import O.C0486d;
import O.C0510p;
import z0.AbstractC2455l0;
import z0.S0;

/* renamed from: H.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0187d extends kotlin.jvm.internal.m implements e4.n {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ S0 f2958l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f2959m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f2960n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ a0.q f2961o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0196m f2962p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0187d(S0 s02, long j7, boolean z7, a0.q qVar, InterfaceC0196m interfaceC0196m) {
        super(2);
        this.f2958l = s02;
        this.f2959m = j7;
        this.f2960n = z7;
        this.f2961o = qVar;
        this.f2962p = interfaceC0196m;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        C0510p c0510p = (C0510p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0510p.y()) {
            c0510p.M();
        } else {
            C0486d.a(AbstractC2455l0.f18798q.a(this.f2958l), W.f.b(-1426434671, new C0186c(this.f2959m, this.f2960n, this.f2961o, this.f2962p), c0510p), c0510p, 56);
        }
        return O3.C.a;
    }
}
