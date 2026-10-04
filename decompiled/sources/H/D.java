package H;

import O.R0;
import e4.InterfaceC0821a;
import p.C1763o;

/* loaded from: classes.dex */
public final class D extends kotlin.jvm.internal.m implements InterfaceC0821a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2877l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ R0 f2878m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ D(R0 r02, int i7) {
        super(0);
        this.f2877l = i7;
        this.f2878m = r02;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        R0 r02 = this.f2878m;
        switch (this.f2877l) {
            case 0:
                C1763o c1763o = H.a;
                return new g0.c(((g0.c) r02.getValue()).a);
            default:
                return (Float) r02.getValue();
        }
    }
}
