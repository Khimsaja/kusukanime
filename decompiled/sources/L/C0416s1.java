package L;

import w0.AbstractC2182Q;

/* renamed from: L.s1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0416s1 extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ w0.S f5782l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ w0.S f5783m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f5784n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f5785o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ w0.S f5786p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f5787q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f5788r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f5789s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f5790t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0416s1(w0.S s7, w0.S s8, int i7, int i8, w0.S s9, int i9, int i10, int i11, int i12) {
        super(1);
        this.f5782l = s7;
        this.f5783m = s8;
        this.f5784n = i7;
        this.f5785o = i8;
        this.f5786p = s9;
        this.f5787q = i9;
        this.f5788r = i10;
        this.f5789s = i11;
        this.f5790t = i12;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        AbstractC2182Q abstractC2182Q = (AbstractC2182Q) obj;
        w0.S s7 = this.f5782l;
        if (s7 != null) {
            AbstractC2182Q.f(abstractC2182Q, s7, (this.f5789s - s7.f16840k) / 2, (this.f5790t - s7.f16841l) / 2);
        }
        AbstractC2182Q.f(abstractC2182Q, this.f5783m, this.f5784n, this.f5785o);
        AbstractC2182Q.f(abstractC2182Q, this.f5786p, this.f5787q, this.f5788r);
        return O3.C.a;
    }
}
