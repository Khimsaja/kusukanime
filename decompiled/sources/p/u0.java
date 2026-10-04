package p;

import O.AbstractC0482b;
import O.C0486d;
import O.C0489e0;
import O.C0493g0;
import o.C1616n;

/* loaded from: classes.dex */
public final class u0 {
    public final Q4.c a;

    /* renamed from: b, reason: collision with root package name */
    public final u0 f14134b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14135c;

    /* renamed from: d, reason: collision with root package name */
    public final C0493g0 f14136d;

    /* renamed from: e, reason: collision with root package name */
    public final C0493g0 f14137e;

    /* renamed from: f, reason: collision with root package name */
    public final C0489e0 f14138f;

    /* renamed from: g, reason: collision with root package name */
    public final C0489e0 f14139g;

    /* renamed from: h, reason: collision with root package name */
    public final C0493g0 f14140h;

    /* renamed from: i, reason: collision with root package name */
    public final Y.r f14141i;

    /* renamed from: j, reason: collision with root package name */
    public final Y.r f14142j;

    /* renamed from: k, reason: collision with root package name */
    public final C0493g0 f14143k;

    /* renamed from: l, reason: collision with root package name */
    public final O.E f14144l;

    public u0(Q4.c cVar, u0 u0Var, String str) {
        this.a = cVar;
        this.f14134b = u0Var;
        this.f14135c = str;
        Object objV0 = cVar.v0();
        O.T t7 = O.T.f7049p;
        this.f14136d = C0486d.K(objV0, t7);
        this.f14137e = C0486d.K(new r0(cVar.v0(), cVar.v0()), t7);
        int i7 = AbstractC0482b.f7056b;
        this.f14138f = new C0489e0(0L);
        this.f14139g = new C0489e0(Long.MIN_VALUE);
        Boolean bool = Boolean.FALSE;
        this.f14140h = C0486d.K(bool, t7);
        this.f14141i = new Y.r();
        this.f14142j = new Y.r();
        this.f14143k = C0486d.K(bool, t7);
        this.f14144l = C0486d.D(new C1616n(this, 1));
        cVar.I0(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.Object r10, O.C0510p r11, int r12) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p.u0.a(java.lang.Object, O.p, int):void");
    }

    public final long b() {
        Y.r rVar = this.f14141i;
        int size = rVar.size();
        long jMax = 0;
        for (int i7 = 0; i7 < size; i7++) {
            C0489e0 c0489e0 = ((s0) rVar.get(i7)).f14107v;
            jMax = Math.max(jMax, ((O.G0) Y.o.t(c0489e0.f7066l, c0489e0)).f6997c);
        }
        Y.r rVar2 = this.f14142j;
        int size2 = rVar2.size();
        for (int i8 = 0; i8 < size2; i8++) {
            jMax = Math.max(jMax, ((u0) rVar2.get(i8)).b());
        }
        return jMax;
    }

    public final void c() {
        Y.r rVar = this.f14141i;
        int size = rVar.size();
        for (int i7 = 0; i7 < size; i7++) {
            s0 s0Var = (s0) rVar.get(i7);
            s0Var.f14101p = null;
            s0Var.f14100o = null;
            s0Var.f14104s = false;
        }
        Y.r rVar2 = this.f14142j;
        int size2 = rVar2.size();
        for (int i8 = 0; i8 < size2; i8++) {
            ((u0) rVar2.get(i8)).c();
        }
    }

    public final boolean d() {
        Y.r rVar = this.f14141i;
        int size = rVar.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (((s0) rVar.get(i7)).f14100o != null) {
                return true;
            }
        }
        Y.r rVar2 = this.f14142j;
        int size2 = rVar2.size();
        for (int i8 = 0; i8 < size2; i8++) {
            if (((u0) rVar2.get(i8)).d()) {
                return true;
            }
        }
        return false;
    }

    public final long e() {
        u0 u0Var = this.f14134b;
        if (u0Var != null) {
            return u0Var.e();
        }
        C0489e0 c0489e0 = this.f14138f;
        return ((O.G0) Y.o.t(c0489e0.f7066l, c0489e0)).f6997c;
    }

    public final q0 f() {
        return (q0) this.f14137e.getValue();
    }

    public final boolean g() {
        return ((Boolean) this.f14143k.getValue()).booleanValue();
    }

    public final void h(long j7, boolean z7) {
        C0489e0 c0489e0 = this.f14139g;
        long j8 = ((O.G0) Y.o.t(c0489e0.f7066l, c0489e0)).f6997c;
        Q4.c cVar = this.a;
        if (j8 == Long.MIN_VALUE) {
            c0489e0.f(j7);
            ((C0493g0) cVar.f8011k).setValue(Boolean.TRUE);
        } else if (!((Boolean) ((C0493g0) cVar.f8011k).getValue()).booleanValue()) {
            ((C0493g0) cVar.f8011k).setValue(Boolean.TRUE);
        }
        this.f14140h.setValue(Boolean.FALSE);
        Y.r rVar = this.f14141i;
        int size = rVar.size();
        boolean z8 = true;
        for (int i7 = 0; i7 < size; i7++) {
            s0 s0Var = (s0) rVar.get(i7);
            boolean zBooleanValue = ((Boolean) s0Var.f14102q.getValue()).booleanValue();
            C0493g0 c0493g0 = s0Var.f14102q;
            if (!zBooleanValue) {
                long jC = z7 ? s0Var.a().c() : j7;
                s0Var.e(s0Var.a().b(jC));
                s0Var.f14106u = s0Var.a().f(jC);
                if (s0Var.a().g(jC)) {
                    c0493g0.setValue(Boolean.TRUE);
                }
            }
            if (!((Boolean) c0493g0.getValue()).booleanValue()) {
                z8 = false;
            }
        }
        Y.r rVar2 = this.f14142j;
        int size2 = rVar2.size();
        for (int i8 = 0; i8 < size2; i8++) {
            u0 u0Var = (u0) rVar2.get(i8);
            Object value = u0Var.f14136d.getValue();
            Q4.c cVar2 = u0Var.a;
            if (!kotlin.jvm.internal.l.a(value, cVar2.v0())) {
                u0Var.h(j7, z7);
            }
            if (!kotlin.jvm.internal.l.a(u0Var.f14136d.getValue(), cVar2.v0())) {
                z8 = false;
            }
        }
        if (z8) {
            i();
        }
    }

    public final void i() {
        this.f14139g.f(Long.MIN_VALUE);
        Q4.c cVar = this.a;
        if (cVar instanceof C1727N) {
            cVar.H0(this.f14136d.getValue());
        }
        o(0L);
        ((C0493g0) cVar.f8011k).setValue(Boolean.FALSE);
        Y.r rVar = this.f14142j;
        int size = rVar.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((u0) rVar.get(i7)).i();
        }
    }

    public final void j(float f5) {
        Y.r rVar = this.f14141i;
        int size = rVar.size();
        for (int i7 = 0; i7 < size; i7++) {
            s0 s0Var = (s0) rVar.get(i7);
            s0Var.getClass();
            if (f5 == -4.0f || f5 == -5.0f) {
                n0 n0Var = s0Var.f14101p;
                if (n0Var != null) {
                    s0Var.a().h(n0Var.f14076c);
                    s0Var.f14100o = null;
                    s0Var.f14101p = null;
                }
                Object obj = f5 == -4.0f ? s0Var.a().f14077d : s0Var.a().f14076c;
                s0Var.a().h(obj);
                s0Var.a().i(obj);
                s0Var.e(obj);
                s0Var.f14107v.f(s0Var.a().c());
            } else {
                s0Var.f14103r.g(f5);
            }
        }
        Y.r rVar2 = this.f14142j;
        int size2 = rVar2.size();
        for (int i8 = 0; i8 < size2; i8++) {
            ((u0) rVar2.get(i8)).j(f5);
        }
    }

    public final void k() {
        Y.r rVar = this.f14141i;
        int size = rVar.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((s0) rVar.get(i7)).f14103r.g(-2.0f);
        }
        Y.r rVar2 = this.f14142j;
        int size2 = rVar2.size();
        for (int i8 = 0; i8 < size2; i8++) {
            ((u0) rVar2.get(i8)).k();
        }
    }

    public final void l(Object obj, Object obj2) {
        this.f14139g.f(Long.MIN_VALUE);
        Boolean bool = Boolean.FALSE;
        Q4.c cVar = this.a;
        ((C0493g0) cVar.f8011k).setValue(bool);
        boolean zG = g();
        C0493g0 c0493g0 = this.f14136d;
        if (!zG || !kotlin.jvm.internal.l.a(cVar.v0(), obj) || !kotlin.jvm.internal.l.a(c0493g0.getValue(), obj2)) {
            if (!kotlin.jvm.internal.l.a(cVar.v0(), obj) && (cVar instanceof C1727N)) {
                cVar.H0(obj);
            }
            c0493g0.setValue(obj2);
            this.f14143k.setValue(Boolean.TRUE);
            this.f14137e.setValue(new r0(obj, obj2));
        }
        Y.r rVar = this.f14142j;
        int size = rVar.size();
        for (int i7 = 0; i7 < size; i7++) {
            u0 u0Var = (u0) rVar.get(i7);
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Any>", u0Var);
            if (u0Var.g()) {
                u0Var.l(u0Var.a.v0(), u0Var.f14136d.getValue());
            }
        }
        Y.r rVar2 = this.f14141i;
        int size2 = rVar2.size();
        for (int i8 = 0; i8 < size2; i8++) {
            ((s0) rVar2.get(i8)).d(0L);
        }
    }

    public final void m(long j7) {
        C0489e0 c0489e0 = this.f14139g;
        if (((O.G0) Y.o.t(c0489e0.f7066l, c0489e0)).f6997c == Long.MIN_VALUE) {
            c0489e0.f(j7);
        }
        o(j7);
        this.f14140h.setValue(Boolean.FALSE);
        Y.r rVar = this.f14141i;
        int size = rVar.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((s0) rVar.get(i7)).d(j7);
        }
        Y.r rVar2 = this.f14142j;
        int size2 = rVar2.size();
        for (int i8 = 0; i8 < size2; i8++) {
            u0 u0Var = (u0) rVar2.get(i8);
            if (!kotlin.jvm.internal.l.a(u0Var.f14136d.getValue(), u0Var.a.v0())) {
                u0Var.m(j7);
            }
        }
    }

    public final void n(C1731S c1731s) {
        Y.r rVar = this.f14141i;
        int size = rVar.size();
        for (int i7 = 0; i7 < size; i7++) {
            s0 s0Var = (s0) rVar.get(i7);
            if (!kotlin.jvm.internal.l.a(s0Var.a().f14076c, s0Var.a().f14077d)) {
                s0Var.f14101p = s0Var.a();
                s0Var.f14100o = c1731s;
            }
            C0493g0 c0493g0 = s0Var.f14105t;
            s0Var.f14099n.setValue(new n0(s0Var.f14109x, s0Var.f14096k, c0493g0.getValue(), c0493g0.getValue(), s0Var.f14106u.c()));
            s0Var.f14107v.f(s0Var.a().c());
            s0Var.f14104s = true;
        }
        Y.r rVar2 = this.f14142j;
        int size2 = rVar2.size();
        for (int i8 = 0; i8 < size2; i8++) {
            ((u0) rVar2.get(i8)).n(c1731s);
        }
    }

    public final void o(long j7) {
        if (this.f14134b == null) {
            this.f14138f.f(j7);
        }
    }

    public final void p() {
        n0 n0Var;
        Y.r rVar = this.f14141i;
        int size = rVar.size();
        for (int i7 = 0; i7 < size; i7++) {
            s0 s0Var = (s0) rVar.get(i7);
            C1731S c1731s = s0Var.f14100o;
            if (c1731s != null && (n0Var = s0Var.f14101p) != null) {
                long jX = P3.F.X(c1731s.f13906g * c1731s.f13903d);
                Object objB = n0Var.b(jX);
                if (s0Var.f14104s) {
                    s0Var.a().i(objB);
                }
                s0Var.a().h(objB);
                s0Var.f14107v.f(s0Var.a().c());
                if (s0Var.f14103r.f() == -2.0f || s0Var.f14104s) {
                    s0Var.e(objB);
                } else {
                    s0Var.d(s0Var.f14110y.e());
                }
                if (jX >= c1731s.f13906g) {
                    s0Var.f14100o = null;
                    s0Var.f14101p = null;
                } else {
                    c1731s.f13902c = false;
                }
            }
        }
        Y.r rVar2 = this.f14142j;
        int size2 = rVar2.size();
        for (int i8 = 0; i8 < size2; i8++) {
            ((u0) rVar2.get(i8)).p();
        }
    }

    public final void q(Object obj) {
        C0493g0 c0493g0 = this.f14136d;
        if (kotlin.jvm.internal.l.a(c0493g0.getValue(), obj)) {
            return;
        }
        this.f14137e.setValue(new r0(c0493g0.getValue(), obj));
        Q4.c cVar = this.a;
        if (!kotlin.jvm.internal.l.a(cVar.v0(), c0493g0.getValue())) {
            cVar.H0(c0493g0.getValue());
        }
        c0493g0.setValue(obj);
        C0489e0 c0489e0 = this.f14139g;
        if (((O.G0) Y.o.t(c0489e0.f7066l, c0489e0)).f6997c == Long.MIN_VALUE) {
            this.f14140h.setValue(Boolean.TRUE);
        }
        k();
    }

    public final String toString() {
        Y.r rVar = this.f14141i;
        int size = rVar.size();
        String str = "Transition animation values: ";
        for (int i7 = 0; i7 < size; i7++) {
            str = str + ((s0) rVar.get(i7)) + ", ";
        }
        return str;
    }
}
