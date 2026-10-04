package k3;

import f1.AbstractC0871d;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;

/* renamed from: k3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1391b {
    static {
        new C1390a();
    }

    public static byte[] a(ArrayDeque arrayDeque, int i7) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i7) {
            return bArr;
        }
        int length = i7 - bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i7);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int iMin = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, bArrCopyOf, i7 - length, iMin);
            length -= iMin;
        }
        return bArrCopyOf;
    }

    public static byte[] b(InputStream inputStream) throws IOException {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int iMin = Math.min(8192, Math.max(128, Integer.highestOneBit(0) * 2));
        int i7 = 0;
        while (i7 < 2147483639) {
            int iMin2 = Math.min(iMin, 2147483639 - i7);
            byte[] bArr = new byte[iMin2];
            arrayDeque.add(bArr);
            int i8 = 0;
            while (i8 < iMin2) {
                int i9 = inputStream.read(bArr, i8, iMin2 - i8);
                if (i9 == -1) {
                    return a(arrayDeque, i7);
                }
                i8 += i9;
                i7 += i9;
            }
            iMin = AbstractC0871d.n0(iMin * (iMin < 4096 ? 4 : 2));
        }
        if (inputStream.read() == -1) {
            return a(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }
}
