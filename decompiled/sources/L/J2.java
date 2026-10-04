package L;

import p.C1743c;
import p.InterfaceC1760l;

/* loaded from: classes.dex */
public final class J2 extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f5153k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ L2 f5154l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f5155m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J2(L2 l22, float f5, S3.c cVar) {
        super(2, cVar);
        this.f5154l = l22;
        this.f5155m = f5;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new J2(this.f5154l, this.f5155m, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((J2) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f5153k;
        if (i7 == 0) {
            P3.r.Y(obj);
            L2 l22 = this.f5154l;
            C1743c c1743c = l22.f5193A;
            if (c1743c != null) {
                Float f5 = new Float(this.f5155m);
                InterfaceC1760l interfaceC1760l = l22.f5199z ? androidx.compose.material3.a.f10643f : androidx.compose.material3.a.f10644g;
                this.f5153k = 1;
                obj = C1743c.c(c1743c, f5, interfaceC1760l, this, 12);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return O3.C.a;
        }
        if (i7 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        P3.r.Y(obj);
        return O3.C.a;
    }
}
