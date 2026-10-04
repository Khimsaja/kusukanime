package q;

import D.C0070p;
import K5.InterfaceC0329h;

/* renamed from: q.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1842y extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f14652k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1843z f14653l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1842y(C1843z c1843z, S3.c cVar) {
        super(2, cVar);
        this.f14653l = c1843z;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new C1842y(this.f14653l, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1842y) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f14652k;
        if (i7 == 0) {
            P3.r.Y(obj);
            kotlin.jvm.internal.v vVar = new kotlin.jvm.internal.v();
            kotlin.jvm.internal.v vVar2 = new kotlin.jvm.internal.v();
            kotlin.jvm.internal.v vVar3 = new kotlin.jvm.internal.v();
            C1843z c1843z = this.f14653l;
            InterfaceC0329h interfaceC0329hA = c1843z.f14655x.a();
            C0070p c0070p = new C0070p(vVar, vVar2, vVar3, c1843z, 2);
            this.f14652k = 1;
            if (interfaceC0329hA.collect(c0070p, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P3.r.Y(obj);
        }
        return O3.C.a;
    }
}
