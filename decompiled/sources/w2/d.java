package w2;

import B1.AbstractC0015b;
import android.graphics.Color;
import f1.AbstractC0871d;
import io.ktor.util.GzipHeaderFlags;

/* loaded from: classes.dex */
public final class d {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16919b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f16920c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f16921d;

    /* renamed from: e, reason: collision with root package name */
    public final float f16922e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f16923f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f16924g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f16925h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f16926i;

    /* renamed from: j, reason: collision with root package name */
    public final int f16927j;

    public d(String str, int i7, Integer num, Integer num2, float f5, boolean z7, boolean z8, boolean z9, boolean z10, int i8) {
        this.a = str;
        this.f16919b = i7;
        this.f16920c = num;
        this.f16921d = num2;
        this.f16922e = f5;
        this.f16923f = z7;
        this.f16924g = z8;
        this.f16925h = z9;
        this.f16926i = z10;
        this.f16927j = i8;
    }

    public static int a(String str) {
        boolean z7;
        try {
            int i7 = Integer.parseInt(str.trim());
            switch (i7) {
                case 1:
                case 2:
                case 3:
                case GzipHeaderFlags.EXTRA /* 4 */:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    z7 = true;
                    break;
                default:
                    z7 = false;
                    break;
            }
            if (z7) {
                return i7;
            }
        } catch (NumberFormatException unused) {
        }
        A6.b.p("Ignoring unknown alignment: ", str, "SsaStyle");
        return -1;
    }

    public static boolean b(String str) throws NumberFormatException {
        try {
            int i7 = Integer.parseInt(str);
            return i7 == 1 || i7 == -1;
        } catch (NumberFormatException e7) {
            AbstractC0015b.w("SsaStyle", "Failed to parse boolean value: '" + str + "'", e7);
            return false;
        }
    }

    public static Integer c(String str) {
        try {
            long j7 = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            AbstractC0015b.c(j7 <= 4294967295L);
            return Integer.valueOf(Color.argb(AbstractC0871d.I(((j7 >> 24) & 255) ^ 255), AbstractC0871d.I(j7 & 255), AbstractC0871d.I((j7 >> 8) & 255), AbstractC0871d.I((j7 >> 16) & 255)));
        } catch (IllegalArgumentException e7) {
            AbstractC0015b.w("SsaStyle", "Failed to parse color expression: '" + str + "'", e7);
            return null;
        }
    }
}
