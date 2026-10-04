package T2;

import H5.D;
import O3.C;
import android.graphics.drawable.Drawable;
import d3.AbstractC0798j;
import d3.C0792d;
import d3.C0793e;
import d3.C0796h;
import d3.C0797i;
import d3.C0803o;
import w0.C2191i;
import w0.InterfaceC2192j;

/* loaded from: classes.dex */
public final class h extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f8999k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f9000l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ o f9001m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(o oVar, S3.c cVar) {
        super(2, cVar);
        this.f9001m = oVar;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        h hVar = new h(this.f9001m, cVar);
        hVar.f9000l = obj;
        return hVar;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((C0797i) obj, (S3.c) obj2)).invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        o oVar;
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f8999k;
        if (i7 == 0) {
            P3.r.Y(obj);
            C0797i c0797i = (C0797i) this.f9000l;
            o oVar2 = this.f9001m;
            S2.f fVar = (S2.f) oVar2.f9013B.getValue();
            C0796h c0796hA = C0797i.a(c0797i);
            c0796hA.f11263d = new k(oVar2);
            c0796hA.f11273n = null;
            c0796hA.f11274o = null;
            c0796hA.f11275p = null;
            C0792d c0792d = c0797i.f11299y;
            if (c0792d.a == null) {
                c0796hA.f11271l = new k(oVar2);
                c0796hA.f11273n = null;
                c0796hA.f11274o = null;
                c0796hA.f11275p = null;
            }
            if (c0792d.f11256b == null) {
                InterfaceC2192j interfaceC2192j = oVar2.f9022w;
                e3.f fVar2 = z.f9047b;
                c0796hA.f11272m = kotlin.jvm.internal.l.a(interfaceC2192j, C2191i.f16865b) ? true : kotlin.jvm.internal.l.a(interfaceC2192j, C2191i.f16866c) ? e3.g.f11353l : e3.g.f11352k;
            }
            if (c0792d.f11257c != e3.e.f11348k) {
                c0796hA.f11264e = e3.e.f11349l;
            }
            C0797i c0797iA = c0796hA.a();
            this.f9000l = oVar2;
            this.f8999k = 1;
            S2.m mVar = (S2.m) fVar;
            mVar.getClass();
            obj = D.j(new S2.i(mVar, null, c0797iA), this);
            if (obj == aVar) {
                return aVar;
            }
            oVar = oVar2;
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oVar = (o) this.f9000l;
            P3.r.Y(obj);
        }
        AbstractC0798j abstractC0798j = (AbstractC0798j) obj;
        oVar.getClass();
        if (abstractC0798j instanceof C0803o) {
            C0803o c0803o = (C0803o) abstractC0798j;
            return new f(oVar.j(c0803o.a), c0803o);
        }
        if (!(abstractC0798j instanceof C0793e)) {
            throw new D6.r();
        }
        Drawable drawable = ((C0793e) abstractC0798j).a;
        return new d(drawable != null ? oVar.j(drawable) : null, (C0793e) abstractC0798j);
    }
}
