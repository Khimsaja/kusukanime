package K2;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: K2.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0318w extends AbstractC0319x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4690d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0318w(H h7, int i7) {
        super(h7);
        this.f4690d = i7;
    }

    @Override // K2.AbstractC0319x
    public final int b(View view) {
        switch (this.f4690d) {
            case 0:
                I i7 = (I) view.getLayoutParams();
                ((H) this.f4691b).getClass();
                return view.getRight() + ((I) view.getLayoutParams()).f4484b.right + ((ViewGroup.MarginLayoutParams) i7).rightMargin;
            default:
                I i8 = (I) view.getLayoutParams();
                ((H) this.f4691b).getClass();
                return view.getBottom() + ((I) view.getLayoutParams()).f4484b.bottom + ((ViewGroup.MarginLayoutParams) i8).bottomMargin;
        }
    }

    @Override // K2.AbstractC0319x
    public final int c(View view) {
        switch (this.f4690d) {
            case 0:
                I i7 = (I) view.getLayoutParams();
                ((H) this.f4691b).getClass();
                Rect rect = ((I) view.getLayoutParams()).f4484b;
                return view.getMeasuredWidth() + rect.left + rect.right + ((ViewGroup.MarginLayoutParams) i7).leftMargin + ((ViewGroup.MarginLayoutParams) i7).rightMargin;
            default:
                I i8 = (I) view.getLayoutParams();
                ((H) this.f4691b).getClass();
                Rect rect2 = ((I) view.getLayoutParams()).f4484b;
                return view.getMeasuredHeight() + rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) i8).topMargin + ((ViewGroup.MarginLayoutParams) i8).bottomMargin;
        }
    }

    @Override // K2.AbstractC0319x
    public final int d(View view) {
        switch (this.f4690d) {
            case 0:
                I i7 = (I) view.getLayoutParams();
                ((H) this.f4691b).getClass();
                Rect rect = ((I) view.getLayoutParams()).f4484b;
                return view.getMeasuredHeight() + rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) i7).topMargin + ((ViewGroup.MarginLayoutParams) i7).bottomMargin;
            default:
                I i8 = (I) view.getLayoutParams();
                ((H) this.f4691b).getClass();
                Rect rect2 = ((I) view.getLayoutParams()).f4484b;
                return view.getMeasuredWidth() + rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) i8).leftMargin + ((ViewGroup.MarginLayoutParams) i8).rightMargin;
        }
    }

    @Override // K2.AbstractC0319x
    public final int e(View view) {
        switch (this.f4690d) {
            case 0:
                I i7 = (I) view.getLayoutParams();
                ((H) this.f4691b).getClass();
                return (view.getLeft() - ((I) view.getLayoutParams()).f4484b.left) - ((ViewGroup.MarginLayoutParams) i7).leftMargin;
            default:
                I i8 = (I) view.getLayoutParams();
                ((H) this.f4691b).getClass();
                return (view.getTop() - ((I) view.getLayoutParams()).f4484b.top) - ((ViewGroup.MarginLayoutParams) i8).topMargin;
        }
    }

    @Override // K2.AbstractC0319x
    public final int f() {
        switch (this.f4690d) {
            case 0:
                return ((H) this.f4691b).f4482m;
            default:
                return ((H) this.f4691b).f4483n;
        }
    }

    @Override // K2.AbstractC0319x
    public final int g() {
        switch (this.f4690d) {
            case 0:
                H h7 = (H) this.f4691b;
                return h7.f4482m - h7.A();
            default:
                H h8 = (H) this.f4691b;
                return h8.f4483n - h8.y();
        }
    }

    @Override // K2.AbstractC0319x
    public final int h() {
        switch (this.f4690d) {
            case 0:
                return ((H) this.f4691b).A();
            default:
                return ((H) this.f4691b).y();
        }
    }

    @Override // K2.AbstractC0319x
    public final int i() {
        switch (this.f4690d) {
            case 0:
                return ((H) this.f4691b).f4480k;
            default:
                return ((H) this.f4691b).f4481l;
        }
    }

    @Override // K2.AbstractC0319x
    public final int j() {
        switch (this.f4690d) {
            case 0:
                return ((H) this.f4691b).f4481l;
            default:
                return ((H) this.f4691b).f4480k;
        }
    }

    @Override // K2.AbstractC0319x
    public final int k() {
        switch (this.f4690d) {
            case 0:
                return ((H) this.f4691b).z();
            default:
                return ((H) this.f4691b).B();
        }
    }

    @Override // K2.AbstractC0319x
    public final int l() {
        switch (this.f4690d) {
            case 0:
                H h7 = (H) this.f4691b;
                return (h7.f4482m - h7.z()) - h7.A();
            default:
                H h8 = (H) this.f4691b;
                return (h8.f4483n - h8.B()) - h8.y();
        }
    }

    @Override // K2.AbstractC0319x
    public final int m(View view) {
        switch (this.f4690d) {
            case 0:
                H h7 = (H) this.f4691b;
                Rect rect = (Rect) this.f4692c;
                h7.F(view, rect);
                return rect.right;
            default:
                H h8 = (H) this.f4691b;
                Rect rect2 = (Rect) this.f4692c;
                h8.F(view, rect2);
                return rect2.bottom;
        }
    }

    @Override // K2.AbstractC0319x
    public final int n(View view) {
        switch (this.f4690d) {
            case 0:
                H h7 = (H) this.f4691b;
                Rect rect = (Rect) this.f4692c;
                h7.F(view, rect);
                return rect.left;
            default:
                H h8 = (H) this.f4691b;
                Rect rect2 = (Rect) this.f4692c;
                h8.F(view, rect2);
                return rect2.top;
        }
    }

    @Override // K2.AbstractC0319x
    public final void o(int i7) {
        switch (this.f4690d) {
            case 0:
                ((H) this.f4691b).J(i7);
                break;
            default:
                ((H) this.f4691b).K(i7);
                break;
        }
    }
}
