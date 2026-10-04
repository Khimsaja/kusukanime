package androidx.compose.material3.internal;

import M.C0460s;
import M.C0462u;
import a0.p;
import e4.n;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import s.EnumC1903a0;
import y0.S;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¨\u0006\u0004"}, d2 = {"Landroidx/compose/material3/internal/DraggableAnchorsElement;", "T", "Ly0/S;", "LM/u;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class DraggableAnchorsElement<T> extends S {
    public final C0460s a;

    /* renamed from: b, reason: collision with root package name */
    public final n f10645b;

    public DraggableAnchorsElement(C0460s c0460s, n nVar) {
        this.a = c0460s;
        this.f10645b = nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DraggableAnchorsElement)) {
            return false;
        }
        DraggableAnchorsElement draggableAnchorsElement = (DraggableAnchorsElement) obj;
        return l.a(this.a, draggableAnchorsElement.a) && this.f10645b == draggableAnchorsElement.f10645b;
    }

    @Override // y0.S
    public final p h() {
        C0462u c0462u = new C0462u();
        c0462u.f6346x = this.a;
        c0462u.f6347y = this.f10645b;
        c0462u.f6348z = EnumC1903a0.f15259k;
        return c0462u;
    }

    public final int hashCode() {
        return EnumC1903a0.f15259k.hashCode() + ((this.f10645b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    @Override // y0.S
    public final void m(p pVar) {
        C0462u c0462u = (C0462u) pVar;
        c0462u.f6346x = this.a;
        c0462u.f6347y = this.f10645b;
        c0462u.f6348z = EnumC1903a0.f15259k;
    }
}
