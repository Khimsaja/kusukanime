package d;

import O3.C;
import P3.r;
import e4.o;
import kotlin.jvm.internal.t;

/* renamed from: d.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0776j extends U3.j implements o {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ t f11182k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0776j(t tVar, S3.c cVar) {
        super(3, cVar);
        this.f11182k = tVar;
    }

    @Override // e4.o
    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        C0776j c0776j = new C0776j(this.f11182k, (S3.c) obj3);
        C c2 = C.a;
        c0776j.invokeSuspend(c2);
        return c2;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        r.Y(obj);
        this.f11182k.f12716k = true;
        return C.a;
    }
}
