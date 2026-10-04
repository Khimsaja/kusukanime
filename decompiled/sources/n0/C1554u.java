package n0;

import b1.AbstractC0703b;

/* renamed from: n0.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1554u extends AbstractC1555v {

    /* renamed from: b, reason: collision with root package name */
    public final float f13209b;

    public C1554u(float f5) {
        super(3);
        this.f13209b = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1554u) && Float.compare(this.f13209b, ((C1554u) obj).f13209b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f13209b);
    }

    public final String toString() {
        return AbstractC0703b.k(new StringBuilder("VerticalTo(y="), this.f13209b, ')');
    }
}
