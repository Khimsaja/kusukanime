package D;

import G2.C0174k;
import G2.C0176m;
import G2.C0178o;
import H.C0208z;
import H.InterfaceC0196m;
import H5.InterfaceC0265f0;
import L.AbstractC0381i1;
import O.C0485c0;
import O.C0487d0;
import O.C0519u;
import O.C0522v0;
import O.EnumC0511p0;
import O.R0;
import android.content.Context;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Parcelable;
import androidx.compose.ui.draw.ShadowGraphicsLayerElement;
import b1.AbstractC0703b;
import h0.C0962G;
import h0.C0970O;
import h0.C0974T;
import h0.C0987j;
import io.ktor.util.GzipHeaderFlags;
import j0.InterfaceC1298d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import k0.C1375b;
import m.C1472B;
import m.C1501v;
import n0.AbstractC1556w;
import n0.C1535b;
import o.C1613k;
import p.C1743c;
import y.C2309I;
import y0.C2349D;
import y0.C2351F;

/* renamed from: D.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0042b extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1126l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f1127m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0042b(int i7, Object obj) {
        super(1);
        this.f1126l = i7;
        this.f1127m = obj;
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [O3.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v87, types: [e4.k, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r0v88, types: [e4.k, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r0v92, types: [e4.k, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r3v5, types: [O3.i, java.lang.Object] */
    @Override // e4.k
    public final Object invoke(Object obj) {
        int i7;
        switch (this.f1126l) {
            case 0:
                ((F0.i) obj).j(H.A.f2870c, new C0208z(V.f1103k, ((InterfaceC0196m) this.f1127m).a(), 2, true));
                return O3.C.a;
            case 1:
                float[] fArr = ((C0962G) obj).a;
                w0.r rVar = (w0.r) this.f1127m;
                if (rVar.B()) {
                    w0.X.f(rVar).e(rVar, fArr);
                }
                return O3.C.a;
            case 2:
                float fFloatValue = ((Number) obj).floatValue();
                J0 j02 = (J0) this.f1127m;
                float f5 = j02.a.f() + fFloatValue;
                C0485c0 c0485c0 = j02.f1057b;
                float f7 = c0485c0.f();
                C0485c0 c0485c02 = j02.a;
                if (f5 > f7) {
                    fFloatValue = c0485c0.f() - c0485c02.f();
                } else if (f5 < 0.0f) {
                    fFloatValue = -c0485c02.f();
                }
                c0485c02.g(c0485c02.f() + fFloatValue);
                return Float.valueOf(fFloatValue);
            case 3:
                if (((Throwable) obj) != null) {
                    ((CancellationSignal) this.f1127m).cancel();
                }
                return O3.C.a;
            case GzipHeaderFlags.EXTRA /* 4 */:
                ((F.E) this.f1127m).a((N0.i) obj);
                return O3.C.a;
            case 5:
                F0.s.e((F0.i) obj, ((F0.f) this.f1127m).a);
                return O3.C.a;
            case 6:
                ((List) obj).add((Float) ((C2309I) this.f1127m).invoke());
                return true;
            case 7:
                kotlin.jvm.internal.l.f("key", (String) obj);
                G2.w wVar = (G2.w) this.f1127m;
                ArrayList arrayList = wVar.f2740b;
                Collection collectionValues = ((Map) wVar.f2744f.getValue()).values();
                ArrayList arrayList2 = new ArrayList();
                Iterator it = collectionValues.iterator();
                while (it.hasNext()) {
                    P3.v.e0(arrayList2, ((G2.t) it.next()).f2733b);
                }
                return Boolean.valueOf(!P3.q.G0(P3.q.G0(arrayList, arrayList2), (List) wVar.f2747i.getValue()).contains(r12));
            case 8:
                C0174k c0174k = (C0174k) obj;
                kotlin.jvm.internal.l.f("backStackEntry", c0174k);
                G2.y yVar = c0174k.f2703l;
                if (yVar == null) {
                    yVar = null;
                }
                if (yVar == null) {
                    return null;
                }
                c0174k.g();
                G2.O o7 = (G2.O) this.f1127m;
                G2.y yVarC = o7.c(yVar);
                if (yVarC == null) {
                    return null;
                }
                if (yVarC.equals(yVar)) {
                    return c0174k;
                }
                C0178o c0178oB = o7.b();
                Bundle bundleH = yVarC.h(c0174k.g());
                G2.E e7 = c0178oB.f2726h;
                return A.e.m(e7.a, yVarC, bundleH, e7.h(), e7.f2647p);
            case 9:
                Bundle bundle = (Bundle) obj;
                G2.E e8 = P3.r.e((Context) this.f1127m);
                if (bundle != null) {
                    bundle.setClassLoader(e8.a.getClassLoader());
                    e8.f2635d = bundle.getBundle("android-support-nav:controller:navigatorState");
                    e8.f2636e = bundle.getParcelableArray("android-support-nav:controller:backStack");
                    LinkedHashMap linkedHashMap = e8.f2645n;
                    linkedHashMap.clear();
                    int[] intArray = bundle.getIntArray("android-support-nav:controller:backStackDestIds");
                    ArrayList<String> stringArrayList = bundle.getStringArrayList("android-support-nav:controller:backStackIds");
                    if (intArray != null && stringArrayList != null) {
                        int length = intArray.length;
                        int i8 = 0;
                        int i9 = 0;
                        while (i8 < length) {
                            e8.f2644m.put(Integer.valueOf(intArray[i8]), stringArrayList.get(i9));
                            i8++;
                            i9++;
                        }
                    }
                    ArrayList<String> stringArrayList2 = bundle.getStringArrayList("android-support-nav:controller:backStackStates");
                    if (stringArrayList2 != null) {
                        for (String str : stringArrayList2) {
                            Parcelable[] parcelableArray = bundle.getParcelableArray("android-support-nav:controller:backStackStates:" + str);
                            if (parcelableArray != null) {
                                kotlin.jvm.internal.l.e("id", str);
                                P3.l lVar = new P3.l(parcelableArray.length);
                                O3.t tVarI = kotlin.jvm.internal.l.i(parcelableArray);
                                while (tVarI.hasNext()) {
                                    Parcelable parcelable = (Parcelable) tVarI.next();
                                    kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState", parcelable);
                                    lVar.addLast((C0176m) parcelable);
                                }
                                linkedHashMap.put(str, lVar);
                            }
                        }
                    }
                    e8.f2637f = bundle.getBoolean("android-support-nav:controller:deepLinkHandled");
                }
                return e8;
            case 10:
                C0970O c0970o = (C0970O) obj;
                float fFloatValue2 = ((Number) ((C1743c) this.f1127m).d()).floatValue();
                float fD = AbstractC0381i1.d(c0970o, fFloatValue2);
                float fE = AbstractC0381i1.e(c0970o, fFloatValue2);
                c0970o.g(fE == 0.0f ? 1.0f : fD / fE);
                c0970o.k(AbstractC0381i1.f5610c);
                return O3.C.a;
            case 11:
                ((C0487d0) this.f1127m).g((int) (((T0.j) obj).a >> 32));
                return O3.C.a;
            case 12:
                ((C0970O) obj).b(((Number) ((R0) this.f1127m).getValue()).floatValue());
                return O3.C.a;
            case 13:
                ((Number) obj).floatValue();
                return Float.valueOf(((T0.b) this.f1127m).x(56));
            case 14:
                M0.E e9 = (M0.E) obj;
                return ((M0.k) this.f1127m).a(new M0.E(null, e9.f6377b, e9.f6378c, e9.f6379d, e9.f6380e)).getValue();
            case 15:
                O.C.f6957l.removeFrameCallback((O.B) this.f1127m);
                return O3.C.a;
            case 16:
                Throwable th = (Throwable) obj;
                CancellationException cancellationExceptionA = H5.D.a("Recomposer effect job completed", th);
                C0522v0 c0522v0 = (C0522v0) this.f1127m;
                synchronized (c0522v0.f7221b) {
                    try {
                        InterfaceC0265f0 interfaceC0265f0 = c0522v0.f7222c;
                        if (interfaceC0265f0 != null) {
                            K5.Y y7 = c0522v0.f7237r;
                            EnumC0511p0 enumC0511p0 = EnumC0511p0.f7155l;
                            y7.getClass();
                            y7.i(null, enumC0511p0);
                            K5.Y y8 = C0522v0.f7219v;
                            interfaceC0265f0.e(cancellationExceptionA);
                            c0522v0.f7234o = null;
                            interfaceC0265f0.x(new A3.t(22, c0522v0, th));
                        } else {
                            c0522v0.f7223d = cancellationExceptionA;
                            K5.Y y9 = c0522v0.f7237r;
                            EnumC0511p0 enumC0511p02 = EnumC0511p0.f7154k;
                            y9.getClass();
                            y9.i(null, enumC0511p02);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return O3.C.a;
            case 17:
                ((C0519u) this.f1127m).v(obj);
                return O3.C.a;
            case 18:
                if (obj instanceof Y.w) {
                    ((Y.w) obj).e(4);
                }
                ((C1472B) this.f1127m).a(obj);
                return O3.C.a;
            case 19:
                ((V2.g) this.f1127m).f9470u = true;
                return O3.C.a;
            case 20:
                ((C2349D) this.f1127m).W((T0.b) obj);
                return O3.C.a;
            case 21:
                X.j jVar = ((X.g) this.f1127m).f9686c;
                return Boolean.valueOf(jVar != null ? jVar.b(obj) : true);
            case 22:
                Y.m mVar = (Y.m) obj;
                synchronized (Y.o.f10002b) {
                    i7 = Y.o.f10004d;
                    Y.o.f10004d = 1 + i7;
                }
                return new Y.g(i7, mVar, (e4.k) this.f1127m);
            case 23:
                Y.u uVar = (Y.u) this.f1127m;
                uVar.getClass();
                synchronized (uVar.f10031f) {
                    Y.t tVar = uVar.f10033h;
                    kotlin.jvm.internal.l.c(tVar);
                    Object obj2 = tVar.f10016b;
                    kotlin.jvm.internal.l.c(obj2);
                    int i10 = tVar.f10018d;
                    C1501v c1501v = tVar.f10017c;
                    if (c1501v == null) {
                        c1501v = new C1501v();
                        tVar.f10017c = c1501v;
                        tVar.f10020f.i(obj2, c1501v);
                    }
                    tVar.c(obj, i10, obj2, c1501v);
                }
                return O3.C.a;
            case 24:
                C2351F c2351f = (C2351F) obj;
                ((A3.t) this.f1127m).invoke(c2351f);
                c2351f.b();
                return O3.C.a;
            case 25:
                C0970O c0970o2 = (C0970O) obj;
                ShadowGraphicsLayerElement shadowGraphicsLayerElement = (ShadowGraphicsLayerElement) this.f1127m;
                shadowGraphicsLayerElement.getClass();
                c0970o2.h(c0970o2.f11797w.a() * r.h.f14767d);
                c0970o2.i(shadowGraphicsLayerElement.a);
                c0970o2.e(shadowGraphicsLayerElement.f10647b);
                c0970o2.c(shadowGraphicsLayerElement.f10648c);
                c0970o2.j(shadowGraphicsLayerElement.f10649d);
                return O3.C.a;
            case 26:
                C0970O c0970o3 = (C0970O) obj;
                C0974T c0974t = (C0974T) this.f1127m;
                c0970o3.f(c0974t.f11812x);
                c0970o3.g(c0974t.f11813y);
                c0970o3.b(c0974t.f11814z);
                c0970o3.h(c0974t.f11804A);
                float f8 = c0974t.f11805B;
                if (c0970o3.f11792r != f8) {
                    c0970o3.f11785k |= 2048;
                    c0970o3.f11792r = f8;
                }
                c0970o3.k(c0974t.f11806C);
                c0970o3.i(c0974t.f11807D);
                c0970o3.e(c0974t.f11808E);
                c0970o3.c(c0974t.f11809F);
                c0970o3.j(c0974t.f11810G);
                return O3.C.a;
            case 27:
                InterfaceC1298d interfaceC1298d = (InterfaceC1298d) obj;
                C1375b c1375b = (C1375b) this.f1127m;
                C0987j c0987j = c1375b.f12574l;
                if (c1375b.f12576n && c1375b.f12584v && c0987j != null) {
                    ?? r02 = c1375b.f12566d;
                    B2.l lVarD = interfaceC1298d.D();
                    long jA = lVarD.A();
                    lVarD.t().l();
                    try {
                        ((B2.l) ((X4.y) lVarD.f416l).f9916l).t().s(c0987j);
                        r02.invoke(interfaceC1298d);
                    } finally {
                        AbstractC0703b.y(lVarD, jA);
                    }
                } else {
                    c1375b.f12566d.invoke(interfaceC1298d);
                }
                return O3.C.a;
            case 28:
                AbstractC1556w abstractC1556w = (AbstractC1556w) obj;
                C1535b c1535b = (C1535b) this.f1127m;
                c1535b.g(abstractC1556w);
                ?? r03 = c1535b.f13136i;
                if (r03 != 0) {
                    r03.invoke(abstractC1556w);
                }
                return O3.C.a;
            default:
                R0 r04 = (R0) ((C1613k) this.f1127m).f13510d.e(obj);
                return new T0.j(r04 != null ? ((T0.j) r04.getValue()).a : 0L);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0042b(G2.O o7, G2.H h7) {
        super(1);
        this.f1126l = 8;
        this.f1127m = o7;
    }
}
