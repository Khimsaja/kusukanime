package H2;

import G2.AbstractC0170g;
import G2.C0174k;
import o.AbstractC1628z;
import o.C1613k;
import p.AbstractC1745d;

/* loaded from: classes.dex */
public final class y extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: m, reason: collision with root package name */
    public static final y f3669m = new y(1, 0);

    /* renamed from: n, reason: collision with root package name */
    public static final y f3670n = new y(1, 1);

    /* renamed from: o, reason: collision with root package name */
    public static final y f3671o = new y(1, 2);

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f3672l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(int i7, int i8) {
        super(i7);
        this.f3672l = i8;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f3672l) {
            case 0:
                return ((C0174k) obj).f2707p;
            case 1:
                return AbstractC1628z.a(AbstractC1745d.q(700, 0, null, 6), 2);
            case 2:
                return AbstractC1628z.b(AbstractC1745d.q(700, 0, null, 6), 2);
            default:
                G2.y yVar = ((C0174k) ((C1613k) obj).c()).f2703l;
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination", yVar);
                int i7 = G2.y.f2756r;
                for (G2.y yVar2 : AbstractC0170g.b((h) yVar)) {
                    if (yVar2 instanceof h) {
                        ((h) yVar2).getClass();
                    } else if (yVar2 instanceof f) {
                        ((f) yVar2).getClass();
                    }
                }
                return null;
        }
    }
}
