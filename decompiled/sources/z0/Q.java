package z0;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class Q implements ComponentCallbacks2 {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Configuration f18673k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ D0.a f18674l;

    public Q(Configuration configuration, D0.a aVar) {
        this.f18673k = configuration;
        this.f18674l = aVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        Configuration configuration2 = this.f18673k;
        configuration2.updateFrom(configuration);
        Iterator it = this.f18674l.a.entrySet().iterator();
        while (it.hasNext()) {
            if (((WeakReference) ((Map.Entry) it.next()).getValue()).get() != null) {
                throw new ClassCastException();
            }
            it.remove();
        }
        configuration2.setTo(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f18674l.a.clear();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i7) {
        this.f18674l.a.clear();
    }
}
