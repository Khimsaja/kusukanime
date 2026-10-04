package B3;

import L.AbstractC0399n;
import L.N;
import L.P;
import L.Q1;
import L.q2;
import O.C0502l;
import O.C0510p;
import O.T;
import O.Z;
import O3.C;
import com.kusukanime.data.OtaCheck;
import e4.InterfaceC0821a;
import v.C2141u;
import v.g0;
import w3.AbstractC2210a;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements e4.o {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f521k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Z f522l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Z f523m;

    public /* synthetic */ r(Z z7, Z z8, int i7) {
        this.f521k = i7;
        this.f522l = z7;
        this.f523m = z8;
    }

    @Override // e4.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f521k) {
            case 0:
                C0510p c0510p = (C0510p) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.l.f("$this$SettingsRow", (g0) obj);
                if ((iIntValue & 17) == 16 && c0510p.y()) {
                    c0510p.M();
                } else if (((Boolean) this.f522l.getValue()).booleanValue()) {
                    c0510p.R(506068727);
                    Q1.a(androidx.compose.foundation.layout.c.j(a0.n.a, 18), 0L, 2, 0L, 0, c0510p, 390, 26);
                    c0510p.p(false);
                } else {
                    OtaCheck otaCheck = (OtaCheck) this.f523m.getValue();
                    if (otaCheck == null || !otaCheck.getUpdate()) {
                        c0510p.R(506873487);
                        D3.t.b(0, c0510p);
                        c0510p.p(false);
                    } else {
                        c0510p.R(506290997);
                        q2.a(null, C.e.a(), ((N) c0510p.k(P.a)).f5247f, 0L, 0.0f, 0.0f, AbstractC0025a.f439e, c0510p, 12582912, 121);
                        c0510p.p(false);
                    }
                }
                break;
            case 1:
                C0510p c0510p2 = (C0510p) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.l.f("$this$DropdownMenu", (C2141u) obj);
                if ((iIntValue2 & 17) == 16 && c0510p2.y()) {
                    c0510p2.M();
                } else {
                    W.a aVar = r3.n.a;
                    Object objH = c0510p2.H();
                    T t7 = C0502l.a;
                    final Z z7 = this.f522l;
                    final Z z8 = this.f523m;
                    if (objH == t7) {
                        final int i7 = 0;
                        objH = new InterfaceC0821a() { // from class: r3.d
                            @Override // e4.InterfaceC0821a
                            public final Object invoke() {
                                switch (i7) {
                                    case 0:
                                        z7.setValue(Boolean.TRUE);
                                        z8.setValue(Boolean.FALSE);
                                        break;
                                    default:
                                        Z z9 = z7;
                                        Boolean bool = Boolean.FALSE;
                                        z9.setValue(bool);
                                        z8.setValue(bool);
                                        break;
                                }
                                return C.a;
                            }
                        };
                        c0510p2.b0(objH);
                    }
                    AbstractC0399n.b(aVar, (InterfaceC0821a) objH, null, false, null, null, c0510p2, 54);
                    W.a aVar2 = r3.n.f14922b;
                    Object objH2 = c0510p2.H();
                    if (objH2 == t7) {
                        final int i8 = 1;
                        objH2 = new InterfaceC0821a() { // from class: r3.d
                            @Override // e4.InterfaceC0821a
                            public final Object invoke() {
                                switch (i8) {
                                    case 0:
                                        z7.setValue(Boolean.TRUE);
                                        z8.setValue(Boolean.FALSE);
                                        break;
                                    default:
                                        Z z9 = z7;
                                        Boolean bool = Boolean.FALSE;
                                        z9.setValue(bool);
                                        z8.setValue(bool);
                                        break;
                                }
                                return C.a;
                            }
                        };
                        c0510p2.b0(objH2);
                    }
                    AbstractC0399n.b(aVar2, (InterfaceC0821a) objH2, null, false, null, null, c0510p2, 54);
                }
                break;
            default:
                C0510p c0510p3 = (C0510p) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.l.f("$this$SettingsRow", (g0) obj);
                if ((iIntValue3 & 17) == 16 && c0510p3.y()) {
                    c0510p3.M();
                } else if (((Boolean) this.f522l.getValue()).booleanValue()) {
                    c0510p3.R(717474269);
                    Q1.a(androidx.compose.foundation.layout.c.j(a0.n.a, 18), 0L, 2, 0L, 0, c0510p3, 390, 26);
                    c0510p3.p(false);
                } else {
                    OtaCheck otaCheck2 = (OtaCheck) this.f523m.getValue();
                    if (otaCheck2 == null || !otaCheck2.getUpdate()) {
                        c0510p3.R(718338301);
                        D3.t.b(0, c0510p3);
                        c0510p3.p(false);
                    } else {
                        c0510p3.R(717713279);
                        q2.a(null, C.e.a(), ((N) c0510p3.k(P.a)).a, 0L, 0.0f, 0.0f, AbstractC2210a.f16940l, c0510p3, 12582912, 121);
                        c0510p3.p(false);
                    }
                }
                break;
        }
        return O3.C.a;
    }
}
