package D4;

/* renamed from: D4.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0103w extends D {
    public final byte a;

    public C0103w(byte b4) {
        this.a = b4;
    }

    @Override // D4.D
    public final Object a() {
        return Byte.valueOf(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0103w) && this.a == ((C0103w) obj).a;
    }

    public final int hashCode() {
        return Byte.hashCode(this.a);
    }
}
