package D4;

/* loaded from: classes.dex */
public final class W {
    public a0 a;

    /* renamed from: b, reason: collision with root package name */
    public String f1537b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W)) {
            return false;
        }
        W w7 = (W) obj;
        return kotlin.jvm.internal.l.a(this.a, w7.a) && kotlin.jvm.internal.l.a(this.f1537b, w7.f1537b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.f1537b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KmFlexibleTypeUpperBound(type=");
        sb.append(this.a);
        sb.append(", typeFlexibilityId=");
        return A6.b.j(sb, this.f1537b, ')');
    }
}
