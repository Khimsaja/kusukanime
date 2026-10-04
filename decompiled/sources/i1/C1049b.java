package i1;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.kusukanime.R;
import j1.C1302c;
import j1.C1303d;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* renamed from: i1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1049b {

    /* renamed from: c, reason: collision with root package name */
    public static final View.AccessibilityDelegate f11967c = new View.AccessibilityDelegate();
    public final View.AccessibilityDelegate a;

    /* renamed from: b, reason: collision with root package name */
    public final C1048a f11968b;

    public C1049b() {
        this(f11967c);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public X4.y b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new X4.y(17, accessibilityNodeProvider);
        }
        return null;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, C1303d c1303d) {
        this.a.onInitializeAccessibilityNodeInfo(view, c1303d.a);
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean g(View view, int i7, Bundle bundle) {
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        for (int i8 = 0; i8 < list.size() && ((AccessibilityNodeInfo.AccessibilityAction) ((C1302c) list.get(i8)).a).getId() != i7; i8++) {
        }
        boolean zPerformAccessibilityAction = this.a.performAccessibilityAction(view, i7, bundle);
        if (zPerformAccessibilityAction || i7 != R.id.accessibility_action_clickable_span || bundle == null) {
            return zPerformAccessibilityAction;
        }
        int i9 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i9)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            for (int i10 = 0; clickableSpanArr != null && i10 < clickableSpanArr.length; i10++) {
                if (clickableSpan.equals(clickableSpanArr[i10])) {
                    clickableSpan.onClick(view);
                    return true;
                }
            }
        }
        return false;
    }

    public void h(View view, int i7) {
        this.a.sendAccessibilityEvent(view, i7);
    }

    public void i(View view, AccessibilityEvent accessibilityEvent) {
        this.a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C1049b(View.AccessibilityDelegate accessibilityDelegate) {
        this.a = accessibilityDelegate;
        this.f11968b = new C1048a(this);
    }
}
