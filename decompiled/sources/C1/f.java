package C1;

import B1.AbstractC0015b;
import y1.B;

/* loaded from: classes.dex */
public final class f implements B {
    public final float a;

    /* renamed from: b, reason: collision with root package name */
    public final float f576b;

    public f(float f5, float f7) {
        AbstractC0015b.b("Invalid latitude or longitude", f5 >= -90.0f && f5 <= 90.0f && f7 >= -180.0f && f7 <= 180.0f);
        this.a = f5;
        this.f576b = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (this.a == fVar.a && this.f576b == fVar.f576b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.valueOf(this.f576b).hashCode() + ((Float.valueOf(this.a).hashCode() + 527) * 31);
    }

    public final String toString() {
        return "xyz: latitude=" + this.a + ", longitude=" + this.f576b;
    }
}
