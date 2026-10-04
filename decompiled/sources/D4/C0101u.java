package D4;

import java.util.ArrayList;

/* renamed from: D4.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0101u extends L {
    public final ArrayList a;

    public C0101u(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0101u) && this.a.equals(((C0101u) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ArrayValue(" + this.a + ')';
    }
}
