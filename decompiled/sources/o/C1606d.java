package o;

import l4.AbstractC1420H;
import p.AbstractC1745d;
import p.J0;

/* renamed from: o.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1606d extends kotlin.jvm.internal.m implements e4.n {

    /* renamed from: m, reason: collision with root package name */
    public static final C1606d f13496m = new C1606d(2, 0);

    /* renamed from: n, reason: collision with root package name */
    public static final C1606d f13497n = new C1606d(2, 1);

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f13498l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1606d(int i7, int i8) {
        super(i7);
        this.f13498l = i8;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f13498l) {
            case 0:
                long j7 = ((T0.j) obj).a;
                long j8 = ((T0.j) obj2).a;
                Object obj3 = J0.a;
                return AbstractC1745d.p(1, new T0.j(AbstractC1420H.a(1, 1)));
            default:
                EnumC1624v enumC1624v = (EnumC1624v) obj2;
                return Boolean.valueOf(((EnumC1624v) obj) == enumC1624v && enumC1624v == EnumC1624v.f13540m);
        }
    }
}
