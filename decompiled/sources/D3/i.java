package D3;

import O.C0486d;
import O.C0510p;
import O3.C;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f1452k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f1453l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f1454m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ a0.q f1455n;

    public /* synthetic */ i(String str, String str2, a0.q qVar, int i7, int i8) {
        this.f1452k = i8;
        this.f1453l = str;
        this.f1454m = str2;
        this.f1455n = qVar;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        int i7 = this.f1452k;
        C0510p c0510p = (C0510p) obj;
        ((Integer) obj2).getClass();
        switch (i7) {
            case 0:
                int iV = C0486d.V(385);
                f.a(this.f1453l, this.f1454m, this.f1455n, c0510p, iV);
                break;
            default:
                t.d(this.f1453l, this.f1454m, this.f1455n, c0510p, C0486d.V(391));
                break;
        }
        return C.a;
    }
}
