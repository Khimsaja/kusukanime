package F4;

import P3.q;
import e4.InterfaceC0821a;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class i implements InterfaceC0821a {

    /* renamed from: k, reason: collision with root package name */
    public static final i f2501k = new i();

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        j jVar = j.a;
        ServiceLoader serviceLoaderLoad = ServiceLoader.load(k.class, k.class.getClassLoader());
        l.e("load(...)", serviceLoaderLoad);
        List listS0 = q.S0(serviceLoaderLoad);
        if (listS0.isEmpty()) {
            throw new IllegalStateException("No MetadataExtensions instances found in the classpath. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
        }
        return listS0;
    }
}
