package D4;

/* loaded from: classes.dex */
public final class C extends L {
    public final String a;

    public C(String str) {
        kotlin.jvm.internal.l.f("className", str);
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C) && kotlin.jvm.internal.l.a(this.a, ((C) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return A6.b.j(new StringBuilder("KClassValue("), this.a, ')');
    }
}
