package K2;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.recyclerview.widget.RecyclerView;
import i1.AbstractC1067u;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* renamed from: K2.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0310n {

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f4621C = {R.attr.state_pressed};

    /* renamed from: D, reason: collision with root package name */
    public static final int[] f4622D = new int[0];

    /* renamed from: A, reason: collision with root package name */
    public int f4623A;

    /* renamed from: B, reason: collision with root package name */
    public final RunnableC0306j f4624B;
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4625b;

    /* renamed from: c, reason: collision with root package name */
    public final StateListDrawable f4626c;

    /* renamed from: d, reason: collision with root package name */
    public final Drawable f4627d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4628e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4629f;

    /* renamed from: g, reason: collision with root package name */
    public final StateListDrawable f4630g;

    /* renamed from: h, reason: collision with root package name */
    public final Drawable f4631h;

    /* renamed from: i, reason: collision with root package name */
    public final int f4632i;

    /* renamed from: j, reason: collision with root package name */
    public final int f4633j;

    /* renamed from: k, reason: collision with root package name */
    public int f4634k;

    /* renamed from: l, reason: collision with root package name */
    public int f4635l;

    /* renamed from: m, reason: collision with root package name */
    public float f4636m;

    /* renamed from: n, reason: collision with root package name */
    public int f4637n;

    /* renamed from: o, reason: collision with root package name */
    public int f4638o;

    /* renamed from: p, reason: collision with root package name */
    public float f4639p;

    /* renamed from: s, reason: collision with root package name */
    public final RecyclerView f4642s;

    /* renamed from: z, reason: collision with root package name */
    public final ValueAnimator f4649z;

    /* renamed from: q, reason: collision with root package name */
    public int f4640q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f4641r = 0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f4643t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f4644u = false;

    /* renamed from: v, reason: collision with root package name */
    public int f4645v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f4646w = 0;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f4647x = new int[2];

    /* renamed from: y, reason: collision with root package name */
    public final int[] f4648y = new int[2];

    public C0310n(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i7, int i8, int i9) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f4649z = valueAnimatorOfFloat;
        this.f4623A = 0;
        RunnableC0306j runnableC0306j = new RunnableC0306j(0, this);
        this.f4624B = runnableC0306j;
        C0307k c0307k = new C0307k(this);
        this.f4626c = stateListDrawable;
        this.f4627d = drawable;
        this.f4630g = stateListDrawable2;
        this.f4631h = drawable2;
        this.f4628e = Math.max(i7, stateListDrawable.getIntrinsicWidth());
        this.f4629f = Math.max(i7, drawable.getIntrinsicWidth());
        this.f4632i = Math.max(i7, stateListDrawable2.getIntrinsicWidth());
        this.f4633j = Math.max(i7, drawable2.getIntrinsicWidth());
        this.a = i8;
        this.f4625b = i9;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new C0308l(this));
        valueAnimatorOfFloat.addUpdateListener(new C0309m(this));
        RecyclerView recyclerView2 = this.f4642s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            H h7 = recyclerView2.f10869w;
            if (h7 != null) {
                h7.b("Cannot remove item decoration during a scroll  or layout");
            }
            ArrayList arrayList = recyclerView2.f10873y;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.J();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.f4642s;
            recyclerView3.f10875z.remove(this);
            if (recyclerView3.f10810A == this) {
                recyclerView3.f10810A = null;
            }
            ArrayList arrayList2 = this.f4642s.f10857p0;
            if (arrayList2 != null) {
                arrayList2.remove(c0307k);
            }
            this.f4642s.removeCallbacks(runnableC0306j);
        }
        this.f4642s = recyclerView;
        H h8 = recyclerView.f10869w;
        if (h8 != null) {
            h8.b("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList3 = recyclerView.f10873y;
        if (arrayList3.isEmpty()) {
            recyclerView.setWillNotDraw(false);
        }
        arrayList3.add(this);
        recyclerView.J();
        recyclerView.requestLayout();
        this.f4642s.f10875z.add(this);
        RecyclerView recyclerView4 = this.f4642s;
        if (recyclerView4.f10857p0 == null) {
            recyclerView4.f10857p0 = new ArrayList();
        }
        recyclerView4.f10857p0.add(c0307k);
    }

    public static int c(float f5, float f7, int[] iArr, int i7, int i8, int i9) {
        int i10 = iArr[1] - iArr[0];
        if (i10 != 0) {
            int i11 = i7 - i9;
            int i12 = (int) (((f7 - f5) / i10) * i11);
            int i13 = i8 + i12;
            if (i13 < i11 && i13 >= 0) {
                return i12;
            }
        }
        return 0;
    }

    public final boolean a(float f5, float f7) {
        if (f7 < this.f4641r - this.f4632i) {
            return false;
        }
        int i7 = this.f4638o;
        int i8 = this.f4637n;
        return f5 >= ((float) (i7 - (i8 / 2))) && f5 <= ((float) ((i8 / 2) + i7));
    }

    public final boolean b(float f5, float f7) {
        RecyclerView recyclerView = this.f4642s;
        Field field = AbstractC1067u.a;
        boolean z7 = recyclerView.getLayoutDirection() == 1;
        int i7 = this.f4628e;
        if (!z7 ? f5 >= this.f4640q - i7 : f5 <= i7) {
            int i8 = this.f4635l;
            int i9 = this.f4634k / 2;
            if (f7 >= i8 - i9 && f7 <= i9 + i8) {
                return true;
            }
        }
        return false;
    }

    public final void d(int i7) {
        RunnableC0306j runnableC0306j = this.f4624B;
        StateListDrawable stateListDrawable = this.f4626c;
        if (i7 == 2 && this.f4645v != 2) {
            stateListDrawable.setState(f4621C);
            this.f4642s.removeCallbacks(runnableC0306j);
        }
        if (i7 == 0) {
            this.f4642s.invalidate();
        } else {
            e();
        }
        if (this.f4645v == 2 && i7 != 2) {
            stateListDrawable.setState(f4622D);
            this.f4642s.removeCallbacks(runnableC0306j);
            this.f4642s.postDelayed(runnableC0306j, 1200);
        } else if (i7 == 1) {
            this.f4642s.removeCallbacks(runnableC0306j);
            this.f4642s.postDelayed(runnableC0306j, 1500);
        }
        this.f4645v = i7;
    }

    public final void e() {
        int i7 = this.f4623A;
        ValueAnimator valueAnimator = this.f4649z;
        if (i7 != 0) {
            if (i7 != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f4623A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
