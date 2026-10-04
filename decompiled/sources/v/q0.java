package v;

import l4.AbstractC1420H;
import w0.AbstractC2182Q;
import w0.InterfaceC2175J;

/* loaded from: classes.dex */
public final class q0 extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ r0 f16501l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f16502m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ w0.S f16503n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f16504o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2175J f16505p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(r0 r0Var, int i7, w0.S s7, int i8, InterfaceC2175J interfaceC2175J) {
        super(1);
        this.f16501l = r0Var;
        this.f16502m = i7;
        this.f16503n = s7;
        this.f16504o = i8;
        this.f16505p = interfaceC2175J;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [e4.n, kotlin.jvm.internal.m] */
    @Override // e4.k
    public final Object invoke(Object obj) {
        ?? r02 = this.f16501l.f16507y;
        w0.S s7 = this.f16503n;
        AbstractC2182Q.e((AbstractC2182Q) obj, s7, ((T0.h) r02.invoke(new T0.j(AbstractC1420H.a(this.f16502m - s7.f16840k, this.f16504o - s7.f16841l)), this.f16505p.getLayoutDirection())).a);
        return O3.C.a;
    }
}
