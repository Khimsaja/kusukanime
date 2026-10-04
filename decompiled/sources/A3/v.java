package A3;

import G2.C0174k;
import H.M;
import L.AbstractC0364e0;
import L.AbstractC0384j0;
import L.E0;
import L.H2;
import L.M2;
import L.N;
import L.N2;
import L.P;
import O.C0486d;
import O.C0502l;
import O.C0510p;
import O.InterfaceC0501k0;
import O.R0;
import O.S0;
import O.T;
import O.Z;
import O3.C;
import androidx.compose.foundation.layout.LayoutWeightElement;
import b1.AbstractC0703b;
import com.kusukanime.data.EpisodeRef;
import com.kusukanime.data.GenreItem;
import e4.InterfaceC0821a;
import j5.C1363r;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import o.C1609g;
import s3.AbstractC1994a;
import v.AbstractC2123b;
import v.AbstractC2130i;
import v.e0;
import v.f0;
import w.C2160a;
import x.C2235i;
import y0.C2361h;
import y0.C2362i;
import y0.C2363j;
import y0.InterfaceC2364k;

/* loaded from: classes.dex */
public final class v extends kotlin.jvm.internal.m implements e4.p {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f192l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f193m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f194n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f195o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(X.g gVar, Z z7, R0 r02) {
        super(4);
        this.f192l = 1;
        this.f194n = gVar;
        this.f193m = z7;
        this.f195o = r02;
    }

    @Override // e4.p
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i7;
        boolean z7;
        Object obj5;
        int i8;
        int i9;
        int i10;
        Object obj6 = null;
        T t7 = C0502l.a;
        C c2 = C.a;
        Object obj7 = this.f195o;
        Object obj8 = this.f193m;
        Object obj9 = this.f194n;
        switch (this.f192l) {
            case 0:
                C2160a c2160a = (C2160a) obj;
                int iIntValue = ((Number) obj2).intValue();
                C0510p c0510p = (C0510p) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i7 = iIntValue2 | (c0510p.f(c2160a) ? 4 : 2);
                } else {
                    i7 = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i7 |= c0510p.d(iIntValue) ? 32 : 16;
                }
                if ((i7 & 147) == 146 && c0510p.y()) {
                    c0510p.M();
                } else {
                    String str = (String) ((List) obj9).get(iIntValue);
                    c0510p.R(-948244831);
                    a0.n nVar = a0.n.a;
                    a0.q qVarG = androidx.compose.foundation.layout.c.g(androidx.compose.foundation.layout.c.d(nVar, 1.0f), 52, 0.0f, 2);
                    B b4 = (B) obj7;
                    boolean zH = c0510p.h(b4) | c0510p.f(str);
                    Object objH = c0510p.H();
                    if (zH || objH == t7) {
                        z7 = false;
                        p pVar = new p(b4, str, (Z) obj8, false ? 1 : 0);
                        c0510p.b0(pVar);
                        obj5 = pVar;
                    } else {
                        z7 = false;
                        obj5 = objH;
                    }
                    a0.q qVarJ = androidx.compose.foundation.layout.a.j(androidx.compose.foundation.a.e(qVarG, z7, null, (InterfaceC0821a) obj5, 7), 8, 0.0f, 2);
                    f0 f0VarB = e0.b(AbstractC2130i.a, a0.b.f10391u, c0510p, 48);
                    int i11 = c0510p.f7128P;
                    InterfaceC0501k0 interfaceC0501k0M = c0510p.m();
                    a0.q qVarC = a0.a.c(c0510p, qVarJ);
                    InterfaceC2364k.f17877j.getClass();
                    C2362i c2362i = C2363j.f17871b;
                    c0510p.V();
                    if (c0510p.f7127O) {
                        c0510p.l(c2362i);
                    } else {
                        c0510p.e0();
                    }
                    C0486d.R(c0510p, C2363j.f17875f, f0VarB);
                    C0486d.R(c0510p, C2363j.f17874e, interfaceC0501k0M);
                    C2361h c2361h = C2363j.f17876g;
                    if (c0510p.f7127O || !kotlin.jvm.internal.l.a(c0510p.H(), Integer.valueOf(i11))) {
                        AbstractC0703b.u(i11, c0510p, i11, c2361h);
                    }
                    C0486d.R(c0510p, C2363j.f17873d, qVarC);
                    AbstractC0384j0.a(P3.r.x(), null, androidx.compose.foundation.layout.c.j(nVar, 18), ((N) c0510p.k(P.a)).f5260s, c0510p, 432, 0);
                    AbstractC2123b.a(c0510p, androidx.compose.foundation.layout.c.n(12));
                    if (1.0f <= 0.0d) {
                        throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero");
                    }
                    H2.b(str, new LayoutWeightElement(1.0f, true), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, ((M2) c0510p.k(N2.a)).f5218j, c0510p, 0, 3120, 55292);
                    boolean zH2 = c0510p.h(b4) | c0510p.f(str);
                    Object objH2 = c0510p.H();
                    Object obj10 = objH2;
                    if (zH2 || objH2 == t7) {
                        q qVar = new q(0, b4, str);
                        c0510p.b0(qVar);
                        obj10 = qVar;
                    }
                    E0.f((InterfaceC0821a) obj10, null, false, null, c.f136d, c0510p, 196608, 30);
                    c0510p.p(true);
                    c0510p.p(false);
                }
                return c2;
            case 1:
                C1609g c1609g = (C1609g) obj;
                C0174k c0174k = (C0174k) obj2;
                C0510p c0510p2 = (C0510p) obj3;
                ((Number) obj4).intValue();
                if (!((Boolean) ((Z) obj8).getValue()).booleanValue()) {
                    List list = (List) ((R0) obj7).getValue();
                    ListIterator listIterator = list.listIterator(list.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            Object objPrevious = listIterator.previous();
                            if (kotlin.jvm.internal.l.a(c0174k, (C0174k) objPrevious)) {
                                obj6 = objPrevious;
                            }
                        }
                    }
                    c0174k = (C0174k) obj6;
                }
                if (c0174k != null) {
                    q0.c.d(c0174k, (X.g) obj9, W.f.b(-1263531443, new M(i, c0174k, c1609g), c0510p2), c0510p2, 384);
                }
                return c2;
            case 2:
                C2160a c2160a2 = (C2160a) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                C0510p c0510p3 = (C0510p) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i8 = iIntValue4 | (c0510p3.f(c2160a2) ? 4 : 2);
                } else {
                    i8 = iIntValue4;
                }
                if ((48 & iIntValue4) == 0) {
                    i8 |= c0510p3.d(iIntValue3) ? 32 : 16;
                }
                if ((i8 & 147) == 146 && c0510p3.y()) {
                    c0510p3.M();
                } else {
                    EpisodeRef episodeRef = (EpisodeRef) ((List) obj9).get(iIntValue3);
                    c0510p3.R(415620266);
                    boolean zA = kotlin.jvm.internal.l.a(episodeRef.getSlug(), (String) obj7);
                    e4.k kVar = (e4.k) obj8;
                    boolean zG = c0510p3.g(zA) | c0510p3.f(kVar) | c0510p3.f(episodeRef);
                    Object objH3 = c0510p3.H();
                    Object obj11 = objH3;
                    if (zG || objH3 == t7) {
                        C1363r c1363r = new C1363r(zA, kVar, episodeRef);
                        c0510p3.b0(c1363r);
                        obj11 = c1363r;
                    }
                    W.a aVarB = W.f.b(1759696438, new r(i, episodeRef), c0510p3);
                    C.d dVarB = C.e.b(10);
                    float f5 = AbstractC0364e0.a;
                    S0 s02 = P.a;
                    L.M.a(zA, (InterfaceC0821a) obj11, aVarB, null, false, null, dVarB, AbstractC0364e0.a(((N) c0510p3.k(s02)).f5230G, ((N) c0510p3.k(s02)).f5244c, ((N) c0510p3.k(s02)).f5245d, c0510p3, 3454), null, null, c0510p3, 384, 6, 2680);
                    c0510p3.p(false);
                }
                return c2;
            case 3:
                C2235i c2235i = (C2235i) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                C0510p c0510p4 = (C0510p) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                if ((iIntValue6 & 6) == 0) {
                    i9 = iIntValue6 | (c0510p4.f(c2235i) ? 4 : 2);
                } else {
                    i9 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i9 |= c0510p4.d(iIntValue5) ? 32 : 16;
                }
                if ((i9 & 147) == 146 && c0510p4.y()) {
                    c0510p4.M();
                } else {
                    EpisodeRef episodeRef2 = (EpisodeRef) ((List) obj9).get(iIntValue5);
                    c0510p4.R(1318892423);
                    int n7 = episodeRef2.getN();
                    Map map = (Map) obj7;
                    boolean zContainsKey = map.containsKey(episodeRef2.getSlug());
                    Float f7 = (Float) map.get(episodeRef2.getSlug());
                    float fFloatValue = f7 != null ? f7.floatValue() : 0.0f;
                    e4.k kVar2 = (e4.k) obj8;
                    boolean zF = c0510p4.f(kVar2) | c0510p4.f(episodeRef2);
                    Object objH4 = c0510p4.H();
                    Object obj12 = objH4;
                    if (zF || objH4 == t7) {
                        q qVar2 = new q(19, kVar2, episodeRef2);
                        c0510p4.b0(qVar2);
                        obj12 = qVar2;
                    }
                    AbstractC1994a.h(n7, zContainsKey, fFloatValue, (InterfaceC0821a) obj12, null, c0510p4, 0, 16);
                    c0510p4.p(false);
                }
                return c2;
            default:
                C2160a c2160a3 = (C2160a) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                C0510p c0510p5 = (C0510p) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                if ((iIntValue8 & 6) == 0) {
                    i10 = iIntValue8 | (c0510p5.f(c2160a3) ? 4 : 2);
                } else {
                    i10 = iIntValue8;
                }
                if ((iIntValue8 & 48) == 0) {
                    i10 |= c0510p5.d(iIntValue7) ? 32 : 16;
                }
                if ((i10 & 147) == 146 && c0510p5.y()) {
                    c0510p5.M();
                } else {
                    GenreItem genreItem = (GenreItem) ((List) obj9).get(iIntValue7);
                    c0510p5.R(742388590);
                    Z z8 = (Z) obj8;
                    String str2 = (String) z8.getValue();
                    t3.p pVar2 = (t3.p) obj7;
                    if (str2 == null) {
                        str2 = pVar2.f16033m;
                    }
                    boolean zA2 = kotlin.jvm.internal.l.a(str2, genreItem.getSlug());
                    boolean zF2 = c0510p5.f(z8) | c0510p5.f(genreItem) | c0510p5.h(pVar2);
                    Object objH5 = c0510p5.H();
                    Object obj13 = objH5;
                    if (zF2 || objH5 == t7) {
                        p pVar3 = new p(genreItem, pVar2, z8, i);
                        c0510p5.b0(pVar3);
                        obj13 = pVar3;
                    }
                    W.a aVarB2 = W.f.b(-53877469, new t3.j(genreItem, 0), c0510p5);
                    C.d dVarA = C.e.a();
                    float f8 = AbstractC0364e0.a;
                    S0 s03 = P.a;
                    L.M.a(zA2, (InterfaceC0821a) obj13, aVarB2, null, false, null, dVarA, AbstractC0364e0.a(((N) c0510p5.k(s03)).f5230G, ((N) c0510p5.k(s03)).f5244c, ((N) c0510p5.k(s03)).f5245d, c0510p5, 3454), null, null, c0510p5, 384, 6, 2680);
                    c0510p5.p(false);
                }
                return c2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(List list, Object obj, Object obj2, int i7) {
        super(4);
        this.f192l = i7;
        this.f194n = list;
        this.f195o = obj;
        this.f193m = obj2;
    }
}
