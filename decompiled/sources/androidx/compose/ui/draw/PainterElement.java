package androidx.compose.ui.draw;

import a0.b;
import a0.i;
import a0.p;
import b1.AbstractC0703b;
import e0.C0816h;
import g0.f;
import h0.C0990m;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import n0.C1532C;
import w0.C2191i;
import y0.AbstractC2359f;
import y0.S;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draw/PainterElement;", "Ly0/S;", "Le0/h;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class PainterElement extends S {
    public final C1532C a;

    /* renamed from: b, reason: collision with root package name */
    public final C0990m f10646b;

    public PainterElement(C1532C c1532c, C0990m c0990m) {
        this.a = c1532c;
        this.f10646b = c0990m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PainterElement)) {
            return false;
        }
        PainterElement painterElement = (PainterElement) obj;
        if (!l.a(this.a, painterElement.a)) {
            return false;
        }
        i iVar = b.f10385o;
        if (!iVar.equals(iVar)) {
            return false;
        }
        Object obj2 = C2191i.f16865b;
        return obj2.equals(obj2) && Float.compare(1.0f, 1.0f) == 0 && l.a(this.f10646b, painterElement.f10646b);
    }

    @Override // y0.S
    public final p h() {
        C0816h c0816h = new C0816h();
        c0816h.f11344x = this.a;
        c0816h.f11345y = true;
        c0816h.f11346z = b.f10385o;
        c0816h.f11341A = C2191i.f16865b;
        c0816h.f11342B = 1.0f;
        c0816h.f11343C = this.f10646b;
        return c0816h;
    }

    public final int hashCode() {
        int iB = AbstractC0703b.b(1.0f, (C2191i.f16865b.hashCode() + ((Float.hashCode(0.0f) + (Float.hashCode(0.0f) * 31) + AbstractC0703b.d(this.a.hashCode() * 31, 31, true)) * 31)) * 31, 31);
        C0990m c0990m = this.f10646b;
        return iB + (c0990m == null ? 0 : c0990m.hashCode());
    }

    @Override // y0.S
    public final void m(p pVar) {
        C0816h c0816h = (C0816h) pVar;
        boolean z7 = c0816h.f11345y;
        C1532C c1532c = this.a;
        boolean z8 = (z7 && f.a(c0816h.f11344x.h(), c1532c.h())) ? false : true;
        c0816h.f11344x = c1532c;
        c0816h.f11345y = true;
        c0816h.f11346z = b.f10385o;
        c0816h.f11341A = C2191i.f16865b;
        c0816h.f11342B = 1.0f;
        c0816h.f11343C = this.f10646b;
        if (z8) {
            AbstractC2359f.o(c0816h);
        }
        AbstractC2359f.n(c0816h);
    }

    public final String toString() {
        return "PainterElement(painter=" + this.a + ", sizeToIntrinsics=true, alignment=" + b.f10385o + ", contentScale=" + C2191i.f16865b + ", alpha=1.0, colorFilter=" + this.f10646b + ')';
    }
}
