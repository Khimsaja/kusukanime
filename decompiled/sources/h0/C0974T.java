package h0;

import D.C0042b;
import b1.AbstractC0703b;
import w0.InterfaceC2172G;
import w0.InterfaceC2174I;
import w0.InterfaceC2175J;
import y0.InterfaceC2375w;

/* renamed from: h0.T, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0974T extends a0.p implements InterfaceC2375w {

    /* renamed from: A, reason: collision with root package name */
    public float f11804A;

    /* renamed from: B, reason: collision with root package name */
    public float f11805B;

    /* renamed from: C, reason: collision with root package name */
    public long f11806C;

    /* renamed from: D, reason: collision with root package name */
    public InterfaceC0973S f11807D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f11808E;

    /* renamed from: F, reason: collision with root package name */
    public long f11809F;

    /* renamed from: G, reason: collision with root package name */
    public long f11810G;

    /* renamed from: H, reason: collision with root package name */
    public C0042b f11811H;

    /* renamed from: x, reason: collision with root package name */
    public float f11812x;

    /* renamed from: y, reason: collision with root package name */
    public float f11813y;

    /* renamed from: z, reason: collision with root package name */
    public float f11814z;

    @Override // y0.InterfaceC2375w
    public final InterfaceC2174I e(InterfaceC2175J interfaceC2175J, InterfaceC2172G interfaceC2172G, long j7) {
        w0.S sB = interfaceC2172G.b(j7);
        return interfaceC2175J.T(sB.f16840k, sB.f16841l, P3.z.f7780k, new A3.t(27, sB, this));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimpleGraphicsLayerModifier(scaleX=");
        sb.append(this.f11812x);
        sb.append(", scaleY=");
        sb.append(this.f11813y);
        sb.append(", alpha = ");
        sb.append(this.f11814z);
        sb.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sb.append(this.f11804A);
        sb.append(", rotationX=0.0, rotationY=0.0, rotationZ=0.0, cameraDistance=");
        sb.append(this.f11805B);
        sb.append(", transformOrigin=");
        sb.append((Object) C0976V.d(this.f11806C));
        sb.append(", shape=");
        sb.append(this.f11807D);
        sb.append(", clip=");
        sb.append(this.f11808E);
        sb.append(", renderEffect=null, ambientShadowColor=");
        AbstractC0703b.x(this.f11809F, ", spotShadowColor=", sb);
        sb.append((Object) C0998u.i(this.f11810G));
        sb.append(", compositingStrategy=CompositingStrategy(value=0))");
        return sb.toString();
    }

    @Override // a0.p
    public final boolean v0() {
        return false;
    }
}
