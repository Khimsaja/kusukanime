package K2;

import C2.C0034g;
import android.animation.ValueAnimator;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import e5.AbstractC0832b;
import i1.AbstractC1067u;
import io.ktor.util.GzipHeaderFlags;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Level;
import z0.C2471u;

/* renamed from: K2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0306j implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f4618k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f4619l;

    public /* synthetic */ RunnableC0306j(int i7, Object obj) {
        this.f4618k = i7;
        this.f4619l = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7;
        boolean z7;
        i6.a aVarC;
        long jNanoTime;
        switch (this.f4618k) {
            case 0:
                C0310n c0310n = (C0310n) this.f4619l;
                int i8 = c0310n.f4623A;
                ValueAnimator valueAnimator = c0310n.f4649z;
                if (i8 != 1) {
                    i7 = 2;
                    if (i8 != 2) {
                        return;
                    }
                } else {
                    i7 = 2;
                    valueAnimator.cancel();
                }
                c0310n.f4623A = 3;
                float[] fArr = new float[i7];
                fArr[0] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fArr[1] = 0.0f;
                valueAnimator.setFloatValues(fArr);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                return;
            case 1:
                RecyclerView recyclerView = (RecyclerView) this.f4619l;
                E e7 = recyclerView.f10832T;
                if (e7 != null) {
                    C0305i c0305i = (C0305i) e7;
                    ArrayList arrayList = c0305i.f4607h;
                    boolean zIsEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = c0305i.f4609j;
                    boolean zIsEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = c0305i.f4610k;
                    boolean zIsEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = c0305i.f4608i;
                    boolean zIsEmpty4 = arrayList4.isEmpty();
                    if (!zIsEmpty || !zIsEmpty2 || !zIsEmpty4 || !zIsEmpty3) {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            boolean zHasNext = it.hasNext();
                            long j7 = c0305i.f4464d;
                            if (zHasNext) {
                                W w7 = (W) it.next();
                                View view = w7.a;
                                ArrayList arrayList5 = arrayList;
                                ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                                c0305i.f4616q.add(w7);
                                viewPropertyAnimatorAnimate.setDuration(j7).alpha(0.0f).setListener(new C0300d(c0305i, w7, viewPropertyAnimatorAnimate, view)).start();
                                arrayList = arrayList5;
                                zIsEmpty = zIsEmpty;
                            } else {
                                boolean z8 = zIsEmpty;
                                arrayList.clear();
                                if (!zIsEmpty2) {
                                    ArrayList arrayList6 = new ArrayList();
                                    arrayList6.addAll(arrayList2);
                                    c0305i.f4612m.add(arrayList6);
                                    arrayList2.clear();
                                    RunnableC0299c runnableC0299c = new RunnableC0299c(c0305i, arrayList6, 0);
                                    if (z8) {
                                        runnableC0299c.run();
                                    } else {
                                        View view2 = ((C0304h) arrayList6.get(0)).a.a;
                                        Field field = AbstractC1067u.a;
                                        view2.postOnAnimationDelayed(runnableC0299c, j7);
                                    }
                                }
                                if (!zIsEmpty3) {
                                    ArrayList arrayList7 = new ArrayList();
                                    arrayList7.addAll(arrayList3);
                                    c0305i.f4613n.add(arrayList7);
                                    arrayList3.clear();
                                    RunnableC0299c runnableC0299c2 = new RunnableC0299c(c0305i, arrayList7, 1);
                                    if (z8) {
                                        runnableC0299c2.run();
                                    } else {
                                        View view3 = ((C0303g) arrayList7.get(0)).a.a;
                                        Field field2 = AbstractC1067u.a;
                                        view3.postOnAnimationDelayed(runnableC0299c2, j7);
                                    }
                                }
                                if (!zIsEmpty4) {
                                    ArrayList arrayList8 = new ArrayList();
                                    arrayList8.addAll(arrayList4);
                                    c0305i.f4611l.add(arrayList8);
                                    arrayList4.clear();
                                    RunnableC0299c runnableC0299c3 = new RunnableC0299c(c0305i, arrayList8, 2);
                                    if (z8 && zIsEmpty2 && zIsEmpty3) {
                                        runnableC0299c3.run();
                                    } else {
                                        if (z8) {
                                            j7 = 0;
                                        }
                                        long jMax = Math.max(!zIsEmpty2 ? c0305i.f4465e : 0L, zIsEmpty3 ? 0L : c0305i.f4466f) + j7;
                                        View view4 = ((W) arrayList8.get(0)).a;
                                        Field field3 = AbstractC1067u.a;
                                        view4.postOnAnimationDelayed(runnableC0299c3, jMax);
                                    }
                                }
                            }
                        }
                    }
                    z7 = false;
                } else {
                    z7 = false;
                }
                recyclerView.f10865t0 = z7;
                return;
            case 2:
                ((StaggeredGridLayoutManager) this.f4619l).t0();
                return;
            case 3:
                O1.S s7 = (O1.S) this.f4619l;
                O1.Z[] zArr = s7.f7314D;
                int length = zArr.length;
                while (i < length) {
                    O1.Z z9 = zArr[i];
                    z9.l(true);
                    C0034g c0034g = z9.f7385h;
                    if (c0034g != null) {
                        c0034g.s(z9.f7382e);
                        z9.f7385h = null;
                        z9.f7384g = null;
                    }
                    i++;
                }
                B2.l lVar = s7.f7346w;
                V1.n nVar = (V1.n) lVar.f417m;
                if (nVar != null) {
                    nVar.a();
                    lVar.f417m = null;
                }
                lVar.f418n = null;
                return;
            case GzipHeaderFlags.EXTRA /* 4 */:
                break;
            default:
                C2471u c2471u = (C2471u) this.f4619l;
                c2471u.removeCallbacks(this);
                MotionEvent motionEvent = c2471u.f18910x0;
                if (motionEvent != null) {
                    i = motionEvent.getToolType(0) == 3 ? 1 : 0;
                    int actionMasked = motionEvent.getActionMasked();
                    if (i != 0) {
                        if (actionMasked == 10 || actionMasked == 1) {
                            return;
                        }
                    } else if (actionMasked == 1) {
                        return;
                    }
                    int i9 = (actionMasked == 7 || actionMasked == 9) ? 7 : 2;
                    C2471u c2471u2 = (C2471u) this.f4619l;
                    c2471u2.D(motionEvent, i9, c2471u2.f18912y0, false);
                    return;
                }
                return;
        }
        while (true) {
            i6.d dVar = (i6.d) this.f4619l;
            synchronized (dVar) {
                aVarC = dVar.c();
            }
            if (aVarC == null) {
                return;
            }
            i6.c cVar = aVarC.f12043c;
            kotlin.jvm.internal.l.c(cVar);
            i6.d dVar2 = (i6.d) this.f4619l;
            boolean zIsLoggable = i6.d.f12054j.isLoggable(Level.FINE);
            if (zIsLoggable) {
                X4.y yVar = cVar.a.a;
                jNanoTime = System.nanoTime();
                AbstractC0832b.g(aVarC, cVar, "starting");
            } else {
                jNanoTime = -1;
            }
            try {
                i6.d.a(dVar2, aVarC);
                if (zIsLoggable) {
                    X4.y yVar2 = cVar.a.a;
                    AbstractC0832b.g(aVarC, cVar, "finished run in ".concat(AbstractC0832b.s(System.nanoTime() - jNanoTime)));
                }
            } catch (Throwable th) {
                try {
                    ((ThreadPoolExecutor) dVar2.a.f9916l).execute(this);
                    throw th;
                } catch (Throwable th2) {
                    if (zIsLoggable) {
                        X4.y yVar3 = cVar.a.a;
                        AbstractC0832b.g(aVarC, cVar, "failed a run in ".concat(AbstractC0832b.s(System.nanoTime() - jNanoTime)));
                    }
                    throw th2;
                }
            }
        }
    }
}
