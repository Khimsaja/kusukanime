package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* loaded from: classes.dex */
public final class B extends AbstractC0682i {
    final /* synthetic */ C this$0;

    public static final class a extends AbstractC0682i {
        final /* synthetic */ C this$0;

        public a(C c2) {
            this.this$0 = c2;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            kotlin.jvm.internal.l.f("activity", activity);
            this.this$0.c();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            kotlin.jvm.internal.l.f("activity", activity);
            C c2 = this.this$0;
            int i7 = c2.f10697k + 1;
            c2.f10697k = i7;
            if (i7 == 1 && c2.f10700n) {
                c2.f10702p.f(EnumC0688o.ON_START);
                c2.f10700n = false;
            }
        }
    }

    public B(C c2) {
        this.this$0 = c2;
    }

    @Override // androidx.lifecycle.AbstractC0682i, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.l.f("activity", activity);
        if (Build.VERSION.SDK_INT < 29) {
            int i7 = F.f10705l;
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.lifecycle.ReportFragment", fragmentFindFragmentByTag);
            ((F) fragmentFindFragmentByTag).f10706k = this.this$0.f10704r;
        }
    }

    @Override // androidx.lifecycle.AbstractC0682i, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        kotlin.jvm.internal.l.f("activity", activity);
        C c2 = this.this$0;
        int i7 = c2.f10698l - 1;
        c2.f10698l = i7;
        if (i7 == 0) {
            Handler handler = c2.f10701o;
            kotlin.jvm.internal.l.c(handler);
            handler.postDelayed(c2.f10703q, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.l.f("activity", activity);
        A.a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.AbstractC0682i, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        kotlin.jvm.internal.l.f("activity", activity);
        C c2 = this.this$0;
        int i7 = c2.f10697k - 1;
        c2.f10697k = i7;
        if (i7 == 0 && c2.f10699m) {
            c2.f10702p.f(EnumC0688o.ON_STOP);
            c2.f10700n = true;
        }
    }
}
