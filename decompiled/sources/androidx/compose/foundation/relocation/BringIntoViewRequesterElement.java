package androidx.compose.foundation.relocation;

import A.c;
import A.d;
import a0.p;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import y0.S;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/relocation/BringIntoViewRequesterElement;", "Ly0/S;", "LA/d;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class BringIntoViewRequesterElement extends S {
    public final c a;

    public BringIntoViewRequesterElement(c cVar) {
        this.a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BringIntoViewRequesterElement) {
            return l.a(this.a, ((BringIntoViewRequesterElement) obj).a);
        }
        return false;
    }

    @Override // y0.S
    public final p h() {
        d dVar = new d();
        dVar.f10x = this.a;
        return dVar;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // y0.S
    public final void m(p pVar) {
        d dVar = (d) pVar;
        c cVar = dVar.f10x;
        if (cVar != null) {
            cVar.a.m(dVar);
        }
        c cVar2 = this.a;
        if (cVar2 != null) {
            cVar2.a.b(dVar);
        }
        dVar.f10x = cVar2;
    }
}
