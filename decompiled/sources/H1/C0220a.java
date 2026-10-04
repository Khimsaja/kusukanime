package H1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: H1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0220a extends BroadcastReceiver {
    public final D a;

    /* renamed from: b, reason: collision with root package name */
    public final B1.F f3400b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0221b f3401c;

    public C0220a(C0221b c0221b, B1.F f5, D d4) {
        this.f3401c = c0221b;
        this.f3400b = f5;
        this.a = d4;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f3400b.c(new B1.w(5, this));
        }
    }
}
