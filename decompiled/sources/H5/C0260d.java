package H5;

/* renamed from: H5.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0260d implements InterfaceC0268i {
    public final C0258c[] a;

    public C0260d(C0258c[] c0258cArr) {
        this.a = c0258cArr;
    }

    @Override // H5.InterfaceC0268i
    public final void a(Throwable th) {
        b();
    }

    public final void b() {
        for (C0258c c0258c : this.a) {
            N n7 = c0258c.f3836p;
            if (n7 == null) {
                kotlin.jvm.internal.l.l("handle");
                throw null;
            }
            n7.dispose();
        }
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.a + ']';
    }
}
