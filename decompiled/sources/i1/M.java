package i1;

import android.view.WindowInsets;
import d1.C0782a;

/* loaded from: classes.dex */
public class M extends C1047L {

    /* renamed from: n, reason: collision with root package name */
    public C0782a f11959n;

    /* renamed from: o, reason: collision with root package name */
    public C0782a f11960o;

    /* renamed from: p, reason: collision with root package name */
    public C0782a f11961p;

    public M(S s7, WindowInsets windowInsets) {
        super(s7, windowInsets);
        this.f11959n = null;
        this.f11960o = null;
        this.f11961p = null;
    }

    @Override // i1.P
    public C0782a h() {
        if (this.f11960o == null) {
            this.f11960o = C0782a.c(this.f11953c.getMandatorySystemGestureInsets());
        }
        return this.f11960o;
    }

    @Override // i1.P
    public C0782a j() {
        if (this.f11959n == null) {
            this.f11959n = C0782a.c(this.f11953c.getSystemGestureInsets());
        }
        return this.f11959n;
    }

    @Override // i1.P
    public C0782a l() {
        if (this.f11961p == null) {
            this.f11961p = C0782a.c(this.f11953c.getTappableElementInsets());
        }
        return this.f11961p;
    }

    @Override // i1.C1046K, i1.P
    public void r(C0782a c0782a) {
    }
}
