package D4;

/* renamed from: D4.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0104x extends D {
    public final char a;

    public C0104x(char c2) {
        this.a = c2;
    }

    @Override // D4.D
    public final Object a() {
        return Character.valueOf(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0104x) && this.a == ((C0104x) obj).a;
    }

    public final int hashCode() {
        return Character.hashCode(this.a);
    }
}
