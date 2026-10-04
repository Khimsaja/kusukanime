package H0;

/* loaded from: classes.dex */
public abstract class t {
    public static final long a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f3153b = 0;

    static {
        T0.n[] nVarArr = T0.m.f8847b;
        a = T0.m.f8848c;
    }

    public static final s a(s sVar, int i7, int i8, long j7, S0.o oVar, u uVar, S0.g gVar, int i9, int i10, S0.p pVar) {
        long j8;
        S0.o oVar2 = oVar;
        u uVar2 = uVar;
        S0.g gVar2 = gVar;
        int i11 = i9;
        int i12 = i10;
        if (i7 == Integer.MIN_VALUE || i7 == sVar.a) {
            if (n6.d.N(j7)) {
                j8 = j7;
            } else {
                j8 = j7;
                if (T0.m.a(j8, sVar.f3146c)) {
                }
            }
            if ((oVar2 == null || oVar2.equals(sVar.f3147d)) && ((i8 == Integer.MIN_VALUE || i8 == sVar.f3145b) && ((uVar2 == null || uVar2.equals(sVar.f3148e)) && ((gVar2 == null || gVar2.equals(sVar.f3149f)) && ((i11 == 0 || i11 == sVar.f3150g) && ((i12 == Integer.MIN_VALUE || i12 == sVar.f3151h) && (pVar == null || pVar.equals(sVar.f3152i)))))))) {
                return sVar;
            }
        } else {
            j8 = j7;
        }
        long j9 = n6.d.N(j8) ? sVar.f3146c : j8;
        if (oVar2 == null) {
            oVar2 = sVar.f3147d;
        }
        if (i7 == Integer.MIN_VALUE) {
            i7 = sVar.a;
        }
        int i13 = i8 == Integer.MIN_VALUE ? sVar.f3145b : i8;
        u uVar3 = sVar.f3148e;
        if (uVar3 != null && uVar2 == null) {
            uVar2 = uVar3;
        }
        if (gVar2 == null) {
            gVar2 = sVar.f3149f;
        }
        if (i11 == 0) {
            i11 = sVar.f3150g;
        }
        if (i12 == Integer.MIN_VALUE) {
            i12 = sVar.f3151h;
        }
        return new s(i7, i13, j9, oVar2, uVar2, gVar2, i11, i12, pVar == null ? sVar.f3152i : pVar);
    }
}
