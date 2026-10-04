package O3;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class o implements Serializable {

    /* renamed from: k, reason: collision with root package name */
    public final Object f7531k;

    public static final Throwable a(Object obj) {
        if (obj instanceof n) {
            return ((n) obj).f7530k;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return kotlin.jvm.internal.l.a(this.f7531k, ((o) obj).f7531k);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f7531k;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f7531k;
        if (obj instanceof n) {
            return ((n) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
