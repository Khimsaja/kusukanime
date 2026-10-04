package w6;

import b1.AbstractC0703b;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import z5.AbstractC2510o;

/* loaded from: classes.dex */
public final class s implements H {

    /* renamed from: k, reason: collision with root package name */
    public byte f17175k;

    /* renamed from: l, reason: collision with root package name */
    public final C f17176l;

    /* renamed from: m, reason: collision with root package name */
    public final Inflater f17177m;

    /* renamed from: n, reason: collision with root package name */
    public final t f17178n;

    /* renamed from: o, reason: collision with root package name */
    public final CRC32 f17179o;

    public s(H h7) {
        kotlin.jvm.internal.l.f("source", h7);
        C c2 = new C(h7);
        this.f17176l = c2;
        Inflater inflater = new Inflater(true);
        this.f17177m = inflater;
        this.f17178n = new t(c2, inflater);
        this.f17179o = new CRC32();
    }

    public static void b(String str, int i7, int i8) throws IOException {
        if (i8 == i7) {
            return;
        }
        throw new IOException(str + ": actual 0x" + AbstractC2510o.l0(8, AbstractC2217b.j(i8)) + " != expected 0x" + AbstractC2510o.l0(8, AbstractC2217b.j(i7)));
    }

    @Override // w6.H
    public final long F(C2224i c2224i, long j7) throws DataFormatException, IOException {
        s sVar = this;
        kotlin.jvm.internal.l.f("sink", c2224i);
        if (j7 < 0) {
            throw new IllegalArgumentException(AbstractC0703b.h("byteCount < 0: ", j7).toString());
        }
        if (j7 == 0) {
            return 0L;
        }
        byte b4 = sVar.f17175k;
        CRC32 crc32 = sVar.f17179o;
        C c2 = sVar.f17176l;
        if (b4 == 0) {
            c2.Q(10L);
            C2224i c2224i2 = c2.f17114l;
            byte bV = c2224i2.v(3L);
            boolean z7 = ((bV >> 1) & 1) == 1;
            if (z7) {
                sVar.e(c2224i2, 0L, 10L);
            }
            b("ID1ID2", 8075, c2.readShort());
            c2.n(8L);
            if (((bV >> 2) & 1) == 1) {
                c2.Q(2L);
                if (z7) {
                    e(c2224i2, 0L, 2L);
                }
                long jY = c2224i2.Y() & 65535;
                c2.Q(jY);
                if (z7) {
                    e(c2224i2, 0L, jY);
                }
                c2.n(jY);
            }
            if (((bV >> 3) & 1) == 1) {
                long jB = c2.b((byte) 0, 0L, Long.MAX_VALUE);
                if (jB == -1) {
                    throw new EOFException();
                }
                if (z7) {
                    e(c2224i2, 0L, jB + 1);
                }
                c2.n(jB + 1);
            }
            if (((bV >> 4) & 1) == 1) {
                long jB2 = c2.b((byte) 0, 0L, Long.MAX_VALUE);
                if (jB2 == -1) {
                    throw new EOFException();
                }
                if (z7) {
                    sVar = this;
                    sVar.e(c2224i2, 0L, jB2 + 1);
                } else {
                    sVar = this;
                }
                c2.n(jB2 + 1);
            } else {
                sVar = this;
            }
            if (z7) {
                b("FHCRC", c2.j(), (short) crc32.getValue());
                crc32.reset();
            }
            sVar.f17175k = (byte) 1;
        }
        if (sVar.f17175k == 1) {
            long j8 = c2224i.f17156l;
            long jF = sVar.f17178n.F(c2224i, j7);
            if (jF != -1) {
                sVar.e(c2224i, j8, jF);
                return jF;
            }
            sVar.f17175k = (byte) 2;
        }
        if (sVar.f17175k == 2) {
            b("CRC", c2.g(), (int) crc32.getValue());
            b("ISIZE", c2.g(), (int) sVar.f17177m.getBytesWritten());
            sVar.f17175k = (byte) 3;
            if (!c2.z()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f17178n.close();
    }

    @Override // w6.H
    public final J d() {
        return this.f17176l.f17113k.d();
    }

    public final void e(C2224i c2224i, long j7, long j8) {
        D d4 = c2224i.f17155k;
        kotlin.jvm.internal.l.c(d4);
        while (true) {
            int i7 = d4.f17117c;
            int i8 = d4.f17116b;
            if (j7 < i7 - i8) {
                break;
            }
            j7 -= i7 - i8;
            d4 = d4.f17120f;
            kotlin.jvm.internal.l.c(d4);
        }
        while (j8 > 0) {
            int iMin = (int) Math.min(d4.f17117c - r6, j8);
            this.f17179o.update(d4.a, (int) (d4.f17116b + j7), iMin);
            j8 -= iMin;
            d4 = d4.f17120f;
            kotlin.jvm.internal.l.c(d4);
            j7 = 0;
        }
    }
}
