package X0;

import O.C0525y;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

/* loaded from: classes.dex */
public abstract class k {
    public static final C0525y a = new C0525y(c.f9702n);

    /* JADX WARN: Removed duplicated region for block: B:104:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0181 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x022a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(X0.y r24, e4.InterfaceC0821a r25, X0.z r26, W.a r27, O.C0510p r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X0.k.a(X0.y, e4.a, X0.z, W.a, O.p, int, int):void");
    }

    public static final boolean b(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }
}
