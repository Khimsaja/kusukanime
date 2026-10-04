package L;

/* loaded from: classes.dex */
public final class Z0 extends U3.j implements e4.o {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ float f5431k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e4.k f5432l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z0(e4.k kVar, S3.c cVar) {
        super(3, cVar);
        this.f5432l = kVar;
    }

    @Override // e4.o
    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        float fFloatValue = ((Number) obj2).floatValue();
        Z0 z02 = new Z0(this.f5432l, (S3.c) obj3);
        z02.f5431k = fFloatValue;
        O3.C c2 = O3.C.a;
        z02.invokeSuspend(c2);
        return c2;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        P3.r.Y(obj);
        this.f5432l.invoke(new Float(this.f5431k));
        return O3.C.a;
    }
}
