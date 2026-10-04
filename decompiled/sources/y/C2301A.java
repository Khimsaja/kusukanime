package y;

import O.C0486d;
import O.C0493g0;
import O.R0;

/* renamed from: y.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2301A implements R0 {

    /* renamed from: k, reason: collision with root package name */
    public final int f17565k;

    /* renamed from: l, reason: collision with root package name */
    public final int f17566l;

    /* renamed from: m, reason: collision with root package name */
    public final C0493g0 f17567m;

    /* renamed from: n, reason: collision with root package name */
    public int f17568n;

    public C2301A(int i7, int i8, int i9) {
        this.f17565k = i8;
        this.f17566l = i9;
        int i10 = (i7 / i8) * i8;
        this.f17567m = C0486d.K(e3.c.L(Math.max(i10 - i9, 0), i10 + i8 + i9), O.T.f7049p);
        this.f17568n = i7;
    }

    public final void a(int i7) {
        if (i7 != this.f17568n) {
            this.f17568n = i7;
            int i8 = this.f17565k;
            int i9 = (i7 / i8) * i8;
            int i10 = this.f17566l;
            this.f17567m.setValue(e3.c.L(Math.max(i9 - i10, 0), i9 + i8 + i10));
        }
    }

    @Override // O.R0
    public final Object getValue() {
        return (k4.g) this.f17567m.getValue();
    }
}
