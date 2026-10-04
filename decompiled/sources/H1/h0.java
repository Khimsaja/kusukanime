package H1;

import B1.AbstractC0015b;
import android.os.Looper;

/* loaded from: classes.dex */
public final class h0 {
    public final g0 a;

    /* renamed from: b, reason: collision with root package name */
    public final f0 f3487b;

    /* renamed from: c, reason: collision with root package name */
    public int f3488c;

    /* renamed from: d, reason: collision with root package name */
    public Object f3489d;

    /* renamed from: e, reason: collision with root package name */
    public final Looper f3490e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3491f;

    public h0(f0 f0Var, g0 g0Var, y1.P p7, int i7, Looper looper) {
        this.f3487b = f0Var;
        this.a = g0Var;
        this.f3490e = looper;
    }

    public final synchronized void a(boolean z7) {
        notifyAll();
    }

    public final void b() {
        AbstractC0015b.h(!this.f3491f);
        this.f3491f = true;
        L l7 = (L) this.f3487b;
        synchronized (l7) {
            if (!l7.f3298N && l7.f3330t.getThread().isAlive()) {
                l7.f3328r.a(14, this).b();
                return;
            }
            AbstractC0015b.v("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            a(false);
        }
    }
}
