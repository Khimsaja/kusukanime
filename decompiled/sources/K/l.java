package K;

import p.A0;
import p.AbstractC1714A;
import p.AbstractC1745d;
import p.C1743c;

/* loaded from: classes.dex */
public final class l extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f4393k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p f4394l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p pVar, S3.c cVar) {
        super(2, cVar);
        this.f4394l = pVar;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new l(this.f4394l, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f4393k;
        if (i7 == 0) {
            P3.r.Y(obj);
            C1743c c1743c = this.f4394l.f4407h;
            Float f5 = new Float(1.0f);
            A0 a0Q = AbstractC1745d.q(225, 0, AbstractC1714A.f13835c, 2);
            this.f4393k = 1;
            if (C1743c.c(c1743c, f5, a0Q, this, 12) == aVar) {
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
