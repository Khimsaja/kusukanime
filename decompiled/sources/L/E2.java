package L;

import b1.AbstractC0703b;
import w0.AbstractC2182Q;
import w0.InterfaceC2175J;

/* loaded from: classes.dex */
public final class E2 extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ w0.S f5045l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f5046m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f5047n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ w0.S f5048o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ w0.S f5049p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ w0.S f5050q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ w0.S f5051r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ w0.S f5052s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ w0.S f5053t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ w0.S f5054u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ w0.S f5055v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ F2 f5056w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f5057x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2175J f5058y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E2(w0.S s7, int i7, int i8, w0.S s8, w0.S s9, w0.S s10, w0.S s11, w0.S s12, w0.S s13, w0.S s14, w0.S s15, F2 f22, int i9, InterfaceC2175J interfaceC2175J) {
        super(1);
        this.f5045l = s7;
        this.f5046m = i7;
        this.f5047n = i8;
        this.f5048o = s8;
        this.f5049p = s9;
        this.f5050q = s10;
        this.f5051r = s11;
        this.f5052s = s12;
        this.f5053t = s13;
        this.f5054u = s14;
        this.f5055v = s15;
        this.f5056w = f22;
        this.f5057x = i9;
        this.f5058y = interfaceC2175J;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        int i7;
        AbstractC2182Q abstractC2182Q = (AbstractC2182Q) obj;
        InterfaceC2175J interfaceC2175J = this.f5058y;
        w0.S s7 = this.f5048o;
        w0.S s8 = this.f5054u;
        w0.S s9 = this.f5055v;
        w0.S s10 = this.f5053t;
        w0.S s11 = this.f5052s;
        w0.S s12 = this.f5051r;
        w0.S s13 = this.f5050q;
        w0.S s14 = this.f5049p;
        int i8 = this.f5047n;
        int i9 = this.f5046m;
        F2 f22 = this.f5056w;
        w0.S s15 = this.f5045l;
        if (s15 != null) {
            boolean z7 = f22.a;
            int i10 = s15.f16841l;
            int i11 = this.f5057x;
            int i12 = i11 + i10;
            float fA = interfaceC2175J.a();
            int i13 = D2.a;
            AbstractC2182Q.e(abstractC2182Q, s8, 0L);
            float f5 = M.W.f6267b;
            int i14 = i8 - (s9 != null ? s9.f16841l : 0);
            if (s13 != null) {
                i7 = i11;
                AbstractC2182Q.f(abstractC2182Q, s13, 0, AbstractC0703b.a(1, 0.0f, (i14 - s13.f16841l) / 2.0f));
            } else {
                i7 = i11;
            }
            AbstractC2182Q.f(abstractC2182Q, s15, s13 != null ? s13.f16840k : 0, (z7 ? AbstractC0703b.a(1, 0.0f, (i14 - s15.f16841l) / 2.0f) : P3.F.W(M.W.f6267b * fA)) - P3.F.W((r2 - i7) * f22.f5068b));
            if (s11 != null) {
                AbstractC2182Q.f(abstractC2182Q, s11, s13 != null ? s13.f16840k : 0, i12);
            }
            int i15 = (s13 != null ? s13.f16840k : 0) + (s11 != null ? s11.f16840k : 0);
            AbstractC2182Q.f(abstractC2182Q, s7, i15, i12);
            if (s14 != null) {
                AbstractC2182Q.f(abstractC2182Q, s14, i15, i12);
            }
            if (s10 != null) {
                AbstractC2182Q.f(abstractC2182Q, s10, (i9 - (s12 != null ? s12.f16840k : 0)) - s10.f16840k, i12);
            }
            if (s12 != null) {
                AbstractC2182Q.f(abstractC2182Q, s12, i9 - s12.f16840k, AbstractC0703b.a(1, 0.0f, (i14 - s12.f16841l) / 2.0f));
            }
            if (s9 != null) {
                AbstractC2182Q.f(abstractC2182Q, s9, 0, i14);
            }
        } else {
            boolean z8 = f22.a;
            float fA2 = interfaceC2175J.a();
            int i16 = D2.a;
            AbstractC2182Q.e(abstractC2182Q, s8, 0L);
            float f7 = M.W.f6267b;
            int i17 = i8 - (s9 != null ? s9.f16841l : 0);
            int iW = P3.F.W(f22.f5069c.f16423b * fA2);
            if (s13 != null) {
                AbstractC2182Q.f(abstractC2182Q, s13, 0, AbstractC0703b.a(1, 0.0f, (i17 - s13.f16841l) / 2.0f));
            }
            if (s11 != null) {
                AbstractC2182Q.f(abstractC2182Q, s11, s13 != null ? s13.f16840k : 0, D2.d(z8, i17, iW, s11));
            }
            int i18 = (s13 != null ? s13.f16840k : 0) + (s11 != null ? s11.f16840k : 0);
            AbstractC2182Q.f(abstractC2182Q, s7, i18, D2.d(z8, i17, iW, s7));
            if (s14 != null) {
                AbstractC2182Q.f(abstractC2182Q, s14, i18, D2.d(z8, i17, iW, s14));
            }
            if (s10 != null) {
                AbstractC2182Q.f(abstractC2182Q, s10, (i9 - (s12 != null ? s12.f16840k : 0)) - s10.f16840k, D2.d(z8, i17, iW, s10));
            }
            if (s12 != null) {
                AbstractC2182Q.f(abstractC2182Q, s12, i9 - s12.f16840k, AbstractC0703b.a(1, 0.0f, (i17 - s12.f16841l) / 2.0f));
            }
            if (s9 != null) {
                AbstractC2182Q.f(abstractC2182Q, s9, 0, i17);
            }
        }
        return O3.C.a;
    }
}
