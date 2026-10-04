package L;

import M.C0460s;

/* loaded from: classes.dex */
public final class Y0 extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f5426k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0390k2 f5427l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f5428m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y0(C0390k2 c0390k2, float f5, S3.c cVar) {
        super(2, cVar);
        this.f5427l = c0390k2;
        this.f5428m = f5;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new Y0(this.f5427l, this.f5428m, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((Y0) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objB;
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f5426k;
        O3.C c2 = O3.C.a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P3.r.Y(obj);
            return c2;
        }
        P3.r.Y(obj);
        this.f5426k = 1;
        C0460s c0460s = this.f5427l.f5637b;
        Object value = c0460s.f6337g.getValue();
        float f5 = c0460s.f();
        float f7 = this.f5428m;
        Object objC = c0460s.c(f5, f7, value);
        if (!((Boolean) c0460s.f6334d.invoke(objC)).booleanValue() ? (objB = androidx.compose.material3.internal.a.b(c0460s, value, f7, this)) != aVar : (objB = androidx.compose.material3.internal.a.b(c0460s, objC, f7, this)) != aVar) {
            objB = c2;
        }
        if (objB != aVar) {
            objB = c2;
        }
        return objB == aVar ? aVar : c2;
    }
}
