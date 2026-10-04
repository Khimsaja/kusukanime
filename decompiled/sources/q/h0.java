package q;

import android.widget.Magnifier;
import l4.AbstractC1420H;

/* loaded from: classes.dex */
public class h0 implements f0 {
    public final Magnifier a;

    public h0(Magnifier magnifier) {
        this.a = magnifier;
    }

    @Override // q.f0
    public void a(long j7, long j8) {
        this.a.show(g0.c.d(j7), g0.c.e(j7));
    }

    public final void b() {
        this.a.dismiss();
    }

    public final long c() {
        return AbstractC1420H.a(this.a.getWidth(), this.a.getHeight());
    }

    public final void d() {
        this.a.update();
    }
}
