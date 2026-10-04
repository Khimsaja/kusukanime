package D6;

import B1.AbstractC0015b;
import C2.C0034g;
import M0.C0468a;
import O1.C0549x;
import android.util.Pair;
import android.view.AttachedSurfaceControl;
import android.view.SurfaceView;
import android.window.SurfaceSyncGroup;
import f.AbstractC0841b;
import f.AbstractC0847h;
import io.ktor.util.GzipHeaderFlags;
import java.io.IOException;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: D6.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0121o implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f1753k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f1754l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f1755m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f1756n;

    public /* synthetic */ RunnableC0121o(Object obj, Object obj2, Object obj3, int i7) {
        this.f1753k = i7;
        this.f1754l = obj;
        this.f1755m = obj2;
        this.f1756n = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1753k) {
            case 0:
                C0122p c0122p = (C0122p) ((F.w) this.f1754l).f2038m;
                boolean zS = c0122p.f1758l.s();
                InterfaceC0114h interfaceC0114h = (InterfaceC0114h) this.f1755m;
                if (zS) {
                    interfaceC0114h.a(c0122p, new IOException("Canceled"));
                    return;
                } else {
                    interfaceC0114h.d(c0122p, (V) this.f1756n);
                    return;
                }
            case 1:
                ((InterfaceC0114h) this.f1755m).a((C0122p) ((F.w) this.f1754l).f2038m, (Throwable) this.f1756n);
                return;
            case 2:
                C0034g c0034g = (C0034g) this.f1754l;
                c0034g.getClass();
                AttachedSurfaceControl rootSurfaceControl = ((SurfaceView) this.f1755m).getRootSurfaceControl();
                if (rootSurfaceControl == null) {
                    return;
                }
                SurfaceSyncGroup surfaceSyncGroupK = F.s.k();
                c0034g.f741l = surfaceSyncGroupK;
                AbstractC0015b.h(surfaceSyncGroupK.add(rootSurfaceControl, new F2.D()));
                ((B1.w) this.f1756n).run();
                rootSurfaceControl.applyTransactionOnDraw(C0.b.f());
                return;
            case 3:
                H1.T t7 = (H1.T) this.f1754l;
                t7.getClass();
                j3.X xF = ((j3.D) this.f1755m).f();
                I1.f fVar = t7.f3368c;
                H1.G g4 = fVar.f3958g;
                g4.getClass();
                B0.b bVar = fVar.f3955d;
                bVar.getClass();
                bVar.f276l = j3.G.s(xF);
                if (!xF.isEmpty()) {
                    bVar.f279o = (O1.B) xF.get(0);
                    O1.B b4 = (O1.B) this.f1756n;
                    b4.getClass();
                    bVar.f280p = b4;
                }
                if (((O1.B) bVar.f278n) == null) {
                    bVar.f278n = B0.b.j(g4, (j3.G) bVar.f276l, (O1.B) bVar.f279o, (y1.N) bVar.f275k);
                }
                bVar.z(g4.U0());
                return;
            case GzipHeaderFlags.EXTRA /* 4 */:
                I1.f fVar2 = ((H1.Z) this.f1754l).f3399b.f3418h;
                Pair pair = (Pair) this.f1755m;
                fVar2.C(((Integer) pair.first).intValue(), (O1.B) pair.second, (C0549x) this.f1756n);
                return;
            default:
                C0468a c0468a = (C0468a) this.f1754l;
                AbstractC0847h abstractC0847h = (AbstractC0847h) this.f1755m;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f1756n;
                c0468a.getClass();
                try {
                    p1.o oVarI = AbstractC0841b.i(c0468a.f6384k);
                    if (oVarI == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    p1.n nVar = (p1.n) ((p1.f) oVarI.f4691b);
                    synchronized (nVar.f14186n) {
                        nVar.f14188p = threadPoolExecutor;
                    }
                    ((p1.f) oVarI.f4691b).a(new p1.i(abstractC0847h, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    abstractC0847h.t(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
        }
    }
}
