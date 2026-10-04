package z0;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
import h0.AbstractC0968M;

/* renamed from: z0.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2445g0 implements InterfaceC2443f0 {

    /* renamed from: k, reason: collision with root package name */
    public final Matrix f18754k = new Matrix();

    /* renamed from: l, reason: collision with root package name */
    public final int[] f18755l = new int[2];

    @Override // z0.InterfaceC2443f0
    public void b(View view, float[] fArr) {
        Matrix matrix = this.f18754k;
        matrix.reset();
        view.transformMatrixToGlobal(matrix);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        int[] iArr = this.f18755l;
        view.getLocationOnScreen(iArr);
        int i7 = iArr[0];
        int i8 = iArr[1];
        view.getLocationInWindow(iArr);
        matrix.postTranslate(iArr[0] - i7, iArr[1] - i8);
        AbstractC0968M.r(matrix, fArr);
    }
}
