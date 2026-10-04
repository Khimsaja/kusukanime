package z0;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import com.kusukanime.R;
import h0.AbstractC0982e;
import h0.InterfaceC0995r;

/* renamed from: z0.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2466r0 extends ViewGroup {

    /* renamed from: k, reason: collision with root package name */
    public boolean f18832k;

    public C2466r0(Context context) {
        super(context);
        setClipChildren(false);
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    public final void a(InterfaceC0995r interfaceC0995r, U0 u02, long j7) {
        super.drawChild(AbstractC0982e.a(interfaceC0995r), u02, j7);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        int childCount = super.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer", childAt);
            if (((U0) childAt).f18694r) {
                this.f18832k = true;
                try {
                    super.dispatchDraw(canvas);
                    return;
                } finally {
                    this.f18832k = false;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        if (this.f18832k) {
            return super.getChildCount();
        }
        return 0;
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
    }
}
