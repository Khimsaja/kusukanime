package n5;

import D.F0;
import H1.C0231l;
import O.C0486d;
import O.C0493g0;
import android.graphics.Matrix;
import android.text.Spannable;
import android.text.SpannableString;
import android.view.View;
import f6.AbstractC0897K;
import f6.AbstractC0905c;
import f6.C0890D;
import f6.C0894H;
import f6.C0895I;
import f6.C0920r;
import f6.C0925w;
import f6.InterfaceC0908f;
import f6.InterfaceC0909g;
import h0.AbstractC0968M;
import h0.C0962G;
import io.ktor.client.engine.okhttp.OkHttpSSESession;
import io.ktor.http.ContentType;
import io.ktor.util.GzipHeaderFlags;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.Iterator;
import java.util.LinkedHashMap;
import m5.C1516e;
import m5.C1523l;
import p.I0;
import w0.InterfaceC2173H;
import w0.c0;
import w0.d0;
import y.C2338s;
import y0.AbstractC2359f;
import y0.AbstractC2367n;
import y0.C2349D;
import y0.C2362i;
import y0.InterfaceC2369p;
import y0.p0;
import z.C2425d;
import z0.InterfaceC2443f0;
import z5.AbstractC2510o;
import z5.AbstractC2517v;

/* loaded from: classes.dex */
public final class P implements p1.l, v6.b, InterfaceC0909g, d0, InterfaceC2443f0 {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f13377k;

    /* renamed from: l, reason: collision with root package name */
    public Object f13378l;

    /* renamed from: m, reason: collision with root package name */
    public Object f13379m;

    public /* synthetic */ P(int i7, Object obj, Object obj2) {
        this.f13377k = i7;
        this.f13378l = obj;
        this.f13379m = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [a0.p] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [a0.p] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [Q.d] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [Q.d] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public static void i(C2349D c2349d) {
        y0.K k7 = c2349d.f17661H;
        int i7 = 0;
        if (k7.f17746c == 5 && !k7.f17748e && !k7.f17747d && !c2349d.f17668Q && c2349d.F()) {
            a0.p pVar = (a0.p) c2349d.f17660G.f7176f;
            if ((pVar.f10405n & 256) != 0) {
                while (pVar != null) {
                    if ((pVar.f10404m & 256) != 0) {
                        AbstractC2367n abstractC2367nF = pVar;
                        ?? dVar = 0;
                        while (abstractC2367nF != 0) {
                            if (abstractC2367nF instanceof InterfaceC2369p) {
                                InterfaceC2369p interfaceC2369p = (InterfaceC2369p) abstractC2367nF;
                                interfaceC2369p.E(AbstractC2359f.t(interfaceC2369p, 256));
                            } else if ((abstractC2367nF.f10404m & 256) != 0 && (abstractC2367nF instanceof AbstractC2367n)) {
                                a0.p pVar2 = abstractC2367nF.f17880y;
                                int i8 = 0;
                                abstractC2367nF = abstractC2367nF;
                                dVar = dVar;
                                while (pVar2 != null) {
                                    if ((pVar2.f10404m & 256) != 0) {
                                        i8++;
                                        dVar = dVar;
                                        if (i8 == 1) {
                                            abstractC2367nF = pVar2;
                                        } else {
                                            if (dVar == 0) {
                                                dVar = new Q.d(new a0.p[16]);
                                            }
                                            if (abstractC2367nF != 0) {
                                                dVar.b(abstractC2367nF);
                                                abstractC2367nF = 0;
                                            }
                                            dVar.b(pVar2);
                                        }
                                    }
                                    pVar2 = pVar2.f10407p;
                                    abstractC2367nF = abstractC2367nF;
                                    dVar = dVar;
                                }
                                if (i8 == 1) {
                                }
                            }
                            abstractC2367nF = AbstractC2359f.f(dVar);
                        }
                    }
                    if ((pVar.f10405n & 256) == 0) {
                        break;
                    } else {
                        pVar = pVar.f10407p;
                    }
                }
            }
        }
        c2349d.f17667P = false;
        Q.d dVarV = c2349d.v();
        int i9 = dVarV.f7829m;
        if (i9 > 0) {
            Object[] objArr = dVarV.f7827k;
            do {
                i((C2349D) objArr[i7]);
                i7++;
            } while (i7 < i9);
        }
    }

    @Override // p1.l
    public Object a() {
        return (p1.t) this.f13378l;
    }

    @Override // z0.InterfaceC2443f0
    public void b(View view, float[] fArr) {
        C0962G.d(fArr);
        p(view, fArr);
    }

    @Override // p1.l
    public boolean c(CharSequence charSequence, int i7, int i8, p1.q qVar) {
        if ((qVar.f14195c & 4) > 0) {
            return true;
        }
        if (((p1.t) this.f13378l) == null) {
            this.f13378l = new p1.t(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((I0) this.f13379m).getClass();
        ((p1.t) this.f13378l).setSpan(new p1.r(qVar), i7, i8, 33);
        return true;
    }

    @Override // w0.d0
    public void d(c0 c0Var) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f13379m;
        linkedHashMap.clear();
        Iterator it = c0Var.f16860k.iterator();
        while (it.hasNext()) {
            Object objB = ((C2338s) this.f13378l).b(it.next());
            Integer num = (Integer) linkedHashMap.get(objB);
            int iIntValue = num != null ? num.intValue() : 0;
            if (iIntValue == 7) {
                it.remove();
            } else {
                linkedHashMap.put(objB, Integer.valueOf(iIntValue + 1));
            }
        }
    }

    @Override // w0.d0
    public boolean e(Object obj, Object obj2) {
        C2338s c2338s = (C2338s) this.f13378l;
        return kotlin.jvm.internal.l.a(c2338s.b(obj), c2338s.b(obj2));
    }

    public void f(C2349D c2349d) {
        if (c2349d.E()) {
            ((p0) this.f13379m).add(c2349d);
        } else {
            AbstractC0905c.C("DepthSortedSet.add called on an unattached node");
            throw null;
        }
    }

    public void g(C2349D c2349d, boolean z7) {
        P p7 = (P) this.f13379m;
        P p8 = (P) this.f13378l;
        if (z7) {
            p8.f(c2349d);
            p7.f(c2349d);
        } else {
            if (((p0) p8.f13379m).contains(c2349d)) {
                return;
            }
            p7.f(c2349d);
        }
    }

    public boolean h(C2349D c2349d, boolean z7) {
        boolean zContains = ((p0) ((P) this.f13378l).f13379m).contains(c2349d);
        return z7 ? zContains : zContains || ((p0) ((P) this.f13379m).f13379m).contains(c2349d);
    }

    public a0 j(M4.a aVar) {
        a0 a0VarZ;
        B b4 = aVar.f6552f;
        return (b4 == null || (a0VarZ = AbstractC0905c.z(b4)) == null) ? (p5.i) ((O3.q) this.f13378l).getValue() : a0VarZ;
    }

    public AbstractC1586x k(u4.Q q6, M4.a aVar) {
        kotlin.jvm.internal.l.f("typeParameter", q6);
        kotlin.jvm.internal.l.f("typeAttr", aVar);
        return (AbstractC1586x) ((C1516e) this.f13379m).invoke(new O(q6, aVar));
    }

    public InterfaceC2173H l() {
        return (InterfaceC2173H) ((C0493g0) this.f13379m).getValue();
    }

    public boolean m() {
        return !(((p0) ((P) this.f13379m).f13379m).isEmpty() && ((p0) ((P) this.f13378l).f13379m).isEmpty());
    }

    public boolean n(C2349D c2349d) {
        if (c2349d.E()) {
            return ((p0) this.f13379m).remove(c2349d);
        }
        AbstractC0905c.C("DepthSortedSet.remove called on an unattached node");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Q3.i o(n5.V r17, java.util.List r18, M4.a r19) {
        /*
            Method dump skipped, instructions count: 528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.P.o(n5.V, java.util.List, M4.a):Q3.i");
    }

    @Override // f6.InterfaceC0909g
    public void onFailure(InterfaceC0908f interfaceC0908f, IOException iOException) {
        switch (this.f13377k) {
            case GzipHeaderFlags.EXTRA /* 4 */:
                kotlin.jvm.internal.l.f("call", interfaceC0908f);
                ((OkHttpSSESession) this.f13378l).onFailure(this, iOException, null);
                break;
            default:
                kotlin.jvm.internal.l.f("call", interfaceC0908f);
                ((t6.g) this.f13378l).c(iOException, null);
                break;
        }
    }

    @Override // f6.InterfaceC0909g
    public void onResponse(InterfaceC0908f interfaceC0908f, C0895I c0895i) throws IOException {
        boolean z7;
        switch (this.f13377k) {
            case GzipHeaderFlags.EXTRA /* 4 */:
                kotlin.jvm.internal.l.f("call", interfaceC0908f);
                try {
                    boolean zE = c0895i.e();
                    OkHttpSSESession okHttpSSESession = (OkHttpSSESession) this.f13378l;
                    if (!zE) {
                        okHttpSSESession.onFailure(this, null, c0895i);
                        c0895i.close();
                        return;
                    }
                    AbstractC0897K abstractC0897K = c0895i.f11501q;
                    kotlin.jvm.internal.l.c(abstractC0897K);
                    C0925w c0925wE = abstractC0897K.e();
                    if (c0925wE != null && c0925wE.f11616b.equals(ContentType.Text.TYPE) && c0925wE.f11617c.equals("event-stream")) {
                        j6.i iVar = (j6.i) this.f13379m;
                        if (iVar == null) {
                            kotlin.jvm.internal.l.l("call");
                            throw null;
                        }
                        iVar.l();
                        C0894H c0894hG = c0895i.g();
                        c0894hG.f11488g = g6.b.f11773c;
                        C0895I c0895iA = c0894hG.a();
                        r6.a aVar = new r6.a(abstractC0897K.g(), this);
                        try {
                            okHttpSSESession.onOpen(this, c0895iA);
                            do {
                            } while (aVar.a());
                            okHttpSSESession.onClosed(this);
                            c0895i.close();
                            return;
                        } catch (Exception e7) {
                            okHttpSSESession.onFailure(this, e7, c0895iA);
                            c0895i.close();
                            return;
                        }
                    }
                    okHttpSSESession.onFailure(this, new IllegalStateException("Invalid content-type: " + abstractC0897K.e()), c0895i);
                    c0895i.close();
                    return;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        P3.r.o(c0895i, th);
                        throw th2;
                    }
                }
            default:
                kotlin.jvm.internal.l.f("call", interfaceC0908f);
                C0231l c0231l = c0895i.f11507w;
                boolean z8 = true;
                try {
                    ((t6.g) this.f13378l).a(c0895i, c0231l);
                    j6.k kVarG = c0231l.g();
                    C0920r c0920r = c0895i.f11500p;
                    int size = c0920r.size();
                    int i7 = 0;
                    int i8 = 0;
                    boolean z9 = false;
                    boolean z10 = false;
                    boolean z11 = false;
                    boolean z12 = false;
                    Integer numU = null;
                    Integer numU2 = null;
                    while (i8 < size) {
                        if (AbstractC2517v.M(c0920r.h(i8), "Sec-WebSocket-Extensions", z8)) {
                            String strM = c0920r.m(i8);
                            z7 = z8;
                            int i9 = i7;
                            while (i9 < strM.length()) {
                                C0920r c0920r2 = c0920r;
                                int iG = g6.b.g(strM, ',', i9, i7, 4);
                                int iF = g6.b.f(strM, i9, iG, ';');
                                String strY = g6.b.y(strM, i9, iF);
                                int i10 = iF + 1;
                                if (strY.equalsIgnoreCase("permessage-deflate")) {
                                    if (z9) {
                                        z12 = z7;
                                    }
                                    while (true) {
                                        i9 = i10;
                                        while (i9 < iG) {
                                            int iF2 = g6.b.f(strM, i9, iG, ';');
                                            int iF3 = g6.b.f(strM, i9, iF2, '=');
                                            String strY2 = g6.b.y(strM, i9, iF3);
                                            String strQ0 = iF3 < iF2 ? AbstractC2510o.q0(g6.b.y(strM, iF3 + 1, iF2)) : null;
                                            i10 = iF2 + 1;
                                            if (strY2.equalsIgnoreCase("client_max_window_bits")) {
                                                if (numU != null) {
                                                    z12 = z7;
                                                }
                                                numU = strQ0 != null ? AbstractC2517v.U(strQ0) : null;
                                                if (numU != null) {
                                                    break;
                                                }
                                                i9 = i10;
                                                z12 = z7;
                                            } else if (strY2.equalsIgnoreCase("client_no_context_takeover")) {
                                                if (z10) {
                                                    z12 = z7;
                                                }
                                                if (strQ0 != null) {
                                                    z12 = z7;
                                                }
                                                i9 = i10;
                                                z10 = z7;
                                            } else {
                                                if (strY2.equalsIgnoreCase("server_max_window_bits")) {
                                                    if (numU2 != null) {
                                                        z12 = z7;
                                                    }
                                                    numU2 = strQ0 != null ? AbstractC2517v.U(strQ0) : null;
                                                    if (numU2 != null) {
                                                        break;
                                                    }
                                                } else if (strY2.equalsIgnoreCase("server_no_context_takeover")) {
                                                    if (z11) {
                                                        z12 = z7;
                                                    }
                                                    if (strQ0 != null) {
                                                        z12 = z7;
                                                    }
                                                    i9 = i10;
                                                    z11 = z7;
                                                }
                                                i9 = i10;
                                                z12 = z7;
                                            }
                                        }
                                        z9 = z7;
                                    }
                                } else {
                                    i9 = i10;
                                    z12 = z7;
                                }
                                c0920r = c0920r2;
                                i7 = 0;
                            }
                        } else {
                            z7 = z8;
                        }
                        i8++;
                        z8 = z7;
                        c0920r = c0920r;
                        i7 = 0;
                    }
                    boolean z13 = z8;
                    ((t6.g) this.f13378l).f16163d = new t6.h(z9, numU, z10, numU2, z11, z12);
                    if (z12 || numU != null || (numU2 != null && !new k4.g(8, 15, z13 ? 1 : 0).h(numU2.intValue()))) {
                        t6.g gVar = (t6.g) this.f13378l;
                        synchronized (gVar) {
                            gVar.f16174o.clear();
                            gVar.b(1010, "unexpected Sec-WebSocket-Extensions in response header");
                        }
                    }
                    try {
                        ((t6.g) this.f13378l).d(g6.b.f11776f + " WebSocket " + ((C0890D) this.f13379m).a.g(), kVarG);
                        t6.g gVar2 = (t6.g) this.f13378l;
                        gVar2.a.onOpen(gVar2, c0895i);
                        ((t6.g) this.f13378l).e();
                        return;
                    } catch (Exception e8) {
                        ((t6.g) this.f13378l).c(e8, null);
                        return;
                    }
                } catch (IOException e9) {
                    ((t6.g) this.f13378l).c(e9, c0895i);
                    g6.b.c(c0895i);
                    if (c0231l != null) {
                        c0231l.c(true, true, null);
                        return;
                    }
                    return;
                }
        }
    }

    public void p(View view, float[] fArr) {
        Object parent = view.getParent();
        boolean z7 = parent instanceof View;
        float[] fArr2 = (float[]) this.f13378l;
        if (z7) {
            p((View) parent, fArr);
            C0962G.d(fArr2);
            C0962G.h(fArr2, -view.getScrollX(), -view.getScrollY());
            z0.O.z(fArr, fArr2);
            float left = view.getLeft();
            float top = view.getTop();
            C0962G.d(fArr2);
            C0962G.h(fArr2, left, top);
            z0.O.z(fArr, fArr2);
        } else {
            int[] iArr = (int[]) this.f13379m;
            view.getLocationInWindow(iArr);
            C0962G.d(fArr2);
            C0962G.h(fArr2, -view.getScrollX(), -view.getScrollY());
            z0.O.z(fArr, fArr2);
            float f5 = iArr[0];
            float f7 = iArr[1];
            C0962G.d(fArr2);
            C0962G.h(fArr2, f5, f7);
            z0.O.z(fArr, fArr2);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        AbstractC0968M.r(matrix, fArr2);
        z0.O.z(fArr, fArr2);
    }

    public String toString() {
        switch (this.f13377k) {
            case 9:
                return ((p0) this.f13379m).toString();
            default:
                return super.toString();
        }
    }

    public P(M4.e eVar) {
        this.f13377k = 0;
        C1523l c1523l = new C1523l("Type parameter upper bound erasure results");
        this.f13378l = z1.c.C(new H4.u(16, this));
        this.f13379m = c1523l.b(new A4.j(22, this));
    }

    public P(int i7) {
        this.f13377k = i7;
        switch (i7) {
            case 9:
                this.f13378l = z1.c.B(O3.j.f7526l, C2362i.f17866n);
                this.f13379m = new p0(new y0.c0(1));
                break;
            case 10:
                this.f13378l = new P(9);
                this.f13379m = new P(9);
                break;
            case 13:
                this.f13378l = new Q.d(new C2349D[16]);
                break;
            case 15:
                this.f13378l = new Q.d(new Reference[16]);
                this.f13379m = new ReferenceQueue();
                break;
        }
    }

    public P(C2349D c2349d, InterfaceC2173H interfaceC2173H) {
        this.f13377k = 11;
        this.f13378l = c2349d;
        this.f13379m = C0486d.K(interfaceC2173H, O.T.f7049p);
    }

    public P(C0890D c0890d, OkHttpSSESession okHttpSSESession) {
        this.f13377k = 4;
        this.f13378l = okHttpSSESession;
    }

    public P(C2425d c2425d, F0 f02, z.x xVar) {
        this.f13377k = 6;
        this.f13378l = c2425d;
        this.f13379m = f02;
    }

    public P(C2338s c2338s) {
        this.f13377k = 8;
        this.f13378l = c2338s;
        this.f13379m = new LinkedHashMap();
    }

    public P(float[] fArr) {
        this.f13377k = 14;
        this.f13378l = fArr;
        this.f13379m = new int[2];
    }
}
