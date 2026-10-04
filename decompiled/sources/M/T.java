package M;

import O.C0486d;
import O.C0510p;

/* loaded from: classes.dex */
public final class T extends kotlin.jvm.internal.m implements e4.n {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f6263l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e4.n f6264m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f6265n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(long j7, e4.n nVar, int i7) {
        super(2);
        this.f6263l = j7;
        this.f6264m = nVar;
        this.f6265n = i7;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iV = C0486d.V(this.f6265n | 1);
        W.c(this.f6263l, this.f6264m, (C0510p) obj, iV);
        return O3.C.a;
    }
}
