package y;

import O.w0;
import android.view.Choreographer;
import android.view.View;

/* renamed from: y.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC2320a implements InterfaceC2317Q, w0, Runnable, Choreographer.FrameCallback {

    /* renamed from: q, reason: collision with root package name */
    public static long f17608q;

    /* renamed from: k, reason: collision with root package name */
    public final View f17609k;

    /* renamed from: m, reason: collision with root package name */
    public boolean f17611m;

    /* renamed from: o, reason: collision with root package name */
    public boolean f17613o;

    /* renamed from: p, reason: collision with root package name */
    public long f17614p;

    /* renamed from: l, reason: collision with root package name */
    public final Q.d f17610l = new Q.d(new C2316P[16]);

    /* renamed from: n, reason: collision with root package name */
    public final Choreographer f17612n = Choreographer.getInstance();

    /* JADX WARN: Removed duplicated region for block: B:10:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public RunnableC2320a(android.view.View r5) {
        /*
            r4 = this;
            r4.<init>()
            r4.f17609k = r5
            Q.d r0 = new Q.d
            r1 = 16
            y.P[] r1 = new y.C2316P[r1]
            r0.<init>(r1)
            r4.f17610l = r0
            android.view.Choreographer r0 = android.view.Choreographer.getInstance()
            r4.f17612n = r0
            long r0 = y.RunnableC2320a.f17608q
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L3f
            android.view.Display r0 = r5.getDisplay()
            boolean r5 = r5.isInEditMode()
            if (r5 != 0) goto L35
            if (r0 == 0) goto L35
            float r5 = r0.getRefreshRate()
            r0 = 1106247680(0x41f00000, float:30.0)
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 < 0) goto L35
            goto L37
        L35:
            r5 = 1114636288(0x42700000, float:60.0)
        L37:
            r0 = 1000000000(0x3b9aca00, float:0.0047237873)
            float r0 = (float) r0
            float r0 = r0 / r5
            long r0 = (long) r0
            y.RunnableC2320a.f17608q = r0
        L3f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y.RunnableC2320a.<init>(android.view.View):void");
    }

    @Override // O.w0
    public final void a() {
        this.f17613o = true;
    }

    @Override // y.InterfaceC2317Q
    public final void c(C2316P c2316p) {
        this.f17610l.b(c2316p);
        if (this.f17611m) {
            return;
        }
        this.f17611m = true;
        this.f17609k.post(this);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j7) {
        if (this.f17613o) {
            this.f17614p = j7;
            this.f17609k.post(this);
        }
    }

    @Override // O.w0
    public final void e() {
        this.f17613o = false;
        this.f17609k.removeCallbacks(this);
        this.f17612n.removeFrameCallback(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Q.d dVar = this.f17610l;
        if (dVar.k() || !this.f17611m || !this.f17613o || this.f17609k.getWindowVisibility() != 0) {
            this.f17611m = false;
            return;
        }
        long j7 = this.f17614p + f17608q;
        V1.r rVar = new V1.r();
        rVar.a = j7;
        boolean z7 = false;
        while (dVar.l() && !z7) {
            if (rVar.a() <= 0 || ((C2316P) dVar.f7827k[0]).b(rVar)) {
                z7 = true;
            } else {
                dVar.n(0);
            }
        }
        if (z7) {
            this.f17612n.postFrameCallback(this);
        } else {
            this.f17611m = false;
        }
    }

    @Override // O.w0
    public final void b() {
    }
}
