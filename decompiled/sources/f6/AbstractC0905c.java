package f6;

import D.C0064m;
import D4.EnumC0097p;
import O.C0509o0;
import O.C0510p;
import android.view.View;
import android.view.ViewParent;
import com.kusukanime.R;
import e5.AbstractC0832b;
import g.C0929b;
import g.C0930c;
import g.InterfaceC0931d;
import g5.C0954a;
import io.ktor.http.ContentType;
import io.ktor.http.LinkHeader;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l4.InterfaceC1425d;
import l4.InterfaceC1426e;
import l4.InterfaceC1444w;
import l4.InterfaceC1445x;
import n5.AbstractC1566c;
import n5.AbstractC1580q;
import n5.AbstractC1586x;
import n5.Q;
import n5.Y;
import n5.a0;
import n5.b0;
import o4.C1649C;
import p4.C1798d;
import q0.C1844a;
import r4.AbstractC1880i;
import s0.AbstractC1971p;
import s0.C1959d;
import t0.C2031a;
import t0.C2032b;
import t0.C2033c;
import u4.EnumC2100f;
import u4.InterfaceC2099e;
import u4.InterfaceC2102h;
import u4.InterfaceC2103i;
import y.InterfaceC2339t;
import y2.C2410g;
import z5.AbstractC2510o;
import z5.AbstractC2517v;

/* renamed from: f6.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0905c {
    public static C2410g A(C2410g c2410g, String[] strArr, Map map) {
        int i7 = 0;
        if (c2410g == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (C2410g) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                C2410g c2410g2 = new C2410g();
                int length = strArr.length;
                while (i7 < length) {
                    c2410g2.a((C2410g) map.get(strArr[i7]));
                    i7++;
                }
                return c2410g2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                c2410g.a((C2410g) map.get(strArr[0]));
                return c2410g;
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i7 < length2) {
                    c2410g.a((C2410g) map.get(strArr[i7]));
                    i7++;
                }
            }
        }
        return c2410g;
    }

    public static final void B(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void C(String str) {
        throw new IllegalStateException(str);
    }

    public static final void D(String str) {
        throw new IllegalStateException(str);
    }

    public static final W4.b E(String str) {
        boolean zT = AbstractC2517v.T(str, ".", false);
        if (zT) {
            str = str.substring(1);
            kotlin.jvm.internal.l.e("substring(...)", str);
        }
        return new W4.b(new W4.c(AbstractC2517v.Q(AbstractC2510o.G0('/', str, ""), '/', '.')), new W4.c(AbstractC2510o.C0('/', str, str)), zT);
    }

    public static final List F(ArrayList arrayList) {
        int size = arrayList.size();
        return size != 0 ? size != 1 ? Collections.unmodifiableList(new ArrayList(arrayList)) : Collections.singletonList(P3.q.r0(arrayList)) : P3.y.f7779k;
    }

    public static final Map G(Map map) {
        int size = map.size();
        if (size == 0) {
            return P3.z.f7780k;
        }
        if (size != 1) {
            return Collections.unmodifiableMap(new LinkedHashMap(map));
        }
        Map.Entry entry = (Map.Entry) P3.q.q0(map.entrySet());
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }

    public static final long a(int i7) {
        long j7 = (i7 << 32) | (0 & 4294967295L);
        int i8 = C1844a.f14670n;
        return j7;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01a2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(x.C2227a r20, a0.q r21, x.v r22, v.Z r23, v.InterfaceC2128g r24, v.InterfaceC2126e r25, s.C1928n r26, boolean r27, e4.k r28, O.C0510p r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f6.AbstractC0905c.b(x.a, a0.q, x.v, v.Z, v.g, v.e, s.n, boolean, e4.k, O.p, int, int):void");
    }

    public static final void c(InterfaceC2339t interfaceC2339t, Object obj, int i7, Object obj2, C0510p c0510p, int i8) {
        int i9;
        c0510p.T(1439843069);
        if ((i8 & 6) == 0) {
            i9 = (c0510p.f(interfaceC2339t) ? 4 : 2) | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 48) == 0) {
            i9 |= c0510p.f(obj) ? 32 : 16;
        }
        if ((i8 & 384) == 0) {
            i9 |= c0510p.d(i7) ? 256 : 128;
        }
        if ((i8 & 3072) == 0) {
            i9 |= c0510p.f(obj2) ? 2048 : 1024;
        }
        if ((i9 & 1171) == 1170 && c0510p.y()) {
            c0510p.M();
        } else {
            ((X.c) obj).a(obj2, W.f.b(980966366, new C0064m(i7, obj2, interfaceC2339t), c0510p), c0510p, 48);
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new W0.l(interfaceC2339t, obj, i7, obj2, i8);
        }
    }

    public static final void d(C2033c c2033c, s0.r rVar) {
        boolean zA = AbstractC1971p.a(rVar);
        C2032b c2032b = c2033c.f15886b;
        C2032b c2032b2 = c2033c.a;
        if (zA) {
            C2031a[] c2031aArr = (C2031a[]) c2032b2.f15882c;
            P3.m.c0(c2031aArr, 0, c2031aArr.length);
            c2032b2.f15881b = 0;
            C2031a[] c2031aArr2 = (C2031a[]) c2032b.f15882c;
            P3.m.c0(c2031aArr2, 0, c2031aArr2.length);
            c2032b.f15881b = 0;
            c2033c.f15887c = 0L;
        }
        boolean zC = AbstractC1971p.c(rVar);
        long j7 = rVar.f15469b;
        if (!zC) {
            List list = rVar.f15478k;
            if (list == null) {
                list = P3.y.f7779k;
            }
            int size = list.size();
            for (int i7 = 0; i7 < size; i7++) {
                C1959d c1959d = (C1959d) list.get(i7);
                long j8 = c1959d.a;
                long j9 = c1959d.f15444c;
                c2032b2.a(g0.c.d(j9), j8);
                c2032b.a(g0.c.e(j9), j8);
            }
            long j10 = rVar.f15479l;
            c2032b2.a(g0.c.d(j10), j7);
            c2032b.a(g0.c.e(j10), j7);
        }
        if (AbstractC1971p.c(rVar) && j7 - c2033c.f15887c > 40) {
            C2031a[] c2031aArr3 = (C2031a[]) c2032b2.f15882c;
            P3.m.c0(c2031aArr3, 0, c2031aArr3.length);
            c2032b2.f15881b = 0;
            C2031a[] c2031aArr4 = (C2031a[]) c2032b.f15882c;
            P3.m.c0(c2031aArr4, 0, c2031aArr4.length);
            c2032b.f15881b = 0;
            c2033c.f15887c = 0L;
        }
        c2033c.f15887c = j7;
    }

    public static final n5.G e(AbstractC1586x abstractC1586x) {
        kotlin.jvm.internal.l.f("<this>", abstractC1586x);
        return new n5.G(abstractC1586x);
    }

    public static final boolean f(AbstractC1586x abstractC1586x, n5.M m7, Set set) {
        boolean zF;
        if (kotlin.jvm.internal.l.a(abstractC1586x.t0(), m7)) {
            return true;
        }
        InterfaceC2102h interfaceC2102hF = abstractC1586x.t0().f();
        InterfaceC2103i interfaceC2103i = interfaceC2102hF instanceof InterfaceC2103i ? (InterfaceC2103i) interfaceC2102hF : null;
        List listN = interfaceC2103i != null ? interfaceC2103i.n() : null;
        Iterable iterableY0 = P3.q.Y0(abstractC1586x.q0());
        if (!(iterableY0 instanceof Collection) || !((Collection) iterableY0).isEmpty()) {
            Iterator it = iterableY0.iterator();
            do {
                P3.C c2 = (P3.C) it;
                if (c2.f7740l.hasNext()) {
                    P3.B b4 = (P3.B) c2.next();
                    int i7 = b4.a;
                    Q q6 = (Q) b4.f7738b;
                    u4.Q q7 = listN != null ? (u4.Q) P3.q.u0(i7, listN) : null;
                    if ((q7 == null || set == null || !set.contains(q7)) && !q6.c()) {
                        AbstractC1586x abstractC1586xB = q6.b();
                        kotlin.jvm.internal.l.e("getType(...)", abstractC1586xB);
                        zF = f(abstractC1586xB, m7, set);
                    } else {
                        zF = false;
                    }
                }
            } while (!zF);
            return true;
        }
        return false;
    }

    public static g5.o g(String str, Collection collection) {
        kotlin.jvm.internal.l.f(ContentType.Message.TYPE, str);
        kotlin.jvm.internal.l.f("types", collection);
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList(P3.r.p(collection2, 10));
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC1586x) it.next()).k0());
        }
        w5.f fVarZ = AbstractC0832b.z(arrayList);
        int i7 = fVarZ.f17101k;
        g5.o c0954a = i7 != 0 ? i7 != 1 ? new C0954a(str, (g5.o[]) fVarZ.toArray(new g5.o[0])) : (g5.o) fVarZ.get(0) : g5.n.f11759b;
        return fVarZ.f17101k <= 1 ? c0954a : new g5.k(c0954a);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static z4.C2491c h(java.lang.Class r14) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f6.AbstractC0905c.h(java.lang.Class):z4.c");
    }

    public static final Object i(Class cls, Map map, List list) throws IllegalArgumentException {
        kotlin.jvm.internal.l.f("annotationClass", cls);
        kotlin.jvm.internal.l.f("methods", list);
        O3.q qVarC = z1.c.C(new H4.u(25, map));
        Object objNewProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C1798d(cls, map, z1.c.C(new A3.q(17, cls, map)), qVarC, list));
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt.createAnnotationInstance", objNewProxyInstance);
        return objNewProxyInstance;
    }

    public static final n5.G j(AbstractC1586x abstractC1586x, b0 b0Var, u4.Q q6) {
        kotlin.jvm.internal.l.f(LinkHeader.Parameters.Type, abstractC1586x);
        if ((q6 != null ? q6.R() : null) == b0Var) {
            b0Var = b0.f13390m;
        }
        return new n5.G(abstractC1586x, b0Var);
    }

    public static final float k(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f5 = 0.0f;
        for (int i7 = 0; i7 < length; i7++) {
            f5 += fArr[i7] * fArr2[i7];
        }
        return f5;
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static final void m(AbstractC1586x abstractC1586x, n5.B b4, LinkedHashSet linkedHashSet, Set set) {
        InterfaceC2102h interfaceC2102hF = abstractC1586x.t0().f();
        if (interfaceC2102hF instanceof u4.Q) {
            if (!kotlin.jvm.internal.l.a(abstractC1586x.t0(), b4.t0())) {
                linkedHashSet.add(interfaceC2102hF);
                return;
            }
            for (AbstractC1586x abstractC1586x2 : ((u4.Q) interfaceC2102hF).getUpperBounds()) {
                kotlin.jvm.internal.l.c(abstractC1586x2);
                m(abstractC1586x2, b4, linkedHashSet, set);
            }
            return;
        }
        InterfaceC2102h interfaceC2102hF2 = abstractC1586x.t0().f();
        InterfaceC2103i interfaceC2103i = interfaceC2102hF2 instanceof InterfaceC2103i ? (InterfaceC2103i) interfaceC2102hF2 : null;
        List listN = interfaceC2103i != null ? interfaceC2103i.n() : null;
        int i7 = 0;
        for (Q q6 : abstractC1586x.q0()) {
            int i8 = i7 + 1;
            u4.Q q7 = listN != null ? (u4.Q) P3.q.u0(i7, listN) : null;
            if ((q7 == null || set == null || !set.contains(q7)) && !q6.c() && !P3.q.m0(linkedHashSet, q6.b().t0().f()) && !kotlin.jvm.internal.l.a(q6.b().t0(), b4.t0())) {
                AbstractC1586x abstractC1586xB = q6.b();
                kotlin.jvm.internal.l.e("getType(...)", abstractC1586xB);
                m(abstractC1586xB, b4, linkedHashSet, set);
            }
            i7 = i8;
        }
    }

    public static final AbstractC1880i n(AbstractC1586x abstractC1586x) {
        kotlin.jvm.internal.l.f("<this>", abstractC1586x);
        AbstractC1880i abstractC1880iD = abstractC1586x.t0().d();
        kotlin.jvm.internal.l.e("getBuiltIns(...)", abstractC1880iD);
        return abstractC1880iD;
    }

    public static final InterfaceC1425d o(InterfaceC1426e interfaceC1426e) {
        Object obj;
        if (interfaceC1426e instanceof InterfaceC1425d) {
            return (InterfaceC1425d) interfaceC1426e;
        }
        if (!(interfaceC1426e instanceof InterfaceC1445x)) {
            throw new H5.C("Cannot calculate JVM erasure for type: " + interfaceC1426e);
        }
        List upperBounds = ((InterfaceC1445x) interfaceC1426e).getUpperBounds();
        Iterator it = upperBounds.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            InterfaceC1426e interfaceC1426eC = ((InterfaceC1444w) next).c();
            C1649C c1649c = interfaceC1426eC instanceof C1649C ? (C1649C) interfaceC1426eC : null;
            if (c1649c != null && c1649c.B() != EnumC0097p.f1619m && c1649c.B() != EnumC0097p.f1622p) {
                obj = next;
                break;
            }
        }
        InterfaceC1444w interfaceC1444w = (InterfaceC1444w) obj;
        if (interfaceC1444w == null) {
            interfaceC1444w = (InterfaceC1444w) P3.q.t0(upperBounds);
        }
        return interfaceC1444w != null ? p(interfaceC1444w) : kotlin.jvm.internal.y.a.b(Object.class);
    }

    public static final InterfaceC1425d p(InterfaceC1444w interfaceC1444w) {
        InterfaceC1426e interfaceC1426eC = interfaceC1444w.c();
        if (interfaceC1426eC != null) {
            return o(interfaceC1426eC);
        }
        throw new H5.C("Cannot calculate JVM erasure for type: " + interfaceC1444w);
    }

    public static final ViewParent q(View view) {
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(R.id.view_tree_disjoint_parent);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }

    public static final AbstractC1586x r(u4.Q q6) {
        Object obj;
        kotlin.jvm.internal.l.f("<this>", q6);
        List upperBounds = q6.getUpperBounds();
        kotlin.jvm.internal.l.e("getUpperBounds(...)", upperBounds);
        upperBounds.isEmpty();
        List upperBounds2 = q6.getUpperBounds();
        kotlin.jvm.internal.l.e("getUpperBounds(...)", upperBounds2);
        Iterator it = upperBounds2.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            InterfaceC2102h interfaceC2102hF = ((AbstractC1586x) next).t0().f();
            InterfaceC2099e interfaceC2099e = interfaceC2102hF instanceof InterfaceC2099e ? (InterfaceC2099e) interfaceC2102hF : null;
            if (interfaceC2099e != null && interfaceC2099e.c() != EnumC2100f.f16312l && interfaceC2099e.c() != EnumC2100f.f16315o) {
                obj = next;
                break;
            }
        }
        AbstractC1586x abstractC1586x = (AbstractC1586x) obj;
        if (abstractC1586x != null) {
            return abstractC1586x;
        }
        List upperBounds3 = q6.getUpperBounds();
        kotlin.jvm.internal.l.e("getUpperBounds(...)", upperBounds3);
        Object objR0 = P3.q.r0(upperBounds3);
        kotlin.jvm.internal.l.e("first(...)", objR0);
        return (AbstractC1586x) objR0;
    }

    public static String s(InterfaceC0931d interfaceC0931d) {
        if (interfaceC0931d instanceof C0930c) {
            return "image/*";
        }
        if (interfaceC0931d instanceof C0929b) {
            return null;
        }
        throw new D6.r();
    }

    public static final boolean t(u4.Q q6, n5.M m7, Set set) {
        kotlin.jvm.internal.l.f("typeParameter", q6);
        List<AbstractC1586x> upperBounds = q6.getUpperBounds();
        kotlin.jvm.internal.l.e("getUpperBounds(...)", upperBounds);
        if (upperBounds.isEmpty()) {
            return false;
        }
        for (AbstractC1586x abstractC1586x : upperBounds) {
            kotlin.jvm.internal.l.c(abstractC1586x);
            if (f(abstractC1586x, q6.g().t0(), set) && (m7 == null || kotlin.jvm.internal.l.a(abstractC1586x.t0(), m7))) {
                return true;
            }
        }
        return false;
    }

    public static int u(long j7) {
        return (int) (j7 ^ (j7 >>> 32));
    }

    public static final a0 v(AbstractC1586x abstractC1586x) {
        kotlin.jvm.internal.l.f("<this>", abstractC1586x);
        a0 a0VarG = Y.g(abstractC1586x, true);
        kotlin.jvm.internal.l.e("makeNullable(...)", a0VarG);
        return a0VarG;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static f6.C0906d w(f6.C0920r r26) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f6.AbstractC0905c.w(f6.r):f6.d");
    }

    public static final void x(float[] fArr, float[] fArr2, int i7, float[] fArr3) {
        if (i7 == 0) {
            B("At least one point must be provided");
            throw null;
        }
        int i8 = 2 >= i7 ? i7 - 1 : 2;
        int i9 = i8 + 1;
        float[][] fArr4 = new float[i9][];
        for (int i10 = 0; i10 < i9; i10++) {
            fArr4[i10] = new float[i7];
        }
        for (int i11 = 0; i11 < i7; i11++) {
            fArr4[0][i11] = 1.0f;
            for (int i12 = 1; i12 < i9; i12++) {
                fArr4[i12][i11] = fArr4[i12 - 1][i11] * fArr[i11];
            }
        }
        float[][] fArr5 = new float[i9][];
        for (int i13 = 0; i13 < i9; i13++) {
            fArr5[i13] = new float[i7];
        }
        float[][] fArr6 = new float[i9][];
        for (int i14 = 0; i14 < i9; i14++) {
            fArr6[i14] = new float[i9];
        }
        int i15 = 0;
        while (i15 < i9) {
            float[] fArr7 = fArr5[i15];
            float[] fArr8 = fArr4[i15];
            kotlin.jvm.internal.l.f("<this>", fArr8);
            kotlin.jvm.internal.l.f("destination", fArr7);
            System.arraycopy(fArr8, 0, fArr7, 0, i7);
            for (int i16 = 0; i16 < i15; i16++) {
                float[] fArr9 = fArr5[i16];
                float fK = k(fArr7, fArr9);
                for (int i17 = 0; i17 < i7; i17++) {
                    fArr7[i17] = fArr7[i17] - (fArr9[i17] * fK);
                }
            }
            float fSqrt = (float) Math.sqrt(k(fArr7, fArr7));
            if (fSqrt < 1.0E-6f) {
                fSqrt = 1.0E-6f;
            }
            float f5 = 1.0f / fSqrt;
            for (int i18 = 0; i18 < i7; i18++) {
                fArr7[i18] = fArr7[i18] * f5;
            }
            float[] fArr10 = fArr6[i15];
            int i19 = 0;
            while (i19 < i9) {
                fArr10[i19] = i19 < i15 ? 0.0f : k(fArr7, fArr4[i19]);
                i19++;
            }
            i15++;
        }
        for (int i20 = i8; -1 < i20; i20--) {
            float fK2 = k(fArr5[i20], fArr2);
            float[] fArr11 = fArr6[i20];
            int i21 = i20 + 1;
            if (i21 <= i8) {
                int i22 = i8;
                while (true) {
                    fK2 -= fArr11[i22] * fArr3[i22];
                    if (i22 != i21) {
                        i22--;
                    }
                }
            }
            fArr3[i20] = fK2 / fArr11[i20];
        }
    }

    public static final AbstractC1586x y(AbstractC1586x abstractC1586x, v4.h hVar) {
        return (abstractC1586x.getAnnotations().isEmpty() && hVar.isEmpty()) ? abstractC1586x : abstractC1586x.w0().z0(AbstractC1566c.s(abstractC1586x.s0(), hVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [n5.a0] */
    public static final a0 z(AbstractC1586x abstractC1586x) {
        n5.B bR;
        kotlin.jvm.internal.l.f("<this>", abstractC1586x);
        a0 a0VarW0 = abstractC1586x.w0();
        if (a0VarW0 instanceof AbstractC1580q) {
            AbstractC1580q abstractC1580q = (AbstractC1580q) a0VarW0;
            n5.B bR2 = abstractC1580q.f13407l;
            if (!bR2.t0().getParameters().isEmpty() && bR2.t0().f() != null) {
                List parameters = bR2.t0().getParameters();
                kotlin.jvm.internal.l.e("getParameters(...)", parameters);
                ArrayList arrayList = new ArrayList(P3.r.p(parameters, 10));
                Iterator it = parameters.iterator();
                while (it.hasNext()) {
                    arrayList.add(new n5.G((u4.Q) it.next()));
                }
                bR2 = AbstractC1566c.r(bR2, arrayList, null, 2);
            }
            n5.B bR3 = abstractC1580q.f13408m;
            if (!bR3.t0().getParameters().isEmpty() && bR3.t0().f() != null) {
                List parameters2 = bR3.t0().getParameters();
                kotlin.jvm.internal.l.e("getParameters(...)", parameters2);
                ArrayList arrayList2 = new ArrayList(P3.r.p(parameters2, 10));
                Iterator it2 = parameters2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new n5.G((u4.Q) it2.next()));
                }
                bR3 = AbstractC1566c.r(bR3, arrayList2, null, 2);
            }
            bR = AbstractC1566c.f(bR2, bR3);
        } else {
            if (!(a0VarW0 instanceof n5.B)) {
                throw new D6.r();
            }
            n5.B b4 = (n5.B) a0VarW0;
            boolean zIsEmpty = b4.t0().getParameters().isEmpty();
            bR = b4;
            if (!zIsEmpty) {
                InterfaceC2102h interfaceC2102hF = b4.t0().f();
                bR = b4;
                if (interfaceC2102hF != null) {
                    List parameters3 = b4.t0().getParameters();
                    kotlin.jvm.internal.l.e("getParameters(...)", parameters3);
                    ArrayList arrayList3 = new ArrayList(P3.r.p(parameters3, 10));
                    Iterator it3 = parameters3.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(new n5.G((u4.Q) it3.next()));
                    }
                    bR = AbstractC1566c.r(b4, arrayList3, null, 2);
                }
            }
        }
        return AbstractC1566c.i(bR, a0VarW0);
    }
}
