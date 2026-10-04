package F2;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.kusukanime.R;
import d.C0768b;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: A, reason: collision with root package name */
    public boolean f2465A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f2466B;
    public final C0163t a;

    /* renamed from: b, reason: collision with root package name */
    public final View f2468b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f2469c;

    /* renamed from: d, reason: collision with root package name */
    public final ViewGroup f2470d;

    /* renamed from: e, reason: collision with root package name */
    public final ViewGroup f2471e;

    /* renamed from: f, reason: collision with root package name */
    public final ViewGroup f2472f;

    /* renamed from: g, reason: collision with root package name */
    public final ViewGroup f2473g;

    /* renamed from: h, reason: collision with root package name */
    public final ViewGroup f2474h;

    /* renamed from: i, reason: collision with root package name */
    public final ViewGroup f2475i;

    /* renamed from: j, reason: collision with root package name */
    public final View f2476j;

    /* renamed from: k, reason: collision with root package name */
    public final View f2477k;

    /* renamed from: l, reason: collision with root package name */
    public final AnimatorSet f2478l;

    /* renamed from: m, reason: collision with root package name */
    public final AnimatorSet f2479m;

    /* renamed from: n, reason: collision with root package name */
    public final AnimatorSet f2480n;

    /* renamed from: o, reason: collision with root package name */
    public final AnimatorSet f2481o;

    /* renamed from: p, reason: collision with root package name */
    public final AnimatorSet f2482p;

    /* renamed from: q, reason: collision with root package name */
    public final ValueAnimator f2483q;

    /* renamed from: r, reason: collision with root package name */
    public final ValueAnimator f2484r;

    /* renamed from: s, reason: collision with root package name */
    public final u f2485s = new u(this, 0);

    /* renamed from: t, reason: collision with root package name */
    public final u f2486t = new u(this, 3);

    /* renamed from: u, reason: collision with root package name */
    public final u f2487u = new u(this, 4);

    /* renamed from: v, reason: collision with root package name */
    public final u f2488v = new u(this, 5);

    /* renamed from: w, reason: collision with root package name */
    public final u f2489w = new u(this, 6);

    /* renamed from: x, reason: collision with root package name */
    public final ViewOnLayoutChangeListenerC0151g f2490x = new ViewOnLayoutChangeListenerC0151g(1, this);

    /* renamed from: C, reason: collision with root package name */
    public boolean f2467C = true;

    /* renamed from: z, reason: collision with root package name */
    public int f2492z = 0;

    /* renamed from: y, reason: collision with root package name */
    public final ArrayList f2491y = new ArrayList();

    public y(C0163t c0163t) throws Resources.NotFoundException {
        int i7 = 2;
        this.a = c0163t;
        int i8 = 0;
        int i9 = 4;
        int i10 = 1;
        this.f2468b = c0163t.findViewById(R.id.exo_controls_background);
        this.f2469c = (ViewGroup) c0163t.findViewById(R.id.exo_center_controls);
        this.f2471e = (ViewGroup) c0163t.findViewById(R.id.exo_minimal_controls);
        ViewGroup viewGroup = (ViewGroup) c0163t.findViewById(R.id.exo_bottom_bar);
        this.f2470d = viewGroup;
        this.f2475i = (ViewGroup) c0163t.findViewById(R.id.exo_time);
        View viewFindViewById = c0163t.findViewById(R.id.exo_progress);
        this.f2476j = viewFindViewById;
        this.f2472f = (ViewGroup) c0163t.findViewById(R.id.exo_basic_controls);
        this.f2473g = (ViewGroup) c0163t.findViewById(R.id.exo_extra_controls);
        this.f2474h = (ViewGroup) c0163t.findViewById(R.id.exo_extra_controls_scroll_view);
        View viewFindViewById2 = c0163t.findViewById(R.id.exo_overflow_show);
        this.f2477k = viewFindViewById2;
        View viewFindViewById3 = c0163t.findViewById(R.id.exo_overflow_hide);
        if (viewFindViewById2 != null && viewFindViewById3 != null) {
            viewFindViewById2.setOnClickListener(new ViewOnClickListenerC0150f(i9, this));
            viewFindViewById3.setOnClickListener(new ViewOnClickListenerC0150f(i9, this));
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new v(3, this));
        valueAnimatorOfFloat.addListener(new w(this, i8));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat2.addUpdateListener(new v(0, this));
        valueAnimatorOfFloat2.addListener(new w(this, i10));
        Resources resources = c0163t.getResources();
        float dimension = resources.getDimension(R.dimen.exo_styled_bottom_bar_height) - resources.getDimension(R.dimen.exo_styled_progress_bar_height);
        float dimension2 = resources.getDimension(R.dimen.exo_styled_bottom_bar_height);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f2478l = animatorSet;
        animatorSet.setDuration(250L);
        animatorSet.addListener(new x(this, c0163t, i8));
        animatorSet.play(valueAnimatorOfFloat).with(d(viewFindViewById, 0.0f, dimension)).with(d(viewGroup, 0.0f, dimension));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f2479m = animatorSet2;
        animatorSet2.setDuration(250L);
        animatorSet2.addListener(new x(this, c0163t, i10));
        animatorSet2.play(d(viewFindViewById, dimension, dimension2)).with(d(viewGroup, dimension, dimension2));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.f2480n = animatorSet3;
        animatorSet3.setDuration(250L);
        animatorSet3.addListener(new x(this, c0163t, i7));
        animatorSet3.play(valueAnimatorOfFloat).with(d(viewFindViewById, 0.0f, dimension2)).with(d(viewGroup, 0.0f, dimension2));
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.f2481o = animatorSet4;
        animatorSet4.setDuration(250L);
        animatorSet4.addListener(new w(this, i7));
        animatorSet4.play(valueAnimatorOfFloat2).with(d(viewFindViewById, dimension, 0.0f)).with(d(viewGroup, dimension, 0.0f));
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.f2482p = animatorSet5;
        animatorSet5.setDuration(250L);
        animatorSet5.addListener(new w(this, 3));
        animatorSet5.play(valueAnimatorOfFloat2).with(d(viewFindViewById, dimension2, 0.0f)).with(d(viewGroup, dimension2, 0.0f));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f2483q = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.setDuration(250L);
        valueAnimatorOfFloat3.addUpdateListener(new v(1, this));
        valueAnimatorOfFloat3.addListener(new w(this, 4));
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.f2484r = valueAnimatorOfFloat4;
        valueAnimatorOfFloat4.setDuration(250L);
        valueAnimatorOfFloat4.addUpdateListener(new v(2, this));
        valueAnimatorOfFloat4.addListener(new w(this, 5));
    }

    public static int c(View view) {
        if (view == null) {
            return 0;
        }
        int width = view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return width;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + width;
    }

    public static ObjectAnimator d(View view, float f5, float f7) {
        return ObjectAnimator.ofFloat(view, "translationY", f5, f7);
    }

    public static boolean j(View view) {
        int id = view.getId();
        return id == R.id.exo_bottom_bar || id == R.id.exo_prev || id == R.id.exo_next || id == R.id.exo_rew || id == R.id.exo_rew_with_amount || id == R.id.exo_ffwd || id == R.id.exo_ffwd_with_amount;
    }

    public final void a(float f5) {
        ViewGroup viewGroup = this.f2474h;
        if (viewGroup != null) {
            viewGroup.setTranslationX((int) ((1.0f - f5) * viewGroup.getWidth()));
        }
        ViewGroup viewGroup2 = this.f2475i;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f - f5);
        }
        ViewGroup viewGroup3 = this.f2472f;
        if (viewGroup3 != null) {
            viewGroup3.setAlpha(1.0f - f5);
        }
    }

    public final boolean b(View view) {
        return view != null && this.f2491y.contains(view);
    }

    public final void e(Runnable runnable, long j7) {
        if (j7 >= 0) {
            this.a.postDelayed(runnable, j7);
        }
    }

    public final void f() {
        u uVar = this.f2489w;
        C0163t c0163t = this.a;
        c0163t.removeCallbacks(uVar);
        c0163t.removeCallbacks(this.f2486t);
        c0163t.removeCallbacks(this.f2488v);
        c0163t.removeCallbacks(this.f2487u);
    }

    public final void g() {
        if (this.f2492z == 3) {
            return;
        }
        f();
        int showTimeoutMs = this.a.getShowTimeoutMs();
        if (showTimeoutMs > 0) {
            if (!this.f2467C) {
                e(this.f2489w, showTimeoutMs);
            } else if (this.f2492z == 1) {
                e(this.f2487u, 2000L);
            } else {
                e(this.f2488v, showTimeoutMs);
            }
        }
    }

    public final void h(View view, boolean z7) {
        if (view == null) {
            return;
        }
        ArrayList arrayList = this.f2491y;
        if (!z7) {
            view.setVisibility(8);
            arrayList.remove(view);
            return;
        }
        if (this.f2465A && j(view)) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
        }
        arrayList.add(view);
    }

    public final void i(int i7) {
        int i8 = this.f2492z;
        this.f2492z = i7;
        C0163t c0163t = this.a;
        if (i7 == 2) {
            c0163t.setVisibility(8);
        } else if (i8 == 2) {
            c0163t.setVisibility(0);
        }
        if (i8 != i7) {
            Iterator it = c0163t.f2434n.iterator();
            while (it.hasNext()) {
                InterfaceC0162s interfaceC0162s = (InterfaceC0162s) it.next();
                int visibility = c0163t.getVisibility();
                E e7 = ((A) interfaceC0162s).f2228c;
                e7.m();
                B b4 = e7.f2234E;
                if (b4 != null) {
                    ((C0768b) b4).a.setValue(Boolean.valueOf(visibility == 0));
                }
            }
        }
    }

    public final void k() {
        if (!this.f2467C) {
            i(0);
            g();
            return;
        }
        int i7 = this.f2492z;
        if (i7 == 1) {
            this.f2481o.start();
        } else if (i7 == 2) {
            this.f2482p.start();
        } else if (i7 == 3) {
            this.f2466B = true;
        } else if (i7 == 4) {
            return;
        }
        g();
    }
}
