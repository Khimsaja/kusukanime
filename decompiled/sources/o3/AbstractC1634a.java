package o3;

import D.C0042b;
import G2.C0174k;
import G2.E;
import G2.O;
import G2.y;
import H2.q;
import L.Y1;
import O.AbstractC0505m0;
import O.C0486d;
import O.C0502l;
import O.C0509o0;
import O.C0510p;
import O.Z;
import X.n;
import android.app.Activity;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import e4.InterfaceC0821a;
import java.util.Arrays;
import y3.AbstractC2413b;

/* renamed from: o3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1634a {
    public static final W.a a = new W.a(false, 462146934, new io.ktor.http.cio.b(5));

    /* renamed from: b, reason: collision with root package name */
    public static final W.a f13597b = new W.a(false, -1262861007, new io.ktor.http.cio.b(6));

    /* renamed from: c, reason: collision with root package name */
    public static final W.a f13598c = new W.a(false, 1467299744, new io.ktor.http.cio.b(7));

    /* renamed from: d, reason: collision with root package name */
    public static volatile boolean f13599d;

    /* renamed from: e, reason: collision with root package name */
    public static volatile String f13600e;

    public static final void a(int i7, C0510p c0510p) {
        y yVar;
        int i8 = 8;
        int i9 = 0;
        c0510p.T(1443891593);
        if (i7 == 0 && c0510p.y()) {
            c0510p.M();
        } else {
            AbstractC0505m0 abstractC0505m0 = AndroidCompositionLocals_androidKt.f10669b;
            Object obj = (Context) c0510p.k(abstractC0505m0);
            Object[] objArrCopyOf = Arrays.copyOf(new O[0], 0);
            q qVar = q.f3634l;
            C0042b c0042b = new C0042b(9, obj);
            L2.e eVar = n.a;
            L2.e eVar2 = new L2.e(12, qVar, c0042b);
            boolean zH = c0510p.h(obj);
            Object objH = c0510p.H();
            Object obj2 = C0502l.a;
            if (zH || objH == obj2) {
                objH = new B.e(i8, obj);
                c0510p.b0(objH);
            }
            E e7 = (E) z1.c.F(objArrCopyOf, eVar2, (InterfaceC0821a) objH, c0510p, 0, 4);
            C0174k c0174k = (C0174k) C0486d.u(e7.f2632D, null, null, c0510p, 48, 2).getValue();
            String str = (c0174k == null || (yVar = c0174k.f2703l) == null) ? null : yVar.f2763q;
            Z zV = C0486d.v(AbstractC2413b.f18247b, c0510p);
            Object objK = c0510p.k(abstractC0505m0);
            Activity activity = objK instanceof Activity ? (Activity) objK : null;
            Boolean bool = (Boolean) zV.getValue();
            bool.getClass();
            boolean zH2 = c0510p.h(activity) | c0510p.f(zV);
            Object objH2 = c0510p.H();
            if (zH2 || objH2 == obj2) {
                objH2 = new C1638e(activity, zV, i9);
                c0510p.b0(objH2);
            }
            C0486d.c(bool, (e4.k) objH2, c0510p);
            Y1.a(null, null, W.f.b(1608608078, new A3.l(str, zV, e7, 5), c0510p), null, null, 0, 0L, 0L, null, W.f.b(926495768, new C1643j(e7, str), c0510p), c0510p, 805306752);
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new io.ktor.http.cio.b(i7, i8);
        }
    }
}
