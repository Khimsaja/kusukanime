package s;

/* renamed from: s.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1933p0 extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f15366k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f15367l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1933p0(long j7, S3.c cVar) {
        super(2, cVar);
        this.f15367l = j7;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        C1933p0 c1933p0 = new C1933p0(this.f15367l, cVar);
        c1933p0.f15366k = obj;
        return c1933p0;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        C1933p0 c1933p0 = (C1933p0) create((A0) obj, (S3.c) obj2);
        O3.C c2 = O3.C.a;
        c1933p0.invokeSuspend(c2);
        return c2;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        P3.r.Y(obj);
        D0 d02 = ((A0) this.f15366k).a;
        D0.a(d02, d02.f15104h, this.f15367l, 1);
        return O3.C.a;
    }
}
