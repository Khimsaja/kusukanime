package z0;

import java.util.Comparator;

/* loaded from: classes.dex */
public final class B implements Comparator {

    /* renamed from: l, reason: collision with root package name */
    public static final B f18561l = new B(0);

    /* renamed from: m, reason: collision with root package name */
    public static final B f18562m = new B(1);

    /* renamed from: n, reason: collision with root package name */
    public static final B f18563n = new B(2);

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f18564k;

    public /* synthetic */ B(int i7) {
        this.f18564k = i7;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f18564k) {
            case 0:
                g0.d dVarF = ((F0.n) obj).f();
                g0.d dVarF2 = ((F0.n) obj2).f();
                int iCompare = Float.compare(dVarF.a, dVarF2.a);
                if (iCompare != 0) {
                    return iCompare;
                }
                int iCompare2 = Float.compare(dVarF.f11659b, dVarF2.f11659b);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                int iCompare3 = Float.compare(dVarF.f11661d, dVarF2.f11661d);
                return iCompare3 != 0 ? iCompare3 : Float.compare(dVarF.f11660c, dVarF2.f11660c);
            case 1:
                g0.d dVarF3 = ((F0.n) obj).f();
                g0.d dVarF4 = ((F0.n) obj2).f();
                int iCompare4 = Float.compare(dVarF4.f11660c, dVarF3.f11660c);
                if (iCompare4 != 0) {
                    return iCompare4;
                }
                int iCompare5 = Float.compare(dVarF3.f11659b, dVarF4.f11659b);
                if (iCompare5 != 0) {
                    return iCompare5;
                }
                int iCompare6 = Float.compare(dVarF3.f11661d, dVarF4.f11661d);
                return iCompare6 != 0 ? iCompare6 : Float.compare(dVarF4.a, dVarF3.a);
            default:
                O3.l lVar = (O3.l) obj;
                O3.l lVar2 = (O3.l) obj2;
                int iCompare7 = Float.compare(((g0.d) lVar.f7528k).f11659b, ((g0.d) lVar2.f7528k).f11659b);
                return iCompare7 != 0 ? iCompare7 : Float.compare(((g0.d) lVar.f7528k).f11661d, ((g0.d) lVar2.f7528k).f11661d);
        }
    }
}
