package O3;

import e4.InterfaceC0821a;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class q implements i, Serializable {

    /* renamed from: k, reason: collision with root package name */
    public InterfaceC0821a f7535k;

    /* renamed from: l, reason: collision with root package name */
    public volatile Object f7536l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f7537m;

    public q(InterfaceC0821a interfaceC0821a) {
        kotlin.jvm.internal.l.f("initializer", interfaceC0821a);
        this.f7535k = interfaceC0821a;
        this.f7536l = z.a;
        this.f7537m = this;
    }

    @Override // O3.i
    public final boolean a() {
        return this.f7536l != z.a;
    }

    @Override // O3.i
    public final Object getValue() {
        Object objInvoke;
        Object obj = this.f7536l;
        z zVar = z.a;
        if (obj != zVar) {
            return obj;
        }
        synchronized (this.f7537m) {
            objInvoke = this.f7536l;
            if (objInvoke == zVar) {
                InterfaceC0821a interfaceC0821a = this.f7535k;
                kotlin.jvm.internal.l.c(interfaceC0821a);
                objInvoke = interfaceC0821a.invoke();
                this.f7536l = objInvoke;
                this.f7535k = null;
            }
        }
        return objInvoke;
    }

    public final String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
