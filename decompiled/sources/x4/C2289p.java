package x4;

/* renamed from: x4.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2289p implements e4.k {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f17448k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C2290q f17449l;

    public /* synthetic */ C2289p(C2290q c2290q, int i7) {
        this.f17448k = i7;
        this.f17449l = c2290q;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f17448k) {
            case 0:
                W4.e eVar = (W4.e) obj;
                C2290q c2290q = this.f17449l;
                if (eVar != null) {
                    return c2290q.j(eVar, c2290q.i().f(eVar, C4.c.f964p));
                }
                c2290q.getClass();
                C2290q.h(8);
                throw null;
            default:
                W4.e eVar2 = (W4.e) obj;
                C2290q c2290q2 = this.f17449l;
                if (eVar2 != null) {
                    return c2290q2.j(eVar2, c2290q2.i().a(eVar2, C4.c.f964p));
                }
                c2290q2.getClass();
                C2290q.h(4);
                throw null;
        }
    }
}
