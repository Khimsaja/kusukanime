package D;

import O.C0486d;
import O.C0510p;

/* loaded from: classes.dex */
public final class L extends kotlin.jvm.internal.m implements e4.n {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ H.S f1070l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f1071m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1072n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(H.S s7, boolean z7, int i7) {
        super(2);
        this.f1070l = s7;
        this.f1071m = z7;
        this.f1072n = i7;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iV = C0486d.V(this.f1072n | 1);
        AbstractC0047d0.f(this.f1070l, this.f1071m, (C0510p) obj, iV);
        return O3.C.a;
    }
}
