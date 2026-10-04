package w6;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class r extends J {

    /* renamed from: e, reason: collision with root package name */
    public J f17174e;

    public r(J j7) {
        kotlin.jvm.internal.l.f("delegate", j7);
        this.f17174e = j7;
    }

    @Override // w6.J
    public final J a() {
        return this.f17174e.a();
    }

    @Override // w6.J
    public final J b() {
        return this.f17174e.b();
    }

    @Override // w6.J
    public final long c() {
        return this.f17174e.c();
    }

    @Override // w6.J
    public final J d(long j7) {
        return this.f17174e.d(j7);
    }

    @Override // w6.J
    public final boolean e() {
        return this.f17174e.e();
    }

    @Override // w6.J
    public final void f() throws InterruptedIOException {
        this.f17174e.f();
    }

    @Override // w6.J
    public final J g(long j7, TimeUnit timeUnit) {
        kotlin.jvm.internal.l.f("unit", timeUnit);
        return this.f17174e.g(j7, timeUnit);
    }

    @Override // w6.J
    public final long h() {
        return this.f17174e.h();
    }
}
