package K;

import p.A0;
import p.C1743c;

/* loaded from: classes.dex */
public final class C extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f4350k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ F1.m f4351l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ A0 f4352m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(F1.m mVar, A0 a02, S3.c cVar) {
        super(2, cVar);
        this.f4351l = mVar;
        this.f4352m = a02;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new C(this.f4351l, this.f4352m, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f4350k;
        if (i7 == 0) {
            P3.r.Y(obj);
            C1743c c1743c = (C1743c) this.f4351l.f2206c;
            Float f5 = new Float(0.0f);
            this.f4350k = 1;
            if (C1743c.c(c1743c, f5, this.f4352m, this, 12) == aVar) {
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
