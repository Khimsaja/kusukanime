package n0;

/* renamed from: n0.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1551r extends AbstractC1555v {

    /* renamed from: b, reason: collision with root package name */
    public final float f13203b;

    public C1551r(float f5) {
        super(3);
        this.f13203b = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1551r) {
            return Float.compare(this.f13203b, ((C1551r) obj).f13203b) == 0 && Float.compare(0.0f, 0.0f) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(0.0f) + (Float.hashCode(this.f13203b) * 31);
    }

    public final String toString() {
        return "RelativeMoveTo(dx=" + this.f13203b + ", dy=0.0)";
    }
}
