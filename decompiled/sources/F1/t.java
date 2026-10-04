package F1;

import android.os.ConditionVariable;

/* loaded from: classes.dex */
public final class t extends Thread {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ ConditionVariable f2213k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ u f2214l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, ConditionVariable conditionVariable) {
        super("ExoPlayer:SimpleCacheInit");
        this.f2214l = uVar;
        this.f2213k = conditionVariable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        synchronized (this.f2214l) {
            this.f2213k.open();
            u.a(this.f2214l);
            this.f2214l.f2216b.getClass();
        }
    }
}
