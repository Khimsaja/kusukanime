package L;

import O.C0486d;
import O.C0510p;
import h0.InterfaceC0973S;

/* renamed from: L.w1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0428w1 extends kotlin.jvm.internal.m implements e4.n {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0434y1 f5885l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f5886m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f5887n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ u.j f5888o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ a0.n f5889p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ t2 f5890q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0973S f5891r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ float f5892s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ float f5893t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f5894u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f5895v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0428w1(C0434y1 c0434y1, boolean z7, boolean z8, u.j jVar, a0.n nVar, t2 t2Var, InterfaceC0973S interfaceC0973S, float f5, float f7, int i7, int i8) {
        super(2);
        this.f5885l = c0434y1;
        this.f5886m = z7;
        this.f5887n = z8;
        this.f5888o = jVar;
        this.f5889p = nVar;
        this.f5890q = t2Var;
        this.f5891r = interfaceC0973S;
        this.f5892s = f5;
        this.f5893t = f7;
        this.f5894u = i7;
        this.f5895v = i8;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iV = C0486d.V(this.f5894u | 1);
        t2 t2Var = this.f5890q;
        InterfaceC0973S interfaceC0973S = this.f5891r;
        this.f5885l.a(this.f5886m, this.f5887n, this.f5888o, this.f5889p, t2Var, interfaceC0973S, this.f5892s, this.f5893t, (C0510p) obj, iV, this.f5895v);
        return O3.C.a;
    }
}
