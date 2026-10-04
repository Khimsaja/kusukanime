package d3;

import H5.AbstractC0281w;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import b1.AbstractC0703b;
import f3.InterfaceC0879e;

/* renamed from: d3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0791c {
    public final AbstractC0281w a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0281w f11242b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC0281w f11243c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0281w f11244d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0879e f11245e;

    /* renamed from: f, reason: collision with root package name */
    public final e3.e f11246f;

    /* renamed from: g, reason: collision with root package name */
    public final Bitmap.Config f11247g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f11248h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f11249i;

    /* renamed from: j, reason: collision with root package name */
    public final Drawable f11250j;

    /* renamed from: k, reason: collision with root package name */
    public final Drawable f11251k;

    /* renamed from: l, reason: collision with root package name */
    public final Drawable f11252l;

    /* renamed from: m, reason: collision with root package name */
    public final EnumC0790b f11253m;

    /* renamed from: n, reason: collision with root package name */
    public final EnumC0790b f11254n;

    /* renamed from: o, reason: collision with root package name */
    public final EnumC0790b f11255o;

    public C0791c(AbstractC0281w abstractC0281w, AbstractC0281w abstractC0281w2, AbstractC0281w abstractC0281w3, AbstractC0281w abstractC0281w4, InterfaceC0879e interfaceC0879e, e3.e eVar, Bitmap.Config config, boolean z7, boolean z8, Drawable drawable, Drawable drawable2, Drawable drawable3, EnumC0790b enumC0790b, EnumC0790b enumC0790b2, EnumC0790b enumC0790b3) {
        this.a = abstractC0281w;
        this.f11242b = abstractC0281w2;
        this.f11243c = abstractC0281w3;
        this.f11244d = abstractC0281w4;
        this.f11245e = interfaceC0879e;
        this.f11246f = eVar;
        this.f11247g = config;
        this.f11248h = z7;
        this.f11249i = z8;
        this.f11250j = drawable;
        this.f11251k = drawable2;
        this.f11252l = drawable3;
        this.f11253m = enumC0790b;
        this.f11254n = enumC0790b2;
        this.f11255o = enumC0790b3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0791c)) {
            return false;
        }
        C0791c c0791c = (C0791c) obj;
        return kotlin.jvm.internal.l.a(this.a, c0791c.a) && kotlin.jvm.internal.l.a(this.f11242b, c0791c.f11242b) && kotlin.jvm.internal.l.a(this.f11243c, c0791c.f11243c) && kotlin.jvm.internal.l.a(this.f11244d, c0791c.f11244d) && kotlin.jvm.internal.l.a(this.f11245e, c0791c.f11245e) && this.f11246f == c0791c.f11246f && this.f11247g == c0791c.f11247g && this.f11248h == c0791c.f11248h && this.f11249i == c0791c.f11249i && kotlin.jvm.internal.l.a(this.f11250j, c0791c.f11250j) && kotlin.jvm.internal.l.a(this.f11251k, c0791c.f11251k) && kotlin.jvm.internal.l.a(this.f11252l, c0791c.f11252l) && this.f11253m == c0791c.f11253m && this.f11254n == c0791c.f11254n && this.f11255o == c0791c.f11255o;
    }

    public final int hashCode() {
        int iD = AbstractC0703b.d(AbstractC0703b.d((this.f11247g.hashCode() + ((this.f11246f.hashCode() + ((this.f11245e.hashCode() + ((this.f11244d.hashCode() + ((this.f11243c.hashCode() + ((this.f11242b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.f11248h), 31, this.f11249i);
        Drawable drawable = this.f11250j;
        int iHashCode = (iD + (drawable != null ? drawable.hashCode() : 0)) * 31;
        Drawable drawable2 = this.f11251k;
        int iHashCode2 = (iHashCode + (drawable2 != null ? drawable2.hashCode() : 0)) * 31;
        Drawable drawable3 = this.f11252l;
        return this.f11255o.hashCode() + ((this.f11254n.hashCode() + ((this.f11253m.hashCode() + ((iHashCode2 + (drawable3 != null ? drawable3.hashCode() : 0)) * 31)) * 31)) * 31);
    }
}
