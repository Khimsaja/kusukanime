package B1;

import J1.C0286b;
import J1.C0289e;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public final class y extends BroadcastReceiver {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f366b;

    public /* synthetic */ y(int i7, Object obj) {
        this.a = i7;
        this.f366b = obj;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.a) {
            case 0:
                ((z) this.f366b).a.execute(new RunnableC0016c(2, this, context));
                break;
            default:
                if (!isInitialStickyBroadcast()) {
                    C0289e c0289e = (C0289e) this.f366b;
                    c0289e.a(C0286b.b(context, intent, c0289e.f4196i, c0289e.f4195h));
                    break;
                }
                break;
        }
    }
}
