package s0;

import H5.u0;

/* loaded from: classes.dex */
public final class x extends U3.c {

    /* renamed from: k, reason: collision with root package name */
    public u0 f15496k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f15497l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1953A f15498m;

    /* renamed from: n, reason: collision with root package name */
    public int f15499n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(C1953A c1953a, U3.a aVar) {
        super(aVar);
        this.f15498m = c1953a;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) {
        this.f15497l = obj;
        this.f15499n |= Integer.MIN_VALUE;
        return this.f15498m.g(0L, null, this);
    }
}
