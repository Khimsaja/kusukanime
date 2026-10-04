package H5;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class h0 extends n0 implements r {

    /* renamed from: m, reason: collision with root package name */
    public final boolean f3849m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(InterfaceC0265f0 interfaceC0265f0) {
        super(true);
        boolean z7 = true;
        C(interfaceC0265f0);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n0.f3874l;
        InterfaceC0273n interfaceC0273n = (InterfaceC0273n) atomicReferenceFieldUpdater.get(this);
        C0274o c0274o = interfaceC0273n instanceof C0274o ? (C0274o) interfaceC0273n : null;
        if (c0274o == null) {
            z7 = false;
            break;
        }
        n0 n0VarI = c0274o.i();
        while (!n0VarI.w()) {
            InterfaceC0273n interfaceC0273n2 = (InterfaceC0273n) atomicReferenceFieldUpdater.get(n0VarI);
            C0274o c0274o2 = interfaceC0273n2 instanceof C0274o ? (C0274o) interfaceC0273n2 : null;
            if (c0274o2 == null) {
                z7 = false;
                break;
            }
            n0VarI = c0274o2.i();
        }
        this.f3849m = z7;
    }

    public final boolean Z() {
        return F(O3.C.a);
    }

    public final boolean a0(Throwable th) {
        return F(new C0278t(th, false));
    }

    @Override // H5.n0
    public final boolean w() {
        return this.f3849m;
    }

    @Override // H5.n0
    public final boolean y() {
        return true;
    }
}
