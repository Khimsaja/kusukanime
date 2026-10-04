package L;

import b1.AbstractC0703b;
import w0.AbstractC2182Q;

/* loaded from: classes.dex */
public final class F extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ w0.S f5059l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f5060m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f5061n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ w0.S f5062o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f5063p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ w0.S f5064q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f5065r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(w0.S s7, int i7, int i8, w0.S s8, int i9, w0.S s9, int i10) {
        super(1);
        this.f5059l = s7;
        this.f5060m = i7;
        this.f5061n = i8;
        this.f5062o = s8;
        this.f5063p = i9;
        this.f5064q = s9;
        this.f5065r = i10;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        AbstractC2182Q abstractC2182Q = (AbstractC2182Q) obj;
        int i7 = this.f5061n;
        w0.S s7 = this.f5059l;
        if (s7 != null) {
            AbstractC2182Q.f(abstractC2182Q, s7, 0, AbstractC0703b.a(1, 0.0f, (i7 - this.f5060m) / 2.0f));
        }
        w0.S s8 = this.f5062o;
        int i8 = this.f5063p;
        AbstractC2182Q.f(abstractC2182Q, s8, i8, 0);
        w0.S s9 = this.f5064q;
        if (s9 != null) {
            AbstractC2182Q.f(abstractC2182Q, s9, i8 + s8.f16840k, AbstractC0703b.a(1, 0.0f, (i7 - this.f5065r) / 2.0f));
        }
        return O3.C.a;
    }
}
