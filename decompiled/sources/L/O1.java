package L;

import e4.InterfaceC0821a;
import j0.InterfaceC1298d;

/* loaded from: classes.dex */
public final class O1 extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f5286l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f5287m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0821a f5288n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f5289o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f5290p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ e4.k f5291q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O1(int i7, float f5, InterfaceC0821a interfaceC0821a, long j7, long j8, e4.k kVar) {
        super(1);
        this.f5286l = i7;
        this.f5287m = f5;
        this.f5288n = interfaceC0821a;
        this.f5289o = j7;
        this.f5290p = j8;
        this.f5291q = kVar;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        InterfaceC1298d interfaceC1298d = (InterfaceC1298d) obj;
        float fB = g0.f.b(interfaceC1298d.d());
        int i7 = this.f5286l;
        float fR0 = this.f5287m;
        if (i7 != 0 && g0.f.b(interfaceC1298d.d()) <= g0.f.d(interfaceC1298d.d())) {
            fR0 += interfaceC1298d.r0(fB);
        }
        float fR02 = fR0 / interfaceC1298d.r0(g0.f.d(interfaceC1298d.d()));
        float fFloatValue = ((Number) this.f5288n.invoke()).floatValue();
        float fMin = Math.min(fFloatValue, fR02) + fFloatValue;
        if (fMin <= 1.0f) {
            Q1.c(interfaceC1298d, fMin, 1.0f, this.f5289o, fB, this.f5286l);
        }
        Q1.c(interfaceC1298d, 0.0f, fFloatValue, this.f5290p, fB, this.f5286l);
        this.f5291q.invoke(interfaceC1298d);
        return O3.C.a;
    }
}
