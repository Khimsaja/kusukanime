package s;

import O.C0486d;
import O.C0493g0;

/* loaded from: classes.dex */
public final class r implements InterfaceC1946w0 {
    public final kotlin.jvm.internal.m a;

    /* renamed from: b, reason: collision with root package name */
    public final C1934q f15371b = new C1934q(this);

    /* renamed from: c, reason: collision with root package name */
    public final q.a0 f15372c = new q.a0();

    /* renamed from: d, reason: collision with root package name */
    public final C0493g0 f15373d;

    /* renamed from: e, reason: collision with root package name */
    public final C0493g0 f15374e;

    /* renamed from: f, reason: collision with root package name */
    public final C0493g0 f15375f;

    /* JADX WARN: Multi-variable type inference failed */
    public r(e4.k kVar) {
        this.a = (kotlin.jvm.internal.m) kVar;
        Boolean bool = Boolean.FALSE;
        O.T t7 = O.T.f7049p;
        this.f15373d = C0486d.K(bool, t7);
        this.f15374e = C0486d.K(bool, t7);
        this.f15375f = C0486d.K(bool, t7);
    }

    @Override // s.InterfaceC1946w0
    public final boolean b() {
        return ((Boolean) this.f15373d.getValue()).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [e4.k, kotlin.jvm.internal.m] */
    @Override // s.InterfaceC1946w0
    public final float d(float f5) {
        return ((Number) this.a.invoke(Float.valueOf(f5))).floatValue();
    }

    @Override // s.InterfaceC1946w0
    public final Object e(q.X x7, e4.n nVar, S3.c cVar) {
        Object objJ = H5.D.j(new C1932p(this, x7, nVar, null), cVar);
        return objJ == T3.a.f9048k ? objJ : O3.C.a;
    }
}
