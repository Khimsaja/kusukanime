package x1;

import H5.A;
import H5.C0263e0;
import H5.InterfaceC0265f0;
import S3.h;
import kotlin.jvm.internal.l;

/* renamed from: x1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2249a implements AutoCloseable, A {

    /* renamed from: k, reason: collision with root package name */
    public final h f17302k;

    public C2249a(h hVar) {
        l.f("coroutineContext", hVar);
        this.f17302k = hVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        InterfaceC0265f0 interfaceC0265f0 = (InterfaceC0265f0) this.f17302k.get(C0263e0.f3843k);
        if (interfaceC0265f0 != null) {
            interfaceC0265f0.e(null);
        }
    }

    @Override // H5.A
    public final h getCoroutineContext() {
        return this.f17302k;
    }
}
