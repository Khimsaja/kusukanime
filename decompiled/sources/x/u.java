package x;

import O3.C;
import s.InterfaceC1911e0;
import y0.C2349D;

/* loaded from: classes.dex */
public final class u extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ v f17276k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f17277l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(v vVar, int i7, S3.c cVar) {
        super(2, cVar);
        this.f17276k = vVar;
        this.f17277l = i7;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new u(this.f17276k, this.f17277l, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        u uVar = (u) create((InterfaceC1911e0) obj, (S3.c) obj2);
        C c2 = C.a;
        uVar.invokeSuspend(c2);
        return c2;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        P3.r.Y(obj);
        v vVar = this.f17276k;
        w.n nVar = vVar.f17279b;
        int iF = nVar.f16771b.f();
        int i7 = this.f17277l;
        if (iF != i7 || nVar.f16772c.f() != 0) {
            vVar.f17288k.d();
        }
        nVar.a(i7, 0);
        nVar.f16774e = null;
        C2349D c2349d = vVar.f17285h;
        if (c2349d != null) {
            c2349d.k();
        }
        return C.a;
    }
}
