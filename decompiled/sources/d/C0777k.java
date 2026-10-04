package d;

import H.N;
import H5.A;
import K5.C0325d;
import K5.C0336o;
import O3.C;
import P3.r;
import e4.n;
import kotlin.jvm.internal.t;

/* renamed from: d.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0777k extends U3.j implements n {

    /* renamed from: k, reason: collision with root package name */
    public t f11183k;

    /* renamed from: l, reason: collision with root package name */
    public int f11184l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0778l f11185m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ n f11186n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ N f11187o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0777k(C0778l c0778l, n nVar, N n7, S3.c cVar) {
        super(2, cVar);
        this.f11185m = c0778l;
        this.f11186n = nVar;
        this.f11187o = n7;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new C0777k(this.f11185m, this.f11186n, this.f11187o, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0777k) create((A) obj, (S3.c) obj2)).invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        t tVar;
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f11184l;
        boolean z7 = true;
        if (i7 == 0) {
            r.Y(obj);
            if (this.f11185m.a) {
                t tVar2 = new t();
                C0336o c0336o = new C0336o(new C0325d((J5.e) this.f11187o.f2901c, z7), new C0776j(tVar2, null));
                this.f11183k = tVar2;
                this.f11184l = 1;
                if (this.f11186n.invoke(c0336o, this) == aVar) {
                    return aVar;
                }
                tVar = tVar2;
            }
            return C.a;
        }
        if (i7 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        tVar = this.f11183k;
        r.Y(obj);
        if (!tVar.f12716k) {
            throw new IllegalStateException("You must collect the progress flow");
        }
        return C.a;
    }
}
