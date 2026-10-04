package q;

import l4.InterfaceC1443v;
import y0.C2351F;

/* renamed from: q.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1835q extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: m, reason: collision with root package name */
    public static final C1835q f14610m = new C1835q(1, 0);

    /* renamed from: n, reason: collision with root package name */
    public static final C1835q f14611n = new C1835q(1, 1);

    /* renamed from: o, reason: collision with root package name */
    public static final C1835q f14612o = new C1835q(1, 2);

    /* renamed from: p, reason: collision with root package name */
    public static final C1835q f14613p = new C1835q(1, 3);

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f14614l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1835q(int i7, int i8) {
        super(i7);
        this.f14614l = i8;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        O3.C c2 = O3.C.a;
        switch (this.f14614l) {
            case 0:
                ((C2351F) obj).b();
                return c2;
            case 1:
                ((Number) obj).longValue();
                return c2;
            case 2:
                F0.e eVar = F0.e.f2067c;
                InterfaceC1443v[] interfaceC1443vArr = F0.s.a;
                F0.t tVar = F0.q.f2130c;
                InterfaceC1443v interfaceC1443v = F0.s.a[1];
                tVar.a((F0.i) obj, eVar);
                return c2;
            default:
                return new o0(((Number) obj).intValue());
        }
    }
}
