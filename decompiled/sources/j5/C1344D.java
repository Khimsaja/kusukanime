package j5;

import P3.F;
import R4.U;
import R4.Z;
import f1.AbstractC0870c;
import f1.AbstractC0871d;
import f6.AbstractC0905c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import l5.C1468u;
import m5.C1521j;
import n5.AbstractC1586x;
import n5.C1570g;
import n5.C1574k;
import n5.I;
import n5.M;
import n5.Q;
import r4.AbstractC1880i;
import u4.InterfaceC2099e;
import u4.InterfaceC2105k;

/* renamed from: j5.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1344D {
    public final C1356k a;

    /* renamed from: b, reason: collision with root package name */
    public final C1344D f12402b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12403c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12404d;

    /* renamed from: e, reason: collision with root package name */
    public final C1521j f12405e;

    /* renamed from: f, reason: collision with root package name */
    public final C1521j f12406f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f12407g;

    public C1344D(C1356k c1356k, C1344D c1344d, List list, String str, String str2) {
        Map linkedHashMap;
        kotlin.jvm.internal.l.f("c", c1356k);
        kotlin.jvm.internal.l.f("typeParameterProtos", list);
        kotlin.jvm.internal.l.f("debugName", str);
        this.a = c1356k;
        this.f12402b = c1344d;
        this.f12403c = str;
        this.f12404d = str2;
        C1354i c1354i = c1356k.a;
        this.f12405e = c1354i.a.c(new C1341A(this, 0));
        this.f12406f = c1354i.a.c(new C1341A(this, 1));
        if (list.isEmpty()) {
            linkedHashMap = P3.z.f7780k;
        } else {
            linkedHashMap = new LinkedHashMap();
            Iterator it = list.iterator();
            int i7 = 0;
            while (it.hasNext()) {
                Z z7 = (Z) it.next();
                linkedHashMap.put(Integer.valueOf(z7.f8353n), new C1468u(this.a, z7, i7));
                i7++;
            }
        }
        this.f12407g = linkedHashMap;
    }

    public static n5.B a(n5.B b4, AbstractC1586x abstractC1586x) {
        AbstractC1880i abstractC1880iN = AbstractC0905c.n(b4);
        v4.h annotations = b4.getAnnotations();
        AbstractC1586x abstractC1586xD0 = AbstractC0871d.d0(b4);
        List listY = AbstractC0871d.Y(b4);
        List listP0 = P3.q.p0(AbstractC0871d.e0(b4));
        ArrayList arrayList = new ArrayList(P3.r.p(listP0, 10));
        Iterator it = listP0.iterator();
        while (it.hasNext()) {
            arrayList.add(((Q) it.next()).b());
        }
        return AbstractC0871d.N(abstractC1880iN, annotations, abstractC1586xD0, listY, arrayList, abstractC1586x, true).x0(b4.u0());
    }

    public static final ArrayList e(U u5, C1344D c1344d) {
        List list = u5.f8297n;
        kotlin.jvm.internal.l.e("getArgumentList(...)", list);
        U uL = F.L(u5, c1344d.a.f12441d);
        Iterable iterableE = uL != null ? e(uL, c1344d) : null;
        if (iterableE == null) {
            iterableE = P3.y.f7779k;
        }
        return P3.q.G0(list, iterableE);
    }

    public static I f(List list, v4.h hVar, M m7, InterfaceC2105k interfaceC2105k) {
        I iB1;
        ArrayList arrayList = new ArrayList(P3.r.p(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((C1574k) it.next()).getClass();
            if (hVar.isEmpty()) {
                I.f13362l.getClass();
                iB1 = I.f13363m;
            } else {
                L2.e eVar = I.f13362l;
                List listH = P3.r.H(new C1570g(hVar));
                eVar.getClass();
                iB1 = L2.e.b1(listH);
            }
            arrayList.add(iB1);
        }
        ArrayList arrayListT = P3.r.t(arrayList);
        I.f13362l.getClass();
        return L2.e.b1(arrayListT);
    }

    public static final InterfaceC2099e h(C1344D c1344d, U u5, int i7) {
        W4.b bVarR = AbstractC0870c.R(c1344d.a.f12439b, i7);
        y5.o oVarU = y5.k.U(y5.k.S(new C1341A(c1344d, 2), u5), C1342B.f12400k);
        ArrayList arrayList = new ArrayList();
        Iterator it = oVarU.a.iterator();
        while (it.hasNext()) {
            arrayList.add(oVarU.f18392b.invoke(it.next()));
        }
        int iO = y5.k.O(y5.k.S(C1343C.f12401k, bVarR));
        while (arrayList.size() < iO) {
            arrayList.add(0);
        }
        return c1344d.a.a.f12424l.t(bVarR, arrayList);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final List b() {
        return P3.q.S0(this.f12407g.values());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final u4.Q c(int i7) {
        u4.Q q6 = (u4.Q) this.f12407g.get(Integer.valueOf(i7));
        if (q6 != null) {
            return q6;
        }
        C1344D c1344d = this.f12402b;
        if (c1344d != null) {
            return c1344d.c(i7);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final n5.B d(R4.U r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 997
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j5.C1344D.d(R4.U, boolean):n5.B");
    }

    public final AbstractC1586x g(U u5) {
        kotlin.jvm.internal.l.f("proto", u5);
        if (!((u5.f8296m & 2) == 2)) {
            return d(u5, true);
        }
        C1356k c1356k = this.a;
        String strA = c1356k.f12439b.a(u5.f8299p);
        n5.B bD = d(u5, true);
        U uR = F.r(u5, c1356k.f12441d);
        kotlin.jvm.internal.l.c(uR);
        return c1356k.a.f12422j.b(u5, strA, bD, d(uR, true));
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f12403c);
        C1344D c1344d = this.f12402b;
        if (c1344d == null) {
            str = "";
        } else {
            str = ". Child of " + c1344d.f12403c;
        }
        sb.append(str);
        return sb.toString();
    }
}
