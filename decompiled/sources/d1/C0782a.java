package d1;

import a1.AbstractC0657a;
import android.graphics.Insets;
import b1.AbstractC0703b;

/* renamed from: d1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0782a {

    /* renamed from: e, reason: collision with root package name */
    public static final C0782a f11199e = new C0782a(0, 0, 0, 0);
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11200b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11201c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11202d;

    public C0782a(int i7, int i8, int i9, int i10) {
        this.a = i7;
        this.f11200b = i8;
        this.f11201c = i9;
        this.f11202d = i10;
    }

    public static C0782a a(C0782a c0782a, C0782a c0782a2) {
        return b(Math.max(c0782a.a, c0782a2.a), Math.max(c0782a.f11200b, c0782a2.f11200b), Math.max(c0782a.f11201c, c0782a2.f11201c), Math.max(c0782a.f11202d, c0782a2.f11202d));
    }

    public static C0782a b(int i7, int i8, int i9, int i10) {
        return (i7 == 0 && i8 == 0 && i9 == 0 && i10 == 0) ? f11199e : new C0782a(i7, i8, i9, i10);
    }

    public static C0782a c(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets d() {
        return AbstractC0657a.b(this.a, this.f11200b, this.f11201c, this.f11202d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0782a.class != obj.getClass()) {
            return false;
        }
        C0782a c0782a = (C0782a) obj;
        return this.f11202d == c0782a.f11202d && this.a == c0782a.a && this.f11201c == c0782a.f11201c && this.f11200b == c0782a.f11200b;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.f11200b) * 31) + this.f11201c) * 31) + this.f11202d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.a);
        sb.append(", top=");
        sb.append(this.f11200b);
        sb.append(", right=");
        sb.append(this.f11201c);
        sb.append(", bottom=");
        return AbstractC0703b.l(sb, this.f11202d, '}');
    }
}
