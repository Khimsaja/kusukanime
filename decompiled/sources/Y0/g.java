package Y0;

import io.ktor.sse.ServerSentEventKt;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import n6.m;

/* loaded from: classes.dex */
public abstract class g implements Future {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f10057d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f10058e = Logger.getLogger(g.class.getName());

    /* renamed from: f, reason: collision with root package name */
    public static final m f10059f;

    /* renamed from: g, reason: collision with root package name */
    public static final Object f10060g;
    public volatile Object a;

    /* renamed from: b, reason: collision with root package name */
    public volatile c f10061b;

    /* renamed from: c, reason: collision with root package name */
    public volatile f f10062c;

    static {
        m eVar;
        try {
            eVar = new d(AtomicReferenceFieldUpdater.newUpdater(f.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(f.class, f.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g.class, f.class, "c"), AtomicReferenceFieldUpdater.newUpdater(g.class, c.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            eVar = new e();
        }
        f10059f = eVar;
        if (th != null) {
            f10058e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f10060g = new Object();
    }

    public static void b(g gVar) {
        f fVar;
        c cVar;
        do {
            fVar = gVar.f10062c;
        } while (!f10059f.p(gVar, fVar, f.f10055c));
        while (fVar != null) {
            Thread thread = fVar.a;
            if (thread != null) {
                fVar.a = null;
                LockSupport.unpark(thread);
            }
            fVar = fVar.f10056b;
        }
        do {
            cVar = gVar.f10061b;
        } while (!f10059f.n(gVar, cVar, c.f10049b));
        c cVar2 = null;
        while (cVar != null) {
            c cVar3 = cVar.a;
            cVar.a = cVar2;
            cVar2 = cVar;
            cVar = cVar3;
        }
        while (cVar2 != null) {
            cVar2 = cVar2.a;
            try {
                throw null;
            } catch (RuntimeException e7) {
                f10058e.log(Level.SEVERE, "RuntimeException while executing runnable " + ((Object) null) + " with executor null", (Throwable) e7);
            }
        }
    }

    public static Object c(Object obj) throws ExecutionException {
        if (obj instanceof a) {
            CancellationException cancellationException = ((a) obj).a;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof b) {
            ((b) obj).getClass();
            throw new ExecutionException((Throwable) null);
        }
        if (obj == f10060g) {
            return null;
        }
        return obj;
    }

    public static Object d(g gVar) {
        Object obj;
        boolean z7 = false;
        while (true) {
            try {
                obj = gVar.get();
                break;
            } catch (InterruptedException unused) {
                z7 = true;
            } catch (Throwable th) {
                if (z7) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z7) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public final void a(StringBuilder sb) {
        try {
            Object objD = d(this);
            sb.append("SUCCESS, result=[");
            sb.append(objD == this ? "this future" : String.valueOf(objD));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e7) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e7.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e8) {
            sb.append("FAILURE, cause=[");
            sb.append(e8.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z7) {
        Object obj = this.a;
        if (obj != null) {
            return false;
        }
        if (!f10059f.o(this, obj, f10057d ? new a(z7, new CancellationException("Future.cancel() was called.")) : z7 ? a.f10047b : a.f10048c)) {
            return false;
        }
        b(this);
        return true;
    }

    public final void e(f fVar) {
        fVar.a = null;
        while (true) {
            f fVar2 = this.f10062c;
            if (fVar2 == f.f10055c) {
                return;
            }
            f fVar3 = null;
            while (fVar2 != null) {
                f fVar4 = fVar2.f10056b;
                if (fVar2.a != null) {
                    fVar3 = fVar2;
                } else if (fVar3 != null) {
                    fVar3.f10056b = fVar4;
                    if (fVar3.a == null) {
                        break;
                    }
                } else if (!f10059f.p(this, fVar2, fVar4)) {
                    break;
                }
                fVar2 = fVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j7, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j7);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.a;
        if (obj != null) {
            return c(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            f fVar = this.f10062c;
            f fVar2 = f.f10055c;
            if (fVar != fVar2) {
                f fVar3 = new f();
                do {
                    m mVar = f10059f;
                    mVar.T(fVar3, fVar);
                    if (mVar.p(this, fVar, fVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                e(fVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.a;
                            if (obj2 != null) {
                                return c(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        e(fVar3);
                    } else {
                        fVar = this.f10062c;
                    }
                } while (fVar != fVar2);
            }
            return c(this.a);
        }
        while (nanos > 0) {
            Object obj3 = this.a;
            if (obj3 != null) {
                return c(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        StringBuilder sbK = A6.b.k("Waited ", j7, ServerSentEventKt.SPACE);
        sbK.append(timeUnit.toString().toLowerCase(locale));
        String string3 = sbK.toString();
        if (nanos + 1000 < 0) {
            String strH = A6.b.h(string3, " (plus ");
            long j8 = -nanos;
            long jConvert = timeUnit.convert(j8, TimeUnit.NANOSECONDS);
            long nanos2 = j8 - timeUnit.toNanos(jConvert);
            boolean z7 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strH2 = strH + jConvert + ServerSentEventKt.SPACE + lowerCase;
                if (z7) {
                    strH2 = A6.b.h(strH2, ",");
                }
                strH = A6.b.h(strH2, ServerSentEventKt.SPACE);
            }
            if (z7) {
                strH = strH + nanos2 + " nanoseconds ";
            }
            string3 = A6.b.h(strH, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(A6.b.h(string3, " but future completed as timeout expired"));
        }
        throw new TimeoutException(string3 + " for " + string);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.a != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.a instanceof a) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                if (this instanceof ScheduledFuture) {
                    str = "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
                } else {
                    str = null;
                }
            } catch (RuntimeException e7) {
                str = "Exception thrown from implementation: " + e7.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if (obj2 != null) {
                return c(obj2);
            }
            f fVar = this.f10062c;
            f fVar2 = f.f10055c;
            if (fVar != fVar2) {
                f fVar3 = new f();
                do {
                    m mVar = f10059f;
                    mVar.T(fVar3, fVar);
                    if (mVar.p(this, fVar, fVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                e(fVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return c(obj);
                    }
                    fVar = this.f10062c;
                } while (fVar != fVar2);
            }
            return c(this.a);
        }
        throw new InterruptedException();
    }
}
