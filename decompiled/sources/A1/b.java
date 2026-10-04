package A1;

import B1.AbstractC0015b;
import B1.K;
import android.graphics.Bitmap;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import java.util.Objects;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: A, reason: collision with root package name */
    public static final String f54A;

    /* renamed from: B, reason: collision with root package name */
    public static final String f55B;

    /* renamed from: C, reason: collision with root package name */
    public static final String f56C;

    /* renamed from: D, reason: collision with root package name */
    public static final String f57D;

    /* renamed from: E, reason: collision with root package name */
    public static final String f58E;

    /* renamed from: F, reason: collision with root package name */
    public static final String f59F;

    /* renamed from: G, reason: collision with root package name */
    public static final String f60G;

    /* renamed from: H, reason: collision with root package name */
    public static final String f61H;
    public static final String I;
    public static final String J;

    /* renamed from: r, reason: collision with root package name */
    public static final String f62r;

    /* renamed from: s, reason: collision with root package name */
    public static final String f63s;

    /* renamed from: t, reason: collision with root package name */
    public static final String f64t;

    /* renamed from: u, reason: collision with root package name */
    public static final String f65u;

    /* renamed from: v, reason: collision with root package name */
    public static final String f66v;

    /* renamed from: w, reason: collision with root package name */
    public static final String f67w;

    /* renamed from: x, reason: collision with root package name */
    public static final String f68x;

    /* renamed from: y, reason: collision with root package name */
    public static final String f69y;

    /* renamed from: z, reason: collision with root package name */
    public static final String f70z;
    public final CharSequence a;

    /* renamed from: b, reason: collision with root package name */
    public final Layout.Alignment f71b;

    /* renamed from: c, reason: collision with root package name */
    public final Layout.Alignment f72c;

    /* renamed from: d, reason: collision with root package name */
    public final Bitmap f73d;

    /* renamed from: e, reason: collision with root package name */
    public final float f74e;

    /* renamed from: f, reason: collision with root package name */
    public final int f75f;

    /* renamed from: g, reason: collision with root package name */
    public final int f76g;

    /* renamed from: h, reason: collision with root package name */
    public final float f77h;

    /* renamed from: i, reason: collision with root package name */
    public final int f78i;

    /* renamed from: j, reason: collision with root package name */
    public final float f79j;

    /* renamed from: k, reason: collision with root package name */
    public final float f80k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f81l;

    /* renamed from: m, reason: collision with root package name */
    public final int f82m;

    /* renamed from: n, reason: collision with root package name */
    public final int f83n;

    /* renamed from: o, reason: collision with root package name */
    public final float f84o;

    /* renamed from: p, reason: collision with root package name */
    public final int f85p;

    /* renamed from: q, reason: collision with root package name */
    public final float f86q;

    static {
        new b("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
        int i7 = K.a;
        f62r = Integer.toString(0, 36);
        f63s = Integer.toString(17, 36);
        f64t = Integer.toString(1, 36);
        f65u = Integer.toString(2, 36);
        f66v = Integer.toString(3, 36);
        f67w = Integer.toString(18, 36);
        f68x = Integer.toString(4, 36);
        f69y = Integer.toString(5, 36);
        f70z = Integer.toString(6, 36);
        f54A = Integer.toString(7, 36);
        f55B = Integer.toString(8, 36);
        f56C = Integer.toString(9, 36);
        f57D = Integer.toString(10, 36);
        f58E = Integer.toString(11, 36);
        f59F = Integer.toString(12, 36);
        f60G = Integer.toString(13, 36);
        f61H = Integer.toString(14, 36);
        I = Integer.toString(15, 36);
        J = Integer.toString(16, 36);
    }

    public b(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f5, int i7, int i8, float f7, int i9, int i10, float f8, float f9, float f10, boolean z7, int i11, int i12, float f11) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            AbstractC0015b.c(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.a = charSequence.toString();
        } else {
            this.a = null;
        }
        this.f71b = alignment;
        this.f72c = alignment2;
        this.f73d = bitmap;
        this.f74e = f5;
        this.f75f = i7;
        this.f76g = i8;
        this.f77h = f7;
        this.f78i = i9;
        this.f79j = f9;
        this.f80k = f10;
        this.f81l = z7;
        this.f82m = i11;
        this.f83n = i10;
        this.f84o = f8;
        this.f85p = i12;
        this.f86q = f11;
    }

    public final a a() {
        a aVar = new a();
        aVar.a = this.a;
        aVar.f38b = this.f73d;
        aVar.f39c = this.f71b;
        aVar.f40d = this.f72c;
        aVar.f41e = this.f74e;
        aVar.f42f = this.f75f;
        aVar.f43g = this.f76g;
        aVar.f44h = this.f77h;
        aVar.f45i = this.f78i;
        aVar.f46j = this.f83n;
        aVar.f47k = this.f84o;
        aVar.f48l = this.f79j;
        aVar.f49m = this.f80k;
        aVar.f50n = this.f81l;
        aVar.f51o = this.f82m;
        aVar.f52p = this.f85p;
        aVar.f53q = this.f86q;
        return aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (TextUtils.equals(this.a, bVar.a) && this.f71b == bVar.f71b && this.f72c == bVar.f72c) {
                Bitmap bitmap = bVar.f73d;
                Bitmap bitmap2 = this.f73d;
                if (bitmap2 != null ? !(bitmap == null || !bitmap2.sameAs(bitmap)) : bitmap == null) {
                    if (this.f74e == bVar.f74e && this.f75f == bVar.f75f && this.f76g == bVar.f76g && this.f77h == bVar.f77h && this.f78i == bVar.f78i && this.f79j == bVar.f79j && this.f80k == bVar.f80k && this.f81l == bVar.f81l && this.f82m == bVar.f82m && this.f83n == bVar.f83n && this.f84o == bVar.f84o && this.f85p == bVar.f85p && this.f86q == bVar.f86q) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.f71b, this.f72c, this.f73d, Float.valueOf(this.f74e), Integer.valueOf(this.f75f), Integer.valueOf(this.f76g), Float.valueOf(this.f77h), Integer.valueOf(this.f78i), Float.valueOf(this.f79j), Float.valueOf(this.f80k), Boolean.valueOf(this.f81l), Integer.valueOf(this.f82m), Integer.valueOf(this.f83n), Float.valueOf(this.f84o), Integer.valueOf(this.f85p), Float.valueOf(this.f86q));
    }
}
