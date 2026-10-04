package z0;

import O.C0486d;
import O.C0507n0;
import O.C0509o0;
import O.C0510p;
import O.C0525y;

/* renamed from: z0.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2455l0 {
    public static final O.S0 a = new O.S0(P.f18665t);

    /* renamed from: b, reason: collision with root package name */
    public static final O.S0 f18783b = new O.S0(P.f18666u);

    /* renamed from: c, reason: collision with root package name */
    public static final O.S0 f18784c = new O.S0(P.f18667v);

    /* renamed from: d, reason: collision with root package name */
    public static final O.S0 f18785d = new O.S0(P.f18668w);

    /* renamed from: e, reason: collision with root package name */
    public static final O.S0 f18786e = new O.S0(P.f18646B);

    /* renamed from: f, reason: collision with root package name */
    public static final O.S0 f18787f = new O.S0(P.f18669x);

    /* renamed from: g, reason: collision with root package name */
    public static final O.S0 f18788g = new O.S0(P.f18670y);

    /* renamed from: h, reason: collision with root package name */
    public static final O.S0 f18789h = new O.S0(P.f18645A);

    /* renamed from: i, reason: collision with root package name */
    public static final O.S0 f18790i = new O.S0(P.f18671z);

    /* renamed from: j, reason: collision with root package name */
    public static final O.S0 f18791j = new O.S0(P.f18647C);

    /* renamed from: k, reason: collision with root package name */
    public static final O.S0 f18792k = new O.S0(P.f18648D);

    /* renamed from: l, reason: collision with root package name */
    public static final O.S0 f18793l = new O.S0(P.f18649E);

    /* renamed from: m, reason: collision with root package name */
    public static final O.S0 f18794m = new O.S0(P.I);

    /* renamed from: n, reason: collision with root package name */
    public static final O.S0 f18795n = new O.S0(P.f18652H);

    /* renamed from: o, reason: collision with root package name */
    public static final O.S0 f18796o = new O.S0(P.J);

    /* renamed from: p, reason: collision with root package name */
    public static final O.S0 f18797p = new O.S0(P.f18653K);

    /* renamed from: q, reason: collision with root package name */
    public static final O.S0 f18798q = new O.S0(P.f18654L);

    /* renamed from: r, reason: collision with root package name */
    public static final O.S0 f18799r = new O.S0(P.f18655M);

    /* renamed from: s, reason: collision with root package name */
    public static final O.S0 f18800s = new O.S0(P.f18650F);

    /* renamed from: t, reason: collision with root package name */
    public static final C0525y f18801t = new C0525y(P.f18651G);

    public static final void a(y0.e0 e0Var, C2435b0 c2435b0, W.a aVar, C0510p c0510p, int i7) {
        c0510p.T(874662829);
        int i8 = i7 | (c0510p.f(e0Var) ? 4 : 2) | (c0510p.f(c2435b0) ? 32 : 16) | (c0510p.h(aVar) ? 256 : 128);
        if ((i8 & 147) == 146 && c0510p.y()) {
            c0510p.M();
        } else {
            C2471u c2471u = (C2471u) e0Var;
            C0507n0 c0507n0A = a.a(c2471u.getAccessibilityManager());
            C0507n0 c0507n0A2 = f18783b.a(c2471u.getAutofill());
            C0507n0 c0507n0A3 = f18784c.a(c2471u.getAutofillTree());
            C0507n0 c0507n0A4 = f18785d.a(c2471u.getClipboardManager());
            C0507n0 c0507n0A5 = f18787f.a(c2471u.getDensity());
            C0507n0 c0507n0A6 = f18788g.a(c2471u.getFocusOwner());
            C0507n0 c0507n0A7 = f18789h.a(c2471u.getFontLoader());
            c0507n0A7.f7107f = false;
            C0507n0 c0507n0A8 = f18790i.a(c2471u.getFontFamilyResolver());
            c0507n0A8.f7107f = false;
            C0486d.b(new C0507n0[]{c0507n0A, c0507n0A2, c0507n0A3, c0507n0A4, c0507n0A5, c0507n0A6, c0507n0A7, c0507n0A8, f18791j.a(c2471u.getHapticFeedBack()), f18792k.a(c2471u.getInputModeManager()), f18793l.a(c2471u.getLayoutDirection()), f18794m.a(c2471u.getTextInputService()), f18795n.a(c2471u.getSoftwareKeyboardController()), f18796o.a(c2471u.getTextToolbar()), f18797p.a(c2435b0), f18798q.a(c2471u.getViewConfiguration()), f18799r.a(c2471u.getWindowInfo()), f18800s.a(c2471u.getPointerIconService()), f18786e.a(c2471u.getGraphicsContext())}, aVar, c0510p, ((i8 >> 3) & 112) | 8);
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new D.K(e0Var, c2435b0, aVar, i7, 8);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
