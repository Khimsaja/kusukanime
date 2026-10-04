package X4;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/* renamed from: X4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0606c implements x {
    static {
        int i7 = C0611h.f9893b;
    }

    public final AbstractC0605b b(ByteArrayInputStream byteArrayInputStream, C0611h c0611h) throws IOException {
        AbstractC0605b abstractC0605b;
        try {
            int i7 = byteArrayInputStream.read();
            if (i7 == -1) {
                abstractC0605b = null;
            } else {
                if ((i7 & 128) != 0) {
                    i7 &= 127;
                    int i8 = 7;
                    while (true) {
                        if (i8 >= 32) {
                            while (i8 < 64) {
                                int i9 = byteArrayInputStream.read();
                                if (i9 == -1) {
                                    throw r.b();
                                }
                                if ((i9 & 128) != 0) {
                                    i8 += 7;
                                }
                            }
                            throw new r("CodedInputStream encountered a malformed varint.");
                        }
                        int i10 = byteArrayInputStream.read();
                        if (i10 == -1) {
                            throw r.b();
                        }
                        i7 |= (i10 & 127) << i8;
                        if ((i10 & 128) == 0) {
                            break;
                        }
                        i8 += 7;
                    }
                }
                C0609f c0609f = new C0609f(new C0604a(byteArrayInputStream, i7));
                AbstractC0605b abstractC0605b2 = (AbstractC0605b) a(c0609f, c0611h);
                try {
                    c0609f.a(0);
                    abstractC0605b = abstractC0605b2;
                } catch (r e7) {
                    e7.f9907k = abstractC0605b2;
                    throw e7;
                }
            }
            if (abstractC0605b == null || abstractC0605b.a()) {
                return abstractC0605b;
            }
            r rVar = new r(new D6.r().getMessage());
            rVar.f9907k = abstractC0605b;
            throw rVar;
        } catch (IOException e8) {
            throw new r(e8.getMessage());
        }
    }
}
