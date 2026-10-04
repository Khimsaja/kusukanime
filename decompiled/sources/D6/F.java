package D6;

import f6.AbstractC0893G;
import java.io.IOException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class F extends c0 {

    /* renamed from: d, reason: collision with root package name */
    public final Method f1655d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1656e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0120n f1657f;

    public F(Method method, int i7, InterfaceC0120n interfaceC0120n) {
        this.f1655d = method;
        this.f1656e = i7;
        this.f1657f = interfaceC0120n;
    }

    @Override // D6.c0
    public final void a(S s7, Object obj) {
        Method method = this.f1655d;
        int i7 = this.f1656e;
        if (obj == null) {
            throw c0.o(method, i7, "Body parameter value must not be null.", new Object[0]);
        }
        try {
            s7.f1698k = (AbstractC0893G) this.f1657f.a(obj);
        } catch (IOException e7) {
            throw c0.p(method, e7, i7, "Unable to convert " + obj + " to RequestBody", new Object[0]);
        }
    }
}
