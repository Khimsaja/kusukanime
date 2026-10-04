package androidx.compose.foundation;

import F0.t;
import H.X;
import H.Y;
import a0.p;
import android.view.View;
import b1.AbstractC0703b;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import q.V;
import q.W;
import q.g0;
import y0.AbstractC2359f;
import y0.S;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/MagnifierElement;", "Ly0/S;", "Lq/V;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MagnifierElement extends S {
    public final X a;

    /* renamed from: b, reason: collision with root package name */
    public final Y f10557b;

    /* renamed from: c, reason: collision with root package name */
    public final g0 f10558c;

    public MagnifierElement(X x7, Y y7, g0 g0Var) {
        this.a = x7;
        this.f10557b = y7;
        this.f10558c = g0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MagnifierElement)) {
            return false;
        }
        X x7 = ((MagnifierElement) obj).a;
        return false;
    }

    @Override // y0.S
    public final p h() {
        return new V(this.a, this.f10557b, this.f10558c);
    }

    public final int hashCode() {
        return this.f10558c.hashCode() + ((this.f10557b.hashCode() + AbstractC0703b.d(AbstractC0703b.b(Float.NaN, AbstractC0703b.b(Float.NaN, AbstractC0703b.c(AbstractC0703b.d(AbstractC0703b.b(Float.NaN, this.a.hashCode() * 961, 31), 31, true), 31, 9205357640488583168L), 31), 31), 31, true)) * 31);
    }

    @Override // y0.S
    public final void m(p pVar) {
        V v5 = (V) pVar;
        v5.getClass();
        g0 g0Var = v5.f14512z;
        View view = v5.f14502A;
        T0.b bVar = v5.f14503B;
        v5.f14510x = this.a;
        v5.f14511y = this.f10557b;
        g0 g0Var2 = this.f10558c;
        v5.f14512z = g0Var2;
        View viewX = AbstractC2359f.x(v5);
        T0.b bVar2 = AbstractC2359f.v(v5).f17655B;
        if (v5.f14504C != null) {
            t tVar = W.a;
            if (((!Float.isNaN(Float.NaN) || !Float.isNaN(Float.NaN)) && !g0Var2.a()) || !T0.e.a(Float.NaN, Float.NaN) || !T0.e.a(Float.NaN, Float.NaN) || !g0Var2.equals(g0Var) || !viewX.equals(view) || !l.a(bVar2, bVar)) {
                v5.H0();
            }
        }
        v5.I0();
    }
}
