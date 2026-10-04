package O;

import C2.C0034g;
import P.C0556a;
import P.C0557b;
import P.C0558c;
import android.os.Trace;
import android.util.SparseArray;
import e4.InterfaceC0821a;
import io.ktor.util.GzipHeaderFlags;
import java.util.ArrayList;
import java.util.Set;
import m.AbstractC1476F;
import m.C1471A;
import m.C1472B;
import m.C1494o;
import m.C1496q;
import m.C1502w;
import m.C1504y;

/* renamed from: O.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0510p {

    /* renamed from: A, reason: collision with root package name */
    public int f7115A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f7116B;

    /* renamed from: C, reason: collision with root package name */
    public final C0508o f7117C;

    /* renamed from: D, reason: collision with root package name */
    public final D4.S f7118D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f7119E;

    /* renamed from: F, reason: collision with root package name */
    public A0 f7120F;

    /* renamed from: G, reason: collision with root package name */
    public B0 f7121G;

    /* renamed from: H, reason: collision with root package name */
    public D0 f7122H;
    public boolean I;
    public InterfaceC0501k0 J;

    /* renamed from: K, reason: collision with root package name */
    public C0556a f7123K;

    /* renamed from: L, reason: collision with root package name */
    public final C0557b f7124L;

    /* renamed from: M, reason: collision with root package name */
    public C0484c f7125M;

    /* renamed from: N, reason: collision with root package name */
    public C0558c f7126N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f7127O;

    /* renamed from: P, reason: collision with root package name */
    public int f7128P;
    public final B2.l a;

    /* renamed from: b, reason: collision with root package name */
    public final r f7129b;

    /* renamed from: c, reason: collision with root package name */
    public final B0 f7130c;

    /* renamed from: d, reason: collision with root package name */
    public final C1471A f7131d;

    /* renamed from: e, reason: collision with root package name */
    public final C0556a f7132e;

    /* renamed from: f, reason: collision with root package name */
    public final C0556a f7133f;

    /* renamed from: g, reason: collision with root package name */
    public final C0519u f7134g;

    /* renamed from: i, reason: collision with root package name */
    public C0499j0 f7136i;

    /* renamed from: j, reason: collision with root package name */
    public int f7137j;

    /* renamed from: k, reason: collision with root package name */
    public int f7138k;

    /* renamed from: l, reason: collision with root package name */
    public int f7139l;

    /* renamed from: n, reason: collision with root package name */
    public int[] f7141n;

    /* renamed from: o, reason: collision with root package name */
    public C1494o f7142o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f7143p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f7144q;

    /* renamed from: u, reason: collision with root package name */
    public C0034g f7148u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f7149v;

    /* renamed from: x, reason: collision with root package name */
    public boolean f7151x;

    /* renamed from: z, reason: collision with root package name */
    public int f7153z;

    /* renamed from: h, reason: collision with root package name */
    public final D4.S f7135h = new D4.S(3, false);

    /* renamed from: m, reason: collision with root package name */
    public final M f7140m = new M();

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f7145r = new ArrayList();

    /* renamed from: s, reason: collision with root package name */
    public final M f7146s = new M();

    /* renamed from: t, reason: collision with root package name */
    public InterfaceC0501k0 f7147t = W.d.f9511n;

    /* renamed from: w, reason: collision with root package name */
    public final M f7150w = new M();

    /* renamed from: y, reason: collision with root package name */
    public int f7152y = -1;

    public C0510p(B2.l lVar, r rVar, B0 b02, C1471A c1471a, C0556a c0556a, C0556a c0556a2, C0519u c0519u) {
        this.a = lVar;
        this.f7129b = rVar;
        this.f7130c = b02;
        this.f7131d = c1471a;
        this.f7132e = c0556a;
        this.f7133f = c0556a2;
        this.f7134g = c0519u;
        this.f7116B = rVar.e() || rVar.c();
        this.f7117C = new C0508o(0, this);
        this.f7118D = new D4.S(3, false);
        A0 a0J = b02.j();
        a0J.c();
        this.f7120F = a0J;
        B0 b03 = new B0();
        if (rVar.e()) {
            b03.h();
        }
        if (rVar.c()) {
            b03.f6955t = new C1496q();
        }
        this.f7121G = b03;
        D0 d0M = b03.m();
        d0M.e(true);
        this.f7122H = d0M;
        this.f7124L = new C0557b(this, c0556a);
        A0 a0J2 = this.f7121G.j();
        try {
            C0484c c0484cA = a0J2.a(0);
            a0J2.c();
            this.f7125M = c0484cA;
            this.f7126N = new C0558c();
        } catch (Throwable th) {
            a0J2.c();
            throw th;
        }
    }

    public static final int J(C0510p c0510p, int i7, boolean z7, int i8) {
        A0 a02 = c0510p.f7120F;
        int[] iArr = a02.f6930b;
        int i9 = i7 * 5;
        if ((iArr[i9 + 1] & 134217728) != 0) {
            int i10 = iArr[i9];
            Object objJ = a02.j(iArr, i7);
            if (i10 == 206 && kotlin.jvm.internal.l.a(objJ, C0486d.f7061e)) {
                Object objG = a02.g(i7, 0);
                C0504m c0504m = objG instanceof C0504m ? (C0504m) objG : null;
                if (c0504m != null) {
                    for (C0510p c0510p2 : c0504m.f7096k.f7100e) {
                        C0557b c0557b = c0510p2.f7124L;
                        B0 b02 = c0510p2.f7130c;
                        if (b02.f6947l > 0 && C0486d.h(b02.f6946k, 0)) {
                            C0556a c0556a = new C0556a();
                            c0510p2.f7123K = c0556a;
                            A0 a0J = b02.j();
                            try {
                                c0510p2.f7120F = a0J;
                                C0556a c0556a2 = c0557b.f7652b;
                                try {
                                    c0557b.f7652b = c0556a;
                                    c0510p2.I(0);
                                    c0557b.b();
                                    if (c0557b.f7653c) {
                                        C0556a c0556a3 = c0557b.f7652b;
                                        c0556a3.getClass();
                                        c0556a3.f7651i.f0(P.w.f7688c);
                                        if (c0557b.f7653c) {
                                            c0557b.d(false);
                                            c0557b.d(false);
                                            C0556a c0556a4 = c0557b.f7652b;
                                            c0556a4.getClass();
                                            c0556a4.f7651i.f0(P.i.f7670c);
                                            c0557b.f7653c = false;
                                        }
                                    }
                                } finally {
                                }
                            } finally {
                                a0J.c();
                            }
                        }
                        c0510p.f7129b.l(c0510p2.f7134g);
                    }
                }
                return C0486d.o(iArr, i7);
            }
            if (!C0486d.m(iArr, i7)) {
                return C0486d.o(iArr, i7);
            }
        } else if (C0486d.h(iArr, i7)) {
            int i11 = iArr[i9 + 3] + i7;
            int iJ = 0;
            for (int i12 = i7 + 1; i12 < i11; i12 += iArr[(i12 * 5) + 3]) {
                boolean zM = C0486d.m(iArr, i12);
                C0557b c0557b2 = c0510p.f7124L;
                if (zM) {
                    c0557b2.c();
                    Object objI = a02.i(i12);
                    c0557b2.c();
                    c0557b2.f7658h.f1530k.add(objI);
                }
                iJ += J(c0510p, i12, zM || z7, zM ? 0 : i8 + iJ);
                if (zM) {
                    c0557b2.c();
                    c0557b2.a();
                }
            }
            if (!C0486d.m(iArr, i7)) {
                return iJ;
            }
        } else if (!C0486d.m(iArr, i7)) {
            return C0486d.o(iArr, i7);
        }
        return 1;
    }

    public final Object A() {
        boolean z7 = this.f7127O;
        T t7 = C0502l.a;
        if (!z7) {
            Object objH = this.f7120F.h();
            if (!this.f7151x || (objH instanceof C0504m)) {
                return objH;
            }
        } else if (this.f7144q) {
            C0486d.w("A call to createNode(), emitNode() or useNode() expected");
            throw null;
        }
        return t7;
    }

    public final int B(int i7) {
        int iP = C0486d.p(this.f7120F.f6930b, i7) + 1;
        int i8 = 0;
        while (iP < i7) {
            if (!C0486d.l(this.f7120F.f6930b, iP)) {
                i8++;
            }
            iP += C0486d.j(this.f7120F.f6930b, iP);
        }
        return i8;
    }

    public final boolean C(C0034g c0034g) {
        P.D d4 = this.f7132e.f7651i;
        if (!d4.c0()) {
            C0486d.w("Expected applyChanges() to have been called");
            throw null;
        }
        if (((C1504y) c0034g.f741l).f12943e <= 0 && this.f7145r.isEmpty()) {
            return false;
        }
        n(c0034g, null);
        return d4.d0();
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D() {
        /*
            Method dump skipped, instructions count: 724
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O.C0510p.D():void");
    }

    public final void E() {
        I(this.f7120F.f6935g);
        C0557b c0557b = this.f7124L;
        c0557b.d(false);
        C0510p c0510p = c0557b.a;
        A0 a02 = c0510p.f7120F;
        if (a02.f6931c > 0) {
            int i7 = a02.f6937i;
            M m7 = c0557b.f7654d;
            int i8 = m7.f7015b;
            if ((i8 > 0 ? m7.a[i8 - 1] : -2) != i7) {
                if (!c0557b.f7653c && c0557b.f7655e) {
                    c0557b.d(false);
                    C0556a c0556a = c0557b.f7652b;
                    c0556a.getClass();
                    c0556a.f7651i.f0(P.l.f7673c);
                    c0557b.f7653c = true;
                }
                if (i7 > 0) {
                    C0484c c0484cA = a02.a(i7);
                    m7.b(i7);
                    c0557b.d(false);
                    C0556a c0556a2 = c0557b.f7652b;
                    c0556a2.getClass();
                    P.k kVar = P.k.f7672c;
                    P.D d4 = c0556a2.f7651i;
                    d4.g0(kVar);
                    n6.d.c0(d4, 0, c0484cA);
                    int i9 = d4.f7649o;
                    int i10 = kVar.a;
                    int iZ = P.D.Z(d4, i10);
                    int i11 = kVar.f7642b;
                    if (i9 != iZ || d4.f7650p != P.D.Z(d4, i11)) {
                        StringBuilder sb = new StringBuilder();
                        int i12 = 0;
                        for (int i13 = 0; i13 < i10; i13++) {
                            if (((1 << i13) & d4.f7649o) != 0) {
                                if (i12 > 0) {
                                    sb.append(", ");
                                }
                                sb.append(kVar.b(i13));
                                i12++;
                            }
                        }
                        String string = sb.toString();
                        StringBuilder sbL = A6.b.l(string, "StringBuilder().apply(builderAction).toString()");
                        int i14 = 0;
                        for (int i15 = 0; i15 < i11; i15++) {
                            if (((1 << i15) & d4.f7650p) != 0) {
                                if (i12 > 0) {
                                    sbL.append(", ");
                                }
                                sbL.append(kVar.c(i15));
                                i14++;
                            }
                        }
                        String string2 = sbL.toString();
                        kotlin.jvm.internal.l.e("StringBuilder().apply(builderAction).toString()", string2);
                        StringBuilder sb2 = new StringBuilder("Error while pushing ");
                        sb2.append(kVar);
                        sb2.append(". Not all arguments were provided. Missing ");
                        A6.b.q(sb2, i12, " int arguments (", string, ") and ");
                        A6.b.s(sb2, i14, " object arguments (", string2, ").");
                        throw null;
                    }
                    c0557b.f7653c = true;
                }
            }
        }
        C0556a c0556a3 = c0557b.f7652b;
        c0556a3.getClass();
        c0556a3.f7651i.f0(P.s.f7684c);
        int i16 = c0557b.f7656f;
        A0 a03 = c0510p.f7120F;
        c0557b.f7656f = a03.f6930b[(a03.f6935g * 5) + 3] + i16;
    }

    public final void F(InterfaceC0501k0 interfaceC0501k0) {
        C0034g c0034g = this.f7148u;
        if (c0034g == null) {
            c0034g = new C0034g(26);
            this.f7148u = c0034g;
        }
        ((SparseArray) c0034g.f741l).put(this.f7120F.f6935g, interfaceC0501k0);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G(int r8, int r9, int r10) {
        /*
            r7 = this;
            O.A0 r0 = r7.f7120F
            if (r8 != r9) goto L5
            goto L20
        L5:
            if (r8 == r10) goto L70
            if (r9 != r10) goto Lb
            goto L70
        Lb:
            int[] r1 = r0.f6930b
            int r2 = r8 * 5
            int r2 = r2 + 2
            r2 = r1[r2]
            if (r2 != r9) goto L18
            r10 = r9
            goto L70
        L18:
            int r3 = r9 * 5
            int r3 = r3 + 2
            r3 = r1[r3]
            if (r3 != r8) goto L22
        L20:
            r10 = r8
            goto L70
        L22:
            if (r2 != r3) goto L26
            r10 = r2
            goto L70
        L26:
            r2 = 0
            r3 = r8
            r4 = r2
        L29:
            int[] r5 = r0.f6930b
            if (r3 <= 0) goto L36
            if (r3 == r10) goto L36
            int r3 = O.C0486d.p(r5, r3)
            int r4 = r4 + 1
            goto L29
        L36:
            r3 = r9
            r6 = r2
        L38:
            if (r3 <= 0) goto L43
            if (r3 == r10) goto L43
            int r3 = O.C0486d.p(r5, r3)
            int r6 = r6 + 1
            goto L38
        L43:
            int r10 = r4 - r6
            r5 = r8
            r3 = r2
        L47:
            if (r3 >= r10) goto L52
            int r5 = r5 * 5
            int r5 = r5 + 2
            r5 = r1[r5]
            int r3 = r3 + 1
            goto L47
        L52:
            int r6 = r6 - r4
            r10 = r9
        L54:
            if (r2 >= r6) goto L5f
            int r10 = r10 * 5
            int r10 = r10 + 2
            r10 = r1[r10]
            int r2 = r2 + 1
            goto L54
        L5f:
            r2 = r10
            r10 = r5
        L61:
            if (r10 == r2) goto L70
            int r10 = r10 * 5
            int r10 = r10 + 2
            r10 = r1[r10]
            int r2 = r2 * 5
            int r2 = r2 + 2
            r2 = r1[r2]
            goto L61
        L70:
            if (r8 <= 0) goto L8a
            if (r8 == r10) goto L8a
            int[] r1 = r0.f6930b
            boolean r1 = O.C0486d.m(r1, r8)
            if (r1 == 0) goto L81
            P.b r1 = r7.f7124L
            r1.a()
        L81:
            int[] r1 = r0.f6930b
            int r8 = r8 * 5
            int r8 = r8 + 2
            r8 = r1[r8]
            goto L70
        L8a:
            r7.o(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: O.C0510p.G(int, int, int):void");
    }

    public final Object H() {
        boolean z7 = this.f7127O;
        T t7 = C0502l.a;
        if (!z7) {
            Object objH = this.f7120F.h();
            if (!this.f7151x || (objH instanceof C0504m)) {
                return objH instanceof x0 ? ((x0) objH).a : objH;
            }
        } else if (this.f7144q) {
            C0486d.w("A call to createNode(), emitNode() or useNode() expected");
            throw null;
        }
        return t7;
    }

    public final void I(int i7) {
        J(this, i7, false, 0);
        this.f7124L.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void K() {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O.C0510p.K():void");
    }

    public final void L() {
        A0 a02 = this.f7120F;
        int i7 = a02.f6937i;
        this.f7138k = i7 >= 0 ? C0486d.o(a02.f6930b, i7) : 0;
        this.f7120F.m();
    }

    public final void M() {
        if (this.f7138k != 0) {
            C0486d.w("No nodes can be emitted before calling skipAndEndGroup");
            throw null;
        }
        C0509o0 c0509o0W = w();
        if (c0509o0W != null) {
            c0509o0W.a |= 16;
        }
        if (this.f7145r.isEmpty()) {
            L();
        } else {
            D();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ba  */
    /* JADX WARN: Type inference failed for: r2v4, types: [O.k0] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18, types: [int] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N(int r28, int r29, java.lang.Object r30, java.lang.Object r31) {
        /*
            Method dump skipped, instructions count: 1246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O.C0510p.N(int, int, java.lang.Object, java.lang.Object):void");
    }

    public final void O() {
        N(-127, 0, null, null);
    }

    public final void P(int i7, C0481a0 c0481a0) {
        N(i7, 0, c0481a0, null);
    }

    public final void Q(Object obj, boolean z7) {
        if (z7) {
            A0 a02 = this.f7120F;
            if (a02.f6939k <= 0) {
                if (C0486d.m(a02.f6930b, a02.f6935g)) {
                    a02.n();
                    return;
                } else {
                    C0486d.T("Expected a node group");
                    throw null;
                }
            }
            return;
        }
        if (obj != null && this.f7120F.e() != obj) {
            C0557b c0557b = this.f7124L;
            c0557b.getClass();
            c0557b.d(false);
            C0556a c0556a = c0557b.f7652b;
            c0556a.getClass();
            P.y yVar = P.y.f7690c;
            P.D d4 = c0556a.f7651i;
            d4.g0(yVar);
            n6.d.c0(d4, 0, obj);
            int i7 = d4.f7649o;
            int i8 = yVar.a;
            int iZ = P.D.Z(d4, i8);
            int i9 = yVar.f7642b;
            if (i7 != iZ || d4.f7650p != P.D.Z(d4, i9)) {
                StringBuilder sb = new StringBuilder();
                int i10 = 0;
                for (int i11 = 0; i11 < i8; i11++) {
                    if (((1 << i11) & d4.f7649o) != 0) {
                        if (i10 > 0) {
                            sb.append(", ");
                        }
                        sb.append(yVar.b(i11));
                        i10++;
                    }
                }
                String string = sb.toString();
                StringBuilder sbL = A6.b.l(string, "StringBuilder().apply(builderAction).toString()");
                int i12 = 0;
                for (int i13 = 0; i13 < i9; i13++) {
                    if (((1 << i13) & d4.f7650p) != 0) {
                        if (i10 > 0) {
                            sbL.append(", ");
                        }
                        sbL.append(yVar.c(i13));
                        i12++;
                    }
                }
                String string2 = sbL.toString();
                kotlin.jvm.internal.l.e("StringBuilder().apply(builderAction).toString()", string2);
                StringBuilder sb2 = new StringBuilder("Error while pushing ");
                sb2.append(yVar);
                sb2.append(". Not all arguments were provided. Missing ");
                A6.b.q(sb2, i10, " int arguments (", string, ") and ");
                A6.b.s(sb2, i12, " object arguments (", string2, ").");
                throw null;
            }
        }
        this.f7120F.n();
    }

    public final void R(int i7) {
        int i8;
        int i9;
        if (this.f7136i != null) {
            N(i7, 0, null, null);
            return;
        }
        if (this.f7144q) {
            C0486d.w("A call to createNode(), emitNode() or useNode() expected");
            throw null;
        }
        this.f7128P = this.f7139l ^ Integer.rotateLeft(Integer.rotateLeft(this.f7128P, 3) ^ i7, 3);
        this.f7139l++;
        A0 a02 = this.f7120F;
        boolean z7 = this.f7127O;
        T t7 = C0502l.a;
        if (z7) {
            a02.f6939k++;
            this.f7122H.H(i7, t7, t7, false);
            u(false, null);
            return;
        }
        if (a02.f() == i7 && ((i9 = a02.f6935g) >= a02.f6936h || !C0486d.l(a02.f6930b, i9))) {
            a02.n();
            u(false, null);
            return;
        }
        if (a02.f6939k <= 0 && (i8 = a02.f6935g) != a02.f6936h) {
            int i10 = this.f7137j;
            E();
            this.f7124L.e(i10, a02.l());
            C0486d.q(this.f7145r, i8, a02.f6935g);
        }
        a02.f6939k++;
        this.f7127O = true;
        this.J = null;
        if (this.f7122H.f6988w) {
            D0 d0M = this.f7121G.m();
            this.f7122H = d0M;
            d0M.D();
            this.I = false;
            this.J = null;
        }
        D0 d02 = this.f7122H;
        d02.d();
        int i11 = d02.f6985t;
        d02.H(i7, t7, t7, false);
        this.f7125M = d02.b(i11);
        u(false, null);
    }

    public final void S(int i7) {
        N(i7, 0, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final O.C0510p T(int r5) {
        /*
            r4 = this;
            r4.R(r5)
            boolean r5 = r4.f7127O
            O.u r0 = r4.f7134g
            D4.S r1 = r4.f7118D
            if (r5 == 0) goto L23
            O.o0 r5 = new O.o0
            r5.<init>(r0)
            java.util.ArrayList r0 = r1.f1530k
            r0.add(r5)
            r4.c0(r5)
            int r0 = r4.f7115A
            r5.f7112e = r0
            int r0 = r5.a
            r0 = r0 & (-17)
            r5.a = r0
            return r4
        L23:
            java.util.ArrayList r5 = r4.f7145r
            O.A0 r2 = r4.f7120F
            int r2 = r2.f6937i
            int r2 = O.C0486d.E(r2, r5)
            if (r2 < 0) goto L36
            java.lang.Object r5 = r5.remove(r2)
            O.N r5 = (O.N) r5
            goto L37
        L36:
            r5 = 0
        L37:
            O.A0 r2 = r4.f7120F
            java.lang.Object r2 = r2.h()
            O.T r3 = O.C0502l.a
            boolean r3 = kotlin.jvm.internal.l.a(r2, r3)
            if (r3 == 0) goto L4e
            O.o0 r2 = new O.o0
            r2.<init>(r0)
            r4.c0(r2)
            goto L55
        L4e:
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl"
            kotlin.jvm.internal.l.d(r0, r2)
            O.o0 r2 = (O.C0509o0) r2
        L55:
            if (r5 != 0) goto L70
            int r5 = r2.a
            r0 = r5 & 64
            if (r0 == 0) goto L5f
            r0 = 1
            goto L60
        L5f:
            r0 = 0
        L60:
            if (r0 == 0) goto L66
            r5 = r5 & (-65)
            r2.a = r5
        L66:
            if (r0 == 0) goto L69
            goto L70
        L69:
            int r5 = r2.a
            r5 = r5 & (-9)
            r2.a = r5
            goto L76
        L70:
            int r5 = r2.a
            r5 = r5 | 8
            r2.a = r5
        L76:
            java.util.ArrayList r5 = r1.f1530k
            r5.add(r2)
            int r5 = r4.f7115A
            r2.f7112e = r5
            int r5 = r2.a
            r5 = r5 & (-17)
            r2.a = r5
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: O.C0510p.T(int):O.p");
    }

    public final void U(Object obj) {
        if (!this.f7127O && this.f7120F.f() == 207 && !kotlin.jvm.internal.l.a(this.f7120F.e(), obj) && this.f7152y < 0) {
            this.f7152y = this.f7120F.f6935g;
            this.f7151x = true;
        }
        N(207, 0, null, obj);
    }

    public final void V() {
        N(125, 2, null, null);
        this.f7144q = true;
    }

    public final void W() {
        this.f7139l = 0;
        B0 b02 = this.f7130c;
        this.f7120F = b02.j();
        N(100, 0, null, null);
        r rVar = this.f7129b;
        rVar.m();
        this.f7147t = rVar.f();
        this.f7150w.b(this.f7149v ? 1 : 0);
        this.f7149v = f(this.f7147t);
        this.J = null;
        if (!this.f7143p) {
            this.f7143p = rVar.d();
        }
        if (!this.f7116B) {
            this.f7116B = rVar.e();
        }
        Set set = (Set) C0486d.L(this.f7147t, Z.b.a);
        if (set != null) {
            set.add(b02);
            rVar.j(set);
        }
        N(rVar.g(), 0, null, null);
    }

    public final boolean X(C0509o0 c0509o0, Object obj) {
        C0484c c0484c = c0509o0.f7110c;
        if (c0484c == null) {
            return false;
        }
        int iA = this.f7120F.a.a(c0484c);
        if (!this.f7119E || iA < this.f7120F.f6935g) {
            return false;
        }
        ArrayList arrayList = this.f7145r;
        int iE = C0486d.E(iA, arrayList);
        if (iE < 0) {
            int i7 = -(iE + 1);
            if (!(obj instanceof E)) {
                obj = null;
            }
            arrayList.add(i7, new N(c0509o0, iA, obj));
            return true;
        }
        N n7 = (N) arrayList.get(iE);
        if (!(obj instanceof E)) {
            n7.f7019c = null;
            return true;
        }
        Object obj2 = n7.f7019c;
        if (obj2 == null) {
            n7.f7019c = obj;
            return true;
        }
        if (obj2 instanceof C1472B) {
            ((C1472B) obj2).a(obj);
            return true;
        }
        int i8 = AbstractC1476F.a;
        C1472B c1472b = new C1472B(2);
        c1472b.f12864b[c1472b.d(obj2)] = obj2;
        c1472b.f12864b[c1472b.d(obj)] = obj;
        n7.f7019c = c1472b;
        return true;
    }

    public final void Y(int i7, int i8) {
        if (d0(i7) != i8) {
            if (i7 < 0) {
                C1494o c1494o = this.f7142o;
                if (c1494o == null) {
                    c1494o = new C1494o();
                    this.f7142o = c1494o;
                }
                c1494o.g(i7, i8);
                return;
            }
            int[] iArr = this.f7141n;
            if (iArr == null) {
                iArr = new int[this.f7120F.f6931c];
                P3.m.d0(iArr, -1);
                this.f7141n = iArr;
            }
            iArr[i7] = i8;
        }
    }

    public final void Z(int i7, int i8) {
        int iD0 = d0(i7);
        if (iD0 != i8) {
            int i9 = i8 - iD0;
            D4.S s7 = this.f7135h;
            int size = s7.f1530k.size() - 1;
            while (i7 != -1) {
                int iD02 = d0(i7) + i9;
                Y(i7, iD02);
                int i10 = size;
                while (true) {
                    if (-1 < i10) {
                        C0499j0 c0499j0 = (C0499j0) s7.f1530k.get(i10);
                        if (c0499j0 != null && c0499j0.a(i7, iD02)) {
                            size = i10 - 1;
                            break;
                        }
                        i10--;
                    } else {
                        break;
                    }
                }
                if (i7 < 0) {
                    i7 = this.f7120F.f6937i;
                } else if (C0486d.m(this.f7120F.f6930b, i7)) {
                    return;
                } else {
                    i7 = C0486d.p(this.f7120F.f6930b, i7);
                }
            }
        }
    }

    public final void a() {
        i();
        this.f7135h.f1530k.clear();
        this.f7140m.f7015b = 0;
        this.f7146s.f7015b = 0;
        this.f7150w.f7015b = 0;
        this.f7148u = null;
        C0558c c0558c = this.f7126N;
        c0558c.f7664j.a0();
        c0558c.f7663i.a0();
        this.f7128P = 0;
        this.f7153z = 0;
        this.f7144q = false;
        this.f7127O = false;
        this.f7151x = false;
        this.f7119E = false;
        this.f7152y = -1;
        A0 a02 = this.f7120F;
        if (!a02.f6934f) {
            a02.c();
        }
        if (this.f7122H.f6988w) {
            return;
        }
        v();
    }

    public final W.d a0(InterfaceC0501k0 interfaceC0501k0, W.d dVar) {
        W.d dVar2 = (W.d) interfaceC0501k0;
        dVar2.getClass();
        W.c cVar = new W.c(dVar2);
        cVar.putAll(dVar);
        W.d dVarH = cVar.h();
        P(204, C0486d.f7060d);
        A();
        c0(dVarH);
        A();
        c0(dVar);
        p(false);
        return dVarH;
    }

    public final void b(Object obj, e4.n nVar) {
        int i7 = 0;
        if (this.f7127O) {
            C0558c c0558c = this.f7126N;
            c0558c.getClass();
            P.z zVar = P.z.f7691c;
            P.D d4 = c0558c.f7663i;
            d4.g0(zVar);
            n6.d.c0(d4, 0, obj);
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>", nVar);
            kotlin.jvm.internal.B.e(2, nVar);
            n6.d.c0(d4, 1, nVar);
            int i8 = d4.f7649o;
            int i9 = zVar.a;
            int iZ = P.D.Z(d4, i9);
            int i10 = zVar.f7642b;
            if (i8 == iZ && d4.f7650p == P.D.Z(d4, i10)) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            int i11 = 0;
            while (i11 < i9) {
                int i12 = i9;
                if (((1 << i11) & d4.f7649o) != 0) {
                    if (i7 > 0) {
                        sb.append(", ");
                    }
                    sb.append(zVar.b(i11));
                    i7++;
                }
                i11++;
                i9 = i12;
            }
            String string = sb.toString();
            StringBuilder sbL = A6.b.l(string, "StringBuilder().apply(builderAction).toString()");
            int i13 = 0;
            int i14 = 0;
            while (i14 < i10) {
                int i15 = i10;
                if (((1 << i14) & d4.f7650p) != 0) {
                    if (i7 > 0) {
                        sbL.append(", ");
                    }
                    sbL.append(zVar.c(i14));
                    i13++;
                }
                i14++;
                i10 = i15;
            }
            String string2 = sbL.toString();
            kotlin.jvm.internal.l.e("StringBuilder().apply(builderAction).toString()", string2);
            StringBuilder sb2 = new StringBuilder("Error while pushing ");
            sb2.append(zVar);
            sb2.append(". Not all arguments were provided. Missing ");
            A6.b.q(sb2, i7, " int arguments (", string, ") and ");
            A6.b.s(sb2, i13, " object arguments (", string2, ").");
            throw null;
        }
        C0557b c0557b = this.f7124L;
        c0557b.b();
        C0556a c0556a = c0557b.f7652b;
        c0556a.getClass();
        P.z zVar2 = P.z.f7691c;
        P.D d6 = c0556a.f7651i;
        d6.g0(zVar2);
        int i16 = 0;
        n6.d.c0(d6, 0, obj);
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>", nVar);
        kotlin.jvm.internal.B.e(2, nVar);
        n6.d.c0(d6, 1, nVar);
        int i17 = d6.f7649o;
        int i18 = zVar2.a;
        int iZ2 = P.D.Z(d6, i18);
        int i19 = zVar2.f7642b;
        if (i17 == iZ2 && d6.f7650p == P.D.Z(d6, i19)) {
            return;
        }
        StringBuilder sb3 = new StringBuilder();
        for (int i20 = 0; i20 < i18; i20++) {
            if (((1 << i20) & d6.f7649o) != 0) {
                if (i16 > 0) {
                    sb3.append(", ");
                }
                sb3.append(zVar2.b(i20));
                i16++;
            }
        }
        String string3 = sb3.toString();
        StringBuilder sbL2 = A6.b.l(string3, "StringBuilder().apply(builderAction).toString()");
        int i21 = 0;
        int i22 = 0;
        while (i21 < i19) {
            int i23 = i19;
            if (((1 << i21) & d6.f7650p) != 0) {
                if (i16 > 0) {
                    sbL2.append(", ");
                }
                sbL2.append(zVar2.c(i21));
                i22++;
            }
            i21++;
            i19 = i23;
        }
        String string4 = sbL2.toString();
        kotlin.jvm.internal.l.e("StringBuilder().apply(builderAction).toString()", string4);
        StringBuilder sb4 = new StringBuilder("Error while pushing ");
        sb4.append(zVar2);
        sb4.append(". Not all arguments were provided. Missing ");
        A6.b.q(sb4, i16, " int arguments (", string3, ") and ");
        A6.b.s(sb4, i22, " object arguments (", string4, ").");
        throw null;
    }

    public final void b0(Object obj) {
        int i7;
        A0 a02;
        int i8;
        D0 d02;
        if (obj instanceof w0) {
            C0484c c0484cA = null;
            if (this.f7127O) {
                C0556a c0556a = this.f7124L.f7652b;
                c0556a.getClass();
                P.r rVar = P.r.f7683c;
                P.D d4 = c0556a.f7651i;
                d4.g0(rVar);
                n6.d.c0(d4, 0, (w0) obj);
                int i9 = d4.f7649o;
                int i10 = rVar.a;
                int iZ = P.D.Z(d4, i10);
                int i11 = rVar.f7642b;
                if (i9 != iZ || d4.f7650p != P.D.Z(d4, i11)) {
                    StringBuilder sb = new StringBuilder();
                    int i12 = 0;
                    for (int i13 = 0; i13 < i10; i13++) {
                        if (((1 << i13) & d4.f7649o) != 0) {
                            if (i12 > 0) {
                                sb.append(", ");
                            }
                            sb.append(rVar.b(i13));
                            i12++;
                        }
                    }
                    String string = sb.toString();
                    StringBuilder sbL = A6.b.l(string, "StringBuilder().apply(builderAction).toString()");
                    int i14 = 0;
                    for (int i15 = 0; i15 < i11; i15++) {
                        if (((1 << i15) & d4.f7650p) != 0) {
                            if (i12 > 0) {
                                sbL.append(", ");
                            }
                            sbL.append(rVar.c(i15));
                            i14++;
                        }
                    }
                    String string2 = sbL.toString();
                    kotlin.jvm.internal.l.e("StringBuilder().apply(builderAction).toString()", string2);
                    StringBuilder sb2 = new StringBuilder("Error while pushing ");
                    sb2.append(rVar);
                    sb2.append(". Not all arguments were provided. Missing ");
                    A6.b.q(sb2, i12, " int arguments (", string, ") and ");
                    A6.b.s(sb2, i14, " object arguments (", string2, ").");
                    throw null;
                }
            }
            this.f7131d.add(obj);
            w0 w0Var = (w0) obj;
            if (this.f7127O) {
                D0 d03 = this.f7122H;
                int i16 = d03.f6985t;
                if (i16 > d03.f6987v + 1) {
                    int i17 = i16 - 1;
                    int iX = d03.x(d03.f6967b, i17);
                    while (true) {
                        i8 = i17;
                        i17 = iX;
                        d02 = this.f7122H;
                        if (i17 == d02.f6987v || i17 < 0) {
                            break;
                        } else {
                            iX = d02.x(d02.f6967b, i17);
                        }
                    }
                    c0484cA = d02.b(i8);
                }
            } else {
                A0 a03 = this.f7120F;
                int i18 = a03.f6935g;
                if (i18 > a03.f6937i + 1) {
                    int i19 = i18 - 1;
                    int i20 = a03.f6930b[(i19 * 5) + 2];
                    while (true) {
                        i7 = i19;
                        i19 = i20;
                        a02 = this.f7120F;
                        if (i19 == a02.f6937i || i19 < 0) {
                            break;
                        } else {
                            i20 = a02.f6930b[(i19 * 5) + 2];
                        }
                    }
                    c0484cA = a02.a(i7);
                }
            }
            x0 x0Var = new x0();
            x0Var.a = w0Var;
            x0Var.f7243b = c0484cA;
            obj = x0Var;
        }
        c0(obj);
    }

    public final boolean c(float f5) {
        Object objA = A();
        if ((objA instanceof Float) && f5 == ((Number) objA).floatValue()) {
            return false;
        }
        c0(Float.valueOf(f5));
        return true;
    }

    public final void c0(Object obj) {
        int i7;
        int i8;
        int i9;
        if (this.f7127O) {
            D0 d02 = this.f7122H;
            if (d02.f6979n <= 0 || d02.f6974i == d02.f6976k) {
                d02.y(obj);
                return;
            }
            C1496q c1496q = d02.f6984s;
            if (c1496q == null) {
                c1496q = new C1496q();
            }
            d02.f6984s = c1496q;
            int i10 = d02.f6987v;
            Object objE = c1496q.e(i10);
            if (objE == null) {
                objE = new C1502w();
                c1496q.h(i10, objE);
            }
            ((C1502w) objE).a(obj);
            return;
        }
        A0 a02 = this.f7120F;
        boolean z7 = a02.f6942n;
        C0557b c0557b = this.f7124L;
        if (!z7) {
            C0484c c0484cA = a02.a(a02.f6937i);
            C0556a c0556a = c0557b.f7652b;
            c0556a.getClass();
            P.e eVar = P.e.f7666c;
            P.D d4 = c0556a.f7651i;
            d4.g0(eVar);
            n6.d.c0(d4, 0, c0484cA);
            n6.d.c0(d4, 1, obj);
            int i11 = d4.f7649o;
            int i12 = eVar.a;
            int iZ = P.D.Z(d4, i12);
            int i13 = eVar.f7642b;
            if (i11 == iZ && d4.f7650p == P.D.Z(d4, i13)) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            int i14 = 0;
            for (int i15 = 0; i15 < i12; i15++) {
                if (((1 << i15) & d4.f7649o) != 0) {
                    if (i14 > 0) {
                        sb.append(", ");
                    }
                    sb.append(eVar.b(i15));
                    i14++;
                }
            }
            String string = sb.toString();
            StringBuilder sbL = A6.b.l(string, "StringBuilder().apply(builderAction).toString()");
            int i16 = 0;
            int i17 = 0;
            while (i16 < i13) {
                int i18 = i13;
                if (((1 << i16) & d4.f7650p) != 0) {
                    if (i14 > 0) {
                        sbL.append(", ");
                    }
                    sbL.append(eVar.c(i16));
                    i17++;
                }
                i16++;
                i13 = i18;
            }
            String string2 = sbL.toString();
            kotlin.jvm.internal.l.e("StringBuilder().apply(builderAction).toString()", string2);
            StringBuilder sb2 = new StringBuilder("Error while pushing ");
            sb2.append(eVar);
            sb2.append(". Not all arguments were provided. Missing ");
            A6.b.q(sb2, i14, " int arguments (", string, ") and ");
            A6.b.s(sb2, i17, " object arguments (", string2, ").");
            throw null;
        }
        int iR = (a02.f6940l - C0486d.r(a02.f6930b, a02.f6937i)) - 1;
        if (c0557b.a.f7120F.f6937i - c0557b.f7656f >= 0) {
            c0557b.d(true);
            C0556a c0556a2 = c0557b.f7652b;
            P.m mVar = P.m.f7677g;
            P.D d6 = c0556a2.f7651i;
            d6.g0(mVar);
            n6.d.c0(d6, 0, obj);
            n6.d.b0(d6, 0, iR);
            if (d6.f7649o == P.D.Z(d6, 1) && d6.f7650p == P.D.Z(d6, 1)) {
                return;
            }
            StringBuilder sb3 = new StringBuilder();
            if ((d6.f7649o & 1) != 0) {
                sb3.append(mVar.b(0));
                i7 = 1;
            } else {
                i7 = 0;
            }
            String string3 = sb3.toString();
            StringBuilder sbL2 = A6.b.l(string3, "StringBuilder().apply(builderAction).toString()");
            if ((d6.f7650p & 1) != 0) {
                if (i7 > 0) {
                    sbL2.append(", ");
                }
                sbL2.append(mVar.c(0));
                i8 = 1;
            } else {
                i8 = 0;
            }
            String string4 = sbL2.toString();
            kotlin.jvm.internal.l.e("StringBuilder().apply(builderAction).toString()", string4);
            StringBuilder sb4 = new StringBuilder("Error while pushing ");
            sb4.append(mVar);
            sb4.append(". Not all arguments were provided. Missing ");
            A6.b.q(sb4, i7, " int arguments (", string3, ") and ");
            A6.b.s(sb4, i8, " object arguments (", string4, ").");
            throw null;
        }
        A0 a03 = this.f7120F;
        C0484c c0484cA2 = a03.a(a03.f6937i);
        C0556a c0556a3 = c0557b.f7652b;
        P.m mVar2 = P.m.f7676f;
        P.D d7 = c0556a3.f7651i;
        d7.g0(mVar2);
        n6.d.c0(d7, 0, obj);
        n6.d.c0(d7, 1, c0484cA2);
        n6.d.b0(d7, 0, iR);
        if (d7.f7649o == P.D.Z(d7, 1) && d7.f7650p == P.D.Z(d7, 2)) {
            return;
        }
        StringBuilder sb5 = new StringBuilder();
        if ((d7.f7649o & 1) != 0) {
            sb5.append(mVar2.b(0));
            i9 = 1;
        } else {
            i9 = 0;
        }
        String string5 = sb5.toString();
        StringBuilder sbL3 = A6.b.l(string5, "StringBuilder().apply(builderAction).toString()");
        int i19 = 0;
        int i20 = 0;
        for (int i21 = 2; i20 < i21; i21 = 2) {
            if (((1 << i20) & d7.f7650p) != 0) {
                if (i9 > 0) {
                    sbL3.append(", ");
                }
                sbL3.append(mVar2.c(i20));
                i19++;
            }
            i20++;
        }
        String string6 = sbL3.toString();
        kotlin.jvm.internal.l.e("StringBuilder().apply(builderAction).toString()", string6);
        StringBuilder sb6 = new StringBuilder("Error while pushing ");
        sb6.append(mVar2);
        sb6.append(". Not all arguments were provided. Missing ");
        A6.b.q(sb6, i9, " int arguments (", string5, ") and ");
        A6.b.s(sb6, i19, " object arguments (", string6, ").");
        throw null;
    }

    public final boolean d(int i7) {
        Object objA = A();
        if ((objA instanceof Integer) && i7 == ((Number) objA).intValue()) {
            return false;
        }
        c0(Integer.valueOf(i7));
        return true;
    }

    public final int d0(int i7) {
        int i8;
        if (i7 >= 0) {
            int[] iArr = this.f7141n;
            return (iArr == null || (i8 = iArr[i7]) < 0) ? C0486d.o(this.f7120F.f6930b, i7) : i8;
        }
        C1494o c1494o = this.f7142o;
        if (c1494o == null || c1494o.c(i7) < 0) {
            return 0;
        }
        return c1494o.d(i7);
    }

    public final boolean e(long j7) {
        Object objA = A();
        if ((objA instanceof Long) && j7 == ((Number) objA).longValue()) {
            return false;
        }
        c0(Long.valueOf(j7));
        return true;
    }

    public final void e0() {
        if (!this.f7144q) {
            C0486d.w("A call to createNode(), emitNode() or useNode() expected was not expected");
            throw null;
        }
        this.f7144q = false;
        if (this.f7127O) {
            C0486d.w("useNode() called while inserting");
            throw null;
        }
        A0 a02 = this.f7120F;
        Object objI = a02.i(a02.f6937i);
        C0557b c0557b = this.f7124L;
        c0557b.c();
        c0557b.f7658h.f1530k.add(objI);
        if (this.f7151x && (objI instanceof InterfaceC0498j)) {
            c0557b.b();
            C0556a c0556a = c0557b.f7652b;
            c0556a.getClass();
            if (objI != null) {
                c0556a.f7651i.f0(P.B.f7641c);
            }
        }
    }

    public final boolean f(Object obj) {
        if (kotlin.jvm.internal.l.a(A(), obj)) {
            return false;
        }
        c0(obj);
        return true;
    }

    public final boolean g(boolean z7) {
        Object objA = A();
        if ((objA instanceof Boolean) && z7 == ((Boolean) objA).booleanValue()) {
            return false;
        }
        c0(Boolean.valueOf(z7));
        return true;
    }

    public final boolean h(Object obj) {
        if (A() == obj) {
            return false;
        }
        c0(obj);
        return true;
    }

    public final void i() {
        this.f7136i = null;
        this.f7137j = 0;
        this.f7138k = 0;
        this.f7128P = 0;
        this.f7144q = false;
        C0557b c0557b = this.f7124L;
        c0557b.f7653c = false;
        c0557b.f7654d.f7015b = 0;
        c0557b.f7656f = 0;
        this.f7118D.f1530k.clear();
        this.f7141n = null;
        this.f7142o = null;
    }

    public final int j(int i7, int i8, int i9, int i10) {
        int iHashCode;
        Object objB;
        if (i7 == i9) {
            return i10;
        }
        A0 a02 = this.f7120F;
        boolean zL = C0486d.l(a02.f6930b, i7);
        int[] iArr = a02.f6930b;
        if (zL) {
            Object objJ = a02.j(iArr, i7);
            iHashCode = objJ != null ? objJ instanceof Enum ? ((Enum) objJ).ordinal() : objJ.hashCode() : 0;
        } else {
            int i11 = iArr[i7 * 5];
            iHashCode = (i11 != 207 || (objB = a02.b(iArr, i7)) == null || objB.equals(C0502l.a)) ? i11 : objB.hashCode();
        }
        if (iHashCode == 126665345) {
            return iHashCode;
        }
        int i12 = this.f7120F.f6930b[(i7 * 5) + 2];
        if (i12 != i9) {
            i10 = j(i12, B(i12), i9, i10);
        }
        if (C0486d.l(this.f7120F.f6930b, i7)) {
            i8 = 0;
        }
        return Integer.rotateLeft(Integer.rotateLeft(i10, 3) ^ iHashCode, 3) ^ i8;
    }

    public final Object k(AbstractC0505m0 abstractC0505m0) {
        return C0486d.L(m(), abstractC0505m0);
    }

    public final void l(InterfaceC0821a interfaceC0821a) {
        int i7;
        int i8;
        if (!this.f7144q) {
            C0486d.w("A call to createNode(), emitNode() or useNode() expected was not expected");
            throw null;
        }
        int i9 = 0;
        this.f7144q = false;
        if (!this.f7127O) {
            C0486d.w("createNode() can only be called when inserting");
            throw null;
        }
        M m7 = this.f7140m;
        int i10 = m7.a[m7.f7015b - 1];
        D0 d02 = this.f7122H;
        C0484c c0484cB = d02.b(d02.f6987v);
        this.f7138k++;
        C0558c c0558c = this.f7126N;
        P.m mVar = P.m.f7674d;
        P.D d4 = c0558c.f7663i;
        d4.g0(mVar);
        n6.d.c0(d4, 0, interfaceC0821a);
        n6.d.b0(d4, 0, i10);
        n6.d.c0(d4, 1, c0484cB);
        if (!(d4.f7649o == P.D.Z(d4, 1) && d4.f7650p == P.D.Z(d4, 2))) {
            StringBuilder sb = new StringBuilder();
            if ((1 & d4.f7649o) != 0) {
                sb.append(mVar.b(0));
                i8 = 1;
            } else {
                i8 = 0;
            }
            String string = sb.toString();
            StringBuilder sbL = A6.b.l(string, "StringBuilder().apply(builderAction).toString()");
            int i11 = 0;
            while (i9 < 2) {
                if (((1 << i9) & d4.f7650p) != 0) {
                    if (i8 > 0) {
                        sbL.append(", ");
                    }
                    sbL.append(mVar.c(i9));
                    i11++;
                }
                i9++;
            }
            String string2 = sbL.toString();
            kotlin.jvm.internal.l.e("StringBuilder().apply(builderAction).toString()", string2);
            StringBuilder sb2 = new StringBuilder("Error while pushing ");
            sb2.append(mVar);
            sb2.append(". Not all arguments were provided. Missing ");
            A6.b.q(sb2, i8, " int arguments (", string, ") and ");
            A6.b.s(sb2, i11, " object arguments (", string2, ").");
            throw null;
        }
        P.m mVar2 = P.m.f7675e;
        P.D d6 = c0558c.f7664j;
        d6.g0(mVar2);
        n6.d.b0(d6, 0, i10);
        n6.d.c0(d6, 0, c0484cB);
        if (d6.f7649o == P.D.Z(d6, 1) && d6.f7650p == P.D.Z(d6, 1)) {
            return;
        }
        StringBuilder sb3 = new StringBuilder();
        if ((d6.f7649o & 1) != 0) {
            sb3.append(mVar2.b(0));
            i7 = 1;
        } else {
            i7 = 0;
        }
        String string3 = sb3.toString();
        StringBuilder sbL2 = A6.b.l(string3, "StringBuilder().apply(builderAction).toString()");
        if ((d6.f7650p & 1) != 0) {
            if (i7 > 0) {
                sbL2.append(", ");
            }
            sbL2.append(mVar2.c(0));
            i9 = 1;
        }
        String string4 = sbL2.toString();
        kotlin.jvm.internal.l.e("StringBuilder().apply(builderAction).toString()", string4);
        StringBuilder sb4 = new StringBuilder("Error while pushing ");
        sb4.append(mVar2);
        sb4.append(". Not all arguments were provided. Missing ");
        A6.b.q(sb4, i7, " int arguments (", string3, ") and ");
        A6.b.s(sb4, i9, " object arguments (", string4, ").");
        throw null;
    }

    public final InterfaceC0501k0 m() {
        InterfaceC0501k0 interfaceC0501k0;
        Object obj;
        Object obj2;
        int i7;
        InterfaceC0501k0 interfaceC0501k02 = this.J;
        if (interfaceC0501k02 != null) {
            return interfaceC0501k02;
        }
        int i8 = this.f7120F.f6937i;
        boolean z7 = this.f7127O;
        C0481a0 c0481a0 = C0486d.f7059c;
        if (z7 && this.I) {
            int iX = this.f7122H.f6987v;
            while (iX > 0) {
                D0 d02 = this.f7122H;
                if (d02.f6967b[d02.p(iX) * 5] == 202) {
                    D0 d03 = this.f7122H;
                    int iP = d03.p(iX);
                    int i9 = 2;
                    if (C0486d.l(d03.f6967b, iP)) {
                        Object[] objArr = d03.f6968c;
                        int[] iArr = d03.f6967b;
                        int i10 = iP * 5;
                        int i11 = iArr[i10 + 4];
                        switch (iArr[i10 + 1] >> 30) {
                            case 0:
                                i7 = 0;
                                break;
                            case 1:
                            case 2:
                            case GzipHeaderFlags.EXTRA /* 4 */:
                                i7 = 1;
                                break;
                            case 3:
                            case 5:
                            case 6:
                                i7 = 2;
                                break;
                            default:
                                i7 = 3;
                                break;
                        }
                        obj = objArr[i7 + i11];
                    } else {
                        obj = null;
                    }
                    if (kotlin.jvm.internal.l.a(obj, c0481a0)) {
                        D0 d04 = this.f7122H;
                        int iP2 = d04.p(iX);
                        if (C0486d.k(d04.f6967b, iP2)) {
                            Object[] objArr2 = d04.f6968c;
                            int[] iArr2 = d04.f6967b;
                            int iF = d04.f(iArr2, iP2);
                            switch (iArr2[(iP2 * 5) + 1] >> 29) {
                                case 0:
                                    i9 = 0;
                                    break;
                                case 1:
                                case 2:
                                case GzipHeaderFlags.EXTRA /* 4 */:
                                    i9 = 1;
                                    break;
                                case 3:
                                case 5:
                                case 6:
                                    break;
                                default:
                                    i9 = 3;
                                    break;
                            }
                            obj2 = objArr2[i9 + iF];
                        } else {
                            obj2 = C0502l.a;
                        }
                        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap", obj2);
                        InterfaceC0501k0 interfaceC0501k03 = (InterfaceC0501k0) obj2;
                        this.J = interfaceC0501k03;
                        return interfaceC0501k03;
                    }
                }
                D0 d05 = this.f7122H;
                iX = d05.x(d05.f6967b, iX);
            }
        }
        if (this.f7120F.f6931c > 0) {
            while (i8 > 0) {
                A0 a02 = this.f7120F;
                int i12 = i8 * 5;
                int[] iArr3 = a02.f6930b;
                if (iArr3[i12] == 202 && kotlin.jvm.internal.l.a(a02.j(iArr3, i8), c0481a0)) {
                    C0034g c0034g = this.f7148u;
                    if (c0034g == null || (interfaceC0501k0 = (InterfaceC0501k0) ((SparseArray) c0034g.f741l).get(i8)) == null) {
                        A0 a03 = this.f7120F;
                        Object objB = a03.b(a03.f6930b, i8);
                        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap", objB);
                        interfaceC0501k0 = (InterfaceC0501k0) objB;
                    }
                    this.J = interfaceC0501k0;
                    return interfaceC0501k0;
                }
                i8 = this.f7120F.f6930b[i12 + 2];
            }
        }
        InterfaceC0501k0 interfaceC0501k04 = this.f7147t;
        this.J = interfaceC0501k04;
        return interfaceC0501k04;
    }

    public final void n(C0034g c0034g, W.a aVar) {
        Object obj;
        Object obj2;
        int i7;
        Object obj3 = null;
        if (this.f7119E) {
            C0486d.w("Reentrant composition is not supported");
            throw null;
        }
        Trace.beginSection("Compose:recompose");
        try {
            this.f7115A = Y.o.k().d();
            this.f7148u = null;
            C1504y c1504y = (C1504y) c0034g.f741l;
            Object[] objArr = c1504y.f12940b;
            Object[] objArr2 = c1504y.f12941c;
            long[] jArr = c1504y.a;
            int length = jArr.length - 2;
            ArrayList arrayList = this.f7145r;
            if (length >= 0) {
                int i8 = 0;
                while (true) {
                    long j7 = jArr[i8];
                    if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i9 = 8;
                        int i10 = 8 - ((~(i8 - length)) >>> 31);
                        int i11 = 0;
                        while (i11 < i10) {
                            if ((j7 & 255) < 128) {
                                int i12 = (i8 << 3) + i11;
                                obj2 = obj3;
                                Object obj4 = objArr[i12];
                                Object obj5 = objArr2[i12];
                                kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl", obj4);
                                C0484c c0484c = ((C0509o0) obj4).f7110c;
                                if (c0484c != null) {
                                    int i13 = c0484c.a;
                                    C0509o0 c0509o0 = (C0509o0) obj4;
                                    i7 = i9;
                                    if (obj5 == T.f7048o) {
                                        obj5 = obj2;
                                    }
                                    arrayList.add(new N(c0509o0, i13, obj5));
                                }
                                j7 >>= i7;
                                i11++;
                                obj3 = obj2;
                                i9 = i7;
                            } else {
                                obj2 = obj3;
                            }
                            i7 = i9;
                            j7 >>= i7;
                            i11++;
                            obj3 = obj2;
                            i9 = i7;
                        }
                        obj = obj3;
                        if (i10 != i9) {
                            break;
                        }
                    } else {
                        obj = obj3;
                    }
                    if (i8 == length) {
                        break;
                    }
                    i8++;
                    obj3 = obj;
                }
            }
            P3.u.d0(arrayList, C0486d.f7062f);
            this.f7137j = 0;
            this.f7119E = true;
            try {
                W();
                Object objA = A();
                if (objA != aVar && aVar != null) {
                    c0(aVar);
                }
                C0508o c0508o = this.f7117C;
                Q.d dVarB = C0486d.B();
                try {
                    dVarB.b(c0508o);
                    C0481a0 c0481a0 = C0486d.a;
                    if (aVar != null) {
                        P(200, c0481a0);
                        C0486d.G(this, aVar);
                        p(false);
                    } else if (!this.f7149v || objA == null || objA.equals(C0502l.a)) {
                        K();
                    } else {
                        P(200, c0481a0);
                        kotlin.jvm.internal.B.e(2, objA);
                        C0486d.G(this, (e4.n) objA);
                        p(false);
                    }
                    dVarB.n(dVarB.f7829m - 1);
                    t();
                    this.f7119E = false;
                    arrayList.clear();
                    C0486d.P(this.f7122H.f6988w);
                    v();
                    Trace.endSection();
                } finally {
                    dVarB.n(dVarB.f7829m - 1);
                }
            } catch (Throwable th) {
                this.f7119E = false;
                arrayList.clear();
                a();
                C0486d.P(this.f7122H.f6988w);
                v();
                throw th;
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public final void o(int i7, int i8) {
        if (i7 <= 0 || i7 == i8) {
            return;
        }
        o(this.f7120F.f6930b[(i7 * 5) + 2], i8);
        if (C0486d.m(this.f7120F.f6930b, i7)) {
            Object objI = this.f7120F.i(i7);
            C0557b c0557b = this.f7124L;
            c0557b.c();
            c0557b.f7658h.f1530k.add(objI);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x062f  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0757  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x091b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(boolean r45) {
        /*
            Method dump skipped, instructions count: 2698
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O.C0510p.p(boolean):void");
    }

    public final void q() {
        p(false);
        C0509o0 c0509o0W = w();
        if (c0509o0W != null) {
            int i7 = c0509o0W.a;
            if ((i7 & 1) != 0) {
                c0509o0W.a = i7 | 2;
            }
        }
    }

    public final void r() {
        p(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x016c  */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v4, types: [java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final O.C0509o0 s() {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O.C0510p.s():O.o0");
    }

    public final void t() {
        p(false);
        this.f7129b.b();
        p(false);
        C0557b c0557b = this.f7124L;
        if (c0557b.f7653c) {
            c0557b.d(false);
            c0557b.d(false);
            C0556a c0556a = c0557b.f7652b;
            c0556a.getClass();
            c0556a.f7651i.f0(P.i.f7670c);
            c0557b.f7653c = false;
        }
        c0557b.b();
        if (!(c0557b.f7654d.f7015b == 0)) {
            C0486d.w("Missed recording an endGroup()");
            throw null;
        }
        if (!this.f7135h.f1530k.isEmpty()) {
            C0486d.w("Start/end imbalance");
            throw null;
        }
        i();
        this.f7120F.c();
        this.f7149v = this.f7150w.a() != 0;
    }

    public final void u(boolean z7, C0499j0 c0499j0) {
        this.f7135h.f1530k.add(this.f7136i);
        this.f7136i = c0499j0;
        int i7 = this.f7138k;
        M m7 = this.f7140m;
        m7.b(i7);
        m7.b(this.f7139l);
        m7.b(this.f7137j);
        if (z7) {
            this.f7137j = 0;
        }
        this.f7138k = 0;
        this.f7139l = 0;
    }

    public final void v() {
        B0 b02 = new B0();
        if (this.f7116B) {
            b02.h();
        }
        if (this.f7129b.c()) {
            b02.f6955t = new C1496q();
        }
        this.f7121G = b02;
        D0 d0M = b02.m();
        d0M.e(true);
        this.f7122H = d0M;
    }

    public final C0509o0 w() {
        if (this.f7153z != 0) {
            return null;
        }
        D4.S s7 = this.f7118D;
        if (s7.f1530k.isEmpty()) {
            return null;
        }
        return (C0509o0) s7.f1530k.get(r0.size() - 1);
    }

    public final boolean x() {
        if (!y() || this.f7149v) {
            return true;
        }
        C0509o0 c0509o0W = w();
        return (c0509o0W == null || (c0509o0W.a & 4) == 0) ? false : true;
    }

    public final boolean y() {
        C0509o0 c0509o0W;
        return (this.f7127O || this.f7151x || this.f7149v || (c0509o0W = w()) == null || (c0509o0W.a & 8) != 0) ? false : true;
    }

    public final void z(ArrayList arrayList) {
        C0556a c0556a = this.f7133f;
        C0557b c0557b = this.f7124L;
        C0556a c0556a2 = c0557b.f7652b;
        try {
            c0557b.f7652b = c0556a;
            c0556a.f7651i.f0(P.u.f7686c);
            if (arrayList.size() > 0) {
                O3.l lVar = (O3.l) arrayList.get(0);
                X x7 = (X) lVar.f7528k;
                x7.getClass();
                throw null;
            }
            C0556a c0556a3 = c0557b.f7652b;
            c0556a3.getClass();
            c0556a3.f7651i.f0(P.j.f7671c);
            c0557b.f7656f = 0;
        } finally {
            c0557b.f7652b = c0556a2;
        }
    }
}
