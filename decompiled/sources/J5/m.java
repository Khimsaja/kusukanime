package J5;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: b, reason: collision with root package name */
    public static final l f4338b = new l();
    public final Object a;

    public static final Object a(Object obj) {
        if (obj instanceof l) {
            return null;
        }
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            return kotlin.jvm.internal.l.a(this.a, ((m) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.a;
        if (obj instanceof k) {
            return ((k) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
