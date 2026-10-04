package s;

import e5.AbstractC0832b;

/* renamed from: s.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1940t0 extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f15381k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1944v0 f15382l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f15383m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f15384n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1940t0(C1944v0 c1944v0, float f5, float f7, S3.c cVar) {
        super(2, cVar);
        this.f15382l = c1944v0;
        this.f15383m = f5;
        this.f15384n = f7;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new C1940t0(this.f15382l, this.f15383m, this.f15384n, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1940t0) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f15381k;
        if (i7 == 0) {
            P3.r.Y(obj);
            D0 d02 = this.f15382l.f15391M;
            long jE = AbstractC0832b.e(this.f15383m, this.f15384n);
            this.f15381k = 1;
            if (androidx.compose.foundation.gestures.a.a(d02, jE, this) == aVar) {
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
