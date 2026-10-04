package S0;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: c, reason: collision with root package name */
    public static final g f8710c = new g(f.f8708b, 17);
    public final float a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8711b;

    public g(float f5, int i7) {
        this.a = f5;
        this.f8711b = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        float f5 = gVar.a;
        float f7 = f.a;
        return Float.compare(this.a, f5) == 0 && this.f8711b == gVar.f8711b;
    }

    public final int hashCode() {
        float f5 = f.a;
        return Integer.hashCode(this.f8711b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("LineHeightStyle(alignment=");
        float f5 = this.a;
        if (f5 == 0.0f) {
            float f7 = f.a;
            str = "LineHeightStyle.Alignment.Top";
        } else if (f5 == f.a) {
            str = "LineHeightStyle.Alignment.Center";
        } else if (f5 == f.f8708b) {
            str = "LineHeightStyle.Alignment.Proportional";
        } else if (f5 == f.f8709c) {
            str = "LineHeightStyle.Alignment.Bottom";
        } else {
            str = "LineHeightStyle.Alignment(topPercentage = " + f5 + ')';
        }
        sb.append((Object) str);
        sb.append(", trim=");
        int i7 = this.f8711b;
        sb.append((Object) (i7 == 1 ? "LineHeightStyle.Trim.FirstLineTop" : i7 == 16 ? "LineHeightStyle.Trim.LastLineBottom" : i7 == 17 ? "LineHeightStyle.Trim.Both" : i7 == 0 ? "LineHeightStyle.Trim.None" : "Invalid"));
        sb.append(')');
        return sb.toString();
    }
}
