package n0;

import b1.AbstractC0703b;

/* renamed from: n0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1543j extends AbstractC1555v {

    /* renamed from: b, reason: collision with root package name */
    public final float f13182b;

    public C1543j(float f5) {
        super(3);
        this.f13182b = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1543j) && Float.compare(this.f13182b, ((C1543j) obj).f13182b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f13182b);
    }

    public final String toString() {
        return AbstractC0703b.k(new StringBuilder("HorizontalTo(x="), this.f13182b, ')');
    }
}
