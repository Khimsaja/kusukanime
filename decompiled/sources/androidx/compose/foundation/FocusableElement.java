package androidx.compose.foundation;

import a0.p;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import q.H;
import u.k;
import y0.S;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/FocusableElement;", "Ly0/S;", "Lq/H;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class FocusableElement extends S {
    public final k a;

    public FocusableElement(k kVar) {
        this.a = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FocusableElement) {
            return l.a(this.a, ((FocusableElement) obj).a);
        }
        return false;
    }

    @Override // y0.S
    public final p h() {
        return new H(this.a);
    }

    public final int hashCode() {
        k kVar = this.a;
        if (kVar != null) {
            return kVar.hashCode();
        }
        return 0;
    }

    @Override // y0.S
    public final void m(p pVar) {
        ((H) pVar).J0(this.a);
    }
}
