package n5;

import java.util.List;
import o5.C1706f;
import o5.C1713m;
import v4.InterfaceC2153a;

/* renamed from: n5.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1586x implements InterfaceC2153a, q5.d {

    /* renamed from: k, reason: collision with root package name */
    public int f13420k;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC1586x)) {
            return false;
        }
        AbstractC1586x abstractC1586x = (AbstractC1586x) obj;
        if (u0() == abstractC1586x.u0()) {
            return AbstractC1566c.z(C1713m.f13813k, w0(), abstractC1586x.w0());
        }
        return false;
    }

    @Override // v4.InterfaceC2153a
    public final v4.h getAnnotations() {
        return AbstractC1571h.a(s0());
    }

    public final int hashCode() {
        int iHashCode;
        int i7 = this.f13420k;
        if (i7 != 0) {
            return i7;
        }
        if (AbstractC1566c.k(this)) {
            iHashCode = super.hashCode();
        } else {
            iHashCode = (u0() ? 1 : 0) + ((q0().hashCode() + (t0().hashCode() * 31)) * 31);
        }
        this.f13420k = iHashCode;
        return iHashCode;
    }

    public abstract g5.o k0();

    public abstract List q0();

    public abstract I s0();

    public abstract M t0();

    public abstract boolean u0();

    public abstract AbstractC1586x v0(C1706f c1706f);

    public abstract a0 w0();
}
