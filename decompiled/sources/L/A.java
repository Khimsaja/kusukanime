package L;

import O.C0486d;
import O.C0510p;
import e4.InterfaceC0821a;
import h0.InterfaceC0973S;

/* loaded from: classes.dex */
public final class A extends kotlin.jvm.internal.m implements e4.n {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f4879l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0821a f4880m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ a0.q f4881n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f4882o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0973S f4883p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ W.a f4884q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f4885r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f4886s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f4887t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f4888u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ A(InterfaceC0821a interfaceC0821a, a0.q qVar, boolean z7, InterfaceC0973S interfaceC0973S, Object obj, Object obj2, W.a aVar, int i7, int i8, int i9) {
        super(2);
        this.f4879l = i9;
        this.f4880m = interfaceC0821a;
        this.f4881n = qVar;
        this.f4882o = z7;
        this.f4883p = interfaceC0973S;
        this.f4887t = obj;
        this.f4888u = obj2;
        this.f4884q = aVar;
        this.f4885r = i7;
        this.f4886s = i8;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4879l) {
            case 0:
                ((Number) obj2).intValue();
                int iV = C0486d.V(this.f4885r | 1);
                W.a aVar = this.f4884q;
                v.Z z7 = (v.Z) this.f4888u;
                E0.i(this.f4880m, this.f4881n, this.f4882o, this.f4883p, (r) this.f4887t, z7, aVar, (C0510p) obj, iV, this.f4886s);
                break;
            default:
                ((Number) obj2).intValue();
                int iV2 = C0486d.V(this.f4885r | 1);
                W.a aVar2 = this.f4884q;
                E e7 = (E) this.f4888u;
                E0.d(this.f4880m, this.f4881n, this.f4882o, this.f4883p, (B) this.f4887t, e7, aVar2, (C0510p) obj, iV2, this.f4886s);
                break;
        }
        return O3.C.a;
    }
}
