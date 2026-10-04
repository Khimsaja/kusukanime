package n5;

import io.ktor.http.LinkHeader;
import java.util.List;
import o5.C1706f;

/* renamed from: n5.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1576m extends B {
    public abstract B C0();

    @Override // n5.a0
    /* renamed from: D0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public B y0(C1706f c1706f) {
        kotlin.jvm.internal.l.f("kotlinTypeRefiner", c1706f);
        B bC0 = C0();
        kotlin.jvm.internal.l.f(LinkHeader.Parameters.Type, bC0);
        return E0(bC0);
    }

    public abstract AbstractC1576m E0(B b4);

    @Override // n5.AbstractC1586x
    public final g5.o k0() {
        return C0().k0();
    }

    @Override // n5.AbstractC1586x
    public final List q0() {
        return C0().q0();
    }

    @Override // n5.AbstractC1586x
    public I s0() {
        return C0().s0();
    }

    @Override // n5.AbstractC1586x
    public final M t0() {
        return C0().t0();
    }

    @Override // n5.AbstractC1586x
    public boolean u0() {
        return C0().u0();
    }
}
