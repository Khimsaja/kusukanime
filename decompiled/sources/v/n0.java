package v;

import android.os.Build;
import android.view.View;
import com.kusukanime.R;
import d1.C0782a;
import f1.AbstractC0868a;
import i1.C1050c;
import java.util.WeakHashMap;
import m.C1472B;

/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: v, reason: collision with root package name */
    public static final WeakHashMap f16470v = new WeakHashMap();
    public final C2122a a = M.c(4, "captionBar");

    /* renamed from: b, reason: collision with root package name */
    public final C2122a f16471b;

    /* renamed from: c, reason: collision with root package name */
    public final C2122a f16472c;

    /* renamed from: d, reason: collision with root package name */
    public final C2122a f16473d;

    /* renamed from: e, reason: collision with root package name */
    public final C2122a f16474e;

    /* renamed from: f, reason: collision with root package name */
    public final C2122a f16475f;

    /* renamed from: g, reason: collision with root package name */
    public final C2122a f16476g;

    /* renamed from: h, reason: collision with root package name */
    public final C2122a f16477h;

    /* renamed from: i, reason: collision with root package name */
    public final C2122a f16478i;

    /* renamed from: j, reason: collision with root package name */
    public final l0 f16479j;

    /* renamed from: k, reason: collision with root package name */
    public final j0 f16480k;

    /* renamed from: l, reason: collision with root package name */
    public final l0 f16481l;

    /* renamed from: m, reason: collision with root package name */
    public final l0 f16482m;

    /* renamed from: n, reason: collision with root package name */
    public final l0 f16483n;

    /* renamed from: o, reason: collision with root package name */
    public final l0 f16484o;

    /* renamed from: p, reason: collision with root package name */
    public final l0 f16485p;

    /* renamed from: q, reason: collision with root package name */
    public final l0 f16486q;

    /* renamed from: r, reason: collision with root package name */
    public final l0 f16487r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f16488s;

    /* renamed from: t, reason: collision with root package name */
    public int f16489t;

    /* renamed from: u, reason: collision with root package name */
    public final P f16490u;

    public n0(View view) {
        C2122a c2122aC = M.c(128, "displayCutout");
        this.f16471b = c2122aC;
        C2122a c2122aC2 = M.c(8, "ime");
        this.f16472c = c2122aC2;
        C2122a c2122aC3 = M.c(32, "mandatorySystemGestures");
        this.f16473d = c2122aC3;
        this.f16474e = M.c(2, "navigationBars");
        this.f16475f = M.c(1, "statusBars");
        C2122a c2122aC4 = M.c(7, "systemBars");
        this.f16476g = c2122aC4;
        C2122a c2122aC5 = M.c(16, "systemGestures");
        this.f16477h = c2122aC5;
        C2122a c2122aC6 = M.c(64, "tappableElement");
        this.f16478i = c2122aC6;
        l0 l0Var = new l0(new T(0, 0, 0, 0), "waterfall");
        this.f16479j = l0Var;
        this.f16480k = new j0(new j0(c2122aC4, c2122aC2), c2122aC);
        new j0(new j0(new j0(c2122aC6, c2122aC3), c2122aC5), l0Var);
        this.f16481l = M.d(4, "captionBarIgnoringVisibility");
        this.f16482m = M.d(2, "navigationBarsIgnoringVisibility");
        this.f16483n = M.d(1, "statusBarsIgnoringVisibility");
        this.f16484o = M.d(7, "systemBarsIgnoringVisibility");
        this.f16485p = M.d(64, "tappableElementIgnoringVisibility");
        this.f16486q = M.d(8, "imeAnimationTarget");
        this.f16487r = M.d(8, "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(R.id.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.f16488s = bool != null ? bool.booleanValue() : true;
        this.f16490u = new P(this);
    }

    public static void a(n0 n0Var, i1.S s7) {
        boolean z7 = false;
        n0Var.a.f(s7, 0);
        n0Var.f16472c.f(s7, 0);
        n0Var.f16471b.f(s7, 0);
        n0Var.f16474e.f(s7, 0);
        n0Var.f16475f.f(s7, 0);
        n0Var.f16476g.f(s7, 0);
        n0Var.f16477h.f(s7, 0);
        n0Var.f16478i.f(s7, 0);
        n0Var.f16473d.f(s7, 0);
        n0Var.f16481l.f(AbstractC2123b.i(s7.a.g(4)));
        n0Var.f16482m.f(AbstractC2123b.i(s7.a.g(2)));
        n0Var.f16483n.f(AbstractC2123b.i(s7.a.g(1)));
        n0Var.f16484o.f(AbstractC2123b.i(s7.a.g(7)));
        n0Var.f16485p.f(AbstractC2123b.i(s7.a.g(64)));
        C1050c c1050cE = s7.a.e();
        if (c1050cE != null) {
            n0Var.f16479j.f(AbstractC2123b.i(Build.VERSION.SDK_INT >= 30 ? C0782a.c(AbstractC0868a.c(c1050cE.a)) : C0782a.f11199e));
        }
        synchronized (Y.o.f10002b) {
            C1472B c1472b = ((Y.c) Y.o.f10009i.get()).f9968h;
            if (c1472b != null) {
                if (c1472b.h()) {
                    z7 = true;
                }
            }
        }
        if (z7) {
            Y.o.a();
        }
    }
}
