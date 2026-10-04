package androidx.compose.foundation.gestures;

import L2.e;
import a0.p;
import b1.AbstractC0703b;
import e4.o;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import s.C1912f;
import s.EnumC1903a0;
import s.W;
import y0.S;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/DraggableElement;", "Ly0/S;", "Ls/W;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DraggableElement extends S {
    public final e a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f10565b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f10566c;

    /* renamed from: d, reason: collision with root package name */
    public final o f10567d;

    /* renamed from: e, reason: collision with root package name */
    public final o f10568e;

    public DraggableElement(e eVar, boolean z7, boolean z8, o oVar, o oVar2) {
        this.a = eVar;
        this.f10565b = z7;
        this.f10566c = z8;
        this.f10567d = oVar;
        this.f10568e = oVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DraggableElement.class != obj.getClass()) {
            return false;
        }
        DraggableElement draggableElement = (DraggableElement) obj;
        return l.a(this.a, draggableElement.a) && this.f10565b == draggableElement.f10565b && this.f10566c == draggableElement.f10566c && l.a(this.f10567d, draggableElement.f10567d) && l.a(this.f10568e, draggableElement.f10568e);
    }

    @Override // y0.S
    public final p h() {
        C1912f c1912f = C1912f.f15299n;
        EnumC1903a0 enumC1903a0 = EnumC1903a0.f15259k;
        W w7 = new W(c1912f, this.f10565b, null, enumC1903a0);
        w7.f15229H = this.a;
        w7.I = enumC1903a0;
        w7.J = this.f10566c;
        w7.f15230K = this.f10567d;
        w7.f15231L = this.f10568e;
        return w7;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + ((this.f10568e.hashCode() + ((this.f10567d.hashCode() + AbstractC0703b.d(AbstractC0703b.d((EnumC1903a0.f15259k.hashCode() + (this.a.hashCode() * 31)) * 31, 961, this.f10565b), 31, this.f10566c)) * 31)) * 31);
    }

    @Override // y0.S
    public final void m(p pVar) {
        boolean z7;
        boolean z8;
        W w7 = (W) pVar;
        C1912f c1912f = C1912f.f15299n;
        e eVar = w7.f15229H;
        e eVar2 = this.a;
        if (l.a(eVar, eVar2)) {
            z7 = false;
        } else {
            w7.f15229H = eVar2;
            z7 = true;
        }
        EnumC1903a0 enumC1903a0 = w7.I;
        EnumC1903a0 enumC1903a02 = EnumC1903a0.f15259k;
        if (enumC1903a0 != enumC1903a02) {
            w7.I = enumC1903a02;
            z8 = true;
        } else {
            z8 = z7;
        }
        w7.f15230K = this.f10567d;
        w7.f15231L = this.f10568e;
        w7.J = this.f10566c;
        w7.R0(c1912f, this.f10565b, null, enumC1903a02, z8);
    }
}
