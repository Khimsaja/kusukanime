package L;

import O.C0486d;
import O.C0510p;

/* renamed from: L.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0360d0 extends kotlin.jvm.internal.m implements e4.n {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a0.q f5492l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f5493m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f5494n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f5495o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f5496p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0360d0(a0.q qVar, float f5, long j7, int i7, int i8) {
        super(2);
        this.f5492l = qVar;
        this.f5493m = f5;
        this.f5494n = j7;
        this.f5495o = i7;
        this.f5496p = i8;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iV = C0486d.V(this.f5495o | 1);
        a0.q qVar = this.f5492l;
        E0.e(qVar, this.f5493m, this.f5494n, (C0510p) obj, iV, this.f5496p);
        return O3.C.a;
    }
}
