package p;

import O.AbstractC0482b;
import O.C0485c0;
import O.C0486d;
import O.C0489e0;
import O.C0493g0;
import O.R0;

/* loaded from: classes.dex */
public final class s0 implements R0 {

    /* renamed from: k, reason: collision with root package name */
    public final B0 f14096k;

    /* renamed from: l, reason: collision with root package name */
    public final C0493g0 f14097l;

    /* renamed from: m, reason: collision with root package name */
    public final C0493g0 f14098m;

    /* renamed from: n, reason: collision with root package name */
    public final C0493g0 f14099n;

    /* renamed from: o, reason: collision with root package name */
    public C1731S f14100o;

    /* renamed from: p, reason: collision with root package name */
    public n0 f14101p;

    /* renamed from: q, reason: collision with root package name */
    public final C0493g0 f14102q;

    /* renamed from: r, reason: collision with root package name */
    public final C0485c0 f14103r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f14104s;

    /* renamed from: t, reason: collision with root package name */
    public final C0493g0 f14105t;

    /* renamed from: u, reason: collision with root package name */
    public AbstractC1766r f14106u;

    /* renamed from: v, reason: collision with root package name */
    public final C0489e0 f14107v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f14108w;

    /* renamed from: x, reason: collision with root package name */
    public final C1752g0 f14109x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ u0 f14110y;

    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object, java.util.Map] */
    public s0(u0 u0Var, Object obj, AbstractC1766r abstractC1766r, B0 b02) {
        this.f14110y = u0Var;
        this.f14096k = b02;
        O.T t7 = O.T.f7049p;
        C0493g0 c0493g0K = C0486d.K(obj, t7);
        this.f14097l = c0493g0K;
        Object objInvoke = null;
        C0493g0 c0493g0K2 = C0486d.K(AbstractC1745d.p(7, null), t7);
        this.f14098m = c0493g0K2;
        this.f14099n = C0486d.K(new n0((InterfaceC1715B) c0493g0K2.getValue(), b02, obj, c0493g0K.getValue(), abstractC1766r), t7);
        this.f14102q = C0486d.K(Boolean.TRUE, t7);
        this.f14103r = C0486d.I(-1.0f);
        this.f14105t = C0486d.K(obj, t7);
        this.f14106u = abstractC1766r;
        long jC = a().c();
        int i7 = AbstractC0482b.f7056b;
        this.f14107v = new C0489e0(jC);
        Float f5 = (Float) J0.a.get(b02);
        if (f5 != null) {
            float fFloatValue = f5.floatValue();
            AbstractC1766r abstractC1766r2 = (AbstractC1766r) b02.a.invoke(obj);
            int iB = abstractC1766r2.b();
            for (int i8 = 0; i8 < iB; i8++) {
                abstractC1766r2.e(fFloatValue, i8);
            }
            objInvoke = this.f14096k.f13838b.invoke(abstractC1766r2);
        }
        this.f14109x = AbstractC1745d.p(3, objInvoke);
    }

    public final n0 a() {
        return (n0) this.f14099n.getValue();
    }

    public final void d(long j7) {
        if (this.f14103r.f() == -1.0f) {
            this.f14108w = true;
            if (kotlin.jvm.internal.l.a(a().f14076c, a().f14077d)) {
                e(a().f14076c);
            } else {
                e(a().b(j7));
                this.f14106u = a().f(j7);
            }
        }
    }

    public final void e(Object obj) {
        this.f14105t.setValue(obj);
    }

    public final void f(Object obj, boolean z7) {
        n0 n0Var = this.f14101p;
        Object obj2 = n0Var != null ? n0Var.f14076c : null;
        C0493g0 c0493g0 = this.f14097l;
        boolean zA = kotlin.jvm.internal.l.a(obj2, c0493g0.getValue());
        C0489e0 c0489e0 = this.f14107v;
        C0493g0 c0493g02 = this.f14099n;
        if (zA) {
            c0493g02.setValue(new n0(this.f14109x, this.f14096k, obj, obj, this.f14106u.c()));
            this.f14104s = true;
            c0489e0.f(a().c());
            return;
        }
        C0493g0 c0493g03 = this.f14098m;
        InterfaceC1715B interfaceC1715B = (!z7 || this.f14108w || (((InterfaceC1715B) c0493g03.getValue()) instanceof C1752g0)) ? (InterfaceC1715B) c0493g03.getValue() : this.f14109x;
        u0 u0Var = this.f14110y;
        c0493g02.setValue(new n0(u0Var.e() <= 0 ? interfaceC1715B : new C1754h0(interfaceC1715B, u0Var.e()), this.f14096k, obj, c0493g0.getValue(), this.f14106u));
        c0489e0.f(a().c());
        this.f14104s = false;
        Boolean bool = Boolean.TRUE;
        C0493g0 c0493g04 = u0Var.f14140h;
        c0493g04.setValue(bool);
        if (u0Var.g()) {
            Y.r rVar = u0Var.f14141i;
            int size = rVar.size();
            long jMax = 0;
            for (int i7 = 0; i7 < size; i7++) {
                s0 s0Var = (s0) rVar.get(i7);
                C0489e0 c0489e02 = s0Var.f14107v;
                jMax = Math.max(jMax, ((O.G0) Y.o.t(c0489e02.f7066l, c0489e02)).f6997c);
                s0Var.d(0L);
            }
            c0493g04.setValue(Boolean.FALSE);
        }
    }

    public final void g(Object obj, Object obj2, InterfaceC1715B interfaceC1715B) {
        this.f14097l.setValue(obj2);
        this.f14098m.setValue(interfaceC1715B);
        if (kotlin.jvm.internal.l.a(a().f14077d, obj) && kotlin.jvm.internal.l.a(a().f14076c, obj2)) {
            return;
        }
        f(obj, false);
    }

    @Override // O.R0
    public final Object getValue() {
        return this.f14105t.getValue();
    }

    public final void h(Object obj, InterfaceC1715B interfaceC1715B) {
        if (this.f14104s) {
            n0 n0Var = this.f14101p;
            if (kotlin.jvm.internal.l.a(obj, n0Var != null ? n0Var.f14076c : null)) {
                return;
            }
        }
        C0493g0 c0493g0 = this.f14097l;
        boolean zA = kotlin.jvm.internal.l.a(c0493g0.getValue(), obj);
        C0485c0 c0485c0 = this.f14103r;
        if (zA && c0485c0.f() == -1.0f) {
            return;
        }
        c0493g0.setValue(obj);
        this.f14098m.setValue(interfaceC1715B);
        Object value = c0485c0.f() == -3.0f ? obj : this.f14105t.getValue();
        C0493g0 c0493g02 = this.f14102q;
        f(value, !((Boolean) c0493g02.getValue()).booleanValue());
        c0493g02.setValue(Boolean.valueOf(c0485c0.f() == -3.0f));
        if (c0485c0.f() >= 0.0f) {
            e(a().b((long) (c0485c0.f() * a().c())));
        } else if (c0485c0.f() == -3.0f) {
            e(obj);
        }
        this.f14104s = false;
        c0485c0.g(-1.0f);
    }

    public final String toString() {
        return "current value: " + this.f14105t.getValue() + ", target: " + this.f14097l.getValue() + ", spec: " + ((InterfaceC1715B) this.f14098m.getValue());
    }
}
