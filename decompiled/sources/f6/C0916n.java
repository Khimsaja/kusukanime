package f6;

import b1.AbstractC0703b;
import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/* renamed from: f6.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0916n {

    /* renamed from: j, reason: collision with root package name */
    public static final Pattern f11577j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k, reason: collision with root package name */
    public static final Pattern f11578k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f11579l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f11580m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11581b;

    /* renamed from: c, reason: collision with root package name */
    public final long f11582c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11583d;

    /* renamed from: e, reason: collision with root package name */
    public final String f11584e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f11585f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f11586g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f11587h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f11588i;

    public C0916n(String str, String str2, long j7, String str3, String str4, boolean z7, boolean z8, boolean z9, boolean z10) {
        this.a = str;
        this.f11581b = str2;
        this.f11582c = j7;
        this.f11583d = str3;
        this.f11584e = str4;
        this.f11585f = z7;
        this.f11586g = z8;
        this.f11587h = z9;
        this.f11588i = z10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0916n)) {
            return false;
        }
        C0916n c0916n = (C0916n) obj;
        return kotlin.jvm.internal.l.a(c0916n.a, this.a) && kotlin.jvm.internal.l.a(c0916n.f11581b, this.f11581b) && c0916n.f11582c == this.f11582c && kotlin.jvm.internal.l.a(c0916n.f11583d, this.f11583d) && kotlin.jvm.internal.l.a(c0916n.f11584e, this.f11584e) && c0916n.f11585f == this.f11585f && c0916n.f11586g == this.f11586g && c0916n.f11587h == this.f11587h && c0916n.f11588i == this.f11588i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f11588i) + AbstractC0703b.d(AbstractC0703b.d(AbstractC0703b.d(A6.b.b(this.f11584e, A6.b.b(this.f11583d, AbstractC0703b.c(A6.b.b(this.f11581b, A6.b.b(this.a, 527, 31), 31), 31, this.f11582c), 31), 31), 31, this.f11585f), 31, this.f11586g), 31, this.f11587h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('=');
        sb.append(this.f11581b);
        if (this.f11587h) {
            long j7 = this.f11582c;
            if (j7 == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                String str = ((DateFormat) k6.c.a.get()).format(new Date(j7));
                kotlin.jvm.internal.l.e("STANDARD_DATE_FORMAT.get().format(this)", str);
                sb.append(str);
            }
        }
        if (!this.f11588i) {
            sb.append("; domain=");
            sb.append(this.f11583d);
        }
        sb.append("; path=");
        sb.append(this.f11584e);
        if (this.f11585f) {
            sb.append("; secure");
        }
        if (this.f11586g) {
            sb.append("; httponly");
        }
        String string = sb.toString();
        kotlin.jvm.internal.l.e("toString()", string);
        return string;
    }
}
