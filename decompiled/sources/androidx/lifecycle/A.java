package androidx.lifecycle;

import android.app.Activity;
import androidx.lifecycle.B;

/* loaded from: classes.dex */
public abstract class A {
    public static final void a(Activity activity, B.a aVar) {
        activity.registerActivityLifecycleCallbacks(aVar);
    }
}
