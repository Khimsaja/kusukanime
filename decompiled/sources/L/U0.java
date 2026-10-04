package L;

/* loaded from: classes.dex */
public final class U0 extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f5362k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0390k2 f5363l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U0(C0390k2 c0390k2, S3.c cVar) {
        super(2, cVar);
        this.f5363l = c0390k2;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new U0(this.f5363l, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((U0) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Map] */
    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f5362k;
        O3.C c2 = O3.C.a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P3.r.Y(obj);
            return c2;
        }
        P3.r.Y(obj);
        this.f5362k = 1;
        C0390k2 c0390k2 = this.f5363l;
        M.B bD = c0390k2.f5637b.d();
        EnumC0394l2 enumC0394l2 = EnumC0394l2.f5651m;
        if (!bD.a.containsKey(enumC0394l2)) {
            enumC0394l2 = EnumC0394l2.f5650l;
        }
        Object objA = C0390k2.a(c0390k2, enumC0394l2, this);
        if (objA != aVar) {
            objA = c2;
        }
        return objA == aVar ? aVar : c2;
    }
}
