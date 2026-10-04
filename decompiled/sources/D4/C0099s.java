package D4;

/* renamed from: D4.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0099s extends L {
    public final r a;

    public C0099s(r rVar) {
        this.a = rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0099s) && kotlin.jvm.internal.l.a(this.a, ((C0099s) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AnnotationValue(" + this.a + ')';
    }
}
