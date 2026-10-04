package s;

import p.AbstractC1745d;

/* renamed from: s.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1923k0 extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f15323k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f15324l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ D0 f15325m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f15326n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.u f15327o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1923k0(D0 d02, long j7, kotlin.jvm.internal.u uVar, S3.c cVar) {
        super(2, cVar);
        this.f15325m = d02;
        this.f15326n = j7;
        this.f15327o = uVar;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        C1923k0 c1923k0 = new C1923k0(this.f15325m, this.f15326n, this.f15327o, cVar);
        c1923k0.f15324l = obj;
        return c1923k0;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1923k0) create((A0) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f15323k;
        if (i7 == 0) {
            P3.r.Y(obj);
            A0 a02 = (A0) this.f15324l;
            D0 d02 = this.f15325m;
            float f5 = d02.f(this.f15326n);
            D.K k7 = new D.K(this.f15327o, d02, a02, 5);
            this.f15323k = 1;
            if (AbstractC1745d.e(0.0f, f5, null, k7, this, 12) == aVar) {
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
