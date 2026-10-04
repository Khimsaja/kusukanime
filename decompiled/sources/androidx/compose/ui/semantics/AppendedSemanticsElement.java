package androidx.compose.ui.semantics;

import F0.c;
import F0.i;
import F0.j;
import a0.p;
import e4.k;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import y0.S;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/semantics/AppendedSemanticsElement;", "Ly0/S;", "LF0/c;", "LF0/j;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class AppendedSemanticsElement extends S implements j {
    public final boolean a;

    /* renamed from: b, reason: collision with root package name */
    public final k f10674b;

    public AppendedSemanticsElement(boolean z7, k kVar) {
        this.a = z7;
        this.f10674b = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppendedSemanticsElement)) {
            return false;
        }
        AppendedSemanticsElement appendedSemanticsElement = (AppendedSemanticsElement) obj;
        return this.a == appendedSemanticsElement.a && l.a(this.f10674b, appendedSemanticsElement.f10674b);
    }

    @Override // y0.S
    public final p h() {
        return new c(this.a, false, this.f10674b);
    }

    public final int hashCode() {
        return this.f10674b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    @Override // F0.j
    public final i l() {
        i iVar = new i();
        iVar.f2097l = this.a;
        this.f10674b.invoke(iVar);
        return iVar;
    }

    @Override // y0.S
    public final void m(p pVar) {
        c cVar = (c) pVar;
        cVar.f2064x = this.a;
        cVar.f2066z = this.f10674b;
    }

    public final String toString() {
        return "AppendedSemanticsElement(mergeDescendants=" + this.a + ", properties=" + this.f10674b + ')';
    }
}
