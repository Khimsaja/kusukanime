package O;

/* renamed from: O.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0513q0 extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f7161k;

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        C0513q0 c0513q0 = new C0513q0(2, cVar);
        c0513q0.f7161k = obj;
        return c0513q0;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0513q0) create((EnumC0511p0) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        P3.r.Y(obj);
        return Boolean.valueOf(((EnumC0511p0) this.f7161k) == EnumC0511p0.f7154k);
    }
}
