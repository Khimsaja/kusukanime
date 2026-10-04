package L;

import j0.InterfaceC1298d;
import p.C1720G;

/* loaded from: classes.dex */
public final class J1 extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f5145l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ j0.h f5146m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C1720G f5147n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C1720G f5148o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C1720G f5149p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C1720G f5150q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ float f5151r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f5152s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J1(long j7, j0.h hVar, C1720G c1720g, C1720G c1720g2, C1720G c1720g3, C1720G c1720g4, float f5, long j8) {
        super(1);
        this.f5145l = j7;
        this.f5146m = hVar;
        this.f5147n = c1720g;
        this.f5148o = c1720g2;
        this.f5149p = c1720g3;
        this.f5150q = c1720g4;
        this.f5151r = f5;
        this.f5152s = j8;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        float f5;
        InterfaceC1298d interfaceC1298d = (InterfaceC1298d) obj;
        j0.h hVar = this.f5146m;
        Q1.d(interfaceC1298d, 0.0f, 360.0f, this.f5145l, hVar);
        float fFloatValue = (((Number) this.f5147n.f13856n.getValue()).floatValue() * 216.0f) % 360.0f;
        float fFloatValue2 = ((Number) this.f5148o.f13856n.getValue()).floatValue();
        C1720G c1720g = this.f5149p;
        float fAbs = Math.abs(fFloatValue2 - ((Number) c1720g.f13856n.getValue()).floatValue());
        float fFloatValue3 = ((Number) c1720g.f13856n.getValue()).floatValue() + ((Number) this.f5150q.f13856n.getValue()).floatValue() + (fFloatValue - 90.0f);
        if (hVar.f12209c == 0) {
            f5 = 0.0f;
        } else {
            f5 = ((this.f5151r / (Q1.f5311e / 2)) * 57.29578f) / 2.0f;
        }
        Q1.d(interfaceC1298d, fFloatValue3 + f5, Math.max(fAbs, 0.1f), this.f5152s, hVar);
        return O3.C.a;
    }
}
