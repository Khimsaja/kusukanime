package z3;

import H5.A;
import H5.D;
import O3.C;
import P3.r;
import U3.j;
import android.content.Context;
import androidx.lifecycle.J;
import e4.n;
import java.util.List;
import kotlin.jvm.internal.l;

/* renamed from: z3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2486b extends j implements n {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C2488d f19017k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Context f19018l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2486b(C2488d c2488d, Context context, S3.c cVar) {
        super(2, cVar);
        this.f19017k = c2488d;
        this.f19018l = context;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new C2486b(this.f19017k, this.f19018l, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        C2486b c2486b = (C2486b) create((A) obj, (S3.c) obj2);
        C c2 = C.a;
        c2486b.invokeSuspend(c2);
        return c2;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Context context;
        T3.a aVar = T3.a.f9048k;
        r.Y(obj);
        C2488d c2488d = this.f19017k;
        c2488d.getClass();
        Context context2 = this.f19018l;
        l.f("ctx", context2);
        c2488d.f19029h = context2.getApplicationContext();
        if (((List) c2488d.f19024c.getValue()).isEmpty() && (context = c2488d.f19029h) != null) {
            D.x(J.h(c2488d), null, new C2487c(c2488d, context, null), 3);
        }
        return C.a;
    }
}
