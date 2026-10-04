package K2;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class F {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ H f4467b;

    public /* synthetic */ F(H h7, int i7) {
        this.a = i7;
        this.f4467b = h7;
    }

    public final int a(View view) {
        switch (this.a) {
            case 0:
                I i7 = (I) view.getLayoutParams();
                this.f4467b.getClass();
                return view.getRight() + ((I) view.getLayoutParams()).f4484b.right + ((ViewGroup.MarginLayoutParams) i7).rightMargin;
            default:
                I i8 = (I) view.getLayoutParams();
                this.f4467b.getClass();
                return view.getBottom() + ((I) view.getLayoutParams()).f4484b.bottom + ((ViewGroup.MarginLayoutParams) i8).bottomMargin;
        }
    }

    public final int b(View view) {
        switch (this.a) {
            case 0:
                I i7 = (I) view.getLayoutParams();
                this.f4467b.getClass();
                return (view.getLeft() - ((I) view.getLayoutParams()).f4484b.left) - ((ViewGroup.MarginLayoutParams) i7).leftMargin;
            default:
                I i8 = (I) view.getLayoutParams();
                this.f4467b.getClass();
                return (view.getTop() - ((I) view.getLayoutParams()).f4484b.top) - ((ViewGroup.MarginLayoutParams) i8).topMargin;
        }
    }

    public final int c() {
        switch (this.a) {
            case 0:
                H h7 = this.f4467b;
                return h7.f4482m - h7.A();
            default:
                H h8 = this.f4467b;
                return h8.f4483n - h8.y();
        }
    }

    public final int d() {
        switch (this.a) {
            case 0:
                return this.f4467b.z();
            default:
                return this.f4467b.B();
        }
    }
}
