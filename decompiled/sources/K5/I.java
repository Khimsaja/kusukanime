package K5;

/* loaded from: classes.dex */
public final class I implements W, InterfaceC0329h, L5.q {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ G f4751k;

    public I(G g4) {
        this.f4751k = g4;
    }

    @Override // L5.q
    public final InterfaceC0329h b(S3.h hVar, int i7, J5.c cVar) {
        return (((i7 < 0 || i7 >= 2) && i7 != -2) || cVar != J5.c.f4300l) ? N.k(this, hVar, i7, cVar) : this;
    }

    @Override // K5.InterfaceC0329h
    public final Object collect(InterfaceC0330i interfaceC0330i, S3.c cVar) throws Throwable {
        ((Y) this.f4751k).collect(interfaceC0330i, cVar);
        return T3.a.f9048k;
    }

    @Override // K5.W
    public final Object getValue() {
        return ((Y) this.f4751k).getValue();
    }
}
