package y;

import O.C0486d;
import O.C0487d0;
import O.C0493g0;

/* renamed from: y.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2302B {
    public final Object a;

    /* renamed from: b, reason: collision with root package name */
    public final C2303C f17569b;

    /* renamed from: c, reason: collision with root package name */
    public final C0487d0 f17570c = C0486d.J(-1);

    /* renamed from: d, reason: collision with root package name */
    public final C0487d0 f17571d = C0486d.J(0);

    /* renamed from: e, reason: collision with root package name */
    public final C0493g0 f17572e;

    /* renamed from: f, reason: collision with root package name */
    public final C0493g0 f17573f;

    public C2302B(Object obj, C2303C c2303c) {
        this.a = obj;
        this.f17569b = c2303c;
        O.T t7 = O.T.f7049p;
        this.f17572e = C0486d.K(null, t7);
        this.f17573f = C0486d.K(null, t7);
    }

    public final C2302B a() {
        C0487d0 c0487d0 = this.f17571d;
        if (c0487d0.f() == 0) {
            this.f17569b.f17574k.add(this);
            C2302B c2302b = (C2302B) this.f17573f.getValue();
            if (c2302b != null) {
                c2302b.a();
            } else {
                c2302b = null;
            }
            this.f17572e.setValue(c2302b);
        }
        c0487d0.g(c0487d0.f() + 1);
        return this;
    }

    public final void b() {
        C0487d0 c0487d0 = this.f17571d;
        if (c0487d0.f() <= 0) {
            throw new IllegalStateException("Release should only be called once");
        }
        c0487d0.g(c0487d0.f() - 1);
        if (c0487d0.f() == 0) {
            this.f17569b.f17574k.remove(this);
            C0493g0 c0493g0 = this.f17572e;
            C2302B c2302b = (C2302B) c0493g0.getValue();
            if (c2302b != null) {
                c2302b.b();
            }
            c0493g0.setValue(null);
        }
    }
}
