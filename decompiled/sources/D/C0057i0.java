package D;

import f6.AbstractC0915m;
import o.C1622t;
import s.AbstractC1899G;
import s.C1894B;
import s.C1895C;
import s0.C1955C;

/* renamed from: D.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0057i0 extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f1186k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1955C f1187l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0071p0 f1188m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0057i0(C1955C c1955c, InterfaceC0071p0 interfaceC0071p0, S3.c cVar) {
        super(2, cVar);
        this.f1187l = c1955c;
        this.f1188m = interfaceC0071p0;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new C0057i0(this.f1187l, this.f1188m, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0057i0) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i7 = 5;
        T3.a aVar = T3.a.f9048k;
        int i8 = this.f1186k;
        O3.C c2 = O3.C.a;
        if (i8 != 0) {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P3.r.Y(obj);
            return c2;
        }
        P3.r.Y(obj);
        this.f1186k = 1;
        InterfaceC0071p0 interfaceC0071p0 = this.f1188m;
        C0061k0 c0061k0 = new C0061k0(interfaceC0071p0, 0);
        C0063l0 c0063l0 = new C0063l0(interfaceC0071p0, 0);
        C0063l0 c0063l02 = new C0063l0(interfaceC0071p0, 1);
        S s7 = new S(1, interfaceC0071p0);
        float f5 = AbstractC1899G.a;
        Object objF = AbstractC0915m.f(this.f1187l, new C1895C(C1894B.f15063m, new kotlin.jvm.internal.w(), null, new M0(i7, c0061k0), s7, c0063l02, new C1622t(5, c0063l0), null), this);
        if (objF != aVar) {
            objF = c2;
        }
        if (objF != aVar) {
            objF = c2;
        }
        if (objF != aVar) {
            objF = c2;
        }
        return objF == aVar ? aVar : c2;
    }
}
