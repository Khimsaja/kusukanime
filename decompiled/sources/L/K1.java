package L;

import O.C0486d;
import O.C0510p;

/* loaded from: classes.dex */
public final class K1 extends kotlin.jvm.internal.m implements e4.n {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a0.q f5166l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f5167m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f5168n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f5169o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f5170p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f5171q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f5172r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K1(a0.q qVar, long j7, float f5, long j8, int i7, int i8, int i9) {
        super(2);
        this.f5166l = qVar;
        this.f5167m = j7;
        this.f5168n = f5;
        this.f5169o = j8;
        this.f5170p = i7;
        this.f5171q = i8;
        this.f5172r = i9;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iV = C0486d.V(this.f5171q | 1);
        float f5 = this.f5168n;
        Q1.a(this.f5166l, this.f5167m, f5, this.f5169o, this.f5170p, (C0510p) obj, iV, this.f5172r);
        return O3.C.a;
    }
}
