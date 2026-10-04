package androidx.lifecycle;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import androidx.lifecycle.F;

/* loaded from: classes.dex */
public abstract class D {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, EnumC0688o enumC0688o) {
        kotlin.jvm.internal.l.f("event", enumC0688o);
        if (activity instanceof InterfaceC0694v) {
            AbstractC0690q abstractC0690qF = ((InterfaceC0694v) activity).f();
            if (abstractC0690qF instanceof x) {
                ((x) abstractC0690qF).f(enumC0688o);
            }
        }
    }

    public static void b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            F.a.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new F.a());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new F(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
