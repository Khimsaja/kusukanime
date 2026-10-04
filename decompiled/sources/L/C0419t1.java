package L;

import w0.AbstractC2182Q;
import w0.InterfaceC2175J;

/* renamed from: L.t1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0419t1 extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ w0.S f5800l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f5801m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f5802n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ w0.S f5803o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f5804p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ float f5805q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ float f5806r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ w0.S f5807s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f5808t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ float f5809u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ w0.S f5810v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f5811w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ float f5812x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f5813y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2175J f5814z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0419t1(w0.S s7, boolean z7, float f5, w0.S s8, int i7, float f7, float f8, w0.S s9, int i8, float f9, w0.S s10, int i9, float f10, int i10, InterfaceC2175J interfaceC2175J) {
        super(1);
        this.f5800l = s7;
        this.f5801m = z7;
        this.f5802n = f5;
        this.f5803o = s8;
        this.f5804p = i7;
        this.f5805q = f7;
        this.f5806r = f8;
        this.f5807s = s9;
        this.f5808t = i8;
        this.f5809u = f9;
        this.f5810v = s10;
        this.f5811w = i9;
        this.f5812x = f10;
        this.f5813y = i10;
        this.f5814z = interfaceC2175J;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        AbstractC2182Q abstractC2182Q = (AbstractC2182Q) obj;
        float f5 = this.f5809u;
        float f7 = this.f5806r;
        w0.S s7 = this.f5800l;
        if (s7 != null) {
            AbstractC2182Q.f(abstractC2182Q, s7, (this.f5813y - s7.f16840k) / 2, P3.F.W((f5 - this.f5814z.O(AbstractC0422u1.f5862e)) + f7));
        }
        if (this.f5801m || this.f5802n != 0.0f) {
            AbstractC2182Q.f(abstractC2182Q, this.f5803o, this.f5804p, P3.F.W(this.f5805q + f7));
        }
        AbstractC2182Q.f(abstractC2182Q, this.f5807s, this.f5808t, P3.F.W(f5 + f7));
        AbstractC2182Q.f(abstractC2182Q, this.f5810v, this.f5811w, P3.F.W(this.f5812x + f7));
        return O3.C.a;
    }
}
