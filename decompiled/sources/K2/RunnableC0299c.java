package K2;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: K2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0299c implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f4557k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ArrayList f4558l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0305i f4559m;

    public /* synthetic */ RunnableC0299c(C0305i c0305i, ArrayList arrayList, int i7) {
        this.f4557k = i7;
        this.f4559m = c0305i;
        this.f4558l = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4557k) {
            case 0:
                ArrayList arrayList = this.f4558l;
                Iterator it = arrayList.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    C0305i c0305i = this.f4559m;
                    if (!zHasNext) {
                        arrayList.clear();
                        c0305i.f4612m.remove(arrayList);
                        break;
                    } else {
                        C0304h c0304h = (C0304h) it.next();
                        W w7 = c0304h.a;
                        c0305i.getClass();
                        View view = w7.a;
                        int i7 = c0304h.f4603d - c0304h.f4601b;
                        int i8 = c0304h.f4604e - c0304h.f4602c;
                        if (i7 != 0) {
                            view.animate().translationX(0.0f);
                        }
                        if (i8 != 0) {
                            view.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                        c0305i.f4615p.add(w7);
                        viewPropertyAnimatorAnimate.setDuration(c0305i.f4465e).setListener(new C0301e(c0305i, w7, i7, view, i8, viewPropertyAnimatorAnimate)).start();
                    }
                }
            case 1:
                ArrayList arrayList2 = this.f4558l;
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    boolean zHasNext2 = it2.hasNext();
                    C0305i c0305i2 = this.f4559m;
                    if (!zHasNext2) {
                        arrayList2.clear();
                        c0305i2.f4613n.remove(arrayList2);
                        break;
                    } else {
                        C0303g c0303g = (C0303g) it2.next();
                        c0305i2.getClass();
                        W w8 = c0303g.a;
                        View view2 = w8 == null ? null : w8.a;
                        W w9 = c0303g.f4596b;
                        View view3 = w9 != null ? w9.a : null;
                        ArrayList arrayList3 = c0305i2.f4617r;
                        long j7 = c0305i2.f4466f;
                        if (view2 != null) {
                            ViewPropertyAnimator duration = view2.animate().setDuration(j7);
                            arrayList3.add(c0303g.a);
                            duration.translationX(c0303g.f4599e - c0303g.f4597c);
                            duration.translationY(c0303g.f4600f - c0303g.f4598d);
                            duration.alpha(0.0f).setListener(new C0302f(c0305i2, c0303g, duration, view2, 0)).start();
                        }
                        if (view3 != null) {
                            ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view3.animate();
                            arrayList3.add(c0303g.f4596b);
                            viewPropertyAnimatorAnimate2.translationX(0.0f).translationY(0.0f).setDuration(j7).alpha(1.0f).setListener(new C0302f(c0305i2, c0303g, viewPropertyAnimatorAnimate2, view3, 1)).start();
                        }
                    }
                }
            default:
                ArrayList arrayList4 = this.f4558l;
                Iterator it3 = arrayList4.iterator();
                while (true) {
                    boolean zHasNext3 = it3.hasNext();
                    C0305i c0305i3 = this.f4559m;
                    if (!zHasNext3) {
                        arrayList4.clear();
                        c0305i3.f4611l.remove(arrayList4);
                        break;
                    } else {
                        W w10 = (W) it3.next();
                        c0305i3.getClass();
                        View view4 = w10.a;
                        ViewPropertyAnimator viewPropertyAnimatorAnimate3 = view4.animate();
                        c0305i3.f4614o.add(w10);
                        viewPropertyAnimatorAnimate3.alpha(1.0f).setDuration(c0305i3.f4463c).setListener(new C0300d(c0305i3, w10, view4, viewPropertyAnimatorAnimate3)).start();
                    }
                }
        }
    }
}
