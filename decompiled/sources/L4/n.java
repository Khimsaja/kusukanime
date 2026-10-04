package L4;

/* loaded from: classes.dex */
public final class n implements e4.k {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f6109k;

    /* renamed from: l, reason: collision with root package name */
    public final o f6110l;

    public /* synthetic */ n(o oVar, int i7) {
        this.f6109k = i7;
        this.f6110l = oVar;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        W4.e eVar = (W4.e) obj;
        switch (this.f6109k) {
            case 0:
                kotlin.jvm.internal.l.f("it", eVar);
                return this.f6110l.N(eVar);
            default:
                kotlin.jvm.internal.l.f("it", eVar);
                return this.f6110l.O(eVar);
        }
    }
}
