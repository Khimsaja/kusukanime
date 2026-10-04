package s3;

import K5.Y;
import O.Z;
import y3.AbstractC2413b;

/* renamed from: s3.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1992I extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Z f15574k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1992I(Z z7, S3.c cVar) {
        super(2, cVar);
        this.f15574k = z7;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new C1992I(this.f15574k, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        C1992I c1992i = (C1992I) create((H5.A) obj, (S3.c) obj2);
        O3.C c2 = O3.C.a;
        c1992i.invokeSuspend(c2);
        return c2;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        P3.r.Y(obj);
        Y y7 = AbstractC2413b.a;
        Boolean bool = (Boolean) this.f15574k.getValue();
        bool.booleanValue();
        Y y8 = AbstractC2413b.a;
        y8.getClass();
        y8.i(null, bool);
        return O3.C.a;
    }
}
