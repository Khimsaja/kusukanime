package D4;

import b1.AbstractC0703b;

/* loaded from: classes.dex */
public final class P extends n6.d {

    /* renamed from: h, reason: collision with root package name */
    public final int f1525h;

    public P(int i7) {
        super(2);
        this.f1525h = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof P) && this.f1525h == ((P) obj).f1525h;
    }

    @Override // n6.d
    public final int hashCode() {
        return Integer.hashCode(this.f1525h);
    }

    @Override // n6.d
    public final String toString() {
        return AbstractC0703b.l(new StringBuilder("TypeParameter(id="), this.f1525h, ')');
    }
}
