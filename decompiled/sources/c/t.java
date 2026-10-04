package c;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* loaded from: classes.dex */
public final class t implements OnBackAnimationCallback {
    public final /* synthetic */ r a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f11099b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f11100c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s f11101d;

    public t(r rVar, r rVar2, s sVar, s sVar2) {
        this.a = rVar;
        this.f11099b = rVar2;
        this.f11100c = sVar;
        this.f11101d = sVar2;
    }

    public final void onBackCancelled() {
        this.f11101d.invoke();
    }

    public final void onBackInvoked() {
        this.f11100c.invoke();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        kotlin.jvm.internal.l.f("backEvent", backEvent);
        this.f11099b.invoke(new C0740b(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        kotlin.jvm.internal.l.f("backEvent", backEvent);
        this.a.invoke(new C0740b(backEvent));
    }
}
