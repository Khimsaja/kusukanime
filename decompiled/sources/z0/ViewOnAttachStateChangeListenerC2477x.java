package z0;

import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import com.kusukanime.R;
import java.util.Iterator;

/* renamed from: z0.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC2477x implements View.OnAttachStateChangeListener {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f18941k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f18942l;

    public /* synthetic */ ViewOnAttachStateChangeListenerC2477x(int i7, Object obj) {
        this.f18941k = i7;
        this.f18942l = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.f18941k) {
            case 0:
                F f5 = (F) this.f18942l;
                AccessibilityManager accessibilityManager = f5.f18603g;
                accessibilityManager.addAccessibilityStateChangeListener(f5.f18605i);
                accessibilityManager.addTouchExplorationStateChangeListener(f5.f18606j);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean z7;
        switch (this.f18941k) {
            case 0:
                F f5 = (F) this.f18942l;
                f5.f18608l.removeCallbacks(f5.f18597K);
                AccessibilityManager accessibilityManager = f5.f18603g;
                accessibilityManager.removeAccessibilityStateChangeListener(f5.f18605i);
                accessibilityManager.removeTouchExplorationStateChangeListener(f5.f18606j);
                break;
            case 1:
                AbstractC2432a abstractC2432a = (AbstractC2432a) this.f18942l;
                kotlin.jvm.internal.l.f("<this>", abstractC2432a);
                Iterator it = y5.k.S(i1.x.f11989k, abstractC2432a.getParent()).iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object obj = (ViewParent) it.next();
                        if (obj instanceof View) {
                            View view2 = (View) obj;
                            kotlin.jvm.internal.l.f("<this>", view2);
                            Object tag = view2.getTag(R.id.is_pooling_container_tag);
                            Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                            if (bool != null ? bool.booleanValue() : false) {
                                z7 = true;
                            }
                        }
                    }
                }
                if (!z7) {
                    abstractC2432a.e();
                    break;
                }
                break;
            default:
                view.removeOnAttachStateChangeListener(this);
                ((H5.u0) this.f18942l).e(null);
                break;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }
}
