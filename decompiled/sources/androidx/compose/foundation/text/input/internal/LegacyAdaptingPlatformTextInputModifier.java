package androidx.compose.foundation.text.input.internal;

import D.C0053g0;
import F.C0144g;
import F.y;
import a0.p;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import y0.S;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/input/internal/LegacyAdaptingPlatformTextInputModifier;", "Ly0/S;", "LF/y;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class LegacyAdaptingPlatformTextInputModifier extends S {
    public final C0144g a;

    /* renamed from: b, reason: collision with root package name */
    public final C0053g0 f10630b;

    /* renamed from: c, reason: collision with root package name */
    public final H.S f10631c;

    public LegacyAdaptingPlatformTextInputModifier(C0144g c0144g, C0053g0 c0053g0, H.S s7) {
        this.a = c0144g;
        this.f10630b = c0053g0;
        this.f10631c = s7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LegacyAdaptingPlatformTextInputModifier)) {
            return false;
        }
        LegacyAdaptingPlatformTextInputModifier legacyAdaptingPlatformTextInputModifier = (LegacyAdaptingPlatformTextInputModifier) obj;
        return l.a(this.a, legacyAdaptingPlatformTextInputModifier.a) && l.a(this.f10630b, legacyAdaptingPlatformTextInputModifier.f10630b) && l.a(this.f10631c, legacyAdaptingPlatformTextInputModifier.f10631c);
    }

    @Override // y0.S
    public final p h() {
        H.S s7 = this.f10631c;
        return new y(this.a, this.f10630b, s7);
    }

    public final int hashCode() {
        return this.f10631c.hashCode() + ((this.f10630b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    @Override // y0.S
    public final void m(p pVar) {
        y yVar = (y) pVar;
        if (yVar.f10414w) {
            yVar.f2043x.f();
            yVar.f2043x.k(yVar);
        }
        C0144g c0144g = this.a;
        yVar.f2043x = c0144g;
        if (yVar.f10414w) {
            if (c0144g.a != null) {
                throw new IllegalStateException("Expected textInputModifierNode to be null");
            }
            c0144g.a = yVar;
        }
        yVar.f2044y = this.f10630b;
        yVar.f2045z = this.f10631c;
    }

    public final String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.a + ", legacyTextFieldState=" + this.f10630b + ", textFieldSelectionManager=" + this.f10631c + ')';
    }
}
