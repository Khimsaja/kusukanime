package O;

/* loaded from: classes.dex */
public final class O {
    public final Integer a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7023b;

    public O(Integer num, Object obj) {
        this.a = num;
        this.f7023b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O)) {
            return false;
        }
        O o7 = (O) obj;
        return this.a.equals(o7.a) && kotlin.jvm.internal.l.a(this.f7023b, o7.f7023b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Object obj = this.f7023b;
        return (obj instanceof Enum ? ((Enum) obj).ordinal() : obj != null ? obj.hashCode() : 0) + iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JoinedKey(left=");
        sb.append(this.a);
        sb.append(", right=");
        return A6.b.i(sb, this.f7023b, ')');
    }
}
