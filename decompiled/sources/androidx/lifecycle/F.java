package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Landroidx/lifecycle/F;", "Landroid/app/Fragment;", "<init>", "()V", "androidx/lifecycle/U", "a", "androidx/lifecycle/D", "lifecycle-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public class F extends Fragment {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f10705l = 0;

    /* renamed from: k, reason: collision with root package name */
    public U f10706k;

    public static final class a implements Application.ActivityLifecycleCallbacks {
        public static final E Companion = new E();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            kotlin.jvm.internal.l.f("activity", activity);
            activity.registerActivityLifecycleCallbacks(new a());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            kotlin.jvm.internal.l.f("activity", activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            kotlin.jvm.internal.l.f("activity", activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            kotlin.jvm.internal.l.f("activity", activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            kotlin.jvm.internal.l.f("activity", activity);
            int i7 = F.f10705l;
            D.a(activity, EnumC0688o.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            kotlin.jvm.internal.l.f("activity", activity);
            int i7 = F.f10705l;
            D.a(activity, EnumC0688o.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            kotlin.jvm.internal.l.f("activity", activity);
            int i7 = F.f10705l;
            D.a(activity, EnumC0688o.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            kotlin.jvm.internal.l.f("activity", activity);
            int i7 = F.f10705l;
            D.a(activity, EnumC0688o.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            kotlin.jvm.internal.l.f("activity", activity);
            int i7 = F.f10705l;
            D.a(activity, EnumC0688o.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            kotlin.jvm.internal.l.f("activity", activity);
            int i7 = F.f10705l;
            D.a(activity, EnumC0688o.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            kotlin.jvm.internal.l.f("activity", activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            kotlin.jvm.internal.l.f("activity", activity);
            kotlin.jvm.internal.l.f("bundle", bundle);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            kotlin.jvm.internal.l.f("activity", activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            kotlin.jvm.internal.l.f("activity", activity);
        }
    }

    public final void a(EnumC0688o enumC0688o) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            kotlin.jvm.internal.l.e("getActivity(...)", activity);
            D.a(activity, enumC0688o);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(EnumC0688o.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(EnumC0688o.ON_DESTROY);
        this.f10706k = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(EnumC0688o.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        U u5 = this.f10706k;
        if (u5 != null) {
            ((C) u5.a).c();
        }
        a(EnumC0688o.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        U u5 = this.f10706k;
        if (u5 != null) {
            C c2 = (C) u5.a;
            int i7 = c2.f10697k + 1;
            c2.f10697k = i7;
            if (i7 == 1 && c2.f10700n) {
                c2.f10702p.f(EnumC0688o.ON_START);
                c2.f10700n = false;
            }
        }
        a(EnumC0688o.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(EnumC0688o.ON_STOP);
    }
}
