package y0;

import e4.InterfaceC0821a;

/* loaded from: classes.dex */
public final class X extends kotlin.jvm.internal.m implements InterfaceC0821a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f17799l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y f17800m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ a0.p f17801n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C2357d f17802o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f17803p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ r f17804q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f17805r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f17806s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ float f17807t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ X(Y y7, a0.p pVar, C2357d c2357d, long j7, r rVar, boolean z7, boolean z8, float f5, int i7) {
        super(0);
        this.f17799l = i7;
        this.f17800m = y7;
        this.f17801n = pVar;
        this.f17802o = c2357d;
        this.f17803p = j7;
        this.f17804q = rVar;
        this.f17805r = z7;
        this.f17806s = z8;
        this.f17807t = f5;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        switch (this.f17799l) {
            case 0:
                a0.p pVarE = AbstractC2359f.e(this.f17801n, this.f17802o.a());
                boolean z7 = this.f17806s;
                Y y7 = this.f17800m;
                C2357d c2357d = this.f17802o;
                long j7 = this.f17803p;
                r rVar = this.f17804q;
                boolean z8 = this.f17805r;
                if (pVarE == null) {
                    y7.U0(c2357d, j7, rVar, z8, z7);
                } else {
                    y7.getClass();
                    float f5 = this.f17807t;
                    rVar.h(pVarE, f5, z7, new X(y7, pVarE, c2357d, j7, rVar, z8, z7, f5, 0));
                }
                break;
            default:
                this.f17800m.f1(AbstractC2359f.e(this.f17801n, this.f17802o.a()), this.f17802o, this.f17803p, this.f17804q, this.f17805r, this.f17806s, this.f17807t);
                break;
        }
        return O3.C.a;
    }
}
