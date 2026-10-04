package r3;

import A3.C0007b;
import B3.C0026b;
import L.AbstractC0399n;
import L.E0;
import L.F1;
import L.H2;
import L.M2;
import L.N;
import L.N2;
import L.P;
import L.Q1;
import L.q2;
import M0.u;
import O.C0486d;
import O.C0502l;
import O.C0509o0;
import O.C0510p;
import O.InterfaceC0501k0;
import O.T;
import O.Z;
import O3.C;
import a0.q;
import androidx.lifecycle.InterfaceC0684k;
import androidx.lifecycle.W;
import b1.AbstractC0703b;
import com.kusukanime.data.CommentRow;
import com.kusukanime.data.UserMini;
import e4.InterfaceC0821a;
import f1.AbstractC0871d;
import h0.AbstractC0968M;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.y;
import v.AbstractC2123b;
import v.AbstractC2130i;
import v.AbstractC2136o;
import v.C2140t;
import v.M;
import v.c0;
import v.e0;
import v.f0;
import v.h0;
import v.r;
import v1.C2147a;
import w0.InterfaceC2173H;
import w1.AbstractC2208a;
import y0.C2361h;
import y0.C2362i;
import y0.C2363j;
import y0.InterfaceC2364k;
import z5.AbstractC2510o;

/* loaded from: classes.dex */
public abstract class n {
    public static final W.a a = new W.a(false, -2006998509, new io.ktor.http.cio.b(13));

    /* renamed from: b, reason: collision with root package name */
    public static final W.a f14922b = new W.a(false, -825265732, new io.ktor.http.cio.b(14));

    /* renamed from: c, reason: collision with root package name */
    public static final W.a f14923c = new W.a(false, 590403871, new C0007b(23));

    /* renamed from: d, reason: collision with root package name */
    public static final W.a f14924d = new W.a(false, 1617583139, new C0007b(24));

    /* renamed from: e, reason: collision with root package name */
    public static final W.a f14925e = new W.a(false, -370139563, new io.ktor.http.cio.b(15));

    /* renamed from: f, reason: collision with root package name */
    public static final W.a f14926f = new W.a(false, -173757546, new io.ktor.http.cio.b(16));

    public static final void a(String str, String str2, C0510p c0510p, int i7) {
        boolean z7;
        C0510p c0510p2 = c0510p;
        c0510p2.T(1198826869);
        int i8 = i7 | (c0510p2.f(str) ? 4 : 2) | (c0510p2.f(str2) ? 32 : 16);
        if ((i8 & 147) == 146 && c0510p2.y()) {
            c0510p2.M();
        } else {
            String upperCase = AbstractC2510o.I0(1, AbstractC2510o.J0(str2).toString()).toUpperCase(Locale.ROOT);
            kotlin.jvm.internal.l.e("toUpperCase(...)", upperCase);
            if (AbstractC2510o.g0(upperCase)) {
                upperCase = "?";
            }
            a0.n nVar = a0.n.a;
            float f5 = 34;
            q qVarJ = androidx.compose.foundation.layout.c.j(nVar, f5);
            C.d dVar = C.e.a;
            q qVarB = androidx.compose.foundation.a.b(q0.c.o(qVarJ, dVar), ((N) c0510p2.k(P.a)).f5230G, AbstractC0968M.a);
            InterfaceC2173H interfaceC2173HE = AbstractC2136o.e(a0.b.f10385o, false);
            int i9 = c0510p2.f7128P;
            InterfaceC0501k0 interfaceC0501k0M = c0510p2.m();
            q qVarC = a0.a.c(c0510p2, qVarB);
            InterfaceC2364k.f17877j.getClass();
            C2362i c2362i = C2363j.f17871b;
            c0510p2.V();
            if (c0510p2.f7127O) {
                c0510p2.l(c2362i);
            } else {
                c0510p2.e0();
            }
            C0486d.R(c0510p2, C2363j.f17875f, interfaceC2173HE);
            C0486d.R(c0510p2, C2363j.f17874e, interfaceC0501k0M);
            C2361h c2361h = C2363j.f17876g;
            if (c0510p2.f7127O || !kotlin.jvm.internal.l.a(c0510p2.H(), Integer.valueOf(i9))) {
                AbstractC0703b.u(i9, c0510p2, i9, c2361h);
            }
            C0486d.R(c0510p2, C2363j.f17873d, qVarC);
            if (str == null || AbstractC2510o.g0(str)) {
                c0510p2.R(635689281);
                H2.b(upperCase, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((M2) c0510p2.k(N2.a)).f5221m, c0510p, 0, 0, 65534);
                c0510p2 = c0510p;
                c0510p2.p(false);
                z7 = true;
            } else {
                c0510p2.R(635464252);
                T2.q.b(str, null, q0.c.o(androidx.compose.foundation.layout.c.j(nVar, f5), dVar), c0510p2, (i8 & 14) | 1572912);
                c0510p2.p(false);
                z7 = true;
            }
            c0510p2.p(z7);
        }
        C0509o0 c0509o0S = c0510p2.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new e(str, str2, i7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:156:0x06b9  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final com.kusukanime.data.CommentRow r40, final int r41, final boolean r42, final e4.InterfaceC0821a r43, final e4.InterfaceC0821a r44, O.C0510p r45, final int r46) {
        /*
            Method dump skipped, instructions count: 1736
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r3.n.b(com.kusukanime.data.CommentRow, int, boolean, e4.a, e4.a, O.p, int):void");
    }

    public static final void c(String str, String str2, InterfaceC0821a interfaceC0821a, m mVar, C0510p c0510p, int i7, int i8) {
        String str3;
        int i9;
        m mVar2;
        int i10;
        String str4;
        Object obj;
        C2362i c2362i;
        C2361h c2361h;
        Z z7;
        Z z8;
        C2361h c2361h2;
        String name;
        C2362i c2362i2;
        float f5;
        a0.h hVar;
        M m7;
        C2361h c2361h3;
        C2361h c2361h4;
        C2361h c2361h5;
        C2361h c2361h6;
        h0 h0Var;
        Z z9;
        a0.n nVar;
        float f7;
        C2362i c2362i3;
        C2361h c2361h7;
        Z z10;
        T t7;
        a0.n nVar2;
        C2361h c2361h8;
        C2362i c2362i4;
        C2361h c2361h9;
        C2361h c2361h10;
        Z z11;
        float f8;
        C2361h c2361h11;
        boolean z12;
        C0510p c0510p2;
        C0510p c0510p3;
        m mVar3;
        final Z z13;
        int iIntValue;
        C0510p c0510p4;
        m mVar4;
        String str5;
        C0510p c0510p5;
        C0510p c0510p6;
        C0510p c0510p7 = c0510p;
        kotlin.jvm.internal.l.f("animeSlug", str);
        c0510p7.T(-510685794);
        int i11 = i7 | (c0510p7.f(str) ? 4 : 2);
        int i12 = i8 & 2;
        if (i12 != 0) {
            i9 = i11 | 48;
            str3 = str2;
        } else {
            str3 = str2;
            i9 = i11 | (c0510p7.f(str3) ? 32 : 16);
        }
        int i13 = i9 | (c0510p7.h(interfaceC0821a) ? 256 : 128) | 1024;
        if ((i13 & 1171) == 1170 && c0510p7.y()) {
            c0510p7.M();
            mVar4 = mVar;
            str5 = str3;
            c0510p6 = c0510p7;
        } else {
            c0510p7.O();
            int i14 = i7 & 1;
            T t8 = C0502l.a;
            if (i14 == 0 || c0510p7.x()) {
                if (i12 != 0) {
                    str3 = null;
                }
                W wA = AbstractC2208a.a(c0510p7);
                if (wA == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                mVar2 = (m) AbstractC0871d.v0(y.a.b(m.class), wA, wA instanceof InterfaceC0684k ? ((InterfaceC0684k) wA).d() : C2147a.f16519b, c0510p7);
                i10 = i13 & (-7169);
            } else {
                c0510p7.M();
                i10 = i13 & (-7169);
                mVar2 = mVar;
            }
            int i15 = i10;
            String str6 = str3;
            c0510p7.q();
            boolean zH = ((i15 & 112) == 32) | c0510p7.h(mVar2) | ((i15 & 14) == 4);
            Object objH = c0510p7.H();
            if (zH || objH == t8) {
                objH = new h(mVar2, str, str6, null);
                c0510p7.b0(objH);
            }
            C0486d.f(str, str6, (e4.n) objH, c0510p7);
            Z zV = C0486d.v(mVar2.f14904c, c0510p7);
            Z zV2 = C0486d.v(mVar2.f14906e, c0510p7);
            Z zV3 = C0486d.v(mVar2.f14908g, c0510p7);
            Z zV4 = C0486d.v(mVar2.f14910i, c0510p7);
            Z zV5 = C0486d.v(mVar2.f14912k, c0510p7);
            Z zV6 = C0486d.v(mVar2.f14914m, c0510p7);
            Z zV7 = C0486d.v(mVar2.f14916o, c0510p7);
            Z zV8 = C0486d.v(mVar2.f14918q, c0510p7);
            Object objH2 = c0510p7.H();
            T t9 = T.f7049p;
            if (objH2 == t8) {
                objH2 = C0486d.K("", t9);
                c0510p7.b0(objH2);
            }
            Z z14 = (Z) objH2;
            Object objH3 = c0510p7.H();
            if (objH3 == t8) {
                objH3 = C0486d.K(Boolean.FALSE, t9);
                c0510p7.b0(objH3);
            }
            Z z15 = (Z) objH3;
            Object objH4 = c0510p7.H();
            if (objH4 == t8) {
                objH4 = C0486d.K(null, t9);
                c0510p7.b0(objH4);
            }
            Z z16 = (Z) objH4;
            Object objH5 = c0510p7.H();
            if (objH5 == t8) {
                objH5 = C0486d.K(Boolean.TRUE, t9);
                c0510p7.b0(objH5);
            }
            Z z17 = (Z) objH5;
            Object objH6 = c0510p7.H();
            if (objH6 == t8) {
                objH6 = C0486d.K(Boolean.FALSE, t9);
                c0510p7.b0(objH6);
            }
            Z z18 = (Z) objH6;
            boolean zF = c0510p7.f((List) zV.getValue()) | c0510p7.g(((Boolean) z17.getValue()).booleanValue());
            Object objH7 = c0510p7.H();
            Object obj2 = objH7;
            if (zF || objH7 == t8) {
                List list = (List) zV.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    String parent_comment_id = ((CommentRow) obj3).getParent_comment_id();
                    if (parent_comment_id == null || AbstractC2510o.g0(parent_comment_id)) {
                        arrayList.add(obj3);
                    }
                }
                List listO0 = arrayList;
                if (((Boolean) z17.getValue()).booleanValue()) {
                    listO0 = P3.q.O0(arrayList, new G3.q(2));
                }
                c0510p7.b0(listO0);
                obj2 = listO0;
            }
            List<CommentRow> list2 = (List) obj2;
            boolean zF2 = c0510p7.f((List) zV.getValue());
            Object objH8 = c0510p7.H();
            if (zF2 || objH8 == t8) {
                List list3 = (List) zV.getValue();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj4 : list3) {
                    String str7 = str6;
                    String parent_comment_id2 = ((CommentRow) obj4).getParent_comment_id();
                    Object obj5 = linkedHashMap.get(parent_comment_id2);
                    if (obj5 == null) {
                        ArrayList arrayList2 = new ArrayList();
                        linkedHashMap.put(parent_comment_id2, arrayList2);
                        obj5 = arrayList2;
                    }
                    ((List) obj5).add(obj4);
                    str6 = str7;
                }
                str4 = str6;
                c0510p7.b0(linkedHashMap);
                obj = linkedHashMap;
            } else {
                str4 = str6;
                obj = objH8;
            }
            Map map = (Map) obj;
            a0.n nVar3 = a0.n.a;
            float f9 = 16;
            m mVar5 = mVar2;
            q qVarJ = androidx.compose.foundation.layout.a.j(androidx.compose.foundation.layout.c.d(nVar3, 1.0f), f9, 0.0f, 2);
            C2140t c2140tA = r.a(AbstractC2130i.f16445c, a0.b.f10393w, c0510p7, 0);
            int i16 = c0510p7.f7128P;
            InterfaceC0501k0 interfaceC0501k0M = c0510p7.m();
            q qVarC = a0.a.c(c0510p7, qVarJ);
            InterfaceC2364k.f17877j.getClass();
            C2362i c2362i5 = C2363j.f17871b;
            c0510p7.V();
            if (c0510p7.f7127O) {
                c0510p7.l(c2362i5);
            } else {
                c0510p7.e0();
            }
            C2361h c2361h12 = C2363j.f17875f;
            C0486d.R(c0510p7, c2361h12, c2140tA);
            C2361h c2361h13 = C2363j.f17874e;
            C0486d.R(c0510p7, c2361h13, interfaceC0501k0M);
            C2361h c2361h14 = C2363j.f17876g;
            if (c0510p7.f7127O || !kotlin.jvm.internal.l.a(c0510p7.H(), Integer.valueOf(i16))) {
                AbstractC0703b.u(i16, c0510p7, i16, c2361h14);
            }
            C2361h c2361h15 = C2363j.f17873d;
            C0486d.R(c0510p7, c2361h15, qVarC);
            q qVarD = androidx.compose.foundation.layout.c.d(nVar3, 1.0f);
            a0.h hVar2 = a0.b.f10391u;
            M m8 = AbstractC2130i.a;
            f0 f0VarB = e0.b(m8, hVar2, c0510p7, 48);
            int i17 = c0510p7.f7128P;
            InterfaceC0501k0 interfaceC0501k0M2 = c0510p7.m();
            q qVarC2 = a0.a.c(c0510p7, qVarD);
            c0510p7.V();
            if (c0510p7.f7127O) {
                c0510p7.l(c2362i5);
            } else {
                c0510p7.e0();
            }
            C0486d.R(c0510p7, c2361h12, f0VarB);
            C0486d.R(c0510p7, c2361h13, interfaceC0501k0M2);
            if (c0510p7.f7127O || !kotlin.jvm.internal.l.a(c0510p7.H(), Integer.valueOf(i17))) {
                AbstractC0703b.u(i17, c0510p7, i17, c2361h14);
            }
            C0486d.R(c0510p7, c2361h15, qVarC2);
            h0 h0Var2 = h0.a;
            Map map2 = map;
            m mVar6 = mVar5;
            Z z19 = zV5;
            H2.b(c0.a(((List) zV.getValue()).size(), "Komentar (", ")"), h0Var2.a(nVar3), 0L, 0L, u.f6418r, 0L, null, 0L, 0, false, 0, 0, E0.o(c0510p7).f5216h, c0510p, 196608, 0, 65500);
            a0.i iVar = a0.b.f10381k;
            InterfaceC2173H interfaceC2173HE = AbstractC2136o.e(iVar, false);
            int i18 = c0510p.f7128P;
            InterfaceC0501k0 interfaceC0501k0M3 = c0510p.m();
            q qVarC3 = a0.a.c(c0510p, nVar3);
            c0510p.V();
            if (c0510p.f7127O) {
                c2362i = c2362i5;
                c0510p.l(c2362i);
            } else {
                c2362i = c2362i5;
                c0510p.e0();
            }
            C0486d.R(c0510p, c2361h12, interfaceC2173HE);
            C0486d.R(c0510p, c2361h13, interfaceC0501k0M3);
            if (c0510p.f7127O || !kotlin.jvm.internal.l.a(c0510p.H(), Integer.valueOf(i18))) {
                c2361h = c2361h14;
                AbstractC0703b.u(i18, c0510p, i18, c2361h);
            } else {
                c2361h = c2361h14;
            }
            C0486d.R(c0510p, c2361h15, qVarC3);
            C.d dVarA = C.e.a();
            long j7 = E0.l(c0510p).f5230G;
            Object objH9 = c0510p.H();
            if (objH9 == t8) {
                z7 = z18;
                objH9 = new B3.i(11, z7);
                c0510p.b0(objH9);
            } else {
                z7 = z18;
            }
            C2361h c2361h16 = c2361h;
            Z z20 = z7;
            q2.a(androidx.compose.foundation.a.e(nVar3, false, null, (InterfaceC0821a) objH9, 7), dVarA, j7, 0L, 0.0f, 0.0f, W.f.b(-840615335, new C0026b(5, z17), c0510p), c0510p, 12582912, 120);
            boolean zBooleanValue = ((Boolean) z20.getValue()).booleanValue();
            Object objH10 = c0510p.H();
            if (objH10 == t8) {
                z8 = z20;
                objH10 = new B3.i(12, z8);
                c0510p.b0(objH10);
            } else {
                z8 = z20;
            }
            a0.i iVar2 = iVar;
            C2362i c2362i6 = c2362i;
            AbstractC0399n.a(zBooleanValue, (InterfaceC0821a) objH10, null, 0L, null, null, null, 0L, 0.0f, 0.0f, W.f.b(-61530141, new B3.r(z17, z8, 1), c0510p), c0510p, 48);
            C0510p c0510p8 = c0510p;
            c0510p8.p(true);
            c0510p8.p(true);
            float f10 = 10;
            AbstractC2123b.a(c0510p8, androidx.compose.foundation.layout.c.e(nVar3, f10));
            if (((Boolean) zV3.getValue()).booleanValue()) {
                c0510p8.R(-828323456);
                E0.b(interfaceC0821a, androidx.compose.foundation.layout.c.d(nVar3, 1.0f), false, null, null, null, null, null, f14923c, c0510p, ((i15 >> 6) & 14) | 805306416, 508);
                C0510p c0510p9 = c0510p;
                c0510p9.p(false);
                c2362i4 = c2362i6;
                t7 = t8;
                f8 = 1.0f;
                nVar2 = nVar3;
                z11 = z16;
                c2361h9 = c2361h12;
                c2361h10 = c2361h13;
                c2361h11 = c2361h16;
                c2361h8 = c2361h15;
                c0510p3 = c0510p9;
            } else {
                c0510p8.R(-828109587);
                CommentRow commentRow = (CommentRow) z16.getValue();
                if (commentRow == null) {
                    c0510p8.R(-828139534);
                    c0510p8.p(false);
                    c2362i2 = c2362i6;
                    f5 = f10;
                    f7 = 1.0f;
                    nVar = nVar3;
                    z9 = z16;
                    hVar = hVar2;
                    m7 = m8;
                    h0Var = h0Var2;
                    c2361h4 = c2361h12;
                    c2361h5 = c2361h13;
                    c2361h6 = c2361h16;
                    c2361h3 = c2361h15;
                } else {
                    c0510p8.R(-828139533);
                    q qVarL = androidx.compose.foundation.layout.a.l(androidx.compose.foundation.layout.c.d(nVar3, 1.0f), 0.0f, 0.0f, 0.0f, 6, 7);
                    f0 f0VarB2 = e0.b(m8, hVar2, c0510p8, 48);
                    int i19 = c0510p8.f7128P;
                    InterfaceC0501k0 interfaceC0501k0M4 = c0510p8.m();
                    q qVarC4 = a0.a.c(c0510p8, qVarL);
                    c0510p8.V();
                    if (c0510p8.f7127O) {
                        c0510p8.l(c2362i6);
                    } else {
                        c0510p8.e0();
                    }
                    C0486d.R(c0510p8, c2361h12, f0VarB2);
                    C0486d.R(c0510p8, c2361h13, interfaceC0501k0M4);
                    if (c0510p8.f7127O || !kotlin.jvm.internal.l.a(c0510p8.H(), Integer.valueOf(i19))) {
                        c2361h2 = c2361h16;
                        AbstractC0703b.u(i19, c0510p8, i19, c2361h2);
                    } else {
                        c2361h2 = c2361h16;
                    }
                    C0486d.R(c0510p8, c2361h15, qVarC4);
                    UserMini users = commentRow.getUsers();
                    if (users == null || (name = users.getName()) == null) {
                        name = "pengguna";
                    }
                    c2362i2 = c2362i6;
                    f5 = f10;
                    hVar = hVar2;
                    m7 = m8;
                    c2361h3 = c2361h15;
                    c2361h4 = c2361h12;
                    c2361h5 = c2361h13;
                    c2361h6 = c2361h2;
                    h0Var = h0Var2;
                    H2.b("Membalas ".concat(name), h0Var2.a(nVar3), E0.l(c0510p8).a, 0L, null, 0L, null, 0L, 0, false, 0, 0, E0.o(c0510p8).f5223o, c0510p, 0, 0, 65528);
                    c0510p8 = c0510p;
                    Object objH11 = c0510p8.H();
                    if (objH11 == t8) {
                        z9 = z16;
                        objH11 = new B3.i(13, z9);
                        c0510p8.b0(objH11);
                    } else {
                        z9 = z16;
                    }
                    E0.i((InterfaceC0821a) objH11, null, false, null, null, null, f14924d, c0510p8, 805306374, 510);
                    c0510p8.p(true);
                    c0510p8.p(false);
                    nVar = nVar3;
                    f7 = 1.0f;
                }
                q qVarD2 = androidx.compose.foundation.layout.c.d(nVar, f7);
                f0 f0VarB3 = e0.b(m7, hVar, c0510p8, 48);
                int i20 = c0510p8.f7128P;
                InterfaceC0501k0 interfaceC0501k0M5 = c0510p8.m();
                q qVarC5 = a0.a.c(c0510p8, qVarD2);
                c0510p8.V();
                if (c0510p8.f7127O) {
                    c2362i3 = c2362i2;
                    c0510p8.l(c2362i3);
                } else {
                    c2362i3 = c2362i2;
                    c0510p8.e0();
                }
                C2361h c2361h17 = c2361h4;
                C0486d.R(c0510p8, c2361h17, f0VarB3);
                C2361h c2361h18 = c2361h5;
                C0486d.R(c0510p8, c2361h18, interfaceC0501k0M5);
                if (c0510p8.f7127O || !kotlin.jvm.internal.l.a(c0510p8.H(), Integer.valueOf(i20))) {
                    c2361h7 = c2361h6;
                    AbstractC0703b.u(i20, c0510p8, i20, c2361h7);
                } else {
                    c2361h7 = c2361h6;
                }
                C2361h c2361h19 = c2361h3;
                C0486d.R(c0510p8, c2361h19, qVarC5);
                a((String) zV7.getValue(), (String) zV6.getValue(), c0510p8, 384);
                AbstractC2123b.a(c0510p8, androidx.compose.foundation.layout.c.n(f5));
                String str8 = (String) z14.getValue();
                q qVarA = h0Var.a(nVar);
                C.d dVarB = C.e.b(20);
                Object objH12 = c0510p8.H();
                if (objH12 == t8) {
                    z10 = z14;
                    objH12 = new C1871a(0, z10);
                    c0510p8.b0(objH12);
                } else {
                    z10 = z14;
                }
                t7 = t8;
                nVar2 = nVar;
                c2361h8 = c2361h19;
                c2362i4 = c2362i3;
                c2361h9 = c2361h17;
                c2361h10 = c2361h18;
                z11 = z9;
                f8 = 1.0f;
                c2361h11 = c2361h7;
                F1.a(str8, (e4.k) objH12, qVarA, false, null, null, f14925e, null, W.f.b(599134099, new B3.h(mVar6, z10, z15, z9), c0510p8), null, null, false, null, null, null, false, 4, 0, dVarB, null, c0510p, 817889328, 100663296, 6028664);
                C0510p c0510p10 = c0510p;
                c0510p10.p(true);
                String str9 = (String) zV8.getValue();
                if (str9 == null) {
                    c0510p10.R(-826171561);
                    c0510p10.p(false);
                    z12 = false;
                    c0510p2 = c0510p10;
                } else {
                    c0510p10.R(-826171560);
                    AbstractC2123b.a(c0510p10, androidx.compose.foundation.layout.c.e(nVar2, 6));
                    H2.b("Gagal kirim: ".concat(str9), null, E0.l(c0510p10).f5264w, 0L, null, 0L, null, 0L, 0, false, 0, 0, E0.o(c0510p10).f5223o, c0510p, 0, 0, 65530);
                    C0510p c0510p11 = c0510p;
                    z12 = false;
                    c0510p11.p(false);
                    c0510p2 = c0510p11;
                }
                c0510p2.p(z12);
                c0510p3 = c0510p2;
            }
            float f11 = 12;
            AbstractC2123b.a(c0510p3, androidx.compose.foundation.layout.c.e(nVar2, f11));
            if (((Boolean) zV2.getValue()).booleanValue()) {
                c0510p3.R(-825774326);
                q qVarH = androidx.compose.foundation.layout.a.h(androidx.compose.foundation.layout.c.d(nVar2, f8), f9);
                InterfaceC2173H interfaceC2173HE2 = AbstractC2136o.e(a0.b.f10385o, false);
                int i21 = c0510p3.f7128P;
                InterfaceC0501k0 interfaceC0501k0M6 = c0510p3.m();
                q qVarC6 = a0.a.c(c0510p3, qVarH);
                c0510p3.V();
                if (c0510p3.f7127O) {
                    c0510p3.l(c2362i4);
                } else {
                    c0510p3.e0();
                }
                C0486d.R(c0510p3, c2361h9, interfaceC2173HE2);
                C0486d.R(c0510p3, c2361h10, interfaceC0501k0M6);
                if (c0510p3.f7127O || !kotlin.jvm.internal.l.a(c0510p3.H(), Integer.valueOf(i21))) {
                    AbstractC0703b.u(i21, c0510p3, i21, c2361h11);
                }
                C0486d.R(c0510p3, c2361h8, qVarC6);
                Q1.a(null, 0L, 0.0f, 0L, 0, c0510p3, 0, 31);
                c0510p3.p(true);
                c0510p3.p(false);
                c0510p5 = c0510p3;
            } else if (list2.isEmpty()) {
                c0510p3.R(-825567773);
                H2.b("Belum ada komentar. Jadi yang pertama!", androidx.compose.foundation.layout.a.j(nVar2, 0.0f, f11, 1), E0.l(c0510p3).f5260s, 0L, null, 0L, null, 0L, 0, false, 0, 0, E0.o(c0510p3).f5220l, c0510p, 54, 0, 65528);
                C0510p c0510p12 = c0510p;
                c0510p12.p(false);
                c0510p5 = c0510p12;
            } else {
                c0510p3.R(-825265740);
                for (final CommentRow commentRow2 : list2) {
                    Integer num = (Integer) ((Map) zV4.getValue()).get(commentRow2.getId());
                    int iIntValue2 = num != null ? num.intValue() : 0;
                    boolean zContains = ((Set) z19.getValue()).contains(commentRow2.getId());
                    final m mVar7 = mVar6;
                    final Z z21 = z19;
                    boolean zH2 = c0510p3.h(mVar7) | c0510p3.f(commentRow2) | c0510p3.f(z21);
                    Object objH13 = c0510p3.H();
                    T t10 = t7;
                    if (zH2 || objH13 == t10) {
                        final int i22 = 0;
                        objH13 = new InterfaceC0821a() { // from class: r3.b
                            @Override // e4.InterfaceC0821a
                            public final Object invoke() {
                                switch (i22) {
                                    case 0:
                                        mVar7.f(commentRow2.getId(), !((Set) z21.getValue()).contains(r0.getId()));
                                        break;
                                    default:
                                        mVar7.f(commentRow2.getId(), !((Set) z21.getValue()).contains(r0.getId()));
                                        break;
                                }
                                return C.a;
                            }
                        };
                        c0510p3.b0(objH13);
                    }
                    InterfaceC0821a interfaceC0821a2 = (InterfaceC0821a) objH13;
                    boolean zF3 = c0510p3.f(commentRow2);
                    Object objH14 = c0510p3.H();
                    if (zF3 || objH14 == t10) {
                        final int i23 = 0;
                        z13 = z11;
                        objH14 = new InterfaceC0821a() { // from class: r3.c
                            @Override // e4.InterfaceC0821a
                            public final Object invoke() {
                                switch (i23) {
                                    case 0:
                                        z13.setValue(commentRow2);
                                        break;
                                    default:
                                        z13.setValue(commentRow2);
                                        break;
                                }
                                return C.a;
                            }
                        };
                        c0510p3.b0(objH14);
                    } else {
                        z13 = z11;
                    }
                    b(commentRow2, iIntValue2, zContains, interfaceC0821a2, (InterfaceC0821a) objH14, c0510p3, 0);
                    Map map3 = map2;
                    Iterable<CommentRow> iterable = (List) map3.get(commentRow2.getId());
                    if (iterable == null) {
                        iterable = P3.y.f7779k;
                    }
                    c0510p3.R(1635959305);
                    for (final CommentRow commentRow3 : iterable) {
                        a0.n nVar4 = nVar2;
                        q qVarL2 = androidx.compose.foundation.layout.a.l(nVar4, 44, 0.0f, 0.0f, 0.0f, 14);
                        a0.i iVar3 = iVar2;
                        InterfaceC2173H interfaceC2173HE3 = AbstractC2136o.e(iVar3, false);
                        int i24 = c0510p3.f7128P;
                        InterfaceC0501k0 interfaceC0501k0M7 = c0510p3.m();
                        q qVarC7 = a0.a.c(c0510p3, qVarL2);
                        InterfaceC2364k.f17877j.getClass();
                        C2362i c2362i7 = C2363j.f17871b;
                        c0510p3.V();
                        if (c0510p3.f7127O) {
                            c0510p3.l(c2362i7);
                        } else {
                            c0510p3.e0();
                        }
                        C0486d.R(c0510p3, C2363j.f17875f, interfaceC2173HE3);
                        C0486d.R(c0510p3, C2363j.f17874e, interfaceC0501k0M7);
                        C2361h c2361h20 = C2363j.f17876g;
                        if (c0510p3.f7127O || !kotlin.jvm.internal.l.a(c0510p3.H(), Integer.valueOf(i24))) {
                            AbstractC0703b.u(i24, c0510p3, i24, c2361h20);
                        }
                        C0486d.R(c0510p3, C2363j.f17873d, qVarC7);
                        Integer num2 = (Integer) ((Map) zV4.getValue()).get(commentRow3.getId());
                        if (num2 != null) {
                            iVar2 = iVar3;
                            iIntValue = num2.intValue();
                        } else {
                            iVar2 = iVar3;
                            iIntValue = 0;
                        }
                        boolean zContains2 = ((Set) z21.getValue()).contains(commentRow3.getId());
                        boolean zH3 = c0510p3.h(mVar7) | c0510p3.f(commentRow3) | c0510p3.f(z21);
                        Object objH15 = c0510p3.H();
                        if (zH3 || objH15 == t10) {
                            final int i25 = 1;
                            objH15 = new InterfaceC0821a() { // from class: r3.b
                                @Override // e4.InterfaceC0821a
                                public final Object invoke() {
                                    switch (i25) {
                                        case 0:
                                            mVar7.f(commentRow3.getId(), !((Set) z21.getValue()).contains(r0.getId()));
                                            break;
                                        default:
                                            mVar7.f(commentRow3.getId(), !((Set) z21.getValue()).contains(r0.getId()));
                                            break;
                                    }
                                    return C.a;
                                }
                            };
                            c0510p3.b0(objH15);
                        }
                        InterfaceC0821a interfaceC0821a3 = (InterfaceC0821a) objH15;
                        boolean zF4 = c0510p3.f(commentRow2);
                        Object objH16 = c0510p3.H();
                        if (zF4 || objH16 == t10) {
                            final int i26 = 1;
                            objH16 = new InterfaceC0821a() { // from class: r3.c
                                @Override // e4.InterfaceC0821a
                                public final Object invoke() {
                                    switch (i26) {
                                        case 0:
                                            z13.setValue(commentRow2);
                                            break;
                                        default:
                                            z13.setValue(commentRow2);
                                            break;
                                    }
                                    return C.a;
                                }
                            };
                            c0510p3.b0(objH16);
                        }
                        nVar2 = nVar4;
                        b(commentRow3, iIntValue, zContains2, interfaceC0821a3, (InterfaceC0821a) objH16, c0510p3, 0);
                        c0510p3.p(true);
                    }
                    c0510p3.p(false);
                    AbstractC2123b.a(c0510p3, androidx.compose.foundation.layout.c.e(nVar2, 4));
                    mVar6 = mVar7;
                    z19 = z21;
                    t7 = t10;
                    z11 = z13;
                    map2 = map3;
                }
                mVar3 = mVar6;
                c0510p3.p(false);
                c0510p4 = c0510p3;
                c0510p4.p(true);
                mVar4 = mVar3;
                str5 = str4;
                c0510p6 = c0510p4;
            }
            mVar3 = mVar6;
            c0510p4 = c0510p5;
            c0510p4.p(true);
            mVar4 = mVar3;
            str5 = str4;
            c0510p6 = c0510p4;
        }
        C0509o0 c0509o0S = c0510p6.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new g(str, str5, interfaceC0821a, mVar4, i7, i8);
        }
    }
}
