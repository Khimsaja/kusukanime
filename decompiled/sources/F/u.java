package F;

import D.C0053g0;
import D.N0;
import D.W;
import H.S;
import H0.C0214f;
import H0.H;
import N0.C0476a;
import android.graphics.PointF;
import android.os.CancellationSignal;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import e5.AbstractC0832b;
import h0.AbstractC0968M;
import l4.AbstractC1420H;
import z0.S0;
import z5.C2508m;

/* loaded from: classes.dex */
public final class u {
    public static final u a = new u();

    private final void C(C0053g0 c0053g0, SelectGesture selectGesture, S s7) {
        if (s7 != null) {
            long jC = n6.d.C(c0053g0, AbstractC0968M.y(selectGesture.getSelectionArea()), G(selectGesture.getGranularity()));
            C0053g0 c0053g02 = s7.f2915d;
            if (c0053g02 != null) {
                c0053g02.f(jC);
            }
            C0053g0 c0053g03 = s7.f2915d;
            if (c0053g03 != null) {
                c0053g03.e(H.f3091b);
            }
            if (H.b(jC)) {
                return;
            }
            s7.p(false);
            s7.n(W.f1107k);
        }
    }

    private final void D(G g4, SelectGesture selectGesture, F f5) {
        AbstractC0968M.y(selectGesture.getSelectionArea());
        G(selectGesture.getGranularity());
        throw null;
    }

    private final void E(C0053g0 c0053g0, SelectRangeGesture selectRangeGesture, S s7) {
        if (s7 != null) {
            long jH = n6.d.h(c0053g0, AbstractC0968M.y(selectRangeGesture.getSelectionStartArea()), AbstractC0968M.y(selectRangeGesture.getSelectionEndArea()), G(selectRangeGesture.getGranularity()));
            C0053g0 c0053g02 = s7.f2915d;
            if (c0053g02 != null) {
                c0053g02.f(jH);
            }
            C0053g0 c0053g03 = s7.f2915d;
            if (c0053g03 != null) {
                c0053g03.e(H.f3091b);
            }
            if (H.b(jH)) {
                return;
            }
            s7.p(false);
            s7.n(W.f1107k);
        }
    }

    private final void F(G g4, SelectRangeGesture selectRangeGesture, F f5) {
        AbstractC0968M.y(selectRangeGesture.getSelectionStartArea());
        AbstractC0968M.y(selectRangeGesture.getSelectionEndArea());
        G(selectRangeGesture.getGranularity());
        throw null;
    }

    private final int G(int i7) {
        return i7 != 1 ? 0 : 1;
    }

    private final int a(G g4, HandwritingGesture handwritingGesture) {
        throw null;
    }

    private final int b(HandwritingGesture handwritingGesture, e4.k kVar) {
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        kVar.invoke(new C0476a(fallbackText, 1));
        return 5;
    }

    private final int c(C0053g0 c0053g0, DeleteGesture deleteGesture, C0214f c0214f, e4.k kVar) {
        int iG = G(deleteGesture.getGranularity());
        long jC = n6.d.C(c0053g0, AbstractC0968M.y(deleteGesture.getDeletionArea()), iG);
        if (H.b(jC)) {
            return a.b(s.i(deleteGesture), kVar);
        }
        h(jC, c0214f, iG == 1, kVar);
        return 1;
    }

    private final int d(G g4, DeleteGesture deleteGesture, F f5) {
        G(deleteGesture.getGranularity());
        AbstractC0968M.y(deleteGesture.getDeletionArea());
        throw null;
    }

    private final int e(C0053g0 c0053g0, DeleteRangeGesture deleteRangeGesture, C0214f c0214f, e4.k kVar) {
        int iG = G(deleteRangeGesture.getGranularity());
        long jH = n6.d.h(c0053g0, AbstractC0968M.y(deleteRangeGesture.getDeletionStartArea()), AbstractC0968M.y(deleteRangeGesture.getDeletionEndArea()), iG);
        if (H.b(jH)) {
            return a.b(s.i(deleteRangeGesture), kVar);
        }
        h(jH, c0214f, iG == 1, kVar);
        return 1;
    }

    private final int f(G g4, DeleteRangeGesture deleteRangeGesture, F f5) {
        G(deleteRangeGesture.getGranularity());
        AbstractC0968M.y(deleteRangeGesture.getDeletionStartArea());
        AbstractC0968M.y(deleteRangeGesture.getDeletionEndArea());
        throw null;
    }

    private final void g(G g4, long j7, boolean z7) {
        if (!z7) {
            throw null;
        }
        throw null;
    }

    private final void h(long j7, C0214f c0214f, boolean z7, e4.k kVar) {
        if (z7) {
            int i7 = H.f3092c;
            int iCharCount = (int) (j7 >> 32);
            int iCharCount2 = (int) (j7 & 4294967295L);
            int iCodePointBefore = iCharCount > 0 ? Character.codePointBefore(c0214f, iCharCount) : 10;
            int iCodePointAt = iCharCount2 < c0214f.a.length() ? Character.codePointAt(c0214f, iCharCount2) : 10;
            if (n6.d.P(iCodePointBefore) && (n6.d.O(iCodePointAt) || n6.d.M(iCodePointAt))) {
                do {
                    iCharCount -= Character.charCount(iCodePointBefore);
                    if (iCharCount == 0) {
                        break;
                    } else {
                        iCodePointBefore = Character.codePointBefore(c0214f, iCharCount);
                    }
                } while (n6.d.P(iCodePointBefore));
                j7 = AbstractC1420H.c(iCharCount, iCharCount2);
            } else if (n6.d.P(iCodePointAt) && (n6.d.O(iCodePointBefore) || n6.d.M(iCodePointBefore))) {
                do {
                    iCharCount2 += Character.charCount(iCodePointAt);
                    if (iCharCount2 == c0214f.a.length()) {
                        break;
                    } else {
                        iCodePointAt = Character.codePointAt(c0214f, iCharCount2);
                    }
                } while (n6.d.P(iCodePointAt));
                j7 = AbstractC1420H.c(iCharCount, iCharCount2);
            }
        }
        int i8 = (int) (4294967295L & j7);
        kVar.invoke(new v(new N0.i[]{new N0.v(i8, i8), new N0.g(H.c(j7), 0)}));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int k(D.C0053g0 r7, android.view.inputmethod.InsertGesture r8, z0.S0 r9, e4.k r10) {
        /*
            r6 = this;
            if (r9 != 0) goto Lb
            android.view.inputmethod.HandwritingGesture r7 = F.s.i(r8)
            int r7 = r6.b(r7, r10)
            return r7
        Lb:
            android.graphics.PointF r0 = F.m.c(r8)
            float r1 = r0.x
            float r0 = r0.y
            long r0 = e5.AbstractC0832b.e(r1, r0)
            D.N0 r2 = r7.d()
            r3 = 1
            r4 = -1
            if (r2 == 0) goto L49
            H0.F r2 = r2.a
            H0.n r2 = r2.f3083b
            w0.r r5 = r7.c()
            if (r5 == 0) goto L49
            long r0 = r5.y(r0)
            int r9 = n6.d.B(r2, r0, r9)
            if (r9 != r4) goto L34
            goto L49
        L34:
            float r5 = r2.d(r9)
            float r9 = r2.b(r9)
            float r9 = r9 + r5
            r5 = 1073741824(0x40000000, float:2.0)
            float r9 = r9 / r5
            long r0 = g0.c.a(r0, r9, r3)
            int r9 = r2.e(r0)
            goto L4a
        L49:
            r9 = r4
        L4a:
            if (r9 == r4) goto L63
            D.N0 r7 = r7.d()
            if (r7 == 0) goto L5b
            H0.F r7 = r7.a
            boolean r7 = n6.d.k(r7, r9)
            if (r7 != r3) goto L5b
            goto L63
        L5b:
            java.lang.String r7 = F.m.n(r8)
            r6.m(r9, r7, r10)
            return r3
        L63:
            android.view.inputmethod.HandwritingGesture r7 = F.s.i(r8)
            int r7 = r6.b(r7, r10)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: F.u.k(D.g0, android.view.inputmethod.InsertGesture, z0.S0, e4.k):int");
    }

    private final int l(G g4, InsertGesture insertGesture, F f5, S0 s02) {
        PointF insertionPoint = insertGesture.getInsertionPoint();
        AbstractC0832b.e(insertionPoint.x, insertionPoint.y);
        throw null;
    }

    private final void m(int i7, String str, e4.k kVar) {
        kVar.invoke(new v(new N0.i[]{new N0.v(i7, i7), new C0476a(str, 1)}));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int n(D.C0053g0 r11, android.view.inputmethod.JoinOrSplitGesture r12, H0.C0214f r13, z0.S0 r14, e4.k r15) {
        /*
            r10 = this;
            if (r14 != 0) goto Lb
            android.view.inputmethod.HandwritingGesture r11 = F.s.i(r12)
            int r11 = r10.b(r11, r15)
            return r11
        Lb:
            android.graphics.PointF r0 = F.s.d(r12)
            float r1 = r0.x
            float r0 = r0.y
            long r0 = e5.AbstractC0832b.e(r1, r0)
            D.N0 r2 = r11.d()
            r3 = 1
            r4 = -1
            if (r2 == 0) goto L49
            H0.F r2 = r2.a
            H0.n r2 = r2.f3083b
            w0.r r5 = r11.c()
            if (r5 == 0) goto L49
            long r0 = r5.y(r0)
            int r14 = n6.d.B(r2, r0, r14)
            if (r14 != r4) goto L34
            goto L49
        L34:
            float r5 = r2.d(r14)
            float r14 = r2.b(r14)
            float r14 = r14 + r5
            r5 = 1073741824(0x40000000, float:2.0)
            float r14 = r14 / r5
            long r0 = g0.c.a(r0, r14, r3)
            int r14 = r2.e(r0)
            goto L4a
        L49:
            r14 = r4
        L4a:
            if (r14 == r4) goto L5a
            D.N0 r11 = r11.d()
            if (r11 == 0) goto L5d
            H0.F r11 = r11.a
            boolean r11 = n6.d.k(r11, r14)
            if (r11 != r3) goto L5d
        L5a:
            r4 = r10
            r9 = r15
            goto La7
        L5d:
            r11 = r14
        L5e:
            if (r11 <= 0) goto L71
            int r12 = java.lang.Character.codePointBefore(r13, r11)
            boolean r0 = n6.d.O(r12)
            if (r0 != 0) goto L6b
            goto L71
        L6b:
            int r12 = java.lang.Character.charCount(r12)
            int r11 = r11 - r12
            goto L5e
        L71:
            java.lang.String r12 = r13.a
            int r12 = r12.length()
            if (r14 >= r12) goto L8a
            int r12 = java.lang.Character.codePointAt(r13, r14)
            boolean r0 = n6.d.O(r12)
            if (r0 != 0) goto L84
            goto L8a
        L84:
            int r12 = java.lang.Character.charCount(r12)
            int r14 = r14 + r12
            goto L71
        L8a:
            long r5 = l4.AbstractC1420H.c(r11, r14)
            boolean r11 = H0.H.b(r5)
            if (r11 == 0) goto L9f
            r11 = 32
            long r11 = r5 >> r11
            int r11 = (int) r11
            java.lang.String r12 = " "
            r10.m(r11, r12, r15)
            return r3
        L9f:
            r8 = 0
            r4 = r10
            r7 = r13
            r9 = r15
            r4.h(r5, r7, r8, r9)
            return r3
        La7:
            android.view.inputmethod.HandwritingGesture r11 = F.s.i(r12)
            int r11 = r10.b(r11, r9)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: F.u.n(D.g0, android.view.inputmethod.JoinOrSplitGesture, H0.f, z0.S0, e4.k):int");
    }

    private final int o(G g4, JoinOrSplitGesture joinOrSplitGesture, F f5, S0 s02) {
        throw null;
    }

    private final int p(C0053g0 c0053g0, RemoveSpaceGesture removeSpaceGesture, C0214f c0214f, S0 s02, e4.k kVar) {
        long jF;
        int i7;
        N0 n0D = c0053g0.d();
        H0.F f5 = n0D != null ? n0D.a : null;
        PointF startPoint = removeSpaceGesture.getStartPoint();
        long jE = AbstractC0832b.e(startPoint.x, startPoint.y);
        PointF endPoint = removeSpaceGesture.getEndPoint();
        long jE2 = AbstractC0832b.e(endPoint.x, endPoint.y);
        w0.r rVarC = c0053g0.c();
        if (f5 == null || rVarC == null) {
            jF = H.f3091b;
        } else {
            long jY = rVarC.y(jE);
            long jY2 = rVarC.y(jE2);
            H0.n nVar = f5.f3083b;
            int iB = n6.d.B(nVar, jY, s02);
            int iB2 = n6.d.B(nVar, jY2, s02);
            if (iB != -1) {
                if (iB2 != -1) {
                    iB = Math.min(iB, iB2);
                }
                iB2 = iB;
            } else if (iB2 == -1) {
                jF = H.f3091b;
            }
            float fB = (nVar.b(iB2) + nVar.d(iB2)) / 2;
            jF = nVar.f(new g0.d(Math.min(g0.c.d(jY), g0.c.d(jY2)), fB - 0.1f, Math.max(g0.c.d(jY), g0.c.d(jY2)), fB + 0.1f), 0, H0.D.a);
        }
        if (H.b(jF)) {
            return a.b(s.i(removeSpaceGesture), kVar);
        }
        kotlin.jvm.internal.v vVar = new kotlin.jvm.internal.v();
        vVar.f12718k = -1;
        kotlin.jvm.internal.v vVar2 = new kotlin.jvm.internal.v();
        vVar2.f12718k = -1;
        String strC = new C2508m("\\s+").c(c0214f.subSequence(H.e(jF), H.d(jF)).a, new A3.t(5, vVar, vVar2));
        int i8 = vVar.f12718k;
        if (i8 == -1 || (i7 = vVar2.f12718k) == -1) {
            return b(s.i(removeSpaceGesture), kVar);
        }
        int i9 = (int) (jF >> 32);
        String strSubstring = strC.substring(i8, strC.length() - (H.c(jF) - vVar2.f12718k));
        kotlin.jvm.internal.l.e("this as java.lang.String…ing(startIndex, endIndex)", strSubstring);
        kVar.invoke(new v(new N0.i[]{new N0.v(i9 + i8, i9 + i7), new C0476a(strSubstring, 1)}));
        return 1;
    }

    private final int q(G g4, RemoveSpaceGesture removeSpaceGesture, F f5, S0 s02) {
        throw null;
    }

    private final int r(C0053g0 c0053g0, SelectGesture selectGesture, S s7, e4.k kVar) {
        long jC = n6.d.C(c0053g0, AbstractC0968M.y(selectGesture.getSelectionArea()), G(selectGesture.getGranularity()));
        if (H.b(jC)) {
            return a.b(s.i(selectGesture), kVar);
        }
        v(jC, s7, kVar);
        return 1;
    }

    private final int s(G g4, SelectGesture selectGesture, F f5) {
        AbstractC0968M.y(selectGesture.getSelectionArea());
        G(selectGesture.getGranularity());
        throw null;
    }

    private final int t(C0053g0 c0053g0, SelectRangeGesture selectRangeGesture, S s7, e4.k kVar) {
        long jH = n6.d.h(c0053g0, AbstractC0968M.y(selectRangeGesture.getSelectionStartArea()), AbstractC0968M.y(selectRangeGesture.getSelectionEndArea()), G(selectRangeGesture.getGranularity()));
        if (H.b(jH)) {
            return a.b(s.i(selectRangeGesture), kVar);
        }
        v(jH, s7, kVar);
        return 1;
    }

    private final int u(G g4, SelectRangeGesture selectRangeGesture, F f5) {
        AbstractC0968M.y(selectRangeGesture.getSelectionStartArea());
        AbstractC0968M.y(selectRangeGesture.getSelectionEndArea());
        G(selectRangeGesture.getGranularity());
        throw null;
    }

    private final void v(long j7, S s7, e4.k kVar) {
        int i7 = H.f3092c;
        kVar.invoke(new N0.v((int) (j7 >> 32), (int) (j7 & 4294967295L)));
        if (s7 != null) {
            s7.f(true);
        }
    }

    private final void w(C0053g0 c0053g0, DeleteGesture deleteGesture, S s7) {
        if (s7 != null) {
            long jC = n6.d.C(c0053g0, AbstractC0968M.y(deleteGesture.getDeletionArea()), G(deleteGesture.getGranularity()));
            C0053g0 c0053g02 = s7.f2915d;
            if (c0053g02 != null) {
                c0053g02.e(jC);
            }
            C0053g0 c0053g03 = s7.f2915d;
            if (c0053g03 != null) {
                c0053g03.f(H.f3091b);
            }
            if (H.b(jC)) {
                return;
            }
            s7.p(false);
            s7.n(W.f1107k);
        }
    }

    private final void x(G g4, DeleteGesture deleteGesture, F f5) {
        AbstractC0968M.y(deleteGesture.getDeletionArea());
        G(deleteGesture.getGranularity());
        throw null;
    }

    private final void y(C0053g0 c0053g0, DeleteRangeGesture deleteRangeGesture, S s7) {
        if (s7 != null) {
            long jH = n6.d.h(c0053g0, AbstractC0968M.y(deleteRangeGesture.getDeletionStartArea()), AbstractC0968M.y(deleteRangeGesture.getDeletionEndArea()), G(deleteRangeGesture.getGranularity()));
            C0053g0 c0053g02 = s7.f2915d;
            if (c0053g02 != null) {
                c0053g02.e(jH);
            }
            C0053g0 c0053g03 = s7.f2915d;
            if (c0053g03 != null) {
                c0053g03.f(H.f3091b);
            }
            if (H.b(jH)) {
                return;
            }
            s7.p(false);
            s7.n(W.f1107k);
        }
    }

    private final void z(G g4, DeleteRangeGesture deleteRangeGesture, F f5) {
        AbstractC0968M.y(deleteRangeGesture.getDeletionStartArea());
        AbstractC0968M.y(deleteRangeGesture.getDeletionEndArea());
        G(deleteRangeGesture.getGranularity());
        throw null;
    }

    public final boolean A(C0053g0 c0053g0, PreviewableHandwritingGesture previewableHandwritingGesture, S s7, CancellationSignal cancellationSignal) {
        H0.E e7;
        C0214f c0214f = c0053g0.f1151j;
        if (c0214f == null) {
            return false;
        }
        N0 n0D = c0053g0.d();
        if (!c0214f.equals((n0D == null || (e7 = n0D.a.a) == null) ? null : e7.a)) {
            return false;
        }
        if (s.r(previewableHandwritingGesture)) {
            C(c0053g0, s.j(previewableHandwritingGesture), s7);
        } else if (m.r(previewableHandwritingGesture)) {
            w(c0053g0, m.g(previewableHandwritingGesture), s7);
        } else if (m.u(previewableHandwritingGesture)) {
            E(c0053g0, m.l(previewableHandwritingGesture), s7);
        } else {
            if (!m.w(previewableHandwritingGesture)) {
                return false;
            }
            y(c0053g0, m.h(previewableHandwritingGesture), s7);
        }
        if (cancellationSignal == null) {
            return true;
        }
        cancellationSignal.setOnCancelListener(new E0.g(1, s7));
        return true;
    }

    public final boolean B(G g4, PreviewableHandwritingGesture previewableHandwritingGesture, F f5, CancellationSignal cancellationSignal) {
        if (s.r(previewableHandwritingGesture)) {
            D(g4, s.j(previewableHandwritingGesture), f5);
        } else if (m.r(previewableHandwritingGesture)) {
            x(g4, m.g(previewableHandwritingGesture), f5);
        } else if (m.u(previewableHandwritingGesture)) {
            F(g4, m.l(previewableHandwritingGesture), f5);
        } else {
            if (!m.w(previewableHandwritingGesture)) {
                return false;
            }
            z(g4, m.h(previewableHandwritingGesture), f5);
        }
        if (cancellationSignal == null) {
            return true;
        }
        cancellationSignal.setOnCancelListener(new t());
        return true;
    }

    public final int i(C0053g0 c0053g0, HandwritingGesture handwritingGesture, S s7, S0 s02, e4.k kVar) {
        H0.E e7;
        C0214f c0214f = c0053g0.f1151j;
        if (c0214f == null) {
            return 3;
        }
        N0 n0D = c0053g0.d();
        if (!c0214f.equals((n0D == null || (e7 = n0D.a.a) == null) ? null : e7.a)) {
            return 3;
        }
        if (s.r(handwritingGesture)) {
            return r(c0053g0, s.j(handwritingGesture), s7, kVar);
        }
        if (m.r(handwritingGesture)) {
            return c(c0053g0, m.g(handwritingGesture), c0214f, kVar);
        }
        if (m.u(handwritingGesture)) {
            return t(c0053g0, m.l(handwritingGesture), s7, kVar);
        }
        if (m.w(handwritingGesture)) {
            return e(c0053g0, m.h(handwritingGesture), c0214f, kVar);
        }
        if (m.C(handwritingGesture)) {
            return n(c0053g0, m.j(handwritingGesture), c0214f, s02, kVar);
        }
        if (m.y(handwritingGesture)) {
            return k(c0053g0, m.i(handwritingGesture), s02, kVar);
        }
        if (m.A(handwritingGesture)) {
            return p(c0053g0, m.k(handwritingGesture), c0214f, s02, kVar);
        }
        return 2;
    }

    public final int j(G g4, HandwritingGesture handwritingGesture, F f5, S0 s02) {
        if (s.r(handwritingGesture)) {
            return s(g4, s.j(handwritingGesture), f5);
        }
        if (m.r(handwritingGesture)) {
            return d(g4, m.g(handwritingGesture), f5);
        }
        if (m.u(handwritingGesture)) {
            return u(g4, m.l(handwritingGesture), f5);
        }
        if (m.w(handwritingGesture)) {
            return f(g4, m.h(handwritingGesture), f5);
        }
        if (m.C(handwritingGesture)) {
            return o(g4, m.j(handwritingGesture), f5, s02);
        }
        if (m.y(handwritingGesture)) {
            return l(g4, m.i(handwritingGesture), f5, s02);
        }
        if (m.A(handwritingGesture)) {
            return q(g4, m.k(handwritingGesture), f5, s02);
        }
        return 2;
    }
}
