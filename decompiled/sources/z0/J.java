package z0;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
import c0.ViewOnAttachStateChangeListenerC0746c;
import java.util.LinkedHashMap;
import m.C1496q;

/* loaded from: classes.dex */
public final class J implements ViewTranslationCallback {
    public static final J a = new J();

    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onClearTranslation(android.view.View r15) {
        /*
            r14 = this;
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView"
            kotlin.jvm.internal.l.d(r0, r15)
            z0.u r15 = (z0.C2471u) r15
            c0.c r15 = r15.getContentCaptureManager$ui_release()
            r0 = 1
            r15.f11127q = r0
            m.q r15 = r15.c()
            java.lang.Object[] r1 = r15.f12907c
            long[] r15 = r15.a
            int r2 = r15.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L80
            r3 = 0
            r4 = r3
        L1d:
            r5 = r15[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L7b
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L37:
            if (r9 >= r7) goto L79
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.32E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L75
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            z0.M0 r10 = (z0.M0) r10
            F0.n r10 = r10.a
            F0.i r10 = r10.f2104d
            F0.t r11 = F0.q.f2150w
            java.util.LinkedHashMap r10 = r10.f2096k
            java.lang.Object r11 = r10.get(r11)
            r12 = 0
            if (r11 != 0) goto L59
            r11 = r12
        L59:
            if (r11 == 0) goto L75
            F0.t r11 = F0.h.f2081l
            java.lang.Object r10 = r10.get(r11)
            if (r10 != 0) goto L64
            goto L65
        L64:
            r12 = r10
        L65:
            F0.a r12 = (F0.a) r12
            if (r12 == 0) goto L75
            O3.e r10 = r12.f2062b
            e4.a r10 = (e4.InterfaceC0821a) r10
            if (r10 == 0) goto L75
            java.lang.Object r10 = r10.invoke()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
        L75:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L37
        L79:
            if (r7 != r8) goto L80
        L7b:
            if (r4 == r2) goto L80
            int r4 = r4 + 1
            goto L1d
        L80:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z0.J.onClearTranslation(android.view.View):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onHideTranslation(android.view.View r15) {
        /*
            r14 = this;
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView"
            kotlin.jvm.internal.l.d(r0, r15)
            z0.u r15 = (z0.C2471u) r15
            c0.c r15 = r15.getContentCaptureManager$ui_release()
            r0 = 1
            r15.f11127q = r0
            m.q r15 = r15.c()
            java.lang.Object[] r1 = r15.f12907c
            long[] r15 = r15.a
            int r2 = r15.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L88
            r3 = 0
            r4 = r3
        L1d:
            r5 = r15[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L83
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L37:
            if (r9 >= r7) goto L81
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.32E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L7d
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            z0.M0 r10 = (z0.M0) r10
            F0.n r10 = r10.a
            F0.i r10 = r10.f2104d
            F0.t r11 = F0.q.f2150w
            java.util.LinkedHashMap r10 = r10.f2096k
            java.lang.Object r11 = r10.get(r11)
            r12 = 0
            if (r11 != 0) goto L59
            r11 = r12
        L59:
            java.lang.Boolean r13 = java.lang.Boolean.TRUE
            boolean r11 = kotlin.jvm.internal.l.a(r11, r13)
            if (r11 == 0) goto L7d
            F0.t r11 = F0.h.f2080k
            java.lang.Object r10 = r10.get(r11)
            if (r10 != 0) goto L6a
            goto L6b
        L6a:
            r12 = r10
        L6b:
            F0.a r12 = (F0.a) r12
            if (r12 == 0) goto L7d
            O3.e r10 = r12.f2062b
            e4.k r10 = (e4.k) r10
            if (r10 == 0) goto L7d
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            java.lang.Object r10 = r10.invoke(r11)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
        L7d:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L37
        L81:
            if (r7 != r8) goto L88
        L83:
            if (r4 == r2) goto L88
            int r4 = r4 + 1
            goto L1d
        L88:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z0.J.onHideTranslation(android.view.View):boolean");
    }

    public final boolean onShowTranslation(View view) {
        e4.k kVar;
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView", view);
        ViewOnAttachStateChangeListenerC0746c contentCaptureManager$ui_release = ((C2471u) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.f11127q = 2;
        C1496q c1496qC = contentCaptureManager$ui_release.c();
        Object[] objArr = c1496qC.f12907c;
        long[] jArr = c1496qC.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i7 = 0;
        while (true) {
            long j7 = jArr[i7];
            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i7 - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j7) < 128) {
                        F0.i iVar = ((M0) objArr[(i7 << 3) + i9]).a.f2104d;
                        F0.t tVar = F0.q.f2150w;
                        LinkedHashMap linkedHashMap = iVar.f2096k;
                        Object obj = linkedHashMap.get(tVar);
                        if (obj == null) {
                            obj = null;
                        }
                        if (kotlin.jvm.internal.l.a(obj, Boolean.FALSE)) {
                            Object obj2 = linkedHashMap.get(F0.h.f2080k);
                            F0.a aVar = (F0.a) (obj2 != null ? obj2 : null);
                            if (aVar != null && (kVar = (e4.k) aVar.f2062b) != null) {
                            }
                        }
                    }
                    j7 >>= 8;
                }
                if (i8 != 8) {
                    return true;
                }
            }
            if (i7 == length) {
                return true;
            }
            i7++;
        }
    }
}
