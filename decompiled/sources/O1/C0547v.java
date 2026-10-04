package O1;

import y1.C2380b;
import y1.C2401x;

/* renamed from: O1.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0547v extends y1.P {

    /* renamed from: b, reason: collision with root package name */
    public final C2401x f7497b;

    public C0547v(C2401x c2401x) {
        this.f7497b = c2401x;
    }

    @Override // y1.P
    public final int b(Object obj) {
        return obj == C0546u.f7494e ? 0 : -1;
    }

    @Override // y1.P
    public final y1.N f(int i7, y1.N n7, boolean z7) {
        n7.h(z7 ? 0 : null, z7 ? C0546u.f7494e : null, 0, -9223372036854775807L, 0L, C2380b.f18024c, true);
        return n7;
    }

    @Override // y1.P
    public final int h() {
        return 1;
    }

    @Override // y1.P
    public final Object l(int i7) {
        return C0546u.f7494e;
    }

    @Override // y1.P
    public final y1.O m(int i7, y1.O o7, long j7) {
        Object obj = y1.O.f17953p;
        o7.b(this.f7497b, false, true, null, 0L, -9223372036854775807L);
        o7.f17963j = true;
        return o7;
    }

    @Override // y1.P
    public final int o() {
        return 1;
    }
}
