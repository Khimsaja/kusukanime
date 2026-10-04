package d3;

import android.graphics.drawable.Drawable;
import b1.AbstractC0703b;
import b3.C0710b;

/* renamed from: d3.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0803o extends AbstractC0798j {
    public final Drawable a;

    /* renamed from: b, reason: collision with root package name */
    public final C0797i f11317b;

    /* renamed from: c, reason: collision with root package name */
    public final U2.e f11318c;

    /* renamed from: d, reason: collision with root package name */
    public final C0710b f11319d;

    /* renamed from: e, reason: collision with root package name */
    public final String f11320e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f11321f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f11322g;

    public C0803o(Drawable drawable, C0797i c0797i, U2.e eVar, C0710b c0710b, String str, boolean z7, boolean z8) {
        this.a = drawable;
        this.f11317b = c0797i;
        this.f11318c = eVar;
        this.f11319d = c0710b;
        this.f11320e = str;
        this.f11321f = z7;
        this.f11322g = z8;
    }

    @Override // d3.AbstractC0798j
    public final Drawable a() {
        return this.a;
    }

    @Override // d3.AbstractC0798j
    public final C0797i b() {
        return this.f11317b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0803o)) {
            return false;
        }
        C0803o c0803o = (C0803o) obj;
        if (kotlin.jvm.internal.l.a(this.a, c0803o.a)) {
            return kotlin.jvm.internal.l.a(this.f11317b, c0803o.f11317b) && this.f11318c == c0803o.f11318c && kotlin.jvm.internal.l.a(this.f11319d, c0803o.f11319d) && kotlin.jvm.internal.l.a(this.f11320e, c0803o.f11320e) && this.f11321f == c0803o.f11321f && this.f11322g == c0803o.f11322g;
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f11318c.hashCode() + ((this.f11317b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        C0710b c0710b = this.f11319d;
        int iHashCode2 = (iHashCode + (c0710b != null ? c0710b.hashCode() : 0)) * 31;
        String str = this.f11320e;
        return Boolean.hashCode(this.f11322g) + AbstractC0703b.d((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f11321f);
    }
}
