package f0;

import D.x0;
import c.w;
import m.AbstractC1476F;
import m.C1472B;

/* renamed from: f0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0852e {
    public final x0 a;

    /* renamed from: b, reason: collision with root package name */
    public final w f11390b;

    /* renamed from: c, reason: collision with root package name */
    public final C1472B f11391c;

    /* renamed from: d, reason: collision with root package name */
    public final C1472B f11392d;

    /* renamed from: e, reason: collision with root package name */
    public final C1472B f11393e;

    /* renamed from: f, reason: collision with root package name */
    public final C1472B f11394f;

    public C0852e(x0 x0Var, w wVar) {
        this.a = x0Var;
        this.f11390b = wVar;
        int i7 = AbstractC1476F.a;
        this.f11391c = new C1472B();
        this.f11392d = new C1472B();
        this.f11393e = new C1472B();
        this.f11394f = new C1472B();
    }

    public final boolean a() {
        return this.f11391c.h() || this.f11393e.h() || this.f11392d.h();
    }

    public final void b(C1472B c1472b, Object obj) {
        if (c1472b.a(obj) && this.f11391c.f12866d + this.f11392d.f12866d + this.f11393e.f12866d == 1) {
            this.a.invoke(new w(0, this, C0852e.class, "invalidateNodes", "invalidateNodes()V", 0, 2));
        }
    }
}
