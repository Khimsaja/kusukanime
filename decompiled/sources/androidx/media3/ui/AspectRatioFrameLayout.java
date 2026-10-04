package androidx.media3.ui;

import F2.F;
import F2.InterfaceC0145a;
import F2.RunnableC0146b;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public final class AspectRatioFrameLayout extends FrameLayout {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f10757n = 0;

    /* renamed from: k, reason: collision with root package name */
    public final RunnableC0146b f10758k;

    /* renamed from: l, reason: collision with root package name */
    public float f10759l;

    /* renamed from: m, reason: collision with root package name */
    public int f10760m;

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10760m = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, F.a, 0, 0);
            try {
                this.f10760m = typedArrayObtainStyledAttributes.getInt(0, 0);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        this.f10758k = new RunnableC0146b(this);
    }

    public int getResizeMode() {
        return this.f10760m;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i8) {
        float f5;
        float f7;
        super.onMeasure(i7, i8);
        if (this.f10759l <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f8 = measuredWidth;
        float f9 = measuredHeight;
        float f10 = (this.f10759l / (f8 / f9)) - 1.0f;
        float fAbs = Math.abs(f10);
        RunnableC0146b runnableC0146b = this.f10758k;
        if (fAbs <= 0.01f) {
            if (runnableC0146b.f2309k) {
                return;
            }
            runnableC0146b.f2309k = true;
            runnableC0146b.f2310l.post(runnableC0146b);
            return;
        }
        int i9 = this.f10760m;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 == 2) {
                    f5 = this.f10759l;
                } else if (i9 == 4) {
                    if (f10 > 0.0f) {
                        f5 = this.f10759l;
                    } else {
                        f7 = this.f10759l;
                    }
                }
                measuredWidth = (int) (f9 * f5);
            } else {
                f7 = this.f10759l;
            }
            measuredHeight = (int) (f8 / f7);
        } else if (f10 > 0.0f) {
            f7 = this.f10759l;
            measuredHeight = (int) (f8 / f7);
        } else {
            f5 = this.f10759l;
            measuredWidth = (int) (f9 * f5);
        }
        if (!runnableC0146b.f2309k) {
            runnableC0146b.f2309k = true;
            runnableC0146b.f2310l.post(runnableC0146b);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setAspectRatio(float f5) {
        if (this.f10759l != f5) {
            this.f10759l = f5;
            requestLayout();
        }
    }

    public void setResizeMode(int i7) {
        if (this.f10760m != i7) {
            this.f10760m = i7;
            requestLayout();
        }
    }

    public void setAspectRatioListener(InterfaceC0145a interfaceC0145a) {
    }
}
