package K2;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import i1.AbstractC1067u;
import java.lang.reflect.Field;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class V implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public int f4512k;

    /* renamed from: l, reason: collision with root package name */
    public int f4513l;

    /* renamed from: m, reason: collision with root package name */
    public OverScroller f4514m;

    /* renamed from: n, reason: collision with root package name */
    public Interpolator f4515n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f4516o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f4517p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f4518q;

    public V(RecyclerView recyclerView) {
        this.f4518q = recyclerView;
        InterpolatorC0320y interpolatorC0320y = RecyclerView.f10808L0;
        this.f4515n = interpolatorC0320y;
        this.f4516o = false;
        this.f4517p = false;
        this.f4514m = new OverScroller(recyclerView.getContext(), interpolatorC0320y);
    }

    public final void a(int i7, int i8) {
        RecyclerView recyclerView = this.f4518q;
        recyclerView.setScrollState(2);
        this.f4513l = 0;
        this.f4512k = 0;
        Interpolator interpolator = this.f4515n;
        InterpolatorC0320y interpolatorC0320y = RecyclerView.f10808L0;
        if (interpolator != interpolatorC0320y) {
            this.f4515n = interpolatorC0320y;
            this.f4514m = new OverScroller(recyclerView.getContext(), interpolatorC0320y);
        }
        this.f4514m.fling(0, 0, i7, i8, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f4516o) {
            this.f4517p = true;
            return;
        }
        recyclerView.removeCallbacks(this);
        Field field = AbstractC1067u.a;
        recyclerView.postOnAnimation(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7;
        int i8;
        int i9;
        int i10;
        RecyclerView recyclerView = this.f4518q;
        if (recyclerView.f10869w == null) {
            recyclerView.removeCallbacks(this);
            this.f4514m.abortAnimation();
            return;
        }
        this.f4517p = false;
        this.f4516o = true;
        recyclerView.k();
        OverScroller overScroller = this.f4514m;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i11 = currX - this.f4512k;
            int i12 = currY - this.f4513l;
            this.f4512k = currX;
            this.f4513l = currY;
            int iJ = RecyclerView.j(i11, recyclerView.f10828P, recyclerView.f10830R, recyclerView.getWidth());
            int iJ2 = RecyclerView.j(i12, recyclerView.f10829Q, recyclerView.f10831S, recyclerView.getHeight());
            int[] iArr = recyclerView.f10876z0;
            iArr[0] = 0;
            iArr[1] = 0;
            boolean zP = recyclerView.p(iJ, iJ2, 1, iArr, null);
            int[] iArr2 = recyclerView.f10876z0;
            if (zP) {
                iJ -= iArr2[0];
                iJ2 -= iArr2[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.i(iJ, iJ2);
            }
            if (recyclerView.f10868v != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
                recyclerView.V(iJ, iJ2, iArr2);
                int i13 = iArr2[0];
                int i14 = iArr2[1];
                recyclerView.f10869w.getClass();
                i7 = iJ - i13;
                i9 = i13;
                i8 = iJ2 - i14;
                i10 = i14;
            } else {
                i7 = iJ;
                i8 = iJ2;
                i9 = 0;
                i10 = 0;
            }
            if (!recyclerView.f10873y.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.f10876z0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            recyclerView.q(i9, i10, i7, i8, null, 1, iArr3);
            int i15 = i7 - iArr2[0];
            int i16 = i8 - iArr2[1];
            if (i9 != 0 || i10 != 0) {
                recyclerView.r(i9, i10);
            }
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            boolean z7 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i15 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i16 != 0));
            recyclerView.f10869w.getClass();
            if (z7) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i17 = i15 < 0 ? -currVelocity : i15 > 0 ? currVelocity : 0;
                    if (i16 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i16 <= 0) {
                        currVelocity = 0;
                    }
                    if (i17 < 0) {
                        recyclerView.t();
                        if (recyclerView.f10828P.isFinished()) {
                            recyclerView.f10828P.onAbsorb(-i17);
                        }
                    } else if (i17 > 0) {
                        recyclerView.u();
                        if (recyclerView.f10830R.isFinished()) {
                            recyclerView.f10830R.onAbsorb(i17);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.v();
                        if (recyclerView.f10829Q.isFinished()) {
                            recyclerView.f10829Q.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.s();
                        if (recyclerView.f10831S.isFinished()) {
                            recyclerView.f10831S.onAbsorb(currVelocity);
                        }
                    }
                    if (i17 != 0 || currVelocity != 0) {
                        Field field = AbstractC1067u.a;
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                if (RecyclerView.f10806J0) {
                    C0311o c0311o = recyclerView.f10851m0;
                    int[] iArr4 = c0311o.a;
                    if (iArr4 != null) {
                        Arrays.fill(iArr4, -1);
                    }
                    c0311o.f4652d = 0;
                }
            } else {
                if (this.f4516o) {
                    this.f4517p = true;
                } else {
                    recyclerView.removeCallbacks(this);
                    Field field2 = AbstractC1067u.a;
                    recyclerView.postOnAnimation(this);
                }
                RunnableC0313q runnableC0313q = recyclerView.f10849l0;
                if (runnableC0313q != null) {
                    runnableC0313q.a(recyclerView, i9, i10);
                }
            }
        }
        recyclerView.f10869w.getClass();
        this.f4516o = false;
        if (!this.f4517p) {
            recyclerView.setScrollState(0);
            recyclerView.a0(1);
        } else {
            recyclerView.removeCallbacks(this);
            Field field3 = AbstractC1067u.a;
            recyclerView.postOnAnimation(this);
        }
    }
}
