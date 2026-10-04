package o3;

import G2.E;
import H5.A;
import O3.C;
import P3.r;
import e4.n;

/* renamed from: o3.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1645l extends U3.j implements n {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f13623k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ E f13624l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1645l(E e7, S3.c cVar, String str) {
        super(2, cVar);
        this.f13623k = str;
        this.f13624l = e7;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new C1645l(this.f13624l, cVar, this.f13623k);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        C1645l c1645l = (C1645l) create((A) obj, (S3.c) obj2);
        C c2 = C.a;
        c1645l.invokeSuspend(c2);
        return c2;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        r.Y(obj);
        String str = this.f13623k;
        if (str != null) {
            E.m(this.f13624l, "detail/".concat(str), null, 6);
        }
        return C.a;
    }
}
