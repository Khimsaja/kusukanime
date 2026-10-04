package h3;

import B.e;
import D6.r;
import O.C0486d;
import O.C0493g0;
import O.T;
import O.w0;
import O3.q;
import P3.F;
import T0.k;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import f1.AbstractC0870c;
import g0.f;
import h0.AbstractC0982e;
import h0.C0990m;
import h0.InterfaceC0995r;
import j0.C1296b;
import kotlin.jvm.internal.l;
import m0.AbstractC1507b;
import y0.C2351F;

/* renamed from: h3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1006b extends AbstractC1507b implements w0 {

    /* renamed from: o, reason: collision with root package name */
    public final Drawable f11847o;

    /* renamed from: p, reason: collision with root package name */
    public final C0493g0 f11848p;

    /* renamed from: q, reason: collision with root package name */
    public final C0493g0 f11849q;

    /* renamed from: r, reason: collision with root package name */
    public final q f11850r;

    public C1006b(Drawable drawable) {
        l.f("drawable", drawable);
        this.f11847o = drawable;
        T t7 = T.f7049p;
        this.f11848p = C0486d.K(0, t7);
        Object obj = AbstractC1008d.a;
        this.f11849q = C0486d.K(new f((drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) ? 9205357640488583168L : AbstractC0870c.F(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight())), t7);
        this.f11850r = z1.c.C(new e(24, this));
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            return;
        }
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // O.w0
    public final void a() {
        Drawable.Callback callback = (Drawable.Callback) this.f11850r.getValue();
        Drawable drawable = this.f11847o;
        drawable.setCallback(callback);
        drawable.setVisible(true, true);
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }

    @Override // O.w0
    public final void b() {
        e();
    }

    @Override // m0.AbstractC1507b
    public final void c(float f5) {
        this.f11847o.setAlpha(e3.c.k(F.W(f5 * 255), 0, 255));
    }

    @Override // m0.AbstractC1507b
    public final void d(C0990m c0990m) {
        this.f11847o.setColorFilter(c0990m != null ? c0990m.a : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // O.w0
    public final void e() {
        Drawable drawable = this.f11847o;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        drawable.setVisible(false, false);
        drawable.setCallback(null);
    }

    @Override // m0.AbstractC1507b
    public final void f(k kVar) {
        int i7;
        l.f("layoutDirection", kVar);
        int iOrdinal = kVar.ordinal();
        if (iOrdinal != 0) {
            i7 = 1;
            if (iOrdinal != 1) {
                throw new r();
            }
        } else {
            i7 = 0;
        }
        this.f11847o.setLayoutDirection(i7);
    }

    @Override // m0.AbstractC1507b
    public final long h() {
        return ((f) this.f11849q.getValue()).a;
    }

    @Override // m0.AbstractC1507b
    public final void i(C2351F c2351f) {
        C1296b c1296b = c2351f.f17696k;
        InterfaceC0995r interfaceC0995rT = c1296b.f12205l.t();
        ((Number) this.f11848p.getValue()).intValue();
        int iW = F.W(f.d(c1296b.d()));
        int iW2 = F.W(f.b(c1296b.d()));
        Drawable drawable = this.f11847o;
        drawable.setBounds(0, 0, iW, iW2);
        try {
            interfaceC0995rT.l();
            drawable.draw(AbstractC0982e.a(interfaceC0995rT));
        } finally {
            interfaceC0995rT.i();
        }
    }
}
