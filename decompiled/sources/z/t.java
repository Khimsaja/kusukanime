package z;

import D.C0064m;
import O.C0509o0;
import O.C0510p;
import e5.AbstractC0832b;
import v.C2133l;
import y.InterfaceC2339t;

/* loaded from: classes.dex */
public final class t implements InterfaceC2339t {
    public final C2425d a;

    /* renamed from: b, reason: collision with root package name */
    public final s f18509b;

    /* renamed from: c, reason: collision with root package name */
    public final C2.H f18510c;

    public t(C2425d c2425d, s sVar, C2.H h7) {
        this.a = c2425d;
        this.f18509b = sVar;
        this.f18510c = h7;
    }

    @Override // y.InterfaceC2339t
    public final int a(Object obj) {
        return this.f18510c.a(obj);
    }

    @Override // y.InterfaceC2339t
    public final int b() {
        return this.f18509b.b0().f666l;
    }

    @Override // y.InterfaceC2339t
    public final Object c(int i7) {
        Object objH = this.f18510c.h(i7);
        return objH == null ? this.f18509b.c0(i7) : objH;
    }

    @Override // y.InterfaceC2339t
    public final void e(int i7, Object obj, C0510p c0510p, int i8) {
        C0510p c0510p2;
        Object obj2;
        int i9;
        c0510p.T(-1201380429);
        int i10 = (c0510p.d(i7) ? 4 : 2) | i8 | (c0510p.h(obj) ? 32 : 16) | (c0510p.f(this) ? 256 : 128);
        if ((i10 & 147) == 146 && c0510p.y()) {
            c0510p.M();
            i9 = i7;
            obj2 = obj;
            c0510p2 = c0510p;
        } else {
            c0510p2 = c0510p;
            AbstractC0832b.d(obj, i7, this.a.f18428z, W.f.b(1142237095, new C2133l(i7, 3, this), c0510p), c0510p2, ((i10 >> 3) & 14) | 3072 | ((i10 << 3) & 112));
            obj2 = obj;
            i9 = i7;
        }
        C0509o0 c0509o0S = c0510p2.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new C0064m(this, i9, obj2, i8, 11);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        return kotlin.jvm.internal.l.a(this.f18509b, ((t) obj).f18509b);
    }

    public final int hashCode() {
        return this.f18509b.hashCode();
    }
}
