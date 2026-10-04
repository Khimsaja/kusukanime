package D4;

import java.io.IOException;
import java.util.Map;

/* loaded from: classes.dex */
public final class r {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f1629b;

    public r(Map map, String str) {
        kotlin.jvm.internal.l.f("className", str);
        this.a = str;
        this.f1629b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return kotlin.jvm.internal.l.a(this.a, rVar.a) && kotlin.jvm.internal.l.a(this.f1629b, rVar.f1629b);
    }

    public final int hashCode() {
        return this.f1629b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() throws IOException {
        return "@" + this.a + '(' + P3.q.y0(P3.E.q0(this.f1629b), null, null, null, C0098q.f1628k, 31) + ')';
    }
}
