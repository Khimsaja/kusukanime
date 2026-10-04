package t3;

import H5.A;
import H5.D;
import O3.C;
import P3.r;
import android.content.Context;
import androidx.lifecycle.J;
import java.util.Collection;

/* renamed from: t3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2045c extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C2047e f15978k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Context f15979l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2045c(C2047e c2047e, Context context, S3.c cVar) {
        super(2, cVar);
        this.f15978k = c2047e;
        this.f15979l = context;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new C2045c(this.f15978k, this.f15979l, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        C2045c c2045c = (C2045c) create((A) obj, (S3.c) obj2);
        C c2 = C.a;
        c2045c.invokeSuspend(c2);
        return c2;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        r.Y(obj);
        C2047e c2047e = this.f15978k;
        c2047e.getClass();
        Context context = this.f15979l;
        kotlin.jvm.internal.l.f("c", context);
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null && ((Collection) c2047e.f15984b.getValue()).isEmpty()) {
            D.x(J.h(c2047e), null, new C2046d(c2047e, applicationContext, null), 3);
        }
        return C.a;
    }
}
