package w6;

import b1.AbstractC0703b;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class J {

    /* renamed from: d, reason: collision with root package name */
    public static final I f17126d = new I();
    public boolean a;

    /* renamed from: b, reason: collision with root package name */
    public long f17127b;

    /* renamed from: c, reason: collision with root package name */
    public long f17128c;

    public J a() {
        this.a = false;
        return this;
    }

    public J b() {
        this.f17128c = 0L;
        return this;
    }

    public long c() {
        if (this.a) {
            return this.f17127b;
        }
        throw new IllegalStateException("No deadline");
    }

    public J d(long j7) {
        this.a = true;
        this.f17127b = j7;
        return this;
    }

    public boolean e() {
        return this.a;
    }

    public void f() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.a && this.f17127b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public J g(long j7, TimeUnit timeUnit) {
        kotlin.jvm.internal.l.f("unit", timeUnit);
        if (j7 < 0) {
            throw new IllegalArgumentException(AbstractC0703b.h("timeout < 0: ", j7).toString());
        }
        this.f17128c = timeUnit.toNanos(j7);
        return this;
    }

    public long h() {
        return this.f17128c;
    }
}
