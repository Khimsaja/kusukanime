package m6;

import java.io.IOException;

/* loaded from: classes.dex */
public abstract class p {
    public static int a(int i7, int i8, int i9) throws IOException {
        if ((i8 & 8) != 0) {
            i7--;
        }
        if (i9 <= i7) {
            return i7 - i9;
        }
        throw new IOException(A6.b.e(i9, i7, "PROTOCOL_ERROR padding ", " > remaining length "));
    }
}
