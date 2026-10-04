package androidx.compose.foundation.layout;

import a0.p;
import kotlin.Metadata;
import p.AbstractC1755i;
import v.C2146z;
import y0.S;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/FillElement;", "Ly0/S;", "Lv/z;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FillElement extends S {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final float f10578b;

    public FillElement(float f5, int i7) {
        this.a = i7;
        this.f10578b = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FillElement)) {
            return false;
        }
        FillElement fillElement = (FillElement) obj;
        return this.a == fillElement.a && this.f10578b == fillElement.f10578b;
    }

    @Override // y0.S
    public final p h() {
        C2146z c2146z = new C2146z();
        c2146z.f16517x = this.a;
        c2146z.f16518y = this.f10578b;
        return c2146z;
    }

    public final int hashCode() {
        return Float.hashCode(this.f10578b) + (AbstractC1755i.b(this.a) * 31);
    }

    @Override // y0.S
    public final void m(p pVar) {
        C2146z c2146z = (C2146z) pVar;
        c2146z.f16517x = this.a;
        c2146z.f16518y = this.f10578b;
    }
}
