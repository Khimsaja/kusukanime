package H1;

import B1.RunnableC0016c;
import C2.C0034g;
import O1.C0544s;
import O1.C0549x;
import android.media.AudioTrack;
import android.os.Handler;
import android.util.Pair;

/* loaded from: classes.dex */
public final /* synthetic */ class W implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f3383k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f3384l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f3385m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f3386n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f3387o;

    public /* synthetic */ W(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f3383k = i7;
        this.f3384l = obj;
        this.f3385m = obj2;
        this.f3386n = obj3;
        this.f3387o = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3383k) {
            case 0:
                I1.f fVar = ((Z) this.f3384l).f3399b.f3418h;
                Pair pair = (Pair) this.f3385m;
                fVar.x(((Integer) pair.first).intValue(), (O1.B) pair.second, (C0544s) this.f3386n, (C0549x) this.f3387o);
                return;
            case 1:
                I1.f fVar2 = ((Z) this.f3384l).f3399b.f3418h;
                Pair pair2 = (Pair) this.f3385m;
                fVar2.z(((Integer) pair2.first).intValue(), (O1.B) pair2.second, (C0544s) this.f3386n, (C0549x) this.f3387o);
                return;
            default:
                AudioTrack audioTrack = (AudioTrack) this.f3384l;
                C0034g c0034g = (C0034g) this.f3385m;
                Handler handler = (Handler) this.f3386n;
                J1.k kVar = (J1.k) this.f3387o;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    if (c0034g != null && handler.getLooper().getThread().isAlive()) {
                        handler.post(new RunnableC0016c(13, c0034g, kVar));
                    }
                    synchronized (J1.A.f4079j0) {
                        try {
                            int i7 = J1.A.f4081l0 - 1;
                            J1.A.f4081l0 = i7;
                            if (i7 == 0) {
                                J1.A.f4080k0.shutdown();
                                J1.A.f4080k0 = null;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Throwable th) {
                    if (c0034g != null && handler.getLooper().getThread().isAlive()) {
                        handler.post(new RunnableC0016c(13, c0034g, kVar));
                    }
                    synchronized (J1.A.f4079j0) {
                        try {
                            int i8 = J1.A.f4081l0 - 1;
                            J1.A.f4081l0 = i8;
                            if (i8 == 0) {
                                J1.A.f4080k0.shutdown();
                                J1.A.f4080k0 = null;
                            }
                            throw th;
                        } finally {
                        }
                    }
                }
        }
    }
}
