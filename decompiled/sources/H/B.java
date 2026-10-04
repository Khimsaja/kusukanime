package H;

import e5.AbstractC0832b;
import p.C1763o;

/* loaded from: classes.dex */
public final class B extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: m, reason: collision with root package name */
    public static final B f2871m = new B(1, 0);

    /* renamed from: n, reason: collision with root package name */
    public static final B f2872n = new B(1, 1);

    /* renamed from: o, reason: collision with root package name */
    public static final B f2873o = new B(1, 2);

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2874l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ B(int i7, int i8) {
        super(i7);
        this.f2874l = i8;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f2874l) {
            case 0:
                long j7 = ((g0.c) obj).a;
                return AbstractC0832b.x(j7) ? new C1763o(g0.c.d(j7), g0.c.e(j7)) : H.a;
            case 1:
                C1763o c1763o = (C1763o) obj;
                return new g0.c(AbstractC0832b.e(c1763o.a, c1763o.f14083b));
            default:
                return O3.C.a;
        }
    }
}
