package s;

/* loaded from: classes.dex */
public final class V extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f15221k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f15222l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ W f15223m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f15224n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(W w7, long j7, S3.c cVar) {
        super(2, cVar);
        this.f15223m = w7;
        this.f15224n = j7;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        V v5 = new V(this.f15223m, this.f15224n, cVar);
        v5.f15222l = obj;
        return v5;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((V) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f15221k;
        if (i7 == 0) {
            P3.r.Y(obj);
            H5.A a = (H5.A) this.f15222l;
            W w7 = this.f15223m;
            e4.o oVar = w7.f15231L;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (this.f15224n >> 32)) * 1.0f;
            long jFloatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (r5 & 4294967295L)) * 1.0f) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
            EnumC1903a0 enumC1903a0 = w7.I;
            Q q6 = S.a;
            Float f5 = new Float(enumC1903a0 == EnumC1903a0.f15259k ? T0.o.c(jFloatToRawIntBits) : T0.o.b(jFloatToRawIntBits));
            this.f15221k = 1;
            if (oVar.invoke(a, f5, this) == aVar) {
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
