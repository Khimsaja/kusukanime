package O1;

import B1.InterfaceC0021h;

/* loaded from: classes.dex */
public final /* synthetic */ class E implements InterfaceC0021h, Q1.n {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f7260k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f7261l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f7262m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f7263n;

    public /* synthetic */ E(Object obj, Object obj2, Object obj3, int i7) {
        this.f7260k = i7;
        this.f7261l = obj;
        this.f7262m = obj2;
        this.f7263n = obj3;
    }

    @Override // Q1.n
    public j3.X b(int i7, y1.Q q6, int[] iArr) {
        j3.D dR = j3.G.r();
        int i8 = 0;
        while (i8 < q6.a) {
            int i9 = i7;
            y1.Q q7 = q6;
            dR.a(new Q1.m(i9, q7, i8, (Q1.j) this.f7261l, iArr[i8], (String) this.f7262m, (String) this.f7263n));
            i8++;
            i7 = i9;
            q6 = q7;
        }
        return dR.f();
    }

    @Override // B1.InterfaceC0021h
    public void c(Object obj) {
        H h7 = (H) obj;
        switch (this.f7260k) {
            case 0:
                K1.e eVar = (K1.e) this.f7261l;
                h7.z(eVar.a, eVar.f4459b, (C0544s) this.f7262m, (C0549x) this.f7263n);
                break;
            default:
                K1.e eVar2 = (K1.e) this.f7261l;
                h7.x(eVar2.a, eVar2.f4459b, (C0544s) this.f7262m, (C0549x) this.f7263n);
                break;
        }
    }
}
