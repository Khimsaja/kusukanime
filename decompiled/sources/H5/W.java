package H5;

/* loaded from: classes.dex */
public abstract class W extends AbstractC0281w {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f3827o = 0;

    /* renamed from: l, reason: collision with root package name */
    public long f3828l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3829m;

    /* renamed from: n, reason: collision with root package name */
    public P3.l f3830n;

    public final void a0(boolean z7) {
        long j7 = this.f3828l - (z7 ? 4294967296L : 1L);
        this.f3828l = j7;
        if (j7 <= 0 && this.f3829m) {
            h0();
        }
    }

    public final void b0(L l7) {
        P3.l lVar = this.f3830n;
        if (lVar == null) {
            lVar = new P3.l();
            this.f3830n = lVar;
        }
        lVar.addLast(l7);
    }

    public abstract Thread c0();

    public final void d0(boolean z7) {
        this.f3828l = (z7 ? 4294967296L : 1L) + this.f3828l;
        if (z7) {
            return;
        }
        this.f3829m = true;
    }

    public abstract long e0();

    public final boolean f0() {
        P3.l lVar = this.f3830n;
        if (lVar == null) {
            return false;
        }
        L l7 = (L) (lVar.isEmpty() ? null : lVar.removeFirst());
        if (l7 == null) {
            return false;
        }
        l7.run();
        return true;
    }

    public void g0(long j7, T t7) {
        E.f3807s.m0(j7, t7);
    }

    public abstract void h0();
}
