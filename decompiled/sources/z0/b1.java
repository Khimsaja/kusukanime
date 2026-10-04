package z0;

import O.C0513q0;
import O.C0522v0;
import android.view.View;
import com.kusukanime.R;

/* loaded from: classes.dex */
public final class b1 extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f18735k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0522v0 f18736l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ View f18737m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(C0522v0 c0522v0, View view, S3.c cVar) {
        super(2, cVar);
        this.f18736l = c0522v0;
        this.f18737m = view;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new b1(this.f18736l, this.f18737m, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((b1) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f18735k;
        O3.C c2 = O3.C.a;
        C0522v0 c0522v0 = this.f18736l;
        View view = this.f18737m;
        try {
            if (i7 == 0) {
                P3.r.Y(obj);
                this.f18735k = 1;
                Object objI = K5.N.i(c0522v0.f7237r, new C0513q0(2, null), this);
                if (objI != aVar) {
                    objI = c2;
                }
                if (objI == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                P3.r.Y(obj);
            }
            if (k1.b(view) == c0522v0) {
                view.setTag(R.id.androidx_compose_ui_view_composition_context, null);
            }
            return c2;
        } finally {
            if (k1.b(view) == c0522v0) {
                view.setTag(R.id.androidx_compose_ui_view_composition_context, null);
            }
        }
    }
}
