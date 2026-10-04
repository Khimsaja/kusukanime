package z0;

/* renamed from: z0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2438d extends AbstractC2434b {

    /* renamed from: e, reason: collision with root package name */
    public static C2438d f18743e;

    /* renamed from: c, reason: collision with root package name */
    public H0.F f18744c;

    /* renamed from: d, reason: collision with root package name */
    public F0.n f18745d;

    @Override // z0.AbstractC2434b
    public final int[] a(int i7) {
        int iC;
        if (c().length() <= 0 || i7 >= c().length()) {
            return null;
        }
        try {
            F0.n nVar = this.f18745d;
            if (nVar == null) {
                kotlin.jvm.internal.l.l("node");
                throw null;
            }
            int iRound = Math.round(nVar.e().b());
            if (i7 <= 0) {
                i7 = 0;
            }
            H0.F f5 = this.f18744c;
            if (f5 == null) {
                kotlin.jvm.internal.l.l("layoutResult");
                throw null;
            }
            int iE = f5.e(i7);
            H0.F f7 = this.f18744c;
            if (f7 == null) {
                kotlin.jvm.internal.l.l("layoutResult");
                throw null;
            }
            float fD = f7.f3083b.d(iE) + iRound;
            H0.F f8 = this.f18744c;
            if (f8 == null) {
                kotlin.jvm.internal.l.l("layoutResult");
                throw null;
            }
            if (f8 == null) {
                kotlin.jvm.internal.l.l("layoutResult");
                throw null;
            }
            if (fD < f8.f3083b.d(r0.f3132f - 1)) {
                H0.F f9 = this.f18744c;
                if (f9 == null) {
                    kotlin.jvm.internal.l.l("layoutResult");
                    throw null;
                }
                iC = f9.f3083b.c(fD);
            } else {
                H0.F f10 = this.f18744c;
                if (f10 == null) {
                    kotlin.jvm.internal.l.l("layoutResult");
                    throw null;
                }
                iC = f10.f3083b.f3132f;
            }
            return b(i7, e(iC - 1, S0.h.f8712k) + 1);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    @Override // z0.AbstractC2434b
    public final int[] d(int i7) {
        int iC;
        if (c().length() <= 0 || i7 <= 0) {
            return null;
        }
        try {
            F0.n nVar = this.f18745d;
            if (nVar == null) {
                kotlin.jvm.internal.l.l("node");
                throw null;
            }
            int iRound = Math.round(nVar.e().b());
            int length = c().length();
            if (length <= i7) {
                i7 = length;
            }
            H0.F f5 = this.f18744c;
            if (f5 == null) {
                kotlin.jvm.internal.l.l("layoutResult");
                throw null;
            }
            int iE = f5.e(i7);
            H0.F f7 = this.f18744c;
            if (f7 == null) {
                kotlin.jvm.internal.l.l("layoutResult");
                throw null;
            }
            float fD = f7.f3083b.d(iE) - iRound;
            if (fD > 0.0f) {
                H0.F f8 = this.f18744c;
                if (f8 == null) {
                    kotlin.jvm.internal.l.l("layoutResult");
                    throw null;
                }
                iC = f8.f3083b.c(fD);
            } else {
                iC = 0;
            }
            if (i7 == c().length() && iC < iE) {
                iC++;
            }
            return b(e(iC, S0.h.f8713l), i7);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public final int e(int i7, S0.h hVar) {
        H0.F f5 = this.f18744c;
        if (f5 == null) {
            kotlin.jvm.internal.l.l("layoutResult");
            throw null;
        }
        int iH = f5.h(i7);
        H0.F f7 = this.f18744c;
        if (f7 == null) {
            kotlin.jvm.internal.l.l("layoutResult");
            throw null;
        }
        if (hVar != f7.i(iH)) {
            H0.F f8 = this.f18744c;
            if (f8 != null) {
                return f8.h(i7);
            }
            kotlin.jvm.internal.l.l("layoutResult");
            throw null;
        }
        if (this.f18744c != null) {
            return r6.d(i7, false) - 1;
        }
        kotlin.jvm.internal.l.l("layoutResult");
        throw null;
    }
}
