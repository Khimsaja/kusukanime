package S5;

import b1.AbstractC0703b;
import java.io.EOFException;

/* loaded from: classes.dex */
public final class g implements l {

    /* renamed from: k, reason: collision with root package name */
    public final e f8793k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f8794l;

    /* renamed from: m, reason: collision with root package name */
    public final a f8795m = new a();

    public g(e eVar) {
        this.f8793k = eVar;
    }

    @Override // S5.l
    public final void D(byte b4) {
        if (this.f8794l) {
            throw new IllegalStateException("Sink is closed.");
        }
        this.f8795m.D(b4);
        q();
    }

    @Override // S5.l
    public final void I(n nVar, long j7) throws EOFException {
        if (this.f8794l) {
            throw new IllegalStateException("Sink is closed.");
        }
        if (j7 < 0) {
            throw new IllegalArgumentException(AbstractC0703b.h("byteCount: ", j7).toString());
        }
        long j8 = j7;
        while (j8 > 0) {
            long atMostTo = nVar.readAtMostTo(this.f8795m, j8);
            if (atMostTo == -1) {
                throw new EOFException(A6.b.f(j7 - j8, ").", A6.b.k("Source exhausted before reading ", j7, " bytes from it (number of bytes read: ")));
            }
            j8 -= atMostTo;
            q();
        }
    }

    @Override // S5.l
    public final long M(f fVar) {
        kotlin.jvm.internal.l.f("source", fVar);
        if (this.f8794l) {
            throw new IllegalStateException("Sink is closed.");
        }
        long j7 = 0;
        while (true) {
            long atMostTo = fVar.readAtMostTo(this.f8795m, 8192L);
            if (atMostTo == -1) {
                return j7;
            }
            j7 += atMostTo;
            q();
        }
    }

    @Override // S5.l
    public final a a() {
        return this.f8795m;
    }

    @Override // S5.e
    public final void close() throws Throwable {
        e eVar = this.f8793k;
        if (this.f8794l) {
            return;
        }
        try {
            a aVar = this.f8795m;
            long j7 = aVar.f8784m;
            if (j7 > 0) {
                eVar.write(aVar, j7);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            eVar.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f8794l = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // S5.e, java.io.Flushable
    public final void flush() {
        if (this.f8794l) {
            throw new IllegalStateException("Sink is closed.");
        }
        a aVar = this.f8795m;
        long j7 = aVar.f8784m;
        e eVar = this.f8793k;
        if (j7 > 0) {
            eVar.write(aVar, j7);
        }
        eVar.flush();
    }

    @Override // S5.l
    public final void h(long j7) {
        if (this.f8794l) {
            throw new IllegalStateException("Sink is closed.");
        }
        this.f8795m.h(j7);
        q();
    }

    @Override // S5.l
    public final void o(short s7) {
        if (this.f8794l) {
            throw new IllegalStateException("Sink is closed.");
        }
        this.f8795m.o(s7);
        q();
    }

    @Override // S5.l
    public final void q() {
        if (this.f8794l) {
            throw new IllegalStateException("Sink is closed.");
        }
        a aVar = this.f8795m;
        long jB = aVar.b();
        if (jB > 0) {
            this.f8793k.write(aVar, jB);
        }
    }

    @Override // S5.l
    public final void r(int i7) {
        if (this.f8794l) {
            throw new IllegalStateException("Sink is closed.");
        }
        this.f8795m.r(i7);
        q();
    }

    public final String toString() {
        return "buffered(" + this.f8793k + ')';
    }

    @Override // S5.e
    public final void write(a aVar, long j7) {
        kotlin.jvm.internal.l.f("source", aVar);
        if (this.f8794l) {
            throw new IllegalStateException("Sink is closed.");
        }
        if (j7 < 0) {
            throw new IllegalArgumentException(AbstractC0703b.h("byteCount: ", j7).toString());
        }
        this.f8795m.write(aVar, j7);
        q();
    }

    @Override // S5.l
    public final void write(byte[] bArr, int i7, int i8) {
        kotlin.jvm.internal.l.f("source", bArr);
        if (!this.f8794l) {
            p.a(bArr.length, i7, i8);
            this.f8795m.write(bArr, i7, i8);
            q();
            return;
        }
        throw new IllegalStateException("Sink is closed.");
    }
}
