package L;

import b1.AbstractC0703b;
import w0.AbstractC2182Q;
import w0.InterfaceC2175J;

/* loaded from: classes.dex */
public final class G1 extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f5071l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f5072m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ w0.S f5073n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ w0.S f5074o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ w0.S f5075p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ w0.S f5076q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ w0.S f5077r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ w0.S f5078s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ w0.S f5079t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ w0.S f5080u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ w0.S f5081v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ H1 f5082w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2175J f5083x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G1(int i7, int i8, w0.S s7, w0.S s8, w0.S s9, w0.S s10, w0.S s11, w0.S s12, w0.S s13, w0.S s14, w0.S s15, H1 h1, InterfaceC2175J interfaceC2175J) {
        super(1);
        this.f5071l = i7;
        this.f5072m = i8;
        this.f5073n = s7;
        this.f5074o = s8;
        this.f5075p = s9;
        this.f5076q = s10;
        this.f5077r = s11;
        this.f5078s = s12;
        this.f5079t = s13;
        this.f5080u = s14;
        this.f5081v = s15;
        this.f5082w = h1;
        this.f5083x = interfaceC2175J;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        float f5;
        int iA;
        AbstractC2182Q abstractC2182Q = (AbstractC2182Q) obj;
        H1 h1 = this.f5082w;
        float f7 = h1.f5108c;
        InterfaceC2175J interfaceC2175J = this.f5083x;
        float fA = interfaceC2175J.a();
        T0.k layoutDirection = interfaceC2175J.getLayoutDirection();
        float f8 = F1.a;
        AbstractC2182Q.e(abstractC2182Q, this.f5080u, 0L);
        float f9 = M.W.f6267b;
        w0.S s7 = this.f5081v;
        int i7 = this.f5071l - (s7 != null ? s7.f16841l : 0);
        v.Z z7 = h1.f5109d;
        int iW = P3.F.W(z7.f16423b * fA);
        int iW2 = P3.F.W(androidx.compose.foundation.layout.a.f(z7, layoutDirection) * fA);
        float f10 = M.W.f6268c * fA;
        w0.S s8 = this.f5073n;
        if (s8 != null) {
            AbstractC2182Q.f(abstractC2182Q, s8, 0, AbstractC0703b.a(1, 0.0f, (i7 - s8.f16841l) / 2.0f));
        }
        boolean z8 = h1.f5107b;
        w0.S s9 = this.f5078s;
        if (s9 != null) {
            if (z8) {
                f5 = 2.0f;
                iA = AbstractC0703b.a(1, 0.0f, (i7 - s9.f16841l) / 2.0f);
            } else {
                f5 = 2.0f;
                iA = iW;
            }
            AbstractC2182Q.f(abstractC2182Q, s9, P3.F.W(s8 == null ? 0.0f : (1 - f7) * (s8.f16840k - f10)) + iW2, P3.F.H(f7, iA, -(s9.f16841l / 2)));
        } else {
            f5 = 2.0f;
        }
        w0.S s10 = this.f5075p;
        if (s10 != null) {
            AbstractC2182Q.f(abstractC2182Q, s10, s8 != null ? s8.f16840k : 0, F1.e(z8, i7, iW, s9, s10));
        }
        int i8 = (s8 != null ? s8.f16840k : 0) + (s10 != null ? s10.f16840k : 0);
        w0.S s11 = this.f5077r;
        AbstractC2182Q.f(abstractC2182Q, s11, i8, F1.e(z8, i7, iW, s9, s11));
        w0.S s12 = this.f5079t;
        if (s12 != null) {
            AbstractC2182Q.f(abstractC2182Q, s12, i8, F1.e(z8, i7, iW, s9, s12));
        }
        int i9 = this.f5072m;
        w0.S s13 = this.f5074o;
        w0.S s14 = this.f5076q;
        if (s14 != null) {
            AbstractC2182Q.f(abstractC2182Q, s14, (i9 - (s13 != null ? s13.f16840k : 0)) - s14.f16840k, F1.e(z8, i7, iW, s9, s14));
        }
        if (s13 != null) {
            AbstractC2182Q.f(abstractC2182Q, s13, i9 - s13.f16840k, AbstractC0703b.a(1, 0.0f, (i7 - s13.f16841l) / f5));
        }
        if (s7 != null) {
            AbstractC2182Q.f(abstractC2182Q, s7, 0, i7);
        }
        return O3.C.a;
    }
}
