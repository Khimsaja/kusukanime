package L;

import e5.AbstractC0832b;
import f1.AbstractC0870c;
import j0.InterfaceC1298d;

/* loaded from: classes.dex */
public final class N1 extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f5268l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f5269m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N1(long j7, int i7) {
        super(1);
        this.f5268l = j7;
        this.f5269m = i7;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        InterfaceC1298d interfaceC1298d = (InterfaceC1298d) obj;
        float fMin = Math.min(interfaceC1298d.x(I1.f5124d), g0.f.b(interfaceC1298d.d()));
        float fB = (g0.f.b(interfaceC1298d.d()) - fMin) / 2;
        long j7 = this.f5268l;
        if (this.f5269m == 1) {
            float f5 = fMin / 2.0f;
            InterfaceC1298d.u(interfaceC1298d, j7, f5, AbstractC0832b.e((g0.f.d(interfaceC1298d.d()) - f5) - fB, g0.f.b(interfaceC1298d.d()) / 2.0f), 120);
        } else {
            InterfaceC1298d.R(interfaceC1298d, j7, AbstractC0832b.e((g0.f.d(interfaceC1298d.d()) - fMin) - fB, (g0.f.b(interfaceC1298d.d()) - fMin) / 2.0f), AbstractC0870c.F(fMin, fMin), 0.0f, 120);
        }
        return O3.C.a;
    }
}
