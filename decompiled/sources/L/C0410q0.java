package L;

import b1.AbstractC0703b;
import w0.AbstractC2182Q;

/* renamed from: L.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0410q0 extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ w0.S f5739l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ w0.S f5740m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f5741n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f5742o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f5743p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ w0.S f5744q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ w0.S f5745r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ w0.S f5746s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f5747t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f5748u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f5749v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0410q0(w0.S s7, w0.S s8, int i7, boolean z7, int i8, w0.S s9, w0.S s10, w0.S s11, int i9, int i10, int i11) {
        super(1);
        this.f5739l = s7;
        this.f5740m = s8;
        this.f5741n = i7;
        this.f5742o = z7;
        this.f5743p = i8;
        this.f5744q = s9;
        this.f5745r = s10;
        this.f5746s = s11;
        this.f5747t = i9;
        this.f5748u = i10;
        this.f5749v = i11;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        AbstractC2182Q abstractC2182Q = (AbstractC2182Q) obj;
        int i7 = this.f5741n;
        int i8 = this.f5747t;
        int iA = this.f5743p;
        boolean z7 = this.f5742o;
        w0.S s7 = this.f5739l;
        if (s7 != null) {
            AbstractC2182Q.f(abstractC2182Q, s7, i7, z7 ? iA : AbstractC0703b.a(1, 0.0f, (i8 - s7.f16841l) / 2.0f));
        }
        w0.S s8 = this.f5740m;
        if (s8 != null) {
            AbstractC2182Q.f(abstractC2182Q, s8, (this.f5748u - this.f5749v) - s8.f16840k, z7 ? iA : AbstractC0703b.a(1, 0.0f, (i8 - s8.f16841l) / 2.0f));
        }
        float f5 = M.W.f6267b;
        int i9 = i7 + (s7 != null ? s7.f16840k : 0);
        w0.S s9 = this.f5746s;
        w0.S s10 = this.f5745r;
        w0.S s11 = this.f5744q;
        if (!z7) {
            iA = AbstractC0703b.a(1, 0.0f, (i8 - (((s11 != null ? s11.f16841l : 0) + (s10 != null ? s10.f16841l : 0)) + (s9 != null ? s9.f16841l : 0))) / 2.0f);
        }
        if (s10 != null) {
            AbstractC2182Q.f(abstractC2182Q, s10, i9, iA);
        }
        int i10 = iA + (s10 != null ? s10.f16841l : 0);
        if (s11 != null) {
            AbstractC2182Q.f(abstractC2182Q, s11, i9, i10);
        }
        int i11 = i10 + (s11 != null ? s11.f16841l : 0);
        if (s9 != null) {
            AbstractC2182Q.f(abstractC2182Q, s9, i9, i11);
        }
        return O3.C.a;
    }
}
