package i0;

/* renamed from: i0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1032p extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f11909l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1033q f11910m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1032p(C1033q c1033q, int i7) {
        super(1);
        this.f11909l = i7;
        this.f11910m = c1033q;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f11909l) {
            case 0:
                double dDoubleValue = ((Number) obj).doubleValue();
                return Double.valueOf(this.f11910m.f11922n.d(e3.c.i(dDoubleValue, r10.f11913e, r10.f11914f)));
            default:
                return Double.valueOf(e3.c.i(this.f11910m.f11919k.d(((Number) obj).doubleValue()), r10.f11913e, r10.f11914f));
        }
    }
}
