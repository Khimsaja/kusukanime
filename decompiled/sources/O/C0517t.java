package O;

import android.os.Trace;
import f6.AbstractC0905c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import m.C1471A;
import m.C1472B;
import m.C1495p;
import m.C1501v;
import y0.AbstractC2359f;
import y0.C2349D;
import y0.C2356c;
import y0.C2372t;
import y0.C2377y;
import y0.InterfaceC2375w;

/* renamed from: O.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0517t {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7172b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f7173c;

    /* renamed from: d, reason: collision with root package name */
    public Object f7174d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f7175e;

    /* renamed from: f, reason: collision with root package name */
    public Object f7176f;

    /* renamed from: g, reason: collision with root package name */
    public Object f7177g;

    /* renamed from: h, reason: collision with root package name */
    public Object f7178h;

    /* renamed from: i, reason: collision with root package name */
    public Object f7179i;

    public C0517t(C2349D c2349d) {
        this.a = 1;
        this.f7172b = c2349d;
        C2372t c2372t = new C2372t(c2349d);
        this.f7173c = c2372t;
        this.f7174d = c2372t;
        y0.m0 m0Var = c2372t.f17894T;
        this.f7175e = m0Var;
        this.f7176f = m0Var;
    }

    public static final void a(C0517t c0517t, a0.p pVar, y0.Y y7) {
        c0517t.getClass();
        for (a0.p pVar2 = pVar.f10406o; pVar2 != null; pVar2 = pVar2.f10406o) {
            if (pVar2 == y0.V.a) {
                C2349D c2349dS = ((C2349D) c0517t.f7172b).s();
                y7.f17827x = c2349dS != null ? (C2372t) c2349dS.f17660G.f7173c : null;
                c0517t.f7174d = y7;
                return;
            } else {
                if ((pVar2.f10404m & 2) != 0) {
                    return;
                }
                pVar2.F0(y7);
            }
        }
    }

    public static a0.p b(a0.o oVar, a0.p pVar) {
        a0.p pVarH;
        if (oVar instanceof y0.S) {
            pVarH = ((y0.S) oVar).h();
            pVarH.f10404m = y0.Z.g(pVarH);
        } else {
            C2356c c2356c = new C2356c();
            c2356c.f10404m = y0.Z.e(oVar);
            c2356c.f17833x = oVar;
            c2356c.f17835z = new HashSet();
            pVarH = c2356c;
        }
        if (pVarH.f10414w) {
            AbstractC0905c.C("A ModifierNodeElement cannot return an already attached node from create() ");
            throw null;
        }
        pVarH.f10410s = true;
        a0.p pVar2 = pVar.f10407p;
        if (pVar2 != null) {
            pVar2.f10406o = pVarH;
            pVarH.f10407p = pVar2;
        }
        pVar.f10407p = pVarH;
        pVarH.f10406o = pVar;
        return pVarH;
    }

    public static a0.p c(a0.p pVar) {
        boolean z7 = pVar.f10414w;
        if (z7) {
            C1501v c1501v = y0.Z.a;
            if (!z7) {
                AbstractC0905c.C("autoInvalidateRemovedNode called on unattached node");
                throw null;
            }
            y0.Z.b(pVar, -1, 2);
            pVar.D0();
            pVar.x0();
        }
        a0.p pVar2 = pVar.f10407p;
        a0.p pVar3 = pVar.f10406o;
        if (pVar2 != null) {
            pVar2.f10406o = pVar3;
            pVar.f10407p = null;
        }
        if (pVar3 != null) {
            pVar3.f10407p = pVar2;
            pVar.f10406o = null;
        }
        kotlin.jvm.internal.l.c(pVar3);
        return pVar3;
    }

    public static void l(a0.o oVar, a0.o oVar2, a0.p pVar) {
        if ((oVar instanceof y0.S) && (oVar2 instanceof y0.S)) {
            y0.U u5 = y0.V.a;
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe", pVar);
            ((y0.S) oVar2).m(pVar);
            if (pVar.f10414w) {
                y0.Z.d(pVar);
                return;
            } else {
                pVar.f10411t = true;
                return;
            }
        }
        if (!(pVar instanceof C2356c)) {
            throw new IllegalStateException("Unknown Modifier.Node type");
        }
        C2356c c2356c = (C2356c) pVar;
        if (c2356c.f10414w) {
            c2356c.H0();
        }
        c2356c.f17833x = oVar2;
        c2356c.f10404m = y0.Z.e(oVar2);
        if (c2356c.f10414w) {
            c2356c.G0(false);
        }
        if (pVar.f10414w) {
            y0.Z.d(pVar);
        } else {
            pVar.f10411t = true;
        }
    }

    public void d() {
        C1471A c1471a = (C1471A) this.f7172b;
        if (c1471a.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            Iterator it = c1471a.iterator();
            while (((y5.i) ((U.c) it).f9127m).hasNext()) {
                w0 w0Var = (w0) ((y5.i) ((U.c) it).f9127m).next();
                ((U.c) it).remove();
                w0Var.b();
            }
        } finally {
            Trace.endSection();
        }
    }

    public void e() {
        g(Integer.MIN_VALUE);
        ArrayList arrayList = (ArrayList) this.f7174d;
        boolean zIsEmpty = arrayList.isEmpty();
        C1471A c1471a = (C1471A) this.f7172b;
        if (!zIsEmpty) {
            Trace.beginSection("Compose:onForgotten");
            try {
                C1472B c1472b = (C1472B) this.f7177g;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (-1 >= size) {
                        break;
                    }
                    Object obj = arrayList.get(size);
                    if (obj instanceof w0) {
                        c1471a.remove(obj);
                        ((w0) obj).e();
                    }
                    if (obj instanceof InterfaceC0498j) {
                        if (c1472b == null || !c1472b.c(obj)) {
                            ((InterfaceC0498j) obj).c();
                        } else {
                            ((InterfaceC0498j) obj).b();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ArrayList arrayList2 = (ArrayList) this.f7173c;
        if (arrayList2.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:onRemembered");
        try {
            int size2 = arrayList2.size();
            for (int i7 = 0; i7 < size2; i7++) {
                w0 w0Var = (w0) arrayList2.get(i7);
                c1471a.remove(w0Var);
                w0Var.a();
            }
        } finally {
            Trace.endSection();
        }
    }

    public boolean f(int i7) {
        return (i7 & ((a0.p) this.f7176f).f10405n) != 0;
    }

    public void g(int i7) {
        ArrayList arrayList = (ArrayList) this.f7176f;
        if (arrayList.isEmpty()) {
            return;
        }
        int i8 = 0;
        ArrayList arrayListM = null;
        int i9 = 0;
        C1495p c1495p = null;
        C1495p c1495p2 = null;
        while (true) {
            C1495p c1495p3 = (C1495p) this.f7179i;
            if (i9 >= c1495p3.f12905b) {
                break;
            }
            if (i7 <= c1495p3.c(i9)) {
                Object objRemove = arrayList.remove(i9);
                int iD = c1495p3.d(i9);
                int iD2 = ((C1495p) this.f7178h).d(i9);
                if (arrayListM == null) {
                    arrayListM = P3.r.M(objRemove);
                    c1495p2 = new C1495p();
                    c1495p2.a(iD);
                    c1495p = new C1495p();
                    c1495p.a(iD2);
                } else {
                    kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.collection.MutableIntList", c1495p);
                    kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.collection.MutableIntList", c1495p2);
                    arrayListM.add(objRemove);
                    c1495p2.a(iD);
                    c1495p.a(iD2);
                }
            } else {
                i9++;
            }
        }
        if (arrayListM != null) {
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.collection.MutableIntList", c1495p);
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.collection.MutableIntList", c1495p2);
            int size = arrayListM.size() - 1;
            while (i8 < size) {
                int i10 = i8 + 1;
                int size2 = arrayListM.size();
                for (int i11 = i10; i11 < size2; i11++) {
                    int iC = c1495p2.c(i8);
                    int iC2 = c1495p2.c(i11);
                    if (iC < iC2 || (iC2 == iC && c1495p.c(i8) < c1495p.c(i11))) {
                        Object obj = arrayListM.get(i8);
                        arrayListM.set(i8, arrayListM.get(i11));
                        arrayListM.set(i11, obj);
                        int iC3 = c1495p.c(i8);
                        c1495p.e(i8, c1495p.c(i11));
                        c1495p.e(i11, iC3);
                        int iC4 = c1495p2.c(i8);
                        c1495p2.e(i8, c1495p2.c(i11));
                        c1495p2.e(i11, iC4);
                    }
                }
                i8 = i10;
            }
            ((ArrayList) this.f7174d).addAll(arrayListM);
        }
    }

    public void h(Object obj, int i7, int i8, int i9) {
        g(i7);
        if (i9 < 0 || i9 >= i7) {
            ((ArrayList) this.f7174d).add(obj);
            return;
        }
        ((ArrayList) this.f7176f).add(obj);
        ((C1495p) this.f7178h).a(i8);
        ((C1495p) this.f7179i).a(i9);
    }

    public void i() {
        for (a0.p pVar = (a0.p) this.f7176f; pVar != null; pVar = pVar.f10407p) {
            pVar.C0();
            if (pVar.f10410s) {
                y0.Z.a(pVar);
            }
            if (pVar.f10411t) {
                y0.Z.d(pVar);
            }
            pVar.f10410s = false;
            pVar.f10411t = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0217, code lost:
    
        r11 = r27 + 2;
        r5 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x021d, code lost:
    
        r3 = r3 + 1;
        r10 = r19;
        r5 = r20;
        r11 = r25;
        r12 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x013a, code lost:
    
        r25 = r11;
        r28 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0140, code lost:
    
        if ((r18 % 2) != 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0142, code lost:
    
        r5 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0144, code lost:
    
        r5 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0146, code lost:
    
        r11 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0147, code lost:
    
        if (r11 > r3) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0149, code lost:
    
        if (r11 == r10) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x014b, code lost:
    
        if (r11 == r3) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x014d, code lost:
    
        r23 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x015b, code lost:
    
        if (r25[(r11 + 1) + r16] >= r25[(r11 - 1) + r16]) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x015e, code lost:
    
        r23 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0160, code lost:
    
        r5 = r25[(r11 - 1) + r16];
        r12 = r5 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0169, code lost:
    
        r23 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x016b, code lost:
    
        r5 = r25[(r11 + 1) + r16];
        r12 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0172, code lost:
    
        r21 = r6 - ((r14 - r12) - r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0178, code lost:
    
        if (r3 == 0) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x017a, code lost:
    
        if (r12 == r5) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x017d, code lost:
    
        r24 = r21 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0180, code lost:
    
        r24 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0182, code lost:
    
        r21 = r5;
        r5 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0188, code lost:
    
        if (r12 <= r13) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x018a, code lost:
    
        if (r5 <= r9) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x018c, code lost:
    
        r26 = r5;
        r27 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0198, code lost:
    
        if (r0.f(r12 - 1, r26 - 1) == false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x019a, code lost:
    
        r12 = r12 - 1;
        r5 = r26 - 1;
        r11 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01a1, code lost:
    
        r26 = r5;
        r27 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01a5, code lost:
    
        r25[r16 + r27] = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01a9, code lost:
    
        if (r23 == 0) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01ab, code lost:
    
        r5 = r18 - r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01ad, code lost:
    
        if (r5 < r10) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01af, code lost:
    
        if (r5 > r3) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01b5, code lost:
    
        if (r19[r16 + r5] < r12) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01b7, code lost:
    
        r28[r32] = r12;
        r10 = 1;
        r28[1] = r26;
        r28[r31] = r21;
        r28[3] = r24;
        r28[4] = 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00eb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j(int r31, Q.d r32, Q.d r33, a0.p r34, boolean r35) {
        /*
            Method dump skipped, instructions count: 886
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O.C0517t.j(int, Q.d, Q.d, a0.p, boolean):void");
    }

    public void k() {
        C2349D c2349d;
        C2377y c2377y;
        a0.p pVar = ((y0.m0) this.f7175e).f10406o;
        y0.Y y7 = (C2372t) this.f7173c;
        a0.p pVar2 = pVar;
        while (true) {
            c2349d = (C2349D) this.f7172b;
            if (pVar2 == null) {
                break;
            }
            InterfaceC2375w interfaceC2375wG = AbstractC2359f.g(pVar2);
            if (interfaceC2375wG != null) {
                y0.Y y8 = pVar2.f10409r;
                if (y8 != null) {
                    C2377y c2377y2 = (C2377y) y8;
                    InterfaceC2375w interfaceC2375w = c2377y2.f17901T;
                    c2377y2.m1(interfaceC2375wG);
                    c2377y = c2377y2;
                    if (interfaceC2375w != pVar2) {
                        y0.d0 d0Var = c2377y2.f17824N;
                        c2377y = c2377y2;
                        if (d0Var != null) {
                            d0Var.invalidate();
                            c2377y = c2377y2;
                        }
                    }
                } else {
                    C2377y c2377y3 = new C2377y(c2349d, interfaceC2375wG);
                    pVar2.F0(c2377y3);
                    c2377y = c2377y3;
                }
                y7.f17827x = c2377y;
                c2377y.f17826w = y7;
                y7 = c2377y;
            } else {
                pVar2.F0(y7);
            }
            pVar2 = pVar2.f10406o;
        }
        C2349D c2349dS = c2349d.s();
        y7.f17827x = c2349dS != null ? (C2372t) c2349dS.f17660G.f7173c : null;
        this.f7174d = y7;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                StringBuilder sb = new StringBuilder("[");
                a0.p pVar = (a0.p) this.f7176f;
                y0.m0 m0Var = (y0.m0) this.f7175e;
                if (pVar == m0Var) {
                    sb.append("]");
                } else {
                    while (true) {
                        if (pVar != null && pVar != m0Var) {
                            sb.append(String.valueOf(pVar));
                            if (pVar.f10407p == m0Var) {
                                sb.append("]");
                            } else {
                                sb.append(",");
                                pVar = pVar.f10407p;
                            }
                        }
                    }
                }
                String string = sb.toString();
                kotlin.jvm.internal.l.e("StringBuilder().apply(builderAction).toString()", string);
                return string;
            default:
                return super.toString();
        }
    }

    public C0517t(C1471A c1471a) {
        this.a = 0;
        this.f7172b = c1471a;
        this.f7173c = new ArrayList();
        this.f7174d = new ArrayList();
        this.f7175e = new ArrayList();
        this.f7176f = new ArrayList();
        this.f7178h = new C1495p();
        this.f7179i = new C1495p();
    }
}
