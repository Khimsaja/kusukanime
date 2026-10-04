package F0;

import k4.C1395d;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    public static final e f2067c = new e(0.0f, new C1395d(0.0f, 0.0f));
    public final float a;

    /* renamed from: b, reason: collision with root package name */
    public final C1395d f2068b;

    public e(float f5, C1395d c1395d) {
        this.a = f5;
        this.f2068b = c1395d;
        if (Float.isNaN(f5)) {
            throw new IllegalArgumentException("current must not be NaN");
        }
    }

    public final C1395d a() {
        return this.f2068b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.a == eVar.a && this.f2068b.equals(eVar.f2068b);
    }

    public final int hashCode() {
        return (this.f2068b.hashCode() + (Float.hashCode(this.a) * 31)) * 31;
    }

    public final String toString() {
        return "ProgressBarRangeInfo(current=" + this.a + ", range=" + this.f2068b + ", steps=0)";
    }
}
