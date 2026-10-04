package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleInitializer;", "LN2/b;", "Landroidx/lifecycle/v;", "<init>", "()V", "lifecycle-process_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements N2.b {
    @Override // N2.b
    public final Object create(Context context) {
        kotlin.jvm.internal.l.f("context", context);
        N2.a aVarC = N2.a.c(context);
        kotlin.jvm.internal.l.e("getInstance(...)", aVarC);
        if (!aVarC.f6927b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!AbstractC0691s.a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type android.app.Application", applicationContext);
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new r());
        }
        C c2 = C.f10696s;
        c2.getClass();
        c2.f10701o = new Handler();
        c2.f10702p.f(EnumC0688o.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type android.app.Application", applicationContext2);
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new B(c2));
        return c2;
    }

    @Override // N2.b
    public final List dependencies() {
        return P3.y.f7779k;
    }
}
