package l5;

import P3.F;
import P3.y;
import R4.B;
import R4.C0570a;
import R4.C0577h;
import R4.J;
import R4.W;
import R4.i0;
import f1.AbstractC0870c;
import f1.AbstractC0871d;
import j5.C1344D;
import j5.C1356k;
import j5.C1365t;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import m5.C1523l;
import v4.C2159g;

/* renamed from: l5.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1460m implements e4.k {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f12800k;

    /* renamed from: l, reason: collision with root package name */
    public final C1462o f12801l;

    public /* synthetic */ C1460m(C1462o c1462o, int i7) {
        this.f12800k = i7;
        this.f12801l = c1462o;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        W4.e eVar = (W4.e) obj;
        switch (this.f12800k) {
            case 0:
                kotlin.jvm.internal.l.f("it", eVar);
                C1462o c1462o = this.f12801l;
                LinkedHashMap linkedHashMap = c1462o.a;
                C0570a c0570a = B.J;
                kotlin.jvm.internal.l.e("PARSER", c0570a);
                byte[] bArr = (byte[]) linkedHashMap.get(eVar);
                AbstractC1463p abstractC1463p = c1462o.f12813i;
                Collection<B> collectionW = bArr != null ? y5.k.W(y5.k.R(new A3.p(c0570a, new ByteArrayInputStream(bArr), abstractC1463p, 2))) : y.f7779k;
                ArrayList arrayList = new ArrayList(collectionW.size());
                for (B b4 : collectionW) {
                    C1365t c1365t = abstractC1463p.f12815b.f12446i;
                    kotlin.jvm.internal.l.c(b4);
                    C1466s c1466sF = c1365t.f(b4);
                    if (!abstractC1463p.r(c1466sF)) {
                        c1466sF = null;
                    }
                    if (c1466sF != null) {
                        arrayList.add(c1466sF);
                    }
                }
                abstractC1463p.j(eVar, arrayList);
                return w5.k.d(arrayList);
            case 1:
                kotlin.jvm.internal.l.f("it", eVar);
                C1462o c1462o2 = this.f12801l;
                LinkedHashMap linkedHashMap2 = c1462o2.f12806b;
                C0570a c0570a2 = J.f8200N;
                kotlin.jvm.internal.l.e("PARSER", c0570a2);
                byte[] bArr2 = (byte[]) linkedHashMap2.get(eVar);
                AbstractC1463p abstractC1463p2 = c1462o2.f12813i;
                Collection<J> collectionW2 = bArr2 != null ? y5.k.W(y5.k.R(new A3.p(c0570a2, new ByteArrayInputStream(bArr2), abstractC1463p2, 2))) : y.f7779k;
                ArrayList arrayList2 = new ArrayList(collectionW2.size());
                for (J j7 : collectionW2) {
                    C1365t c1365t2 = abstractC1463p2.f12815b.f12446i;
                    kotlin.jvm.internal.l.c(j7);
                    arrayList2.add(c1365t2.g(j7, false));
                }
                abstractC1463p2.k(eVar, arrayList2);
                return w5.k.d(arrayList2);
            default:
                kotlin.jvm.internal.l.f("it", eVar);
                C1462o c1462o3 = this.f12801l;
                byte[] bArr3 = (byte[]) c1462o3.f12807c.get(eVar);
                if (bArr3 != null) {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr3);
                    AbstractC1463p abstractC1463p3 = c1462o3.f12813i;
                    W w7 = (W) W.f8321A.b(byteArrayInputStream, abstractC1463p3.f12815b.a.f12428p);
                    if (w7 != null) {
                        C1365t c1365t3 = abstractC1463p3.f12815b.f12446i;
                        c1365t3.getClass();
                        List list = w7.f8332u;
                        kotlin.jvm.internal.l.e("getAnnotationList(...)", list);
                        ArrayList arrayList3 = new ArrayList(P3.r.p(list, 10));
                        Iterator it = list.iterator();
                        while (true) {
                            boolean zHasNext = it.hasNext();
                            C1356k c1356k = c1365t3.a;
                            if (!zHasNext) {
                                v4.h iVar = arrayList3.isEmpty() ? C2159g.a : new v4.i(0, arrayList3);
                                H4.o oVarO = AbstractC0871d.O((i0) T4.e.f9084d.c(w7.f8325n));
                                C1523l c1523l = c1356k.a.a;
                                W4.e eVarU = AbstractC0870c.U(c1356k.f12439b, w7.f8326o);
                                T4.i iVar2 = c1356k.f12441d;
                                C1467t c1467t = new C1467t(c1523l, c1356k.f12440c, iVar, eVarU, oVarO, w7, c1356k.f12439b, iVar2, c1356k.f12442e, c1356k.f12444g);
                                List list2 = w7.f8327p;
                                kotlin.jvm.internal.l.e("getTypeParameterList(...)", list2);
                                C1344D c1344d = c1356k.a(c1467t, list2, c1356k.f12439b, c1356k.f12441d, c1356k.f12442e, c1356k.f12443f).f12445h;
                                c1467t.Q0(c1344d.b(), c1344d.d(F.j0(w7, iVar2), false), c1344d.d(F.p(w7, iVar2), false));
                                return c1467t;
                            }
                            C0577h c0577h = (C0577h) it.next();
                            kotlin.jvm.internal.l.c(c0577h);
                            arrayList3.add(c1365t3.f12471b.d1(c0577h, c1356k.f12439b));
                        }
                    }
                }
                return null;
        }
    }
}
