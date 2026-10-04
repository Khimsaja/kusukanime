package O;

import m.C1501v;
import m.C1504y;

/* renamed from: O.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0509o0 {
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public C0519u f7109b;

    /* renamed from: c, reason: collision with root package name */
    public C0484c f7110c;

    /* renamed from: d, reason: collision with root package name */
    public e4.n f7111d;

    /* renamed from: e, reason: collision with root package name */
    public int f7112e;

    /* renamed from: f, reason: collision with root package name */
    public C1501v f7113f;

    /* renamed from: g, reason: collision with root package name */
    public C1504y f7114g;

    public C0509o0(C0519u c0519u) {
        this.f7109b = c0519u;
    }

    public static boolean a(E e7, C1504y c1504y) {
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>", e7);
        I0 i02 = e7.f6991m;
        if (i02 == null) {
            i02 = T.f7049p;
        }
        return !i02.a(e7.g().f6965f, c1504y.e(e7));
    }

    public final boolean b() {
        if (this.f7109b != null) {
            C0484c c0484c = this.f7110c;
            if (c0484c != null ? c0484c.a() : false) {
                return true;
            }
        }
        return false;
    }

    public final int c(Object obj) {
        int iP;
        C0519u c0519u = this.f7109b;
        if (c0519u == null || (iP = c0519u.p(this, obj)) == 0) {
            return 1;
        }
        return iP;
    }

    public final void d() {
        C0519u c0519u = this.f7109b;
        if (c0519u != null) {
            c0519u.f7205y = true;
        }
        this.f7109b = null;
        this.f7113f = null;
        this.f7114g = null;
    }

    public final void e(boolean z7) {
        if (z7) {
            this.a |= 32;
        } else {
            this.a &= -33;
        }
    }
}
