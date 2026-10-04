package v;

import w0.AbstractC2182Q;
import w0.InterfaceC2175J;

/* renamed from: v.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2139s extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ w0.S[] f16508l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C2140t f16509m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f16510n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2175J f16511o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int[] f16512p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2139s(w0.S[] sArr, C2140t c2140t, int i7, InterfaceC2175J interfaceC2175J, int[] iArr) {
        super(1);
        this.f16508l = sArr;
        this.f16509m = c2140t;
        this.f16510n = i7;
        this.f16511o = interfaceC2175J;
        this.f16512p = iArr;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        AbstractC2182Q abstractC2182Q = (AbstractC2182Q) obj;
        w0.S[] sArr = this.f16508l;
        int length = sArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            w0.S s7 = sArr[i7];
            int i9 = i8 + 1;
            kotlin.jvm.internal.l.c(s7);
            Object objH = s7.h();
            d0 d0Var = objH instanceof d0 ? (d0) objH : null;
            T0.k layoutDirection = this.f16511o.getLayoutDirection();
            C2140t c2140t = this.f16509m;
            c2140t.getClass();
            C2143w c2143w = d0Var != null ? d0Var.f16438c : null;
            int i10 = this.f16510n;
            AbstractC2182Q.d(abstractC2182Q, s7, c2143w != null ? c2143w.b(i10 - s7.f16840k, layoutDirection) : c2140t.f16513b.a(0, i10 - s7.f16840k, layoutDirection), this.f16512p[i8]);
            i7++;
            i8 = i9;
        }
        return O3.C.a;
    }
}
