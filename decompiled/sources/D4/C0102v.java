package D4;

/* renamed from: D4.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0102v extends D {
    public final boolean a;

    public C0102v(boolean z7) {
        this.a = z7;
    }

    @Override // D4.D
    public final Object a() {
        return Boolean.valueOf(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0102v) && this.a == ((C0102v) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
