package w3;

import L.N;
import L.P;
import O.AbstractC0505m0;
import O.C0502l;
import O.C0510p;
import O.Z;
import O3.C;
import P3.F;
import android.content.Context;
import e4.InterfaceC0821a;
import l4.AbstractC1420H;
import n0.C1538e;
import v.C2141u;
import w.C2160a;

/* loaded from: classes.dex */
public final /* synthetic */ class q implements e4.o {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f17044k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Context f17045l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Z f17046m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Z f17047n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Z f17048o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Z f17049p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Z f17050q;

    public /* synthetic */ q(Context context, Z z7, Z z8, Z z9, Z z10, Z z11, int i7) {
        this.f17044k = i7;
        this.f17045l = context;
        this.f17046m = z7;
        this.f17047n = z8;
        this.f17048o = z9;
        this.f17049p = z10;
        this.f17050q = z11;
    }

    @Override // e4.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str;
        switch (this.f17044k) {
            case 0:
                C0510p c0510p = (C0510p) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.l.f("$this$item", (C2160a) obj);
                if ((iIntValue & 17) == 16 && c0510p.y()) {
                    c0510p.M();
                } else {
                    D3.t.e("Lainnya", null, null, W.f.b(828469538, new q(this.f17045l, this.f17046m, this.f17047n, this.f17048o, this.f17049p, this.f17050q, 1), c0510p), c0510p, 3078, 6);
                }
                break;
            default:
                C0510p c0510p2 = (C0510p) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.l.f("$this$SettingsGroup", (C2141u) obj);
                if ((iIntValue2 & 17) == 16 && c0510p2.y()) {
                    c0510p2.M();
                } else {
                    C1538e c1538e = D3.g.f1445f;
                    Z z7 = this.f17046m;
                    if (((Number) z7.getValue()).intValue() > 0) {
                        str = ((Number) z7.getValue()).intValue() + " catatan";
                    } else {
                        str = "Belum ada catatan";
                    }
                    String str2 = str;
                    Context context = this.f17045l;
                    boolean zH = c0510p2.h(context);
                    Object objH = c0510p2.H();
                    Object obj4 = C0502l.a;
                    if (zH || objH == obj4) {
                        objH = new B3.o(context, this.f17047n, this.f17048o, 2);
                        c0510p2.b0(objH);
                    }
                    D3.t.f(c1538e, "Log crash", str2, (InterfaceC0821a) objH, AbstractC2210a.f16942n, 0L, 0L, false, c0510p2, 24624, 224);
                    D3.t.a(0, c0510p2);
                    D3.t.f(F.x(), "Tentang", "App pribadi — sumber anisail.com", null, null, 0L, 0L, false, c0510p2, 3504, 240);
                    if (((Boolean) this.f17049p.getValue()).booleanValue()) {
                        c0510p2.R(2054834865);
                        D3.t.a(0, c0510p2);
                        C1538e c1538eC = AbstractC1420H.C();
                        Object objH2 = c0510p2.H();
                        if (objH2 == obj4) {
                            objH2 = new m(6, this.f17050q);
                            c0510p2.b0(objH2);
                        }
                        InterfaceC0821a interfaceC0821a = (InterfaceC0821a) objH2;
                        AbstractC0505m0 abstractC0505m0 = P.a;
                        D3.t.f(c1538eC, "Keluar akun", "Bookmark & riwayat tetap aman di cloud", interfaceC0821a, null, ((N) c0510p2.k(abstractC0505m0)).f5264w, ((N) c0510p2.k(abstractC0505m0)).f5264w, false, c0510p2, 3504, 144);
                    } else {
                        c0510p2.R(2037005184);
                    }
                    c0510p2.p(false);
                }
                break;
        }
        return C.a;
    }
}
