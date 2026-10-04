package K2;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import i1.C1049b;
import j1.C1303d;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class X extends C1049b {

    /* renamed from: d, reason: collision with root package name */
    public final Y f4537d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakHashMap f4538e = new WeakHashMap();

    public X(Y y7) {
        this.f4537d = y7;
    }

    @Override // i1.C1049b
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        C1049b c1049b = (C1049b) this.f4538e.get(view);
        return c1049b != null ? c1049b.a(view, accessibilityEvent) : this.a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // i1.C1049b
    public final X4.y b(View view) {
        C1049b c1049b = (C1049b) this.f4538e.get(view);
        return c1049b != null ? c1049b.b(view) : super.b(view);
    }

    @Override // i1.C1049b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        C1049b c1049b = (C1049b) this.f4538e.get(view);
        if (c1049b != null) {
            c1049b.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    @Override // i1.C1049b
    public final void d(View view, C1303d c1303d) {
        Y y7 = this.f4537d;
        boolean zH = y7.f4539d.H();
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        AccessibilityNodeInfo accessibilityNodeInfo = c1303d.a;
        if (!zH) {
            RecyclerView recyclerView = y7.f4539d;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().R(view, c1303d);
                C1049b c1049b = (C1049b) this.f4538e.get(view);
                if (c1049b != null) {
                    c1049b.d(view, c1303d);
                    return;
                } else {
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                    return;
                }
            }
        }
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
    }

    @Override // i1.C1049b
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        C1049b c1049b = (C1049b) this.f4538e.get(view);
        if (c1049b != null) {
            c1049b.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    @Override // i1.C1049b
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        C1049b c1049b = (C1049b) this.f4538e.get(viewGroup);
        return c1049b != null ? c1049b.f(viewGroup, view, accessibilityEvent) : this.a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // i1.C1049b
    public final boolean g(View view, int i7, Bundle bundle) {
        Y y7 = this.f4537d;
        if (!y7.f4539d.H()) {
            RecyclerView recyclerView = y7.f4539d;
            if (recyclerView.getLayoutManager() != null) {
                C1049b c1049b = (C1049b) this.f4538e.get(view);
                if (c1049b != null) {
                    if (c1049b.g(view, i7, bundle)) {
                        return true;
                    }
                } else if (super.g(view, i7, bundle)) {
                    return true;
                }
                N n7 = recyclerView.getLayoutManager().f4471b.f10850m;
                return false;
            }
        }
        return super.g(view, i7, bundle);
    }

    @Override // i1.C1049b
    public final void h(View view, int i7) {
        C1049b c1049b = (C1049b) this.f4538e.get(view);
        if (c1049b != null) {
            c1049b.h(view, i7);
        } else {
            super.h(view, i7);
        }
    }

    @Override // i1.C1049b
    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        C1049b c1049b = (C1049b) this.f4538e.get(view);
        if (c1049b != null) {
            c1049b.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}
