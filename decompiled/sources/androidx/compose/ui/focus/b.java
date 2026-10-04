package androidx.compose.ui.focus;

import D.x0;
import H.N;
import L.L1;
import M.K;
import Q.d;
import a0.p;
import a0.q;
import b6.r;
import c.w;
import f0.AbstractC0851d;
import f0.C0849b;
import f0.C0852e;
import f0.C0853f;
import f0.C0856i;
import f0.C0859l;
import f0.C0866s;
import f0.InterfaceC0854g;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.x;
import m.C1499t;
import p.AbstractC1755i;
import y0.S;

/* loaded from: classes.dex */
public final class b implements InterfaceC0854g {
    public final r a;

    /* renamed from: b, reason: collision with root package name */
    public final x0 f10650b;

    /* renamed from: c, reason: collision with root package name */
    public final w f10651c;

    /* renamed from: d, reason: collision with root package name */
    public final w f10652d;

    /* renamed from: e, reason: collision with root package name */
    public final K f10653e;

    /* renamed from: g, reason: collision with root package name */
    public final C0852e f10655g;

    /* renamed from: j, reason: collision with root package name */
    public C1499t f10658j;

    /* renamed from: f, reason: collision with root package name */
    public final C0866s f10654f = new C0866s();

    /* renamed from: h, reason: collision with root package name */
    public final N f10656h = new N();

    /* renamed from: i, reason: collision with root package name */
    public final q f10657i = new FocusPropertiesElement(new C0859l()).k(new S() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$2
        public final boolean equals(Object obj) {
            return obj == this;
        }

        @Override // y0.S
        public final p h() {
            return this.a.f10654f;
        }

        public final int hashCode() {
            return this.a.f10654f.hashCode();
        }

        @Override // y0.S
        public final /* bridge */ /* synthetic */ void m(p pVar) {
        }
    });

    public b(x0 x0Var, r rVar, x0 x0Var2, w wVar, w wVar2, K k7) {
        this.a = rVar;
        this.f10650b = x0Var2;
        this.f10651c = wVar;
        this.f10652d = wVar2;
        this.f10653e = k7;
        this.f10655g = new C0852e(x0Var, new w(0, this, b.class, "invalidateOwnerFocusState", "invalidateOwnerFocusState()V", 0, 3));
    }

    public final boolean a(int i7, boolean z7, boolean z8) {
        int iB;
        N n7 = this.f10656h;
        C0853f c0853f = C0853f.f11396n;
        try {
            if (n7.f2900b) {
                N.b(n7);
            }
            n7.f2900b = true;
            ((d) n7.f2902d).b(c0853f);
            C0866s c0866s = this.f10654f;
            boolean zE = (z7 || !((iB = AbstractC1755i.b(AbstractC0851d.u(c0866s, i7))) == 1 || iB == 2 || iB == 3)) ? AbstractC0851d.e(c0866s, z7) : false;
            if (zE && z8) {
                this.f10651c.invoke();
            }
            return zE;
        } finally {
            N.c(n7);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b3, code lost:
    
        if (((((~r10) << 6) & r10) & (-9187201950435737472L)) == 0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b5, code lost:
    
        r2 = r9.b(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00bb, code lost:
    
        if (r9.f12923e != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00cd, code lost:
    
        if (((r9.a[r2 >> 3] >> ((r2 & 7) << 3)) & 255) != 254) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00cf, code lost:
    
        r38 = 1;
        r7 = r9;
        r36 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d6, code lost:
    
        r2 = r9.f12921c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d8, code lost:
    
        if (r2 <= 8) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00da, code lost:
    
        r15 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00f1, code lost:
    
        if (java.lang.Long.compare((r9.f12922d * 32) ^ Long.MIN_VALUE, (r2 * 25) ^ Long.MIN_VALUE) > 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00f3, code lost:
    
        r2 = r9.a;
        r6 = r9.f12921c;
        r7 = r9.f12920b;
        m.AbstractC1475E.a(r2, r6);
        r10 = 0;
        r11 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ff, code lost:
    
        if (r10 == r6) goto L434;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0101, code lost:
    
        r17 = r10 >> 3;
        r24 = (r10 & 7) << 3;
        r22 = (r2[r17] >> r24) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x010f, code lost:
    
        if (r22 != r15) goto L433;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0111, code lost:
    
        r11 = r10;
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x011b, code lost:
    
        if (r22 == 254) goto L436;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x011d, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0120, code lost:
    
        r22 = java.lang.Long.hashCode(r7[r10]) * (-862048943);
        r35 = r14;
        r14 = (r22 ^ (r22 << 16)) >>> 7;
        r23 = r9.b(r14);
        r14 = r14 & r6;
        r36 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0147, code lost:
    
        if ((((r23 - r14) & r6) / 8) != (((r10 - r14) & r6) / 8)) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0149, code lost:
    
        r38 = r8;
        r39 = r9;
        r2[r17] = (r2[r17] & (~(255 << r24))) | ((r22 & 127) << r24);
        r2[r2.length - 1] = (r2[0] & 72057594037927935L) | Long.MIN_VALUE;
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0169, code lost:
    
        r14 = r35;
        r15 = r36;
        r8 = r38;
        r9 = r39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0172, code lost:
    
        r38 = r8;
        r39 = r9;
        r8 = r23 >> 3;
        r14 = r2[r8];
        r9 = (r23 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0184, code lost:
    
        if (((r14 >> r9) & 255) != r36) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0186, code lost:
    
        r16 = r7;
        r2[r8] = ((~(255 << r9)) & r14) | ((r22 & 127) << r9);
        r2[r17] = (r2[r17] & (~(255 << r24))) | (r36 << r24);
        r16[r23] = r16[r10];
        r16[r10] = 0;
        r11 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01ab, code lost:
    
        r16 = r7;
        r2[r8] = ((~(255 << r9)) & r14) | ((r22 & 127) << r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01be, code lost:
    
        if (r11 != (-1)) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01c0, code lost:
    
        r11 = m.AbstractC1475E.b(r2, r10 + 1, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01c6, code lost:
    
        r16[r11] = r16[r23];
        r16[r23] = r16[r10];
        r16[r10] = r16[r11];
        r10 = r10 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01d4, code lost:
    
        r2[r2.length - 1] = (r2[0] & 72057594037927935L) | Long.MIN_VALUE;
        r10 = r10 + 1;
        r7 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01e4, code lost:
    
        r38 = r8;
        r7 = r9;
        r36 = r15;
        r7.f12923e = m.AbstractC1475E.c(r7.f12921c) - r7.f12922d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01f6, code lost:
    
        r36 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01f8, code lost:
    
        r38 = 1;
        r7 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01fc, code lost:
    
        r36 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01ff, code lost:
    
        r2 = m.AbstractC1475E.d(r7.f12921c);
        r6 = r7.a;
        r8 = r7.f12920b;
        r9 = r7.f12921c;
        r7.c(r2);
        r2 = r7.a;
        r10 = r7.f12920b;
        r11 = r7.f12921c;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0216, code lost:
    
        if (r14 >= r9) goto L442;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0226, code lost:
    
        if (((r6[r14 >> 3] >> ((r14 & 7) << 3)) & 255) >= r36) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0228, code lost:
    
        r15 = r8[r14];
        r17 = java.lang.Long.hashCode(r15) * (-862048943);
        r17 = r17 ^ (r17 << 16);
        r18 = r2;
        r2 = r7.b(r17 >>> 7);
        r2 = r17 & 127;
        r17 = r8;
        r20 = r9;
        r8 = r2;
        r2 = r2 >> 3;
        r21 = (r2 & 7) << 3;
        r8 = (r18[r2] & (~(255 << r21))) | (r8 << r21);
        r18[r2] = r8;
        r18[(((r2 - 7) & r11) + (r11 & 7)) >> 3] = r8;
        r10[r2] = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0268, code lost:
    
        r18 = r2;
        r17 = r8;
        r20 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x026e, code lost:
    
        r14 = r14 + 1;
        r8 = r17;
        r2 = r18;
        r9 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0277, code lost:
    
        r2 = r7.b(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x027b, code lost:
    
        r35 = r2;
        r7.f12922d++;
        r2 = r7.f12923e;
        r3 = r7.a;
        r6 = r35 >> 3;
        r8 = r3[r6];
        r10 = (r35 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0295, code lost:
    
        if (((r8 >> r10) & 255) != r36) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0297, code lost:
    
        r11 = r38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x029a, code lost:
    
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x029c, code lost:
    
        r7.f12923e = r2 - r11;
        r2 = r7.f12921c;
        r8 = (r8 & (~(255 << r10))) | (r12 << r10);
        r3[r6] = r8;
        r3[(((r35 - 7) & r2) + (r2 & 7)) >> 3] = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x033f, code lost:
    
        if (((r9 & ((~r9) << 6)) & (-9187201950435737472L)) == 0) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0341, code lost:
    
        r7 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0437  */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [int] */
    /* JADX WARN: Type inference failed for: r10v52 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7, types: [int] */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [int] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18, types: [int] */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20, types: [int] */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22, types: [int] */
    /* JADX WARN: Type inference failed for: r11v41 */
    /* JADX WARN: Type inference failed for: r11v42 */
    /* JADX WARN: Type inference failed for: r2v16, types: [a0.p] */
    /* JADX WARN: Type inference failed for: r2v17, types: [a0.p] */
    /* JADX WARN: Type inference failed for: r2v21, types: [a0.p] */
    /* JADX WARN: Type inference failed for: r2v22, types: [a0.p] */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27, types: [a0.p] */
    /* JADX WARN: Type inference failed for: r2v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36, types: [a0.p] */
    /* JADX WARN: Type inference failed for: r2v37, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v94 */
    /* JADX WARN: Type inference failed for: r2v95 */
    /* JADX WARN: Type inference failed for: r2v96 */
    /* JADX WARN: Type inference failed for: r2v97 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34, types: [int] */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v37, types: [Q.d] */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v40, types: [Q.d] */
    /* JADX WARN: Type inference failed for: r3v42 */
    /* JADX WARN: Type inference failed for: r3v43, types: [Q.d] */
    /* JADX WARN: Type inference failed for: r3v44 */
    /* JADX WARN: Type inference failed for: r3v45 */
    /* JADX WARN: Type inference failed for: r3v46, types: [Q.d] */
    /* JADX WARN: Type inference failed for: r3v52 */
    /* JADX WARN: Type inference failed for: r3v53 */
    /* JADX WARN: Type inference failed for: r3v54 */
    /* JADX WARN: Type inference failed for: r3v55 */
    /* JADX WARN: Type inference failed for: r3v56 */
    /* JADX WARN: Type inference failed for: r3v57 */
    /* JADX WARN: Type inference failed for: r3v58 */
    /* JADX WARN: Type inference failed for: r3v59 */
    /* JADX WARN: Type inference failed for: r3v60 */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v43 */
    /* JADX WARN: Type inference failed for: r6v44 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v113 */
    /* JADX WARN: Type inference failed for: r7v114 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19, types: [a0.p] */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21, types: [a0.p] */
    /* JADX WARN: Type inference failed for: r7v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11, types: [Q.d] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14, types: [Q.d] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v30, types: [a0.p] */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v32, types: [a0.p] */
    /* JADX WARN: Type inference failed for: r8v33, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v34 */
    /* JADX WARN: Type inference failed for: r8v35 */
    /* JADX WARN: Type inference failed for: r8v36 */
    /* JADX WARN: Type inference failed for: r8v37 */
    /* JADX WARN: Type inference failed for: r8v39 */
    /* JADX WARN: Type inference failed for: r8v40, types: [int] */
    /* JADX WARN: Type inference failed for: r8v41 */
    /* JADX WARN: Type inference failed for: r8v42, types: [int] */
    /* JADX WARN: Type inference failed for: r8v76 */
    /* JADX WARN: Type inference failed for: r8v77 */
    /* JADX WARN: Type inference failed for: r8v78 */
    /* JADX WARN: Type inference failed for: r8v79 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v80 */
    /* JADX WARN: Type inference failed for: r8v81 */
    /* JADX WARN: Type inference failed for: r8v82 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21, types: [Q.d] */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24, types: [Q.d] */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v30, types: [int] */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v32, types: [int] */
    /* JADX WARN: Type inference failed for: r9v52 */
    /* JADX WARN: Type inference failed for: r9v53 */
    /* JADX WARN: Type inference failed for: r9v54 */
    /* JADX WARN: Type inference failed for: r9v55 */
    /* JADX WARN: Type inference failed for: r9v56 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(android.view.KeyEvent r45, e4.InterfaceC0821a r46) {
        /*
            Method dump skipped, instructions count: 1604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.b.b(android.view.KeyEvent, e4.a):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005f A[PHI: r11
      0x005f: PHI (r11v12 f0.o) = (r11v9 f0.o), (r11v16 f0.o) binds: [B:38:0x007c, B:24:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r11v2, types: [e4.k, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v4, types: [e4.k, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v11, types: [y0.m0] */
    /* JADX WARN: Type inference failed for: r3v5, types: [a0.p] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12, types: [a0.p] */
    /* JADX WARN: Type inference failed for: r5v13, types: [f0.s] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15, types: [a0.p] */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [Q.d] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [Q.d] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean c(int r19, g0.d r20, e4.k r21) {
        /*
            Method dump skipped, instructions count: 500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.b.c(int, g0.d, e4.k):java.lang.Boolean");
    }

    public final boolean d(int i7) {
        x xVar = new x();
        xVar.f12720k = Boolean.FALSE;
        Boolean boolC = c(i7, (g0.d) this.f10652d.invoke(), new L1(i7, 2, xVar));
        if (boolC != null && xVar.f12720k != null) {
            Boolean bool = Boolean.TRUE;
            if (!boolC.equals(bool) || !l.a(xVar.f12720k, bool)) {
                if (i7 != 1 && i7 != 2) {
                    return ((Boolean) this.f10650b.invoke(new C0849b(i7))).booleanValue();
                }
                if (a(i7, false, false)) {
                    Boolean boolC2 = c(i7, null, new C0856i(i7, 0));
                    if (boolC2 != null ? boolC2.booleanValue() : false) {
                    }
                }
            }
            return true;
        }
        return false;
    }
}
