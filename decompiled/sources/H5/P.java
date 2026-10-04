package H5;

/* loaded from: classes.dex */
public final class P implements InterfaceC0255a0 {

    /* renamed from: k, reason: collision with root package name */
    public final boolean f3817k;

    public P(boolean z7) {
        this.f3817k = z7;
    }

    @Override // H5.InterfaceC0255a0
    public final boolean b() {
        return this.f3817k;
    }

    @Override // H5.InterfaceC0255a0
    public final p0 c() {
        return null;
    }

    public final String toString() {
        return A6.b.j(new StringBuilder("Empty{"), this.f3817k ? "Active" : "New", '}');
    }
}
