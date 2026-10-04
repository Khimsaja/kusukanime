package A3;

import O.C0502l;
import O.C0510p;
import O.Z;
import O3.C;
import com.kusukanime.data.HistoryRow;
import e4.InterfaceC0821a;
import f.AbstractC0847h;
import io.ktor.sse.ServerSentEventKt;
import java.util.List;
import v.AbstractC2130i;
import v.C2127f;
import v.C2141u;
import w.C2160a;
import z5.AbstractC2517v;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements e4.o {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f166k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Z f167l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e4.k f168m;

    public /* synthetic */ m(Z z7, e4.k kVar, int i7) {
        this.f166k = i7;
        this.f167l = z7;
        this.f168m = kVar;
    }

    @Override // e4.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f166k) {
            case 0:
                C0510p c0510p = (C0510p) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.l.f("$this$item", (C2160a) obj);
                if ((iIntValue & 17) == 16 && c0510p.y()) {
                    c0510p.M();
                } else {
                    v.Z zA = androidx.compose.foundation.layout.a.a(4, 2);
                    C2127f c2127fG = AbstractC2130i.g(8);
                    Z z7 = this.f167l;
                    boolean zF = c0510p.f(z7);
                    e4.k kVar = this.f168m;
                    boolean zF2 = zF | c0510p.f(kVar);
                    Object objH = c0510p.H();
                    if (zF2 || objH == C0502l.a) {
                        objH = new i(z7, kVar, 0);
                        c0510p.b0(objH);
                    }
                    AbstractC0847h.b(null, null, zA, c2127fG, null, null, false, (e4.k) objH, c0510p, 24960, 235);
                }
                return C.a;
            default:
                C0510p c0510p2 = (C0510p) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.l.f("$this$SettingsGroup", (C2141u) obj);
                if ((iIntValue2 & 17) == 16 && c0510p2.y()) {
                    c0510p2.M();
                } else {
                    int i7 = 0;
                    for (Object obj4 : P3.q.P0((List) this.f167l.getValue(), 5)) {
                        int i8 = i7 + 1;
                        if (i7 < 0) {
                            P3.r.X();
                            throw null;
                        }
                        HistoryRow historyRow = (HistoryRow) obj4;
                        if (i7 > 0) {
                            c0510p2.R(1794042271);
                            D3.t.a(0, c0510p2);
                        } else {
                            c0510p2.R(-230444719);
                        }
                        c0510p2.p(false);
                        String strR = AbstractC2517v.R(historyRow.getEpisode_slug(), "-", ServerSentEventKt.SPACE);
                        float position_ms = historyRow.getDuration_ms() > 0 ? historyRow.getPosition_ms() / historyRow.getDuration_ms() : 0.0f;
                        Object obj5 = this.f168m;
                        boolean zF3 = c0510p2.f(obj5) | c0510p2.f(historyRow);
                        Object objH2 = c0510p2.H();
                        if (zF3 || objH2 == C0502l.a) {
                            objH2 = new Z5.A(11, obj5, historyRow);
                            c0510p2.b0(objH2);
                        }
                        D3.f.b(strR, position_ms, (InterfaceC0821a) objH2, "Episode • ketuk buat lanjut", c0510p2, 24576);
                        i7 = i8;
                    }
                }
                return C.a;
        }
    }
}
