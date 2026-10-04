package o;

import O.R0;
import j0.InterfaceC1298d;

/* renamed from: o.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1590B extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f13465l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f13466m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f13467n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1590B(long j7, R0 r02) {
        super(1);
        this.f13465l = 2;
        this.f13467n = j7;
        this.f13466m = r02;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        int iOrdinal;
        switch (this.f13465l) {
            case 0:
                C1592D c1592d = (C1592D) this.f13466m;
                int iOrdinal2 = ((EnumC1624v) obj).ordinal();
                long j7 = this.f13467n;
                if (iOrdinal2 != 0 && iOrdinal2 != 1) {
                    if (iOrdinal2 != 2) {
                        throw new D6.r();
                    }
                    C1602N c1602n = c1592d.f13471B.a;
                }
                return new T0.j(j7);
            case 1:
                EnumC1624v enumC1624v = (EnumC1624v) obj;
                C1592D c1592d2 = (C1592D) this.f13466m;
                if (c1592d2.f13475F != null && c1592d2.G0() != null && !kotlin.jvm.internal.l.a(c1592d2.f13475F, c1592d2.G0()) && (iOrdinal = enumC1624v.ordinal()) != 0 && iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        throw new D6.r();
                    }
                    C1602N c1602n2 = c1592d2.f13471B.a;
                }
                return new T0.h(0L);
            default:
                InterfaceC1298d.R((InterfaceC1298d) obj, this.f13467n, 0L, 0L, e3.c.j(((Number) ((R0) this.f13466m).getValue()).floatValue(), 0.0f, 1.0f), 118);
                return O3.C.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1590B(C1592D c1592d, long j7, int i7) {
        super(1);
        this.f13465l = i7;
        this.f13466m = c1592d;
        this.f13467n = j7;
    }
}
