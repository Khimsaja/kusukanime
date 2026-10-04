package n5;

import io.ktor.sse.ServerSentEventKt;
import o5.C1706f;

/* loaded from: classes.dex */
public abstract class Q {
    public abstract b0 a();

    public abstract AbstractC1586x b();

    public abstract boolean c();

    public abstract Q d(C1706f c1706f);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q)) {
            return false;
        }
        Q q6 = (Q) obj;
        return c() == q6.c() && a() == q6.a() && b().equals(q6.b());
    }

    public final int hashCode() {
        int iHashCode = a().hashCode();
        if (Y.l(b())) {
            return (iHashCode * 31) + 19;
        }
        return (iHashCode * 31) + (c() ? 17 : b().hashCode());
    }

    public final String toString() {
        if (c()) {
            return "*";
        }
        if (a() == b0.f13390m) {
            return b().toString();
        }
        return a() + ServerSentEventKt.SPACE + b();
    }
}
