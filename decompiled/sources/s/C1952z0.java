package s;

/* renamed from: s.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1952z0 extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public D0 f15416k;

    /* renamed from: l, reason: collision with root package name */
    public kotlin.jvm.internal.w f15417l;

    /* renamed from: m, reason: collision with root package name */
    public long f15418m;

    /* renamed from: n, reason: collision with root package name */
    public int f15419n;

    /* renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f15420o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ D0 f15421p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.w f15422q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f15423r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1952z0(D0 d02, kotlin.jvm.internal.w wVar, long j7, S3.c cVar) {
        super(2, cVar);
        this.f15421p = d02;
        this.f15422q = wVar;
        this.f15423r = j7;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        C1952z0 c1952z0 = new C1952z0(this.f15421p, this.f15422q, this.f15423r, cVar);
        c1952z0.f15420o = obj;
        return c1952z0;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1952z0) create((A0) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        D0 d02;
        kotlin.jvm.internal.w wVar;
        long j7;
        D0 d03;
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f15419n;
        EnumC1903a0 enumC1903a0 = EnumC1903a0.f15260l;
        if (i7 == 0) {
            P3.r.Y(obj);
            A0 a02 = (A0) this.f15420o;
            d02 = this.f15421p;
            C1950y0 c1950y0 = new C1950y0(d02, a02);
            X x7 = d02.f15099c;
            wVar = this.f15422q;
            long j8 = wVar.f12719k;
            EnumC1903a0 enumC1903a02 = d02.f15100d;
            long j9 = this.f15423r;
            float fC = d02.c(enumC1903a02 == enumC1903a0 ? T0.o.b(j9) : T0.o.c(j9));
            this.f15420o = d02;
            this.f15416k = d02;
            this.f15417l = wVar;
            this.f15418m = j8;
            this.f15419n = 1;
            obj = x7.a(c1950y0, fC, this);
            if (obj == aVar) {
                return aVar;
            }
            j7 = j8;
            d03 = d02;
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j7 = this.f15418m;
            wVar = this.f15417l;
            d02 = this.f15416k;
            d03 = (D0) this.f15420o;
            P3.r.Y(obj);
        }
        float fC2 = d03.c(((Number) obj).floatValue());
        wVar.f12719k = d02.f15100d == enumC1903a0 ? T0.o.a(j7, fC2, 0.0f, 2) : T0.o.a(j7, 0.0f, fC2, 1);
        return O3.C.a;
    }
}
