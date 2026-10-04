package w6;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class A implements InterfaceC2225j {

    /* renamed from: k, reason: collision with root package name */
    public final G f17109k;

    /* renamed from: l, reason: collision with root package name */
    public final C2224i f17110l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f17111m;

    public A(G g4) {
        kotlin.jvm.internal.l.f("sink", g4);
        this.f17109k = g4;
        this.f17110l = new C2224i();
    }

    @Override // w6.InterfaceC2225j
    public final InterfaceC2225j A(int i7) {
        if (this.f17111m) {
            throw new IllegalStateException("closed");
        }
        this.f17110l.g0(i7);
        b();
        return this;
    }

    @Override // w6.InterfaceC2225j
    public final InterfaceC2225j E(byte[] bArr) {
        kotlin.jvm.internal.l.f("source", bArr);
        if (this.f17111m) {
            throw new IllegalStateException("closed");
        }
        this.f17110l.f0(bArr);
        b();
        return this;
    }

    @Override // w6.InterfaceC2225j
    public final InterfaceC2225j R(String str) {
        kotlin.jvm.internal.l.f("string", str);
        if (this.f17111m) {
            throw new IllegalStateException("closed");
        }
        this.f17110l.k0(str);
        b();
        return this;
    }

    @Override // w6.InterfaceC2225j
    public final InterfaceC2225j S(long j7) {
        if (this.f17111m) {
            throw new IllegalStateException("closed");
        }
        this.f17110l.h0(j7);
        b();
        return this;
    }

    @Override // w6.InterfaceC2225j
    public final C2224i a() {
        return this.f17110l;
    }

    public final InterfaceC2225j b() {
        if (this.f17111m) {
            throw new IllegalStateException("closed");
        }
        C2224i c2224i = this.f17110l;
        long jG = c2224i.g();
        if (jG > 0) {
            this.f17109k.f(c2224i, jG);
        }
        return this;
    }

    @Override // w6.G, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        G g4 = this.f17109k;
        if (this.f17111m) {
            return;
        }
        try {
            C2224i c2224i = this.f17110l;
            long j7 = c2224i.f17156l;
            if (j7 > 0) {
                g4.f(c2224i, j7);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            g4.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f17111m = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // w6.G
    public final J d() {
        return this.f17109k.d();
    }

    public final InterfaceC2225j e(int i7) {
        if (this.f17111m) {
            throw new IllegalStateException("closed");
        }
        this.f17110l.r(i7);
        b();
        return this;
    }

    @Override // w6.G
    public final void f(C2224i c2224i, long j7) {
        kotlin.jvm.internal.l.f("source", c2224i);
        if (this.f17111m) {
            throw new IllegalStateException("closed");
        }
        this.f17110l.f(c2224i, j7);
        b();
    }

    @Override // w6.G, java.io.Flushable
    public final void flush() {
        if (this.f17111m) {
            throw new IllegalStateException("closed");
        }
        C2224i c2224i = this.f17110l;
        long j7 = c2224i.f17156l;
        G g4 = this.f17109k;
        if (j7 > 0) {
            g4.f(c2224i, j7);
        }
        g4.flush();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f17111m;
    }

    @Override // w6.InterfaceC2225j
    public final InterfaceC2225j k(l lVar) {
        kotlin.jvm.internal.l.f("byteString", lVar);
        if (this.f17111m) {
            throw new IllegalStateException("closed");
        }
        this.f17110l.e0(lVar);
        b();
        return this;
    }

    @Override // w6.InterfaceC2225j
    public final long l(H h7) {
        long j7 = 0;
        while (true) {
            long jF = ((C2220e) h7).F(this.f17110l, 8192L);
            if (jF == -1) {
                return j7;
            }
            j7 += jF;
            b();
        }
    }

    public final String toString() {
        return "buffer(" + this.f17109k + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        kotlin.jvm.internal.l.f("source", byteBuffer);
        if (this.f17111m) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.f17110l.write(byteBuffer);
        b();
        return iWrite;
    }

    @Override // w6.InterfaceC2225j
    public final InterfaceC2225j write(byte[] bArr, int i7, int i8) {
        kotlin.jvm.internal.l.f("source", bArr);
        if (!this.f17111m) {
            this.f17110l.m216write(bArr, i7, i8);
            b();
            return this;
        }
        throw new IllegalStateException("closed");
    }
}
