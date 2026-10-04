package L;

import M.C0460s;

/* renamed from: L.b1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0353b1 extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f5460k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0390k2 f5461l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0353b1(C0390k2 c0390k2, S3.c cVar) {
        super(2, cVar);
        this.f5461l = c0390k2;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new C0353b1(this.f5461l, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0353b1) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f5460k;
        O3.C c2 = O3.C.a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P3.r.Y(obj);
            return c2;
        }
        P3.r.Y(obj);
        this.f5460k = 1;
        EnumC0394l2 enumC0394l2 = EnumC0394l2.f5650l;
        C0460s c0460s = this.f5461l.f5637b;
        Object objB = androidx.compose.material3.internal.a.b(c0460s, enumC0394l2, c0460s.f6341k.f(), this);
        if (objB != aVar) {
            objB = c2;
        }
        return objB == aVar ? aVar : c2;
    }
}
