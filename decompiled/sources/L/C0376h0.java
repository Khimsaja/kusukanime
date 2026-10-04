package L;

import O.C0486d;
import O.C0510p;
import n0.C1538e;

/* renamed from: L.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0376h0 extends kotlin.jvm.internal.m implements e4.n {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1538e f5587l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f5588m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ a0.q f5589n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f5590o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f5591p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f5592q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0376h0(C1538e c1538e, String str, a0.q qVar, long j7, int i7, int i8) {
        super(2);
        this.f5587l = c1538e;
        this.f5588m = str;
        this.f5589n = qVar;
        this.f5590o = j7;
        this.f5591p = i7;
        this.f5592q = i8;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iV = C0486d.V(this.f5591p | 1);
        String str = this.f5588m;
        AbstractC0384j0.a(this.f5587l, str, this.f5589n, this.f5590o, (C0510p) obj, iV, this.f5592q);
        return O3.C.a;
    }
}
