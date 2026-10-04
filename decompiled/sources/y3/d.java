package y3;

import O.C0486d;
import android.view.Window;
import s3.T;

/* loaded from: classes.dex */
public final class d extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f18248k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Window f18249l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Window window, S3.c cVar) {
        super(2, cVar);
        this.f18249l = window;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new d(this.f18249l, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f18248k;
        if (i7 == 0) {
            P3.r.Y(obj);
            T t7 = new T(12);
            this.f18248k = 1;
            if (C0486d.F(getContext()).P(t7, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P3.r.Y(obj);
        }
        Window window = this.f18249l;
        if (window != null) {
            AbstractC2412a.b(window);
        }
        return O3.C.a;
    }
}
