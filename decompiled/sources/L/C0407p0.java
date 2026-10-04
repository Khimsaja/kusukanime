package L;

import O.C0486d;
import O.C0510p;
import o.C1593E;
import o.C1594F;
import w0.InterfaceC2192j;

/* renamed from: L.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0407p0 extends kotlin.jvm.internal.m implements e4.n {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f5716l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f5717m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f5718n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f5719o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f5720p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f5721q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f5722r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0407p0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7, int i8) {
        super(2);
        this.f5716l = i8;
        this.f5718n = obj;
        this.f5719o = obj2;
        this.f5720p = obj3;
        this.f5721q = obj4;
        this.f5722r = obj5;
        this.f5717m = i7;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f5716l) {
            case 0:
                ((Number) obj2).intValue();
                int iV = C0486d.V(this.f5717m | 1);
                W.a aVar = (W.a) this.f5720p;
                AbstractC0412r0.b((W.a) this.f5718n, (W.a) this.f5719o, aVar, (W.a) this.f5721q, (W.a) this.f5722r, (C0510p) obj, iV);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iV2 = C0486d.V(this.f5717m | 1);
                T2.o oVar = (T2.o) this.f5719o;
                a0.d dVar = (a0.d) this.f5721q;
                InterfaceC2192j interfaceC2192j = (InterfaceC2192j) this.f5722r;
                T2.q.c((a0.q) this.f5718n, oVar, (String) this.f5720p, dVar, interfaceC2192j, (C0510p) obj, iV2);
                break;
            default:
                ((Number) obj2).intValue();
                int iV3 = C0486d.V(this.f5717m | 1);
                C1594F c1594f = (C1594F) this.f5722r;
                W.a aVar2 = (W.a) this.f5718n;
                p.u0 u0Var = (p.u0) this.f5719o;
                C1593E c1593e = (C1593E) this.f5721q;
                androidx.compose.animation.a.c(u0Var, (a0.q) this.f5720p, c1593e, c1594f, aVar2, (C0510p) obj, iV3);
                break;
        }
        return O3.C.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0407p0(p.u0 u0Var, a0.q qVar, C1593E c1593e, C1594F c1594f, W.a aVar, int i7) {
        super(2);
        this.f5716l = 2;
        this.f5719o = u0Var;
        this.f5720p = qVar;
        this.f5721q = c1593e;
        this.f5722r = c1594f;
        this.f5718n = aVar;
        this.f5717m = i7;
    }
}
