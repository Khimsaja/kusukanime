package y1;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: d, reason: collision with root package name */
    public static final b0 f18027d = new b0(1.0f, 0, 0);
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18028b;

    /* renamed from: c, reason: collision with root package name */
    public final float f18029c;

    static {
        B1.K.B(0);
        B1.K.B(1);
        B1.K.B(3);
    }

    public b0(float f5, int i7, int i8) {
        this.a = i7;
        this.f18028b = i8;
        this.f18029c = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b0) {
            b0 b0Var = (b0) obj;
            if (this.a == b0Var.a && this.f18028b == b0Var.f18028b && this.f18029c == b0Var.f18029c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f18029c) + ((((217 + this.a) * 31) + this.f18028b) * 31);
    }
}
