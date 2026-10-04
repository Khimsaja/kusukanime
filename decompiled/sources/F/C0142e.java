package F;

import D.r0;
import android.view.View;
import z0.W;

/* renamed from: F.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0142e extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f2013k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f2014l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ W f2015m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ r0 f2016n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0144g f2017o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ y f2018p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0142e(W w7, r0 r0Var, C0144g c0144g, y yVar, S3.c cVar) {
        super(2, cVar);
        this.f2015m = w7;
        this.f2016n = r0Var;
        this.f2017o = c0144g;
        this.f2018p = yVar;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        C0142e c0142e = new C0142e(this.f2015m, this.f2016n, this.f2017o, this.f2018p, cVar);
        c0142e.f2014l = obj;
        return c0142e;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ((C0142e) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
        return T3.a.f9048k;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f2013k;
        C0144g c0144g = this.f2017o;
        try {
            if (i7 != 0) {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                P3.r.Y(obj);
                throw new D6.r();
            }
            P3.r.Y(obj);
            H5.A a = (H5.A) this.f2014l;
            A a7 = B.a;
            W w7 = this.f2015m;
            View view = w7.f18705k;
            a7.getClass();
            w wVar = new w(view);
            C c2 = new C(w7.f18705k, new C0141d(this.f2018p), wVar);
            if (E.e.a) {
                H5.D.x(a, null, new C0140c(c0144g, wVar, null), 3);
            }
            r0 r0Var = this.f2016n;
            if (r0Var != null) {
                r0Var.invoke(c2);
            }
            c0144g.f2025c = c2;
            this.f2013k = 1;
            w7.a(c2, this);
            return aVar;
        } catch (Throwable th) {
            c0144g.f2025c = null;
            throw th;
        }
    }
}
