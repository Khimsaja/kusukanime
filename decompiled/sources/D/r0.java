package D;

import F.C0144g;
import G2.C0174k;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import d.C0767a;
import d.C0768b;
import e4.InterfaceC0821a;
import e5.AbstractC0832b;
import f.C0840a;
import f.C0842c;
import f.C0843d;
import f.C0844e;
import g.C0928a;
import h0.C0975U;
import j0.InterfaceC1298d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import y0.AbstractC2359f;
import y0.C2351F;
import y5.C2418a;
import z0.AbstractC2455l0;
import z0.S0;

/* loaded from: classes.dex */
public final class r0 extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1278l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f1279m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f1280n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f1281o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f1282p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f1283q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(N0.w wVar, C0144g c0144g, N0.l lVar, C0056i c0056i, A a) {
        super(1);
        this.f1278l = 1;
        this.f1279m = wVar;
        this.f1280n = c0144g;
        this.f1281o = lVar;
        this.f1282p = c0056i;
        this.f1283q = a;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        List listSubList;
        Object objB = null;
        O3.C c2 = O3.C.a;
        Object obj2 = this.f1280n;
        Object obj3 = this.f1282p;
        Object obj4 = this.f1279m;
        Object obj5 = this.f1281o;
        Object obj6 = this.f1283q;
        switch (this.f1278l) {
            case 0:
                C2351F c2351f = (C2351F) obj;
                c2351f.b();
                float f5 = ((F.q) obj2).f2035b.f();
                if (f5 != 0.0f) {
                    int i7 = H0.H.f3092c;
                    int iB = ((N0.q) obj5).b((int) (((N0.w) obj4).f6896b >> 32));
                    N0 n0D = ((C0053g0) obj3).d();
                    g0.d dVarC = n0D != null ? n0D.a.c(iB) : new g0.d(0.0f, 0.0f, 0.0f, 0.0f);
                    float fX = c2351f.x(t0.a);
                    float f7 = fX / 2;
                    float f8 = dVarC.a + f7;
                    float fD = g0.f.d(c2351f.f17696k.d()) - f7;
                    if (f8 > fD) {
                        f8 = fD;
                    }
                    if (f8 >= f7) {
                        f7 = f8;
                    }
                    InterfaceC1298d.F(c2351f, (C0975U) obj6, AbstractC0832b.e(f7, dVarC.f11659b), AbstractC0832b.e(f7, dVarC.f11661d), fX, f5, 432);
                }
                return c2;
            case 1:
                F.C c4 = (F.C) obj;
                F.y yVar = ((C0144g) obj2).a;
                c4.f1987h = (N0.w) obj4;
                c4.f1988i = (N0.l) obj5;
                c4.f1982c = (C0056i) obj3;
                c4.f1983d = (A) obj6;
                c4.f1984e = yVar != null ? yVar.f2044y : null;
                c4.f1985f = yVar != null ? yVar.f2045z : null;
                c4.f1986g = yVar != null ? (S0) AbstractC2359f.i(yVar, AbstractC2455l0.f18798q) : null;
                return c2;
            case 2:
                C0174k c0174k = (C0174k) obj;
                kotlin.jvm.internal.l.f("entry", c0174k);
                ((kotlin.jvm.internal.t) obj2).f12716k = true;
                ArrayList arrayList = (ArrayList) obj5;
                int iIndexOf = arrayList.indexOf(c0174k);
                if (iIndexOf != -1) {
                    kotlin.jvm.internal.v vVar = (kotlin.jvm.internal.v) obj4;
                    int i8 = iIndexOf + 1;
                    listSubList = arrayList.subList(vVar.f12718k, i8);
                    vVar.f12718k = i8;
                } else {
                    listSubList = P3.y.f7779k;
                }
                ((G2.E) obj3).a(c0174k.f2703l, (Bundle) obj6, c0174k, listSubList);
                return c2;
            case 3:
                X0.v vVar2 = (X0.v) obj2;
                vVar2.f9760x.addView(vVar2, vVar2.f9761y);
                vVar2.l((InterfaceC0821a) obj5, (X0.z) obj4, (String) obj3, (T0.k) obj6);
                return new r(3, vVar2);
            default:
                C0768b c0768b = new C0768b((O.Z) obj6);
                c.l lVar = (c.l) obj5;
                lVar.getClass();
                String str = (String) obj4;
                kotlin.jvm.internal.l.f("key", str);
                C0928a c0928a = (C0928a) obj3;
                LinkedHashMap linkedHashMap = lVar.f11061b;
                if (((Integer) linkedHashMap.get(str)) == null) {
                    Iterator it = ((C2418a) y5.k.R(C0843d.f11380l)).iterator();
                    while (it.hasNext()) {
                        Number number = (Number) it.next();
                        int iIntValue = number.intValue();
                        LinkedHashMap linkedHashMap2 = lVar.a;
                        if (!linkedHashMap2.containsKey(Integer.valueOf(iIntValue))) {
                            int iIntValue2 = number.intValue();
                            linkedHashMap2.put(Integer.valueOf(iIntValue2), str);
                            linkedHashMap.put(str, Integer.valueOf(iIntValue2));
                        }
                    }
                    throw new NoSuchElementException("Sequence contains no element matching the predicate.");
                }
                lVar.f11064e.put(str, new C0842c(c0768b, c0928a));
                LinkedHashMap linkedHashMap3 = lVar.f11065f;
                boolean zContainsKey = linkedHashMap3.containsKey(str);
                O.Z z7 = c0768b.a;
                if (zContainsKey) {
                    Object obj7 = linkedHashMap3.get(str);
                    linkedHashMap3.remove(str);
                    ((e4.k) z7.getValue()).invoke(obj7);
                }
                int i9 = Build.VERSION.SDK_INT;
                Bundle bundle = lVar.f11066g;
                if (i9 >= 34) {
                    objB = c.h.b(str, bundle);
                } else {
                    Parcelable parcelable = bundle.getParcelable(str);
                    if (C0840a.class.isInstance(parcelable)) {
                        objB = parcelable;
                    }
                }
                C0840a c0840a = (C0840a) objB;
                if (c0840a != null) {
                    bundle.remove(str);
                    ((e4.k) z7.getValue()).invoke(c0928a.a(c0840a.f11378l, c0840a.f11377k));
                }
                C0767a c0767a = (C0767a) obj2;
                c0767a.a = new C0844e(lVar, str, c0928a);
                return new r(4, c0767a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        super(1);
        this.f1278l = i7;
        this.f1280n = obj;
        this.f1281o = obj2;
        this.f1279m = obj3;
        this.f1282p = obj4;
        this.f1283q = obj5;
    }
}
