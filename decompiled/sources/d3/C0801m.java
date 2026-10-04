package d3;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.os.Build;
import b1.AbstractC0703b;
import f6.C0920r;
import java.util.Arrays;

/* renamed from: d3.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0801m {
    public final Context a;

    /* renamed from: b, reason: collision with root package name */
    public final Bitmap.Config f11301b;

    /* renamed from: c, reason: collision with root package name */
    public final ColorSpace f11302c;

    /* renamed from: d, reason: collision with root package name */
    public final e3.h f11303d;

    /* renamed from: e, reason: collision with root package name */
    public final e3.g f11304e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f11305f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f11306g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f11307h;

    /* renamed from: i, reason: collision with root package name */
    public final String f11308i;

    /* renamed from: j, reason: collision with root package name */
    public final C0920r f11309j;

    /* renamed from: k, reason: collision with root package name */
    public final C0804p f11310k;

    /* renamed from: l, reason: collision with root package name */
    public final C0802n f11311l;

    /* renamed from: m, reason: collision with root package name */
    public final EnumC0790b f11312m;

    /* renamed from: n, reason: collision with root package name */
    public final EnumC0790b f11313n;

    /* renamed from: o, reason: collision with root package name */
    public final EnumC0790b f11314o;

    public C0801m(Context context, Bitmap.Config config, ColorSpace colorSpace, e3.h hVar, e3.g gVar, boolean z7, boolean z8, boolean z9, String str, C0920r c0920r, C0804p c0804p, C0802n c0802n, EnumC0790b enumC0790b, EnumC0790b enumC0790b2, EnumC0790b enumC0790b3) {
        this.a = context;
        this.f11301b = config;
        this.f11302c = colorSpace;
        this.f11303d = hVar;
        this.f11304e = gVar;
        this.f11305f = z7;
        this.f11306g = z8;
        this.f11307h = z9;
        this.f11308i = str;
        this.f11309j = c0920r;
        this.f11310k = c0804p;
        this.f11311l = c0802n;
        this.f11312m = enumC0790b;
        this.f11313n = enumC0790b2;
        this.f11314o = enumC0790b3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0801m)) {
            return false;
        }
        C0801m c0801m = (C0801m) obj;
        if (kotlin.jvm.internal.l.a(this.a, c0801m.a) && this.f11301b == c0801m.f11301b) {
            return (Build.VERSION.SDK_INT < 26 || kotlin.jvm.internal.l.a(this.f11302c, c0801m.f11302c)) && kotlin.jvm.internal.l.a(this.f11303d, c0801m.f11303d) && this.f11304e == c0801m.f11304e && this.f11305f == c0801m.f11305f && this.f11306g == c0801m.f11306g && this.f11307h == c0801m.f11307h && kotlin.jvm.internal.l.a(this.f11308i, c0801m.f11308i) && kotlin.jvm.internal.l.a(this.f11309j, c0801m.f11309j) && kotlin.jvm.internal.l.a(this.f11310k, c0801m.f11310k) && kotlin.jvm.internal.l.a(this.f11311l, c0801m.f11311l) && this.f11312m == c0801m.f11312m && this.f11313n == c0801m.f11313n && this.f11314o == c0801m.f11314o;
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f11301b.hashCode() + (this.a.hashCode() * 31)) * 31;
        ColorSpace colorSpace = this.f11302c;
        int iD = AbstractC0703b.d(AbstractC0703b.d(AbstractC0703b.d((this.f11304e.hashCode() + ((this.f11303d.hashCode() + ((iHashCode + (colorSpace != null ? colorSpace.hashCode() : 0)) * 31)) * 31)) * 31, 31, this.f11305f), 31, this.f11306g), 31, this.f11307h);
        String str = this.f11308i;
        return this.f11314o.hashCode() + ((this.f11313n.hashCode() + ((this.f11312m.hashCode() + ((this.f11311l.f11316k.hashCode() + ((this.f11310k.a.hashCode() + ((((iD + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.f11309j.f11596k)) * 31)) * 31)) * 31)) * 31)) * 31);
    }
}
