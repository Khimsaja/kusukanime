package E0;

import H5.A;
import O3.C;
import P3.r;
import e4.n;

/* loaded from: classes.dex */
public final class a extends U3.j implements n {

    /* renamed from: k, reason: collision with root package name */
    public int f1791k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f1792l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Runnable f1793m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(f fVar, Runnable runnable, S3.c cVar) {
        super(2, cVar);
        this.f1792l = fVar;
        this.f1793m = runnable;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new a(this.f1792l, this.f1793m, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((A) obj, (S3.c) obj2)).invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f1791k;
        f fVar = this.f1792l;
        C c2 = C.a;
        if (i7 == 0) {
            r.Y(obj);
            j jVar = fVar.f1817e;
            this.f1791k = 1;
            Object objB = jVar.b(0.0f - jVar.f1824b, this);
            if (objB != aVar) {
                objB = c2;
            }
            if (objB == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.Y(obj);
        }
        l lVar = fVar.f1815c;
        lVar.a.setValue(Boolean.FALSE);
        this.f1793m.run();
        return c2;
    }
}
