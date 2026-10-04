package m0;

import H1.e0;
import T0.k;
import X4.y;
import g0.f;
import h0.C0990m;
import j0.C1296b;
import kotlin.jvm.internal.l;
import y0.C2351F;

/* renamed from: m0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1507b {

    /* renamed from: k, reason: collision with root package name */
    public e0 f12963k;

    /* renamed from: l, reason: collision with root package name */
    public C0990m f12964l;

    /* renamed from: m, reason: collision with root package name */
    public float f12965m = 1.0f;

    /* renamed from: n, reason: collision with root package name */
    public k f12966n = k.f8844k;

    public abstract void c(float f5);

    public abstract void d(C0990m c0990m);

    public final void g(C2351F c2351f, long j7, float f5, C0990m c0990m) {
        if (this.f12965m != f5) {
            c(f5);
            this.f12965m = f5;
        }
        if (!l.a(this.f12964l, c0990m)) {
            d(c0990m);
            this.f12964l = c0990m;
        }
        k layoutDirection = c2351f.getLayoutDirection();
        if (this.f12966n != layoutDirection) {
            f(layoutDirection);
            this.f12966n = layoutDirection;
        }
        C1296b c1296b = c2351f.f17696k;
        float fD = f.d(c1296b.d()) - f.d(j7);
        float fB = f.b(c1296b.d()) - f.b(j7);
        ((y) c1296b.f12205l.f416l).y(0.0f, 0.0f, fD, fB);
        if (f5 > 0.0f) {
            try {
                if (f.d(j7) > 0.0f && f.b(j7) > 0.0f) {
                    i(c2351f);
                }
            } finally {
                ((y) c1296b.f12205l.f416l).y(-0.0f, -0.0f, -fD, -fB);
            }
        }
    }

    public abstract long h();

    public abstract void i(C2351F c2351f);

    public void f(k kVar) {
    }
}
