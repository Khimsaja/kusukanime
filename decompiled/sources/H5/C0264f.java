package H5;

import java.util.concurrent.locks.LockSupport;

/* renamed from: H5.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0264f extends AbstractC0254a {

    /* renamed from: n, reason: collision with root package name */
    public final Thread f3844n;

    /* renamed from: o, reason: collision with root package name */
    public final W f3845o;

    public C0264f(S3.h hVar, Thread thread, W w7) {
        super(hVar, true, true);
        this.f3844n = thread;
        this.f3845o = w7;
    }

    @Override // H5.n0
    public final void d(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.f3844n;
        if (kotlin.jvm.internal.l.a(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
