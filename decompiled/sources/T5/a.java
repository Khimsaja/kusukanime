package T5;

import P3.m;
import b1.AbstractC0703b;
import java.util.Arrays;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class a implements Comparable {

    /* renamed from: m, reason: collision with root package name */
    public static final a f9116m = new a(new byte[0]);

    /* renamed from: n, reason: collision with root package name */
    public static final char[] f9117n;

    /* renamed from: k, reason: collision with root package name */
    public final byte[] f9118k;

    /* renamed from: l, reason: collision with root package name */
    public int f9119l;

    static {
        char[] charArray = "0123456789abcdef".toCharArray();
        l.e("toCharArray(...)", charArray);
        f9117n = charArray;
    }

    public a(byte[] bArr) {
        this.f9118k = bArr;
    }

    public final byte a(int i7) {
        byte[] bArr = this.f9118k;
        if (i7 < 0 || i7 >= bArr.length) {
            throw new IndexOutOfBoundsException(AbstractC0703b.l(AbstractC0703b.p(i7, "index (", ") is out of byte string bounds: [0.."), bArr.length, ')'));
        }
        return bArr[i7];
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        a aVar = (a) obj;
        l.f("other", aVar);
        if (aVar == this) {
            return 0;
        }
        byte[] bArr = this.f9118k;
        int length = bArr.length;
        byte[] bArr2 = aVar.f9118k;
        int iMin = Math.min(length, bArr2.length);
        for (int i7 = 0; i7 < iMin; i7++) {
            int iG = l.g(bArr[i7] & 255, bArr2[i7] & 255);
            if (iG != 0) {
                return iG;
            }
        }
        return l.g(bArr.length, bArr2.length);
    }

    public final boolean equals(Object obj) {
        int i7;
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        byte[] bArr = aVar.f9118k;
        int length = bArr.length;
        byte[] bArr2 = this.f9118k;
        if (length != bArr2.length) {
            return false;
        }
        int i8 = aVar.f9119l;
        if (i8 == 0 || (i7 = this.f9119l) == 0 || i8 == i7) {
            return Arrays.equals(bArr2, bArr);
        }
        return false;
    }

    public final int hashCode() {
        int i7 = this.f9119l;
        if (i7 != 0) {
            return i7;
        }
        int iHashCode = Arrays.hashCode(this.f9118k);
        this.f9119l = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        byte[] bArr = this.f9118k;
        if (bArr.length == 0) {
            return "ByteString(size=0)";
        }
        String strValueOf = String.valueOf(bArr.length);
        StringBuilder sb = new StringBuilder((bArr.length * 2) + strValueOf.length() + 22);
        sb.append("ByteString(size=");
        sb.append(strValueOf);
        sb.append(" hex=");
        for (byte b4 : bArr) {
            char[] cArr = f9117n;
            sb.append(cArr[(b4 >>> 4) & 15]);
            sb.append(cArr[b4 & 15]);
        }
        sb.append(')');
        String string = sb.toString();
        l.e("toString(...)", string);
        return string;
    }

    public /* synthetic */ a(byte[] bArr, int i7) {
        this(bArr, 0, bArr.length);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(byte[] bArr, int i7, int i8) {
        this(m.a0(bArr, i7, i8));
        l.f("data", bArr);
    }
}
