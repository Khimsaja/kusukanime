package H2;

/* loaded from: classes.dex */
public final class j extends G2.z {

    /* renamed from: f, reason: collision with root package name */
    public final i f3615f;

    /* renamed from: g, reason: collision with root package name */
    public final W.a f3616g;

    public j(i iVar, String str, W.a aVar) {
        super(iVar, str);
        this.f3615f = iVar;
        this.f3616g = aVar;
    }

    @Override // G2.z
    public final G2.y a() {
        return (h) super.a();
    }

    @Override // G2.z
    public final G2.y b() {
        return new h(this.f3615f, this.f3616g);
    }
}
