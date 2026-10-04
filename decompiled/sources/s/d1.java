package s;

import e4.InterfaceC0821a;

/* loaded from: classes.dex */
public final class d1 extends U3.c {

    /* renamed from: k, reason: collision with root package name */
    public e1 f15286k;

    /* renamed from: l, reason: collision with root package name */
    public O3.e f15287l;

    /* renamed from: m, reason: collision with root package name */
    public InterfaceC0821a f15288m;

    /* renamed from: n, reason: collision with root package name */
    public float f15289n;

    /* renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f15290o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ e1 f15291p;

    /* renamed from: q, reason: collision with root package name */
    public int f15292q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(e1 e1Var, U3.c cVar) {
        super(cVar);
        this.f15291p = e1Var;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) {
        this.f15290o = obj;
        this.f15292q |= Integer.MIN_VALUE;
        return this.f15291p.a(null, null, this);
    }
}
