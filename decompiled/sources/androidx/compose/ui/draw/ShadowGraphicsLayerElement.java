package androidx.compose.ui.draw;

import D.C0042b;
import T0.e;
import a0.p;
import b1.AbstractC0703b;
import h0.C0992o;
import h0.C0998u;
import h0.InterfaceC0973S;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import r.h;
import y0.AbstractC2359f;
import y0.S;
import y0.Y;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;", "Ly0/S;", "Lh0/o;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ShadowGraphicsLayerElement extends S {
    public final InterfaceC0973S a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f10647b;

    /* renamed from: c, reason: collision with root package name */
    public final long f10648c;

    /* renamed from: d, reason: collision with root package name */
    public final long f10649d;

    public ShadowGraphicsLayerElement(InterfaceC0973S interfaceC0973S, boolean z7, long j7, long j8) {
        float f5 = h.a;
        this.a = interfaceC0973S;
        this.f10647b = z7;
        this.f10648c = j7;
        this.f10649d = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShadowGraphicsLayerElement)) {
            return false;
        }
        ShadowGraphicsLayerElement shadowGraphicsLayerElement = (ShadowGraphicsLayerElement) obj;
        shadowGraphicsLayerElement.getClass();
        float f5 = h.f14767d;
        return e.a(f5, f5) && l.a(this.a, shadowGraphicsLayerElement.a) && this.f10647b == shadowGraphicsLayerElement.f10647b && C0998u.c(this.f10648c, shadowGraphicsLayerElement.f10648c) && C0998u.c(this.f10649d, shadowGraphicsLayerElement.f10649d);
    }

    @Override // y0.S
    public final p h() {
        return new C0992o(new C0042b(25, this));
    }

    public final int hashCode() {
        int iD = AbstractC0703b.d((this.a.hashCode() + (Float.hashCode(h.f14767d) * 31)) * 31, 31, this.f10647b);
        int i7 = C0998u.f11835h;
        return Long.hashCode(this.f10649d) + AbstractC0703b.c(iD, 31, this.f10648c);
    }

    @Override // y0.S
    public final void m(p pVar) {
        C0992o c0992o = (C0992o) pVar;
        c0992o.f11827x = new C0042b(25, this);
        Y y7 = AbstractC2359f.t(c0992o, 2).f17826w;
        if (y7 != null) {
            y7.k1(true, c0992o.f11827x);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShadowGraphicsLayerElement(elevation=");
        sb.append((Object) e.b(h.f14767d));
        sb.append(", shape=");
        sb.append(this.a);
        sb.append(", clip=");
        sb.append(this.f10647b);
        sb.append(", ambientColor=");
        AbstractC0703b.x(this.f10648c, ", spotColor=", sb);
        sb.append((Object) C0998u.i(this.f10649d));
        sb.append(')');
        return sb.toString();
    }
}
