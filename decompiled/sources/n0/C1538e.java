package n0;

import b1.AbstractC0703b;
import h0.C0998u;
import p.AbstractC1755i;

/* renamed from: n0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1538e {

    /* renamed from: k, reason: collision with root package name */
    public static final R1.i f13153k = new R1.i(27);

    /* renamed from: l, reason: collision with root package name */
    public static int f13154l;
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final float f13155b;

    /* renamed from: c, reason: collision with root package name */
    public final float f13156c;

    /* renamed from: d, reason: collision with root package name */
    public final float f13157d;

    /* renamed from: e, reason: collision with root package name */
    public final float f13158e;

    /* renamed from: f, reason: collision with root package name */
    public final C1559z f13159f;

    /* renamed from: g, reason: collision with root package name */
    public final long f13160g;

    /* renamed from: h, reason: collision with root package name */
    public final int f13161h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f13162i;

    /* renamed from: j, reason: collision with root package name */
    public final int f13163j;

    public C1538e(String str, float f5, float f7, float f8, float f9, C1559z c1559z, long j7, int i7, boolean z7) {
        int i8;
        synchronized (f13153k) {
            i8 = f13154l;
            f13154l = i8 + 1;
        }
        this.a = str;
        this.f13155b = f5;
        this.f13156c = f7;
        this.f13157d = f8;
        this.f13158e = f9;
        this.f13159f = c1559z;
        this.f13160g = j7;
        this.f13161h = i7;
        this.f13162i = z7;
        this.f13163j = i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1538e)) {
            return false;
        }
        C1538e c1538e = (C1538e) obj;
        return kotlin.jvm.internal.l.a(this.a, c1538e.a) && T0.e.a(this.f13155b, c1538e.f13155b) && T0.e.a(this.f13156c, c1538e.f13156c) && this.f13157d == c1538e.f13157d && this.f13158e == c1538e.f13158e && this.f13159f.equals(c1538e.f13159f) && C0998u.c(this.f13160g, c1538e.f13160g) && this.f13161h == c1538e.f13161h && this.f13162i == c1538e.f13162i;
    }

    public final int hashCode() {
        int iHashCode = (this.f13159f.hashCode() + AbstractC0703b.b(this.f13158e, AbstractC0703b.b(this.f13157d, AbstractC0703b.b(this.f13156c, AbstractC0703b.b(this.f13155b, this.a.hashCode() * 31, 31), 31), 31), 31)) * 31;
        int i7 = C0998u.f11835h;
        return Boolean.hashCode(this.f13162i) + AbstractC1755i.a(this.f13161h, AbstractC0703b.c(iHashCode, 31, this.f13160g), 31);
    }
}
