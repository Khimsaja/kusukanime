package m3;

import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class c {
    public static final byte[] a;

    static {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i7 = 0; i7 < 10; i7++) {
            bArr[i7 + 48] = (byte) i7;
        }
        for (int i8 = 0; i8 < 26; i8++) {
            byte b4 = (byte) (i8 + 10);
            bArr[i8 + 65] = b4;
            bArr[i8 + 97] = b4;
        }
        a = bArr;
    }
}
