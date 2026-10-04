package z0;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import f6.AbstractC0905c;
import java.util.HashMap;
import y0.C2349D;

/* renamed from: z0.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2441e0 extends ViewGroup {

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f18749k;

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f18750l;

    public C2441e0(Context context) {
        super(context);
        setClipChildren(false);
        this.f18749k = new HashMap();
        this.f18750l = new HashMap();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final HashMap<W0.i, C2349D> getHolderToLayoutNode() {
        return this.f18749k;
    }

    public final HashMap<C2349D, W0.i> getLayoutNodeToHolder() {
        return this.f18750l;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        for (W0.i iVar : this.f18749k.keySet()) {
            iVar.layout(iVar.getLeft(), iVar.getTop(), iVar.getRight(), iVar.getBottom());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        int i9;
        if (!(View.MeasureSpec.getMode(i7) == 1073741824)) {
            AbstractC0905c.B("widthMeasureSpec should be EXACTLY");
            throw null;
        }
        if (!(View.MeasureSpec.getMode(i8) == 1073741824)) {
            AbstractC0905c.B("heightMeasureSpec should be EXACTLY");
            throw null;
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i7), View.MeasureSpec.getSize(i8));
        for (W0.i iVar : this.f18749k.keySet()) {
            int i10 = iVar.f9539B;
            if (i10 != Integer.MIN_VALUE && (i9 = iVar.f9540C) != Integer.MIN_VALUE) {
                iVar.measure(i10, i9);
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            C2349D c2349d = (C2349D) this.f18749k.get(childAt);
            if (childAt.isLayoutRequested() && c2349d != null) {
                C2349D.T(c2349d, false, 7);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
    }
}
