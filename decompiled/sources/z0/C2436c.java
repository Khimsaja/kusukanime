package z0;

import java.text.BreakIterator;

/* renamed from: z0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2436c extends AbstractC2434b {

    /* renamed from: e, reason: collision with root package name */
    public static C2436c f18738e;

    /* renamed from: f, reason: collision with root package name */
    public static C2436c f18739f;

    /* renamed from: g, reason: collision with root package name */
    public static C2436c f18740g;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f18741c;

    /* renamed from: d, reason: collision with root package name */
    public Object f18742d;

    @Override // z0.AbstractC2434b
    public final int[] a(int i7) {
        int iE;
        switch (this.f18741c) {
            case 0:
                int length = c().length();
                if (length <= 0 || i7 >= length) {
                    return null;
                }
                if (i7 < 0) {
                    i7 = 0;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.f18742d;
                    if (breakIterator == null) {
                        kotlin.jvm.internal.l.l("impl");
                        throw null;
                    }
                    if (breakIterator.isBoundary(i7)) {
                        BreakIterator breakIterator2 = (BreakIterator) this.f18742d;
                        if (breakIterator2 == null) {
                            kotlin.jvm.internal.l.l("impl");
                            throw null;
                        }
                        int iFollowing = breakIterator2.following(i7);
                        if (iFollowing == -1) {
                            return null;
                        }
                        return b(i7, iFollowing);
                    }
                    BreakIterator breakIterator3 = (BreakIterator) this.f18742d;
                    if (breakIterator3 == null) {
                        kotlin.jvm.internal.l.l("impl");
                        throw null;
                    }
                    i7 = breakIterator3.following(i7);
                } while (i7 != -1);
                return null;
            case 1:
                if (c().length() <= 0 || i7 >= c().length()) {
                    return null;
                }
                if (i7 < 0) {
                    i7 = 0;
                }
                while (!h(i7) && (!h(i7) || (i7 != 0 && h(i7 - 1)))) {
                    BreakIterator breakIterator4 = (BreakIterator) this.f18742d;
                    if (breakIterator4 == null) {
                        kotlin.jvm.internal.l.l("impl");
                        throw null;
                    }
                    i7 = breakIterator4.following(i7);
                    if (i7 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator5 = (BreakIterator) this.f18742d;
                if (breakIterator5 == null) {
                    kotlin.jvm.internal.l.l("impl");
                    throw null;
                }
                int iFollowing2 = breakIterator5.following(i7);
                if (iFollowing2 == -1 || !g(iFollowing2)) {
                    return null;
                }
                return b(i7, iFollowing2);
            default:
                if (c().length() <= 0 || i7 >= c().length()) {
                    return null;
                }
                S0.h hVar = S0.h.f8713l;
                if (i7 < 0) {
                    H0.F f5 = (H0.F) this.f18742d;
                    if (f5 == null) {
                        kotlin.jvm.internal.l.l("layoutResult");
                        throw null;
                    }
                    iE = f5.e(0);
                } else {
                    H0.F f7 = (H0.F) this.f18742d;
                    if (f7 == null) {
                        kotlin.jvm.internal.l.l("layoutResult");
                        throw null;
                    }
                    int iE2 = f7.e(i7);
                    iE = e(iE2, hVar) == i7 ? iE2 : iE2 + 1;
                }
                H0.F f8 = (H0.F) this.f18742d;
                if (f8 == null) {
                    kotlin.jvm.internal.l.l("layoutResult");
                    throw null;
                }
                if (iE >= f8.f3083b.f3132f) {
                    return null;
                }
                return b(e(iE, hVar), e(iE, S0.h.f8712k) + 1);
        }
    }

    @Override // z0.AbstractC2434b
    public final int[] d(int i7) {
        int iE;
        switch (this.f18741c) {
            case 0:
                int length = c().length();
                if (length <= 0 || i7 <= 0) {
                    return null;
                }
                if (i7 > length) {
                    i7 = length;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.f18742d;
                    if (breakIterator == null) {
                        kotlin.jvm.internal.l.l("impl");
                        throw null;
                    }
                    if (breakIterator.isBoundary(i7)) {
                        BreakIterator breakIterator2 = (BreakIterator) this.f18742d;
                        if (breakIterator2 == null) {
                            kotlin.jvm.internal.l.l("impl");
                            throw null;
                        }
                        int iPreceding = breakIterator2.preceding(i7);
                        if (iPreceding == -1) {
                            return null;
                        }
                        return b(iPreceding, i7);
                    }
                    BreakIterator breakIterator3 = (BreakIterator) this.f18742d;
                    if (breakIterator3 == null) {
                        kotlin.jvm.internal.l.l("impl");
                        throw null;
                    }
                    i7 = breakIterator3.preceding(i7);
                } while (i7 != -1);
                return null;
            case 1:
                int length2 = c().length();
                if (length2 <= 0 || i7 <= 0) {
                    return null;
                }
                if (i7 > length2) {
                    i7 = length2;
                }
                while (i7 > 0 && !h(i7 - 1) && !g(i7)) {
                    BreakIterator breakIterator4 = (BreakIterator) this.f18742d;
                    if (breakIterator4 == null) {
                        kotlin.jvm.internal.l.l("impl");
                        throw null;
                    }
                    i7 = breakIterator4.preceding(i7);
                    if (i7 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator5 = (BreakIterator) this.f18742d;
                if (breakIterator5 == null) {
                    kotlin.jvm.internal.l.l("impl");
                    throw null;
                }
                int iPreceding2 = breakIterator5.preceding(i7);
                if (iPreceding2 == -1 || !h(iPreceding2)) {
                    return null;
                }
                if (iPreceding2 == 0 || !h(iPreceding2 - 1)) {
                    return b(iPreceding2, i7);
                }
                return null;
            default:
                if (c().length() <= 0 || i7 <= 0) {
                    return null;
                }
                int length3 = c().length();
                S0.h hVar = S0.h.f8712k;
                if (i7 > length3) {
                    H0.F f5 = (H0.F) this.f18742d;
                    if (f5 == null) {
                        kotlin.jvm.internal.l.l("layoutResult");
                        throw null;
                    }
                    iE = f5.e(c().length());
                } else {
                    H0.F f7 = (H0.F) this.f18742d;
                    if (f7 == null) {
                        kotlin.jvm.internal.l.l("layoutResult");
                        throw null;
                    }
                    int iE2 = f7.e(i7);
                    iE = e(iE2, hVar) + 1 == i7 ? iE2 : iE2 - 1;
                }
                if (iE < 0) {
                    return null;
                }
                return b(e(iE, S0.h.f8713l), e(iE, hVar) + 1);
        }
    }

    public int e(int i7, S0.h hVar) {
        H0.F f5 = (H0.F) this.f18742d;
        if (f5 == null) {
            kotlin.jvm.internal.l.l("layoutResult");
            throw null;
        }
        int iH = f5.h(i7);
        H0.F f7 = (H0.F) this.f18742d;
        if (f7 == null) {
            kotlin.jvm.internal.l.l("layoutResult");
            throw null;
        }
        if (hVar != f7.i(iH)) {
            H0.F f8 = (H0.F) this.f18742d;
            if (f8 != null) {
                return f8.h(i7);
            }
            kotlin.jvm.internal.l.l("layoutResult");
            throw null;
        }
        if (((H0.F) this.f18742d) != null) {
            return r6.d(i7, false) - 1;
        }
        kotlin.jvm.internal.l.l("layoutResult");
        throw null;
    }

    public void f(String str) {
        switch (this.f18741c) {
            case 0:
                this.a = str;
                BreakIterator breakIterator = (BreakIterator) this.f18742d;
                if (breakIterator != null) {
                    breakIterator.setText(str);
                    return;
                } else {
                    kotlin.jvm.internal.l.l("impl");
                    throw null;
                }
            default:
                this.a = str;
                BreakIterator breakIterator2 = (BreakIterator) this.f18742d;
                if (breakIterator2 != null) {
                    breakIterator2.setText(str);
                    return;
                } else {
                    kotlin.jvm.internal.l.l("impl");
                    throw null;
                }
        }
    }

    public boolean g(int i7) {
        if (i7 <= 0 || !h(i7 - 1)) {
            return false;
        }
        return i7 == c().length() || !h(i7);
    }

    public boolean h(int i7) {
        if (i7 < 0 || i7 >= c().length()) {
            return false;
        }
        return Character.isLetterOrDigit(c().codePointAt(i7));
    }
}
