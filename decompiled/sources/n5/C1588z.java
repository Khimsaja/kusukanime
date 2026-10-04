package n5;

import e4.InterfaceC0821a;
import java.util.List;
import m5.C1520i;
import m5.C1523l;
import m5.EnumC1522k;
import o5.C1706f;

/* renamed from: n5.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1588z extends AbstractC1586x {

    /* renamed from: l, reason: collision with root package name */
    public final C1523l f13423l;

    /* renamed from: m, reason: collision with root package name */
    public final InterfaceC0821a f13424m;

    /* renamed from: n, reason: collision with root package name */
    public final C1520i f13425n;

    public C1588z(C1523l c1523l, InterfaceC0821a interfaceC0821a) {
        kotlin.jvm.internal.l.f("storageManager", c1523l);
        this.f13423l = c1523l;
        this.f13424m = interfaceC0821a;
        this.f13425n = new C1520i(c1523l, interfaceC0821a);
    }

    @Override // n5.AbstractC1586x
    public final g5.o k0() {
        return x0().k0();
    }

    @Override // n5.AbstractC1586x
    public final List q0() {
        return x0().q0();
    }

    @Override // n5.AbstractC1586x
    public final I s0() {
        return x0().s0();
    }

    @Override // n5.AbstractC1586x
    public final M t0() {
        return x0().t0();
    }

    public final String toString() {
        C1520i c1520i = this.f13425n;
        return (c1520i.f12982m == EnumC1522k.f12986k || c1520i.f12982m == EnumC1522k.f12987l) ? "<Not computed yet>" : x0().toString();
    }

    @Override // n5.AbstractC1586x
    public final boolean u0() {
        return x0().u0();
    }

    @Override // n5.AbstractC1586x
    /* renamed from: v0 */
    public final AbstractC1586x y0(C1706f c1706f) {
        kotlin.jvm.internal.l.f("kotlinTypeRefiner", c1706f);
        return new C1588z(this.f13423l, new A3.q(12, c1706f, this));
    }

    @Override // n5.AbstractC1586x
    public final a0 w0() {
        AbstractC1586x abstractC1586xX0 = x0();
        while (abstractC1586xX0 instanceof C1588z) {
            abstractC1586xX0 = ((C1588z) abstractC1586xX0).x0();
        }
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type org.jetbrains.kotlin.types.UnwrappedType", abstractC1586xX0);
        return (a0) abstractC1586xX0;
    }

    public final AbstractC1586x x0() {
        return (AbstractC1586x) this.f13425n.invoke();
    }
}
