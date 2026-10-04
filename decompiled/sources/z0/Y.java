package z0;

import android.view.Choreographer;

/* loaded from: classes.dex */
public final class Y extends U3.j implements e4.n {
    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new Y(2, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((Y) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        P3.r.Y(obj);
        return Choreographer.getInstance();
    }
}
