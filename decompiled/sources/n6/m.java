package n6;

import A4.AbstractC0011d;
import A4.C0012e;
import D.G;
import D4.S;
import F0.q;
import F0.t;
import G2.C0174k;
import H.M;
import H0.E;
import H0.F;
import H2.p;
import K2.AbstractC0319x;
import M0.u;
import O.C0486d;
import O.C0502l;
import O.C0509o0;
import O.C0510p;
import O.Z;
import P3.r;
import R4.J;
import X4.C0611h;
import X4.C0617n;
import Z5.AbstractC0625b;
import Z5.AbstractC0632e0;
import Z5.C0626b0;
import Z5.C0629d;
import Z5.H;
import a1.C0659c;
import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Process;
import android.os.Trace;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.util.Log;
import android.view.View;
import androidx.lifecycle.EnumC0689p;
import androidx.lifecycle.x;
import b1.AbstractC0703b;
import e4.InterfaceC0821a;
import f6.AbstractC0905c;
import g3.ComponentCallbacks2C0951j;
import h0.AbstractC0968M;
import h0.C0975U;
import h0.C0998u;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.jvm.internal.InterfaceC1404d;
import kotlin.jvm.internal.y;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import l4.InterfaceC1425d;
import n0.AbstractC1530A;
import n0.C1537d;
import n0.C1538e;
import n0.C1541h;
import n0.C1544k;
import n0.C1545l;
import n0.C1550q;
import u4.InterfaceC2096b;
import u4.InterfaceC2112s;
import w0.X;
import x4.C2272S;
import y0.Y;
import z0.AbstractC2478x0;
import z0.O;

/* loaded from: classes.dex */
public abstract class m {
    public static C1538e a;

    /* renamed from: b, reason: collision with root package name */
    public static C1538e f13450b;

    /* renamed from: c, reason: collision with root package name */
    public static C1538e f13451c;

    /* renamed from: d, reason: collision with root package name */
    public static C1538e f13452d;

    /* renamed from: e, reason: collision with root package name */
    public static C1538e f13453e;

    /* renamed from: f, reason: collision with root package name */
    public static C1538e f13454f;

    /* renamed from: g, reason: collision with root package name */
    public static long f13455g;

    /* renamed from: h, reason: collision with root package name */
    public static Method f13456h;

    public static final int A(u uVar, int i7) {
        boolean z7 = uVar.compareTo(u.f6414n) >= 0;
        boolean z8 = i7 == 1;
        if (z8 && z7) {
            return 3;
        }
        if (z7) {
            return 1;
        }
        return z8 ? 2 : 0;
    }

    public static final InterfaceC1425d B(Annotation annotation) {
        kotlin.jvm.internal.l.f("<this>", annotation);
        Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
        kotlin.jvm.internal.l.e("annotationType(...)", clsAnnotationType);
        return I(clsAnnotationType);
    }

    public static final ArrayList C(Annotation[] annotationArr) {
        kotlin.jvm.internal.l.f("<this>", annotationArr);
        ArrayList arrayList = new ArrayList(annotationArr.length);
        for (Annotation annotation : annotationArr) {
            arrayList.add(new C0012e(annotation));
        }
        return arrayList;
    }

    public static final C1538e D() {
        C1538e c1538e = f13450b;
        if (c1538e != null) {
            return c1538e;
        }
        C1537d c1537d = new C1537d("Filled.Check", false);
        int i7 = AbstractC1530A.a;
        C0975U c0975u = new C0975U(C0998u.f11829b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new C1545l(9.0f, 16.17f));
        arrayList.add(new C1544k(4.83f, 12.0f));
        arrayList.add(new C1550q(-1.42f, 1.41f));
        arrayList.add(new C1544k(9.0f, 19.0f));
        arrayList.add(new C1544k(21.0f, 7.0f));
        arrayList.add(new C1550q(-1.41f, -1.41f));
        arrayList.add(C1541h.f13175b);
        C1537d.a(c1537d, arrayList, c0975u);
        C1538e c1538eB = c1537d.b();
        f13450b = c1538eB;
        return c1538eB;
    }

    public static final C1538e E() {
        C1538e c1538e = f13451c;
        if (c1538e != null) {
            return c1538e;
        }
        C1537d c1537d = new C1537d("Filled.Favorite", false);
        int i7 = AbstractC1530A.a;
        C0975U c0975u = new C0975U(C0998u.f11829b);
        S s7 = new S(7, false);
        s7.u(12.0f, 21.35f);
        s7.t(-1.45f, -1.32f);
        s7.n(5.4f, 15.36f, 2.0f, 12.28f, 2.0f, 8.5f);
        s7.n(2.0f, 5.42f, 4.42f, 3.0f, 7.5f, 3.0f);
        s7.o(1.74f, 0.0f, 3.41f, 0.81f, 4.5f, 2.09f);
        s7.n(13.09f, 3.81f, 14.76f, 3.0f, 16.5f, 3.0f);
        s7.n(19.58f, 3.0f, 22.0f, 5.42f, 22.0f, 8.5f);
        s7.o(0.0f, 3.78f, -3.4f, 6.86f, -8.55f, 11.54f);
        s7.s(12.0f, 21.35f);
        s7.m();
        C1537d.a(c1537d, s7.f1530k, c0975u);
        C1538e c1538eB = c1537d.b();
        f13451c = c1538eB;
        return c1538eB;
    }

    public static final Class F(InterfaceC1425d interfaceC1425d) {
        kotlin.jvm.internal.l.f("<this>", interfaceC1425d);
        Class clsD = ((InterfaceC1404d) interfaceC1425d).d();
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>", clsD);
        return clsD;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class G(InterfaceC1425d interfaceC1425d) {
        kotlin.jvm.internal.l.f("<this>", interfaceC1425d);
        Class clsD = ((InterfaceC1404d) interfaceC1425d).d();
        if (!clsD.isPrimitive()) {
            return clsD;
        }
        String name = clsD.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (!name.equals("double")) {
                }
                break;
            case 104431:
                if (!name.equals("int")) {
                }
                break;
            case 3039496:
                if (!name.equals("byte")) {
                }
                break;
            case 3052374:
                if (!name.equals("char")) {
                }
                break;
            case 3327612:
                if (!name.equals("long")) {
                }
                break;
            case 3625364:
                if (!name.equals("void")) {
                }
                break;
            case 64711720:
                if (!name.equals("boolean")) {
                }
                break;
            case 97526364:
                if (!name.equals("float")) {
                }
                break;
            case 109413500:
                if (!name.equals("short")) {
                }
                break;
        }
        return clsD;
    }

    public static final Class H(InterfaceC1425d interfaceC1425d) {
        kotlin.jvm.internal.l.f("<this>", interfaceC1425d);
        Class clsD = ((InterfaceC1404d) interfaceC1425d).d();
        if (clsD.isPrimitive()) {
            return clsD;
        }
        String name = clsD.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    return Integer.TYPE;
                }
                return null;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return Float.TYPE;
                }
                return null;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return Short.TYPE;
                }
                return null;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return Character.TYPE;
                }
                return null;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return Boolean.TYPE;
                }
                return null;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return Byte.TYPE;
                }
                return null;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return Long.TYPE;
                }
                return null;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return Void.TYPE;
                }
                return null;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return Double.TYPE;
                }
                return null;
            default:
                return null;
        }
    }

    public static final InterfaceC1425d I(Class cls) {
        kotlin.jvm.internal.l.f("<this>", cls);
        return y.a.b(cls);
    }

    public static final C1538e J() {
        C1538e c1538e = f13452d;
        if (c1538e != null) {
            return c1538e;
        }
        C1537d c1537d = new C1537d("Filled.Movie", false);
        int i7 = AbstractC1530A.a;
        C0975U c0975u = new C0975U(C0998u.f11829b);
        S s7 = new S(7, false);
        s7.u(18.0f, 4.0f);
        s7.t(2.0f, 4.0f);
        s7.r(-3.0f);
        s7.t(-2.0f, -4.0f);
        s7.r(-2.0f);
        s7.t(2.0f, 4.0f);
        s7.r(-3.0f);
        s7.t(-2.0f, -4.0f);
        s7.q(8.0f);
        s7.t(2.0f, 4.0f);
        s7.q(7.0f);
        s7.s(5.0f, 4.0f);
        s7.q(4.0f);
        s7.o(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        s7.s(2.0f, 18.0f);
        s7.o(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        s7.r(16.0f);
        s7.o(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        s7.z(4.0f);
        s7.r(-4.0f);
        s7.m();
        C1537d.a(c1537d, s7.f1530k, c0975u);
        C1538e c1538eB = c1537d.b();
        f13452d = c1538eB;
        return c1538eB;
    }

    public static final KSerializer K(KSerializer kSerializer) {
        kotlin.jvm.internal.l.f("<this>", kSerializer);
        return kSerializer.getDescriptor().h() ? kSerializer : new C0626b0(kSerializer);
    }

    public static final P4.o L(J j7, T4.g gVar, T4.i iVar, boolean z7, boolean z8, boolean z9) {
        kotlin.jvm.internal.l.f("proto", j7);
        kotlin.jvm.internal.l.f("nameResolver", gVar);
        C0617n c0617n = U4.j.f9300d;
        kotlin.jvm.internal.l.e("propertySignature", c0617n);
        U4.d dVar = (U4.d) android.support.v4.media.session.b.w(j7, c0617n);
        if (dVar != null) {
            if (z7) {
                C0611h c0611h = V4.g.a;
                V4.d dVarB = V4.g.b(j7, gVar, iVar, z9);
                if (dVarB != null) {
                    return r.u(dVarB);
                }
            } else if (z8 && (dVar.f9253l & 2) == 2) {
                U4.c cVar = dVar.f9255n;
                kotlin.jvm.internal.l.e("getSyntheticMethod(...)", cVar);
                return new P4.o(gVar.a(cVar.f9246m).concat(gVar.a(cVar.f9247n)));
            }
        }
        return null;
    }

    public static final C1538e N() {
        C1538e c1538e = f13453e;
        if (c1538e != null) {
            return c1538e;
        }
        C1537d c1537d = new C1537d("Filled.Star", false);
        int i7 = AbstractC1530A.a;
        C0975U c0975u = new C0975U(C0998u.f11829b);
        S s7 = new S(7, false);
        s7.u(12.0f, 17.27f);
        s7.s(18.18f, 21.0f);
        s7.t(-1.64f, -7.03f);
        s7.s(22.0f, 9.24f);
        s7.t(-7.19f, -0.61f);
        s7.s(12.0f, 2.0f);
        s7.s(9.19f, 8.63f);
        s7.s(2.0f, 9.24f);
        s7.t(5.46f, 4.73f);
        s7.s(5.82f, 21.0f);
        s7.m();
        C1537d.a(c1537d, s7.f1530k, c0975u);
        C1538e c1538eB = c1537d.b();
        f13453e = c1538eB;
        return c1538eB;
    }

    public static final S0.h O(F f5, int i7) {
        E e7 = f5.a;
        if (e7.a.a.length() != 0) {
            int iE = f5.e(i7);
            if ((i7 != 0 && iE == f5.e(i7 - 1)) || (i7 != e7.a.a.length() && iE == f5.e(i7 + 1))) {
                return f5.a(i7);
            }
        }
        return f5.i(i7);
    }

    public static final C1538e P() {
        C1538e c1538e = f13454f;
        if (c1538e != null) {
            return c1538e;
        }
        C1537d c1537d = new C1537d("Filled.Tune", false);
        int i7 = AbstractC1530A.a;
        C0975U c0975u = new C0975U(C0998u.f11829b);
        S s7 = new S(7, false);
        s7.u(3.0f, 17.0f);
        s7.A(2.0f);
        s7.r(6.0f);
        s7.A(-2.0f);
        s7.s(3.0f, 17.0f);
        s7.m();
        s7.u(3.0f, 5.0f);
        s7.A(2.0f);
        s7.r(10.0f);
        s7.s(13.0f, 5.0f);
        s7.s(3.0f, 5.0f);
        s7.m();
        s7.u(13.0f, 21.0f);
        s7.A(-2.0f);
        s7.r(8.0f);
        s7.A(-2.0f);
        s7.r(-8.0f);
        s7.A(-2.0f);
        s7.r(-2.0f);
        s7.A(6.0f);
        s7.r(2.0f);
        s7.m();
        s7.u(7.0f, 9.0f);
        s7.A(2.0f);
        s7.s(3.0f, 11.0f);
        s7.A(2.0f);
        s7.r(4.0f);
        s7.A(2.0f);
        s7.r(2.0f);
        s7.s(9.0f, 9.0f);
        s7.s(7.0f, 9.0f);
        s7.m();
        s7.u(21.0f, 13.0f);
        s7.A(-2.0f);
        s7.s(11.0f, 11.0f);
        s7.A(2.0f);
        s7.r(10.0f);
        s7.m();
        s7.u(15.0f, 9.0f);
        s7.r(2.0f);
        s7.s(17.0f, 7.0f);
        s7.r(4.0f);
        s7.s(21.0f, 5.0f);
        s7.r(-4.0f);
        s7.s(17.0f, 3.0f);
        s7.r(-2.0f);
        s7.A(6.0f);
        s7.m();
        C1537d.a(c1537d, s7.f1530k, c0975u);
        C1538e c1538eB = c1537d.b();
        f13454f = c1538eB;
        return c1538eB;
    }

    public static final int Q(int i7, int i8) {
        return (i7 >> i8) & 31;
    }

    public static boolean R() {
        if (Build.VERSION.SDK_INT >= 29) {
            return O2.a.a();
        }
        try {
            if (f13456h == null) {
                f13455g = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f13456h = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f13456h.invoke(null, Long.valueOf(f13455g))).booleanValue();
        } catch (Exception e7) {
            if (!(e7 instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e7);
                return false;
            }
            Throwable cause = e7.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0113, code lost:
    
        if (d5.e.g(r0).equals(d5.e.g(r2)) == false) goto L51;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static P4.k S(u4.InterfaceC2112s r8, x4.C2272S r9) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n6.m.S(u4.s, x4.S):P4.k");
    }

    public static final float V(long j7, float f5, T0.b bVar) {
        float fC;
        long jB = T0.m.b(j7);
        if (T0.n.a(jB, 4294967296L)) {
            if (bVar.n() <= 1.05d) {
                return bVar.d0(j7);
            }
            fC = T0.m.c(j7) / T0.m.c(bVar.k0(f5));
        } else {
            if (!T0.n.a(jB, 8589934592L)) {
                return Float.NaN;
            }
            fC = T0.m.c(j7);
        }
        return fC * f5;
    }

    public static final void W(Spannable spannable, long j7, int i7, int i8) {
        if (j7 != 16) {
            spannable.setSpan(new ForegroundColorSpan(AbstractC0968M.w(j7)), i7, i8, 33);
        }
    }

    public static final void X(Spannable spannable, long j7, T0.b bVar, int i7, int i8) {
        long jB = T0.m.b(j7);
        if (T0.n.a(jB, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(P3.F.W(bVar.d0(j7)), false), i7, i8, 33);
        } else if (T0.n.a(jB, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(T0.m.c(j7)), i7, i8, 33);
        }
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [e4.a, kotlin.jvm.internal.m] */
    public static final void Y(F0.n nVar, int i7, E0.k kVar) {
        F0.n nVar2;
        Q.d dVar = new Q.d(new F0.n[16]);
        List listG = nVar.g(false, false);
        while (true) {
            dVar.d(dVar.f7829m, listG);
            while (dVar.l()) {
                nVar2 = (F0.n) dVar.n(dVar.f7829m - 1);
                if (O.x(nVar2)) {
                    t tVar = q.f2136i;
                    F0.i iVar = nVar2.f2104d;
                    LinkedHashMap linkedHashMap = iVar.f2096k;
                    if (linkedHashMap.containsKey(tVar)) {
                        continue;
                    } else {
                        Y yC = nVar2.c();
                        if (yC == null) {
                            AbstractC0905c.D("Expected semantics node to have a coordinator.");
                            throw null;
                        }
                        g0.d dVarE = X.e(yC);
                        int iRound = Math.round(dVarE.a);
                        int iRound2 = Math.round(dVarE.f11659b);
                        int iRound3 = Math.round(dVarE.f11660c);
                        int iRound4 = Math.round(dVarE.f11661d);
                        T0.i iVar2 = new T0.i(iRound, iRound2, iRound3, iRound4);
                        if (iRound < iRound3 && iRound2 < iRound4) {
                            Object obj = iVar.f2096k.get(F0.h.f2074e);
                            if (obj == null) {
                                obj = null;
                            }
                            e4.n nVar3 = (e4.n) obj;
                            Object obj2 = linkedHashMap.get(q.f2143p);
                            F0.g gVar = (F0.g) (obj2 != null ? obj2 : null);
                            if (nVar3 == null || gVar == null || ((Number) gVar.f2069b.invoke()).floatValue() <= 0.0f) {
                                break;
                            }
                            int i8 = i7 + 1;
                            kVar.invoke(new E0.m(nVar2, i8, iVar2, yC));
                            Y(nVar2, i8, kVar);
                        }
                    }
                }
            }
            return;
            listG = nVar2.g(false, false);
        }
    }

    public static final T0.d a(Context context) {
        float f5 = context.getResources().getConfiguration().fontScale;
        float f7 = context.getResources().getDisplayMetrics().density;
        U0.a aVarA = U0.b.a(f5);
        if (aVarA == null) {
            aVarA = new T0.l(f5);
        }
        return new T0.d(f7, f5, aVarA);
    }

    public static final void b(p pVar, C0510p c0510p, int i7) {
        c0510p.T(294589392);
        int i8 = i7 | (c0510p.f(pVar) ? 4 : 2);
        if ((i8 & 3) == 2 && c0510p.y()) {
            c0510p.M();
        } else {
            X.g gVarS = r.S(c0510p);
            Z zV = C0486d.v(pVar.b().f2723e, c0510p);
            List list = (List) zV.getValue();
            boolean zBooleanValue = ((Boolean) c0510p.k(AbstractC2478x0.a)).booleanValue();
            boolean zF = c0510p.f(list);
            Object objH = c0510p.H();
            Object obj = C0502l.a;
            Object obj2 = objH;
            if (zF || objH == obj) {
                Y.r rVar = new Y.r();
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    C0174k c0174k = (C0174k) obj3;
                    if (zBooleanValue || c0174k.f2709r.f10744c.compareTo(EnumC0689p.f10739n) >= 0) {
                        arrayList.add(obj3);
                    }
                }
                rVar.addAll(arrayList);
                c0510p.b0(rVar);
                obj2 = rVar;
            }
            Y.r rVar2 = (Y.r) obj2;
            f(rVar2, (List) zV.getValue(), c0510p, 0);
            Z zV2 = C0486d.v(pVar.b().f2724f, c0510p);
            Object objH2 = c0510p.H();
            if (objH2 == obj) {
                objH2 = new Y.r();
                c0510p.b0(objH2);
            }
            Y.r rVar3 = (Y.r) objH2;
            c0510p.R(1361037007);
            ListIterator listIterator = rVar2.listIterator();
            while (true) {
                Q3.a aVar = (Q3.a) listIterator;
                if (!aVar.hasNext()) {
                    break;
                }
                C0174k c0174k2 = (C0174k) aVar.next();
                G2.y yVar = c0174k2.f2703l;
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.navigation.compose.DialogNavigator.Destination", yVar);
                H2.o oVar = (H2.o) yVar;
                boolean zH = ((i8 & 14) == 4) | c0510p.h(c0174k2);
                Object objH3 = c0510p.H();
                if (zH || objH3 == obj) {
                    objH3 = new A.m(5, pVar, c0174k2);
                    c0510p.b0(objH3);
                }
                android.support.v4.media.session.b.a((InterfaceC0821a) objH3, oVar.f3632s, W.f.b(1129586364, new H2.l(c0174k2, pVar, gVarS, rVar3, oVar, 0), c0510p), c0510p, 384);
            }
            c0510p.p(false);
            Set set = (Set) zV2.getValue();
            boolean zF2 = c0510p.f(zV2) | ((i8 & 14) == 4);
            Object objH4 = c0510p.H();
            if (zF2 || objH4 == obj) {
                objH4 = new H2.m(zV2, pVar, rVar3, null);
                c0510p.b0(objH4);
            }
            C0486d.f(set, rVar3, (e4.n) objH4, c0510p);
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new D.S(i7, 3, pVar);
        }
    }

    public static final C0629d c(KSerializer kSerializer) {
        kotlin.jvm.internal.l.f("elementSerializer", kSerializer);
        return new C0629d(kSerializer, 0);
    }

    public static final H d(KSerializer kSerializer, KSerializer kSerializer2) {
        kotlin.jvm.internal.l.f("keySerializer", kSerializer);
        kotlin.jvm.internal.l.f("valueSerializer", kSerializer2);
        return new H(kSerializer, kSerializer2, 1);
    }

    public static final c3.e e(Context context, ComponentCallbacks2C0951j componentCallbacks2C0951j) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(ConnectivityManager.class);
        if (connectivityManager != null) {
            if (((Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", "android.permission.ACCESS_NETWORK_STATE")) ? context.checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) : new C0659c(context).a.areNotificationsEnabled() ? 0 : -1) == 0) {
                try {
                    return new B2.l(connectivityManager, componentCallbacks2C0951j);
                } catch (Exception unused) {
                    return new R1.i(16);
                }
            }
        }
        return new R1.i(16);
    }

    public static final void f(Y.r rVar, List list, C0510p c0510p, int i7) {
        c0510p.T(1537894851);
        if ((((c0510p.h(rVar) ? 4 : 2) | i7 | (c0510p.h(list) ? 32 : 16)) & 19) == 18 && c0510p.y()) {
            c0510p.M();
        } else {
            boolean zBooleanValue = ((Boolean) c0510p.k(AbstractC2478x0.a)).booleanValue();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C0174k c0174k = (C0174k) it.next();
                x xVar = c0174k.f2709r;
                boolean zG = c0510p.g(zBooleanValue) | c0510p.h(rVar) | c0510p.h(c0174k);
                Object objH = c0510p.H();
                if (zG || objH == C0502l.a) {
                    objH = new G(c0174k, rVar, zBooleanValue);
                    c0510p.b0(objH);
                }
                C0486d.c(xVar, (e4.k) objH, c0510p);
            }
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new M(i7, 2, rVar, list);
        }
    }

    public static final long g(float f5, float f7) {
        return (Float.floatToRawIntBits(f7) & 4294967295L) | (Float.floatToRawIntBits(f5) << 32);
    }

    public static final Object[] h(Object[] objArr, int i7, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        P3.m.Z(0, i7, 6, objArr, objArr2);
        P3.m.W(i7 + 2, i7, objArr.length, objArr, objArr2);
        objArr2[i7] = obj;
        objArr2[i7 + 1] = obj2;
        return objArr2;
    }

    public static final Object[] i(int i7, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        P3.m.Z(0, i7, 6, objArr, objArr2);
        P3.m.W(i7, i7 + 2, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static final Object[] j(int i7, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        P3.m.Z(0, i7, 6, objArr, objArr2);
        P3.m.W(i7, i7 + 1, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static final void k(Encoder encoder) {
        kotlin.jvm.internal.l.f("<this>", encoder);
        if ((encoder instanceof a6.o ? (a6.o) encoder : null) != null) {
            return;
        }
        throw new IllegalStateException(AbstractC0703b.o(y.a, encoder.getClass(), new StringBuilder("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got ")));
    }

    public static final a6.k l(Decoder decoder) {
        kotlin.jvm.internal.l.f("<this>", decoder);
        a6.k kVar = decoder instanceof a6.k ? (a6.k) decoder : null;
        if (kVar != null) {
            return kVar;
        }
        throw new IllegalStateException(AbstractC0703b.o(y.a, decoder.getClass(), new StringBuilder("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got ")));
    }

    public static void m(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    public static int q(K2.S s7, AbstractC0319x abstractC0319x, View view, View view2, K2.H h7, boolean z7) {
        if (h7.u() == 0 || s7.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z7) {
            return Math.abs(K2.H.C(view) - K2.H.C(view2)) + 1;
        }
        return Math.min(abstractC0319x.l(), abstractC0319x.b(view2) - abstractC0319x.e(view));
    }

    public static int r(K2.S s7, AbstractC0319x abstractC0319x, View view, View view2, K2.H h7, boolean z7, boolean z8) {
        if (h7.u() == 0 || s7.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z8 ? Math.max(0, (s7.b() - Math.max(K2.H.C(view), K2.H.C(view2))) - 1) : Math.max(0, Math.min(K2.H.C(view), K2.H.C(view2)));
        if (z7) {
            return Math.round((iMax * (Math.abs(abstractC0319x.b(view2) - abstractC0319x.e(view)) / (Math.abs(K2.H.C(view) - K2.H.C(view2)) + 1))) + (abstractC0319x.k() - abstractC0319x.e(view)));
        }
        return iMax;
    }

    public static int s(K2.S s7, AbstractC0319x abstractC0319x, View view, View view2, K2.H h7, boolean z7) {
        if (h7.u() == 0 || s7.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z7) {
            return s7.b();
        }
        return (int) (((abstractC0319x.b(view2) - abstractC0319x.e(view)) / (Math.abs(K2.H.C(view) - K2.H.C(view2)) + 1)) * s7.b());
    }

    public static final double t(int i7, int i8, int i9, int i10, e3.g gVar) {
        double d4 = i9 / i7;
        double d6 = i10 / i8;
        int iOrdinal = gVar.ordinal();
        if (iOrdinal == 0) {
            return Math.max(d4, d6);
        }
        if (iOrdinal == 1) {
            return Math.min(d4, d6);
        }
        throw new D6.r();
    }

    public static final boolean u(g0.d dVar, float f5, float f7) {
        return f5 <= dVar.f11660c && dVar.a <= f5 && f7 <= dVar.f11661d && dVar.f11659b <= f7;
    }

    public static final boolean v(g0.d dVar, float f5, float f7) {
        return f5 <= dVar.f11660c && dVar.a <= f5 && f7 <= dVar.f11661d && dVar.f11659b <= f7;
    }

    public static boolean w(InterfaceC2096b interfaceC2096b, InterfaceC2096b interfaceC2096b2) {
        kotlin.jvm.internal.l.f("superDescriptor", interfaceC2096b);
        kotlin.jvm.internal.l.f("subDescriptor", interfaceC2096b2);
        if (!(interfaceC2096b2 instanceof J4.f) || !(interfaceC2096b instanceof InterfaceC2112s)) {
            return false;
        }
        J4.f fVar = (J4.f) interfaceC2096b2;
        fVar.m0().size();
        InterfaceC2112s interfaceC2112s = (InterfaceC2112s) interfaceC2096b;
        interfaceC2112s.m0().size();
        List listM0 = fVar.a().m0();
        kotlin.jvm.internal.l.e("getValueParameters(...)", listM0);
        List listM02 = interfaceC2112s.a().m0();
        kotlin.jvm.internal.l.e("getValueParameters(...)", listM02);
        Iterator it = P3.q.Z0(listM0, listM02).iterator();
        while (it.hasNext()) {
            O3.l lVar = (O3.l) it.next();
            C2272S c2272s = (C2272S) lVar.f7528k;
            C2272S c2272s2 = (C2272S) lVar.f7529l;
            kotlin.jvm.internal.l.c(c2272s);
            boolean z7 = S((InterfaceC2112s) interfaceC2096b2, c2272s) instanceof P4.j;
            kotlin.jvm.internal.l.c(c2272s2);
            if (z7 != (S(interfaceC2112s, c2272s2) instanceof P4.j)) {
                return true;
            }
        }
        return false;
    }

    public static final C0012e x(Annotation[] annotationArr, W4.c cVar) {
        Annotation annotation;
        kotlin.jvm.internal.l.f("<this>", annotationArr);
        kotlin.jvm.internal.l.f("fqName", cVar);
        int length = annotationArr.length;
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                annotation = null;
                break;
            }
            annotation = annotationArr[i7];
            if (kotlin.jvm.internal.l.a(AbstractC0011d.a(F(B(annotation))).a(), cVar)) {
                break;
            }
            i7++;
        }
        if (annotation != null) {
            return new C0012e(annotation);
        }
        return null;
    }

    public static final KSerializer y(AbstractC0625b abstractC0625b, Y5.a aVar, String str) {
        kotlin.jvm.internal.l.f("<this>", abstractC0625b);
        KSerializer kSerializerA = abstractC0625b.a(aVar, str);
        if (kSerializerA != null) {
            return kSerializerA;
        }
        AbstractC0632e0.k(str, abstractC0625b.c());
        throw null;
    }

    public static final KSerializer z(AbstractC0625b abstractC0625b, Encoder encoder, Object obj) {
        kotlin.jvm.internal.l.f("<this>", abstractC0625b);
        kotlin.jvm.internal.l.f("encoder", encoder);
        kotlin.jvm.internal.l.f("value", obj);
        KSerializer kSerializerB = abstractC0625b.b(encoder, obj);
        if (kSerializerB != null) {
            return kSerializerB;
        }
        InterfaceC1425d interfaceC1425dB = y.a.b(obj.getClass());
        InterfaceC1425d interfaceC1425dC = abstractC0625b.c();
        kotlin.jvm.internal.l.f("baseClass", interfaceC1425dC);
        String strN = interfaceC1425dB.n();
        if (strN == null) {
            strN = String.valueOf(interfaceC1425dB);
        }
        AbstractC0632e0.k(strN, interfaceC1425dC);
        throw null;
    }

    public abstract void T(Y0.f fVar, Y0.f fVar2);

    public abstract void U(Y0.f fVar, Thread thread);

    public abstract boolean n(Y0.g gVar, Y0.c cVar, Y0.c cVar2);

    public abstract boolean o(Y0.g gVar, Object obj, Object obj2);

    public abstract boolean p(Y0.g gVar, Y0.f fVar, Y0.f fVar2);
}
