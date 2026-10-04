package D6;

import f6.AbstractC0897K;
import f6.C0925w;
import java.io.IOException;
import w6.AbstractC2217b;
import w6.InterfaceC2226k;

/* loaded from: classes.dex */
public final class B extends AbstractC0897K {

    /* renamed from: k, reason: collision with root package name */
    public final AbstractC0897K f1639k;

    /* renamed from: l, reason: collision with root package name */
    public final w6.C f1640l;

    /* renamed from: m, reason: collision with root package name */
    public IOException f1641m;

    public B(AbstractC0897K abstractC0897K) {
        this.f1639k = abstractC0897K;
        this.f1640l = AbstractC2217b.c(new A(this, abstractC0897K.g()));
    }

    @Override // f6.AbstractC0897K
    public final long b() {
        return this.f1639k.b();
    }

    @Override // f6.AbstractC0897K, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f1639k.close();
    }

    @Override // f6.AbstractC0897K
    public final C0925w e() {
        return this.f1639k.e();
    }

    @Override // f6.AbstractC0897K
    public final InterfaceC2226k g() {
        return this.f1640l;
    }
}
