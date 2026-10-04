package w6;

import b1.AbstractC0703b;
import java.io.EOFException;
import java.nio.ByteBuffer;
import z5.C2496a;

/* loaded from: classes.dex */
public final class C implements InterfaceC2226k {

    /* renamed from: k, reason: collision with root package name */
    public final H f17113k;

    /* renamed from: l, reason: collision with root package name */
    public final C2224i f17114l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f17115m;

    public C(H h7) {
        kotlin.jvm.internal.l.f("source", h7);
        this.f17113k = h7;
        this.f17114l = new C2224i();
    }

    @Override // w6.H
    public final long F(C2224i c2224i, long j7) {
        kotlin.jvm.internal.l.f("sink", c2224i);
        if (j7 < 0) {
            throw new IllegalArgumentException(AbstractC0703b.h("byteCount < 0: ", j7).toString());
        }
        if (this.f17115m) {
            throw new IllegalStateException("closed");
        }
        C2224i c2224i2 = this.f17114l;
        if (c2224i2.f17156l == 0) {
            if (j7 == 0) {
                return 0L;
            }
            if (this.f17113k.F(c2224i2, 8192L) == -1) {
                return -1L;
            }
        }
        return c2224i2.F(c2224i, Math.min(j7, c2224i2.f17156l));
    }

    @Override // w6.InterfaceC2226k
    public final void G(C2224i c2224i, long j7) throws EOFException {
        C2224i c2224i2 = this.f17114l;
        try {
            Q(j7);
            c2224i2.G(c2224i, j7);
        } catch (EOFException e7) {
            c2224i.l(c2224i2);
            throw e7;
        }
    }

    @Override // w6.InterfaceC2226k
    public final long K(l lVar) {
        kotlin.jvm.internal.l.f("bytes", lVar);
        return x6.b.c(this, lVar, lVar.f17158k.length, Long.MAX_VALUE);
    }

    public final void Q(long j7) {
        if (!c(j7)) {
            throw new EOFException();
        }
    }

    @Override // w6.InterfaceC2226k
    public final int U(x xVar) throws EOFException {
        kotlin.jvm.internal.l.f("options", xVar);
        if (this.f17115m) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            C2224i c2224i = this.f17114l;
            int iD = x6.a.d(c2224i, xVar, true);
            if (iD != -2) {
                if (iD != -1) {
                    c2224i.n(xVar.f17188k[iD].d());
                    return iD;
                }
            } else if (this.f17113k.F(c2224i, 8192L) == -1) {
                break;
            }
        }
        return -1;
    }

    @Override // w6.InterfaceC2226k
    public final long V(l lVar) {
        kotlin.jvm.internal.l.f("targetBytes", lVar);
        if (this.f17115m) {
            throw new IllegalStateException("closed");
        }
        long jMax = 0;
        while (true) {
            C2224i c2224i = this.f17114l;
            long jH = c2224i.H(jMax, lVar);
            if (jH != -1) {
                return jH;
            }
            long j7 = c2224i.f17156l;
            if (this.f17113k.F(c2224i, 8192L) == -1) {
                return -1L;
            }
            jMax = Math.max(jMax, j7);
        }
    }

    @Override // w6.InterfaceC2226k
    public final C2224i a() {
        return this.f17114l;
    }

    public final long b(byte b4, long j7, long j8) {
        if (this.f17115m) {
            throw new IllegalStateException("closed");
        }
        if (0 > j8) {
            throw new IllegalArgumentException(AbstractC0703b.h("fromIndex=0 toIndex=", j8).toString());
        }
        long jMax = 0;
        while (jMax < j8) {
            C2224i c2224i = this.f17114l;
            byte b7 = b4;
            long j9 = j8;
            long jX = c2224i.x(b7, jMax, j9);
            if (jX != -1) {
                return jX;
            }
            long j10 = c2224i.f17156l;
            if (j10 >= j9 || this.f17113k.F(c2224i, 8192L) == -1) {
                break;
            }
            jMax = Math.max(jMax, j10);
            b4 = b7;
            j8 = j9;
        }
        return -1L;
    }

    @Override // w6.InterfaceC2226k
    public final boolean c(long j7) {
        C2224i c2224i;
        if (j7 < 0) {
            throw new IllegalArgumentException(AbstractC0703b.h("byteCount < 0: ", j7).toString());
        }
        if (this.f17115m) {
            throw new IllegalStateException("closed");
        }
        do {
            c2224i = this.f17114l;
            if (c2224i.f17156l >= j7) {
                return true;
            }
        } while (this.f17113k.F(c2224i, 8192L) != -1);
        return false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.f17115m) {
            return;
        }
        this.f17115m = true;
        this.f17113k.close();
        this.f17114l.b();
    }

    @Override // w6.H
    public final J d() {
        return this.f17113k.d();
    }

    public final l e(long j7) {
        Q(j7);
        return this.f17114l.T(j7);
    }

    public final int g() {
        Q(4L);
        int i7 = this.f17114l.readInt();
        return ((i7 & 255) << 24) | (((-16777216) & i7) >>> 24) | ((16711680 & i7) >>> 8) | ((65280 & i7) << 8);
    }

    public final long i() throws EOFException {
        Q(8L);
        long j7 = this.f17114l.readLong();
        return ((j7 & 255) << 56) | (((-72057594037927936L) & j7) >>> 56) | ((71776119061217280L & j7) >>> 40) | ((280375465082880L & j7) >>> 24) | ((1095216660480L & j7) >>> 8) | ((4278190080L & j7) << 8) | ((16711680 & j7) << 24) | ((65280 & j7) << 40);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f17115m;
    }

    public final short j() {
        Q(2L);
        return this.f17114l.Y();
    }

    public final String m(long j7) {
        Q(j7);
        C2224i c2224i = this.f17114l;
        c2224i.getClass();
        return c2224i.Z(j7, C2496a.f19036b);
    }

    @Override // w6.InterfaceC2226k
    public final void n(long j7) {
        if (this.f17115m) {
            throw new IllegalStateException("closed");
        }
        while (j7 > 0) {
            C2224i c2224i = this.f17114l;
            if (c2224i.f17156l == 0 && this.f17113k.F(c2224i, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j7, c2224i.f17156l);
            c2224i.n(jMin);
            j7 -= jMin;
        }
    }

    @Override // w6.InterfaceC2226k
    public final boolean p(long j7, l lVar) {
        kotlin.jvm.internal.l.f("bytes", lVar);
        byte[] bArr = lVar.f17158k;
        int length = bArr.length;
        if (this.f17115m) {
            throw new IllegalStateException("closed");
        }
        if (length >= 0 && length <= bArr.length) {
            return length == 0 || x6.b.c(this, lVar, length, 1L) != -1;
        }
        return false;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        kotlin.jvm.internal.l.f("sink", byteBuffer);
        C2224i c2224i = this.f17114l;
        if (c2224i.f17156l == 0 && this.f17113k.F(c2224i, 8192L) == -1) {
            return -1;
        }
        return c2224i.read(byteBuffer);
    }

    public final byte readByte() {
        Q(1L);
        return this.f17114l.readByte();
    }

    public final int readInt() {
        Q(4L);
        return this.f17114l.readInt();
    }

    public final short readShort() {
        Q(2L);
        return this.f17114l.readShort();
    }

    public final String s(long j7) {
        if (j7 < 0) {
            throw new IllegalArgumentException(AbstractC0703b.h("limit < 0: ", j7).toString());
        }
        long j8 = j7 == Long.MAX_VALUE ? Long.MAX_VALUE : j7 + 1;
        long jB = b((byte) 10, 0L, j8);
        C2224i c2224i = this.f17114l;
        if (jB != -1) {
            return x6.a.c(c2224i, jB);
        }
        if (j8 < Long.MAX_VALUE && c(j8) && c2224i.v(j8 - 1) == 13 && c(j8 + 1) && c2224i.v(j8) == 10) {
            return x6.a.c(c2224i, j8);
        }
        C2224i c2224i2 = new C2224i();
        c2224i.i(c2224i2, 0L, Math.min(32, c2224i.f17156l));
        throw new EOFException("\\n not found: limit=" + Math.min(c2224i.f17156l, j7) + " content=" + c2224i2.T(c2224i2.f17156l).e() + (char) 8230);
    }

    public final String toString() {
        return "buffer(" + this.f17113k + ')';
    }

    @Override // w6.InterfaceC2226k
    public final String w() {
        return s(Long.MAX_VALUE);
    }

    @Override // w6.InterfaceC2226k
    public final long y(InterfaceC2225j interfaceC2225j) {
        C2224i c2224i;
        long j7 = 0;
        while (true) {
            c2224i = this.f17114l;
            if (this.f17113k.F(c2224i, 8192L) == -1) {
                break;
            }
            long jG = c2224i.g();
            if (jG > 0) {
                j7 += jG;
                interfaceC2225j.f(c2224i, jG);
            }
        }
        long j8 = c2224i.f17156l;
        if (j8 <= 0) {
            return j7;
        }
        long j9 = j7 + j8;
        interfaceC2225j.f(c2224i, j8);
        return j9;
    }

    public final boolean z() {
        if (this.f17115m) {
            throw new IllegalStateException("closed");
        }
        C2224i c2224i = this.f17114l;
        return c2224i.z() && this.f17113k.F(c2224i, 8192L) == -1;
    }
}
