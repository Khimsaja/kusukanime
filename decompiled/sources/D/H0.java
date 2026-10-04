package D;

import O.C0486d;
import s.InterfaceC1946w0;

/* loaded from: classes.dex */
public final class H0 implements InterfaceC1946w0 {
    public final /* synthetic */ InterfaceC1946w0 a;

    /* renamed from: b, reason: collision with root package name */
    public final O.E f1040b;

    /* renamed from: c, reason: collision with root package name */
    public final O.E f1041c;

    public H0(InterfaceC1946w0 interfaceC1946w0, J0 j02) {
        this.a = interfaceC1946w0;
        this.f1040b = C0486d.D(new G0(j02, 1));
        this.f1041c = C0486d.D(new G0(j02, 0));
    }

    @Override // s.InterfaceC1946w0
    public final boolean a() {
        return ((Boolean) this.f1041c.getValue()).booleanValue();
    }

    @Override // s.InterfaceC1946w0
    public final boolean b() {
        return this.a.b();
    }

    @Override // s.InterfaceC1946w0
    public final boolean c() {
        return ((Boolean) this.f1040b.getValue()).booleanValue();
    }

    @Override // s.InterfaceC1946w0
    public final float d(float f5) {
        return this.a.d(f5);
    }

    @Override // s.InterfaceC1946w0
    public final Object e(q.X x7, e4.n nVar, S3.c cVar) {
        return this.a.e(x7, nVar, cVar);
    }
}
