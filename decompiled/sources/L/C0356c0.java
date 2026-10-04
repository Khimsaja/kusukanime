package L;

import e5.AbstractC0832b;
import j0.InterfaceC1298d;

/* renamed from: L.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0356c0 extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f5471l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f5472m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0356c0(float f5, long j7) {
        super(1);
        this.f5471l = f5;
        this.f5472m = j7;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        InterfaceC1298d interfaceC1298d = (InterfaceC1298d) obj;
        float f5 = this.f5471l;
        float f7 = 2;
        interfaceC1298d.U(this.f5472m, AbstractC0832b.e(0.0f, interfaceC1298d.x(f5) / f7), AbstractC0832b.e(g0.f.d(interfaceC1298d.d()), interfaceC1298d.x(f5) / f7), interfaceC1298d.x(f5), (480 & 16) != 0 ? 0 : 0);
        return O3.C.a;
    }
}
