package H5;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes.dex */
public final class E extends V implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: s, reason: collision with root package name */
    public static final E f3807s;

    /* renamed from: t, reason: collision with root package name */
    public static final long f3808t;

    static {
        Long l7;
        E e7 = new E();
        f3807s = e7;
        e7.d0(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l7 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l7 = 1000L;
        }
        f3808t = timeUnit.toNanos(l7.longValue());
    }

    @Override // H5.W
    public final Thread c0() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(f3807s.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // H5.W
    public final void g0(long j7, T t7) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // H5.V, H5.W
    public final void h0() {
        debugStatus = 4;
        super.h0();
    }

    @Override // H5.V
    public final void i0(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.i0(runnable);
    }

    public final synchronized void n0() {
        int i7 = debugStatus;
        if (i7 == 2 || i7 == 3) {
            debugStatus = 3;
            V.f3824p.set(this, null);
            V.f3825q.set(this, null);
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zL0;
        w0.a.set(this);
        try {
            synchronized (this) {
                int i7 = debugStatus;
                if (i7 == 2 || i7 == 3) {
                    if (zL0) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j7 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jE0 = e0();
                    if (jE0 == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j7 == Long.MAX_VALUE) {
                            j7 = f3808t + jNanoTime;
                        }
                        long j8 = j7 - jNanoTime;
                        if (j8 <= 0) {
                            _thread = null;
                            n0();
                            if (l0()) {
                                return;
                            }
                            c0();
                            return;
                        }
                        if (jE0 > j8) {
                            jE0 = j8;
                        }
                    } else {
                        j7 = Long.MAX_VALUE;
                    }
                    if (jE0 > 0) {
                        int i8 = debugStatus;
                        if (i8 == 2 || i8 == 3) {
                            _thread = null;
                            n0();
                            if (l0()) {
                                return;
                            }
                            c0();
                            return;
                        }
                        LockSupport.parkNanos(this, jE0);
                    }
                }
            }
        } finally {
            _thread = null;
            n0();
            if (!l0()) {
                c0();
            }
        }
    }

    @Override // H5.AbstractC0281w
    public final String toString() {
        return "DefaultExecutor";
    }

    @Override // H5.V, H5.I
    public final N v(long j7, z0 z0Var, S3.h hVar) {
        long j8 = j7 > 0 ? j7 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j7 : 0L;
        if (j8 >= 4611686018427387903L) {
            return r0.f3878k;
        }
        long jNanoTime = System.nanoTime();
        S s7 = new S(j8 + jNanoTime, z0Var);
        m0(jNanoTime, s7);
        return s7;
    }
}
