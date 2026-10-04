package v1;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.l;

/* renamed from: v1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2148b {
    public final LinkedHashMap a = new LinkedHashMap();

    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC2148b) && l.a(this.a, ((AbstractC2148b) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.a + ')';
    }
}
