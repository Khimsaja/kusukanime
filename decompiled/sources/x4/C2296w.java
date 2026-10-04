package x4;

import e4.InterfaceC0821a;
import e5.AbstractC0832b;
import f.AbstractC0847h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l4.InterfaceC1443v;
import m5.C1520i;
import u4.AbstractC2115v;
import u4.InterfaceC2088D;

/* renamed from: x4.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2296w implements InterfaceC0821a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f17507k;

    /* renamed from: l, reason: collision with root package name */
    public final C2297x f17508l;

    public /* synthetic */ C2296w(C2297x c2297x, int i7) {
        this.f17507k = i7;
        this.f17508l = c2297x;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        switch (this.f17507k) {
            case 0:
                C2297x c2297x = this.f17508l;
                C2255A c2255a = c2297x.f17510m;
                c2255a.M0();
                return AbstractC2115v.i((C2286m) c2255a.f17346u.getValue(), c2297x.f17511n);
            case 1:
                C2297x c2297x2 = this.f17508l;
                C2255A c2255a2 = c2297x2.f17510m;
                c2255a2.M0();
                return Boolean.valueOf(AbstractC2115v.h((C2286m) c2255a2.f17346u.getValue(), c2297x2.f17511n));
            default:
                C2297x c2297x3 = this.f17508l;
                C1520i c1520i = c2297x3.f17513p;
                InterfaceC1443v[] interfaceC1443vArr = C2297x.f17509r;
                if (((Boolean) AbstractC0832b.u(c1520i, interfaceC1443vArr[1])).booleanValue()) {
                    return g5.n.f11759b;
                }
                List list = (List) AbstractC0832b.u(c2297x3.f17512o, interfaceC1443vArr[0]);
                ArrayList arrayList = new ArrayList(P3.r.p(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((InterfaceC2088D) it.next()).k0());
                }
                C2255A c2255a3 = c2297x3.f17510m;
                W4.c cVar = c2297x3.f17511n;
                return AbstractC0847h.m("package view scope for " + cVar + " in " + c2255a3.getName(), P3.q.H0(arrayList, new C2267M(c2255a3, cVar)));
        }
    }
}
