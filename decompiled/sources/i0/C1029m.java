package i0;

/* renamed from: i0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1029m implements InterfaceC1025i {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f11903k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1033q f11904l;

    public /* synthetic */ C1029m(C1033q c1033q, int i7) {
        this.f11903k = i7;
        this.f11904l = c1033q;
    }

    @Override // i0.InterfaceC1025i
    public final double d(double d4) {
        switch (this.f11903k) {
            case 0:
                return e3.c.i(this.f11904l.f11919k.d(d4), r10.f11913e, r10.f11914f);
            default:
                return this.f11904l.f11922n.d(e3.c.i(d4, r0.f11913e, r0.f11914f));
        }
    }
}
