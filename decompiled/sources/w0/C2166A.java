package w0;

import java.util.List;
import y0.AbstractC2347B;

/* renamed from: w0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2166A extends AbstractC2347B {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2169D f16813b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e4.n f16814c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2166A(C2169D c2169d, e4.n nVar, String str) {
        super(str);
        this.f16813b = c2169d;
        this.f16814c = nVar;
    }

    @Override // w0.InterfaceC2173H
    public final InterfaceC2174I b(InterfaceC2175J interfaceC2175J, List list, long j7) {
        C2169D c2169d = this.f16813b;
        T0.k layoutDirection = interfaceC2175J.getLayoutDirection();
        C2206y c2206y = c2169d.f16823r;
        c2206y.f16891k = layoutDirection;
        c2206y.f16892l = interfaceC2175J.a();
        c2206y.f16893m = interfaceC2175J.n();
        boolean zS = interfaceC2175J.s();
        e4.n nVar = this.f16814c;
        if (zS || c2169d.f16816k.f17673m == null) {
            c2169d.f16819n = 0;
            InterfaceC2174I interfaceC2174I = (InterfaceC2174I) nVar.invoke(c2206y, new T0.a(j7));
            return new C2207z(interfaceC2174I, c2169d, c2169d.f16819n, interfaceC2174I, 1);
        }
        c2169d.f16820o = 0;
        InterfaceC2174I interfaceC2174I2 = (InterfaceC2174I) nVar.invoke(c2169d.f16824s, new T0.a(j7));
        return new C2207z(interfaceC2174I2, c2169d, c2169d.f16820o, interfaceC2174I2, 0);
    }
}
