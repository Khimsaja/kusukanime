package i1;

import android.R;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* renamed from: i1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1055h {
    public final View a;

    public /* synthetic */ C1055h(View view) {
        this.a = view;
    }

    public void a() {
        View view = this.a;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public void b() {
        View viewFindViewById;
        View view = this.a;
        if (view == null) {
            return;
        }
        if (view.isInEditMode() || view.onCheckIsTextEditor()) {
            view.requestFocus();
            viewFindViewById = view;
        } else {
            viewFindViewById = view.getRootView().findFocus();
        }
        if (viewFindViewById == null) {
            viewFindViewById = view.getRootView().findViewById(R.id.content);
        }
        if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
            return;
        }
        viewFindViewById.post(new B1.w(21, viewFindViewById));
    }
}
