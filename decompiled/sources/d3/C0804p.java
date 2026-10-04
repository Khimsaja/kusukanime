package d3;

import P3.z;
import java.util.Map;

/* renamed from: d3.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0804p {

    /* renamed from: b, reason: collision with root package name */
    public static final C0804p f11323b = new C0804p(z.f7780k);
    public final Map a;

    public C0804p(Map map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0804p) {
            return kotlin.jvm.internal.l.a(this.a, ((C0804p) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Tags(tags=" + this.a + ')';
    }
}
