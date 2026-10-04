package D;

import s.c1;
import s0.C1955C;

/* loaded from: classes.dex */
public final class O extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f1082k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1955C f1083l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ H.S f1084m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(C1955C c1955c, H.S s7, S3.c cVar) {
        super(2, cVar);
        this.f1083l = c1955c;
        this.f1084m = s7;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new O(this.f1083l, this.f1084m, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((O) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f1082k;
        if (i7 == 0) {
            P3.r.Y(obj);
            C0074s c0074s = new C0074s(this.f1084m, 1);
            this.f1082k = 1;
            if (c1.d(this.f1083l, null, c0074s, this, 7) == aVar) {
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
