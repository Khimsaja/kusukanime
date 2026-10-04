package n5;

import java.util.List;

/* renamed from: n5.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1580q extends a0 implements q5.d {

    /* renamed from: l, reason: collision with root package name */
    public final B f13407l;

    /* renamed from: m, reason: collision with root package name */
    public final B f13408m;

    public AbstractC1580q(B b4, B b7) {
        kotlin.jvm.internal.l.f("lowerBound", b4);
        kotlin.jvm.internal.l.f("upperBound", b7);
        this.f13407l = b4;
        this.f13408m = b7;
    }

    public abstract B A0();

    public abstract String B0(Y4.h hVar, Y4.h hVar2);

    @Override // n5.AbstractC1586x
    public g5.o k0() {
        return A0().k0();
    }

    @Override // n5.AbstractC1586x
    public final List q0() {
        return A0().q0();
    }

    @Override // n5.AbstractC1586x
    public final I s0() {
        return A0().s0();
    }

    @Override // n5.AbstractC1586x
    public final M t0() {
        return A0().t0();
    }

    public String toString() {
        return Y4.h.f10164e.U(this);
    }

    @Override // n5.AbstractC1586x
    public final boolean u0() {
        return A0().u0();
    }
}
