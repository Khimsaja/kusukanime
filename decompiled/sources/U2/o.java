package U2;

import g3.AbstractC0946e;
import w6.InterfaceC2226k;
import w6.v;

/* loaded from: classes.dex */
public final class o extends m {

    /* renamed from: k, reason: collision with root package name */
    public final q0.c f9223k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f9224l;

    /* renamed from: m, reason: collision with root package name */
    public final InterfaceC2226k f9225m;

    public o(InterfaceC2226k interfaceC2226k, q0.c cVar) {
        this.f9223k = cVar;
        this.f9225m = interfaceC2226k;
    }

    @Override // U2.m
    public final q0.c b() {
        return this.f9223k;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f9224l = true;
        InterfaceC2226k interfaceC2226k = this.f9225m;
        if (interfaceC2226k != null) {
            AbstractC0946e.a(interfaceC2226k);
        }
    }

    @Override // U2.m
    public final synchronized InterfaceC2226k e() {
        InterfaceC2226k interfaceC2226k;
        try {
            if (this.f9224l) {
                throw new IllegalStateException("closed");
            }
            interfaceC2226k = this.f9225m;
            if (interfaceC2226k == null) {
                v vVar = w6.o.f17171k;
                kotlin.jvm.internal.l.c(null);
                vVar.x(null);
                throw null;
            }
        } catch (Throwable th) {
            throw th;
        }
        return interfaceC2226k;
    }
}
