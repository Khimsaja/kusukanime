package n0;

import D.C0042b;
import j0.InterfaceC1298d;

/* renamed from: n0.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1556w {
    public C0042b a;

    public abstract void a(InterfaceC1298d interfaceC1298d);

    public e4.k b() {
        return this.a;
    }

    public final void c() {
        e4.k kVarB = b();
        if (kVarB != null) {
            kVarB.invoke(this);
        }
    }

    public void d(C0042b c0042b) {
        this.a = c0042b;
    }
}
