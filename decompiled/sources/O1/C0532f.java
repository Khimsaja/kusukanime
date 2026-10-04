package O1;

import B1.AbstractC0015b;
import java.io.IOException;

/* renamed from: O1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0532f extends IOException {
    public C0532f(int i7) {
        this(i7, -9223372036854775807L, -9223372036854775807L);
    }

    public C0532f(int i7, long j7, long j8) {
        String str;
        StringBuilder sb = new StringBuilder("Illegal clipping: ");
        if (i7 != 0) {
            if (i7 == 1) {
                str = "not seekable to start";
            } else if (i7 != 2) {
                str = "unknown";
            } else {
                AbstractC0015b.h((j7 == -9223372036854775807L || j8 == -9223372036854775807L) ? false : true);
                str = "start exceeds end. Start time: " + j7 + ", End time: " + j8;
            }
        } else {
            str = "invalid period count";
        }
        sb.append(str);
        super(sb.toString());
    }
}
