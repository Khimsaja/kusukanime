package D6;

import android.animation.ValueAnimator;
import android.view.View;
import g1.C0937e;
import i1.C1036A;
import i1.C1040E;

/* renamed from: D6.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0131z implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f1773k;

    /* renamed from: l, reason: collision with root package name */
    public Object f1774l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f1775m;

    public /* synthetic */ RunnableC0131z(int i7, Object obj, Object obj2) {
        this.f1773k = i7;
        this.f1774l = obj;
        this.f1775m = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1773k) {
            case 0:
                P3.r.E((C0130y) this.f1774l).resumeWith(P3.r.r((Throwable) this.f1775m));
                return;
            case 1:
                int i7 = 0;
                while (true) {
                    try {
                        ((Runnable) this.f1774l).run();
                    } catch (Throwable th) {
                        H5.D.s(S3.i.f8767k, th);
                    }
                    Runnable runnableA0 = ((M5.g) this.f1775m).a0();
                    if (runnableA0 == null) {
                        return;
                    }
                    try {
                        this.f1774l = runnableA0;
                        i7++;
                        if (i7 >= 16) {
                            M5.g gVar = (M5.g) this.f1775m;
                            if (M5.a.j(gVar.f6584m, gVar)) {
                                M5.g gVar2 = (M5.g) this.f1775m;
                                M5.a.i(gVar2.f6584m, gVar2, this);
                                return;
                            }
                        }
                    } catch (Throwable th2) {
                        M5.g gVar3 = (M5.g) this.f1775m;
                        synchronized (gVar3.f6587p) {
                            M5.g.f6582q.decrementAndGet(gVar3);
                            throw th2;
                        }
                    }
                }
            case 2:
                return;
            case 3:
                ((C0937e) this.f1774l).a(this.f1775m);
                return;
            default:
                C1036A.g((View) this.f1774l);
                ((ValueAnimator) this.f1775m).start();
                return;
        }
    }

    public RunnableC0131z(M5.g gVar, Runnable runnable) {
        this.f1773k = 1;
        this.f1775m = gVar;
        this.f1774l = runnable;
    }

    public RunnableC0131z(View view, C1040E c1040e, L2.e eVar, ValueAnimator valueAnimator) {
        this.f1773k = 4;
        this.f1774l = view;
        this.f1775m = valueAnimator;
    }
}
