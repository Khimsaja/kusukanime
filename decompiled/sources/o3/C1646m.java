package o3;

import G2.E;
import H5.A;
import O3.C;
import P3.r;
import e4.n;

/* renamed from: o3.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1646m extends U3.j implements n {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ E f13625k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f13626l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1646m(E e7, S3.c cVar, String str) {
        super(2, cVar);
        this.f13625k = e7;
        this.f13626l = str;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new C1646m(this.f13625k, cVar, this.f13626l);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        C1646m c1646m = (C1646m) create((A) obj, (S3.c) obj2);
        C c2 = C.a;
        c1646m.invokeSuspend(c2);
        return c2;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        r.Y(obj);
        this.f13625k.l("detail/" + this.f13626l, new io.ktor.network.sockets.b(25));
        return C.a;
    }
}
