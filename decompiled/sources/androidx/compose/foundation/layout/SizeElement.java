package androidx.compose.foundation.layout;

import T0.e;
import a0.p;
import b1.AbstractC0703b;
import kotlin.Metadata;
import v.i0;
import y0.S;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/SizeElement;", "Ly0/S;", "Lv/i0;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class SizeElement extends S {
    public final float a;

    /* renamed from: b, reason: collision with root package name */
    public final float f10583b;

    /* renamed from: c, reason: collision with root package name */
    public final float f10584c;

    /* renamed from: d, reason: collision with root package name */
    public final float f10585d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f10586e;

    public SizeElement(float f5, float f7, float f8, float f9, boolean z7) {
        this.a = f5;
        this.f10583b = f7;
        this.f10584c = f8;
        this.f10585d = f9;
        this.f10586e = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeElement)) {
            return false;
        }
        SizeElement sizeElement = (SizeElement) obj;
        return e.a(this.a, sizeElement.a) && e.a(this.f10583b, sizeElement.f10583b) && e.a(this.f10584c, sizeElement.f10584c) && e.a(this.f10585d, sizeElement.f10585d) && this.f10586e == sizeElement.f10586e;
    }

    @Override // y0.S
    public final p h() {
        i0 i0Var = new i0();
        i0Var.f16450x = this.a;
        i0Var.f16451y = this.f10583b;
        i0Var.f16452z = this.f10584c;
        i0Var.f16448A = this.f10585d;
        i0Var.f16449B = this.f10586e;
        return i0Var;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f10586e) + AbstractC0703b.b(this.f10585d, AbstractC0703b.b(this.f10584c, AbstractC0703b.b(this.f10583b, Float.hashCode(this.a) * 31, 31), 31), 31);
    }

    @Override // y0.S
    public final void m(p pVar) {
        i0 i0Var = (i0) pVar;
        i0Var.f16450x = this.a;
        i0Var.f16451y = this.f10583b;
        i0Var.f16452z = this.f10584c;
        i0Var.f16448A = this.f10585d;
        i0Var.f16449B = this.f10586e;
    }

    public /* synthetic */ SizeElement(float f5, float f7, float f8, float f9, int i7) {
        this((i7 & 1) != 0 ? Float.NaN : f5, (i7 & 2) != 0 ? Float.NaN : f7, (i7 & 4) != 0 ? Float.NaN : f8, (i7 & 8) != 0 ? Float.NaN : f9, true);
    }
}
