package w3;

import O.C0510p;
import O.Z;
import O3.C;
import e4.InterfaceC0821a;
import java.util.List;
import n0.C1538e;
import v.C2141u;
import w.C2160a;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements e4.o {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f17027k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0821a f17028l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0821a f17029m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0821a f17030n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Z f17031o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Z f17032p;

    public /* synthetic */ n(InterfaceC0821a interfaceC0821a, InterfaceC0821a interfaceC0821a2, InterfaceC0821a interfaceC0821a3, Z z7, Z z8, int i7) {
        this.f17027k = i7;
        this.f17028l = interfaceC0821a;
        this.f17029m = interfaceC0821a2;
        this.f17030n = interfaceC0821a3;
        this.f17031o = z7;
        this.f17032p = z8;
    }

    @Override // e4.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str;
        switch (this.f17027k) {
            case 0:
                C0510p c0510p = (C0510p) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.l.f("$this$item", (C2160a) obj);
                if ((iIntValue & 17) == 16 && c0510p.y()) {
                    c0510p.M();
                } else {
                    D3.t.e("Menu", null, null, W.f.b(1811581855, new n(this.f17028l, this.f17029m, this.f17030n, this.f17031o, this.f17032p, 1), c0510p), c0510p, 3078, 6);
                }
                break;
            default:
                C0510p c0510p2 = (C0510p) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.l.f("$this$SettingsGroup", (C2141u) obj);
                if ((iIntValue2 & 17) == 16 && c0510p2.y()) {
                    c0510p2.M();
                } else {
                    C1538e c1538eX = P3.r.x();
                    if (((Boolean) this.f17031o.getValue()).booleanValue()) {
                        str = ((List) this.f17032p.getValue()).size() + " tontonan terakhir";
                    } else {
                        str = "Masuk dulu";
                    }
                    D3.t.f(c1538eX, "Riwayat", str, this.f17028l, AbstractC2210a.f16937i, 0L, 0L, false, c0510p2, 24624, 224);
                    D3.t.a(0, c0510p2);
                    D3.t.f(n6.m.E(), "Bookmark saya", "Anime yang kamu simpan", this.f17029m, AbstractC2210a.f16938j, 0L, 0L, false, c0510p2, 25008, 224);
                    D3.t.a(0, c0510p2);
                    D3.t.f(n6.m.P(), "Pengaturan lanjutan", "Resolusi, intro/outro, overlay player", this.f17030n, AbstractC2210a.f16939k, 0L, 0L, false, c0510p2, 25008, 224);
                }
                break;
        }
        return C.a;
    }
}
