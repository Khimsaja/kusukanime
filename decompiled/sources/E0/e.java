package E0;

import O3.C;
import P3.r;
import e4.n;
import e5.AbstractC0832b;
import f6.AbstractC0905c;

/* loaded from: classes.dex */
public final class e extends U3.j implements n {

    /* renamed from: k, reason: collision with root package name */
    public int f1811k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ float f1812l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f f1813m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, S3.c cVar) {
        super(2, cVar);
        this.f1813m = fVar;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        e eVar = new e(this.f1813m, cVar);
        eVar.f1812l = ((Number) obj).floatValue();
        return eVar;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create(Float.valueOf(((Number) obj).floatValue()), (S3.c) obj2)).invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f1811k;
        if (i7 == 0) {
            r.Y(obj);
            float f5 = this.f1812l;
            f fVar = this.f1813m;
            Object obj2 = fVar.a.f2104d.f2096k.get(F0.h.f2074e);
            if (obj2 == null) {
                obj2 = null;
            }
            n nVar = (n) obj2;
            if (nVar == null) {
                AbstractC0905c.D("Required value was null.");
                throw null;
            }
            g0.c cVar = new g0.c(AbstractC0832b.e(0.0f, f5));
            this.f1811k = 1;
            obj = nVar.invoke(cVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.Y(obj);
        }
        return new Float(g0.c.e(((g0.c) obj).a));
    }
}
