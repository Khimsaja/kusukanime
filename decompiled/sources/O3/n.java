package O3;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class n implements Serializable {

    /* renamed from: k, reason: collision with root package name */
    public final Throwable f7530k;

    public n(Throwable th) {
        kotlin.jvm.internal.l.f("exception", th);
        this.f7530k = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            return kotlin.jvm.internal.l.a(this.f7530k, ((n) obj).f7530k);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7530k.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f7530k + ')';
    }
}
