package a4;

import b1.AbstractC0703b;
import kotlin.jvm.internal.l;
import z5.C2496a;

/* renamed from: a4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0665c {

    /* renamed from: e, reason: collision with root package name */
    public static final C0663a f10439e;

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f10440f;

    /* renamed from: g, reason: collision with root package name */
    public static final C0665c f10441g;
    public final boolean a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f10442b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10443c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10444d;

    static {
        EnumC0664b[] enumC0664bArr = EnumC0664b.f10438k;
        f10439e = new C0663a(-1, false, false);
        f10440f = new byte[]{13, 10};
        f10441g = new C0665c(-1, true, false);
        new C0665c(76, false, true);
        new C0665c(64, false, true);
    }

    public C0665c(int i7, boolean z7, boolean z8) {
        EnumC0664b[] enumC0664bArr = EnumC0664b.f10438k;
        this.a = z7;
        this.f10442b = z8;
        this.f10443c = i7;
        if (z7 && z8) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.f10444d = i7 / 4;
    }

    public static String a(C0665c c0665c, byte[] bArr) {
        int i7;
        int length = bArr.length;
        c0665c.getClass();
        l.f("source", bArr);
        q0.c.l(0, length, bArr.length);
        int iB = c0665c.b(length);
        byte[] bArr2 = new byte[iB];
        q0.c.l(0, length, bArr.length);
        int iB2 = c0665c.b(length);
        if (iB < 0) {
            throw new IndexOutOfBoundsException(AbstractC0703b.g(iB, "destination offset: 0, destination size: "));
        }
        if (iB2 < 0 || iB2 > iB) {
            throw new IndexOutOfBoundsException(A6.b.e(iB, iB2, "The destination array does not have enough capacity, destination offset: 0, destination size: ", ", capacity needed: "));
        }
        byte[] bArr3 = c0665c.a ? AbstractC0666d.f10445b : AbstractC0666d.a;
        int i8 = c0665c.f10442b ? c0665c.f10444d : Integer.MAX_VALUE;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            i7 = i9 + 2;
            if (i7 >= length) {
                break;
            }
            int iMin = Math.min((length - i9) / 3, i8);
            for (int i11 = 0; i11 < iMin; i11++) {
                int i12 = bArr[i9] & 255;
                int i13 = i9 + 2;
                int i14 = bArr[i9 + 1] & 255;
                i9 += 3;
                int i15 = (i14 << 8) | (i12 << 16) | (bArr[i13] & 255);
                bArr2[i10] = bArr3[i15 >>> 18];
                bArr2[i10 + 1] = bArr3[(i15 >>> 12) & 63];
                int i16 = i10 + 3;
                bArr2[i10 + 2] = bArr3[(i15 >>> 6) & 63];
                i10 += 4;
                bArr2[i16] = bArr3[i15 & 63];
            }
            if (iMin == i8 && i9 != length) {
                int i17 = i10 + 1;
                byte[] bArr4 = f10440f;
                bArr2[i10] = bArr4[0];
                i10 += 2;
                bArr2[i17] = bArr4[1];
            }
        }
        int i18 = length - i9;
        if (i18 == 1) {
            int i19 = (bArr[i9] & 255) << 4;
            bArr2[i10] = bArr3[i19 >>> 6];
            bArr2[1 + i10] = bArr3[i19 & 63];
            EnumC0664b[] enumC0664bArr = EnumC0664b.f10438k;
            bArr2[2 + i10] = 61;
            bArr2[i10 + 3] = 61;
            i9++;
        } else if (i18 == 2) {
            int i20 = ((bArr[i9 + 1] & 255) << 2) | ((bArr[i9] & 255) << 10);
            bArr2[i10] = bArr3[i20 >>> 12];
            bArr2[1 + i10] = bArr3[(i20 >>> 6) & 63];
            bArr2[2 + i10] = bArr3[i20 & 63];
            EnumC0664b[] enumC0664bArr2 = EnumC0664b.f10438k;
            bArr2[i10 + 3] = 61;
            i9 = i7;
        }
        if (i9 == length) {
            return new String(bArr2, C2496a.f19037c);
        }
        throw new IllegalStateException("Check failed.");
    }

    public final int b(int i7) {
        int i8 = (i7 / 3) * 4;
        if (i7 % 3 != 0) {
            EnumC0664b[] enumC0664bArr = EnumC0664b.f10438k;
            i8 += 4;
        }
        if (i8 < 0) {
            throw new IllegalArgumentException("Input is too big");
        }
        if (this.f10442b) {
            i8 += ((i8 - 1) / this.f10443c) * 2;
        }
        if (i8 >= 0) {
            return i8;
        }
        throw new IllegalArgumentException("Input is too big");
    }
}
