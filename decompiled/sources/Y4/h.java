package Y4;

import D.x0;
import H4.u;
import X4.y;
import b1.AbstractC0703b;
import b5.C0719a;
import f1.AbstractC0870c;
import f1.AbstractC0871d;
import f6.AbstractC0915m;
import io.ktor.http.LinkHeader;
import io.ktor.sse.ServerSentEventKt;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l4.InterfaceC1443v;
import m5.C1520i;
import m5.EnumC1522k;
import n5.AbstractC1566c;
import n5.AbstractC1580q;
import n5.AbstractC1586x;
import n5.B;
import n5.C1564a;
import n5.C1575l;
import n5.C1585w;
import n5.C1588z;
import n5.M;
import n5.Q;
import n5.Y;
import n5.a0;
import r4.AbstractC1880i;
import r4.AbstractC1886o;
import u4.AbstractC2108n;
import u4.C2087C;
import u4.EnumC2100f;
import u4.EnumC2117x;
import u4.InterfaceC2088D;
import u4.InterfaceC2092H;
import u4.InterfaceC2097c;
import u4.InterfaceC2099e;
import u4.InterfaceC2102h;
import u4.InterfaceC2103i;
import u4.InterfaceC2105k;
import u4.InterfaceC2106l;
import u4.InterfaceC2116w;
import u4.InterfaceC2118y;
import u4.K;
import u4.P;
import u4.U;
import v4.EnumC2156d;
import v4.InterfaceC2153a;
import v4.InterfaceC2154b;
import x4.C2264J;
import x4.C2265K;
import x4.C2272S;
import x4.C2283j;
import x4.C2292s;
import x4.C2295v;
import z5.AbstractC2510o;
import z5.AbstractC2517v;

/* loaded from: classes.dex */
public final class h implements j {

    /* renamed from: c, reason: collision with root package name */
    public static final h f10162c;

    /* renamed from: d, reason: collision with root package name */
    public static final h f10163d;

    /* renamed from: e, reason: collision with root package name */
    public static final h f10164e;
    public final l a;

    /* renamed from: b, reason: collision with root package name */
    public final O3.q f10165b = z1.c.C(new u(4, this));

    static {
        q0.c.V(d.f10141l);
        q0.c.V(d.f10143n);
        q0.c.V(d.f10144o);
        q0.c.V(d.f10145p);
        q0.c.V(d.f10146q);
        q0.c.V(d.f10147r);
        f10162c = q0.c.V(d.f10148s);
        q0.c.V(d.f10149t);
        f10163d = q0.c.V(d.f10150u);
        f10164e = q0.c.V(d.f10151v);
        q0.c.V(d.f10142m);
    }

    public h(l lVar) {
        this.a = lVar;
    }

    public static void T(StringBuilder sb) {
        int length = sb.length();
        if (length == 0 || sb.charAt(length - 1) != ' ') {
            sb.append(' ');
        }
    }

    public static boolean f0(AbstractC1586x abstractC1586x) {
        if (!AbstractC0871d.g0(abstractC1586x)) {
            return false;
        }
        List listQ0 = abstractC1586x.q0();
        if (listQ0 != null && listQ0.isEmpty()) {
            return true;
        }
        Iterator it = listQ0.iterator();
        while (it.hasNext()) {
            if (((Q) it.next()).c()) {
                return false;
            }
        }
        return true;
    }

    public static final void l(h hVar, K k7, StringBuilder sb) {
        if (!hVar.o()) {
            l lVar = hVar.a;
            InterfaceC1443v[] interfaceC1443vArr = l.f10184Y;
            if (!((Boolean) lVar.f10212g.getValue(lVar, interfaceC1443vArr[5])).booleanValue()) {
                List listM = k7.M();
                kotlin.jvm.internal.l.e("getContextReceiverParameters(...)", listM);
                hVar.z(sb, listM);
                if (hVar.n().contains(i.f10173q)) {
                    hVar.v(sb, k7, null);
                    C2292s c2292sL = k7.L();
                    if (c2292sL != null) {
                        hVar.v(sb, c2292sL, EnumC2156d.f16639l);
                    }
                    C2292s c2292sG = k7.G();
                    if (c2292sG != null) {
                        hVar.v(sb, c2292sG, EnumC2156d.f16647t);
                    }
                    if (((q) lVar.f10192H.getValue(lVar, interfaceC1443vArr[32])) == q.f10240l) {
                        C2264J getter = k7.getGetter();
                        if (getter != null) {
                            hVar.v(sb, getter, EnumC2156d.f16642o);
                        }
                        C2265K setter = k7.getSetter();
                        if (setter != null) {
                            hVar.v(sb, setter, EnumC2156d.f16643p);
                            List listM0 = setter.m0();
                            kotlin.jvm.internal.l.e("getValueParameters(...)", listM0);
                            C2272S c2272s = (C2272S) P3.q.K0(listM0);
                            kotlin.jvm.internal.l.c(c2272s);
                            hVar.v(sb, c2272s, EnumC2156d.f16646s);
                        }
                    }
                }
                H4.o visibility = k7.getVisibility();
                kotlin.jvm.internal.l.e("getVisibility(...)", visibility);
                hVar.d0(visibility, sb);
                hVar.K(sb, hVar.n().contains(i.f10180x) && k7.isConst(), "const");
                hVar.H(k7, sb);
                hVar.J(k7, sb);
                hVar.P(k7, sb);
                hVar.K(sb, hVar.n().contains(i.f10181y) && k7.O(), "lateinit");
                hVar.G(k7, sb);
            }
            hVar.a0(k7, sb, false);
            List typeParameters = k7.getTypeParameters();
            kotlin.jvm.internal.l.e("getTypeParameters(...)", typeParameters);
            hVar.Z(sb, typeParameters, true);
            hVar.R(k7, sb);
        }
        hVar.M(k7, sb, true);
        sb.append(": ");
        AbstractC1586x type = k7.getType();
        kotlin.jvm.internal.l.e("getType(...)", type);
        sb.append(hVar.U(type));
        hVar.S(k7, sb);
        hVar.E(k7, sb);
        List typeParameters2 = k7.getTypeParameters();
        kotlin.jvm.internal.l.e("getTypeParameters(...)", typeParameters2);
        hVar.e0(sb, typeParameters2);
    }

    public static EnumC2117x s(InterfaceC2116w interfaceC2116w) {
        if (interfaceC2116w instanceof InterfaceC2099e) {
            return ((InterfaceC2099e) interfaceC2116w).c() == EnumC2100f.f16312l ? EnumC2117x.f16345o : EnumC2117x.f16342l;
        }
        InterfaceC2105k interfaceC2105kK = interfaceC2116w.k();
        InterfaceC2099e interfaceC2099e = interfaceC2105kK instanceof InterfaceC2099e ? (InterfaceC2099e) interfaceC2105kK : null;
        if (interfaceC2099e == null) {
            return EnumC2117x.f16342l;
        }
        if (!(interfaceC2116w instanceof InterfaceC2097c)) {
            return EnumC2117x.f16342l;
        }
        InterfaceC2097c interfaceC2097c = (InterfaceC2097c) interfaceC2116w;
        Collection collectionM = interfaceC2097c.m();
        kotlin.jvm.internal.l.e("getOverriddenDescriptors(...)", collectionM);
        if (!collectionM.isEmpty() && interfaceC2099e.e() != EnumC2117x.f16342l) {
            return EnumC2117x.f16344n;
        }
        if (interfaceC2099e.c() != EnumC2100f.f16312l || kotlin.jvm.internal.l.a(interfaceC2097c.getVisibility(), AbstractC2108n.a)) {
            return EnumC2117x.f16342l;
        }
        EnumC2117x enumC2117xE = interfaceC2097c.e();
        EnumC2117x enumC2117x = EnumC2117x.f16345o;
        return enumC2117xE == enumC2117x ? enumC2117x : EnumC2117x.f16344n;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A(java.lang.StringBuilder r6, n5.B r7) {
        /*
            r5 = this;
            w(r5, r6, r7)
            boolean r0 = r7 instanceof n5.C1575l
            boolean r0 = n5.AbstractC1566c.k(r7)
            r1 = 0
            if (r0 == 0) goto L8c
            boolean r0 = r7 instanceof p5.i
            if (r0 == 0) goto L1b
            r2 = r7
            p5.i r2 = (p5.i) r2
            p5.k r2 = r2.f14418n
            boolean r2 = r2.f14454l
            if (r2 == 0) goto L1b
            r2 = 1
            goto L1c
        L1b:
            r2 = r1
        L1c:
            Y4.l r3 = r5.a
            if (r2 == 0) goto L56
            l4.v[] r2 = Y4.l.f10184Y
            r4 = 47
            r2 = r2[r4]
            Y4.k r4 = r3.f10204V
            java.lang.Object r2 = r4.getValue(r3, r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L56
            p5.l r2 = p5.l.a
            if (r0 == 0) goto L3f
            r0 = r7
            p5.i r0 = (p5.i) r0
            p5.k r0 = r0.f14418n
            boolean r0 = r0.f14454l
        L3f:
            n5.M r0 = r7.t0()
            java.lang.String r2 = "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor"
            kotlin.jvm.internal.l.d(r2, r0)
            p5.j r0 = (p5.j) r0
            java.lang.String[] r0 = r0.f14423b
            r0 = r0[r1]
            java.lang.String r0 = r5.B(r0)
            r6.append(r0)
            goto Lbc
        L56:
            if (r0 == 0) goto L75
            l4.v[] r0 = Y4.l.f10184Y
            r1 = 49
            r0 = r0[r1]
            Y4.k r1 = r3.f10206X
            java.lang.Object r0 = r1.getValue(r3, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L75
            r0 = r7
            p5.i r0 = (p5.i) r0
            java.lang.String r0 = r0.f14422r
            r6.append(r0)
            goto L80
        L75:
            n5.M r0 = r7.t0()
            java.lang.String r0 = r0.toString()
            r6.append(r0)
        L80:
            java.util.List r0 = r7.q0()
            java.lang.String r0 = r5.V(r0)
            r6.append(r0)
            goto Lbc
        L8c:
            n5.M r0 = r7.t0()
            n5.M r2 = r7.t0()
            u4.h r2 = r2.f()
            boolean r3 = r2 instanceof u4.InterfaceC2103i
            if (r3 == 0) goto L9f
            u4.i r2 = (u4.InterfaceC2103i) r2
            goto La0
        L9f:
            r2 = 0
        La0:
            B2.l r1 = u4.AbstractC2115v.a(r7, r2, r1)
            if (r1 != 0) goto Lb9
            java.lang.String r0 = r5.W(r0)
            r6.append(r0)
            java.util.List r0 = r7.q0()
            java.lang.String r0 = r5.V(r0)
            r6.append(r0)
            goto Lbc
        Lb9:
            r5.Q(r6, r1)
        Lbc:
            boolean r0 = r7.u0()
            if (r0 == 0) goto Lc7
            java.lang.String r0 = "?"
            r6.append(r0)
        Lc7:
            boolean r7 = r7 instanceof n5.C1575l
            if (r7 == 0) goto Ld0
            java.lang.String r7 = " & Any"
            r6.append(r7)
        Ld0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y4.h.A(java.lang.StringBuilder, n5.B):void");
    }

    public final String B(String str) {
        int iOrdinal = p().ordinal();
        if (iOrdinal == 0) {
            return str;
        }
        if (iOrdinal == 1) {
            return AbstractC0703b.j("<font color=red><b>", str, "</b></font>");
        }
        throw new D6.r();
    }

    public final String C(String str, String str2, AbstractC1880i abstractC1880i) {
        kotlin.jvm.internal.l.f("lowerRendered", str);
        kotlin.jvm.internal.l.f("upperRendered", str2);
        if (z1.c.N(str, str2)) {
            return AbstractC2517v.T(str2, "(", false) ? AbstractC0703b.j("(", str, ")!") : str.concat("!");
        }
        String strH = z1.c.H(str, str2, new f(this, abstractC1880i, 0), new f(this, abstractC1880i, 1), new x0(1, this, h.class, "escape", "escape(Ljava/lang/String;)Ljava/lang/String;", 0, 6));
        if (strH != null) {
            return strH;
        }
        return "(" + str + ".." + str2 + ')';
    }

    public final String D(AbstractC1586x abstractC1586x) throws IOException {
        String strU = U(abstractC1586x);
        return ((!f0(abstractC1586x) || Y.e(abstractC1586x)) && !(abstractC1586x instanceof C1575l)) ? strU : A6.b.d(')', "(", strU);
    }

    public final void E(U u5, StringBuilder sb) {
        b5.g gVarH0;
        String strY;
        l lVar = this.a;
        if (!((Boolean) lVar.f10226u.getValue(lVar, l.f10184Y[19])).booleanValue() || (gVarH0 = u5.h0()) == null || (strY = y(gVarH0)) == null) {
            return;
        }
        sb.append(" = ");
        sb.append(m(strY));
    }

    public final String F(String str) {
        int iOrdinal = p().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                throw new D6.r();
            }
            l lVar = this.a;
            if (!((Boolean) lVar.f10205W.getValue(lVar, l.f10184Y[48])).booleanValue()) {
                return AbstractC0703b.j("<b>", str, "</b>");
            }
        }
        return str;
    }

    public final void G(InterfaceC2097c interfaceC2097c, StringBuilder sb) {
        String str;
        if (n().contains(i.f10175s) && r() && interfaceC2097c.c() != 1) {
            sb.append("/*");
            int iC = interfaceC2097c.c();
            if (iC == 1) {
                str = "DECLARATION";
            } else if (iC == 2) {
                str = "FAKE_OVERRIDE";
            } else if (iC == 3) {
                str = "DELEGATION";
            } else {
                if (iC != 4) {
                    throw null;
                }
                str = "SYNTHESIZED";
            }
            sb.append(AbstractC0870c.h0(str));
            sb.append("*/ ");
        }
    }

    public final void H(InterfaceC2116w interfaceC2116w, StringBuilder sb) {
        K(sb, interfaceC2116w.isExternal(), "external");
        boolean z7 = false;
        K(sb, n().contains(i.f10178v) && interfaceC2116w.Q(), "expect");
        if (n().contains(i.f10179w) && interfaceC2116w.i0()) {
            z7 = true;
        }
        K(sb, z7, "actual");
    }

    public final void I(EnumC2117x enumC2117x, StringBuilder sb, EnumC2117x enumC2117x2) {
        l lVar = this.a;
        if (((Boolean) lVar.f10221p.getValue(lVar, l.f10184Y[14])).booleanValue() || enumC2117x != enumC2117x2) {
            K(sb, n().contains(i.f10171o), AbstractC0870c.h0(enumC2117x.name()));
        }
    }

    public final void J(InterfaceC2097c interfaceC2097c, StringBuilder sb) {
        if (Z4.e.r(interfaceC2097c) && interfaceC2097c.e() == EnumC2117x.f16342l) {
            return;
        }
        l lVar = this.a;
        if (((o) lVar.f10186B.getValue(lVar, l.f10184Y[26])) == o.f10232k && interfaceC2097c.e() == EnumC2117x.f16344n && !interfaceC2097c.m().isEmpty()) {
            return;
        }
        EnumC2117x enumC2117xE = interfaceC2097c.e();
        kotlin.jvm.internal.l.e("getModality(...)", enumC2117xE);
        I(enumC2117xE, sb, s(interfaceC2097c));
    }

    public final void K(StringBuilder sb, boolean z7, String str) {
        if (z7) {
            sb.append(F(str));
            sb.append(ServerSentEventKt.SPACE);
        }
    }

    public final String L(W4.e eVar, boolean z7) {
        String strM = m(z1.c.G(eVar));
        l lVar = this.a;
        return (((Boolean) lVar.f10205W.getValue(lVar, l.f10184Y[48])).booleanValue() && p() == t.f10243l && z7) ? AbstractC0703b.j("<b>", strM, "</b>") : strM;
    }

    public final void M(InterfaceC2105k interfaceC2105k, StringBuilder sb, boolean z7) {
        W4.e name = interfaceC2105k.getName();
        kotlin.jvm.internal.l.e("getName(...)", name);
        sb.append(L(name, z7));
    }

    public final void N(StringBuilder sb, AbstractC1586x abstractC1586x) throws IOException {
        a0 a0VarW0 = abstractC1586x.w0();
        C1564a c1564a = a0VarW0 instanceof C1564a ? (C1564a) a0VarW0 : null;
        if (c1564a == null) {
            O(sb, abstractC1586x);
            return;
        }
        l lVar = this.a;
        InterfaceC1443v[] interfaceC1443vArr = l.f10184Y;
        boolean zBooleanValue = ((Boolean) lVar.f10200R.getValue(lVar, interfaceC1443vArr[42])).booleanValue();
        B b4 = c1564a.f13389m;
        B b7 = c1564a.f13388l;
        if (zBooleanValue) {
            O(sb, b7);
            if (((Boolean) lVar.f10201S.getValue(lVar, interfaceC1443vArr[43])).booleanValue()) {
                t tVarP = p();
                r rVar = t.f10243l;
                if (tVarP == rVar) {
                    sb.append("<font color=\"808080\"><i>");
                }
                sb.append(" /* ");
                sb.append("from: ");
                O(sb, b4);
                sb.append(" */");
                if (p() == rVar) {
                    sb.append("</i></font>");
                    return;
                }
                return;
            }
            return;
        }
        O(sb, b4);
        if (((Boolean) lVar.f10199Q.getValue(lVar, interfaceC1443vArr[41])).booleanValue()) {
            t tVarP2 = p();
            r rVar2 = t.f10243l;
            if (tVarP2 == rVar2) {
                sb.append("<font color=\"808080\"><i>");
            }
            sb.append(" /* ");
            sb.append("= ");
            O(sb, b7);
            sb.append(" */");
            if (p() == rVar2) {
                sb.append("</i></font>");
            }
        }
    }

    public final void O(StringBuilder sb, AbstractC1586x abstractC1586x) throws IOException {
        W4.e eVarT;
        String strM;
        boolean z7 = abstractC1586x instanceof C1588z;
        l lVar = this.a;
        if (z7 && lVar.l()) {
            C1520i c1520i = ((C1588z) abstractC1586x).f13425n;
            if (c1520i.f12982m == EnumC1522k.f12986k || c1520i.f12982m == EnumC1522k.f12987l) {
                sb.append("<Not computed yet>");
                return;
            }
        }
        a0 a0VarW0 = abstractC1586x.w0();
        if (a0VarW0 instanceof AbstractC1580q) {
            sb.append(((AbstractC1580q) a0VarW0).B0(this, this));
            return;
        }
        if (!(a0VarW0 instanceof B)) {
            throw new D6.r();
        }
        B b4 = (B) a0VarW0;
        if (b4.equals(Y.f13385b) || b4.t0() == Y.a.f14416l) {
            sb.append("???");
            return;
        }
        M mT0 = b4.t0();
        if ((mT0 instanceof p5.j) && ((p5.j) mT0).a == p5.k.f14446t) {
            if (!((Boolean) lVar.f10225t.getValue(lVar, l.f10184Y[18])).booleanValue()) {
                sb.append("???");
                return;
            }
            M mT02 = b4.t0();
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor", mT02);
            sb.append(B(((p5.j) mT02).f14423b[0]));
            return;
        }
        if (AbstractC1566c.k(b4)) {
            A(sb, b4);
            return;
        }
        if (!f0(b4)) {
            A(sb, b4);
            return;
        }
        int length = sb.length();
        ((h) this.f10165b.getValue()).v(sb, b4, null);
        boolean z8 = sb.length() != length;
        AbstractC1586x abstractC1586xD0 = AbstractC0871d.d0(b4);
        List listY = AbstractC0871d.Y(b4);
        boolean zK0 = AbstractC0871d.k0(b4);
        boolean zU0 = b4.u0();
        boolean z9 = zU0 || (z8 && abstractC1586xD0 != null);
        if (z9) {
            if (zK0) {
                sb.insert(length, '(');
            } else {
                if (z8) {
                    AbstractC0915m.B(AbstractC2510o.h0(sb));
                    if (sb.charAt(AbstractC2510o.b0(sb) - 1) != ')') {
                        sb.insert(AbstractC2510o.b0(sb), "()");
                    }
                }
                sb.append("(");
            }
        }
        K(sb, zK0, "suspend");
        if (!listY.isEmpty()) {
            sb.append("context(");
            Iterator it = listY.subList(0, P3.r.y(listY)).iterator();
            while (it.hasNext()) {
                N(sb, (AbstractC1586x) it.next());
                sb.append(", ");
            }
            N(sb, (AbstractC1586x) P3.q.A0(listY));
            sb.append(") ");
        }
        if (abstractC1586xD0 != null) {
            boolean z10 = (f0(abstractC1586xD0) && !abstractC1586xD0.u0()) || AbstractC0871d.k0(abstractC1586xD0) || !abstractC1586xD0.getAnnotations().isEmpty() || (abstractC1586xD0 instanceof C1575l);
            if (z10) {
                sb.append("(");
            }
            N(sb, abstractC1586xD0);
            if (z10) {
                sb.append(")");
            }
            sb.append(".");
        }
        sb.append("(");
        if (!AbstractC0871d.g0(b4) || b4.getAnnotations().l(AbstractC1886o.f15008p) == null || b4.q0().size() > 1) {
            int i7 = 0;
            for (Q q6 : AbstractC0871d.e0(b4)) {
                int i8 = i7 + 1;
                if (i7 > 0) {
                    sb.append(", ");
                }
                if (((Boolean) lVar.f10203U.getValue(lVar, l.f10184Y[45])).booleanValue()) {
                    AbstractC1586x abstractC1586xB = q6.b();
                    kotlin.jvm.internal.l.e("getType(...)", abstractC1586xB);
                    eVarT = AbstractC0871d.T(abstractC1586xB);
                } else {
                    eVarT = null;
                }
                if (eVarT != null) {
                    sb.append(L(eVarT, false));
                    sb.append(": ");
                }
                kotlin.jvm.internal.l.f("typeProjection", q6);
                StringBuilder sb2 = new StringBuilder();
                P3.q.x0(P3.r.H(q6), sb2, ", ", null, null, new g(this, 0), 60);
                sb.append(sb2.toString());
                i7 = i8;
            }
        } else {
            sb.append("???");
        }
        sb.append(") ");
        int iOrdinal = p().ordinal();
        if (iOrdinal == 0) {
            strM = m("->");
        } else {
            if (iOrdinal != 1) {
                throw new D6.r();
            }
            strM = "&rarr;";
        }
        sb.append(strM);
        sb.append(ServerSentEventKt.SPACE);
        AbstractC0871d.g0(b4);
        AbstractC1586x abstractC1586xB2 = ((Q) P3.q.A0(b4.q0())).b();
        kotlin.jvm.internal.l.e("getType(...)", abstractC1586xB2);
        N(sb, abstractC1586xB2);
        if (z9) {
            sb.append(")");
        }
        if (zU0) {
            sb.append("?");
        }
    }

    public final void P(InterfaceC2097c interfaceC2097c, StringBuilder sb) {
        if (n().contains(i.f10172p) && !interfaceC2097c.m().isEmpty()) {
            l lVar = this.a;
            if (((o) lVar.f10186B.getValue(lVar, l.f10184Y[26])) != o.f10233l) {
                K(sb, true, "override");
                if (r()) {
                    sb.append("/*");
                    sb.append(interfaceC2097c.m().size());
                    sb.append("*/ ");
                }
            }
        }
    }

    public final void Q(StringBuilder sb, B2.l lVar) {
        B2.l lVar2 = (B2.l) lVar.f418n;
        InterfaceC2103i interfaceC2103i = (InterfaceC2103i) lVar.f417m;
        if (lVar2 != null) {
            Q(sb, lVar2);
            sb.append('.');
            W4.e name = interfaceC2103i.getName();
            kotlin.jvm.internal.l.e("getName(...)", name);
            sb.append(L(name, false));
        } else {
            M mV = interfaceC2103i.v();
            kotlin.jvm.internal.l.e("getTypeConstructor(...)", mV);
            sb.append(W(mV));
        }
        sb.append(V((List) lVar.f416l));
    }

    public final void R(InterfaceC2097c interfaceC2097c, StringBuilder sb) {
        C2295v c2295vD = interfaceC2097c.D();
        if (c2295vD != null) {
            v(sb, c2295vD, EnumC2156d.f16644q);
            sb.append(D(c2295vD.getType()));
            sb.append(".");
        }
    }

    public final void S(InterfaceC2097c interfaceC2097c, StringBuilder sb) {
        C2295v c2295vD;
        l lVar = this.a;
        if (((Boolean) lVar.f10190F.getValue(lVar, l.f10184Y[30])).booleanValue() && (c2295vD = interfaceC2097c.D()) != null) {
            sb.append(" on ");
            sb.append(U(c2295vD.getType()));
        }
    }

    public final String U(AbstractC1586x abstractC1586x) throws IOException {
        kotlin.jvm.internal.l.f(LinkHeader.Parameters.Type, abstractC1586x);
        StringBuilder sb = new StringBuilder();
        l lVar = this.a;
        N(sb, (AbstractC1586x) ((e4.k) lVar.f10230y.getValue(lVar, l.f10184Y[23])).invoke(abstractC1586x));
        return sb.toString();
    }

    public final String V(List list) throws IOException {
        kotlin.jvm.internal.l.f("typeArguments", list);
        if (list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(m("<"));
        P3.q.x0(list, sb, ", ", null, null, new g(this, 0), 60);
        sb.append(m(">"));
        return sb.toString();
    }

    public final String W(M m7) {
        kotlin.jvm.internal.l.f("typeConstructor", m7);
        InterfaceC2102h interfaceC2102hF = m7.f();
        if ((interfaceC2102hF instanceof u4.Q) || (interfaceC2102hF instanceof InterfaceC2099e) || (interfaceC2102hF instanceof P)) {
            kotlin.jvm.internal.l.f("klass", interfaceC2102hF);
            if (p5.l.f(interfaceC2102hF)) {
                return interfaceC2102hF.v().toString();
            }
            l lVar = this.a;
            return ((c) lVar.f10207b.getValue(lVar, l.f10184Y[0])).a(interfaceC2102hF, this);
        }
        if (interfaceC2102hF == null) {
            return m7 instanceof C1585w ? ((C1585w) m7).c(d.f10152w) : m7.toString();
        }
        throw new IllegalStateException(("Unexpected classifier: " + interfaceC2102hF.getClass()).toString());
    }

    public final void X(u4.Q q6, StringBuilder sb, boolean z7) {
        if (z7) {
            sb.append(m("<"));
        }
        if (r()) {
            sb.append("/*");
            sb.append(q6.getIndex());
            sb.append("*/ ");
        }
        K(sb, q6.J(), "reified");
        String str = q6.R().f13394k;
        boolean z8 = true;
        K(sb, str.length() > 0, str);
        v(sb, q6, null);
        M(q6, sb, z7);
        int size = q6.getUpperBounds().size();
        if ((size > 1 && !z7) || size == 1) {
            AbstractC1586x abstractC1586x = (AbstractC1586x) q6.getUpperBounds().iterator().next();
            if (abstractC1586x == null) {
                AbstractC1880i.a(141);
                throw null;
            }
            if (!AbstractC1880i.x(abstractC1586x) || !abstractC1586x.u0()) {
                sb.append(" : ");
                sb.append(U(abstractC1586x));
            }
        } else if (z7) {
            for (AbstractC1586x abstractC1586x2 : q6.getUpperBounds()) {
                if (abstractC1586x2 == null) {
                    AbstractC1880i.a(141);
                    throw null;
                }
                if (!AbstractC1880i.x(abstractC1586x2) || !abstractC1586x2.u0()) {
                    if (z8) {
                        sb.append(" : ");
                    } else {
                        sb.append(" & ");
                    }
                    sb.append(U(abstractC1586x2));
                    z8 = false;
                }
            }
        }
        if (z7) {
            sb.append(m(">"));
        }
    }

    public final void Y(StringBuilder sb, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            X((u4.Q) it.next(), sb, false);
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
    }

    public final void Z(StringBuilder sb, List list, boolean z7) {
        l lVar = this.a;
        if (((Boolean) lVar.f10228w.getValue(lVar, l.f10184Y[21])).booleanValue() || list.isEmpty()) {
            return;
        }
        sb.append(m("<"));
        Y(sb, list);
        sb.append(m(">"));
        if (z7) {
            sb.append(ServerSentEventKt.SPACE);
        }
    }

    @Override // Y4.j
    public final void a() {
        this.a.a();
    }

    public final void a0(U u5, StringBuilder sb, boolean z7) {
        if (z7 || !(u5 instanceof C2272S)) {
            sb.append(F(u5.A() ? "var" : "val"));
            sb.append(ServerSentEventKt.SPACE);
        }
    }

    @Override // Y4.j
    public final void b() {
        this.a.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b0(x4.C2272S r11, boolean r12, java.lang.StringBuilder r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y4.h.b0(x4.S, boolean, java.lang.StringBuilder, boolean):void");
    }

    @Override // Y4.j
    public final void c() {
        this.a.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c0(java.lang.StringBuilder r8, java.util.List r9, boolean r10) {
        /*
            r7 = this;
            Y4.l r0 = r7.a
            l4.v[] r1 = Y4.l.f10184Y
            r2 = 29
            r1 = r1[r2]
            Y4.k r2 = r0.f10189E
            java.lang.Object r0 = r2.getValue(r0, r1)
            Y4.p r0 = (Y4.p) r0
            int r0 = r0.ordinal()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L27
            if (r0 == r1) goto L25
            r10 = 2
            if (r0 != r10) goto L1f
        L1d:
            r10 = r2
            goto L28
        L1f:
            D6.r r8 = new D6.r
            r8.<init>()
            throw r8
        L25:
            if (r10 != 0) goto L1d
        L27:
            r10 = r1
        L28:
            int r0 = r9.size()
            Y4.e r3 = r7.q()
            r3.getClass()
            java.lang.String r3 = "builder"
            kotlin.jvm.internal.l.f(r3, r8)
            java.lang.String r3 = "("
            r8.append(r3)
            java.util.Iterator r9 = r9.iterator()
            r3 = r2
        L42:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto L71
            int r4 = r3 + 1
            java.lang.Object r5 = r9.next()
            x4.S r5 = (x4.C2272S) r5
            Y4.e r6 = r7.q()
            r6.getClass()
            java.lang.String r6 = "parameter"
            kotlin.jvm.internal.l.f(r6, r5)
            r7.b0(r5, r10, r8, r2)
            Y4.e r5 = r7.q()
            r5.getClass()
            int r5 = r0 + (-1)
            if (r3 == r5) goto L6f
            java.lang.String r3 = ", "
            r8.append(r3)
        L6f:
            r3 = r4
            goto L42
        L71:
            Y4.e r9 = r7.q()
            r9.getClass()
            java.lang.String r9 = ")"
            r8.append(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y4.h.c0(java.lang.StringBuilder, java.util.List, boolean):void");
    }

    @Override // Y4.j
    public final void d(c cVar) {
        this.a.d(cVar);
    }

    public final boolean d0(H4.o oVar, StringBuilder sb) {
        if (!n().contains(i.f10170n)) {
            return false;
        }
        l lVar = this.a;
        InterfaceC1443v[] interfaceC1443vArr = l.f10184Y;
        if (((Boolean) lVar.f10219n.getValue(lVar, interfaceC1443vArr[12])).booleanValue()) {
            oVar = AbstractC2108n.f(oVar.a.c());
        }
        if (!((Boolean) lVar.f10220o.getValue(lVar, interfaceC1443vArr[13])).booleanValue() && kotlin.jvm.internal.l.a(oVar, AbstractC2108n.f16327j)) {
            return false;
        }
        sb.append(F(oVar.a.b()));
        sb.append(ServerSentEventKt.SPACE);
        return true;
    }

    @Override // Y4.j
    public final void e(p pVar) {
        this.a.e(pVar);
    }

    public final void e0(StringBuilder sb, List list) {
        l lVar = this.a;
        if (((Boolean) lVar.f10228w.getValue(lVar, l.f10184Y[21])).booleanValue()) {
            return;
        }
        ArrayList arrayList = new ArrayList(0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            u4.Q q6 = (u4.Q) it.next();
            List upperBounds = q6.getUpperBounds();
            kotlin.jvm.internal.l.e("getUpperBounds(...)", upperBounds);
            for (AbstractC1586x abstractC1586x : P3.q.o0(upperBounds, 1)) {
                StringBuilder sb2 = new StringBuilder();
                W4.e name = q6.getName();
                kotlin.jvm.internal.l.e("getName(...)", name);
                sb2.append(L(name, false));
                sb2.append(" : ");
                kotlin.jvm.internal.l.c(abstractC1586x);
                sb2.append(U(abstractC1586x));
                arrayList.add(sb2.toString());
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        sb.append(ServerSentEventKt.SPACE);
        sb.append(F("where"));
        sb.append(ServerSentEventKt.SPACE);
        P3.q.x0(arrayList, sb, ", ", null, null, null, 124);
    }

    @Override // Y4.j
    public final void f(Set set) {
        kotlin.jvm.internal.l.f("<set-?>", set);
        this.a.f(set);
    }

    @Override // Y4.j
    public final void g() {
        this.a.g();
    }

    @Override // Y4.j
    public final void h() {
        this.a.h();
    }

    @Override // Y4.j
    public final void i() {
        this.a.i();
    }

    @Override // Y4.j
    public final void j() {
        s sVar = t.f10242k;
        this.a.j();
    }

    @Override // Y4.j
    public final void k() {
        this.a.k();
    }

    public final String m(String str) {
        return p().a(str);
    }

    public final Set n() {
        l lVar = this.a;
        return (Set) lVar.f10210e.getValue(lVar, l.f10184Y[3]);
    }

    public final boolean o() {
        l lVar = this.a;
        return ((Boolean) lVar.f10211f.getValue(lVar, l.f10184Y[4])).booleanValue();
    }

    public final t p() {
        l lVar = this.a;
        return (t) lVar.f10188D.getValue(lVar, l.f10184Y[28]);
    }

    public final e q() {
        l lVar = this.a;
        return (e) lVar.f10187C.getValue(lVar, l.f10184Y[27]);
    }

    public final boolean r() {
        l lVar = this.a;
        return ((Boolean) lVar.f10215j.getValue(lVar, l.f10184Y[8])).booleanValue();
    }

    public final String t(InterfaceC2105k interfaceC2105k) {
        InterfaceC2105k interfaceC2105kK;
        String str;
        kotlin.jvm.internal.l.f("declarationDescriptor", interfaceC2105k);
        StringBuilder sb = new StringBuilder();
        interfaceC2105k.u(new y(1, this), sb);
        l lVar = this.a;
        k kVar = lVar.f10208c;
        InterfaceC1443v[] interfaceC1443vArr = l.f10184Y;
        if (((Boolean) kVar.getValue(lVar, interfaceC1443vArr[1])).booleanValue() && !(interfaceC2105k instanceof InterfaceC2088D) && !(interfaceC2105k instanceof InterfaceC2092H) && (interfaceC2105kK = interfaceC2105k.k()) != null && !(interfaceC2105kK instanceof InterfaceC2118y)) {
            sb.append(ServerSentEventKt.SPACE);
            int iOrdinal = p().ordinal();
            if (iOrdinal == 0) {
                str = "defined in";
            } else {
                if (iOrdinal != 1) {
                    throw new D6.r();
                }
                str = "<i>defined in</i>";
            }
            sb.append(str);
            sb.append(ServerSentEventKt.SPACE);
            W4.d dVarG = Z4.e.g(interfaceC2105kK);
            kotlin.jvm.internal.l.e("getFqName(...)", dVarG);
            sb.append(dVarG.c() ? "root package" : m(z1.c.I(W4.d.f(dVarG))));
            if (((Boolean) lVar.f10209d.getValue(lVar, interfaceC1443vArr[2])).booleanValue() && (interfaceC2105kK instanceof InterfaceC2088D) && (interfaceC2105k instanceof InterfaceC2106l)) {
                ((InterfaceC2106l) interfaceC2105k).l().getClass();
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String u(InterfaceC2154b interfaceC2154b, EnumC2156d enumC2156d) throws IOException {
        List listP;
        C2283j c2283jB0;
        List listM0;
        kotlin.jvm.internal.l.f("annotation", interfaceC2154b);
        StringBuilder sb = new StringBuilder();
        sb.append('@');
        if (enumC2156d != null) {
            sb.append(enumC2156d.f16649k + ':');
        }
        AbstractC1586x type = interfaceC2154b.getType();
        sb.append(U(type));
        l lVar = this.a;
        InterfaceC1443v[] interfaceC1443vArr = l.f10184Y;
        InterfaceC1443v interfaceC1443v = interfaceC1443vArr[38];
        k kVar = lVar.f10196N;
        if (((a) kVar.getValue(lVar, interfaceC1443v)).f10135k) {
            Map mapB = interfaceC2154b.b();
            P3.y yVar = null;
            InterfaceC2099e interfaceC2099eD = ((Boolean) lVar.I.getValue(lVar, interfaceC1443vArr[33])).booleanValue() ? d5.e.d(interfaceC2154b) : null;
            if (interfaceC2099eD != null && (c2283jB0 = interfaceC2099eD.b0()) != null && (listM0 = c2283jB0.m0()) != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : listM0) {
                    if (((C2272S) obj).O0()) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(P3.r.p(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((C2272S) it.next()).getName());
                }
                yVar = arrayList2;
            }
            if (yVar == null) {
                yVar = P3.y.f7779k;
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : yVar) {
                if (!mapB.containsKey((W4.e) obj2)) {
                    arrayList3.add(obj2);
                }
            }
            ArrayList arrayList4 = new ArrayList(P3.r.p(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList4.add(((W4.e) it2.next()).b() + " = ...");
            }
            Set<Map.Entry> setEntrySet = mapB.entrySet();
            ArrayList arrayList5 = new ArrayList(P3.r.p(setEntrySet, 10));
            for (Map.Entry entry : setEntrySet) {
                W4.e eVar = (W4.e) entry.getKey();
                b5.g gVar = (b5.g) entry.getValue();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(eVar.b());
                sb2.append(" = ");
                sb2.append(!yVar.contains(eVar) ? y(gVar) : "...");
                arrayList5.add(sb2.toString());
            }
            ArrayList arrayListG0 = P3.q.G0(arrayList4, arrayList5);
            if (arrayListG0.size() <= 1) {
                listP = P3.q.S0(arrayListG0);
            } else {
                Object[] array = arrayListG0.toArray(new Comparable[0]);
                Comparable[] comparableArr = (Comparable[]) array;
                kotlin.jvm.internal.l.f("<this>", comparableArr);
                if (comparableArr.length > 1) {
                    Arrays.sort(comparableArr);
                }
                listP = P3.m.P(array);
            }
            List list = listP;
            if (((a) kVar.getValue(lVar, l.f10184Y[38])).f10136l || !list.isEmpty()) {
                P3.q.x0(list, sb, ", ", "(", ")", null, 112);
            }
        }
        if (r() && (AbstractC1566c.k(type) || (type.t0().f() instanceof C2087C))) {
            sb.append(" /* annotation class not found */");
        }
        return sb.toString();
    }

    public final void v(StringBuilder sb, InterfaceC2153a interfaceC2153a, EnumC2156d enumC2156d) {
        if (n().contains(i.f10173q)) {
            boolean z7 = interfaceC2153a instanceof AbstractC1586x;
            l lVar = this.a;
            Set setM = z7 ? lVar.m() : (Set) lVar.f10193K.getValue(lVar, l.f10184Y[35]);
            e4.k kVar = (e4.k) lVar.f10195M.getValue(lVar, l.f10184Y[37]);
            for (InterfaceC2154b interfaceC2154b : interfaceC2153a.getAnnotations()) {
                if (!P3.q.m0(setM, interfaceC2154b.a()) && !kotlin.jvm.internal.l.a(interfaceC2154b.a(), AbstractC1886o.f15010r) && (kVar == null || ((Boolean) kVar.invoke(interfaceC2154b)).booleanValue())) {
                    sb.append(u(interfaceC2154b, enumC2156d));
                    if (((Boolean) lVar.J.getValue(lVar, l.f10184Y[34])).booleanValue()) {
                        sb.append('\n');
                    } else {
                        sb.append(ServerSentEventKt.SPACE);
                    }
                }
            }
        }
    }

    public final void x(InterfaceC2103i interfaceC2103i, StringBuilder sb) {
        List listN = interfaceC2103i.n();
        kotlin.jvm.internal.l.e("getDeclaredTypeParameters(...)", listN);
        List parameters = interfaceC2103i.v().getParameters();
        kotlin.jvm.internal.l.e("getParameters(...)", parameters);
        if (r() && interfaceC2103i.j() && parameters.size() > listN.size()) {
            sb.append(" /*captured type parameters: ");
            Y(sb, parameters.subList(listN.size(), parameters.size()));
            sb.append("*/");
        }
    }

    public final String y(b5.g gVar) {
        l lVar = this.a;
        e4.k kVar = (e4.k) lVar.f10227v.getValue(lVar, l.f10184Y[20]);
        if (kVar != null) {
            return (String) kVar.invoke(gVar);
        }
        if (gVar instanceof b5.b) {
            Iterable iterable = (Iterable) ((b5.b) gVar).a;
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                String strY = y((b5.g) it.next());
                if (strY != null) {
                    arrayList.add(strY);
                }
            }
            return P3.q.y0(arrayList, ", ", "{", "}", null, 56);
        }
        if (gVar instanceof C0719a) {
            return AbstractC2510o.o0(u((InterfaceC2154b) ((C0719a) gVar).a, null), "@");
        }
        if (!(gVar instanceof b5.s)) {
            return gVar.toString();
        }
        b5.r rVar = (b5.r) ((b5.s) gVar).a;
        if (rVar instanceof b5.p) {
            return ((b5.p) rVar).a + "::class";
        }
        if (!(rVar instanceof b5.q)) {
            throw new D6.r();
        }
        b5.q qVar = (b5.q) rVar;
        String strD = qVar.a.a.a().a.a;
        b5.f fVar = qVar.a;
        for (int i7 = 0; i7 < fVar.f10948b; i7++) {
            strD = A6.b.d('>', "kotlin.Array<", strD);
        }
        return A6.b.h(strD, "::class");
    }

    public final void z(StringBuilder sb, List list) {
        if (list.isEmpty()) {
            return;
        }
        sb.append("context(");
        Iterator it = list.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            int i8 = i7 + 1;
            C2295v c2295v = (C2295v) it.next();
            v(sb, c2295v, EnumC2156d.f16644q);
            sb.append(D(c2295v.getType()));
            if (i7 == P3.r.y(list)) {
                sb.append(") ");
            } else {
                sb.append(", ");
            }
            i7 = i8;
        }
    }
}
