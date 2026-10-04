package z;

import p.InterfaceC1760l;

/* loaded from: classes.dex */
public final class y extends U3.c {

    /* renamed from: k, reason: collision with root package name */
    public C f18536k;

    /* renamed from: l, reason: collision with root package name */
    public InterfaceC1760l f18537l;

    /* renamed from: m, reason: collision with root package name */
    public int f18538m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f18539n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C f18540o;

    /* renamed from: p, reason: collision with root package name */
    public int f18541p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(C c2, U3.c cVar) {
        super(cVar);
        this.f18540o = c2;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) {
        this.f18539n = obj;
        this.f18541p |= Integer.MIN_VALUE;
        return this.f18540o.f(0, null, this);
    }
}
