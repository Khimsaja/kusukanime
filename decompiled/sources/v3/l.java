package v3;

import H5.A;
import H5.D;
import K5.Y;
import O3.C;
import android.content.Context;
import androidx.lifecycle.J;
import java.util.List;

/* loaded from: classes.dex */
public final class l extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ z f16574k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Context f16575l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(S3.c cVar, Context context, z zVar) {
        super(2, cVar);
        this.f16574k = zVar;
        this.f16575l = context;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new l(cVar, this.f16575l, this.f16574k);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        l lVar = (l) create((A) obj, (S3.c) obj2);
        C c2 = C.a;
        lVar.invokeSuspend(c2);
        return c2;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        P3.r.Y(obj);
        z zVar = this.f16574k;
        zVar.getClass();
        Context context = this.f16575l;
        kotlin.jvm.internal.l.f("ctx", context);
        zVar.f16622j = context.getApplicationContext();
        if (((List) zVar.f16615c.getValue()).isEmpty()) {
            zVar.f16620h = 1;
            zVar.f16621i = false;
            P3.y yVar = P3.y.f7779k;
            Y y7 = zVar.f16614b;
            y7.getClass();
            y7.i(null, yVar);
            zVar.e();
        }
        Context context2 = zVar.f16622j;
        if (context2 != null) {
            D.x(J.h(zVar), null, new x(null, context2, zVar), 3);
        }
        zVar.f();
        Context context3 = zVar.f16622j;
        if (context3 != null) {
            D.x(J.h(zVar), null, new w(null, context3, zVar), 3);
        }
        Context context4 = zVar.f16622j;
        if (context4 != null) {
            D.x(J.h(zVar), null, new t(null, context4, zVar), 3);
        }
        Context context5 = zVar.f16622j;
        if (context5 != null) {
            D.x(J.h(zVar), null, new v(null, context5, zVar), 3);
        }
        return C.a;
    }
}
