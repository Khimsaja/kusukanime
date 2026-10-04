package f6;

import java.util.concurrent.TimeUnit;

/* renamed from: f6.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0906d {

    /* renamed from: n, reason: collision with root package name */
    public static final C0906d f11534n = new C0906d(true, false, -1, -1, false, false, false, -1, -1, false, false, false, null);

    /* renamed from: o, reason: collision with root package name */
    public static final C0906d f11535o;
    public final boolean a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f11536b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11537c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11538d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f11539e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f11540f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f11541g;

    /* renamed from: h, reason: collision with root package name */
    public final int f11542h;

    /* renamed from: i, reason: collision with root package name */
    public final int f11543i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f11544j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f11545k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f11546l;

    /* renamed from: m, reason: collision with root package name */
    public String f11547m;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        kotlin.jvm.internal.l.f("timeUnit", timeUnit);
        long seconds = timeUnit.toSeconds(Integer.MAX_VALUE);
        f11535o = new C0906d(false, false, -1, -1, false, false, false, seconds <= 2147483647L ? (int) seconds : Integer.MAX_VALUE, -1, true, false, false, null);
    }

    public C0906d(boolean z7, boolean z8, int i7, int i8, boolean z9, boolean z10, boolean z11, int i9, int i10, boolean z12, boolean z13, boolean z14, String str) {
        this.a = z7;
        this.f11536b = z8;
        this.f11537c = i7;
        this.f11538d = i8;
        this.f11539e = z9;
        this.f11540f = z10;
        this.f11541g = z11;
        this.f11542h = i9;
        this.f11543i = i10;
        this.f11544j = z12;
        this.f11545k = z13;
        this.f11546l = z14;
        this.f11547m = str;
    }

    public final String toString() {
        String str = this.f11547m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.a) {
            sb.append("no-cache, ");
        }
        if (this.f11536b) {
            sb.append("no-store, ");
        }
        int i7 = this.f11537c;
        if (i7 != -1) {
            sb.append("max-age=");
            sb.append(i7);
            sb.append(", ");
        }
        int i8 = this.f11538d;
        if (i8 != -1) {
            sb.append("s-maxage=");
            sb.append(i8);
            sb.append(", ");
        }
        if (this.f11539e) {
            sb.append("private, ");
        }
        if (this.f11540f) {
            sb.append("public, ");
        }
        if (this.f11541g) {
            sb.append("must-revalidate, ");
        }
        int i9 = this.f11542h;
        if (i9 != -1) {
            sb.append("max-stale=");
            sb.append(i9);
            sb.append(", ");
        }
        int i10 = this.f11543i;
        if (i10 != -1) {
            sb.append("min-fresh=");
            sb.append(i10);
            sb.append(", ");
        }
        if (this.f11544j) {
            sb.append("only-if-cached, ");
        }
        if (this.f11545k) {
            sb.append("no-transform, ");
        }
        if (this.f11546l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String string = sb.toString();
        kotlin.jvm.internal.l.e("StringBuilder().apply(builderAction).toString()", string);
        this.f11547m = string;
        return string;
    }
}
