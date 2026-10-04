package B3;

import H5.D;
import K5.Y;
import android.content.Context;
import androidx.lifecycle.J;
import com.kusukanime.data.CrashLog;

/* loaded from: classes.dex */
public final class w extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C f539k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Context f540l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(C c2, Context context, S3.c cVar) {
        super(2, cVar);
        this.f539k = c2;
        this.f540l = context;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new w(this.f539k, this.f540l, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        w wVar = (w) create((H5.A) obj, (S3.c) obj2);
        O3.C c2 = O3.C.a;
        wVar.invokeSuspend(c2);
        return c2;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        P3.r.Y(obj);
        C c2 = this.f539k;
        c2.getClass();
        Context context = this.f540l;
        kotlin.jvm.internal.l.f("ctx", context);
        c2.f435l = context.getApplicationContext();
        D.x(J.h(c2), null, new B(c2, null), 3);
        Context context2 = c2.f435l;
        if (context2 != null) {
            Integer numValueOf = Integer.valueOf(CrashLog.INSTANCE.list(context2).size());
            Y y7 = c2.f433j;
            y7.getClass();
            y7.i(null, numValueOf);
        }
        return O3.C.a;
    }
}
