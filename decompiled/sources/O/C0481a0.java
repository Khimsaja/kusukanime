package O;

/* renamed from: O.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0481a0 {
    public final String a;

    public C0481a0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0481a0) && kotlin.jvm.internal.l.a(this.a, ((C0481a0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return A6.b.j(new StringBuilder("OpaqueKey(key="), this.a, ')');
    }
}
