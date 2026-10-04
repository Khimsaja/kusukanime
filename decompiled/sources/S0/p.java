package S0;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: c, reason: collision with root package name */
    public static final p f8722c = new p(2, false);

    /* renamed from: d, reason: collision with root package name */
    public static final p f8723d = new p(1, true);
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8724b;

    public p(int i7, boolean z7) {
        this.a = i7;
        this.f8724b = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.a == pVar.a && this.f8724b == pVar.f8724b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f8724b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return equals(f8722c) ? "TextMotion.Static" : equals(f8723d) ? "TextMotion.Animated" : "Invalid";
    }
}
