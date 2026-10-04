package w6;

import b1.AbstractC0703b;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: w6.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2220e implements H {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f17136k = 1;

    /* renamed from: l, reason: collision with root package name */
    public final Object f17137l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f17138m;

    public C2220e(InputStream inputStream, J j7) {
        kotlin.jvm.internal.l.f("input", inputStream);
        this.f17137l = inputStream;
        this.f17138m = j7;
    }

    @Override // w6.H
    public final long F(C2224i c2224i, long j7) {
        switch (this.f17136k) {
            case 0:
                kotlin.jvm.internal.l.f("sink", c2224i);
                C2220e c2220e = (C2220e) this.f17138m;
                x6.f fVar = (x6.f) this.f17137l;
                fVar.i();
                try {
                    long jF = c2220e.F(c2224i, j7);
                    if (fVar.j()) {
                        throw fVar.l(null);
                    }
                    return jF;
                } catch (IOException e7) {
                    if (fVar.j()) {
                        throw fVar.l(e7);
                    }
                    throw e7;
                } finally {
                    fVar.j();
                }
            default:
                kotlin.jvm.internal.l.f("sink", c2224i);
                if (j7 == 0) {
                    return 0L;
                }
                if (j7 < 0) {
                    throw new IllegalArgumentException(AbstractC0703b.h("byteCount < 0: ", j7).toString());
                }
                try {
                    ((J) this.f17138m).f();
                    D dD0 = c2224i.d0(1);
                    int i7 = ((InputStream) this.f17137l).read(dD0.a, dD0.f17117c, (int) Math.min(j7, 8192 - dD0.f17117c));
                    if (i7 == -1) {
                        if (dD0.f17116b == dD0.f17117c) {
                            c2224i.f17155k = dD0.a();
                            E.a(dD0);
                        }
                        return -1L;
                    }
                    dD0.f17117c += i7;
                    long j8 = i7;
                    c2224i.f17156l += j8;
                    return j8;
                } catch (AssertionError e8) {
                    if (x6.j.a(e8)) {
                        throw new IOException(e8);
                    }
                    throw e8;
                }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f17136k) {
            case 0:
                C2220e c2220e = (C2220e) this.f17138m;
                x6.f fVar = (x6.f) this.f17137l;
                fVar.i();
                try {
                    c2220e.close();
                    if (fVar.j()) {
                        throw fVar.l(null);
                    }
                    return;
                } catch (IOException e7) {
                    if (!fVar.j()) {
                        throw e7;
                    }
                    throw fVar.l(e7);
                } finally {
                    fVar.j();
                }
            default:
                ((InputStream) this.f17137l).close();
                return;
        }
    }

    @Override // w6.H
    public final J d() {
        switch (this.f17136k) {
            case 0:
                return (x6.f) this.f17137l;
            default:
                return (J) this.f17138m;
        }
    }

    public final String toString() {
        switch (this.f17136k) {
            case 0:
                return "AsyncTimeout.source(" + ((C2220e) this.f17138m) + ')';
            default:
                return "source(" + ((InputStream) this.f17137l) + ')';
        }
    }

    public C2220e(x6.f fVar, C2220e c2220e) {
        this.f17137l = fVar;
        this.f17138m = c2220e;
    }
}
