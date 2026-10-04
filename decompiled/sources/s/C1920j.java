package s;

import D.C0056i;
import H5.InterfaceC0265f0;

/* renamed from: s.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1920j extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f15308k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f15309l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e1 f15310m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C1924l f15311n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1910e f15312o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0265f0 f15313p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1920j(e1 e1Var, C1924l c1924l, InterfaceC1910e interfaceC1910e, InterfaceC0265f0 interfaceC0265f0, S3.c cVar) {
        super(2, cVar);
        this.f15310m = e1Var;
        this.f15311n = c1924l;
        this.f15312o = interfaceC1910e;
        this.f15313p = interfaceC0265f0;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        C1920j c1920j = new C1920j(this.f15310m, this.f15311n, this.f15312o, this.f15313p, cVar);
        c1920j.f15309l = obj;
        return c1920j;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1920j) create((A0) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f15308k;
        if (i7 == 0) {
            P3.r.Y(obj);
            A0 a02 = (A0) this.f15309l;
            InterfaceC1910e interfaceC1910e = this.f15312o;
            C1924l c1924l = this.f15311n;
            float fG0 = C1924l.G0(c1924l, interfaceC1910e);
            e1 e1Var = this.f15310m;
            e1Var.f15297e = fG0;
            C0056i c0056i = new C0056i(c1924l, this.f15313p, a02, 16);
            A.j jVar = new A.j(c1924l, e1Var, interfaceC1910e, 5);
            this.f15308k = 1;
            if (e1Var.a(c0056i, jVar, this) == aVar) {
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
