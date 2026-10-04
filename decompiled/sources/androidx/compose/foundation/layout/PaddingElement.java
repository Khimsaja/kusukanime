package androidx.compose.foundation.layout;

import T0.e;
import a0.p;
import b1.AbstractC0703b;
import kotlin.Metadata;
import v.X;
import y0.S;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/PaddingElement;", "Ly0/S;", "Lv/X;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class PaddingElement extends S {
    public final float a;

    /* renamed from: b, reason: collision with root package name */
    public final float f10580b;

    /* renamed from: c, reason: collision with root package name */
    public final float f10581c;

    /* renamed from: d, reason: collision with root package name */
    public final float f10582d;

    public PaddingElement(float f5, float f7, float f8, float f9) {
        this.a = f5;
        this.f10580b = f7;
        this.f10581c = f8;
        this.f10582d = f9;
        if ((f5 < 0.0f && !e.a(f5, Float.NaN)) || ((f7 < 0.0f && !e.a(f7, Float.NaN)) || ((f8 < 0.0f && !e.a(f8, Float.NaN)) || (f9 < 0.0f && !e.a(f9, Float.NaN))))) {
            throw new IllegalArgumentException("Padding must be non-negative");
        }
    }

    public final boolean equals(Object obj) {
        PaddingElement paddingElement = obj instanceof PaddingElement ? (PaddingElement) obj : null;
        return paddingElement != null && e.a(this.a, paddingElement.a) && e.a(this.f10580b, paddingElement.f10580b) && e.a(this.f10581c, paddingElement.f10581c) && e.a(this.f10582d, paddingElement.f10582d);
    }

    @Override // y0.S
    public final p h() {
        X x7 = new X();
        x7.f16420x = this.a;
        x7.f16421y = this.f10580b;
        x7.f16422z = this.f10581c;
        x7.f16418A = this.f10582d;
        x7.f16419B = true;
        return x7;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + AbstractC0703b.b(this.f10582d, AbstractC0703b.b(this.f10581c, AbstractC0703b.b(this.f10580b, Float.hashCode(this.a) * 31, 31), 31), 31);
    }

    @Override // y0.S
    public final void m(p pVar) {
        X x7 = (X) pVar;
        x7.f16420x = this.a;
        x7.f16421y = this.f10580b;
        x7.f16422z = this.f10581c;
        x7.f16418A = this.f10582d;
        x7.f16419B = true;
    }
}
