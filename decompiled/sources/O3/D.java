package O3;

import e4.InterfaceC0821a;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class D implements i, Serializable {

    /* renamed from: k, reason: collision with root package name */
    public InterfaceC0821a f7511k;

    /* renamed from: l, reason: collision with root package name */
    public Object f7512l;

    @Override // O3.i
    public final boolean a() {
        return this.f7512l != z.a;
    }

    @Override // O3.i
    public final Object getValue() {
        if (this.f7512l == z.a) {
            InterfaceC0821a interfaceC0821a = this.f7511k;
            kotlin.jvm.internal.l.c(interfaceC0821a);
            this.f7512l = interfaceC0821a.invoke();
            this.f7511k = null;
        }
        return this.f7512l;
    }

    public final String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
