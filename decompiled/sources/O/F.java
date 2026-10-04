package O;

/* loaded from: classes.dex */
public final class F implements w0 {

    /* renamed from: k, reason: collision with root package name */
    public final e4.k f6994k;

    /* renamed from: l, reason: collision with root package name */
    public G f6995l;

    public F(e4.k kVar) {
        this.f6994k = kVar;
    }

    @Override // O.w0
    public final void a() {
        this.f6995l = (G) this.f6994k.invoke(C0486d.f7064h);
    }

    @Override // O.w0
    public final void e() {
        G g4 = this.f6995l;
        if (g4 != null) {
            g4.dispose();
        }
        this.f6995l = null;
    }

    @Override // O.w0
    public final void b() {
    }
}
