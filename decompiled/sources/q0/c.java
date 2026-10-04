package q0;

import A4.p;
import B1.C0023j;
import D.C0064m;
import D.K;
import D4.S;
import G2.C0174k;
import H.M;
import H2.C0245a;
import M0.C0468a;
import M0.C0469b;
import M0.v;
import N0.w;
import O.C0486d;
import O.C0507n0;
import O.C0509o0;
import O.C0510p;
import O3.r;
import P3.AbstractC0566g;
import Y4.h;
import Z5.AbstractC0632e0;
import Z5.C0629d;
import Z5.H;
import Z5.W;
import Z5.l0;
import Z5.m0;
import Z5.u0;
import a6.C0673c;
import a6.EnumC0671a;
import a6.j;
import a6.q;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.Build;
import android.view.KeyEvent;
import android.view.inputmethod.ExtractedText;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.InterfaceC0684k;
import androidx.lifecycle.O;
import e4.InterfaceC0821a;
import e4.k;
import e4.n;
import e5.AbstractC0832b;
import e6.AbstractC0838b;
import e6.AbstractC0839c;
import e6.C0837a;
import f1.AbstractC0870c;
import f1.AbstractC0871d;
import f6.AbstractC0905c;
import h0.C0975U;
import h0.C0998u;
import h0.InterfaceC0973S;
import io.ktor.http.ContentDisposition;
import io.ktor.http.LinkHeader;
import io.ktor.util.GzipHeaderFlags;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k4.f;
import k4.g;
import kotlin.jvm.internal.B;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.y;
import kotlin.jvm.internal.z;
import kotlinx.serialization.KSerializer;
import l4.AbstractC1420H;
import l4.InterfaceC1425d;
import l4.InterfaceC1444w;
import n0.AbstractC1530A;
import n0.C1537d;
import n0.C1538e;
import n0.C1541h;
import n0.C1544k;
import n0.C1545l;
import n0.C1550q;
import n6.m;
import r1.C1864c;
import r1.C1868g;
import t1.AbstractC2034a;
import u4.InterfaceC2088D;
import u4.InterfaceC2101g;
import v.c0;
import v1.C2147a;
import w0.X;
import w1.AbstractC2208a;
import x4.AbstractC2257C;
import y1.E;
import z5.AbstractC2510o;
import z5.AbstractC2517v;

/* loaded from: classes.dex */
public abstract class c {
    public static C1538e a;

    /* renamed from: b, reason: collision with root package name */
    public static C1538e f14671b;

    /* renamed from: c, reason: collision with root package name */
    public static C1538e f14672c;

    /* renamed from: d, reason: collision with root package name */
    public static C1538e f14673d;

    /* renamed from: e, reason: collision with root package name */
    public static C1538e f14674e;

    /* renamed from: f, reason: collision with root package name */
    public static C1538e f14675f;

    public static final C1538e A() {
        C1538e c1538e = f14671b;
        if (c1538e != null) {
            return c1538e;
        }
        C1537d c1537d = new C1537d("Filled.ChevronRight", false);
        int i7 = AbstractC1530A.a;
        C0975U c0975u = new C0975U(C0998u.f11829b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new C1545l(10.0f, 6.0f));
        arrayList.add(new C1544k(8.59f, 7.41f));
        arrayList.add(new C1544k(13.17f, 12.0f));
        arrayList.add(new C1550q(-4.58f, 4.59f));
        arrayList.add(new C1544k(10.0f, 18.0f));
        arrayList.add(new C1550q(6.0f, -6.0f));
        arrayList.add(C1541h.f13175b);
        C1537d.a(c1537d, arrayList, c0975u);
        C1538e c1538eB = c1537d.b();
        f14671b = c1538eB;
        return c1538eB;
    }

    public static final long B(KeyEvent keyEvent) {
        return AbstractC0905c.a(keyEvent.getKeyCode());
    }

    public static final C1538e C() {
        C1538e c1538e = f14673d;
        if (c1538e != null) {
            return c1538e;
        }
        C1537d c1537d = new C1537d("Filled.Notifications", false);
        int i7 = AbstractC1530A.a;
        C0975U c0975u = new C0975U(C0998u.f11829b);
        S s7 = new S(7, false);
        s7.u(12.0f, 22.0f);
        s7.o(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        s7.r(-4.0f);
        s7.o(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        s7.m();
        s7.u(18.0f, 16.0f);
        s7.A(-5.0f);
        s7.o(0.0f, -3.07f, -1.64f, -5.64f, -4.5f, -6.32f);
        s7.s(13.5f, 4.0f);
        s7.o(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        s7.w(-1.5f, 0.67f, -1.5f, 1.5f);
        s7.A(0.68f);
        s7.n(7.63f, 5.36f, 6.0f, 7.92f, 6.0f, 11.0f);
        s7.A(5.0f);
        s7.t(-2.0f, 2.0f);
        s7.A(1.0f);
        s7.r(16.0f);
        s7.A(-1.0f);
        s7.t(-2.0f, -2.0f);
        s7.m();
        C1537d.a(c1537d, s7.f1530k, c0975u);
        C1538e c1538eB = c1537d.b();
        f14673d = c1538eB;
        return c1538eB;
    }

    public static final int D(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }

    public static final boolean E(long j7, long j8) {
        int iJ = T0.a.j(j7);
        int iH = T0.a.h(j7);
        int i7 = (int) (j8 >> 32);
        if (iJ > i7 || i7 > iH) {
            return false;
        }
        int i8 = (int) (j8 & 4294967295L);
        return T0.a.i(j7) <= i8 && i8 <= T0.a.g(j7);
    }

    public static final L2.e F(n nVar, k kVar) {
        D.S s7 = new D.S(nVar);
        B.e(1, kVar);
        L2.e eVar = X.n.a;
        return new L2.e(12, s7, kVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x012e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object G(n5.AbstractC1586x r19, P4.q r20, e4.o r21) {
        /*
            Method dump skipped, instructions count: 1030
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.c.G(n5.x, P4.q, e4.o):java.lang.Object");
    }

    public static final long H(int i7, int i8, long j7) {
        int iJ = T0.a.j(j7) + i7;
        if (iJ < 0) {
            iJ = 0;
        }
        int iH = T0.a.h(j7);
        if (iH != Integer.MAX_VALUE && (iH = iH + i7) < 0) {
            iH = 0;
        }
        int i9 = T0.a.i(j7) + i8;
        if (i9 < 0) {
            i9 = 0;
        }
        int iG = T0.a.g(j7);
        return a(iJ, iH, i9, (iG == Integer.MAX_VALUE || (iG = iG + i8) >= 0) ? iG : 0);
    }

    public static /* synthetic */ long I(int i7, int i8, int i9, long j7) {
        if ((i9 & 1) != 0) {
            i7 = 0;
        }
        if ((i9 & 2) != 0) {
            i8 = 0;
        }
        return H(i7, i8, j7);
    }

    public static final KSerializer J(InterfaceC1425d interfaceC1425d, ArrayList arrayList, InterfaceC0821a interfaceC0821a) {
        KSerializer c0629d;
        KSerializer m0Var;
        l.f("<this>", interfaceC1425d);
        z zVar = y.a;
        if (interfaceC1425d.equals(zVar.b(Collection.class)) || interfaceC1425d.equals(zVar.b(List.class)) || interfaceC1425d.equals(zVar.b(List.class)) || interfaceC1425d.equals(zVar.b(ArrayList.class))) {
            c0629d = new C0629d((KSerializer) arrayList.get(0), 0);
        } else if (interfaceC1425d.equals(zVar.b(HashSet.class))) {
            c0629d = new C0629d((KSerializer) arrayList.get(0), 1);
        } else if (interfaceC1425d.equals(zVar.b(Set.class)) || interfaceC1425d.equals(zVar.b(Set.class)) || interfaceC1425d.equals(zVar.b(LinkedHashSet.class))) {
            c0629d = new C0629d((KSerializer) arrayList.get(0), 2);
        } else if (interfaceC1425d.equals(zVar.b(HashMap.class))) {
            c0629d = new H((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1), 0);
        } else if (interfaceC1425d.equals(zVar.b(Map.class)) || interfaceC1425d.equals(zVar.b(Map.class)) || interfaceC1425d.equals(zVar.b(LinkedHashMap.class))) {
            c0629d = new H((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1), 1);
        } else {
            if (interfaceC1425d.equals(zVar.b(Map.Entry.class))) {
                KSerializer kSerializer = (KSerializer) arrayList.get(0);
                KSerializer kSerializer2 = (KSerializer) arrayList.get(1);
                l.f("keySerializer", kSerializer);
                l.f("valueSerializer", kSerializer2);
                m0Var = new W(kSerializer, kSerializer2, 0);
            } else if (interfaceC1425d.equals(zVar.b(O3.l.class))) {
                KSerializer kSerializer3 = (KSerializer) arrayList.get(0);
                KSerializer kSerializer4 = (KSerializer) arrayList.get(1);
                l.f("keySerializer", kSerializer3);
                l.f("valueSerializer", kSerializer4);
                m0Var = new W(kSerializer3, kSerializer4, 1);
            } else if (interfaceC1425d.equals(zVar.b(r.class))) {
                KSerializer kSerializer5 = (KSerializer) arrayList.get(0);
                KSerializer kSerializer6 = (KSerializer) arrayList.get(1);
                KSerializer kSerializer7 = (KSerializer) arrayList.get(2);
                l.f("aSerializer", kSerializer5);
                l.f("bSerializer", kSerializer6);
                l.f("cSerializer", kSerializer7);
                c0629d = new u0(kSerializer5, kSerializer6, kSerializer7);
            } else if (m.F(interfaceC1425d).isArray()) {
                Object objInvoke = interfaceC0821a.invoke();
                l.d("null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>", objInvoke);
                KSerializer kSerializer8 = (KSerializer) arrayList.get(0);
                l.f("elementSerializer", kSerializer8);
                m0Var = new m0((InterfaceC1425d) objInvoke, kSerializer8);
            } else {
                c0629d = null;
            }
            c0629d = m0Var;
        }
        if (c0629d != null) {
            return c0629d;
        }
        KSerializer[] kSerializerArr = (KSerializer[]) arrayList.toArray(new KSerializer[0]);
        return AbstractC0632e0.d(interfaceC1425d, (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
    }

    public static W4.e K(W4.e eVar, String str, String str2, int i7) {
        char cCharAt;
        char cCharAt2;
        Object next;
        boolean z7 = (i7 & 4) != 0;
        if ((i7 & 8) != 0) {
            str2 = null;
        }
        if (!eVar.f9625l) {
            String strC = eVar.c();
            if (AbstractC2517v.T(strC, str, false) && strC.length() != str.length() && ('a' > (cCharAt = strC.charAt(str.length())) || cCharAt >= '{')) {
                if (str2 != null) {
                    return W4.e.e(str2.concat(AbstractC2510o.o0(strC, str)));
                }
                if (!z7) {
                    return eVar;
                }
                String strO0 = AbstractC2510o.o0(strC, str);
                if (strO0.length() != 0 && AbstractC0870c.Y(0, strO0)) {
                    if (strO0.length() != 1 && AbstractC0870c.Y(1, strO0)) {
                        f it = new g(0, strO0.length() - 1, 1).iterator();
                        while (true) {
                            if (!it.f12677m) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            if (!AbstractC0870c.Y(((Number) next).intValue(), strO0)) {
                                break;
                            }
                        }
                        Integer num = (Integer) next;
                        if (num != null) {
                            int iIntValue = num.intValue() - 1;
                            String strSubstring = strO0.substring(0, iIntValue);
                            l.e("substring(...)", strSubstring);
                            String strH0 = AbstractC0870c.h0(strSubstring);
                            String strSubstring2 = strO0.substring(iIntValue);
                            l.e("substring(...)", strSubstring2);
                            strO0 = strH0.concat(strSubstring2);
                        } else {
                            strO0 = AbstractC0870c.h0(strO0);
                        }
                    } else if (strO0.length() != 0 && 'A' <= (cCharAt2 = strO0.charAt(0)) && cCharAt2 < '[') {
                        char lowerCase = Character.toLowerCase(cCharAt2);
                        String strSubstring3 = strO0.substring(1);
                        l.e("substring(...)", strSubstring3);
                        strO0 = lowerCase + strSubstring3;
                    }
                }
                if (W4.e.f(strO0)) {
                    return W4.e.e(strO0);
                }
            }
        }
        return null;
    }

    public static final void L(C4.b bVar, C4.a aVar, InterfaceC2088D interfaceC2088D, W4.e eVar) {
        l.f("<this>", bVar);
        l.f("from", aVar);
        l.f("scopeOwner", interfaceC2088D);
        l.f(ContentDisposition.Parameters.Name, eVar);
        String str = ((AbstractC2257C) interfaceC2088D).f17354o.a.a;
        l.e("asString(...)", eVar.b());
        l.f("packageFqName", str);
    }

    public static final void M(Object[] objArr, int i7, int i8) {
        l.f("<this>", objArr);
        while (i7 < i8) {
            objArr[i7] = null;
            i7++;
        }
    }

    public static final KSerializer N(AbstractC0838b abstractC0838b, InterfaceC1444w interfaceC1444w) {
        l.f("<this>", abstractC0838b);
        l.f(LinkHeader.Parameters.Type, interfaceC1444w);
        KSerializer kSerializerL = z1.c.L(abstractC0838b, interfaceC1444w, true);
        if (kSerializerL != null) {
            return kSerializerL;
        }
        InterfaceC1425d interfaceC1425dH = AbstractC0632e0.h(interfaceC1444w);
        l.f("<this>", interfaceC1425dH);
        AbstractC0632e0.i(interfaceC1425dH);
        throw null;
    }

    public static final KSerializer O(InterfaceC1425d interfaceC1425d) {
        l.f("<this>", interfaceC1425d);
        KSerializer kSerializerP = P(interfaceC1425d);
        if (kSerializerP != null) {
            return kSerializerP;
        }
        AbstractC0632e0.i(interfaceC1425d);
        throw null;
    }

    public static final KSerializer P(InterfaceC1425d interfaceC1425d) {
        l.f("<this>", interfaceC1425d);
        KSerializer kSerializerD = AbstractC0632e0.d(interfaceC1425d, new KSerializer[0]);
        return kSerializerD == null ? (KSerializer) l0.a.get(interfaceC1425d) : kSerializerD;
    }

    public static final ArrayList Q(AbstractC0838b abstractC0838b, List list, boolean z7) {
        l.f("<this>", abstractC0838b);
        l.f("typeArguments", list);
        if (z7) {
            ArrayList arrayList = new ArrayList(P3.r.p(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(N(abstractC0838b, (InterfaceC1444w) it.next()));
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(P3.r.p(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            InterfaceC1444w interfaceC1444w = (InterfaceC1444w) it2.next();
            l.f(LinkHeader.Parameters.Type, interfaceC1444w);
            KSerializer kSerializerL = z1.c.L(abstractC0838b, interfaceC1444w, false);
            if (kSerializerL == null) {
                return null;
            }
            arrayList2.add(kSerializerL);
        }
        return arrayList2;
    }

    public static String R(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String string = stringWriter.toString();
        l.e("toString(...)", string);
        return string;
    }

    public static final long S(long j7, long j8) {
        int iC;
        int iE = H0.H.e(j7);
        int iD = H0.H.d(j7);
        if (H0.H.e(j8) >= H0.H.d(j7) || H0.H.e(j7) >= H0.H.d(j8)) {
            if (iD > H0.H.e(j8)) {
                iE -= H0.H.c(j8);
                iC = H0.H.c(j8);
                iD -= iC;
            }
        } else if (H0.H.e(j8) > H0.H.e(j7) || H0.H.d(j7) > H0.H.d(j8)) {
            if (H0.H.e(j7) > H0.H.e(j8) || H0.H.d(j8) > H0.H.d(j7)) {
                int iE2 = H0.H.e(j8);
                if (iE >= H0.H.d(j8) || iE2 > iE) {
                    iD = H0.H.e(j8);
                } else {
                    iE = H0.H.e(j8);
                    iC = H0.H.c(j8);
                }
            } else {
                iC = H0.H.c(j8);
            }
            iD -= iC;
        } else {
            iE = H0.H.e(j8);
            iD = iE;
        }
        return AbstractC1420H.c(iE, iD);
    }

    public static final g0.d U(w0.r rVar) {
        g0.d dVarE = X.e(rVar);
        long jF = rVar.f(AbstractC0832b.e(dVarE.a, dVarE.f11659b));
        long jF2 = rVar.f(AbstractC0832b.e(dVarE.f11660c, dVarE.f11661d));
        return new g0.d(g0.c.d(jF), g0.c.e(jF), g0.c.d(jF2), g0.c.e(jF2));
    }

    public static h V(k kVar) {
        l.f("changeOptions", kVar);
        Y4.l lVar = new Y4.l();
        kVar.invoke(lVar);
        lVar.a = true;
        return new h(lVar);
    }

    public static final long a(int i7, int i8, int i9, int i10) {
        boolean z7 = false;
        if (!(i8 >= i7)) {
            android.support.v4.media.session.b.H("maxWidth(" + i8 + ") must be >= than minWidth(" + i7 + ')');
            throw null;
        }
        if (!(i10 >= i9)) {
            android.support.v4.media.session.b.H("maxHeight(" + i10 + ") must be >= than minHeight(" + i9 + ')');
            throw null;
        }
        if (i7 >= 0 && i9 >= 0) {
            z7 = true;
        }
        if (z7) {
            return x(i7, i8, i9, i10);
        }
        android.support.v4.media.session.b.H("minWidth(" + i7 + ") and minHeight(" + i9 + ") must be >= 0");
        throw null;
    }

    public static /* synthetic */ long b(int i7, int i8, int i9) {
        if ((i9 & 2) != 0) {
            i7 = Integer.MAX_VALUE;
        }
        if ((i9 & 8) != 0) {
            i8 = Integer.MAX_VALUE;
        }
        return a(0, i7, 0, i8);
    }

    public static q c(k kVar) {
        C0673c c0673c = a6.d.f10459d;
        l.f("from", c0673c);
        a6.h hVar = new a6.h();
        j jVar = c0673c.a;
        hVar.a = jVar.a;
        hVar.f10465b = jVar.f10478e;
        hVar.f10466c = jVar.f10475b;
        hVar.f10467d = jVar.f10476c;
        String str = jVar.f10479f;
        hVar.f10468e = str;
        hVar.f10469f = jVar.f10480g;
        hVar.f10470g = jVar.f10483j;
        hVar.f10471h = jVar.f10482i;
        hVar.f10472i = jVar.f10481h;
        hVar.f10473j = jVar.f10477d;
        hVar.f10474k = c0673c.f10460b;
        kVar.invoke(hVar);
        if (!l.a(str, "    ")) {
            throw new IllegalArgumentException("Indent should not be specified when default printing mode is used");
        }
        j jVar2 = new j(hVar.a, hVar.f10466c, hVar.f10467d, hVar.f10473j, hVar.f10465b, hVar.f10468e, hVar.f10469f, hVar.f10472i, hVar.f10471h, hVar.f10470g);
        C0837a c0837a = hVar.f10474k;
        l.f("module", c0837a);
        q qVar = new q(jVar2, c0837a);
        if (c0837a.equals(AbstractC0839c.a)) {
            return qVar;
        }
        EnumC0671a enumC0671a = EnumC0671a.f10453k;
        return qVar;
    }

    public static final void d(C0174k c0174k, X.g gVar, W.a aVar, C0510p c0510p, int i7) {
        c0510p.T(-1579360880);
        if ((((c0510p.h(c0174k) ? 4 : 2) | i7 | (c0510p.h(gVar) ? 32 : 16)) & 147) == 146 && c0510p.y()) {
            c0510p.M();
        } else {
            C0486d.b(new C0507n0[]{AbstractC2208a.a.a(c0174k), AbstractC2034a.a.a(c0174k), AndroidCompositionLocals_androidKt.f10672e.a(c0174k)}, W.f.b(-52928304, new M(3, gVar, aVar), c0510p), c0510p, 56);
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new K(c0174k, gVar, aVar, i7, 1);
        }
    }

    public static final void e(X.g gVar, W.a aVar, C0510p c0510p, int i7) {
        int i8;
        c0510p.T(1211832233);
        if ((i7 & 6) == 0) {
            i8 = (c0510p.h(gVar) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= c0510p.h(aVar) ? 32 : 16;
        }
        if ((i8 & 19) == 18 && c0510p.y()) {
            c0510p.M();
        } else {
            c0510p.S(1729797275);
            androidx.lifecycle.W wA = AbstractC2208a.a(c0510p);
            if (wA == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            O oV0 = AbstractC0871d.v0(y.a.b(C0245a.class), wA, wA instanceof InterfaceC0684k ? ((InterfaceC0684k) wA).d() : C2147a.f16519b, c0510p);
            c0510p.p(false);
            C0245a c0245a = (C0245a) oV0;
            c0245a.f3610d = new WeakReference(gVar);
            gVar.a(c0245a.f3609c, aVar, c0510p, ((i8 << 6) & 896) | (i8 & 112));
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new C0064m(i7, 1, gVar, aVar);
        }
    }

    public static final int f(int i7) {
        if (i7 < 8191) {
            return 262142;
        }
        if (i7 < 32767) {
            return 65534;
        }
        if (i7 < 65535) {
            return 32766;
        }
        if (i7 < 262143) {
            return 8190;
        }
        throw new IllegalArgumentException(c0.a(i7, "Can't represent a size of ", " in Constraints"));
    }

    public static final boolean g(Object[] objArr, int i7, int i8, List list) {
        if (i8 == list.size()) {
            for (int i9 = 0; i9 < i8; i9++) {
                if (l.a(objArr[i7 + i9], list.get(i9))) {
                }
            }
            return true;
        }
        return false;
    }

    public static final String h(Object[] objArr, int i7, int i8, AbstractC0566g abstractC0566g) {
        StringBuilder sb = new StringBuilder((i8 * 3) + 2);
        sb.append("[");
        for (int i9 = 0; i9 < i8; i9++) {
            if (i9 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i7 + i9];
            if (obj == abstractC0566g) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        String string = sb.toString();
        l.e("toString(...)", string);
        return string;
    }

    public static final ExtractedText i(w wVar) {
        ExtractedText extractedText = new ExtractedText();
        String str = wVar.a.a;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j7 = wVar.f6896b;
        extractedText.selectionStart = H0.H.e(j7);
        extractedText.selectionEnd = H0.H.d(j7);
        extractedText.flags = !AbstractC2510o.X(wVar.a.a, '\n') ? 1 : 0;
        return extractedText;
    }

    public static void j(Throwable th, Throwable th2) {
        l.f("<this>", th);
        l.f("exception", th2);
        if (th != th2) {
            Integer num = X3.a.a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = W3.a.a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static final int k(int i7) {
        if (i7 < 8191) {
            return 13;
        }
        if (i7 < 32767) {
            return 15;
        }
        if (i7 < 65535) {
            return 16;
        }
        return i7 < 262143 ? 18 : 255;
    }

    public static void l(int i7, int i8, int i9) {
        if (i7 < 0 || i8 > i9) {
            StringBuilder sbB = c0.b("startIndex: ", i7, ", endIndex: ", i8, ", size: ");
            sbB.append(i9);
            throw new IndexOutOfBoundsException(sbB.toString());
        }
        if (i7 > i8) {
            throw new IllegalArgumentException(A6.b.e(i7, i8, "startIndex: ", " > endIndex: "));
        }
    }

    public static void m(int i7, int i8, int i9) {
        if (i7 < 0 || i8 > i9) {
            StringBuilder sbB = c0.b("fromIndex: ", i7, ", toIndex: ", i8, ", size: ");
            sbB.append(i9);
            throw new IndexOutOfBoundsException(sbB.toString());
        }
        if (i7 > i8) {
            throw new IllegalArgumentException(A6.b.e(i7, i8, "fromIndex: ", " > toIndex: "));
        }
    }

    public static A2.b n(A2.b bVar, InterfaceC2101g interfaceC2101g, p pVar, int i7) {
        if ((i7 & 2) != 0) {
            pVar = null;
        }
        l.f("<this>", bVar);
        return new A2.b((K4.a) bVar.f110l, pVar != null ? new C0023j(bVar, interfaceC2101g, pVar, 0) : (K4.e) bVar.f111m, z1.c.B(O3.j.f7526l, new A3.q(3, bVar, interfaceC2101g)));
    }

    public static final a0.q o(a0.q qVar, InterfaceC0973S interfaceC0973S) {
        return androidx.compose.ui.graphics.a.b(qVar, 0.0f, 0.0f, interfaceC0973S, true, 124927);
    }

    public static final a0.q p(a0.q qVar) {
        return androidx.compose.ui.graphics.a.b(qVar, 0.0f, 0.0f, null, true, 126975);
    }

    public static final void q(AutoCloseable autoCloseable, Throwable th) {
        if (autoCloseable != null) {
            if (th == null) {
                autoCloseable.close();
                return;
            }
            try {
                autoCloseable.close();
            } catch (Throwable th2) {
                j(th, th2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String r(u4.InterfaceC2099e r3, P4.f r4) {
        /*
            java.lang.String r0 = "klass"
            kotlin.jvm.internal.l.f(r0, r3)
            java.lang.String r0 = "typeMappingConfiguration"
            kotlin.jvm.internal.l.f(r0, r4)
            u4.k r0 = r3.k()
            java.lang.String r1 = "getContainingDeclaration(...)"
            kotlin.jvm.internal.l.e(r1, r0)
            W4.e r1 = r3.getName()
            if (r1 == 0) goto L20
            W4.e r2 = W4.g.a
            boolean r2 = r1.f9625l
            if (r2 != 0) goto L20
            goto L22
        L20:
            W4.e r1 = W4.g.f9628c
        L22:
            java.lang.String r1 = r1.c()
            boolean r2 = r0 instanceof u4.InterfaceC2088D
            if (r2 == 0) goto L58
            u4.D r0 = (u4.InterfaceC2088D) r0
            x4.C r0 = (x4.AbstractC2257C) r0
            W4.c r3 = r0.f17354o
            W4.d r4 = r3.a
            boolean r4 = r4.c()
            if (r4 == 0) goto L39
            return r1
        L39:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            W4.d r3 = r3.a
            java.lang.String r3 = r3.a
            r0 = 46
            r2 = 47
            java.lang.String r3 = z5.AbstractC2517v.Q(r3, r0, r2)
            r4.append(r3)
            r4.append(r2)
            r4.append(r1)
            java.lang.String r3 = r4.toString()
            return r3
        L58:
            boolean r2 = r0 instanceof u4.InterfaceC2099e
            if (r2 == 0) goto L60
            r2 = r0
            u4.e r2 = (u4.InterfaceC2099e) r2
            goto L61
        L60:
            r2 = 0
        L61:
            if (r2 == 0) goto L7c
            java.lang.String r3 = r(r2, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            r3 = 36
            r4.append(r3)
            r4.append(r1)
            java.lang.String r3 = r4.toString()
            return r3
        L7c:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unexpected container: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = " for "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r4.<init>(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.c.r(u4.e, P4.f):java.lang.String");
    }

    public static final long s(long j7, long j8) {
        return AbstractC1420H.a(e3.c.k((int) (j8 >> 32), T0.a.j(j7), T0.a.h(j7)), e3.c.k((int) (j8 & 4294967295L), T0.a.i(j7), T0.a.g(j7)));
    }

    public static final long t(long j7, long j8) {
        return a(e3.c.k(T0.a.j(j8), T0.a.j(j7), T0.a.h(j7)), e3.c.k(T0.a.h(j8), T0.a.j(j7), T0.a.h(j7)), e3.c.k(T0.a.i(j8), T0.a.i(j7), T0.a.g(j7)), e3.c.k(T0.a.g(j8), T0.a.i(j7), T0.a.g(j7)));
    }

    public static final int u(int i7, long j7) {
        return e3.c.k(i7, T0.a.i(j7), T0.a.g(j7));
    }

    public static final int v(int i7, long j7) {
        return e3.c.k(i7, T0.a.j(j7), T0.a.h(j7));
    }

    public static final A2.b w(A2.b bVar, v4.h hVar) {
        l.f("<this>", bVar);
        l.f("additionalAnnotations", hVar);
        if (hVar.isEmpty()) {
            return bVar;
        }
        return new A2.b((K4.a) bVar.f110l, (K4.e) bVar.f111m, z1.c.B(O3.j.f7526l, new A3.q(4, bVar, hVar)));
    }

    public static final long x(int i7, int i8, int i9, int i10) {
        int i11 = i10 == Integer.MAX_VALUE ? i9 : i10;
        int iK = k(i11);
        int i12 = i8 == Integer.MAX_VALUE ? i7 : i8;
        int iK2 = k(i12);
        if (iK + iK2 > 31) {
            throw new IllegalArgumentException("Can't represent a width of " + i12 + " and height of " + i11 + " in Constraints");
        }
        int i13 = i8 + 1;
        int i14 = i13 & (~(i13 >> 31));
        int i15 = i10 + 1;
        int i16 = i15 & (~(i15 >> 31));
        int i17 = 0;
        if (iK2 != 13) {
            if (iK2 == 18) {
                i17 = 3;
            } else if (iK2 == 15) {
                i17 = 1;
            } else if (iK2 == 16) {
                i17 = 2;
            }
        }
        int i18 = (((i17 & 2) >> 1) * 3) + ((i17 & 1) << 1);
        return (i14 << 33) | i17 | (i7 << 2) | (i9 << (i18 + 15)) | (i16 << (i18 + 46));
    }

    public static final M0.k y(Context context) {
        return new M0.k(new C0468a(context, 0), new C0469b(Build.VERSION.SDK_INT >= 31 ? v.a.a(context) : 0));
    }

    public static Bitmap z(byte[] bArr, int i7) throws IOException {
        int iE;
        int i8 = 0;
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, i7, null);
        if (bitmapDecodeByteArray == null) {
            throw E.a(new IllegalStateException(), "Could not decode image data");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            C1868g c1868g = new C1868g(byteArrayInputStream);
            byteArrayInputStream.close();
            C1864c c1864cC = c1868g.c("Orientation");
            if (c1864cC == null) {
                iE = 1;
            } else {
                try {
                    iE = c1864cC.e(c1868g.f14852f);
                } catch (NumberFormatException unused) {
                }
            }
            switch (iE) {
                case 3:
                case GzipHeaderFlags.EXTRA /* 4 */:
                    i8 = 180;
                    break;
                case 5:
                case 8:
                    i8 = 270;
                    break;
                case 6:
                case 7:
                    i8 = 90;
                    break;
            }
            if (i8 == 0) {
                return bitmapDecodeByteArray;
            }
            Matrix matrix = new Matrix();
            matrix.postRotate(i8);
            return Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), matrix, false);
        } finally {
        }
    }

    public abstract void T(ArrayList arrayList);
}
