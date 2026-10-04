package z0;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* loaded from: classes.dex */
public final class S implements ComponentCallbacks2 {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ D0.b f18675k;

    public S(D0.b bVar) {
        this.f18675k = bVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        D0.b bVar = this.f18675k;
        synchronized (bVar) {
            bVar.a.a();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        D0.b bVar = this.f18675k;
        synchronized (bVar) {
            bVar.a.a();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i7) {
        D0.b bVar = this.f18675k;
        synchronized (bVar) {
            bVar.a.a();
        }
    }
}
