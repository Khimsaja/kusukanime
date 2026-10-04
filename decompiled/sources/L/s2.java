package L;

import O.C0486d;
import O.C0510p;
import h0.InterfaceC0973S;

/* loaded from: classes.dex */
public final class s2 extends kotlin.jvm.internal.m implements e4.n {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a0.q f5791l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f5792m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ r2 f5793n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ u.k f5794o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0973S f5795p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f5796q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(a0.q qVar, boolean z7, r2 r2Var, u.k kVar, InterfaceC0973S interfaceC0973S, int i7) {
        super(2);
        this.f5791l = qVar;
        this.f5792m = z7;
        this.f5793n = r2Var;
        this.f5794o = kVar;
        this.f5795p = interfaceC0973S;
        this.f5796q = i7;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iV = C0486d.V(this.f5796q | 1);
        boolean z7 = this.f5792m;
        r2 r2Var = this.f5793n;
        androidx.compose.material3.a.b(this.f5791l, z7, r2Var, this.f5794o, this.f5795p, (C0510p) obj, iV);
        return O3.C.a;
    }
}
