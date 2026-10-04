package H0;

/* loaded from: classes.dex */
public final class G {
    public final B a;

    /* renamed from: b, reason: collision with root package name */
    public final B f3088b;

    /* renamed from: c, reason: collision with root package name */
    public final B f3089c;

    /* renamed from: d, reason: collision with root package name */
    public final B f3090d;

    public G(B b4, B b7, B b8, B b9) {
        this.a = b4;
        this.f3088b = b7;
        this.f3089c = b8;
        this.f3090d = b9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof G)) {
            return false;
        }
        G g4 = (G) obj;
        return kotlin.jvm.internal.l.a(this.a, g4.a) && kotlin.jvm.internal.l.a(this.f3088b, g4.f3088b) && kotlin.jvm.internal.l.a(this.f3089c, g4.f3089c) && kotlin.jvm.internal.l.a(this.f3090d, g4.f3090d);
    }

    public final int hashCode() {
        B b4 = this.a;
        int iHashCode = (b4 != null ? b4.hashCode() : 0) * 31;
        B b7 = this.f3088b;
        int iHashCode2 = (iHashCode + (b7 != null ? b7.hashCode() : 0)) * 31;
        B b8 = this.f3089c;
        int iHashCode3 = (iHashCode2 + (b8 != null ? b8.hashCode() : 0)) * 31;
        B b9 = this.f3090d;
        return iHashCode3 + (b9 != null ? b9.hashCode() : 0);
    }
}
