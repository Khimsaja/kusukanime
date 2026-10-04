package y2;

import android.text.Layout;

/* renamed from: y2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2410g {
    public String a;

    /* renamed from: b, reason: collision with root package name */
    public int f18208b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f18209c;

    /* renamed from: d, reason: collision with root package name */
    public int f18210d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f18211e;

    /* renamed from: k, reason: collision with root package name */
    public float f18217k;

    /* renamed from: l, reason: collision with root package name */
    public String f18218l;

    /* renamed from: o, reason: collision with root package name */
    public Layout.Alignment f18221o;

    /* renamed from: p, reason: collision with root package name */
    public Layout.Alignment f18222p;

    /* renamed from: r, reason: collision with root package name */
    public C2405b f18224r;

    /* renamed from: t, reason: collision with root package name */
    public String f18226t;

    /* renamed from: u, reason: collision with root package name */
    public String f18227u;

    /* renamed from: f, reason: collision with root package name */
    public int f18212f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f18213g = -1;

    /* renamed from: h, reason: collision with root package name */
    public int f18214h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f18215i = -1;

    /* renamed from: j, reason: collision with root package name */
    public int f18216j = -1;

    /* renamed from: m, reason: collision with root package name */
    public int f18219m = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f18220n = -1;

    /* renamed from: q, reason: collision with root package name */
    public int f18223q = -1;

    /* renamed from: s, reason: collision with root package name */
    public float f18225s = Float.MAX_VALUE;

    public final void a(C2410g c2410g) {
        int i7;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (c2410g != null) {
            if (!this.f18209c && c2410g.f18209c) {
                this.f18208b = c2410g.f18208b;
                this.f18209c = true;
            }
            if (this.f18214h == -1) {
                this.f18214h = c2410g.f18214h;
            }
            if (this.f18215i == -1) {
                this.f18215i = c2410g.f18215i;
            }
            if (this.a == null && (str = c2410g.a) != null) {
                this.a = str;
            }
            if (this.f18212f == -1) {
                this.f18212f = c2410g.f18212f;
            }
            if (this.f18213g == -1) {
                this.f18213g = c2410g.f18213g;
            }
            if (this.f18220n == -1) {
                this.f18220n = c2410g.f18220n;
            }
            if (this.f18221o == null && (alignment2 = c2410g.f18221o) != null) {
                this.f18221o = alignment2;
            }
            if (this.f18222p == null && (alignment = c2410g.f18222p) != null) {
                this.f18222p = alignment;
            }
            if (this.f18223q == -1) {
                this.f18223q = c2410g.f18223q;
            }
            if (this.f18216j == -1) {
                this.f18216j = c2410g.f18216j;
                this.f18217k = c2410g.f18217k;
            }
            if (this.f18224r == null) {
                this.f18224r = c2410g.f18224r;
            }
            if (this.f18225s == Float.MAX_VALUE) {
                this.f18225s = c2410g.f18225s;
            }
            if (this.f18226t == null) {
                this.f18226t = c2410g.f18226t;
            }
            if (this.f18227u == null) {
                this.f18227u = c2410g.f18227u;
            }
            if (!this.f18211e && c2410g.f18211e) {
                this.f18210d = c2410g.f18210d;
                this.f18211e = true;
            }
            if (this.f18219m != -1 || (i7 = c2410g.f18219m) == -1) {
                return;
            }
            this.f18219m = i7;
        }
    }
}
