package androidx.compose.ui.draw;

import a0.p;
import e0.C0810b;
import e0.C0811c;
import e4.k;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import y0.S;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draw/DrawWithCacheElement;", "Ly0/S;", "Le0/b;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class DrawWithCacheElement extends S {
    public final k a;

    public DrawWithCacheElement(k kVar) {
        this.a = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawWithCacheElement) && l.a(this.a, ((DrawWithCacheElement) obj).a);
    }

    @Override // y0.S
    public final p h() {
        return new C0810b(new C0811c(), this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // y0.S
    public final void m(p pVar) {
        C0810b c0810b = (C0810b) pVar;
        c0810b.f11334z = this.a;
        c0810b.G0();
    }

    public final String toString() {
        return "DrawWithCacheElement(onBuildDrawCache=" + this.a + ')';
    }
}
