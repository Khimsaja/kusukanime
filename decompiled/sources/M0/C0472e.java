package M0;

/* renamed from: M0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0472e {
    public final Object a;

    public final boolean equals(Object obj) {
        if (obj instanceof C0472e) {
            return kotlin.jvm.internal.l.a(this.a, ((C0472e) obj).a);
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
        return "AsyncTypefaceResult(result=" + this.a + ')';
    }
}
