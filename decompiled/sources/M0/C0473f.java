package M0;

/* renamed from: M0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0473f {
    public final z a;

    public C0473f(z zVar) {
        this.a = zVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0473f) {
            return kotlin.jvm.internal.l.a(this.a, ((C0473f) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "Key(font=" + this.a + ", loaderKey=null)";
    }
}
