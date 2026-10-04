package w;

import C2.H;
import D.C0064m;
import O.C0509o0;
import O.C0510p;
import e5.AbstractC0832b;
import v.C2133l;
import y.InterfaceC2339t;

/* loaded from: classes.dex */
public final class g implements InterfaceC2339t {
    public final u a;

    /* renamed from: b, reason: collision with root package name */
    public final C2165f f16697b;

    /* renamed from: c, reason: collision with root package name */
    public final C2160a f16698c;

    /* renamed from: d, reason: collision with root package name */
    public final H f16699d;

    public g(u uVar, C2165f c2165f, C2160a c2160a, H h7) {
        this.a = uVar;
        this.f16697b = c2165f;
        this.f16698c = c2160a;
        this.f16699d = h7;
    }

    @Override // y.InterfaceC2339t
    public final int a(Object obj) {
        return this.f16699d.a(obj);
    }

    @Override // y.InterfaceC2339t
    public final int b() {
        return this.f16697b.b0().f666l;
    }

    @Override // y.InterfaceC2339t
    public final Object c(int i7) {
        Object objH = this.f16699d.h(i7);
        return objH == null ? this.f16697b.c0(i7) : objH;
    }

    @Override // y.InterfaceC2339t
    public final Object d(int i7) {
        return this.f16697b.X(i7);
    }

    @Override // y.InterfaceC2339t
    public final void e(int i7, Object obj, C0510p c0510p, int i8) {
        c0510p.T(-462424778);
        int i9 = (c0510p.d(i7) ? 4 : 2) | i8 | (c0510p.h(obj) ? 32 : 16) | (c0510p.f(this) ? 256 : 128);
        if ((i9 & 147) == 146 && c0510p.y()) {
            c0510p.M();
        } else {
            AbstractC0832b.d(obj, i7, this.a.f16806q, W.f.b(-824725566, new C2133l(i7, 1, this), c0510p), c0510p, ((i9 >> 3) & 14) | 3072 | ((i9 << 3) & 112));
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new C0064m(this, i7, obj, i8, 8);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        return kotlin.jvm.internal.l.a(this.f16697b, ((g) obj).f16697b);
    }

    public final int hashCode() {
        return this.f16697b.hashCode();
    }
}
