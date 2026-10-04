package w0;

import z0.C2471u;

/* renamed from: w0.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2170E extends AbstractC2182Q {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16832b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f16833c;

    public /* synthetic */ C2170E(int i7, Object obj) {
        this.f16832b = i7;
        this.f16833c = obj;
    }

    @Override // w0.AbstractC2182Q
    public final T0.k b() {
        switch (this.f16832b) {
            case 0:
                return ((y0.N) this.f16833c).getLayoutDirection();
            default:
                return ((C2471u) this.f16833c).getLayoutDirection();
        }
    }

    @Override // w0.AbstractC2182Q
    public final int c() {
        switch (this.f16832b) {
            case 0:
                return ((y0.N) this.f16833c).h0();
            default:
                return ((C2471u) this.f16833c).getRoot().f17661H.f17761r.f16840k;
        }
    }
}
