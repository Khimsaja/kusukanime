package q;

import O.C0486d;
import O.C0487d0;
import o.C1622t;
import s.InterfaceC1946w0;

/* loaded from: classes.dex */
public final class o0 implements InterfaceC1946w0 {

    /* renamed from: i, reason: collision with root package name */
    public static final L2.e f14597i;
    public final C0487d0 a;

    /* renamed from: e, reason: collision with root package name */
    public float f14601e;

    /* renamed from: b, reason: collision with root package name */
    public final C0487d0 f14598b = C0486d.J(0);

    /* renamed from: c, reason: collision with root package name */
    public final u.k f14599c = new u.k();

    /* renamed from: d, reason: collision with root package name */
    public final C0487d0 f14600d = C0486d.J(Integer.MAX_VALUE);

    /* renamed from: f, reason: collision with root package name */
    public final s.r f14602f = new s.r(new C1622t(3, this));

    /* renamed from: g, reason: collision with root package name */
    public final O.E f14603g = C0486d.D(new n0(this, 1));

    /* renamed from: h, reason: collision with root package name */
    public final O.E f14604h = C0486d.D(new n0(this, 0));

    static {
        m0 m0Var = m0.f14586l;
        C1835q c1835q = C1835q.f14613p;
        L2.e eVar = X.n.a;
        f14597i = new L2.e(12, m0Var, c1835q);
    }

    public o0(int i7) {
        this.a = C0486d.J(i7);
    }

    @Override // s.InterfaceC1946w0
    public final boolean a() {
        return ((Boolean) this.f14604h.getValue()).booleanValue();
    }

    @Override // s.InterfaceC1946w0
    public final boolean b() {
        return this.f14602f.b();
    }

    @Override // s.InterfaceC1946w0
    public final boolean c() {
        return ((Boolean) this.f14603g.getValue()).booleanValue();
    }

    @Override // s.InterfaceC1946w0
    public final float d(float f5) {
        return this.f14602f.d(f5);
    }

    @Override // s.InterfaceC1946w0
    public final Object e(X x7, e4.n nVar, S3.c cVar) {
        Object objE = this.f14602f.e(x7, nVar, cVar);
        return objE == T3.a.f9048k ? objE : O3.C.a;
    }
}
