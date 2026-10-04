package s4;

import P3.q;
import b1.AbstractC0703b;
import f1.AbstractC0871d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n5.AbstractC1586x;
import n5.V;
import t5.r;
import u4.InterfaceC2105k;
import u4.InterfaceC2112s;
import u4.M;
import v4.C2159g;
import x4.AbstractC2294u;
import x4.C2266L;
import x4.C2272S;
import x4.C2293t;

/* loaded from: classes.dex */
public final class f extends C2266L {
    public f(InterfaceC2105k interfaceC2105k, f fVar, int i7, boolean z7) {
        super(interfaceC2105k, fVar, C2159g.a, r.f16126g, i7, M.f16295i);
        this.f17500w = true;
        this.f17485E = z7;
        this.f17486F = false;
    }

    @Override // x4.C2266L, x4.AbstractC2294u
    public final AbstractC2294u P0(int i7, W4.e eVar, InterfaceC2105k interfaceC2105k, InterfaceC2112s interfaceC2112s, M m7, v4.h hVar) {
        kotlin.jvm.internal.l.f("newOwner", interfaceC2105k);
        AbstractC0703b.w(i7, "kind");
        kotlin.jvm.internal.l.f("annotations", hVar);
        return new f(interfaceC2105k, (f) interfaceC2112s, i7, this.f17485E);
    }

    @Override // x4.AbstractC2294u
    public final AbstractC2294u Q0(C2293t c2293t) {
        W4.e eVar;
        kotlin.jvm.internal.l.f("configuration", c2293t);
        f fVar = (f) super.Q0(c2293t);
        if (fVar == null) {
            return null;
        }
        List listM0 = fVar.m0();
        kotlin.jvm.internal.l.e("getValueParameters(...)", listM0);
        if (listM0.isEmpty()) {
            return fVar;
        }
        Iterator it = listM0.iterator();
        while (it.hasNext()) {
            AbstractC1586x type = ((C2272S) it.next()).getType();
            kotlin.jvm.internal.l.e("getType(...)", type);
            if (AbstractC0871d.T(type) != null) {
                List listM02 = fVar.m0();
                kotlin.jvm.internal.l.e("getValueParameters(...)", listM02);
                ArrayList arrayList = new ArrayList(P3.r.p(listM02, 10));
                Iterator it2 = listM02.iterator();
                while (it2.hasNext()) {
                    AbstractC1586x type2 = ((C2272S) it2.next()).getType();
                    kotlin.jvm.internal.l.e("getType(...)", type2);
                    arrayList.add(AbstractC0871d.T(type2));
                }
                int size = fVar.m0().size() - arrayList.size();
                boolean z7 = true;
                if (size == 0) {
                    List listM03 = fVar.m0();
                    kotlin.jvm.internal.l.e("getValueParameters(...)", listM03);
                    ArrayList arrayListZ0 = q.Z0(arrayList, listM03);
                    if (arrayListZ0.isEmpty()) {
                        return fVar;
                    }
                    Iterator it3 = arrayListZ0.iterator();
                    while (it3.hasNext()) {
                        O3.l lVar = (O3.l) it3.next();
                        if (!kotlin.jvm.internal.l.a((W4.e) lVar.f7528k, ((C2272S) lVar.f7529l).getName())) {
                        }
                    }
                    return fVar;
                }
                List<C2272S> listM04 = fVar.m0();
                kotlin.jvm.internal.l.e("getValueParameters(...)", listM04);
                ArrayList arrayList2 = new ArrayList(P3.r.p(listM04, 10));
                for (C2272S c2272s : listM04) {
                    W4.e name = c2272s.getName();
                    kotlin.jvm.internal.l.e("getName(...)", name);
                    int i7 = c2272s.f17408p;
                    int i8 = i7 - size;
                    if (i8 >= 0 && (eVar = (W4.e) arrayList.get(i8)) != null) {
                        name = eVar;
                    }
                    arrayList2.add(c2272s.N0(fVar, name, i7));
                }
                C2293t c2293tT0 = fVar.T0(V.f13380b);
                if (arrayList.isEmpty()) {
                    z7 = false;
                } else {
                    Iterator it4 = arrayList.iterator();
                    while (it4.hasNext()) {
                        if (((W4.e) it4.next()) == null) {
                            break;
                        }
                    }
                    z7 = false;
                }
                c2293tT0.f17478v = Boolean.valueOf(z7);
                c2293tT0.f17463g = arrayList2;
                c2293tT0.f17461e = fVar.a();
                AbstractC2294u abstractC2294uQ0 = super.Q0(c2293tT0);
                kotlin.jvm.internal.l.c(abstractC2294uQ0);
                return abstractC2294uQ0;
            }
        }
        return fVar;
    }

    @Override // x4.AbstractC2294u, u4.InterfaceC2112s
    public final boolean X() {
        return false;
    }

    @Override // x4.AbstractC2294u, u4.InterfaceC2116w
    public final boolean isExternal() {
        return false;
    }

    @Override // x4.AbstractC2294u, u4.InterfaceC2112s
    public final boolean isInline() {
        return false;
    }
}
