package L;

import O.C0486d;
import O.C0510p;
import e4.InterfaceC0821a;

/* renamed from: L.g1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0373g1 extends kotlin.jvm.internal.m implements e4.n {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f5577l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0821a f5578m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f5579n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f5580o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0373g1(long j7, InterfaceC0821a interfaceC0821a, boolean z7, int i7) {
        super(2);
        this.f5577l = j7;
        this.f5578m = interfaceC0821a;
        this.f5579n = z7;
        this.f5580o = i7;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iV = C0486d.V(this.f5580o | 1);
        InterfaceC0821a interfaceC0821a = this.f5578m;
        boolean z7 = this.f5579n;
        AbstractC0381i1.c(this.f5577l, interfaceC0821a, z7, (C0510p) obj, iV);
        return O3.C.a;
    }
}
