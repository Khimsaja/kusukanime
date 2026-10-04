package F2;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;

/* renamed from: F2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnLayoutChangeListenerC0151g implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2362b;

    public /* synthetic */ ViewOnLayoutChangeListenerC0151g(int i7, Object obj) {
        this.a = i7;
        this.f2362b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
        int height;
        int height2;
        switch (this.a) {
            case 0:
                C0163t c0163t = (C0163t) this.f2362b;
                c0163t.getClass();
                int i15 = i10 - i8;
                int i16 = i14 - i12;
                if (i9 - i7 != i13 - i11 || i15 != i16) {
                    PopupWindow popupWindow = c0163t.f2448u;
                    if (popupWindow.isShowing()) {
                        c0163t.q();
                        int width = c0163t.getWidth() - popupWindow.getWidth();
                        int i17 = c0163t.f2450v;
                        popupWindow.update(view, width - i17, (-popupWindow.getHeight()) - i17, -1, -1);
                        break;
                    }
                }
                break;
            default:
                y yVar = (y) this.f2362b;
                C0163t c0163t2 = yVar.a;
                int width2 = (c0163t2.getWidth() - c0163t2.getPaddingLeft()) - c0163t2.getPaddingRight();
                int height3 = (c0163t2.getHeight() - c0163t2.getPaddingBottom()) - c0163t2.getPaddingTop();
                ViewGroup viewGroup = yVar.f2469c;
                int iC = y.c(viewGroup) - (viewGroup != null ? viewGroup.getPaddingRight() + viewGroup.getPaddingLeft() : 0);
                if (viewGroup == null) {
                    height = 0;
                } else {
                    height = viewGroup.getHeight();
                    ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        height += marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                    }
                }
                int paddingBottom = height - (viewGroup != null ? viewGroup.getPaddingBottom() + viewGroup.getPaddingTop() : 0);
                int iMax = Math.max(iC, y.c(yVar.f2477k) + y.c(yVar.f2475i));
                ViewGroup viewGroup2 = yVar.f2470d;
                if (viewGroup2 == null) {
                    height2 = 0;
                } else {
                    height2 = viewGroup2.getHeight();
                    ViewGroup.LayoutParams layoutParams2 = viewGroup2.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                        height2 += marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
                    }
                }
                boolean z7 = width2 <= iMax || height3 <= (height2 * 2) + paddingBottom;
                if (yVar.f2465A != z7) {
                    yVar.f2465A = z7;
                    view.post(new u(yVar, 1));
                }
                boolean z8 = i9 - i7 != i13 - i11;
                if (!yVar.f2465A && z8) {
                    view.post(new u(yVar, 2));
                    break;
                }
                break;
        }
    }
}
