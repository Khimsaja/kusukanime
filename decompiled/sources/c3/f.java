package c3;

import B2.l;
import android.net.ConnectivityManager;
import android.net.Network;

/* loaded from: classes.dex */
public final class f extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ l a;

    public f(l lVar) {
        this.a = lVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        l.f(this.a, network, true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        l.f(this.a, network, false);
    }
}
