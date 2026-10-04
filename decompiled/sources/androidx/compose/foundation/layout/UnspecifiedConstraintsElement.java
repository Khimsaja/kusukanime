package androidx.compose.foundation.layout;

import T0.e;
import a0.p;
import kotlin.Metadata;
import v.k0;
import y0.S;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/UnspecifiedConstraintsElement;", "Ly0/S;", "Lv/k0;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class UnspecifiedConstraintsElement extends S {
    public final float a;

    /* renamed from: b, reason: collision with root package name */
    public final float f10587b;

    public UnspecifiedConstraintsElement(float f5, float f7) {
        this.a = f5;
        this.f10587b = f7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UnspecifiedConstraintsElement)) {
            return false;
        }
        UnspecifiedConstraintsElement unspecifiedConstraintsElement = (UnspecifiedConstraintsElement) obj;
        return e.a(this.a, unspecifiedConstraintsElement.a) && e.a(this.f10587b, unspecifiedConstraintsElement.f10587b);
    }

    @Override // y0.S
    public final p h() {
        k0 k0Var = new k0();
        k0Var.f16456x = this.a;
        k0Var.f16457y = this.f10587b;
        return k0Var;
    }

    public final int hashCode() {
        return Float.hashCode(this.f10587b) + (Float.hashCode(this.a) * 31);
    }

    @Override // y0.S
    public final void m(p pVar) {
        k0 k0Var = (k0) pVar;
        k0Var.f16456x = this.a;
        k0Var.f16457y = this.f10587b;
    }
}
