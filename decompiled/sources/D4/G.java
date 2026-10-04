package D4;

/* loaded from: classes.dex */
public final class G extends D {
    public final String a;

    public G(String str) {
        kotlin.jvm.internal.l.f("value", str);
        this.a = str;
    }

    @Override // D4.D
    public final Object a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof G) && kotlin.jvm.internal.l.a(this.a, ((G) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
