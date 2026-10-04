package G2;

/* loaded from: classes.dex */
public final class H {
    public final boolean a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2663b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2664c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2665d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2666e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2667f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2668g;

    /* renamed from: h, reason: collision with root package name */
    public String f2669h;

    public H(boolean z7, boolean z8, int i7, boolean z9, boolean z10, int i8, int i9) {
        this.a = z7;
        this.f2663b = z8;
        this.f2664c = i7;
        this.f2665d = z9;
        this.f2666e = z10;
        this.f2667f = i8;
        this.f2668g = i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof H)) {
            return false;
        }
        H h7 = (H) obj;
        return this.a == h7.a && this.f2663b == h7.f2663b && this.f2664c == h7.f2664c && kotlin.jvm.internal.l.a(this.f2669h, h7.f2669h) && this.f2665d == h7.f2665d && this.f2666e == h7.f2666e && this.f2667f == h7.f2667f && this.f2668g == h7.f2668g;
    }

    public final int hashCode() {
        int i7 = (((((this.a ? 1 : 0) * 31) + (this.f2663b ? 1 : 0)) * 31) + this.f2664c) * 31;
        return ((((((((((((i7 + (this.f2669h != null ? r1.hashCode() : 0)) * 29791) + (this.f2665d ? 1 : 0)) * 31) + (this.f2666e ? 1 : 0)) * 31) + this.f2667f) * 31) + this.f2668g) * 31) - 1) * 31) - 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(H.class.getSimpleName());
        sb.append("(");
        if (this.a) {
            sb.append("launchSingleTop ");
        }
        if (this.f2663b) {
            sb.append("restoreState ");
        }
        String str = this.f2669h;
        if ((str != null || this.f2664c != -1) && str != null) {
            sb.append("popUpTo(");
            sb.append(str);
            if (this.f2665d) {
                sb.append(" inclusive");
            }
            if (this.f2666e) {
                sb.append(" saveState");
            }
            sb.append(")");
        }
        int i7 = this.f2668g;
        int i8 = this.f2667f;
        if (i8 != -1 || i7 != -1) {
            sb.append("anim(enterAnim=0x");
            sb.append(Integer.toHexString(i8));
            sb.append(" exitAnim=0x");
            sb.append(Integer.toHexString(i7));
            sb.append(" popEnterAnim=0x");
            sb.append(Integer.toHexString(-1));
            sb.append(" popExitAnim=0x");
            sb.append(Integer.toHexString(-1));
            sb.append(")");
        }
        String string = sb.toString();
        kotlin.jvm.internal.l.e("sb.toString()", string);
        return string;
    }
}
