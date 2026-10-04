package R1;

import B1.AbstractC0015b;
import O1.O;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import io.ktor.client.utils.CIOKt;
import java.io.IOException;

/* loaded from: classes.dex */
public final class k extends Handler implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final int f8065k;

    /* renamed from: l, reason: collision with root package name */
    public final O f8066l;

    /* renamed from: m, reason: collision with root package name */
    public Object f8067m;

    /* renamed from: n, reason: collision with root package name */
    public IOException f8068n;

    /* renamed from: o, reason: collision with root package name */
    public int f8069o;

    /* renamed from: p, reason: collision with root package name */
    public Thread f8070p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f8071q;

    /* renamed from: r, reason: collision with root package name */
    public volatile boolean f8072r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ m f8073s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar, Looper looper, O o7, j jVar, int i7, long j7) {
        super(looper);
        this.f8073s = mVar;
        this.f8066l = o7;
        this.f8067m = jVar;
        this.f8065k = i7;
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [R1.j, java.lang.Object] */
    public final void a(boolean z7) {
        this.f8072r = z7;
        this.f8068n = null;
        if (hasMessages(1)) {
            this.f8071q = true;
            removeMessages(1);
            if (!z7) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.f8071q = true;
                    this.f8066l.f7299g = true;
                    Thread thread = this.f8070p;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z7) {
            this.f8073s.f8076b = null;
            SystemClock.elapsedRealtime();
            ?? r52 = this.f8067m;
            r52.getClass();
            r52.c(this.f8066l, true);
            this.f8067m = null;
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [R1.j, java.lang.Object] */
    public final void b() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        ?? r2 = this.f8067m;
        r2.getClass();
        r2.p(this.f8066l, jElapsedRealtime, this.f8069o);
        this.f8068n = null;
        m mVar = this.f8073s;
        S1.a aVar = mVar.a;
        k kVar = mVar.f8076b;
        kVar.getClass();
        aVar.execute(kVar);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [R1.j, java.lang.Object] */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.f8072r) {
            return;
        }
        int i7 = message.what;
        if (i7 == 1) {
            b();
            return;
        }
        if (i7 == 4) {
            throw ((Error) message.obj);
        }
        this.f8073s.f8076b = null;
        SystemClock.elapsedRealtime();
        ?? r02 = this.f8067m;
        r02.getClass();
        if (this.f8071q) {
            r02.c(this.f8066l, false);
            return;
        }
        int i8 = message.what;
        if (i8 == 2) {
            try {
                r02.l(this.f8066l);
                return;
            } catch (RuntimeException e7) {
                AbstractC0015b.n("LoadTask", "Unexpected exception handling load completed", e7);
                this.f8073s.f8077c = new l(e7);
                return;
            }
        }
        if (i8 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.f8068n = iOException;
        int i9 = this.f8069o + 1;
        this.f8069o = i9;
        A5.h hVarH = r02.h(this.f8066l, iOException, i9);
        int i10 = hVarH.f256k;
        if (i10 == 3) {
            this.f8073s.f8077c = this.f8068n;
            return;
        }
        if (i10 != 2) {
            if (i10 == 1) {
                this.f8069o = 1;
            }
            long jMin = hVarH.f257l;
            if (jMin == -9223372036854775807L) {
                jMin = Math.min((this.f8069o - 1) * CIOKt.DEFAULT_HTTP_POOL_SIZE, 5000);
            }
            m mVar = this.f8073s;
            AbstractC0015b.h(mVar.f8076b == null);
            mVar.f8076b = this;
            if (jMin > 0) {
                sendEmptyMessageDelayed(1, jMin);
            } else {
                b();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z7;
        try {
            synchronized (this) {
                z7 = this.f8071q;
                this.f8070p = Thread.currentThread();
            }
            if (!z7) {
                Trace.beginSection("load:".concat(this.f8066l.getClass().getSimpleName()));
                try {
                    this.f8066l.b();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.f8070p = null;
                Thread.interrupted();
            }
            if (this.f8072r) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e7) {
            if (this.f8072r) {
                return;
            }
            obtainMessage(3, e7).sendToTarget();
        } catch (Exception e8) {
            if (this.f8072r) {
                return;
            }
            AbstractC0015b.n("LoadTask", "Unexpected exception loading stream", e8);
            obtainMessage(3, new l(e8)).sendToTarget();
        } catch (OutOfMemoryError e9) {
            if (this.f8072r) {
                return;
            }
            AbstractC0015b.n("LoadTask", "OutOfMemory error loading stream", e9);
            obtainMessage(3, new l(e9)).sendToTarget();
        } catch (Error e10) {
            if (!this.f8072r) {
                AbstractC0015b.n("LoadTask", "Unexpected error loading stream", e10);
                obtainMessage(4, e10).sendToTarget();
            }
            throw e10;
        }
    }
}
