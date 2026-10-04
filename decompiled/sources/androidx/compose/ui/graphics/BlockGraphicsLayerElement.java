package androidx.compose.ui.graphics;

import a0.p;
import e4.k;
import h0.C0992o;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import y0.AbstractC2359f;
import y0.S;
import y0.Y;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/BlockGraphicsLayerElement;", "Ly0/S;", "Lh0/o;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class BlockGraphicsLayerElement extends S {
    public final k a;

    public BlockGraphicsLayerElement(k kVar) {
        this.a = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BlockGraphicsLayerElement) && l.a(this.a, ((BlockGraphicsLayerElement) obj).a);
    }

    @Override // y0.S
    public final p h() {
        return new C0992o(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // y0.S
    public final void m(p pVar) {
        C0992o c0992o = (C0992o) pVar;
        c0992o.f11827x = this.a;
        Y y7 = AbstractC2359f.t(c0992o, 2).f17826w;
        if (y7 != null) {
            y7.k1(true, c0992o.f11827x);
        }
    }

    public final String toString() {
        return "BlockGraphicsLayerElement(block=" + this.a + ')';
    }
}
