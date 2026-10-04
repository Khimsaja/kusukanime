package L;

import s0.C1955C;

/* renamed from: L.m2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0398m2 extends U3.j implements e4.n {
    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new C0398m2(2, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        C0398m2 c0398m2 = (C0398m2) create((C1955C) obj, (S3.c) obj2);
        O3.C c2 = O3.C.a;
        c0398m2.invokeSuspend(c2);
        return c2;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        P3.r.Y(obj);
        return O3.C.a;
    }
}
