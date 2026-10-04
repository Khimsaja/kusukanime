package n0;

import b1.AbstractC0703b;

/* renamed from: n0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1549p extends AbstractC1555v {

    /* renamed from: b, reason: collision with root package name */
    public final float f13200b;

    public C1549p(float f5) {
        super(3);
        this.f13200b = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1549p) && Float.compare(this.f13200b, ((C1549p) obj).f13200b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f13200b);
    }

    public final String toString() {
        return AbstractC0703b.k(new StringBuilder("RelativeHorizontalTo(dx="), this.f13200b, ')');
    }
}
