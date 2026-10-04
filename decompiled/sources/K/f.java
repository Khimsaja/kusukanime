package K;

import O.C0486d;
import O.C0502l;
import O.C0510p;
import O.Z;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b1.AbstractC0703b;
import h0.C0998u;
import q.M;
import q.N;

/* loaded from: classes.dex */
public final class f implements M {
    public final boolean a;

    /* renamed from: b, reason: collision with root package name */
    public final float f4376b;

    /* renamed from: c, reason: collision with root package name */
    public final Z f4377c;

    public f(boolean z7, float f5, Z z8) {
        this.a = z7;
        this.f4376b = f5;
        this.f4377c = z8;
    }

    @Override // q.M
    public final N a(u.j jVar, C0510p c0510p) {
        long jA;
        c0510p.R(988743187);
        x xVar = (x) c0510p.k(z.a);
        Z z7 = this.f4377c;
        if (((C0998u) z7.getValue()).a != 16) {
            c0510p.R(-303571590);
            c0510p.p(false);
            jA = ((C0998u) z7.getValue()).a;
        } else {
            c0510p.R(-303521246);
            jA = xVar.a(c0510p);
            c0510p.p(false);
        }
        Z zN = C0486d.N(new C0998u(jA), c0510p);
        Z zN2 = C0486d.N(xVar.b(c0510p), c0510p);
        c0510p.R(331259447);
        ViewGroup viewGroupB = A.b((View) c0510p.k(AndroidCompositionLocals_androidKt.f10673f));
        boolean zF = c0510p.f(jVar) | c0510p.f(this) | c0510p.f(viewGroupB);
        Object objH = c0510p.H();
        Object obj = C0502l.a;
        if (zF || objH == obj) {
            Object c0292a = new C0292a(this.a, this.f4376b, zN, zN2, viewGroupB);
            c0510p.b0(c0292a);
            objH = c0292a;
        }
        C0292a c0292a2 = (C0292a) objH;
        c0510p.p(false);
        boolean zF2 = c0510p.f(jVar) | c0510p.h(c0292a2);
        Object objH2 = c0510p.H();
        if (zF2 || objH2 == obj) {
            objH2 = new g(jVar, c0292a2, null);
            c0510p.b0(objH2);
        }
        C0486d.f(c0292a2, jVar, (e4.n) objH2, c0510p);
        c0510p.p(false);
        return c0292a2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.a == fVar.a && T0.e.a(this.f4376b, fVar.f4376b) && this.f4377c.equals(fVar.f4377c);
    }

    public final int hashCode() {
        return this.f4377c.hashCode() + AbstractC0703b.b(this.f4376b, Boolean.hashCode(this.a) * 31, 31);
    }
}
