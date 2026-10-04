package L;

/* loaded from: classes.dex */
public final class M2 {
    public final H0.I a;

    /* renamed from: b, reason: collision with root package name */
    public final H0.I f5210b;

    /* renamed from: c, reason: collision with root package name */
    public final H0.I f5211c;

    /* renamed from: d, reason: collision with root package name */
    public final H0.I f5212d;

    /* renamed from: e, reason: collision with root package name */
    public final H0.I f5213e;

    /* renamed from: f, reason: collision with root package name */
    public final H0.I f5214f;

    /* renamed from: g, reason: collision with root package name */
    public final H0.I f5215g;

    /* renamed from: h, reason: collision with root package name */
    public final H0.I f5216h;

    /* renamed from: i, reason: collision with root package name */
    public final H0.I f5217i;

    /* renamed from: j, reason: collision with root package name */
    public final H0.I f5218j;

    /* renamed from: k, reason: collision with root package name */
    public final H0.I f5219k;

    /* renamed from: l, reason: collision with root package name */
    public final H0.I f5220l;

    /* renamed from: m, reason: collision with root package name */
    public final H0.I f5221m;

    /* renamed from: n, reason: collision with root package name */
    public final H0.I f5222n;

    /* renamed from: o, reason: collision with root package name */
    public final H0.I f5223o;

    public M2(H0.I i7, H0.I i8, H0.I i9, H0.I i10, H0.I i11, H0.I i12, H0.I i13, H0.I i14, H0.I i15, H0.I i16, H0.I i17, H0.I i18, int i19) {
        H0.I i20 = N.v.f6837d;
        H0.I i21 = N.v.f6838e;
        H0.I i22 = (i19 & 4) != 0 ? N.v.f6839f : i7;
        H0.I i23 = N.v.f6840g;
        H0.I i24 = (i19 & 16) != 0 ? N.v.f6841h : i8;
        H0.I i25 = (i19 & 32) != 0 ? N.v.f6842i : i9;
        H0.I i26 = (i19 & 64) != 0 ? N.v.f6846m : i10;
        H0.I i27 = (i19 & 128) != 0 ? N.v.f6847n : i11;
        H0.I i28 = (i19 & 256) != 0 ? N.v.f6848o : i12;
        H0.I i29 = (i19 & 512) != 0 ? N.v.a : i13;
        H0.I i30 = (i19 & 1024) != 0 ? N.v.f6835b : i14;
        H0.I i31 = (i19 & 2048) != 0 ? N.v.f6836c : i15;
        H0.I i32 = (i19 & 4096) != 0 ? N.v.f6843j : i16;
        H0.I i33 = (i19 & 8192) != 0 ? N.v.f6844k : i17;
        H0.I i34 = (i19 & 16384) != 0 ? N.v.f6845l : i18;
        this.a = i20;
        this.f5210b = i21;
        this.f5211c = i22;
        this.f5212d = i23;
        this.f5213e = i24;
        this.f5214f = i25;
        this.f5215g = i26;
        this.f5216h = i27;
        this.f5217i = i28;
        this.f5218j = i29;
        this.f5219k = i30;
        this.f5220l = i31;
        this.f5221m = i32;
        this.f5222n = i33;
        this.f5223o = i34;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M2)) {
            return false;
        }
        M2 m22 = (M2) obj;
        return kotlin.jvm.internal.l.a(this.a, m22.a) && kotlin.jvm.internal.l.a(this.f5210b, m22.f5210b) && kotlin.jvm.internal.l.a(this.f5211c, m22.f5211c) && kotlin.jvm.internal.l.a(this.f5212d, m22.f5212d) && kotlin.jvm.internal.l.a(this.f5213e, m22.f5213e) && kotlin.jvm.internal.l.a(this.f5214f, m22.f5214f) && kotlin.jvm.internal.l.a(this.f5215g, m22.f5215g) && kotlin.jvm.internal.l.a(this.f5216h, m22.f5216h) && kotlin.jvm.internal.l.a(this.f5217i, m22.f5217i) && kotlin.jvm.internal.l.a(this.f5218j, m22.f5218j) && kotlin.jvm.internal.l.a(this.f5219k, m22.f5219k) && kotlin.jvm.internal.l.a(this.f5220l, m22.f5220l) && kotlin.jvm.internal.l.a(this.f5221m, m22.f5221m) && kotlin.jvm.internal.l.a(this.f5222n, m22.f5222n) && kotlin.jvm.internal.l.a(this.f5223o, m22.f5223o);
    }

    public final int hashCode() {
        return this.f5223o.hashCode() + ((this.f5222n.hashCode() + ((this.f5221m.hashCode() + ((this.f5220l.hashCode() + ((this.f5219k.hashCode() + ((this.f5218j.hashCode() + ((this.f5217i.hashCode() + ((this.f5216h.hashCode() + ((this.f5215g.hashCode() + ((this.f5214f.hashCode() + ((this.f5213e.hashCode() + ((this.f5212d.hashCode() + ((this.f5211c.hashCode() + ((this.f5210b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Typography(displayLarge=" + this.a + ", displayMedium=" + this.f5210b + ",displaySmall=" + this.f5211c + ", headlineLarge=" + this.f5212d + ", headlineMedium=" + this.f5213e + ", headlineSmall=" + this.f5214f + ", titleLarge=" + this.f5215g + ", titleMedium=" + this.f5216h + ", titleSmall=" + this.f5217i + ", bodyLarge=" + this.f5218j + ", bodyMedium=" + this.f5219k + ", bodySmall=" + this.f5220l + ", labelLarge=" + this.f5221m + ", labelMedium=" + this.f5222n + ", labelSmall=" + this.f5223o + ')';
    }
}
