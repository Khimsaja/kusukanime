package h0;

import android.graphics.ColorFilter;
import b1.AbstractC0703b;

/* renamed from: h0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0990m {
    public final ColorFilter a;

    /* renamed from: b, reason: collision with root package name */
    public final long f11825b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11826c;

    public C0990m(long j7, int i7, ColorFilter colorFilter) {
        this.a = colorFilter;
        this.f11825b = j7;
        this.f11826c = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0990m)) {
            return false;
        }
        C0990m c0990m = (C0990m) obj;
        if (C0998u.c(this.f11825b, c0990m.f11825b)) {
            return this.f11826c == c0990m.f11826c;
        }
        return false;
    }

    public final int hashCode() {
        int i7 = C0998u.f11835h;
        return Integer.hashCode(this.f11826c) + (Long.hashCode(this.f11825b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlendModeColorFilter(color=");
        AbstractC0703b.x(this.f11825b, ", blendMode=", sb);
        int i7 = this.f11826c;
        sb.append((Object) (i7 == 0 ? "Clear" : i7 == 1 ? "Src" : i7 == 2 ? "Dst" : i7 == 3 ? "SrcOver" : i7 == 4 ? "DstOver" : i7 == 5 ? "SrcIn" : i7 == 6 ? "DstIn" : i7 == 7 ? "SrcOut" : i7 == 8 ? "DstOut" : i7 == 9 ? "SrcAtop" : i7 == 10 ? "DstAtop" : i7 == 11 ? "Xor" : i7 == 12 ? "Plus" : i7 == 13 ? "Modulate" : i7 == 14 ? "Screen" : i7 == 15 ? "Overlay" : i7 == 16 ? "Darken" : i7 == 17 ? "Lighten" : i7 == 18 ? "ColorDodge" : i7 == 19 ? "ColorBurn" : i7 == 20 ? "HardLight" : i7 == 21 ? "Softlight" : i7 == 22 ? "Difference" : i7 == 23 ? "Exclusion" : i7 == 24 ? "Multiply" : i7 == 25 ? "Hue" : i7 == 26 ? "Saturation" : i7 == 27 ? "Color" : i7 == 28 ? "Luminosity" : "Unknown"));
        sb.append(')');
        return sb.toString();
    }
}
