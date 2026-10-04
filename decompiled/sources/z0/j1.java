package z0;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* loaded from: classes.dex */
public final class j1 extends ContentObserver {
    public final /* synthetic */ J5.e a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(J5.e eVar, Handler handler) {
        super(handler);
        this.a = eVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z7, Uri uri) {
        this.a.mo2trySendJP2dKIU(O3.C.a);
    }
}
