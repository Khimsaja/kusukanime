package n5;

import java.util.List;
import o5.C1706f;

/* loaded from: classes.dex */
public final class C extends B {

    /* renamed from: l, reason: collision with root package name */
    public final M f13350l;

    /* renamed from: m, reason: collision with root package name */
    public final List f13351m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f13352n;

    /* renamed from: o, reason: collision with root package name */
    public final g5.o f13353o;

    /* renamed from: p, reason: collision with root package name */
    public final e4.k f13354p;

    public C(M m7, List list, boolean z7, g5.o oVar, e4.k kVar) {
        kotlin.jvm.internal.l.f("constructor", m7);
        kotlin.jvm.internal.l.f("arguments", list);
        kotlin.jvm.internal.l.f("memberScope", oVar);
        this.f13350l = m7;
        this.f13351m = list;
        this.f13352n = z7;
        this.f13353o = oVar;
        this.f13354p = kVar;
        if (!(oVar instanceof p5.g) || (oVar instanceof p5.m)) {
            return;
        }
        throw new IllegalStateException("SimpleTypeImpl should not be created for error type: " + oVar + '\n' + m7);
    }

    @Override // n5.B
    /* renamed from: A0 */
    public final B x0(boolean z7) {
        return z7 == this.f13352n ? this : z7 ? new A(this, 1) : new A(this, 0);
    }

    @Override // n5.B
    /* renamed from: B0 */
    public final B z0(I i7) {
        kotlin.jvm.internal.l.f("newAttributes", i7);
        return i7.isEmpty() ? this : new D(this, i7);
    }

    @Override // n5.AbstractC1586x
    public final g5.o k0() {
        return this.f13353o;
    }

    @Override // n5.AbstractC1586x
    public final List q0() {
        return this.f13351m;
    }

    @Override // n5.AbstractC1586x
    public final I s0() {
        I.f13362l.getClass();
        return I.f13363m;
    }

    @Override // n5.AbstractC1586x
    public final M t0() {
        return this.f13350l;
    }

    @Override // n5.AbstractC1586x
    public final boolean u0() {
        return this.f13352n;
    }

    @Override // n5.AbstractC1586x
    /* renamed from: v0 */
    public final AbstractC1586x y0(C1706f c1706f) {
        kotlin.jvm.internal.l.f("kotlinTypeRefiner", c1706f);
        B b4 = (B) this.f13354p.invoke(c1706f);
        return b4 == null ? this : b4;
    }

    @Override // n5.a0
    public final a0 y0(C1706f c1706f) {
        kotlin.jvm.internal.l.f("kotlinTypeRefiner", c1706f);
        B b4 = (B) this.f13354p.invoke(c1706f);
        return b4 == null ? this : b4;
    }
}
