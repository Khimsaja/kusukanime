package s;

import f6.AbstractC0915m;
import s0.C1955C;

/* loaded from: classes.dex */
public final class M0 extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f15173k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f15174l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1955C f15175m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ U3.j f15176n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.m f15177o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C1909d0 f15178p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public M0(C1955C c1955c, e4.o oVar, e4.k kVar, C1909d0 c1909d0, S3.c cVar) {
        super(2, cVar);
        this.f15175m = c1955c;
        this.f15176n = (U3.j) oVar;
        this.f15177o = (kotlin.jvm.internal.m) kVar;
        this.f15178p = c1909d0;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [U3.j, e4.o] */
    /* JADX WARN: Type inference failed for: r3v0, types: [e4.k, kotlin.jvm.internal.m] */
    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        ?? r32 = this.f15177o;
        C1909d0 c1909d0 = this.f15178p;
        M0 m02 = new M0(this.f15175m, this.f15176n, r32, c1909d0, cVar);
        m02.f15174l = obj;
        return m02;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((M0) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [U3.j, e4.o] */
    /* JADX WARN: Type inference failed for: r6v0, types: [e4.k, kotlin.jvm.internal.m] */
    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f15173k;
        if (i7 == 0) {
            P3.r.Y(obj);
            L0 l02 = new L0((H5.A) this.f15174l, this.f15176n, this.f15177o, this.f15178p, null);
            this.f15173k = 1;
            if (AbstractC0915m.f(this.f15175m, l02, this) == aVar) {
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
