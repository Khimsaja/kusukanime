package i1;

import android.view.WindowInsets;
import d1.C0782a;
import h0.AbstractC0979b;

/* renamed from: i1.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1042G extends AbstractC1044I {

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets.Builder f11946c;

    public C1042G() {
        this.f11946c = AbstractC0979b.g();
    }

    @Override // i1.AbstractC1044I
    public S b() {
        a();
        S sB = S.b(null, this.f11946c.build());
        sB.a.p(this.f11947b);
        return sB;
    }

    @Override // i1.AbstractC1044I
    public void d(C0782a c0782a) {
        this.f11946c.setMandatorySystemGestureInsets(c0782a.d());
    }

    @Override // i1.AbstractC1044I
    public void e(C0782a c0782a) {
        this.f11946c.setSystemGestureInsets(c0782a.d());
    }

    @Override // i1.AbstractC1044I
    public void f(C0782a c0782a) {
        this.f11946c.setSystemWindowInsets(c0782a.d());
    }

    @Override // i1.AbstractC1044I
    public void g(C0782a c0782a) {
        this.f11946c.setTappableElementInsets(c0782a.d());
    }

    public C1042G(S s7) {
        WindowInsets.Builder builderG;
        super(s7);
        WindowInsets windowInsetsA = s7.a();
        if (windowInsetsA != null) {
            builderG = AbstractC0979b.h(windowInsetsA);
        } else {
            builderG = AbstractC0979b.g();
        }
        this.f11946c = builderG;
    }
}
