package p;

import O.C0486d;
import O.C0493g0;

/* renamed from: p.N, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1727N extends Q4.c {

    /* renamed from: l, reason: collision with root package name */
    public final C0493g0 f13891l;

    /* renamed from: m, reason: collision with root package name */
    public final C0493g0 f13892m;

    public C1727N(Object obj) {
        super(5);
        O.T t7 = O.T.f7049p;
        this.f13891l = C0486d.K(obj, t7);
        this.f13892m = C0486d.K(obj, t7);
    }

    @Override // Q4.c
    public final void H0(Object obj) {
        this.f13891l.setValue(obj);
    }

    @Override // Q4.c
    public final Object v0() {
        return this.f13891l.getValue();
    }

    @Override // Q4.c
    public final Object w0() {
        return this.f13892m.getValue();
    }

    @Override // Q4.c
    public final void J0() {
    }

    @Override // Q4.c
    public final void I0(u0 u0Var) {
    }
}
