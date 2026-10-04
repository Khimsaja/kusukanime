package L;

import O.C0486d;
import O.C0510p;
import n0.C1532C;

/* renamed from: L.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0380i0 extends kotlin.jvm.internal.m implements e4.n {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1532C f5604l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f5605m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ a0.q f5606n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f5607o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f5608p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0380i0(C1532C c1532c, String str, a0.q qVar, long j7, int i7) {
        super(2);
        this.f5604l = c1532c;
        this.f5605m = str;
        this.f5606n = qVar;
        this.f5607o = j7;
        this.f5608p = i7;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        AbstractC0384j0.b(this.f5604l, this.f5605m, this.f5606n, this.f5607o, (C0510p) obj, C0486d.V(this.f5608p | 1));
        return O3.C.a;
    }
}
