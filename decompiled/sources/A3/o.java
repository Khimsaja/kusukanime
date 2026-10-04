package A3;

import H5.D;
import O3.C;
import android.content.Context;
import androidx.lifecycle.J;
import com.kusukanime.data.SearchHistory;

/* loaded from: classes.dex */
public final class o extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ B f172k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Context f173l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(B b4, Context context, S3.c cVar) {
        super(2, cVar);
        this.f172k = b4;
        this.f173l = context;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new o(this.f172k, this.f173l, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        o oVar = (o) create((H5.A) obj, (S3.c) obj2);
        C c2 = C.a;
        oVar.invokeSuspend(c2);
        return c2;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        P3.r.Y(obj);
        B b4 = this.f172k;
        b4.getClass();
        Context context = this.f173l;
        kotlin.jvm.internal.l.f("ctx", context);
        Context applicationContext = context.getApplicationContext();
        b4.f130n = applicationContext;
        SearchHistory searchHistory = SearchHistory.INSTANCE;
        kotlin.jvm.internal.l.c(applicationContext);
        b4.f124h.h(searchHistory.list(applicationContext));
        D.x(J.h(b4), null, new y(b4, null), 3);
        return C.a;
    }
}
