package r4;

import e4.InterfaceC0821a;
import java.util.ServiceLoader;
import m5.C1523l;

/* renamed from: r4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1872a implements InterfaceC0821a {

    /* renamed from: l, reason: collision with root package name */
    public static final C1872a f14927l = new C1872a(0);

    /* renamed from: m, reason: collision with root package name */
    public static final C1872a f14928m = new C1872a(1);

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f14929k;

    public /* synthetic */ C1872a(int i7) {
        this.f14929k = i7;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        switch (this.f14929k) {
            case 0:
                C1873b c1873b = C1873b.a;
                ServiceLoader serviceLoaderLoad = ServiceLoader.load(InterfaceC1874c.class, InterfaceC1874c.class.getClassLoader());
                kotlin.jvm.internal.l.c(serviceLoaderLoad);
                InterfaceC1874c interfaceC1874c = (InterfaceC1874c) P3.q.s0(serviceLoaderLoad);
                if (interfaceC1874c != null) {
                    return interfaceC1874c;
                }
                throw new IllegalStateException("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
            default:
                C1876e c1876e = new C1876e(new C1523l("DefaultBuiltIns"));
                c1876e.c();
                return c1876e;
        }
    }
}
