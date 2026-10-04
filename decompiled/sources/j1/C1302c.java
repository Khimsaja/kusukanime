package j1;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import c.AbstractC0739a;
import io.ktor.utils.io.ByteChannelKt;

/* renamed from: j1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1302c {

    /* renamed from: c, reason: collision with root package name */
    public static final C1302c f12213c;

    /* renamed from: d, reason: collision with root package name */
    public static final C1302c f12214d;

    /* renamed from: e, reason: collision with root package name */
    public static final C1302c f12215e;

    /* renamed from: f, reason: collision with root package name */
    public static final C1302c f12216f;

    /* renamed from: g, reason: collision with root package name */
    public static final C1302c f12217g;

    /* renamed from: h, reason: collision with root package name */
    public static final C1302c f12218h;

    /* renamed from: i, reason: collision with root package name */
    public static final C1302c f12219i;

    /* renamed from: j, reason: collision with root package name */
    public static final C1302c f12220j;
    public final Object a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12221b;

    static {
        new C1302c(null, 1, null, null);
        new C1302c(null, 2, null, null);
        new C1302c(null, 4, null, null);
        new C1302c(null, 8, null, null);
        new C1302c(null, 16, null, null);
        new C1302c(null, 32, null, null);
        f12213c = new C1302c(null, 64, null, null);
        f12214d = new C1302c(null, 128, null, null);
        new C1302c(null, 256, null, AbstractC1306g.class);
        new C1302c(null, 512, null, AbstractC1306g.class);
        new C1302c(null, 1024, null, AbstractC1307h.class);
        new C1302c(null, 2048, null, AbstractC1307h.class);
        f12215e = new C1302c(null, 4096, null, null);
        f12216f = new C1302c(null, 8192, null, null);
        new C1302c(null, 16384, null, null);
        new C1302c(null, 32768, null, null);
        new C1302c(null, 65536, null, null);
        new C1302c(null, 131072, null, AbstractC1311l.class);
        new C1302c(null, 262144, null, null);
        new C1302c(null, 524288, null, null);
        new C1302c(null, ByteChannelKt.CHANNEL_MAX_SIZE, null, null);
        new C1302c(null, 2097152, null, AbstractC1312m.class);
        int i7 = Build.VERSION.SDK_INT;
        new C1302c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null);
        new C1302c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, AbstractC1309j.class);
        f12217g = new C1302c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null);
        f12218h = new C1302c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null);
        f12219i = new C1302c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null);
        f12220j = new C1302c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null);
        new C1302c(i7 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null);
        new C1302c(i7 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null);
        new C1302c(i7 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null);
        new C1302c(i7 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null);
        new C1302c(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null);
        new C1302c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, AbstractC1310k.class);
        new C1302c(i7 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, AbstractC1308i.class);
        new C1302c(i7 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null);
        new C1302c(i7 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null);
        new C1302c(i7 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null);
        new C1302c(i7 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null);
        new C1302c(i7 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null);
        new C1302c(i7 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null);
        new C1302c(i7 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null);
        new C1302c(i7 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null);
        new C1302c(i7 >= 34 ? AbstractC0739a.a() : null, R.id.accessibilityActionScrollInDirection, null, null);
    }

    public C1302c(int i7, String str) {
        this(null, i7, str, null);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C1302c)) {
            return false;
        }
        Object obj2 = ((C1302c) obj).a;
        Object obj3 = this.a;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String strD = C1303d.d(this.f12221b);
        if (strD.equals("ACTION_UNKNOWN")) {
            Object obj = this.a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                strD = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(strD);
        return sb.toString();
    }

    public C1302c(Object obj, int i7, String str, Class cls) {
        this.f12221b = i7;
        if (obj == null) {
            this.a = new AccessibilityNodeInfo.AccessibilityAction(i7, str);
        } else {
            this.a = obj;
        }
    }
}
