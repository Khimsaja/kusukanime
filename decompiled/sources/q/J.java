package q;

import y0.AbstractC2359f;
import y0.InterfaceC2369p;

/* loaded from: classes.dex */
public final class J extends a0.p implements y0.o0, InterfaceC2369p {

    /* renamed from: z, reason: collision with root package name */
    public static final b0 f14488z = new b0(5);

    /* renamed from: x, reason: collision with root package name */
    public boolean f14489x;

    /* renamed from: y, reason: collision with root package name */
    public y0.Y f14490y;

    @Override // y0.InterfaceC2369p
    public final void E(y0.Y y7) {
        K kG0;
        this.f14490y = y7;
        if (this.f14489x) {
            if (!y7.P0().f10414w) {
                K kG02 = G0();
                if (kG02 != null) {
                    kG02.G0(null);
                    return;
                }
                return;
            }
            y0.Y y8 = this.f14490y;
            if (y8 == null || !y8.P0().f10414w || (kG0 = G0()) == null) {
                return;
            }
            kG0.G0(this.f14490y);
        }
    }

    public final K G0() {
        if (!this.f10414w) {
            return null;
        }
        y0.o0 o0VarJ = AbstractC2359f.j(this, K.f14491y);
        if (o0VarJ instanceof K) {
            return (K) o0VarJ;
        }
        return null;
    }

    @Override // y0.o0
    public final Object p() {
        return f14488z;
    }

    @Override // a0.p
    public final boolean v0() {
        return false;
    }
}
