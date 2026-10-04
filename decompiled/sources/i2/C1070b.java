package i2;

import B1.AbstractC0015b;
import java.util.Objects;
import y1.B;
import y1.C2403z;

/* renamed from: i2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1070b implements B {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11998b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11999c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12000d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f12001e;

    /* renamed from: f, reason: collision with root package name */
    public final int f12002f;

    public C1070b(int i7, String str, String str2, String str3, boolean z7, int i8) {
        AbstractC0015b.c(i8 == -1 || i8 > 0);
        this.a = i7;
        this.f11998b = str;
        this.f11999c = str2;
        this.f12000d = str3;
        this.f12001e = z7;
        this.f12002f = i8;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static i2.C1070b d(java.util.Map r14) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.C1070b.d(java.util.Map):i2.b");
    }

    @Override // y1.B
    public final void c(C2403z c2403z) {
        String str = this.f11999c;
        if (str != null) {
            c2403z.f18166x = str;
        }
        String str2 = this.f11998b;
        if (str2 != null) {
            c2403z.f18165w = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1070b.class == obj.getClass()) {
            C1070b c1070b = (C1070b) obj;
            if (this.a == c1070b.a && Objects.equals(this.f11998b, c1070b.f11998b) && Objects.equals(this.f11999c, c1070b.f11999c) && Objects.equals(this.f12000d, c1070b.f12000d) && this.f12001e == c1070b.f12001e && this.f12002f == c1070b.f12002f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = (527 + this.a) * 31;
        String str = this.f11998b;
        int iHashCode = (i7 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f11999c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f12000d;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f12001e ? 1 : 0)) * 31) + this.f12002f;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.f11999c + "\", genre=\"" + this.f11998b + "\", bitrate=" + this.a + ", metadataInterval=" + this.f12002f;
    }
}
