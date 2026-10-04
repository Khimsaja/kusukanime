package K2;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class I extends ViewGroup.MarginLayoutParams {
    public W a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f4484b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4485c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4486d;

    public I(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4484b = new Rect();
        this.f4485c = true;
        this.f4486d = false;
    }

    public I(int i7, int i8) {
        super(i7, i8);
        this.f4484b = new Rect();
        this.f4485c = true;
        this.f4486d = false;
    }

    public I(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f4484b = new Rect();
        this.f4485c = true;
        this.f4486d = false;
    }

    public I(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f4484b = new Rect();
        this.f4485c = true;
        this.f4486d = false;
    }

    public I(I i7) {
        super((ViewGroup.LayoutParams) i7);
        this.f4484b = new Rect();
        this.f4485c = true;
        this.f4486d = false;
    }
}
