package L;

import O.C0486d;
import O.C0510p;
import w0.InterfaceC2192j;

/* loaded from: classes.dex */
public final class X1 extends kotlin.jvm.internal.m implements e4.n {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f5416l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f5417m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f5418n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f5419o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f5420p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f5421q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ O3.e f5422r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f5423s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f5424t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X1(int i7, W.a aVar, W.a aVar2, W.a aVar3, W.a aVar4, v.m0 m0Var, W.a aVar5, int i8) {
        super(2);
        this.f5417m = i7;
        this.f5419o = aVar;
        this.f5420p = aVar2;
        this.f5421q = aVar3;
        this.f5422r = aVar4;
        this.f5424t = m0Var;
        this.f5423s = aVar5;
        this.f5418n = i8;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        int i7 = this.f5416l;
        C0510p c0510p = (C0510p) obj;
        ((Number) obj2).intValue();
        switch (i7) {
            case 0:
                int iV = C0486d.V(this.f5418n | 1);
                W.a aVar = (W.a) this.f5423s;
                Y1.b(this.f5417m, (W.a) this.f5419o, (W.a) this.f5420p, (W.a) this.f5421q, (W.a) this.f5422r, (v.m0) this.f5424t, aVar, c0510p, iV);
                break;
            default:
                int iV2 = C0486d.V(this.f5417m | 1);
                int iV3 = C0486d.V(this.f5418n);
                T2.q.a((T2.r) this.f5419o, (String) this.f5420p, (a0.q) this.f5421q, (e4.k) this.f5422r, (a0.d) this.f5423s, (InterfaceC2192j) this.f5424t, c0510p, iV2, iV3);
                break;
        }
        return O3.C.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X1(T2.r rVar, String str, a0.q qVar, e4.k kVar, a0.d dVar, InterfaceC2192j interfaceC2192j, int i7, int i8) {
        super(2);
        this.f5419o = rVar;
        this.f5420p = str;
        this.f5421q = qVar;
        this.f5422r = kVar;
        this.f5423s = dVar;
        this.f5424t = interfaceC2192j;
        this.f5417m = i7;
        this.f5418n = i8;
    }
}
