package M;

import e4.InterfaceC0821a;
import p.s0;

/* loaded from: classes.dex */
public final class Q extends kotlin.jvm.internal.m implements InterfaceC0821a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f6242l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ s0 f6243m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Q(s0 s0Var, int i7) {
        super(0);
        this.f6242l = i7;
        this.f6243m = s0Var;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        switch (this.f6242l) {
            case 0:
                return Boolean.valueOf(((Number) this.f6243m.f14105t.getValue()).floatValue() > 0.0f);
            default:
                return Boolean.valueOf(((Number) this.f6243m.f14105t.getValue()).floatValue() > 0.0f);
        }
    }
}
