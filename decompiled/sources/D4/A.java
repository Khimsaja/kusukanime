package D4;

/* loaded from: classes.dex */
public final class A extends D {
    public final float a;

    public A(float f5) {
        this.a = f5;
    }

    @Override // D4.D
    public final Object a() {
        return Float.valueOf(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof A) && Float.compare(this.a, ((A) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }
}
