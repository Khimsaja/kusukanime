package w;

import H5.A;
import O3.C;
import p.AbstractC1745d;
import p.C1752g0;
import p.C1761m;
import p.m0;

/* loaded from: classes.dex */
public final class s extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f16786k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ u f16787l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(u uVar, S3.c cVar) {
        super(2, cVar);
        this.f16787l = uVar;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new s(this.f16787l, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((s) create((A) obj, (S3.c) obj2)).invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f16786k;
        if (i7 == 0) {
            P3.r.Y(obj);
            C1761m c1761m = this.f16787l.f16811v;
            Float f5 = new Float(0.0f);
            C1752g0 c1752g0P = AbstractC1745d.p(1, new Float(0.5f));
            this.f16786k = 1;
            if (AbstractC1745d.h(c1761m, f5, c1752g0P, true, m0.f14060m, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P3.r.Y(obj);
        }
        return C.a;
    }
}
