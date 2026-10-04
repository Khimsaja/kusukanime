package H;

import e4.InterfaceC0821a;

/* renamed from: H.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0200q extends kotlin.jvm.internal.m implements InterfaceC0821a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ B1.s f2999l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f3000m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f3001n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ N f3002o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f3003p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0200q(B1.s sVar, int i7, int i8, N n7, O3.i iVar) {
        super(0);
        this.f2999l = sVar;
        this.f3000m = i7;
        this.f3001n = i8;
        this.f3002o = n7;
        this.f3003p = iVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [O3.i, java.lang.Object] */
    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        int iIntValue = ((Number) this.f3003p.getValue()).intValue();
        N n7 = this.f3002o;
        boolean z7 = n7.f() == 1;
        B1.s sVar = this.f2999l;
        H0.F f5 = (H0.F) sVar.f361e;
        int i7 = this.f3000m;
        long jK = f5.k(i7);
        int i8 = H0.H.f3092c;
        int iH = (int) (jK >> 32);
        int iE = f5.e(iH);
        int i9 = f5.f3083b.f3132f;
        if (iE != iIntValue) {
            iH = iIntValue >= i9 ? f5.h(i9 - 1) : f5.h(iIntValue);
        }
        int iD = (int) (jK & 4294967295L);
        if (f5.e(iD) != iIntValue) {
            iD = iIntValue >= i9 ? f5.d(i9 - 1, false) : f5.d(iIntValue, false);
        }
        int i10 = this.f3001n;
        if (iH == i10) {
            return sVar.b(iD);
        }
        if (iD == i10) {
            return sVar.b(iH);
        }
        if (!(n7.f2900b ^ z7) ? i7 >= iH : i7 > iD) {
            iH = iD;
        }
        return sVar.b(iH);
    }
}
