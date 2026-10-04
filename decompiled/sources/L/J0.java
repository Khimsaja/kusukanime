package L;

import android.window.BackEvent;
import p.C1743c;

/* loaded from: classes.dex */
public final class J0 extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f5142k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1743c f5143l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ BackEvent f5144m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J0(C1743c c1743c, BackEvent backEvent, S3.c cVar) {
        super(2, cVar);
        this.f5143l = c1743c;
        this.f5144m = backEvent;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new J0(this.f5143l, this.f5144m, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((J0) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f5142k;
        if (i7 == 0) {
            P3.r.Y(obj);
            Float f5 = new Float(M.H.a.b(this.f5144m.getProgress()));
            this.f5142k = 1;
            if (this.f5143l.e(this, f5) == aVar) {
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
