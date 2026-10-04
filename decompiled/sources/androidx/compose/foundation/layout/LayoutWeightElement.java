package androidx.compose.foundation.layout;

import a0.p;
import kotlin.Metadata;
import v.V;
import y0.S;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/LayoutWeightElement;", "Ly0/S;", "Lv/V;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LayoutWeightElement extends S {
    public final float a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f10579b;

    public LayoutWeightElement(float f5, boolean z7) {
        this.a = f5;
        this.f10579b = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        LayoutWeightElement layoutWeightElement = obj instanceof LayoutWeightElement ? (LayoutWeightElement) obj : null;
        return layoutWeightElement != null && this.a == layoutWeightElement.a && this.f10579b == layoutWeightElement.f10579b;
    }

    @Override // y0.S
    public final p h() {
        V v5 = new V();
        v5.f16415x = this.a;
        v5.f16416y = this.f10579b;
        return v5;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f10579b) + (Float.hashCode(this.a) * 31);
    }

    @Override // y0.S
    public final void m(p pVar) {
        V v5 = (V) pVar;
        v5.f16415x = this.a;
        v5.f16416y = this.f10579b;
    }
}
