package s;

/* renamed from: s.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1942u0 extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f15385k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ long f15386l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1944v0 f15387m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1942u0(C1944v0 c1944v0, S3.c cVar) {
        super(2, cVar);
        this.f15387m = c1944v0;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        C1942u0 c1942u0 = new C1942u0(this.f15387m, cVar);
        c1942u0.f15386l = ((g0.c) obj).a;
        return c1942u0;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        long j7 = ((g0.c) obj).a;
        C1942u0 c1942u0 = new C1942u0(this.f15387m, (S3.c) obj2);
        c1942u0.f15386l = j7;
        return c1942u0.invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f15385k;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P3.r.Y(obj);
            return obj;
        }
        P3.r.Y(obj);
        long j7 = this.f15386l;
        D0 d02 = this.f15387m.f15391M;
        this.f15385k = 1;
        Object objA = androidx.compose.foundation.gestures.a.a(d02, j7, this);
        return objA == aVar ? aVar : objA;
    }
}
