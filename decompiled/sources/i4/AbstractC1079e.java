package i4;

import b1.AbstractC0703b;
import j4.C1340a;
import kotlin.jvm.internal.l;
import v.c0;

/* renamed from: i4.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1079e {

    /* renamed from: k, reason: collision with root package name */
    public static final AbstractC1075a f12024k;

    static {
        Integer num = Y3.a.a;
        f12024k = (num == null || num.intValue() >= 34) ? new C1340a() : new C1077c();
    }

    public abstract int a(int i7);

    public void b(byte[] bArr) {
        l.f("array", bArr);
        c(bArr, bArr.length);
    }

    public byte[] c(byte[] bArr, int i7) {
        l.f("array", bArr);
        if (bArr.length < 0 || i7 < 0 || i7 > bArr.length) {
            throw new IllegalArgumentException(AbstractC0703b.l(AbstractC0703b.p(i7, "fromIndex (0) or toIndex (", ") are out of range: 0.."), bArr.length, '.').toString());
        }
        if (i7 < 0) {
            throw new IllegalArgumentException(c0.a(i7, "fromIndex (0) must be not greater than toIndex (", ").").toString());
        }
        int i8 = i7 / 4;
        int i9 = 0;
        for (int i10 = 0; i10 < i8; i10++) {
            int iD = d();
            bArr[i9] = (byte) iD;
            bArr[i9 + 1] = (byte) (iD >>> 8);
            bArr[i9 + 2] = (byte) (iD >>> 16);
            bArr[i9 + 3] = (byte) (iD >>> 24);
            i9 += 4;
        }
        int i11 = i7 - i9;
        int iA = a(i11 * 8);
        for (int i12 = 0; i12 < i11; i12++) {
            bArr[i9 + i12] = (byte) (iA >>> (i12 * 8));
        }
        return bArr;
    }

    public abstract int d();

    public long e() {
        return (d() << 32) + d();
    }

    public long f(long j7) {
        return g(j7);
    }

    public long g(long j7) {
        long jE;
        long j8;
        if (j7 <= 0) {
            throw new IllegalArgumentException(("Random range is empty: [" + ((Object) 0L) + ", " + Long.valueOf(j7) + ").").toString());
        }
        if (j7 > 0) {
            if (((-j7) & j7) == j7) {
                return ((int) j7) != 0 ? a(31 - Integer.numberOfLeadingZeros(r0)) & 4294967295L : ((int) (j7 >>> 32)) == 1 ? d() & 4294967295L : (a(31 - Integer.numberOfLeadingZeros(r11)) << 32) + (d() & 4294967295L);
            }
            do {
                jE = e() >>> 1;
                j8 = jE % j7;
            } while ((j7 - 1) + (jE - j8) < 0);
            return j8;
        }
        while (true) {
            long jE2 = e();
            if (0 <= jE2 && jE2 < j7) {
                return jE2;
            }
        }
    }
}
