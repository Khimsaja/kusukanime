package androidx.compose.ui.draw;

import a0.p;
import e0.C0814f;
import e4.k;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import y0.S;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draw/DrawWithContentElement;", "Ly0/S;", "Le0/f;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class DrawWithContentElement extends S {
    public final k a;

    public DrawWithContentElement(k kVar) {
        this.a = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawWithContentElement) && l.a(this.a, ((DrawWithContentElement) obj).a);
    }

    @Override // y0.S
    public final p h() {
        C0814f c0814f = new C0814f();
        c0814f.f11338x = this.a;
        return c0814f;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // y0.S
    public final void m(p pVar) {
        ((C0814f) pVar).f11338x = this.a;
    }

    public final String toString() {
        return "DrawWithContentElement(onDraw=" + this.a + ')';
    }
}
