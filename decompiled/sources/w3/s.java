package w3;

import H5.A;
import O3.C;
import android.content.Context;

/* loaded from: classes.dex */
public final class s extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ y f17056k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Context f17057l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(y yVar, Context context, S3.c cVar) {
        super(2, cVar);
        this.f17056k = yVar;
        this.f17057l = context;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new s(this.f17056k, this.f17057l, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        s sVar = (s) create((A) obj, (S3.c) obj2);
        C c2 = C.a;
        sVar.invokeSuspend(c2);
        return c2;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        P3.r.Y(obj);
        y yVar = this.f17056k;
        yVar.getClass();
        Context context = this.f17057l;
        kotlin.jvm.internal.l.f("ctx", context);
        yVar.f17091s = context.getApplicationContext();
        yVar.e();
        return C.a;
    }
}
