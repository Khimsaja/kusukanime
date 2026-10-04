package O1;

import y1.C2392n;
import y1.C2393o;

/* renamed from: O1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0528b implements a0 {

    /* renamed from: k, reason: collision with root package name */
    public final a0 f7410k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f7411l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0529c f7412m;

    public C0528b(C0529c c0529c, a0 a0Var) {
        this.f7412m = c0529c;
        this.f7410k = a0Var;
    }

    @Override // O1.a0
    public final int d(F.w wVar, G1.f fVar, int i7) {
        C0529c c0529c = this.f7412m;
        if (c0529c.h()) {
            return -3;
        }
        if (this.f7411l) {
            fVar.f575l = 4;
            return -4;
        }
        long jN = c0529c.n();
        int iD = this.f7410k.d(wVar, fVar, i7);
        if (iD != -5) {
            long j7 = c0529c.f7418p;
            if (j7 == Long.MIN_VALUE || ((iD != -4 || fVar.f2611q < j7) && !(iD == -3 && jN == Long.MIN_VALUE && !fVar.f2610p))) {
                return iD;
            }
            fVar.f();
            fVar.f575l = 4;
            this.f7411l = true;
            return -4;
        }
        C2393o c2393o = (C2393o) wVar.f2038m;
        c2393o.getClass();
        int i8 = c2393o.f18095H;
        int i9 = c2393o.f18094G;
        if (i9 == 0 && i8 == 0) {
            return -5;
        }
        if (c0529c.f7417o != 0) {
            i9 = 0;
        }
        if (c0529c.f7418p != Long.MIN_VALUE) {
            i8 = 0;
        }
        C2392n c2392nA = c2393o.a();
        c2392nA.f18058F = i9;
        c2392nA.f18059G = i8;
        wVar.f2038m = new C2393o(c2392nA);
        return -5;
    }

    @Override // O1.a0
    public final boolean f() {
        return !this.f7412m.h() && this.f7410k.f();
    }

    @Override // O1.a0
    public final void h() {
        this.f7410k.h();
    }

    @Override // O1.a0
    public final int j(long j7) {
        if (this.f7412m.h()) {
            return -3;
        }
        return this.f7410k.j(j7);
    }
}
