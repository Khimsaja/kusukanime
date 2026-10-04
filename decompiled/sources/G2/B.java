package G2;

import f4.InterfaceC0881a;
import java.util.ArrayList;
import java.util.Iterator;
import m.C1478H;
import y5.C2418a;
import z5.AbstractC2510o;
import z5.AbstractC2517v;

/* loaded from: classes.dex */
public class B extends y implements Iterable, InterfaceC0881a {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f2620w = 0;

    /* renamed from: s, reason: collision with root package name */
    public final C1478H f2621s;

    /* renamed from: t, reason: collision with root package name */
    public int f2622t;

    /* renamed from: u, reason: collision with root package name */
    public String f2623u;

    /* renamed from: v, reason: collision with root package name */
    public String f2624v;

    public B(D d4) {
        super(d4);
        this.f2621s = new C1478H(0);
    }

    @Override // G2.y
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof B) || !super.equals(obj)) {
            return false;
        }
        C1478H c1478h = this.f2621s;
        int iE = c1478h.e();
        B b4 = (B) obj;
        C1478H c1478h2 = b4.f2621s;
        if (iE != c1478h2.e() || this.f2622t != b4.f2622t) {
            return false;
        }
        Iterator it = ((C2418a) y5.k.N(new O3.t(8, c1478h))).iterator();
        while (it.hasNext()) {
            y yVar = (y) it.next();
            if (!yVar.equals(c1478h2.b(yVar.f2762p))) {
                return false;
            }
        }
        return true;
    }

    @Override // G2.y
    public final int hashCode() {
        int iC = this.f2622t;
        C1478H c1478h = this.f2621s;
        int iE = c1478h.e();
        for (int i7 = 0; i7 < iE; i7++) {
            iC = (((iC * 31) + c1478h.c(i7)) * 31) + ((y) c1478h.f(i7)).hashCode();
        }
        return iC;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new A(this);
    }

    @Override // G2.y
    public final x j(B2.l lVar) {
        return q(lVar, true, false, this);
    }

    public final y o(String str, boolean z7) {
        Object next;
        B b4;
        kotlin.jvm.internal.l.f("route", str);
        C1478H c1478h = this.f2621s;
        kotlin.jvm.internal.l.f("<this>", c1478h);
        Iterator it = ((C2418a) y5.k.N(new O3.t(8, c1478h))).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            y yVar = (y) next;
            if (AbstractC2517v.M(yVar.f2763q, str, false) || yVar.m(str) != null) {
                break;
            }
        }
        y yVar2 = (y) next;
        if (yVar2 != null) {
            return yVar2;
        }
        if (!z7 || (b4 = this.f2758l) == null || AbstractC2510o.g0(str)) {
            return null;
        }
        return b4.o(str, true);
    }

    public final y p(int i7, B b4, boolean z7) {
        C1478H c1478h = this.f2621s;
        y yVarP = (y) c1478h.b(i7);
        if (yVarP != null) {
            return yVarP;
        }
        if (z7) {
            Iterator it = ((C2418a) y5.k.N(new O3.t(8, c1478h))).iterator();
            while (true) {
                if (!it.hasNext()) {
                    yVarP = null;
                    break;
                }
                y yVar = (y) it.next();
                yVarP = (!(yVar instanceof B) || kotlin.jvm.internal.l.a(yVar, b4)) ? null : ((B) yVar).p(i7, this, true);
                if (yVarP != null) {
                    break;
                }
            }
        }
        if (yVarP != null) {
            return yVarP;
        }
        B b7 = this.f2758l;
        if (b7 == null || b7.equals(b4)) {
            return null;
        }
        B b8 = this.f2758l;
        kotlin.jvm.internal.l.c(b8);
        return b8.p(i7, this, z7);
    }

    public final x q(B2.l lVar, boolean z7, boolean z8, y yVar) {
        x xVar;
        kotlin.jvm.internal.l.f("lastVisited", yVar);
        x xVarJ = super.j(lVar);
        x xVarQ = null;
        if (z7) {
            ArrayList arrayList = new ArrayList();
            A a = new A(this);
            while (a.hasNext()) {
                y yVar2 = (y) a.next();
                x xVarJ2 = !kotlin.jvm.internal.l.a(yVar2, yVar) ? yVar2.j(lVar) : null;
                if (xVarJ2 != null) {
                    arrayList.add(xVarJ2);
                }
            }
            xVar = (x) P3.q.C0(arrayList);
        } else {
            xVar = null;
        }
        B b4 = this.f2758l;
        if (b4 != null && z8 && !b4.equals(yVar)) {
            xVarQ = b4.q(lVar, z7, true, this);
        }
        return (x) P3.q.C0(P3.m.g0(new x[]{xVarJ, xVar, xVarQ}));
    }

    @Override // G2.y
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        String str = this.f2624v;
        y yVarO = (str == null || AbstractC2510o.g0(str)) ? null : o(str, true);
        if (yVarO == null) {
            yVarO = p(this.f2622t, this, false);
        }
        sb.append(" startDestination=");
        if (yVarO == null) {
            String str2 = this.f2624v;
            if (str2 != null) {
                sb.append(str2);
            } else {
                String str3 = this.f2623u;
                if (str3 != null) {
                    sb.append(str3);
                } else {
                    sb.append("0x" + Integer.toHexString(this.f2622t));
                }
            }
        } else {
            sb.append("{");
            sb.append(yVarO.toString());
            sb.append("}");
        }
        String string = sb.toString();
        kotlin.jvm.internal.l.e("sb.toString()", string);
        return string;
    }
}
