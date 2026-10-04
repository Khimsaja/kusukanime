package android.support.v4.media.session;

import D.C0056i;
import D.C0064m;
import D4.A;
import D4.B;
import D4.C;
import D4.C0099s;
import D4.C0100t;
import D4.C0101u;
import D4.C0102v;
import D4.C0103w;
import D4.C0104x;
import D4.C0105y;
import D4.C0106z;
import D4.F;
import D4.G;
import D4.H;
import D4.I;
import D4.J;
import D4.K;
import D4.L;
import D4.S;
import D4.r;
import E4.i;
import F0.n;
import F0.q;
import H.C0184a;
import H.C0190g;
import H.C0193j;
import H.C0195l;
import H.InterfaceC0196m;
import L.C0391l;
import O.C0486d;
import O.C0502l;
import O.C0506n;
import O.C0509o0;
import O.C0510p;
import O.C0524x;
import O.InterfaceC0501k0;
import O.Z;
import P3.E;
import P3.y;
import P4.f;
import R4.C0574e;
import R4.C0575f;
import R4.C0577h;
import R4.EnumC0573d;
import T0.k;
import T4.e;
import T4.g;
import X0.p;
import X0.s;
import X0.z;
import X4.AbstractC0615l;
import X4.C0612i;
import X4.C0616m;
import X4.C0617n;
import a0.d;
import android.graphics.Color;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.InterfaceC0694v;
import b1.AbstractC0703b;
import com.kusukanime.R;
import com.kusukanime.data.LikeRow;
import d.AbstractC0774h;
import d.C0770d;
import d.C0778l;
import d.C0779m;
import e4.InterfaceC0821a;
import e5.AbstractC0832b;
import e5.C0833c;
import f4.InterfaceC0881a;
import f4.InterfaceC0884d;
import f6.AbstractC0905c;
import g5.o;
import h0.C0975U;
import h0.C0998u;
import io.ktor.util.GzipHeaderFlags;
import j1.C1303d;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.v;
import n0.AbstractC1530A;
import n0.C1537d;
import n0.C1538e;
import n5.AbstractC1586x;
import r4.AbstractC1880i;
import t4.C2053d;
import u4.EnumC2100f;
import u4.InterfaceC2099e;
import u4.InterfaceC2102h;
import u4.InterfaceC2112s;
import u4.M;
import v.AbstractC2123b;
import v.c0;
import v4.h;
import x4.C2272S;
import y0.C2361h;
import y0.C2362i;
import y0.C2363j;
import y0.InterfaceC2364k;
import z0.AbstractC2455l0;
import z5.AbstractC2510o;
import z5.AbstractC2517v;

/* loaded from: classes.dex */
public abstract class b {
    public static C1538e a;

    /* renamed from: b, reason: collision with root package name */
    public static C1538e f10533b;

    /* renamed from: c, reason: collision with root package name */
    public static C1538e f10534c;

    /* renamed from: d, reason: collision with root package name */
    public static C1538e f10535d;

    /* renamed from: e, reason: collision with root package name */
    public static C1538e f10536e;

    /* renamed from: f, reason: collision with root package name */
    public static C1538e f10537f;

    public static final int A(String str) {
        int iD0;
        char c2 = File.separatorChar;
        int iD02 = AbstractC2510o.d0(str, c2, 0, 4);
        if (iD02 == 0) {
            if (str.length() <= 1 || str.charAt(1) != c2 || (iD0 = AbstractC2510o.d0(str, c2, 2, 4)) < 0) {
                return 1;
            }
            int iD03 = AbstractC2510o.d0(str, c2, iD0 + 1, 4);
            return iD03 >= 0 ? iD03 + 1 : str.length();
        }
        if (iD02 > 0 && str.charAt(iD02 - 1) == ':') {
            return iD02 + 1;
        }
        if (iD02 == -1 && AbstractC2510o.a0(str, ':')) {
            return str.length();
        }
        return 0;
    }

    public static final long B(float f5, long j7) {
        return (Float.isNaN(f5) || f5 >= 1.0f) ? j7 : C0998u.b(C0998u.d(j7) * f5, j7);
    }

    public static final r C(C0577h c0577h, g gVar) {
        l.f("<this>", c0577h);
        l.f("strings", gVar);
        String strV = v(gVar, c0577h.f8486m);
        List<C0575f> list = c0577h.f8487n;
        l.e("getArgumentList(...)", list);
        ArrayList arrayList = new ArrayList();
        for (C0575f c0575f : list) {
            C0574e c0574e = c0575f.f8458n;
            l.e("getValue(...)", c0574e);
            L lD = D(c0574e, gVar);
            O3.l lVar = lD != null ? new O3.l(gVar.a(c0575f.f8457m), lD) : null;
            if (lVar != null) {
                arrayList.add(lVar);
            }
        }
        return new r(E.r0(arrayList), strV);
    }

    public static final L D(C0574e c0574e, g gVar) {
        l.f("<this>", c0574e);
        l.f("strings", gVar);
        if (e.f9081P.c(c0574e.f8445w).booleanValue()) {
            EnumC0573d enumC0573d = c0574e.f8435m;
            int i7 = enumC0573d != null ? i.a[enumC0573d.ordinal()] : -1;
            if (i7 == 1) {
                return new H((byte) c0574e.f8436n);
            }
            if (i7 == 2) {
                return new K((short) c0574e.f8436n);
            }
            if (i7 == 3) {
                return new I((int) c0574e.f8436n);
            }
            if (i7 == 4) {
                return new J(c0574e.f8436n);
            }
            throw new IllegalStateException(("Cannot read value of unsigned type: " + c0574e.f8435m).toString());
        }
        EnumC0573d enumC0573d2 = c0574e.f8435m;
        switch (enumC0573d2 != null ? i.a[enumC0573d2.ordinal()] : -1) {
            case -1:
                return null;
            case 0:
            default:
                throw new D6.r();
            case 1:
                return new C0103w((byte) c0574e.f8436n);
            case 2:
                return new F((short) c0574e.f8436n);
            case 3:
                return new B((int) c0574e.f8436n);
            case GzipHeaderFlags.EXTRA /* 4 */:
                return new D4.E(c0574e.f8436n);
            case 5:
                return new C0104x((char) c0574e.f8436n);
            case 6:
                return new A(c0574e.f8437o);
            case 7:
                return new C0105y(c0574e.f8438p);
            case 8:
                return new C0102v(c0574e.f8436n != 0);
            case 9:
                return new G(gVar.a(c0574e.f8439q));
            case 10:
                String strV = v(gVar, c0574e.f8440r);
                int i8 = c0574e.f8444v;
                return i8 == 0 ? new C(strV) : new C0100t(strV, i8);
            case 11:
                return new C0106z(v(gVar, c0574e.f8440r), gVar.a(c0574e.f8441s));
            case 12:
                C0577h c0577h = c0574e.f8442t;
                l.e("getAnnotation(...)", c0577h);
                return new C0099s(C(c0577h, gVar));
            case 13:
                List<C0574e> list = c0574e.f8443u;
                l.e("getArrayElementList(...)", list);
                ArrayList arrayList = new ArrayList();
                for (C0574e c0574e2 : list) {
                    l.c(c0574e2);
                    L lD = D(c0574e2, gVar);
                    if (lD != null) {
                        arrayList.add(lD);
                    }
                }
                return new C0101u(arrayList);
        }
    }

    public static long E(B1.B b4, int i7, int i8) {
        b4.F(i7);
        if (b4.a() < 5) {
            return -9223372036854775807L;
        }
        int iG = b4.g();
        if ((8388608 & iG) != 0 || ((2096896 & iG) >> 8) != i8 || (iG & 32) == 0 || b4.t() < 7 || b4.a() < 7 || (b4.t() & 16) != 16) {
            return -9223372036854775807L;
        }
        b4.e(new byte[6], 0, 6);
        return ((r0[0] & 255) << 25) | ((r0[1] & 255) << 17) | ((r0[2] & 255) << 9) | ((r0[3] & 255) << 1) | ((r0[4] & 255) >> 7);
    }

    public static final void F(C1303d c1303d, n nVar) {
        Object obj = nVar.i().f2096k.get(q.f2134g);
        if (obj == null) {
            obj = null;
        }
        if (obj != null) {
            throw new ClassCastException();
        }
        n nVarJ = nVar.j();
        if (nVarJ == null) {
            return;
        }
        Object obj2 = nVarJ.i().f2096k.get(q.f2132e);
        if (obj2 == null) {
            obj2 = null;
        }
        if (obj2 != null) {
            Object obj3 = nVarJ.i().f2096k.get(q.f2133f);
            F0.b bVar = (F0.b) (obj3 != null ? obj3 : null);
            if (bVar == null || (bVar.a >= 0 && bVar.f2063b >= 0)) {
                if (nVar.i().f2096k.containsKey(q.f2122A)) {
                    ArrayList arrayList = new ArrayList();
                    List listH = n.h(nVarJ, 4);
                    int size = listH.size();
                    int i7 = 0;
                    for (int i8 = 0; i8 < size; i8++) {
                        n nVar2 = (n) listH.get(i8);
                        if (nVar2.i().f2096k.containsKey(q.f2122A)) {
                            arrayList.add(nVar2);
                            if (nVar2.f2103c.t() < nVar.f2103c.t()) {
                                i7++;
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    boolean zJ = j(arrayList);
                    int i9 = zJ ? 0 : i7;
                    int i10 = zJ ? i7 : 0;
                    Object obj4 = nVar.i().f2096k.get(q.f2122A);
                    if (obj4 == null) {
                        obj4 = Boolean.FALSE;
                    }
                    c1303d.a.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i9, 1, i10, 1, false, ((Boolean) obj4).booleanValue()));
                }
            }
        }
    }

    public static final String G(InterfaceC2099e interfaceC2099e, String str) {
        l.f("classDescriptor", interfaceC2099e);
        l.f("jvmDescriptor", str);
        String str2 = C2053d.a;
        W4.b bVarF = C2053d.f(d5.e.g(interfaceC2099e).a);
        String strE = bVarF != null ? C0833c.e(bVarF) : q0.c.r(interfaceC2099e, f.f7797m);
        l.f("internalName", strE);
        return strE + '.' + str;
    }

    public static final void H(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final Z3.a I(File file) {
        List list;
        String path = file.getPath();
        l.c(path);
        int iA = A(path);
        String strSubstring = path.substring(0, iA);
        l.e("substring(...)", strSubstring);
        String strSubstring2 = path.substring(iA);
        l.e("substring(...)", strSubstring2);
        if (strSubstring2.length() == 0) {
            list = y.f7779k;
        } else {
            List listV0 = AbstractC2510o.v0(strSubstring2, new char[]{File.separatorChar});
            ArrayList arrayList = new ArrayList(P3.r.p(listV0, 10));
            Iterator it = listV0.iterator();
            while (it.hasNext()) {
                arrayList.add(new File((String) it.next()));
            }
            list = arrayList;
        }
        return new Z3.a(new File(strSubstring), list);
    }

    public static String J(int i7) {
        Object[] objArr = {Integer.valueOf(Color.red(i7)), Integer.valueOf(Color.green(i7)), Integer.valueOf(Color.blue(i7)), Double.valueOf(Color.alpha(i7) / 255.0d)};
        int i8 = B1.K.a;
        return String.format(Locale.US, "rgba(%d,%d,%d,%.3f)", objArr);
    }

    public static String K(int i7) {
        return i7 == 0 ? "Unspecified" : i7 == 1 ? "Text" : i7 == 2 ? "Ascii" : i7 == 3 ? "Number" : i7 == 4 ? "Phone" : i7 == 5 ? "Uri" : i7 == 6 ? "Email" : i7 == 7 ? "Password" : i7 == 8 ? "NumberPassword" : i7 == 9 ? "Decimal" : "Invalid";
    }

    public static W4.b L(W4.c cVar) {
        l.f("topLevelFqName", cVar);
        return new W4.b(cVar.b(), cVar.a.g());
    }

    public static final double M(long j7) {
        return ((j7 >>> 11) * 2048) + (j7 & 2047);
    }

    public static Bundle N(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(b.class.getClassLoader());
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    public static final void a(InterfaceC0821a interfaceC0821a, X0.q qVar, W.a aVar, C0510p c0510p, int i7) {
        int i8;
        int i9;
        k kVar;
        c0510p.T(-2032877254);
        if ((i7 & 6) == 0) {
            i8 = (c0510p.h(interfaceC0821a) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= c0510p.f(qVar) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i8 |= c0510p.h(aVar) ? 256 : 128;
        }
        int i10 = i8;
        if ((i10 & 147) == 146 && c0510p.y()) {
            c0510p.M();
        } else {
            View view = (View) c0510p.k(AndroidCompositionLocals_androidKt.f10673f);
            T0.b bVar = (T0.b) c0510p.k(AbstractC2455l0.f18787f);
            k kVar2 = (k) c0510p.k(AbstractC2455l0.f18793l);
            C0506n c0506nM = C0486d.M(c0510p);
            Z zN = C0486d.N(aVar, c0510p);
            UUID uuid = (UUID) z1.c.F(new Object[0], null, X0.c.f9701m, c0510p, 3072, 6);
            boolean zF = c0510p.f(view) | c0510p.f(bVar);
            Object objH = c0510p.H();
            Object obj = C0502l.a;
            if (zF || objH == obj) {
                i9 = i10;
                kVar = kVar2;
                s sVar = new s(interfaceC0821a, qVar, view, kVar, bVar, uuid);
                W.a aVar2 = new W.a(true, 488261145, new C0391l(3, zN));
                p pVar = sVar.f9737q;
                pVar.setParentCompositionContext(c0506nM);
                pVar.f9728t.setValue(aVar2);
                pVar.f9730v = true;
                pVar.d();
                c0510p.b0(sVar);
                objH = sVar;
            } else {
                i9 = i10;
                kVar = kVar2;
            }
            s sVar2 = (s) objH;
            boolean zH = c0510p.h(sVar2);
            Object objH2 = c0510p.H();
            if (zH || objH2 == obj) {
                objH2 = new X0.a(sVar2, 0);
                c0510p.b0(objH2);
            }
            C0486d.c(sVar2, (e4.k) objH2, c0510p);
            boolean zH2 = c0510p.h(sVar2) | ((i9 & 14) == 4) | ((i9 & 112) == 32) | c0510p.f(kVar);
            Object objH3 = c0510p.H();
            if (zH2 || objH3 == obj) {
                Object j7 = new D.J(sVar2, interfaceC0821a, qVar, kVar, 3);
                c0510p.b0(j7);
                objH3 = j7;
            }
            C0486d.g((InterfaceC0821a) objH3, c0510p);
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new C0184a(interfaceC0821a, qVar, aVar, i7, 5);
        }
    }

    public static final void b(InterfaceC0196m interfaceC0196m, d dVar, W.a aVar, C0510p c0510p, int i7) {
        int i8;
        c0510p.T(476043083);
        if ((i7 & 6) == 0) {
            i8 = ((i7 & 8) == 0 ? c0510p.f(interfaceC0196m) : c0510p.h(interfaceC0196m) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= c0510p.f(dVar) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i8 |= c0510p.h(aVar) ? 256 : 128;
        }
        if ((i8 & 147) == 146 && c0510p.y()) {
            c0510p.M();
        } else {
            boolean z7 = ((i8 & 14) == 4 || ((i8 & 8) != 0 && c0510p.f(interfaceC0196m))) | ((i8 & 112) == 32);
            Object objH = c0510p.H();
            if (z7 || objH == C0502l.a) {
                objH = new C0195l(dVar, interfaceC0196m);
                c0510p.b0(objH);
            }
            X0.k.a((C0195l) objH, null, new z(1, false, false), aVar, c0510p, ((i8 << 3) & 7168) | 384, 2);
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new C0184a(interfaceC0196m, dVar, aVar, i7, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x03c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(G2.E r37, G2.B r38, a0.q r39, a0.i r40, e4.k r41, e4.k r42, e4.k r43, e4.k r44, O.C0510p r45, int r46) {
        /*
            Method dump skipped, instructions count: 2579
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.b.c(G2.E, G2.B, a0.q, a0.i, e4.k, e4.k, e4.k, e4.k, O.p, int):void");
    }

    public static final void d(G2.E e7, a0.q qVar, a0.i iVar, H2.y yVar, H2.y yVar2, H2.y yVar3, H2.y yVar4, e4.k kVar, C0510p c0510p, int i7) {
        a0.i iVar2;
        int i8;
        H2.y yVar5;
        H2.y yVar6;
        H2.y yVar7;
        char c2;
        H2.y yVar8;
        a0.i iVar3;
        c0510p.T(1840250294);
        int i9 = i7 | (c0510p.h(e7) ? 4 : 2) | (c0510p.f(qVar) ? 256 : 128) | 844852224;
        char c4 = c0510p.h(kVar) ? (char) 4 : (char) 2;
        if ((306783379 & i9) == 306783378 && (c4 & 3) == 2 && c0510p.y()) {
            c0510p.M();
            iVar3 = iVar;
            yVar5 = yVar;
            yVar8 = yVar2;
            yVar6 = yVar3;
            yVar7 = yVar4;
        } else {
            c0510p.O();
            if ((i7 & 1) == 0 || c0510p.x()) {
                iVar2 = a0.b.f10381k;
                i8 = i9 & (-264241153);
                yVar5 = H2.y.f3670n;
                yVar6 = yVar5;
                yVar7 = H2.y.f3671o;
                c2 = c4;
                yVar8 = yVar7;
            } else {
                c0510p.M();
                i8 = i9 & (-264241153);
                iVar2 = iVar;
                yVar5 = yVar;
                yVar6 = yVar3;
                yVar7 = yVar4;
                c2 = c4;
                yVar8 = yVar2;
            }
            c0510p.q();
            boolean z7 = (c2 & 14) == 4;
            Object objH = c0510p.H();
            if (z7 || objH == C0502l.a) {
                G2.C c6 = new G2.C(e7.f2653v);
                kVar.invoke(c6);
                objH = c6.c();
                c0510p.b0(objH);
            }
            iVar3 = iVar2;
            c(e7, (G2.B) objH, qVar, iVar3, yVar5, yVar8, yVar6, yVar7, c0510p, (i8 & 8078) | 100884480);
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new H2.r(e7, qVar, iVar3, yVar5, yVar8, yVar6, yVar7, kVar, i7);
        }
    }

    public static final boolean e(Z z7) {
        return ((Boolean) z7.getValue()).booleanValue();
    }

    public static final void f(boolean z7, e4.n nVar, C0510p c0510p, int i7) {
        c0510p.T(-642000585);
        int i8 = (c0510p.g(z7) ? 4 : 2) | i7 | (c0510p.h(nVar) ? 32 : 16);
        if ((i8 & 19) == 18 && c0510p.y()) {
            c0510p.M();
        } else {
            Z zN = C0486d.N(nVar, c0510p);
            Object objH = c0510p.H();
            Object obj = C0502l.a;
            if (objH == obj) {
                Object c0524x = new C0524x(C0486d.y(c0510p));
                c0510p.b0(c0524x);
                objH = c0524x;
            }
            M5.c cVar = ((C0524x) objH).f7242k;
            Object objH2 = c0510p.H();
            Object obj2 = objH2;
            if (objH2 == obj) {
                e4.n nVar2 = (e4.n) zN.getValue();
                C0778l c0778l = new C0778l(z7);
                c0778l.f11188d = cVar;
                c0778l.f11189e = nVar2;
                c0510p.b0(c0778l);
                obj2 = c0778l;
            }
            C0778l c0778l2 = (C0778l) obj2;
            boolean zF = c0510p.f((e4.n) zN.getValue()) | c0510p.f(cVar);
            Object objH3 = c0510p.H();
            if (zF || objH3 == obj) {
                c0778l2.f11189e = (e4.n) zN.getValue();
                c0778l2.f11188d = cVar;
                c0510p.b0(O3.C.a);
            }
            Boolean boolValueOf = Boolean.valueOf(z7);
            boolean zH = ((i8 & 14) == 4) | c0510p.h(c0778l2);
            Object objH4 = c0510p.H();
            if (zH || objH4 == obj) {
                objH4 = new C0779m(c0778l2, z7, null);
                c0510p.b0(objH4);
            }
            C0486d.e(c0510p, (e4.n) objH4, boolValueOf);
            c.y yVarA = AbstractC0774h.a(c0510p);
            if (yVarA == null) {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
            }
            Object objA = yVarA.a();
            Object obj3 = (InterfaceC0694v) c0510p.k(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            boolean zH2 = c0510p.h(objA) | c0510p.h(obj3) | c0510p.h(c0778l2);
            Object objH5 = c0510p.H();
            if (zH2 || objH5 == obj) {
                objH5 = new C0056i(objA, obj3, c0778l2, 9);
                c0510p.b0(objH5);
            }
            C0486d.d(obj3, objA, (e4.k) objH5, c0510p);
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new C0770d(z7, nVar, i7, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(H.InterfaceC0196m r17, boolean r18, S0.h r19, boolean r20, long r21, a0.q r23, O.C0510p r24, int r25) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.b.g(H.m, boolean, S0.h, boolean, long, a0.q, O.p, int):void");
    }

    public static final void h(a0.q qVar, InterfaceC0821a interfaceC0821a, boolean z7, C0510p c0510p, int i7) {
        int i8;
        c0510p.T(2111672474);
        if ((i7 & 6) == 0) {
            i8 = (c0510p.f(qVar) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if (((i8 | (c0510p.h(interfaceC0821a) ? 32 : 16) | (c0510p.g(z7) ? 256 : 128)) & 147) == 146 && c0510p.y()) {
            c0510p.M();
        } else {
            AbstractC2123b.a(c0510p, a0.a.a(androidx.compose.foundation.layout.c.k(qVar, H.A.a, H.A.f2869b), new C0193j(z7, interfaceC0821a)));
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new C0190g(qVar, interfaceC0821a, z7, i7);
        }
    }

    public static final void i(a0.q qVar, W.a aVar, C0510p c0510p, int i7) {
        int i8;
        c0510p.T(-1177876616);
        if ((i7 & 6) == 0) {
            i8 = (c0510p.f(qVar) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= c0510p.h(aVar) ? 32 : 16;
        }
        if ((i8 & 19) == 18 && c0510p.y()) {
            c0510p.M();
        } else {
            X0.d dVar = X0.d.f9705b;
            int i9 = c0510p.f7128P;
            InterfaceC0501k0 interfaceC0501k0M = c0510p.m();
            a0.q qVarC = a0.a.c(c0510p, qVar);
            InterfaceC2364k.f17877j.getClass();
            C2362i c2362i = C2363j.f17871b;
            int i10 = (((((i8 << 3) & 112) | (((i8 >> 3) & 14) | 384)) << 6) & 896) | 6;
            c0510p.V();
            if (c0510p.f7127O) {
                c0510p.l(c2362i);
            } else {
                c0510p.e0();
            }
            C0486d.R(c0510p, C2363j.f17875f, dVar);
            C0486d.R(c0510p, C2363j.f17874e, interfaceC0501k0M);
            C2361h c2361h = C2363j.f17876g;
            if (c0510p.f7127O || !l.a(c0510p.H(), Integer.valueOf(i9))) {
                AbstractC0703b.u(i9, c0510p, i9, c2361h);
            }
            C0486d.R(c0510p, C2363j.f17873d, qVarC);
            AbstractC0703b.v((i10 >> 6) & 14, aVar, c0510p, true);
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new C0064m(i7, 6, qVar, aVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [P3.y] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList] */
    public static final boolean j(ArrayList arrayList) {
        ?? arrayList2;
        long j7;
        if (arrayList.size() >= 2) {
            if (arrayList.size() == 0 || arrayList.size() == 1) {
                arrayList2 = y.f7779k;
            } else {
                arrayList2 = new ArrayList();
                Object obj = arrayList.get(0);
                int iY = P3.r.y(arrayList);
                int i7 = 0;
                while (i7 < iY) {
                    i7++;
                    Object obj2 = arrayList.get(i7);
                    n nVar = (n) obj2;
                    n nVar2 = (n) obj;
                    arrayList2.add(new g0.c(AbstractC0832b.e(Math.abs(g0.c.d(nVar2.e().a()) - g0.c.d(nVar.e().a())), Math.abs(g0.c.e(nVar2.e().a()) - g0.c.e(nVar.e().a())))));
                    obj = obj2;
                }
            }
            if (arrayList2.size() == 1) {
                j7 = ((g0.c) P3.q.r0(arrayList2)).a;
            } else {
                if (arrayList2.isEmpty()) {
                    throw new UnsupportedOperationException("Empty collection can't be reduced.");
                }
                Object objR0 = P3.q.r0(arrayList2);
                int iY2 = P3.r.y(arrayList2);
                if (1 <= iY2) {
                    int i8 = 1;
                    while (true) {
                        objR0 = new g0.c(g0.c.h(((g0.c) objR0).a, ((g0.c) arrayList2.get(i8)).a));
                        if (i8 == iY2) {
                            break;
                        }
                        i8++;
                    }
                }
                j7 = ((g0.c) objR0).a;
            }
            if (g0.c.e(j7) >= g0.c.d(j7)) {
                return false;
            }
        }
        return true;
    }

    public static final ArrayList k(List list, List list2, InterfaceC2112s interfaceC2112s) {
        l.f("oldValueParameters", list2);
        list.size();
        list2.size();
        ArrayList arrayListZ0 = P3.q.Z0(list, list2);
        ArrayList arrayList = new ArrayList(P3.r.p(arrayListZ0, 10));
        Iterator it = arrayListZ0.iterator();
        while (it.hasNext()) {
            O3.l lVar = (O3.l) it.next();
            AbstractC1586x abstractC1586x = (AbstractC1586x) lVar.f7528k;
            C2272S c2272s = (C2272S) lVar.f7529l;
            int i7 = c2272s.f17408p;
            h annotations = c2272s.getAnnotations();
            W4.e name = c2272s.getName();
            l.e("getName(...)", name);
            boolean zO0 = c2272s.O0();
            AbstractC1586x abstractC1586xF = c2272s.f17412t != null ? d5.e.j(interfaceC2112s).d().f(abstractC1586x) : null;
            M mL = c2272s.l();
            l.e("getSource(...)", mL);
            arrayList.add(new C2272S(interfaceC2112s, null, i7, annotations, name, abstractC1586x, zO0, c2272s.f17410r, c2272s.f17411s, abstractC1586xF, mL));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final h0.C0985h l(e0.C0811c r22, float r23) {
        /*
            r0 = r22
            r3 = r23
            double r1 = (double) r3
            double r1 = java.lang.Math.ceil(r1)
            float r1 = (float) r1
            int r1 = (int) r1
            int r1 = r1 * 2
            h0.h r2 = P3.F.a
            h0.d r4 = P3.F.f7742b
            j0.b r5 = P3.F.f7743c
            if (r2 == 0) goto L29
            if (r4 == 0) goto L29
            android.graphics.Bitmap r6 = r2.a
            int r7 = r6.getWidth()
            if (r1 > r7) goto L29
            int r6 = r6.getHeight()
            if (r1 <= r6) goto L26
            goto L29
        L26:
            r7 = r2
            r8 = r4
            goto L37
        L29:
            r2 = 1
            h0.h r2 = h0.AbstractC0968M.f(r1, r1, r2)
            P3.F.a = r2
            h0.d r4 = h0.AbstractC0968M.a(r2)
            P3.F.f7742b = r4
            goto L26
        L37:
            if (r5 != 0) goto L40
            j0.b r5 = new j0.b
            r5.<init>()
            P3.F.f7743c = r5
        L40:
            r9 = r5
            e0.a r1 = r0.f11335k
            T0.k r1 = r1.getLayoutDirection()
            android.graphics.Bitmap r2 = r7.a
            int r4 = r2.getWidth()
            float r4 = (float) r4
            int r2 = r2.getHeight()
            float r2 = (float) r2
            long r4 = f1.AbstractC0870c.F(r4, r2)
            j0.a r2 = r9.f12204k
            T0.b r6 = r2.a
            T0.k r10 = r2.f12201b
            h0.r r11 = r2.f12202c
            long r12 = r2.f12203d
            r2.a = r0
            r2.f12201b = r1
            r2.f12202c = r8
            r2.f12203d = r4
            r8.l()
            r0 = r10
            r1 = r11
            long r10 = h0.C0998u.f11829b
            long r14 = r9.d()
            r4 = r12
            r12 = 0
            r16 = 0
            r17 = 58
            j0.InterfaceC1298d.R(r9, r10, r12, r14, r16, r17)
            r18 = 4278190080(0xff000000, double:2.113706745E-314)
            long r10 = h0.AbstractC0968M.d(r18)
            long r14 = f1.AbstractC0870c.F(r3, r3)
            r17 = 120(0x78, float:1.68E-43)
            j0.InterfaceC1298d.R(r9, r10, r12, r14, r16, r17)
            long r10 = h0.AbstractC0968M.d(r18)
            r12 = r4
            long r4 = e5.AbstractC0832b.e(r3, r3)
            r14 = r6
            r6 = 120(0x78, float:1.68E-43)
            r20 = r10
            r10 = r0
            r11 = r1
            r0 = r9
            r9 = r2
            r1 = r20
            j0.InterfaceC1298d.u(r0, r1, r3, r4, r6)
            r8.i()
            r9.a = r14
            r9.f12201b = r10
            r9.f12202c = r11
            r9.f12203d = r12
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.b.l(e0.c, float):h0.h");
    }

    public static Map m(T4.i iVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = iVar.f9111k.iterator();
        while (it.hasNext()) {
            String target_id = ((LikeRow) it.next()).getTarget_id();
            Object vVar = linkedHashMap.get(target_id);
            if (vVar == null && !linkedHashMap.containsKey(target_id)) {
                vVar = new v();
            }
            v vVar2 = (v) vVar;
            vVar2.f12718k++;
            linkedHashMap.put(target_id, vVar2);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            l.d("null cannot be cast to non-null type kotlin.collections.MutableMap.MutableEntry<K of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace, R of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace>", entry);
            if ((entry instanceof InterfaceC0881a) && !(entry instanceof InterfaceC0884d)) {
                kotlin.jvm.internal.B.j("kotlin.collections.MutableMap.MutableEntry", entry);
                throw null;
            }
            entry.setValue(Integer.valueOf(((v) entry.getValue()).f12718k));
        }
        return kotlin.jvm.internal.B.c(linkedHashMap);
    }

    public static String n(List list, String str, M0.B b4, int i7) {
        if ((i7 & 1) != 0) {
            str = ", ";
        }
        if ((i7 & 32) != 0) {
            b4 = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int size = list.size();
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            Object obj = list.get(i9);
            i8++;
            if (i8 > 1) {
                sb.append((CharSequence) str);
            }
            if (b4 != null) {
                c0.e(obj);
                throw null;
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb.append(((Character) obj).charValue());
            } else {
                sb.append((CharSequence) String.valueOf(obj));
            }
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static final int o(int i7, List list) {
        int i8 = ((H0.p) P3.q.A0(list)).f3138c;
        if (i7 > ((H0.p) P3.q.A0(list)).f3138c) {
            throw new IllegalArgumentException(A6.b.e(i7, i8, "Index ", " should be less or equal than last line's end ").toString());
        }
        int size = list.size() - 1;
        int i9 = 0;
        while (i9 <= size) {
            int i10 = (i9 + size) >>> 1;
            H0.p pVar = (H0.p) list.get(i10);
            char c2 = pVar.f3137b > i7 ? (char) 1 : pVar.f3138c <= i7 ? (char) 65535 : (char) 0;
            if (c2 < 0) {
                i9 = i10 + 1;
            } else {
                if (c2 <= 0) {
                    return i10;
                }
                size = i10 - 1;
            }
        }
        return -(i9 + 1);
    }

    public static final int p(int i7, ArrayList arrayList) {
        int size = arrayList.size() - 1;
        int i8 = 0;
        while (i8 <= size) {
            int i9 = (i8 + size) >>> 1;
            H0.p pVar = (H0.p) arrayList.get(i9);
            char c2 = pVar.f3139d > i7 ? (char) 1 : pVar.f3140e <= i7 ? (char) 65535 : (char) 0;
            if (c2 < 0) {
                i8 = i9 + 1;
            } else {
                if (c2 <= 0) {
                    return i9;
                }
                size = i9 - 1;
            }
        }
        return -(i8 + 1);
    }

    public static final int q(ArrayList arrayList, float f5) {
        if (f5 <= 0.0f) {
            return 0;
        }
        if (f5 >= ((H0.p) P3.q.A0(arrayList)).f3142g) {
            return P3.r.y(arrayList);
        }
        int size = arrayList.size() - 1;
        int i7 = 0;
        while (i7 <= size) {
            int i8 = (i7 + size) >>> 1;
            H0.p pVar = (H0.p) arrayList.get(i8);
            char c2 = pVar.f3141f > f5 ? (char) 1 : pVar.f3142g <= f5 ? (char) 65535 : (char) 0;
            if (c2 < 0) {
                i7 = i8 + 1;
            } else {
                if (c2 <= 0) {
                    return i8;
                }
                size = i8 - 1;
            }
        }
        return -(i7 + 1);
    }

    public static final void r(ArrayList arrayList, long j7, e4.k kVar) {
        int size = arrayList.size();
        for (int iO = o(H0.H.e(j7), arrayList); iO < size; iO++) {
            H0.p pVar = (H0.p) arrayList.get(iO);
            if (pVar.f3137b >= H0.H.d(j7)) {
                return;
            }
            if (pVar.f3137b != pVar.f3138c) {
                kVar.invoke(pVar);
            }
        }
    }

    public static W4.b s(String str, boolean z7) {
        String strR;
        l.f("string", str);
        int iD0 = AbstractC2510o.d0(str, '`', 0, 6);
        if (iD0 == -1) {
            iD0 = str.length();
        }
        int iI0 = AbstractC2510o.i0(iD0, 4, str, "/");
        String str2 = "";
        if (iI0 == -1) {
            strR = AbstractC2517v.R(str, "`", "");
        } else {
            String strSubstring = str.substring(0, iI0);
            l.e("substring(...)", strSubstring);
            String strQ = AbstractC2517v.Q(strSubstring, '/', '.');
            String strSubstring2 = str.substring(iI0 + 1);
            l.e("substring(...)", strSubstring2);
            strR = AbstractC2517v.R(strSubstring2, "`", "");
            str2 = strQ;
        }
        return new W4.b(new W4.c(str2), new W4.c(strR), z7);
    }

    public static final L2.f t(View view) {
        l.f("<this>", view);
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_saved_state_registry_owner);
            L2.f fVar = tag instanceof L2.f ? (L2.f) tag : null;
            if (fVar != null) {
                return fVar;
            }
            Object objQ = AbstractC0905c.q(view);
            view = objQ instanceof View ? (View) objQ : null;
        }
        return null;
    }

    public static final C1538e u() {
        C1538e c1538e = f10533b;
        if (c1538e != null) {
            return c1538e;
        }
        C1537d c1537d = new C1537d("Filled.CalendarMonth", false);
        int i7 = AbstractC1530A.a;
        C0975U c0975u = new C0975U(C0998u.f11829b);
        S s7 = new S(7, false);
        s7.u(19.0f, 4.0f);
        s7.r(-1.0f);
        s7.z(2.0f);
        s7.r(-2.0f);
        s7.A(2.0f);
        s7.q(8.0f);
        s7.z(2.0f);
        s7.q(6.0f);
        s7.A(2.0f);
        s7.q(5.0f);
        s7.n(3.89f, 4.0f, 3.01f, 4.9f, 3.01f, 6.0f);
        s7.s(3.0f, 20.0f);
        s7.o(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        s7.r(14.0f);
        s7.o(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        s7.z(6.0f);
        s7.n(21.0f, 4.9f, 20.1f, 4.0f, 19.0f, 4.0f);
        s7.m();
        s7.u(19.0f, 20.0f);
        s7.q(5.0f);
        s7.z(10.0f);
        s7.r(14.0f);
        s7.z(20.0f);
        s7.m();
        s7.u(9.0f, 14.0f);
        s7.q(7.0f);
        s7.A(-2.0f);
        s7.r(2.0f);
        s7.z(14.0f);
        s7.m();
        s7.u(13.0f, 14.0f);
        s7.r(-2.0f);
        s7.A(-2.0f);
        s7.r(2.0f);
        s7.z(14.0f);
        s7.m();
        s7.u(17.0f, 14.0f);
        s7.r(-2.0f);
        s7.A(-2.0f);
        s7.r(2.0f);
        s7.z(14.0f);
        s7.m();
        s7.u(9.0f, 18.0f);
        s7.q(7.0f);
        s7.A(-2.0f);
        s7.r(2.0f);
        s7.z(18.0f);
        s7.m();
        s7.u(13.0f, 18.0f);
        s7.r(-2.0f);
        s7.A(-2.0f);
        s7.r(2.0f);
        s7.z(18.0f);
        s7.m();
        s7.u(17.0f, 18.0f);
        s7.r(-2.0f);
        s7.A(-2.0f);
        s7.r(2.0f);
        s7.z(18.0f);
        s7.m();
        C1537d.a(c1537d, s7.f1530k, c0975u);
        C1538e c1538eB = c1537d.b();
        f10533b = c1538eB;
        return c1538eB;
    }

    public static final String v(g gVar, int i7) {
        l.f("<this>", gVar);
        String strC = gVar.c(i7);
        return gVar.b(i7) ? AbstractC0703b.i(".", strC) : strC;
    }

    public static final Object w(AbstractC0615l abstractC0615l, C0617n c0617n) {
        l.f("<this>", abstractC0615l);
        l.f("extension", c0617n);
        if (abstractC0615l.l(c0617n)) {
            return abstractC0615l.k(c0617n);
        }
        return null;
    }

    public static final Object x(AbstractC0615l abstractC0615l, C0617n c0617n, int i7) {
        l.f("<this>", abstractC0615l);
        l.f("extension", c0617n);
        abstractC0615l.o(c0617n);
        C0612i c0612i = abstractC0615l.f9899k;
        c0612i.getClass();
        C0616m c0616m = c0617n.f9905d;
        if (!c0616m.f9902m) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        X4.C c2 = c0612i.a;
        Object obj = c2.get(c0616m);
        if (i7 >= (obj == null ? 0 : ((List) obj).size())) {
            return null;
        }
        abstractC0615l.o(c0617n);
        if (!c0616m.f9902m) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object obj2 = c2.get(c0616m);
        if (obj2 != null) {
            return c0617n.a(((List) obj2).get(i7));
        }
        throw new IndexOutOfBoundsException();
    }

    public static final L4.C y(InterfaceC2099e interfaceC2099e) {
        InterfaceC2099e interfaceC2099e2;
        InterfaceC2102h interfaceC2102hF;
        l.f("<this>", interfaceC2099e);
        int i7 = d5.e.a;
        Iterator it = interfaceC2099e.g().t0().g().iterator();
        while (true) {
            if (!it.hasNext()) {
                interfaceC2099e2 = null;
                break;
            }
            AbstractC1586x abstractC1586x = (AbstractC1586x) it.next();
            if (!AbstractC1880i.x(abstractC1586x)) {
                interfaceC2102hF = abstractC1586x.t0().f();
                int i8 = Z4.e.a;
                if (Z4.e.m(interfaceC2102hF, EnumC2100f.f16311k) || Z4.e.m(interfaceC2102hF, EnumC2100f.f16313m)) {
                    break;
                }
            }
        }
        l.d("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor", interfaceC2102hF);
        interfaceC2099e2 = (InterfaceC2099e) interfaceC2102hF;
        if (interfaceC2099e2 == null) {
            return null;
        }
        o oVarC0 = interfaceC2099e2.c0();
        L4.C c2 = oVarC0 instanceof L4.C ? (L4.C) oVarC0 : null;
        return c2 == null ? y(interfaceC2099e2) : c2;
    }

    public static final C1538e z() {
        C1538e c1538e = f10536e;
        if (c1538e != null) {
            return c1538e;
        }
        C1537d c1537d = new C1537d("Filled.Refresh", false);
        int i7 = AbstractC1530A.a;
        C0975U c0975u = new C0975U(C0998u.f11829b);
        S s7 = new S(7, false);
        s7.u(17.65f, 6.35f);
        s7.n(16.2f, 4.9f, 14.21f, 4.0f, 12.0f, 4.0f);
        s7.o(-4.42f, 0.0f, -7.99f, 3.58f, -7.99f, 8.0f);
        s7.w(3.57f, 8.0f, 7.99f, 8.0f);
        s7.o(3.73f, 0.0f, 6.84f, -2.55f, 7.73f, -6.0f);
        s7.r(-2.08f);
        s7.o(-0.82f, 2.33f, -3.04f, 4.0f, -5.65f, 4.0f);
        s7.o(-3.31f, 0.0f, -6.0f, -2.69f, -6.0f, -6.0f);
        s7.w(2.69f, -6.0f, 6.0f, -6.0f);
        s7.o(1.66f, 0.0f, 3.14f, 0.69f, 4.22f, 1.78f);
        s7.s(13.0f, 11.0f);
        s7.r(7.0f);
        s7.z(4.0f);
        s7.t(-2.35f, 2.35f);
        s7.m();
        C1537d.a(c1537d, s7.f1530k, c0975u);
        C1538e c1538eB = c1537d.b();
        f10536e = c1538eB;
        return c1538eB;
    }
}
