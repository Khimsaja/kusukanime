package s;

import M.C0459q;
import M.C0460s;

/* loaded from: classes.dex */
public final class W extends P {

    /* renamed from: H, reason: collision with root package name */
    public L2.e f15229H;
    public EnumC1903a0 I;
    public boolean J;

    /* renamed from: K, reason: collision with root package name */
    public e4.o f15230K;

    /* renamed from: L, reason: collision with root package name */
    public e4.o f15231L;

    @Override // s.P
    public final Object N0(N n7, O o7) throws Throwable {
        L2.e eVar = this.f15229H;
        q.X x7 = q.X.f14514l;
        T t7 = new T(n7, this, null);
        eVar.getClass();
        Object objB = ((C0460s) eVar.f6046m).b(x7, new C0459q(eVar, t7, null), o7);
        T3.a aVar = T3.a.f9048k;
        O3.C c2 = O3.C.a;
        if (objB != aVar) {
            objB = c2;
        }
        return objB == aVar ? objB : c2;
    }

    @Override // s.P
    public final void O0(long j7) {
        if (!this.f10414w || kotlin.jvm.internal.l.a(this.f15230K, S.a)) {
            return;
        }
        H5.D.x(u0(), null, new U(this, j7, null), 3);
    }

    @Override // s.P
    public final void P0(long j7) {
        if (!this.f10414w || kotlin.jvm.internal.l.a(this.f15231L, S.f15208b)) {
            return;
        }
        H5.D.x(u0(), null, new V(this, j7, null), 3);
    }

    @Override // s.P
    public final boolean Q0() {
        return this.J;
    }
}
