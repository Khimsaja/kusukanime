package h2;

import A6.b;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import y1.B;
import y1.C2403z;
import y1.D;

/* renamed from: h2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1004a implements B {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11839b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11840c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11841d;

    /* renamed from: e, reason: collision with root package name */
    public final int f11842e;

    /* renamed from: f, reason: collision with root package name */
    public final int f11843f;

    /* renamed from: g, reason: collision with root package name */
    public final int f11844g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f11845h;

    public C1004a(int i7, String str, String str2, int i8, int i9, int i10, int i11, byte[] bArr) {
        this.a = i7;
        this.f11839b = str;
        this.f11840c = str2;
        this.f11841d = i8;
        this.f11842e = i9;
        this.f11843f = i10;
        this.f11844g = i11;
        this.f11845h = bArr;
    }

    public static C1004a d(B1.B b4) {
        int iG = b4.g();
        String strM = D.m(b4.r(b4.g(), StandardCharsets.US_ASCII));
        String strR = b4.r(b4.g(), StandardCharsets.UTF_8);
        int iG2 = b4.g();
        int iG3 = b4.g();
        int iG4 = b4.g();
        int iG5 = b4.g();
        int iG6 = b4.g();
        byte[] bArr = new byte[iG6];
        b4.e(bArr, 0, iG6);
        return new C1004a(iG, strM, strR, iG2, iG3, iG4, iG5, bArr);
    }

    @Override // y1.B
    public final void c(C2403z c2403z) {
        c2403z.a(this.f11845h, this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1004a.class == obj.getClass()) {
            C1004a c1004a = (C1004a) obj;
            if (this.a == c1004a.a && this.f11839b.equals(c1004a.f11839b) && this.f11840c.equals(c1004a.f11840c) && this.f11841d == c1004a.f11841d && this.f11842e == c1004a.f11842e && this.f11843f == c1004a.f11843f && this.f11844g == c1004a.f11844g && Arrays.equals(this.f11845h, c1004a.f11845h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f11845h) + ((((((((b.b(this.f11840c, b.b(this.f11839b, (527 + this.a) * 31, 31), 31) + this.f11841d) * 31) + this.f11842e) * 31) + this.f11843f) * 31) + this.f11844g) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.f11839b + ", description=" + this.f11840c;
    }
}
