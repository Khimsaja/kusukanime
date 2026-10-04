package n0;

import b1.AbstractC0703b;

/* renamed from: n0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1553t extends AbstractC1555v {

    /* renamed from: b, reason: collision with root package name */
    public final float f13208b;

    public C1553t(float f5) {
        super(3);
        this.f13208b = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1553t) && Float.compare(this.f13208b, ((C1553t) obj).f13208b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f13208b);
    }

    public final String toString() {
        return AbstractC0703b.k(new StringBuilder("RelativeVerticalTo(dy="), this.f13208b, ')');
    }
}
