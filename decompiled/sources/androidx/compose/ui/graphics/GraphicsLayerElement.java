package androidx.compose.ui.graphics;

import D.C0042b;
import a0.p;
import b1.AbstractC0703b;
import h0.C0974T;
import h0.C0976V;
import h0.C0998u;
import h0.InterfaceC0973S;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import y0.AbstractC2359f;
import y0.S;
import y0.Y;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/GraphicsLayerElement;", "Ly0/S;", "Lh0/T;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class GraphicsLayerElement extends S {
    public final float a;

    /* renamed from: b, reason: collision with root package name */
    public final float f10659b;

    /* renamed from: c, reason: collision with root package name */
    public final long f10660c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0973S f10661d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f10662e;

    /* renamed from: f, reason: collision with root package name */
    public final long f10663f;

    /* renamed from: g, reason: collision with root package name */
    public final long f10664g;

    public GraphicsLayerElement(float f5, float f7, long j7, InterfaceC0973S interfaceC0973S, boolean z7, long j8, long j9) {
        this.a = f5;
        this.f10659b = f7;
        this.f10660c = j7;
        this.f10661d = interfaceC0973S;
        this.f10662e = z7;
        this.f10663f = j8;
        this.f10664g = j9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GraphicsLayerElement)) {
            return false;
        }
        GraphicsLayerElement graphicsLayerElement = (GraphicsLayerElement) obj;
        graphicsLayerElement.getClass();
        return Float.compare(1.0f, 1.0f) == 0 && Float.compare(1.0f, 1.0f) == 0 && Float.compare(this.a, graphicsLayerElement.a) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(this.f10659b, graphicsLayerElement.f10659b) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(8.0f, 8.0f) == 0 && C0976V.a(this.f10660c, graphicsLayerElement.f10660c) && l.a(this.f10661d, graphicsLayerElement.f10661d) && this.f10662e == graphicsLayerElement.f10662e && C0998u.c(this.f10663f, graphicsLayerElement.f10663f) && C0998u.c(this.f10664g, graphicsLayerElement.f10664g);
    }

    @Override // y0.S
    public final p h() {
        C0974T c0974t = new C0974T();
        c0974t.f11812x = 1.0f;
        c0974t.f11813y = 1.0f;
        c0974t.f11814z = this.a;
        c0974t.f11804A = this.f10659b;
        c0974t.f11805B = 8.0f;
        c0974t.f11806C = this.f10660c;
        c0974t.f11807D = this.f10661d;
        c0974t.f11808E = this.f10662e;
        c0974t.f11809F = this.f10663f;
        c0974t.f11810G = this.f10664g;
        c0974t.f11811H = new C0042b(26, c0974t);
        return c0974t;
    }

    public final int hashCode() {
        int iB = AbstractC0703b.b(8.0f, AbstractC0703b.b(0.0f, AbstractC0703b.b(0.0f, AbstractC0703b.b(0.0f, AbstractC0703b.b(this.f10659b, AbstractC0703b.b(0.0f, AbstractC0703b.b(0.0f, AbstractC0703b.b(this.a, AbstractC0703b.b(1.0f, Float.hashCode(1.0f) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        int i7 = C0976V.f11816c;
        int iD = AbstractC0703b.d((this.f10661d.hashCode() + AbstractC0703b.c(iB, 31, this.f10660c)) * 31, 961, this.f10662e);
        int i8 = C0998u.f11835h;
        return Integer.hashCode(0) + AbstractC0703b.c(AbstractC0703b.c(iD, 31, this.f10663f), 31, this.f10664g);
    }

    @Override // y0.S
    public final void m(p pVar) {
        C0974T c0974t = (C0974T) pVar;
        c0974t.f11812x = 1.0f;
        c0974t.f11813y = 1.0f;
        c0974t.f11814z = this.a;
        c0974t.f11804A = this.f10659b;
        c0974t.f11805B = 8.0f;
        c0974t.f11806C = this.f10660c;
        c0974t.f11807D = this.f10661d;
        c0974t.f11808E = this.f10662e;
        c0974t.f11809F = this.f10663f;
        c0974t.f11810G = this.f10664g;
        Y y7 = AbstractC2359f.t(c0974t, 2).f17826w;
        if (y7 != null) {
            y7.k1(true, c0974t.f11811H);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GraphicsLayerElement(scaleX=1.0, scaleY=1.0, alpha=");
        sb.append(this.a);
        sb.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sb.append(this.f10659b);
        sb.append(", rotationX=0.0, rotationY=0.0, rotationZ=0.0, cameraDistance=8.0, transformOrigin=");
        sb.append((Object) C0976V.d(this.f10660c));
        sb.append(", shape=");
        sb.append(this.f10661d);
        sb.append(", clip=");
        sb.append(this.f10662e);
        sb.append(", renderEffect=null, ambientShadowColor=");
        AbstractC0703b.x(this.f10663f, ", spotShadowColor=", sb);
        sb.append((Object) C0998u.i(this.f10664g));
        sb.append(", compositingStrategy=CompositingStrategy(value=0))");
        return sb.toString();
    }
}
