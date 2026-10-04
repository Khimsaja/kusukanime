package y1;

import B1.AbstractC0015b;
import java.util.Locale;

/* loaded from: classes.dex */
public final class G {

    /* renamed from: d, reason: collision with root package name */
    public static final G f17936d = new G(1.0f, 1.0f);
    public final float a;

    /* renamed from: b, reason: collision with root package name */
    public final float f17937b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17938c;

    static {
        B1.K.B(0);
        B1.K.B(1);
    }

    public G(float f5, float f7) {
        AbstractC0015b.c(f5 > 0.0f);
        AbstractC0015b.c(f7 > 0.0f);
        this.a = f5;
        this.f17937b = f7;
        this.f17938c = Math.round(f5 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && G.class == obj.getClass()) {
            G g4 = (G) obj;
            if (this.a == g4.a && this.f17937b == g4.f17937b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f17937b) + ((Float.floatToRawIntBits(this.a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.a), Float.valueOf(this.f17937b)};
        int i7 = B1.K.a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
