package t3;

import H5.A;
import H5.D;
import O3.C;
import P3.r;
import android.content.Context;
import androidx.lifecycle.J;

/* loaded from: classes.dex */
public final class h extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p f15998k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Context f15999l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(p pVar, Context context, S3.c cVar) {
        super(2, cVar);
        this.f15998k = pVar;
        this.f15999l = context;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new h(this.f15998k, this.f15999l, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        h hVar = (h) create((A) obj, (S3.c) obj2);
        C c2 = C.a;
        hVar.invokeSuspend(c2);
        return c2;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        r.Y(obj);
        p pVar = this.f15998k;
        pVar.getClass();
        Context context = this.f15999l;
        kotlin.jvm.internal.l.f("ctx", context);
        Context applicationContext = context.getApplicationContext();
        pVar.f16030j = applicationContext;
        if (applicationContext != null) {
            D.x(J.h(pVar), null, new n(pVar, applicationContext, null), 3);
        }
        return C.a;
    }
}
