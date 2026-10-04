package p3;

import H5.A;
import O3.C;
import P3.r;
import U3.j;
import android.content.Context;
import e4.n;
import kotlin.jvm.internal.l;

/* renamed from: p3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1783a extends j implements n {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C1789g f14342k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Context f14343l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1783a(C1789g c1789g, Context context, S3.c cVar) {
        super(2, cVar);
        this.f14342k = c1789g;
        this.f14343l = context;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new C1783a(this.f14342k, this.f14343l, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        C1783a c1783a = (C1783a) create((A) obj, (S3.c) obj2);
        C c2 = C.a;
        c1783a.invokeSuspend(c2);
        return c2;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        r.Y(obj);
        C1789g c1789g = this.f14342k;
        c1789g.getClass();
        Context context = this.f14343l;
        l.f("ctx", context);
        c1789g.f14353e = context.getApplicationContext();
        return C.a;
    }
}
