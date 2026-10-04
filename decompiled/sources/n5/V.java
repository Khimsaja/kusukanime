package n5;

import f.AbstractC0841b;
import s5.C2018b;
import s5.C2019c;

/* loaded from: classes.dex */
public final class V implements q5.i {

    /* renamed from: b, reason: collision with root package name */
    public static final V f13380b = new V(T.a);
    public final T a;

    public V(T t7) {
        this.a = t7;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(int r13) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.V.a(int):void");
    }

    public static b0 b(b0 b0Var, b0 b0Var2) {
        if (b0Var == null) {
            a(38);
            throw null;
        }
        if (b0Var2 == null) {
            a(39);
            throw null;
        }
        b0 b0Var3 = b0.f13390m;
        if (b0Var == b0Var3) {
            if (b0Var2 != null) {
                return b0Var2;
            }
            a(40);
            throw null;
        }
        if (b0Var2 == b0Var3) {
            if (b0Var != null) {
                return b0Var;
            }
            a(41);
            throw null;
        }
        if (b0Var == b0Var2) {
            if (b0Var2 != null) {
                return b0Var2;
            }
            a(42);
            throw null;
        }
        throw new AssertionError("Variance conflict: type parameter variance '" + b0Var + "' and projection kind '" + b0Var2 + "' cannot be combined");
    }

    public static int c(b0 b0Var, b0 b0Var2) {
        b0 b0Var3 = b0.f13391n;
        if (b0Var == b0Var3 && b0Var2 == b0.f13392o) {
            return 3;
        }
        return (b0Var == b0.f13392o && b0Var2 == b0Var3) ? 2 : 1;
    }

    public static V d(AbstractC1586x abstractC1586x) {
        if (abstractC1586x == null) {
            a(6);
            throw null;
        }
        return new V(N.f13375b.f(abstractC1586x.t0(), abstractC1586x.q0()));
    }

    public static V e(T t7, T t8) {
        if (t7 == null) {
            a(3);
            throw null;
        }
        if (t8 == null) {
            a(4);
            throw null;
        }
        if (t7.e()) {
            t7 = t8;
        } else if (!t8.e()) {
            t7 = new C1578o(t7, t8);
        }
        return new V(t7);
    }

    public static String h(Object obj) {
        try {
            return obj.toString();
        } catch (Throwable th) {
            if (w5.k.h(th)) {
                throw th;
            }
            return "[Exception while computing toString(): " + th + "]";
        }
    }

    public final T f() {
        T t7 = this.a;
        if (t7 != null) {
            return t7;
        }
        a(8);
        throw null;
    }

    public final AbstractC1586x g(AbstractC1586x abstractC1586x, b0 b0Var) {
        if (abstractC1586x == null) {
            a(9);
            throw null;
        }
        if (this.a.e()) {
            return abstractC1586x;
        }
        try {
            AbstractC1586x abstractC1586xB = j(new G(abstractC1586x, b0Var), null, 0).b();
            if (abstractC1586xB != null) {
                return abstractC1586xB;
            }
            a(12);
            throw null;
        } catch (U e7) {
            return p5.l.c(p5.k.f14447u, e7.getMessage());
        }
    }

    public final AbstractC1586x i(AbstractC1586x abstractC1586x, b0 b0Var) {
        if (abstractC1586x == null) {
            a(14);
            throw null;
        }
        if (b0Var == null) {
            a(15);
            throw null;
        }
        Q g4 = new G(f().f(abstractC1586x, b0Var), b0Var);
        T t7 = this.a;
        if (!t7.e()) {
            try {
                g4 = j(g4, null, 0);
            } catch (U unused) {
                g4 = null;
            }
        }
        if (t7.a() || t7.b()) {
            boolean zB = t7.b();
            if (g4 == null) {
                g4 = null;
            } else if (!g4.c()) {
                AbstractC1586x abstractC1586xB = g4.b();
                kotlin.jvm.internal.l.e("getType(...)", abstractC1586xB);
                if (Y.c(abstractC1586xB, C2018b.f15838k, null)) {
                    b0 b0VarA = g4.a();
                    kotlin.jvm.internal.l.e("getProjectionKind(...)", b0VarA);
                    if (b0VarA == b0.f13392o) {
                        g4 = new G((AbstractC1586x) AbstractC0841b.f(abstractC1586xB).f15837b, b0VarA);
                    } else if (zB) {
                        g4 = new G((AbstractC1586x) AbstractC0841b.f(abstractC1586xB).a, b0VarA);
                    } else {
                        C2019c c2019c = new C2019c();
                        V v5 = new V(c2019c);
                        if (!c2019c.e()) {
                            try {
                                g4 = v5.j(g4, null, 0);
                            } catch (U unused2) {
                            }
                        }
                    }
                }
            }
        }
        if (g4 == null) {
            return null;
        }
        return g4.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final n5.Q j(n5.Q r18, u4.Q r19, int r20) throws n5.U {
        /*
            Method dump skipped, instructions count: 794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.V.j(n5.Q, u4.Q, int):n5.Q");
    }
}
