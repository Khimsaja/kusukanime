package F1;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface o {
    static long a(o oVar) {
        byte[] bArr = (byte[]) ((p) oVar).f2210b.get("exo_len");
        if (bArr != null) {
            return ByteBuffer.wrap(bArr).getLong();
        }
        return -1L;
    }
}
