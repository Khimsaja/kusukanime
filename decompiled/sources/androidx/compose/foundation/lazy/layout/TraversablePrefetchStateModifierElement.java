package androidx.compose.foundation.lazy.layout;

import a0.p;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import y.C2306F;
import y.C2319T;
import y0.S;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/layout/TraversablePrefetchStateModifierElement;", "Ly0/S;", "Ly/T;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class TraversablePrefetchStateModifierElement extends S {
    public final C2306F a;

    public TraversablePrefetchStateModifierElement(C2306F c2306f) {
        this.a = c2306f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TraversablePrefetchStateModifierElement) && l.a(this.a, ((TraversablePrefetchStateModifierElement) obj).a);
    }

    @Override // y0.S
    public final p h() {
        C2319T c2319t = new C2319T();
        c2319t.f17607x = this.a;
        return c2319t;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // y0.S
    public final void m(p pVar) {
        ((C2319T) pVar).f17607x = this.a;
    }

    public final String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.a + ')';
    }
}
