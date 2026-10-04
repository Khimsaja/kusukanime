package o;

import l4.AbstractC1420H;
import w0.AbstractC2182Q;
import w0.S;

/* renamed from: o.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1611i extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1613k f13503l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ S f13504m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f13505n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1611i(C1613k c1613k, S s7, long j7) {
        super(1);
        this.f13503l = c1613k;
        this.f13504m = s7;
        this.f13505n = j7;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        a0.i iVar = this.f13503l.f13508b;
        S s7 = this.f13504m;
        AbstractC2182Q.e((AbstractC2182Q) obj, s7, iVar.a(AbstractC1420H.a(s7.f16840k, s7.f16841l), this.f13505n, T0.k.f8844k));
        return O3.C.a;
    }
}
