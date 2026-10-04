package g1;

import android.os.Process;

/* loaded from: classes.dex */
public final class j extends Thread {

    /* renamed from: k, reason: collision with root package name */
    public final int f11690k;

    public j(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f11690k = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(this.f11690k);
        super.run();
    }
}
