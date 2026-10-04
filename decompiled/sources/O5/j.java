package O5;

import H5.D;

/* loaded from: classes.dex */
public final class j extends i {

    /* renamed from: m, reason: collision with root package name */
    public final Runnable f7629m;

    public j(Runnable runnable, long j7, boolean z7) {
        super(j7, z7);
        this.f7629m = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7629m.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f7629m;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(D.p(runnable));
        sb.append(", ");
        sb.append(this.f7627k);
        sb.append(", ");
        return A6.b.j(sb, this.f7628l ? "Blocking" : "Non-blocking", ']');
    }
}
