package L;

import O.C0486d;
import O.C0510p;
import e4.InterfaceC0821a;
import f.AbstractC0847h;
import h0.InterfaceC0973S;
import q.C1837t;
import s.C1928n;
import v.InterfaceC2126e;
import v.InterfaceC2128g;

/* renamed from: L.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0435z extends kotlin.jvm.internal.m implements e4.n {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f5963l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a0.q f5964m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v.Z f5965n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f5966o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f5967p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f5968q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f5969r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f5970s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f5971t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f5972u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ O3.e f5973v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0435z(a0.q qVar, w.u uVar, v.Z z7, Object obj, Object obj2, C1928n c1928n, boolean z8, e4.k kVar, int i7, int i8, int i9) {
        super(2);
        this.f5963l = i9;
        this.f5964m = qVar;
        this.f5969r = uVar;
        this.f5965n = z7;
        this.f5970s = obj;
        this.f5971t = obj2;
        this.f5972u = c1928n;
        this.f5966o = z8;
        this.f5973v = kVar;
        this.f5967p = i7;
        this.f5968q = i8;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f5963l) {
            case 0:
                ((Number) obj2).intValue();
                int iV = C0486d.V(this.f5967p | 1);
                v.Z z7 = this.f5965n;
                E0.h((InterfaceC0821a) this.f5969r, this.f5964m, this.f5966o, (InterfaceC0973S) this.f5970s, (r) this.f5971t, (C1837t) this.f5972u, z7, (e4.o) this.f5973v, (C0510p) obj, iV, this.f5968q);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iV2 = C0486d.V(this.f5967p | 1);
                v.Z z8 = this.f5965n;
                C1928n c1928n = (C1928n) this.f5972u;
                AbstractC0847h.a(this.f5964m, (w.u) this.f5969r, z8, (InterfaceC2128g) this.f5970s, (a0.g) this.f5971t, c1928n, this.f5966o, (e4.k) this.f5973v, (C0510p) obj, iV2, this.f5968q);
                break;
            default:
                ((Number) obj2).intValue();
                int iV3 = C0486d.V(this.f5967p | 1);
                v.Z z9 = this.f5965n;
                InterfaceC2126e interfaceC2126e = (InterfaceC2126e) this.f5970s;
                C1928n c1928n2 = (C1928n) this.f5972u;
                AbstractC0847h.b(this.f5964m, (w.u) this.f5969r, z9, interfaceC2126e, (a0.h) this.f5971t, c1928n2, this.f5966o, (e4.k) this.f5973v, (C0510p) obj, iV3, this.f5968q);
                break;
        }
        return O3.C.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0435z(InterfaceC0821a interfaceC0821a, a0.q qVar, boolean z7, InterfaceC0973S interfaceC0973S, r rVar, C1837t c1837t, v.Z z8, e4.o oVar, int i7, int i8) {
        super(2);
        this.f5963l = 0;
        this.f5969r = interfaceC0821a;
        this.f5964m = qVar;
        this.f5966o = z7;
        this.f5970s = interfaceC0973S;
        this.f5971t = rVar;
        this.f5972u = c1837t;
        this.f5965n = z8;
        this.f5973v = oVar;
        this.f5967p = i7;
        this.f5968q = i8;
    }
}
