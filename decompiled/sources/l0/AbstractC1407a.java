package l0;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import h0.AbstractC0982e;
import h0.InterfaceC0995r;

/* renamed from: l0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1407a extends ViewGroup {
    public final void a(InterfaceC0995r interfaceC0995r, View view, long j7) {
        super.drawChild(AbstractC0982e.a(interfaceC0995r), view, j7);
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
    }
}
