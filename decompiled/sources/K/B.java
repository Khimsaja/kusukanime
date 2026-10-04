package K;

import p.A0;
import p.C1743c;

/* loaded from: classes.dex */
public final class B extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f4346k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ F1.m f4347l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f4348m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ A0 f4349n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(F1.m mVar, float f5, A0 a02, S3.c cVar) {
        super(2, cVar);
        this.f4347l = mVar;
        this.f4348m = f5;
        this.f4349n = a02;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new B(this.f4347l, this.f4348m, this.f4349n, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((B) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f4346k;
        if (i7 == 0) {
            P3.r.Y(obj);
            C1743c c1743c = (C1743c) this.f4347l.f2206c;
            Float f5 = new Float(this.f4348m);
            this.f4346k = 1;
            if (C1743c.c(c1743c, f5, this.f4349n, this, 12) == aVar) {
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
