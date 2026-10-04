package w3;

import O.C0502l;
import O.C0510p;
import O.Z;
import O3.C;
import android.content.Context;
import n0.C1538e;
import v.C2141u;
import w.C2160a;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements e4.o {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f17033k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Context f17034l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Z f17035m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Z f17036n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Z f17037o;

    public /* synthetic */ o(Context context, Z z7, Z z8, Z z9, int i7) {
        this.f17033k = i7;
        this.f17034l = context;
        this.f17035m = z7;
        this.f17036n = z8;
        this.f17037o = z9;
    }

    @Override // e4.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f17033k) {
            case 0:
                C0510p c0510p = (C0510p) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.l.f("$this$item", (C2160a) obj);
                if ((iIntValue & 17) == 16 && c0510p.y()) {
                    c0510p.M();
                } else {
                    D3.t.e("Pengaturan", null, null, W.f.b(52221984, new o(this.f17034l, this.f17035m, this.f17036n, this.f17037o, 1), c0510p), c0510p, 3078, 6);
                }
                break;
            default:
                C0510p c0510p2 = (C0510p) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.l.f("$this$SettingsGroup", (C2141u) obj);
                if ((iIntValue2 & 17) == 16 && c0510p2.y()) {
                    c0510p2.M();
                } else {
                    C1538e c1538e = D3.g.f1443d;
                    Z z7 = this.f17035m;
                    boolean zBooleanValue = ((Boolean) z7.getValue()).booleanValue();
                    Context context = this.f17034l;
                    boolean zH = c0510p2.h(context);
                    Object objH = c0510p2.H();
                    Object obj4 = C0502l.a;
                    if (zH || objH == obj4) {
                        objH = new B3.p(context, z7, 5);
                        c0510p2.b0(objH);
                    }
                    D3.t.g(c1538e, "Mode gelap", "Ikut tema sistem kalau dimatikan", zBooleanValue, (e4.k) objH, false, c0510p2, 432);
                    D3.t.a(0, c0510p2);
                    C1538e c1538e2 = D3.g.f1441b;
                    Z z8 = this.f17036n;
                    boolean zBooleanValue2 = ((Boolean) z8.getValue()).booleanValue();
                    boolean zH2 = c0510p2.h(context);
                    Object objH2 = c0510p2.H();
                    if (zH2 || objH2 == obj4) {
                        objH2 = new B3.p(context, z8, 6);
                        c0510p2.b0(objH2);
                    }
                    D3.t.g(c1538e2, "Autoplay episode berikut", "Otomatis lanjut setelah selesai", zBooleanValue2, (e4.k) objH2, false, c0510p2, 432);
                    D3.t.a(0, c0510p2);
                    C1538e c1538e3 = D3.g.f1446g;
                    Z z9 = this.f17037o;
                    boolean zBooleanValue3 = ((Boolean) z9.getValue()).booleanValue();
                    boolean zH3 = c0510p2.h(context);
                    Object objH3 = c0510p2.H();
                    if (zH3 || objH3 == obj4) {
                        objH3 = new B3.p(context, z9, 7);
                        c0510p2.b0(objH3);
                    }
                    D3.t.g(c1538e3, "Notifikasi update", "Kabari kalau versi baru tersedia", zBooleanValue3, (e4.k) objH3, false, c0510p2, 432);
                }
                break;
        }
        return C.a;
    }
}
