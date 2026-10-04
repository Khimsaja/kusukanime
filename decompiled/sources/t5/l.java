package t5;

import e5.AbstractC0832b;
import java.util.List;
import n5.AbstractC1566c;
import n5.AbstractC1586x;
import n5.B;
import n5.G;
import n5.I;
import n5.Y;
import o5.InterfaceC1704d;
import r4.AbstractC1886o;
import r4.C1884m;
import r4.C1885n;
import u4.AbstractC2115v;
import u4.InterfaceC2099e;
import u4.InterfaceC2118y;
import u4.Q;
import x4.C2272S;

/* loaded from: classes.dex */
public final class l implements e {

    /* renamed from: b, reason: collision with root package name */
    public static final l f16113b = new l(0);

    /* renamed from: c, reason: collision with root package name */
    public static final l f16114c = new l(1);
    public final /* synthetic */ int a;

    public /* synthetic */ l(int i7) {
        this.a = i7;
    }

    @Override // t5.e
    public final /* bridge */ String a(J4.f fVar) {
        switch (this.a) {
        }
        return AbstractC0832b.v(this, fVar);
    }

    @Override // t5.e
    public final boolean b(J4.f fVar) {
        B bT;
        switch (this.a) {
            case 0:
                C2272S c2272s = (C2272S) fVar.m0().get(1);
                C1884m c1884m = C1885n.f14959d;
                kotlin.jvm.internal.l.c(c2272s);
                InterfaceC2118y interfaceC2118yJ = d5.e.j(c2272s);
                c1884m.getClass();
                InterfaceC2099e interfaceC2099eD = AbstractC2115v.d(interfaceC2118yJ, AbstractC1886o.f14978R);
                if (interfaceC2099eD == null) {
                    bT = null;
                } else {
                    I.f13362l.getClass();
                    I i7 = I.f13363m;
                    List parameters = interfaceC2099eD.v().getParameters();
                    kotlin.jvm.internal.l.e("getParameters(...)", parameters);
                    Object objK0 = P3.q.K0(parameters);
                    kotlin.jvm.internal.l.e("single(...)", objK0);
                    bT = AbstractC1566c.t(i7, interfaceC2099eD, P3.r.H(new G((Q) objK0)));
                }
                if (bT == null) {
                    return false;
                }
                AbstractC1586x type = c2272s.getType();
                kotlin.jvm.internal.l.e("getType(...)", type);
                return InterfaceC1704d.a.b(bT, Y.g(type, false));
            default:
                List<C2272S> listM0 = fVar.m0();
                kotlin.jvm.internal.l.e("getValueParameters(...)", listM0);
                if (!listM0.isEmpty()) {
                    for (C2272S c2272s2 : listM0) {
                        kotlin.jvm.internal.l.c(c2272s2);
                        if (d5.e.a(c2272s2) || c2272s2.f17412t != null) {
                            return false;
                        }
                    }
                }
                return true;
        }
    }

    @Override // t5.e
    public final String c() {
        switch (this.a) {
            case 0:
                return "second parameter must be of type KProperty<*> or its supertype";
            default:
                return "should not have varargs or parameters with default values";
        }
    }
}
