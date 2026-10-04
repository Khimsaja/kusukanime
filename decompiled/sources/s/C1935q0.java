package s;

/* renamed from: s.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1935q0 extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f15368k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1944v0 f15369l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f15370m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1935q0(C1944v0 c1944v0, long j7, S3.c cVar) {
        super(2, cVar);
        this.f15369l = c1944v0;
        this.f15370m = j7;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new C1935q0(this.f15369l, this.f15370m, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1935q0) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f15368k;
        if (i7 == 0) {
            P3.r.Y(obj);
            D0 d02 = this.f15369l.f15391M;
            q.X x7 = q.X.f14514l;
            C1933p0 c1933p0 = new C1933p0(this.f15370m, null);
            this.f15368k = 1;
            if (d02.e(x7, c1933p0, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P3.r.Y(obj);
        }
        return O3.C.a;
    }
}
