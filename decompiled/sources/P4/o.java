package P4;

/* loaded from: classes.dex */
public final class o {
    public final String a;

    public o(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && kotlin.jvm.internal.l.a(this.a, ((o) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return A6.b.j(new StringBuilder("MemberSignature(signature="), this.a, ')');
    }
}
