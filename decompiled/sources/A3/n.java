package A3;

import L.H2;
import L.M2;
import L.N;
import L.N2;
import L.P;
import L.Q1;
import O.C0510p;
import O.Z;
import O3.C;
import b1.AbstractC0703b;
import java.util.List;
import v.AbstractC2123b;
import v.g0;
import w.C2160a;
import z5.AbstractC2510o;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements e4.o {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f169k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f170l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Z f171m;

    public /* synthetic */ n(String str, Z z7, int i7) {
        this.f169k = i7;
        this.f170l = str;
        this.f171m = z7;
    }

    @Override // e4.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f169k) {
            case 0:
                C0510p c0510p = (C0510p) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.l.f("$this$item", (C2160a) obj);
                if ((iIntValue & 17) == 16 && c0510p.y()) {
                    c0510p.M();
                } else {
                    int size = ((List) this.f171m.getValue()).size();
                    StringBuilder sb = new StringBuilder();
                    sb.append(size);
                    sb.append(" hasil untuk \"");
                    float f5 = 4;
                    H2.b(AbstractC0703b.m(sb, this.f170l, "\""), androidx.compose.foundation.layout.a.i(a0.n.a, f5, f5), ((N) c0510p.k(P.a)).f5260s, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((M2) c0510p.k(N2.a)).f5223o, c0510p, 48, 0, 65528);
                }
                break;
            default:
                C0510p c0510p2 = (C0510p) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.l.f("$this$Button", (g0) obj);
                if ((iIntValue2 & 17) == 16 && c0510p2.y()) {
                    c0510p2.M();
                } else if (((Boolean) this.f171m.getValue()).booleanValue()) {
                    c0510p2.R(360032019);
                    a0.n nVar = a0.n.a;
                    Q1.a(androidx.compose.foundation.layout.c.j(nVar, 18), ((N) c0510p2.k(P.a)).f5243b, 2, 0L, 0, c0510p2, 390, 24);
                    AbstractC2123b.a(c0510p2, androidx.compose.foundation.layout.c.j(nVar, 8));
                    H2.b("Menyimpan username…", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0510p2, 6, 0, 131070);
                    c0510p2.p(false);
                } else {
                    c0510p2.R(360380862);
                    H2.b(AbstractC2510o.g0(this.f170l) ? "Pasang Username" : "Simpan Username", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0510p2, 0, 0, 131070);
                    c0510p2.p(false);
                }
                break;
        }
        return C.a;
    }
}
