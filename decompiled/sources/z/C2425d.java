package z;

import O.C0486d;
import O.C0493g0;
import O.T;
import e4.InterfaceC0821a;

/* renamed from: z.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2425d extends C {

    /* renamed from: H, reason: collision with root package name */
    public static final L2.e f18447H = q0.c.F(C2423b.f18443l, C2424c.f18444m);

    /* renamed from: G, reason: collision with root package name */
    public final C0493g0 f18448G;

    public C2425d(int i7, float f5, InterfaceC0821a interfaceC0821a) {
        super(f5, i7);
        this.f18448G = C0486d.K(interfaceC0821a, T.f7049p);
    }

    @Override // z.C
    public final int l() {
        return ((Number) ((InterfaceC0821a) this.f18448G.getValue()).invoke()).intValue();
    }
}
