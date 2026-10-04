package M;

import K5.C0327f;
import K5.C0332k;
import O.C0486d;
import e4.InterfaceC0821a;

/* renamed from: M.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0450h extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f6300k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f6301l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.m f6302m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ U3.j f6303n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0450h(InterfaceC0821a interfaceC0821a, e4.n nVar, S3.c cVar) {
        super(2, cVar);
        this.f6302m = (kotlin.jvm.internal.m) interfaceC0821a;
        this.f6303n = (U3.j) nVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [e4.a, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r2v0, types: [U3.j, e4.n] */
    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        C0450h c0450h = new C0450h(this.f6302m, this.f6303n, cVar);
        c0450h.f6301l = obj;
        return c0450h;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0450h) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [e4.a, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r5v0, types: [U3.j, e4.n] */
    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f6300k;
        if (i7 == 0) {
            P3.r.Y(obj);
            H5.A a = (H5.A) this.f6301l;
            kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
            C0332k c0332kS = C0486d.S(this.f6302m);
            C0327f c0327f = new C0327f(xVar, a, (e4.n) this.f6303n);
            this.f6300k = 1;
            if (c0332kS.collect(c0327f, this) == aVar) {
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
