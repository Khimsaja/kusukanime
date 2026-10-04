package k2;

import y1.B;

/* renamed from: k2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1389d implements B {
    public final float a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12663b;

    public C1389d(float f5, int i7) {
        this.a = f5;
        this.f12663b = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1389d.class == obj.getClass()) {
            C1389d c1389d = (C1389d) obj;
            if (this.a == c1389d.a && this.f12663b == c1389d.f12663b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.a).hashCode() + 527) * 31) + this.f12663b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.a + ", svcTemporalLayerCount=" + this.f12663b;
    }
}
