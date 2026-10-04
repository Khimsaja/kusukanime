package j6;

import H1.C0231l;
import java.io.Closeable;
import w6.A;
import w6.C;

/* loaded from: classes.dex */
public final class k implements Closeable {

    /* renamed from: k, reason: collision with root package name */
    public final C f12525k;

    /* renamed from: l, reason: collision with root package name */
    public final A f12526l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0231l f12527m;

    public k(C c2, A a, C0231l c0231l) {
        this.f12527m = c0231l;
        kotlin.jvm.internal.l.f("source", c2);
        kotlin.jvm.internal.l.f("sink", a);
        this.f12525k = c2;
        this.f12526l = a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f12527m.c(true, true, null);
    }
}
