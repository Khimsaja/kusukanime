package P3;

/* loaded from: classes.dex */
public final class B {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7738b;

    public B(int i7, Object obj) {
        this.a = i7;
        this.f7738b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b4 = (B) obj;
        return this.a == b4.a && kotlin.jvm.internal.l.a(this.f7738b, b4.f7738b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        Object obj = this.f7738b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IndexedValue(index=");
        sb.append(this.a);
        sb.append(", value=");
        return A6.b.i(sb, this.f7738b, ')');
    }
}
