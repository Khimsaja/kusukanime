package x3;

import H5.A;
import H5.D;
import O3.C;
import P3.r;
import U3.j;
import android.content.Context;
import androidx.lifecycle.J;
import e4.n;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class c extends j implements n {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ h f17314k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Context f17315l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(S3.c cVar, Context context, h hVar) {
        super(2, cVar);
        this.f17314k = hVar;
        this.f17315l = context;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new c(cVar, this.f17315l, this.f17314k);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        c cVar = (c) create((A) obj, (S3.c) obj2);
        C c2 = C.a;
        cVar.invokeSuspend(c2);
        return c2;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        r.Y(obj);
        h hVar = this.f17314k;
        Context context = this.f17315l;
        l.f("ctx", context);
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            D.x(J.h(hVar), null, new e(null, applicationContext, hVar), 3);
        }
        return C.a;
    }
}
