package A3;

import K5.Y;

/* loaded from: classes.dex */
public final class A extends U3.c {

    /* renamed from: k, reason: collision with root package name */
    public Y f114k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f115l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ B f116m;

    /* renamed from: n, reason: collision with root package name */
    public int f117n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(B b4, U3.c cVar) {
        super(cVar);
        this.f116m = b4;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) {
        this.f115l = obj;
        this.f117n |= Integer.MIN_VALUE;
        return B.e(this.f116m, null, this);
    }
}
