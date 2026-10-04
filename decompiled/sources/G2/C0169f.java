package G2;

/* renamed from: G2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0169f {
    public final M a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2697b = false;

    public C0169f(M m7) {
        this.a = m7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C0169f.class.equals(obj.getClass())) {
            return false;
        }
        C0169f c0169f = (C0169f) obj;
        return this.f2697b == c0169f.f2697b && this.a.equals(c0169f.a);
    }

    public final int hashCode() {
        return ((this.a.hashCode() * 961) + (this.f2697b ? 1 : 0)) * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C0169f.class.getSimpleName());
        sb.append(" Type: " + this.a);
        sb.append(" Nullable: false");
        if (this.f2697b) {
            sb.append(" DefaultValue: null");
        }
        String string = sb.toString();
        kotlin.jvm.internal.l.e("sb.toString()", string);
        return string;
    }
}
