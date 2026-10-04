package j6;

import H1.C0231l;
import java.io.IOException;
import java.net.ProtocolException;
import w6.C2224i;
import w6.H;
import w6.q;

/* loaded from: classes.dex */
public final class d extends q {

    /* renamed from: l, reason: collision with root package name */
    public final long f12490l;

    /* renamed from: m, reason: collision with root package name */
    public long f12491m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f12492n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f12493o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f12494p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0231l f12495q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(C0231l c0231l, H h7, long j7) {
        super(h7);
        kotlin.jvm.internal.l.f("delegate", h7);
        this.f12495q = c0231l;
        this.f12490l = j7;
        this.f12492n = true;
        if (j7 == 0) {
            b(null);
        }
    }

    @Override // w6.q, w6.H
    public final long F(C2224i c2224i, long j7) throws IOException {
        kotlin.jvm.internal.l.f("sink", c2224i);
        if (this.f12494p) {
            throw new IllegalStateException("closed");
        }
        try {
            long jF = this.f17173k.F(c2224i, j7);
            if (this.f12492n) {
                this.f12492n = false;
                C0231l c0231l = this.f12495q;
                c0231l.getClass();
                kotlin.jvm.internal.l.f("call", (i) c0231l.f3531m);
            }
            if (jF == -1) {
                b(null);
                return -1L;
            }
            long j8 = this.f12491m + jF;
            long j9 = this.f12490l;
            if (j9 == -1 || j8 <= j9) {
                this.f12491m = j8;
                if (j8 == j9) {
                    b(null);
                }
                return jF;
            }
            throw new ProtocolException("expected " + j9 + " bytes but received " + j8);
        } catch (IOException e7) {
            throw b(e7);
        }
    }

    public final IOException b(IOException iOException) {
        if (this.f12493o) {
            return iOException;
        }
        this.f12493o = true;
        C0231l c0231l = this.f12495q;
        if (iOException == null && this.f12492n) {
            this.f12492n = false;
            c0231l.getClass();
            kotlin.jvm.internal.l.f("call", (i) c0231l.f3531m);
        }
        return c0231l.c(true, false, iOException);
    }

    @Override // w6.q, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f12494p) {
            return;
        }
        this.f12494p = true;
        try {
            super.close();
            b(null);
        } catch (IOException e7) {
            throw b(e7);
        }
    }
}
