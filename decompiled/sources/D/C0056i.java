package D;

import G2.C0174k;
import H0.C0214f;
import H5.InterfaceC0265f0;
import L.C0390k2;
import L.X0;
import L.Y0;
import M.C0462u;
import O.C0493g0;
import android.graphics.Canvas;
import android.view.DragEvent;
import androidx.lifecycle.InterfaceC0694v;
import d.C0771e;
import d.C0778l;
import e4.InterfaceC0821a;
import e5.AbstractC0832b;
import f.AbstractC0841b;
import f0.C0866s;
import f1.AbstractC0870c;
import h0.AbstractC0982e;
import h0.AbstractC0993p;
import h0.C0970O;
import h0.C0972Q;
import h0.C0976V;
import h0.C0998u;
import h0.InterfaceC0995r;
import io.ktor.util.GzipHeaderFlags;
import j0.AbstractC1299e;
import j0.InterfaceC1298d;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import o.C1594F;
import o.C1602N;
import o.C1613k;
import o.EnumC1624v;
import p.AbstractC1745d;
import p.C1743c;
import p.C1759k;
import p.C1761m;
import s.C1924l;
import s.EnumC1903a0;
import w0.AbstractC2182Q;
import w0.InterfaceC2175J;
import y0.AbstractC2359f;
import y0.C2349D;
import z0.C2471u;
import z0.ViewOnDragListenerC2465q0;

/* renamed from: D.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0056i extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1182l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f1183m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f1184n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f1185o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0056i(C0866s c0866s, androidx.compose.ui.focus.b bVar, e4.k kVar) {
        super(1);
        this.f1182l = 11;
        this.f1183m = c0866s;
        this.f1184n = bVar;
        this.f1185o = (kotlin.jvm.internal.m) kVar;
    }

    /* JADX WARN: Type inference failed for: r0v84, types: [e4.k, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r14v107, types: [e4.a, kotlin.jvm.internal.m] */
    @Override // e4.k
    public final Object invoke(Object obj) {
        boolean zBooleanValue;
        switch (this.f1182l) {
            case 0:
                N0.w wVar = (N0.w) obj;
                ((O.Z) this.f1184n).setValue(wVar);
                O.Z z7 = (O.Z) this.f1185o;
                boolean zA = kotlin.jvm.internal.l.a((String) z7.getValue(), wVar.a.a);
                C0214f c0214f = wVar.a;
                z7.setValue(c0214f.a);
                if (!zA) {
                    ((e4.k) this.f1183m).invoke(c0214f.a);
                }
                return O3.C.a;
            case 1:
                InterfaceC1298d interfaceC1298d = (InterfaceC1298d) obj;
                C0053g0 c0053g0 = (C0053g0) this.f1183m;
                N0 n0D = c0053g0.d();
                if (n0D != null) {
                    InterfaceC0995r interfaceC0995rT = interfaceC1298d.D().t();
                    long j7 = ((H0.H) c0053g0.f1165x.getValue()).a;
                    long j8 = ((H0.H) c0053g0.f1166y.getValue()).a;
                    long j9 = c0053g0.f1164w;
                    boolean zB = H0.H.b(j7);
                    N0.q qVar = (N0.q) this.f1185o;
                    H0.F f5 = n0D.a;
                    H0.E e7 = f5.a;
                    H1.e0 e0Var = c0053g0.f1163v;
                    if (!zB) {
                        e0Var.f(j9);
                        int iB = qVar.b(H0.H.e(j7));
                        int iB2 = qVar.b(H0.H.d(j7));
                        if (iB != iB2) {
                            interfaceC0995rT.c(f5.j(iB, iB2), e0Var);
                        }
                    } else if (H0.H.b(j8)) {
                        long j10 = ((N0.w) this.f1184n).f6896b;
                        if (!H0.H.b(j10)) {
                            e0Var.f(j9);
                            int iB3 = qVar.b(H0.H.e(j10));
                            int iB4 = qVar.b(H0.H.d(j10));
                            if (iB3 != iB4) {
                                interfaceC0995rT.c(f5.j(iB3, iB4), e0Var);
                            }
                        }
                    } else {
                        long jB = e7.f3074b.b();
                        C0998u c0998u = new C0998u(jB);
                        if (jB == 16) {
                            c0998u = null;
                        }
                        long j11 = c0998u != null ? c0998u.a : C0998u.f11829b;
                        e0Var.f(C0998u.b(C0998u.d(j11) * 0.2f, j11));
                        int iB5 = qVar.b(H0.H.e(j8));
                        int iB6 = qVar.b(H0.H.d(j8));
                        if (iB5 != iB6) {
                            interfaceC0995rT.c(f5.j(iB5, iB6), e0Var);
                        }
                    }
                    long j12 = f5.f3084c;
                    float f7 = (int) (j12 >> 32);
                    H0.n nVar = f5.f3083b;
                    boolean z8 = ((f7 > nVar.f3130d ? 1 : (f7 == nVar.f3130d ? 0 : -1)) < 0 || nVar.f3129c || (((float) ((int) (j12 & 4294967295L))) > nVar.f3131e ? 1 : (((float) ((int) (j12 & 4294967295L))) == nVar.f3131e ? 0 : -1)) < 0) && e7.f3078f != 3;
                    if (z8) {
                        g0.d dVarC = AbstractC0841b.c(0L, AbstractC0870c.F((int) (j12 >> 32), (int) (j12 & 4294967295L)));
                        interfaceC0995rT.l();
                        InterfaceC0995r.r(interfaceC0995rT, dVarC);
                    }
                    H0.B b4 = e7.f3074b.a;
                    S0.j jVar = b4.f3066m;
                    S0.m mVar = b4.a;
                    if (jVar == null) {
                        jVar = S0.j.f8715b;
                    }
                    S0.j jVar2 = jVar;
                    C0972Q c0972q = b4.f3067n;
                    if (c0972q == null) {
                        c0972q = C0972Q.f11801d;
                    }
                    C0972Q c0972q2 = c0972q;
                    AbstractC1299e abstractC1299e = b4.f3069p;
                    if (abstractC1299e == null) {
                        abstractC1299e = j0.g.a;
                    }
                    AbstractC1299e abstractC1299e2 = abstractC1299e;
                    try {
                        AbstractC0993p abstractC0993pC = mVar.c();
                        S0.l lVar = S0.l.a;
                        if (abstractC0993pC != null) {
                            H0.n.g(nVar, interfaceC0995rT, abstractC0993pC, mVar != lVar ? mVar.a() : 1.0f, c0972q2, jVar2, abstractC1299e2);
                        } else {
                            long jB2 = mVar != lVar ? mVar.b() : C0998u.f11829b;
                            interfaceC0995rT.l();
                            ArrayList arrayList = nVar.f3134h;
                            int size = arrayList.size();
                            for (int i7 = 0; i7 < size; i7++) {
                                H0.p pVar = (H0.p) arrayList.get(i7);
                                pVar.a.f(interfaceC0995rT, jB2, c0972q2, jVar2, abstractC1299e2);
                                interfaceC0995rT.f(0.0f, pVar.a.b());
                            }
                            interfaceC0995rT.i();
                        }
                        if (z8) {
                            interfaceC0995rT.i();
                        }
                    } finally {
                    }
                }
                return O3.C.a;
            case 2:
                N0.B b7 = (N0.B) ((kotlin.jvm.internal.x) this.f1185o).f12720k;
                N0.w wVarA1 = ((L2.e) this.f1183m).a1((List) obj);
                if (b7 != null) {
                    b7.a(null, wVarA1);
                }
                ((A) this.f1184n).invoke(wVarA1);
                return O3.C.a;
            case 3:
                C0174k c0174k = (C0174k) this.f1184n;
                Y.r rVar = (Y.r) this.f1183m;
                rVar.add(c0174k);
                return new H2.k((H2.p) this.f1185o, c0174k, rVar, 0);
            case GzipHeaderFlags.EXTRA /* 4 */:
                float fFloatValue = ((Number) obj).floatValue();
                C0390k2 c0390k2 = (C0390k2) this.f1184n;
                H5.D.x((M5.c) this.f1183m, null, new Y0(c0390k2, fFloatValue, null), 3).x(new X0(c0390k2, (InterfaceC0821a) this.f1185o, 1));
                return O3.C.a;
            case 5:
                AbstractC2182Q abstractC2182Q = (AbstractC2182Q) obj;
                boolean zS = ((InterfaceC2175J) this.f1183m).s();
                C0462u c0462u = (C0462u) this.f1184n;
                float fD = zS ? c0462u.f6346x.d().d(c0462u.f6346x.f6338h.getValue()) : c0462u.f6346x.f();
                EnumC1903a0 enumC1903a0 = c0462u.f6348z;
                float f8 = enumC1903a0 == EnumC1903a0.f15260l ? fD : 0.0f;
                if (enumC1903a0 != EnumC1903a0.f15259k) {
                    fD = 0.0f;
                }
                AbstractC2182Q.d(abstractC2182Q, (w0.S) this.f1185o, P3.F.W(f8), P3.F.W(fD));
                return O3.C.a;
            case 6:
                InterfaceC0995r interfaceC0995rT2 = ((InterfaceC1298d) obj).D().t();
                W0.q qVar2 = (W0.q) this.f1183m;
                if (qVar2.getView().getVisibility() != 8) {
                    qVar2.f9542E = true;
                    C2471u c2471u = ((C2349D) this.f1184n).f17679s;
                    if (c2471u == null) {
                        c2471u = null;
                    }
                    if (c2471u != null) {
                        Canvas canvasA = AbstractC0982e.a(interfaceC0995rT2);
                        c2471u.getAndroidViewsHandler$ui_release().getClass();
                        ((W0.q) this.f1185o).draw(canvasA);
                    }
                    qVar2.f9542E = false;
                }
                return O3.C.a;
            case 7:
                X.g gVar = (X.g) this.f1183m;
                LinkedHashMap linkedHashMap = gVar.f9685b;
                Object obj2 = this.f1184n;
                if (linkedHashMap.containsKey(obj2)) {
                    throw new IllegalArgumentException(("Key " + obj2 + " was used multiple times ").toString());
                }
                gVar.a.remove(obj2);
                LinkedHashMap linkedHashMap2 = gVar.f9685b;
                X.f fVar = (X.f) this.f1185o;
                linkedHashMap2.put(obj2, fVar);
                return new H2.k(fVar, gVar, obj2, 1);
            case 8:
                c.x xVar = (c.x) this.f1183m;
                InterfaceC0694v interfaceC0694v = (InterfaceC0694v) this.f1184n;
                C0771e c0771e = (C0771e) this.f1185o;
                xVar.a(interfaceC0694v, c0771e);
                return new r(5, c0771e);
            case 9:
                c.x xVar2 = (c.x) this.f1183m;
                InterfaceC0694v interfaceC0694v2 = (InterfaceC0694v) this.f1184n;
                C0778l c0778l = (C0778l) this.f1185o;
                xVar2.a(interfaceC0694v2, c0778l);
                return new r(6, c0778l);
            case 10:
                y0.o0 o0Var = (y0.o0) obj;
                d0.e eVar = (d0.e) o0Var;
                if (((ViewOnDragListenerC2465q0) ((C2471u) AbstractC2359f.w((d0.e) this.f1184n)).getDragAndDropManager()).f18830b.contains(eVar)) {
                    DragEvent dragEvent = (DragEvent) ((X4.y) this.f1185o).f9916l;
                    if (P3.F.f(eVar, AbstractC0832b.e(dragEvent.getX(), dragEvent.getY()))) {
                        ((kotlin.jvm.internal.x) this.f1183m).f12720k = o0Var;
                        return y0.n0.f17883m;
                    }
                }
                return y0.n0.f17881k;
            case 11:
                C0866s c0866s = (C0866s) obj;
                if (kotlin.jvm.internal.l.a(c0866s, (C0866s) this.f1183m)) {
                    zBooleanValue = false;
                } else {
                    if (kotlin.jvm.internal.l.a(c0866s, ((androidx.compose.ui.focus.b) this.f1184n).f10654f)) {
                        throw new IllegalStateException("Focus search landed at the root.");
                    }
                    zBooleanValue = ((Boolean) ((kotlin.jvm.internal.m) this.f1185o).invoke(c0866s)).booleanValue();
                }
                return Boolean.valueOf(zBooleanValue);
            case 12:
                return new H2.k((Y.r) this.f1183m, this.f1184n, (C1613k) this.f1185o);
            case 13:
                C0970O c0970o = (C0970O) obj;
                p.o0 o0Var2 = (p.o0) this.f1183m;
                c0970o.b(o0Var2 != null ? ((Number) o0Var2.getValue()).floatValue() : 1.0f);
                p.o0 o0Var3 = (p.o0) this.f1184n;
                c0970o.f(o0Var3 != null ? ((Number) o0Var3.getValue()).floatValue() : 1.0f);
                c0970o.g(o0Var3 != null ? ((Number) o0Var3.getValue()).floatValue() : 1.0f);
                p.o0 o0Var4 = (p.o0) this.f1185o;
                c0970o.k(o0Var4 != null ? ((C0976V) o0Var4.getValue()).a : C0976V.f11815b);
                return O3.C.a;
            case 14:
                int iOrdinal = ((EnumC1624v) obj).ordinal();
                C0976V c0976v = null;
                C1594F c1594f = (C1594F) this.f1185o;
                if (iOrdinal == 0) {
                    C1602N c1602n = c1594f.a;
                } else if (iOrdinal == 1) {
                    c0976v = (C0976V) this.f1183m;
                } else {
                    if (iOrdinal != 2) {
                        throw new D6.r();
                    }
                    C1602N c1602n2 = c1594f.a;
                }
                return new C0976V(c0976v != null ? c0976v.a : C0976V.f11815b);
            case 15:
                C1759k c1759k = (C1759k) obj;
                C1743c c1743c = (C1743c) this.f1183m;
                AbstractC1745d.r(c1759k, c1743c.f13958c);
                C0493g0 c0493g0 = c1759k.f14030e;
                Object objA = C1743c.a(c1743c, c0493g0.getValue());
                if (!kotlin.jvm.internal.l.a(objA, c0493g0.getValue())) {
                    c1743c.f13958c.f14048l.setValue(objA);
                    ((C1761m) this.f1184n).f14048l.setValue(objA);
                    c1759k.f14034i.setValue(Boolean.FALSE);
                    c1759k.f14029d.invoke();
                    ((kotlin.jvm.internal.t) this.f1185o).f12716k = true;
                }
                return O3.C.a;
            case 16:
                float fFloatValue2 = ((Number) obj).floatValue();
                C1924l c1924l = (C1924l) this.f1183m;
                float f9 = c1924l.f15337z ? 1.0f : -1.0f;
                s.D0 d02 = c1924l.f15336y;
                long jD = d02.d(d02.g(f9 * fFloatValue2));
                s.D0 d03 = ((s.A0) this.f1185o).a;
                float f10 = d02.f(d02.d(s.D0.a(d03, d03.f15104h, jD, 1))) * f9;
                if (Math.abs(f10) < Math.abs(fFloatValue2)) {
                    H5.D.i((InterfaceC0265f0) this.f1184n, "Scroll animation cancelled because scroll was not consumed (" + f10 + " < " + fFloatValue2 + ')', null);
                }
                return O3.C.a;
            case 17:
                AbstractC2182Q abstractC2182Q2 = (AbstractC2182Q) obj;
                v.X x7 = (v.X) this.f1183m;
                boolean z9 = x7.f16419B;
                InterfaceC2175J interfaceC2175J = (InterfaceC2175J) this.f1185o;
                w0.S s7 = (w0.S) this.f1184n;
                if (z9) {
                    AbstractC2182Q.f(abstractC2182Q2, s7, interfaceC2175J.O(x7.f16420x), interfaceC2175J.O(x7.f16421y));
                } else {
                    AbstractC2182Q.d(abstractC2182Q2, s7, interfaceC2175J.O(x7.f16420x), interfaceC2175J.O(x7.f16421y));
                }
                return O3.C.a;
            case 18:
                v.a0 a0Var = (v.a0) this.f1185o;
                v.Y y7 = a0Var.f16429x;
                InterfaceC2175J interfaceC2175J2 = (InterfaceC2175J) this.f1184n;
                AbstractC2182Q.d((AbstractC2182Q) obj, (w0.S) this.f1183m, interfaceC2175J2.O(y7.b(interfaceC2175J2.getLayoutDirection())), interfaceC2175J2.O(a0Var.f16429x.c()));
                return O3.C.a;
            default:
                AbstractC2182Q abstractC2182Q3 = (AbstractC2182Q) obj;
                ArrayList arrayList2 = (ArrayList) this.f1183m;
                int size2 = arrayList2.size();
                int i8 = 0;
                while (true) {
                    w.m mVar2 = (w.m) this.f1185o;
                    if (i8 >= size2) {
                        if (mVar2 != null) {
                            mVar2.g(abstractC2182Q3);
                        }
                        ((O.Z) this.f1184n).getValue();
                        return O3.C.a;
                    }
                    w.m mVar3 = (w.m) arrayList2.get(i8);
                    if (mVar3 != mVar2) {
                        mVar3.g(abstractC2182Q3);
                    }
                    i8++;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0056i(Object obj, Object obj2, Object obj3, int i7) {
        super(1);
        this.f1182l = i7;
        this.f1183m = obj;
        this.f1184n = obj2;
        this.f1185o = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0056i(ArrayList arrayList, w.m mVar, boolean z7, O.Z z8) {
        super(1);
        this.f1182l = 19;
        this.f1183m = arrayList;
        this.f1185o = mVar;
        this.f1184n = z8;
    }
}
