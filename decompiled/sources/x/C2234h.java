package x;

import C2.H;
import D.C0064m;
import O.C0509o0;
import O.C0510p;
import e5.AbstractC0832b;
import v.C2133l;
import y.InterfaceC2339t;

/* renamed from: x.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2234h implements InterfaceC2339t {
    public final v a;

    /* renamed from: b, reason: collision with root package name */
    public final C2233g f17209b;

    /* renamed from: c, reason: collision with root package name */
    public final H f17210c;

    public C2234h(v vVar, C2233g c2233g, H h7) {
        this.a = vVar;
        this.f17209b = c2233g;
        this.f17210c = h7;
    }

    @Override // y.InterfaceC2339t
    public final int a(Object obj) {
        return this.f17210c.a(obj);
    }

    @Override // y.InterfaceC2339t
    public final int b() {
        return this.f17209b.b0().f666l;
    }

    @Override // y.InterfaceC2339t
    public final Object c(int i7) {
        Object objH = this.f17210c.h(i7);
        return objH == null ? this.f17209b.c0(i7) : objH;
    }

    @Override // y.InterfaceC2339t
    public final Object d(int i7) {
        return this.f17209b.X(i7);
    }

    @Override // y.InterfaceC2339t
    public final void e(int i7, Object obj, C0510p c0510p, int i8) {
        c0510p.T(1493551140);
        int i9 = (c0510p.d(i7) ? 4 : 2) | i8 | (c0510p.h(obj) ? 32 : 16) | (c0510p.f(this) ? 256 : 128);
        if ((i9 & 147) == 146 && c0510p.y()) {
            c0510p.M();
        } else {
            AbstractC0832b.d(obj, i7, this.a.f17292o, W.f.b(726189336, new C2133l(i7, 2, this), c0510p), c0510p, ((i9 >> 3) & 14) | 3072 | ((i9 << 3) & 112));
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new C0064m(this, i7, obj, i8, 9);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2234h)) {
            return false;
        }
        return kotlin.jvm.internal.l.a(this.f17209b, ((C2234h) obj).f17209b);
    }

    public final int hashCode() {
        return this.f17209b.hashCode();
    }
}
