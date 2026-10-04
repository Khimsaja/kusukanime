package s3;

import android.content.Context;

/* loaded from: classes.dex */
public final class x extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f15807k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ N f15808l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Context f15809m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f15810n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(boolean z7, N n7, Context context, String str, S3.c cVar) {
        super(2, cVar);
        this.f15807k = z7;
        this.f15808l = n7;
        this.f15809m = context;
        this.f15810n = str;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new x(this.f15807k, this.f15808l, this.f15809m, this.f15810n, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        x xVar = (x) create((H5.A) obj, (S3.c) obj2);
        O3.C c2 = O3.C.a;
        xVar.invokeSuspend(c2);
        return c2;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        P3.r.Y(obj);
        if (!this.f15807k) {
            N n7 = this.f15808l;
            n7.getClass();
            Context context = this.f15809m;
            kotlin.jvm.internal.l.f("ctx", context);
            Context applicationContext = context.getApplicationContext();
            n7.f15606h = applicationContext;
            String str = this.f15810n;
            if (applicationContext != null) {
                H5.D.x(androidx.lifecycle.J.h(n7), null, new L(n7, applicationContext, str, null), 3);
            }
            H5.D.x(androidx.lifecycle.J.h(n7), null, new M(n7, str, null), 3);
        }
        return O3.C.a;
    }
}
