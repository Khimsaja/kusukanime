package I1;

import B1.K;
import C2.C0034g;
import android.media.metrics.LogSessionId;
import java.util.Objects;

/* loaded from: classes.dex */
public final class l {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final C0034g f4002b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f4003c;

    static {
        new l("");
    }

    public l(String str) {
        C0034g c0034g;
        this.a = str;
        if (K.a >= 31) {
            c0034g = new C0034g(9, false);
            c0034g.f741l = LogSessionId.LOG_SESSION_ID_NONE;
        } else {
            c0034g = null;
        }
        this.f4002b = c0034g;
        this.f4003c = new Object();
    }

    public final synchronized LogSessionId a() {
        C0034g c0034g;
        c0034g = this.f4002b;
        c0034g.getClass();
        return (LogSessionId) c0034g.f741l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Objects.equals(this.a, lVar.a) && Objects.equals(this.f4002b, lVar.f4002b) && Objects.equals(this.f4003c, lVar.f4003c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.f4002b, this.f4003c);
    }
}
