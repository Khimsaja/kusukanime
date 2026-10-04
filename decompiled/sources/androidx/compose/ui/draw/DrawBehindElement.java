package androidx.compose.ui.draw;

import a0.p;
import e0.C0812d;
import e4.k;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import y0.S;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draw/DrawBehindElement;", "Ly0/S;", "Le0/d;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class DrawBehindElement extends S {
    public final k a;

    public DrawBehindElement(k kVar) {
        this.a = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawBehindElement) && l.a(this.a, ((DrawBehindElement) obj).a);
    }

    @Override // y0.S
    public final p h() {
        C0812d c0812d = new C0812d();
        c0812d.f11337x = this.a;
        return c0812d;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // y0.S
    public final void m(p pVar) {
        ((C0812d) pVar).f11337x = this.a;
    }

    public final String toString() {
        return "DrawBehindElement(onDraw=" + this.a + ')';
    }
}
