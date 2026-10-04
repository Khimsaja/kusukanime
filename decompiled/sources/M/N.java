package M;

import h0.C0970O;
import p.s0;

/* loaded from: classes.dex */
public final class N extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f6232l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ s0 f6233m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ N(s0 s0Var, int i7) {
        super(1);
        this.f6232l = i7;
        this.f6233m = s0Var;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f6232l) {
            case 0:
                ((C0970O) obj).b(((Number) this.f6233m.f14105t.getValue()).floatValue());
                break;
            default:
                ((C0970O) obj).b(((Number) this.f6233m.f14105t.getValue()).floatValue());
                break;
        }
        return O3.C.a;
    }
}
