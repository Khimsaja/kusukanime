package i1;

import android.view.WindowInsets;
import d1.C0782a;

/* renamed from: i1.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1046K extends AbstractC1045J {

    /* renamed from: m, reason: collision with root package name */
    public C0782a f11958m;

    public C1046K(S s7, WindowInsets windowInsets) {
        super(s7, windowInsets);
        this.f11958m = null;
    }

    @Override // i1.P
    public S b() {
        return S.b(null, this.f11953c.consumeStableInsets());
    }

    @Override // i1.P
    public S c() {
        return S.b(null, this.f11953c.consumeSystemWindowInsets());
    }

    @Override // i1.P
    public final C0782a i() {
        if (this.f11958m == null) {
            WindowInsets windowInsets = this.f11953c;
            this.f11958m = C0782a.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f11958m;
    }

    @Override // i1.P
    public boolean m() {
        return this.f11953c.isConsumed();
    }

    @Override // i1.P
    public void r(C0782a c0782a) {
        this.f11958m = c0782a;
    }
}
