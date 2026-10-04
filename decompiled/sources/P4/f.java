package P4;

import D6.r;
import R4.U;
import a5.C0667a;
import a5.InterfaceC0668b;
import e5.EnumC0834d;
import io.ktor.http.LinkHeader;
import j5.InterfaceC1359n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.y;
import n5.AbstractC1566c;
import n5.AbstractC1580q;
import n5.AbstractC1586x;
import n5.B;
import n5.C1575l;
import n5.G;
import n5.M;
import n5.Q;
import n5.a0;
import o5.AbstractC1707g;
import o5.C1701a;
import o5.C1709i;
import o5.InterfaceC1702b;
import o5.t;
import q5.C1858a;
import r4.AbstractC1880i;
import z5.AbstractC2510o;

/* loaded from: classes.dex */
public final class f implements InterfaceC1359n, InterfaceC1702b {

    /* renamed from: k, reason: collision with root package name */
    public static final f f7795k = new f();

    /* renamed from: l, reason: collision with root package name */
    public static final f f7796l = new f();

    /* renamed from: m, reason: collision with root package name */
    public static final f f7797m = new f();

    public static String[] a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add("<init>(" + str + ")V");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static k c(String str) {
        EnumC0834d enumC0834d;
        kotlin.jvm.internal.l.f("representation", str);
        char cCharAt = str.charAt(0);
        EnumC0834d[] enumC0834dArrValues = EnumC0834d.values();
        int length = enumC0834dArrValues.length;
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                enumC0834d = null;
                break;
            }
            enumC0834d = enumC0834dArrValues[i7];
            if (enumC0834d.c().charAt(0) == cCharAt) {
                break;
            }
            i7++;
        }
        if (enumC0834d != null) {
            return new j(enumC0834d);
        }
        if (cCharAt == 'V') {
            return new j(null);
        }
        if (cCharAt == '[') {
            String strSubstring = str.substring(1);
            kotlin.jvm.internal.l.e("substring(...)", strSubstring);
            return new h(c(strSubstring));
        }
        if (cCharAt == 'L') {
            AbstractC2510o.a0(str, ';');
        }
        String strSubstring2 = str.substring(1, str.length() - 1);
        kotlin.jvm.internal.l.e("substring(...)", strSubstring2);
        return new i(strSubstring2);
    }

    public static i e(String str) {
        kotlin.jvm.internal.l.f("internalName", str);
        return new i(str);
    }

    public static LinkedHashSet f(String str, String... strArr) {
        kotlin.jvm.internal.l.f("internalName", str);
        kotlin.jvm.internal.l.f("signatures", strArr);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str2 : strArr) {
            linkedHashSet.add(str + '.' + str2);
        }
        return linkedHashSet;
    }

    public static LinkedHashSet g(String str, String... strArr) {
        kotlin.jvm.internal.l.f("signatures", strArr);
        return f("java/lang/".concat(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static LinkedHashSet h(String str, String... strArr) {
        return f("java/util/".concat(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static String o(k kVar) {
        String strC;
        kotlin.jvm.internal.l.f(LinkHeader.Parameters.Type, kVar);
        if (kVar instanceof h) {
            return "[" + o(((h) kVar).f7801i);
        }
        if (kVar instanceof j) {
            EnumC0834d enumC0834d = ((j) kVar).f7803i;
            return (enumC0834d == null || (strC = enumC0834d.c()) == null) ? "V" : strC;
        }
        if (kVar instanceof i) {
            return A6.b.j(new StringBuilder("L"), ((i) kVar).f7802i, ';');
        }
        throw new r();
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ boolean A(q5.h hVar) {
        return AbstractC1707g.G(hVar);
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ boolean A0(q5.h hVar) {
        return AbstractC1707g.A(hVar);
    }

    @Override // o5.InterfaceC1702b
    public boolean B(q5.d dVar) {
        kotlin.jvm.internal.l.f("$receiver", dVar);
        return dVar instanceof O4.g;
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ Q C0(InterfaceC0668b interfaceC0668b) {
        return AbstractC1707g.V(interfaceC0668b);
    }

    @Override // o5.InterfaceC1702b
    public B E(q5.d dVar) {
        B bB0;
        kotlin.jvm.internal.l.f("<this>", dVar);
        AbstractC1580q abstractC1580qG = AbstractC1707g.g(dVar);
        if (abstractC1580qG != null && (bB0 = AbstractC1707g.b0(abstractC1580qG)) != null) {
            return bB0;
        }
        B bH = AbstractC1707g.h(dVar);
        kotlin.jvm.internal.l.c(bH);
        return bH;
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ C1709i E0(q5.c cVar) {
        return AbstractC1707g.a0(cVar);
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ boolean F0(q5.h hVar) {
        return AbstractC1707g.H(hVar);
    }

    @Override // o5.InterfaceC1702b
    public a0 G(ArrayList arrayList) {
        B b4;
        int size = arrayList.size();
        if (size == 0) {
            throw new IllegalStateException("Expected some types");
        }
        if (size == 1) {
            return (a0) P3.q.J0(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(P3.r.p(arrayList, 10));
        Iterator it = arrayList.iterator();
        boolean z7 = false;
        boolean z8 = false;
        while (it.hasNext()) {
            a0 a0Var = (a0) it.next();
            z7 = z7 || AbstractC1566c.k(a0Var);
            if (a0Var instanceof B) {
                b4 = (B) a0Var;
            } else {
                if (!(a0Var instanceof AbstractC1580q)) {
                    throw new r();
                }
                kotlin.jvm.internal.l.f("<this>", a0Var);
                b4 = ((AbstractC1580q) a0Var).f13407l;
                z8 = true;
            }
            arrayList2.add(b4);
        }
        if (z7) {
            return p5.l.c(p5.k.f14432H, arrayList.toString());
        }
        t tVar = t.a;
        if (!z8) {
            return tVar.b(arrayList2);
        }
        ArrayList arrayList3 = new ArrayList(P3.r.p(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add(AbstractC1566c.F((a0) it2.next()));
        }
        return AbstractC1566c.f(tVar.b(arrayList2), tVar.b(arrayList3));
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ boolean H(q5.h hVar) {
        return AbstractC1707g.D(hVar);
    }

    @Override // o5.InterfaceC1702b
    public M H0(q5.d dVar) {
        kotlin.jvm.internal.l.f("<this>", dVar);
        B bH = AbstractC1707g.h(dVar);
        if (bH == null) {
            bH = O0(dVar);
        }
        return AbstractC1707g.Z(bH);
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ void I0(q5.e eVar) {
        AbstractC1707g.O(eVar);
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ boolean J(q5.h hVar) {
        return AbstractC1707g.J(hVar);
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ boolean K(u4.Q q6, q5.h hVar) {
        return AbstractC1707g.y(q6, hVar);
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ a0 M(q5.c cVar) {
        return AbstractC1707g.R(cVar);
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ a0 M0(q5.f fVar, q5.f fVar2) {
        return AbstractC1707g.m(this, fVar, fVar2);
    }

    @Override // o5.InterfaceC1702b
    public boolean N(q5.c cVar) {
        return cVar instanceof C0667a;
    }

    @Override // o5.InterfaceC1702b
    public void N0(q5.d dVar) {
        kotlin.jvm.internal.l.f("<this>", dVar);
        AbstractC1707g.g(dVar);
    }

    @Override // o5.InterfaceC1702b
    public boolean O(q5.e eVar) {
        kotlin.jvm.internal.l.f("<this>", eVar);
        return AbstractC1707g.J(H0(eVar)) && !AbstractC1707g.K(eVar);
    }

    @Override // o5.InterfaceC1702b
    public B O0(q5.d dVar) {
        B bQ;
        kotlin.jvm.internal.l.f("<this>", dVar);
        AbstractC1580q abstractC1580qG = AbstractC1707g.g(dVar);
        if (abstractC1580qG != null && (bQ = AbstractC1707g.Q(abstractC1580qG)) != null) {
            return bQ;
        }
        B bH = AbstractC1707g.h(dVar);
        kotlin.jvm.internal.l.c(bH);
        return bH;
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ B P(q5.e eVar) {
        return AbstractC1707g.c0(eVar, false);
    }

    @Override // o5.InterfaceC1702b
    public a0 P0(q5.d dVar) {
        return AbstractC1707g.S(dVar);
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ Q Q(q5.d dVar, int i7) {
        return AbstractC1707g.p(dVar, i7);
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ boolean Q0(q5.d dVar) {
        return AbstractC1707g.I(dVar);
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ B R(q5.e eVar) {
        return AbstractC1707g.c0(eVar, true);
    }

    @Override // o5.InterfaceC1702b
    public boolean R0(q5.e eVar) {
        return AbstractC1707g.G(AbstractC1707g.Z(eVar));
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ q5.d S0(q5.d dVar) {
        return AbstractC1707g.d0(this, dVar);
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ B T(AbstractC1586x abstractC1586x) {
        return AbstractC1707g.h(abstractC1586x);
    }

    @Override // o5.InterfaceC1702b
    public boolean T0(q5.d dVar) {
        kotlin.jvm.internal.l.f("<this>", dVar);
        return !kotlin.jvm.internal.l.a(AbstractC1707g.Z(O0(dVar)), AbstractC1707g.Z(E(dVar)));
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ q5.j U(Q q6) {
        return AbstractC1707g.v(q6);
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ int U0(q5.d dVar) {
        return AbstractC1707g.c(dVar);
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ a0 V(Q q6) {
        return AbstractC1707g.t(this, q6);
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ q5.b W0(q5.c cVar) {
        return AbstractC1707g.k(cVar);
    }

    @Override // o5.InterfaceC1702b
    public int X(q5.g gVar) {
        kotlin.jvm.internal.l.f("<this>", gVar);
        if (gVar instanceof q5.e) {
            return AbstractC1707g.c((q5.d) gVar);
        }
        if (gVar instanceof C1858a) {
            return ((C1858a) gVar).size();
        }
        throw new IllegalStateException(("unknown type argument list type: " + gVar + ", " + y.a.b(gVar.getClass())).toString());
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ Collection X0(q5.h hVar) {
        return AbstractC1707g.Y(hVar);
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ boolean Z(q5.h hVar) {
        return AbstractC1707g.C(hVar);
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ boolean Z0(q5.h hVar) {
        return AbstractC1707g.B(hVar);
    }

    @Override // j5.InterfaceC1359n
    public AbstractC1586x b(U u5, String str, B b4, B b7) {
        kotlin.jvm.internal.l.f("proto", u5);
        kotlin.jvm.internal.l.f("flexibleId", str);
        kotlin.jvm.internal.l.f("lowerBound", b4);
        kotlin.jvm.internal.l.f("upperBound", b7);
        return !str.equals("kotlin.jvm.PlatformType") ? p5.l.c(p5.k.f14449w, str, b4.toString(), b7.toString()) : u5.l(U4.j.f9303g) ? new M4.i(b4, b7) : AbstractC1566c.f(b4, b7);
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ u4.Q b0(q5.h hVar, int i7) {
        return AbstractC1707g.r(hVar, i7);
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ void c0(q5.e eVar) {
        AbstractC1707g.P(eVar);
    }

    @Override // o5.InterfaceC1702b
    public AbstractC1880i d() {
        throw new UnsupportedOperationException("Not supported");
    }

    @Override // o5.InterfaceC1702b
    public boolean e0(q5.e eVar) {
        kotlin.jvm.internal.l.f("<this>", eVar);
        B bH = AbstractC1707g.h(eVar);
        return (bH != null ? AbstractC1707g.e(this, n(bH)) : null) != null;
    }

    @Override // o5.InterfaceC1702b
    public boolean f0(q5.e eVar) {
        kotlin.jvm.internal.l.f("<this>", eVar);
        return AbstractC1707g.B(AbstractC1707g.Z(eVar));
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ q5.c g0(B b4) {
        return AbstractC1707g.e(this, b4);
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ C1701a h0(q5.e eVar) {
        return AbstractC1707g.X(this, eVar);
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ B i(AbstractC1580q abstractC1580q) {
        return AbstractC1707g.b0(abstractC1580q);
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ boolean i0(q5.e eVar, q5.e eVar2) {
        return AbstractC1707g.z(eVar, eVar2);
    }

    public q5.d j(q5.d dVar) {
        B bC0;
        kotlin.jvm.internal.l.f("<this>", dVar);
        B bH = AbstractC1707g.h(dVar);
        return (bH == null || (bC0 = AbstractC1707g.c0(bH, true)) == null) ? dVar : bC0;
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ boolean k(q5.c cVar) {
        return AbstractC1707g.M(cVar);
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ boolean k0(q5.e eVar) {
        return AbstractC1707g.E(eVar);
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ boolean l(q5.h hVar, q5.h hVar2) {
        return AbstractC1707g.b(hVar, hVar2);
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ q5.j l0(u4.Q q6) {
        return AbstractC1707g.w(q6);
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ B m(AbstractC1580q abstractC1580q) {
        return AbstractC1707g.Q(abstractC1580q);
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ B m0(AbstractC1580q abstractC1580q) {
        return AbstractC1707g.Q(abstractC1580q);
    }

    public q5.f n(q5.e eVar) {
        B b4;
        C1575l c1575lF = AbstractC1707g.f(eVar);
        return (c1575lF == null || (b4 = c1575lF.f13402l) == null) ? (q5.f) eVar : b4;
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ AbstractC1580q p0(q5.d dVar) {
        return AbstractC1707g.g(dVar);
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ q5.g q(q5.e eVar) {
        return AbstractC1707g.d(eVar);
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ Collection q0(q5.e eVar) {
        return AbstractC1707g.U(this, eVar);
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ boolean r(Q q6) {
        return AbstractC1707g.N(q6);
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ int t(q5.h hVar) {
        return AbstractC1707g.T(hVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o5.InterfaceC1702b
    public Q t0(q5.g gVar, int i7) {
        kotlin.jvm.internal.l.f("<this>", gVar);
        if (gVar instanceof q5.f) {
            return AbstractC1707g.p((q5.d) gVar, i7);
        }
        if (gVar instanceof C1858a) {
            E e7 = ((C1858a) gVar).get(i7);
            kotlin.jvm.internal.l.e("get(...)", e7);
            return (Q) e7;
        }
        throw new IllegalStateException(("unknown type argument list type: " + gVar + ", " + y.a.b(gVar.getClass())).toString());
    }

    @Override // o5.InterfaceC1702b
    public boolean u0(a0 a0Var) {
        kotlin.jvm.internal.l.f("<this>", a0Var);
        return AbstractC1707g.I(O0(a0Var)) != AbstractC1707g.I(E(a0Var));
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ B v(q5.d dVar) {
        return AbstractC1707g.h(dVar);
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ B v0(AbstractC1580q abstractC1580q) {
        return AbstractC1707g.b0(abstractC1580q);
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ B w(q5.e eVar) {
        q5.b bVar = q5.b.f14745k;
        return AbstractC1707g.j(eVar);
    }

    @Override // o5.InterfaceC1702b
    public boolean w0(q5.d dVar) {
        kotlin.jvm.internal.l.f("<this>", dVar);
        B bH = AbstractC1707g.h(dVar);
        return (bH != null ? AbstractC1707g.f(bH) : null) != null;
    }

    @Override // o5.InterfaceC1702b
    public boolean x(q5.e eVar) {
        kotlin.jvm.internal.l.f("<this>", eVar);
        return AbstractC1707g.f(eVar) != null;
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ M y(q5.e eVar) {
        return AbstractC1707g.Z(eVar);
    }

    @Override // o5.InterfaceC1702b
    public /* bridge */ G y0(q5.d dVar) {
        return AbstractC1707g.i(dVar);
    }

    @Override // o5.InterfaceC1702b
    public q5.c z(q5.e eVar) {
        return AbstractC1707g.e(this, n(eVar));
    }

    @Override // o5.InterfaceC1702b
    public Q z0(q5.e eVar, int i7) {
        if (i7 < 0 || i7 >= AbstractC1707g.c(eVar)) {
            return null;
        }
        return AbstractC1707g.p(eVar, i7);
    }

    @Override // o5.InterfaceC1702b
    public void C(q5.e eVar, q5.h hVar) {
    }
}
