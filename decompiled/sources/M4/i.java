package M4;

import P3.q;
import P3.r;
import f6.AbstractC0905c;
import g5.o;
import io.ktor.http.LinkHeader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.l;
import n5.AbstractC1580q;
import n5.AbstractC1586x;
import n5.B;
import n5.I;
import n5.Q;
import n5.a0;
import o5.C1706f;
import o5.InterfaceC1704d;
import u4.InterfaceC2099e;
import u4.InterfaceC2102h;
import z5.AbstractC2510o;

/* loaded from: classes.dex */
public final class i extends AbstractC1580q {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(B b4, B b7) {
        super(b4, b7);
        l.f("lowerBound", b4);
        l.f("upperBound", b7);
        InterfaceC1704d.a.b(b4, b7);
    }

    public static final ArrayList C0(Y4.h hVar, AbstractC1586x abstractC1586x) throws IOException {
        List<Q> listQ0 = abstractC1586x.q0();
        ArrayList arrayList = new ArrayList(r.p(listQ0, 10));
        for (Q q6 : listQ0) {
            hVar.getClass();
            l.f("typeProjection", q6);
            StringBuilder sb = new StringBuilder();
            q.x0(r.H(q6), sb, ", ", null, null, new Y4.g(hVar, 0), 60);
            arrayList.add(sb.toString());
        }
        return arrayList;
    }

    public static final String D0(String str, String str2) {
        if (!AbstractC2510o.X(str, '<')) {
            return str;
        }
        return AbstractC2510o.E0(str, '<') + '<' + str2 + '>' + AbstractC2510o.C0('>', str, str);
    }

    @Override // n5.AbstractC1580q
    public final B A0() {
        return this.f13407l;
    }

    @Override // n5.AbstractC1580q
    public final String B0(Y4.h hVar, Y4.h hVar2) throws IOException {
        l.f("renderer", hVar);
        B b4 = this.f13407l;
        String strU = hVar.U(b4);
        B b7 = this.f13408m;
        String strU2 = hVar.U(b7);
        if (hVar2.a.l()) {
            return "raw (" + strU + ".." + strU2 + ')';
        }
        if (b7.q0().isEmpty()) {
            return hVar.C(strU, strU2, AbstractC0905c.n(this));
        }
        ArrayList arrayListC0 = C0(hVar, b4);
        ArrayList arrayListC02 = C0(hVar, b7);
        String strY0 = q.y0(arrayListC0, ", ", null, null, h.f6567k, 30);
        ArrayList arrayListZ0 = q.Z0(arrayListC0, arrayListC02);
        if (arrayListZ0.isEmpty()) {
            strU2 = D0(strU2, strY0);
        } else {
            Iterator it = arrayListZ0.iterator();
            while (it.hasNext()) {
                O3.l lVar = (O3.l) it.next();
                String str = (String) lVar.f7528k;
                String str2 = (String) lVar.f7529l;
                if (!l.a(str, AbstractC2510o.o0(str2, "out ")) && !str2.equals("*")) {
                    break;
                }
            }
            strU2 = D0(strU2, strY0);
        }
        String strD0 = D0(strU, strY0);
        return l.a(strD0, strU2) ? strD0 : hVar.C(strD0, strU2, AbstractC0905c.n(this));
    }

    @Override // n5.AbstractC1580q, n5.AbstractC1586x
    public final o k0() {
        InterfaceC2102h interfaceC2102hF = t0().f();
        InterfaceC2099e interfaceC2099e = interfaceC2102hF instanceof InterfaceC2099e ? (InterfaceC2099e) interfaceC2102hF : null;
        if (interfaceC2099e != null) {
            o oVarN = interfaceC2099e.N(new g());
            l.e("getMemberScope(...)", oVarN);
            return oVarN;
        }
        throw new IllegalStateException(("Incorrect classifier: " + t0().f()).toString());
    }

    @Override // n5.AbstractC1586x
    /* renamed from: v0 */
    public final AbstractC1586x y0(C1706f c1706f) {
        l.f("kotlinTypeRefiner", c1706f);
        B b4 = this.f13407l;
        l.f(LinkHeader.Parameters.Type, b4);
        B b7 = this.f13408m;
        l.f(LinkHeader.Parameters.Type, b7);
        return new i(b4, b7);
    }

    @Override // n5.a0
    public final a0 x0(boolean z7) {
        return new i(this.f13407l.x0(z7), this.f13408m.x0(z7));
    }

    @Override // n5.a0
    public final a0 y0(C1706f c1706f) {
        l.f("kotlinTypeRefiner", c1706f);
        B b4 = this.f13407l;
        l.f(LinkHeader.Parameters.Type, b4);
        B b7 = this.f13408m;
        l.f(LinkHeader.Parameters.Type, b7);
        return new i(b4, b7);
    }

    @Override // n5.a0
    public final a0 z0(I i7) {
        l.f("newAttributes", i7);
        return new i(this.f13407l.z0(i7), this.f13408m.z0(i7));
    }
}
