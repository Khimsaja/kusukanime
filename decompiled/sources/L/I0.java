package L;

import android.window.BackEvent;
import p.C1743c;

/* loaded from: classes.dex */
public final class I0 extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f5119k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1743c f5120l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ BackEvent f5121m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I0(C1743c c1743c, BackEvent backEvent, S3.c cVar) {
        super(2, cVar);
        this.f5120l = c1743c;
        this.f5121m = backEvent;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new I0(this.f5120l, this.f5121m, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((I0) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f5119k;
        if (i7 == 0) {
            P3.r.Y(obj);
            Float f5 = new Float(M.H.a.b(this.f5121m.getProgress()));
            this.f5119k = 1;
            if (this.f5120l.e(this, f5) == aVar) {
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
