package androidx.compose.foundation;

import a0.p;
import e0.C0810b;
import h0.C0975U;
import h0.InterfaceC0973S;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import q.C1836s;
import y0.S;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/BorderModifierNodeElement;", "Ly0/S;", "Lq/s;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class BorderModifierNodeElement extends S {
    public final float a;

    /* renamed from: b, reason: collision with root package name */
    public final C0975U f10549b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0973S f10550c;

    public BorderModifierNodeElement(float f5, C0975U c0975u, InterfaceC0973S interfaceC0973S) {
        this.a = f5;
        this.f10549b = c0975u;
        this.f10550c = interfaceC0973S;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderModifierNodeElement)) {
            return false;
        }
        BorderModifierNodeElement borderModifierNodeElement = (BorderModifierNodeElement) obj;
        return T0.e.a(this.a, borderModifierNodeElement.a) && this.f10549b.equals(borderModifierNodeElement.f10549b) && l.a(this.f10550c, borderModifierNodeElement.f10550c);
    }

    @Override // y0.S
    public final p h() {
        return new C1836s(this.a, this.f10549b, this.f10550c);
    }

    public final int hashCode() {
        return this.f10550c.hashCode() + ((this.f10549b.hashCode() + (Float.hashCode(this.a) * 31)) * 31);
    }

    @Override // y0.S
    public final void m(p pVar) {
        C1836s c1836s = (C1836s) pVar;
        float f5 = c1836s.f14623A;
        float f7 = this.a;
        boolean zA = T0.e.a(f5, f7);
        C0810b c0810b = c1836s.f14626D;
        if (!zA) {
            c1836s.f14623A = f7;
            c0810b.G0();
        }
        C0975U c0975u = c1836s.f14624B;
        C0975U c0975u2 = this.f10549b;
        if (!l.a(c0975u, c0975u2)) {
            c1836s.f14624B = c0975u2;
            c0810b.G0();
        }
        InterfaceC0973S interfaceC0973S = c1836s.f14625C;
        InterfaceC0973S interfaceC0973S2 = this.f10550c;
        if (l.a(interfaceC0973S, interfaceC0973S2)) {
            return;
        }
        c1836s.f14625C = interfaceC0973S2;
        c0810b.G0();
    }

    public final String toString() {
        return "BorderModifierNodeElement(width=" + ((Object) T0.e.b(this.a)) + ", brush=" + this.f10549b + ", shape=" + this.f10550c + ')';
    }
}
