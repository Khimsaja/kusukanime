package w6;

import b1.AbstractC0703b;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class t implements H {

    /* renamed from: k, reason: collision with root package name */
    public final C f17180k;

    /* renamed from: l, reason: collision with root package name */
    public final Inflater f17181l;

    /* renamed from: m, reason: collision with root package name */
    public int f17182m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f17183n;

    public t(C c2, Inflater inflater) {
        this.f17180k = c2;
        this.f17181l = inflater;
    }

    @Override // w6.H
    public final long F(C2224i c2224i, long j7) throws DataFormatException, IOException {
        kotlin.jvm.internal.l.f("sink", c2224i);
        do {
            long jB = b(c2224i, j7);
            if (jB > 0) {
                return jB;
            }
            Inflater inflater = this.f17181l;
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
        } while (!this.f17180k.z());
        throw new EOFException("source exhausted prematurely");
    }

    public final long b(C2224i c2224i, long j7) throws DataFormatException, IOException {
        Inflater inflater = this.f17181l;
        kotlin.jvm.internal.l.f("sink", c2224i);
        if (j7 < 0) {
            throw new IllegalArgumentException(AbstractC0703b.h("byteCount < 0: ", j7).toString());
        }
        if (this.f17183n) {
            throw new IllegalStateException("closed");
        }
        if (j7 != 0) {
            try {
                D dD0 = c2224i.d0(1);
                int iMin = (int) Math.min(j7, 8192 - dD0.f17117c);
                boolean zNeedsInput = inflater.needsInput();
                C c2 = this.f17180k;
                if (zNeedsInput && !c2.z()) {
                    D d4 = c2.f17114l.f17155k;
                    kotlin.jvm.internal.l.c(d4);
                    int i7 = d4.f17117c;
                    int i8 = d4.f17116b;
                    int i9 = i7 - i8;
                    this.f17182m = i9;
                    inflater.setInput(d4.a, i8, i9);
                }
                int iInflate = inflater.inflate(dD0.a, dD0.f17117c, iMin);
                int i10 = this.f17182m;
                if (i10 != 0) {
                    int remaining = i10 - inflater.getRemaining();
                    this.f17182m -= remaining;
                    c2.n(remaining);
                }
                if (iInflate > 0) {
                    dD0.f17117c += iInflate;
                    long j8 = iInflate;
                    c2224i.f17156l += j8;
                    return j8;
                }
                if (dD0.f17116b == dD0.f17117c) {
                    c2224i.f17155k = dD0.a();
                    E.a(dD0);
                }
            } catch (DataFormatException e7) {
                throw new IOException(e7);
            }
        }
        return 0L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f17183n) {
            return;
        }
        this.f17181l.end();
        this.f17183n = true;
        this.f17180k.close();
    }

    @Override // w6.H
    public final J d() {
        return this.f17180k.f17113k.d();
    }
}
