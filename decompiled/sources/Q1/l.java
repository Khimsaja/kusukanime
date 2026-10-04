package Q1;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import j3.W;

/* loaded from: classes.dex */
public final class l implements Spatializer$OnSpatializerStateChangedListener {
    public final /* synthetic */ q a;

    public l(q qVar) {
        this.a = qVar;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z7) {
        q qVar = this.a;
        W w7 = q.f7931i;
        qVar.d();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z7) {
        q qVar = this.a;
        W w7 = q.f7931i;
        qVar.d();
    }
}
