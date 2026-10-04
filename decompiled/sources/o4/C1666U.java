package o4;

import A4.AbstractC0011d;
import e4.InterfaceC0821a;
import e5.C0833c;
import f.AbstractC0847h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import l4.InterfaceC1443v;
import l5.C1464q;
import u4.InterfaceC2118y;
import z4.C2490b;
import z4.C2491c;
import z4.C2494f;

/* renamed from: o4.U, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1666U implements InterfaceC0821a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f13657k;

    /* renamed from: l, reason: collision with root package name */
    public final W f13658l;

    public /* synthetic */ C1666U(W w7, int i7) {
        this.f13657k = i7;
        this.f13658l = w7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Iterable] */
    @Override // e4.InterfaceC0821a
    public final Object invoke() throws X4.r {
        ?? H6;
        String[] strArr;
        switch (this.f13657k) {
            case 0:
                W w7 = this.f13658l;
                w7.getClass();
                InterfaceC1443v interfaceC1443v = W.f13662g[0];
                C2491c c2491c = (C2491c) w7.f13663c.invoke();
                if (c2491c == null) {
                    return g5.n.f11759b;
                }
                InterfaceC1443v interfaceC1443v2 = AbstractC1651E.f13632b[0];
                Object objInvoke = w7.a.invoke();
                kotlin.jvm.internal.l.e("getValue(...)", objInvoke);
                B2.l lVar = ((C2494f) objInvoke).f19034b;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) lVar.f418n;
                Class cls = c2491c.a;
                W4.b bVarA = AbstractC0011d.a(cls);
                Object obj = concurrentHashMap.get(bVarA);
                if (obj == null) {
                    W4.b bVarA2 = AbstractC0011d.a(cls);
                    Q4.b bVar = c2491c.f19031b;
                    Q4.a aVar = Q4.a.f8000r;
                    P4.e eVar = (P4.e) lVar.f416l;
                    Q4.a aVar2 = (Q4.a) bVar.f8005c;
                    if (aVar2 == aVar) {
                        String[] strArr2 = aVar2 == aVar ? (String[]) bVar.f8007e : null;
                        List listP = strArr2 != null ? P3.m.P(strArr2) : null;
                        if (listP == null) {
                            listP = P3.y.f7779k;
                        }
                        H6 = new ArrayList();
                        Iterator it = listP.iterator();
                        while (it.hasNext()) {
                            W4.c cVar = new W4.c(C0833c.c((String) it.next()).a.replace('/', '.'));
                            W4.b bVar2 = new W4.b(cVar.b(), cVar.a.g());
                            eVar.c().f12415c.getClass();
                            C2491c c2491cQ = z1.c.q((C2490b) lVar.f417m, bVar2, T4.f.f9107g);
                            if (c2491cQ != null) {
                                H6.add(c2491cQ);
                            }
                        }
                    } else {
                        H6 = P3.r.H(c2491c);
                    }
                    InterfaceC2118y interfaceC2118y = eVar.c().f12414b;
                    W4.c cVar2 = bVarA2.a;
                    t4.n nVar = new t4.n(interfaceC2118y, cVar2, 1);
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = H6.iterator();
                    while (it2.hasNext()) {
                        C1464q c1464qA = eVar.a(nVar, (C2491c) it2.next());
                        if (c1464qA != null) {
                            arrayList.add(c1464qA);
                        }
                    }
                    g5.o oVarM = AbstractC0847h.m("package " + cVar2 + " (" + c2491c + ')', P3.q.S0(arrayList));
                    Object objPutIfAbsent = concurrentHashMap.putIfAbsent(bVarA, oVarM);
                    obj = objPutIfAbsent == null ? oVarM : objPutIfAbsent;
                }
                kotlin.jvm.internal.l.e("getOrPut(...)", obj);
                return (g5.o) obj;
            default:
                W w8 = this.f13658l;
                w8.getClass();
                InterfaceC1443v interfaceC1443v3 = W.f13662g[0];
                C2491c c2491c2 = (C2491c) w8.f13663c.invoke();
                if (c2491c2 != null) {
                    Q4.b bVar3 = c2491c2.f19031b;
                    String[] strArr3 = (String[]) bVar3.f8007e;
                    if (strArr3 != null && (strArr = (String[]) bVar3.f8009g) != null) {
                        O3.l lVarH = V4.g.h(strArr3, strArr);
                        return new O3.r((V4.f) lVarH.f7528k, (R4.F) lVarH.f7529l, (T4.f) bVar3.f8006d);
                    }
                }
                return null;
        }
    }
}
