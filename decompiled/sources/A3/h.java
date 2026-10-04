package A3;

import L.AbstractC0384j0;
import L.E0;
import L.H2;
import O.C0486d;
import O.C0502l;
import O.C0510p;
import O.InterfaceC0501k0;
import O.T;
import O.Z;
import android.view.View;
import android.view.Window;
import b1.AbstractC0703b;
import com.kusukanime.data.AzItem;
import com.kusukanime.data.SearchSuggestion;
import com.kusukanime.data.StreamItem;
import e4.InterfaceC0821a;
import h0.AbstractC0968M;
import h0.C0998u;
import io.ktor.util.GzipHeaderFlags;
import n0.C1538e;
import p3.AbstractC1790h;
import p3.C1789g;
import t3.AbstractC2048f;
import u3.AbstractC2077b;
import u3.C2084i;
import v.AbstractC2136o;
import w0.InterfaceC2173H;
import w3.AbstractC2210a;
import y0.C2361h;
import y0.C2362i;
import y0.C2363j;
import y0.InterfaceC2364k;
import y3.AbstractC2412a;
import y3.C;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f146k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f147l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f148m;

    public /* synthetic */ h(int i7, int i8, Object obj, Object obj2) {
        this.f146k = i8;
        this.f147l = obj;
        this.f148m = obj2;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        Window windowA;
        switch (this.f146k) {
            case 0:
                ((Integer) obj2).getClass();
                c.b((SearchSuggestion) this.f147l, (InterfaceC0821a) this.f148m, (C0510p) obj, C0486d.V(1));
                break;
            case 1:
                C0510p c0510p = (C0510p) obj;
                if ((((Integer) obj2).intValue() & 3) == 2 && c0510p.y()) {
                    c0510p.M();
                } else {
                    if (((String) ((Z) this.f148m).getValue()).length() > 0) {
                        c0510p.R(1324469302);
                        B b4 = (B) this.f147l;
                        boolean zH = c0510p.h(b4);
                        Object objH = c0510p.H();
                        if (zH || objH == C0502l.a) {
                            objH = new f(b4, 1);
                            c0510p.b0(objH);
                        }
                        E0.f((InterfaceC0821a) objH, null, false, null, c.f135c, c0510p, 196608, 30);
                    } else {
                        c0510p.R(1316693045);
                    }
                    c0510p.p(false);
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                D3.f.h((String) this.f147l, (a0.n) this.f148m, (C0510p) obj, C0486d.V(1));
                break;
            case 3:
                C0510p c0510p2 = (C0510p) obj;
                if ((((Integer) obj2).intValue() & 3) == 2 && c0510p2.y()) {
                    c0510p2.M();
                } else {
                    AbstractC0384j0.a((C1538e) this.f147l, (String) this.f148m, null, 0L, c0510p2, 0, 12);
                }
                break;
            case GzipHeaderFlags.EXTRA /* 4 */:
                ((Integer) obj2).getClass();
                AbstractC1790h.a((InterfaceC0821a) this.f148m, (C1789g) this.f147l, (C0510p) obj, C0486d.V(1));
                break;
            case 5:
                C0510p c0510p3 = (C0510p) obj;
                if ((((Integer) obj2).intValue() & 3) == 2 && c0510p3.y()) {
                    c0510p3.M();
                } else {
                    StreamItem streamItem = (StreamItem) this.f147l;
                    String url = streamItem.getUrl();
                    Z z7 = (Z) this.f148m;
                    boolean zF = c0510p3.f(z7);
                    Object objH2 = c0510p3.H();
                    if (zF || objH2 == C0502l.a) {
                        objH2 = new B3.i(19, z7);
                        c0510p3.b0(objH2);
                    }
                    C.b(url, (InterfaceC0821a) objH2, streamItem.getHeaders(), null, null, null, c0510p3, 0, 56);
                }
                break;
            case 6:
                ((Integer) obj2).getClass();
                AbstractC2048f.a((AzItem) this.f147l, (InterfaceC0821a) this.f148m, (C0510p) obj, C0486d.V(1));
                break;
            case 7:
                C0510p c0510p4 = (C0510p) obj;
                if ((((Integer) obj2).intValue() & 3) == 2 && c0510p4.y()) {
                    c0510p4.M();
                } else {
                    C2084i c2084i = (C2084i) this.f147l;
                    boolean zH2 = c0510p4.h(c2084i);
                    Object objH3 = c0510p4.H();
                    if (zH2 || objH3 == C0502l.a) {
                        objH3 = new Z5.A(8, c2084i, (Z) this.f148m);
                        c0510p4.b0(objH3);
                    }
                    E0.b((InterfaceC0821a) objH3, null, false, null, null, null, null, null, AbstractC2077b.a, c0510p4, 805306368, 510);
                }
                break;
            case 8:
                C0510p c0510p5 = (C0510p) obj;
                if ((((Integer) obj2).intValue() & 3) == 2 && c0510p5.y()) {
                    c0510p5.M();
                } else {
                    String str = (String) ((Z) this.f148m).getValue();
                    if (str == null) {
                        str = ((String) this.f147l).length() + "/20 · huruf, angka, underscore";
                    }
                    H2.b(str, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0510p5, 0, 0, 131070);
                }
                break;
            case 9:
                C0510p c0510p6 = (C0510p) obj;
                if ((((Integer) obj2).intValue() & 3) == 2 && c0510p6.y()) {
                    c0510p6.M();
                } else {
                    w3.y yVar = (w3.y) this.f147l;
                    boolean zH3 = c0510p6.h(yVar);
                    Object objH4 = c0510p6.H();
                    if (zH3 || objH4 == C0502l.a) {
                        objH4 = new Z5.A(10, yVar, (Z) this.f148m);
                        c0510p6.b0(objH4);
                    }
                    E0.b((InterfaceC0821a) objH4, null, false, null, null, null, null, null, AbstractC2210a.f16948t, c0510p6, 805306368, 510);
                }
                break;
            case 10:
                C0510p c0510p7 = (C0510p) obj;
                if ((((Integer) obj2).intValue() & 3) == 2 && c0510p7.y()) {
                    c0510p7.M();
                } else {
                    View view = (View) this.f147l;
                    boolean zF2 = c0510p7.f(view);
                    Object objH5 = c0510p7.H();
                    T t7 = C0502l.a;
                    if (zF2 || objH5 == t7) {
                        View view2 = view;
                        while (true) {
                            if (view2 == null) {
                                X0.r rVarC = AbstractC2412a.c(view.getRootView());
                                if (rVarC != null) {
                                    windowA = rVarC.a();
                                } else {
                                    objH5 = null;
                                }
                            } else {
                                X0.r rVar = view2 instanceof X0.r ? (X0.r) view2 : null;
                                if (rVar != null) {
                                    windowA = rVar.a();
                                } else {
                                    Object parent = view2.getParent();
                                    view2 = parent instanceof View ? (View) parent : null;
                                }
                            }
                        }
                        objH5 = windowA;
                        c0510p7.b0(objH5);
                    }
                    Window window = (Window) objH5;
                    boolean zH4 = c0510p7.h(window);
                    Object objH6 = c0510p7.H();
                    if (zH4 || objH6 == t7) {
                        objH6 = new d(26, window);
                        c0510p7.b0(objH6);
                    }
                    C0486d.c(window, (e4.k) objH6, c0510p7);
                    boolean zH5 = c0510p7.h(window);
                    Object objH7 = c0510p7.H();
                    if (zH5 || objH7 == t7) {
                        objH7 = new y3.d(window, null);
                        c0510p7.b0(objH7);
                    }
                    C0486d.e(c0510p7, (e4.n) objH7, window);
                    a0.q qVarB = androidx.compose.foundation.a.b(androidx.compose.foundation.layout.c.f10591c, C0998u.f11829b, AbstractC0968M.a);
                    InterfaceC2173H interfaceC2173HE = AbstractC2136o.e(a0.b.f10381k, false);
                    int i7 = c0510p7.f7128P;
                    InterfaceC0501k0 interfaceC0501k0M = c0510p7.m();
                    a0.q qVarC = a0.a.c(c0510p7, qVarB);
                    InterfaceC2364k.f17877j.getClass();
                    C2362i c2362i = C2363j.f17871b;
                    c0510p7.V();
                    if (c0510p7.f7127O) {
                        c0510p7.l(c2362i);
                    } else {
                        c0510p7.e0();
                    }
                    C0486d.R(c0510p7, C2363j.f17875f, interfaceC2173HE);
                    C0486d.R(c0510p7, C2363j.f17874e, interfaceC0501k0M);
                    C2361h c2361h = C2363j.f17876g;
                    if (c0510p7.f7127O || !kotlin.jvm.internal.l.a(c0510p7.H(), Integer.valueOf(i7))) {
                        AbstractC0703b.u(i7, c0510p7, i7, c2361h);
                    }
                    C0486d.R(c0510p7, C2363j.f17873d, qVarC);
                    ((W.a) this.f148m).invoke(c0510p7, 0);
                    c0510p7.p(true);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC2412a.a((InterfaceC0821a) this.f148m, (W.a) this.f147l, (C0510p) obj, C0486d.V(49));
                break;
        }
        return O3.C.a;
    }

    public /* synthetic */ h(int i7, Object obj, Object obj2) {
        this.f146k = i7;
        this.f147l = obj;
        this.f148m = obj2;
    }

    public /* synthetic */ h(InterfaceC0821a interfaceC0821a, Object obj, int i7, int i8) {
        this.f146k = i8;
        this.f148m = interfaceC0821a;
        this.f147l = obj;
    }
}
