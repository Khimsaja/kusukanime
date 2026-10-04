package u4;

import java.util.List;
import x4.AbstractC2257C;

/* renamed from: u4.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2110p implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public static final C2110p f16333l = new C2110p(0);

    /* renamed from: m, reason: collision with root package name */
    public static final C2110p f16334m = new C2110p(1);

    /* renamed from: n, reason: collision with root package name */
    public static final C2110p f16335n = new C2110p(2);

    /* renamed from: o, reason: collision with root package name */
    public static final C2110p f16336o = new C2110p(3);

    /* renamed from: p, reason: collision with root package name */
    public static final C2110p f16337p = new C2110p(4);

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f16338k;

    public /* synthetic */ C2110p(int i7) {
        this.f16338k = i7;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f16338k) {
            case 0:
                kotlin.jvm.internal.l.f("it", (W4.b) obj);
                return 0;
            case 1:
                InterfaceC2088D interfaceC2088D = (InterfaceC2088D) obj;
                kotlin.jvm.internal.l.f("it", interfaceC2088D);
                return ((AbstractC2257C) interfaceC2088D).f17354o;
            case 2:
                InterfaceC2105k interfaceC2105k = (InterfaceC2105k) obj;
                kotlin.jvm.internal.l.f("it", interfaceC2105k);
                return Boolean.valueOf(interfaceC2105k instanceof InterfaceC2096b);
            case 3:
                kotlin.jvm.internal.l.f("it", (InterfaceC2105k) obj);
                return Boolean.valueOf(!(r2 instanceof InterfaceC2104j));
            default:
                InterfaceC2105k interfaceC2105k2 = (InterfaceC2105k) obj;
                kotlin.jvm.internal.l.f("it", interfaceC2105k2);
                List typeParameters = ((InterfaceC2096b) interfaceC2105k2).getTypeParameters();
                kotlin.jvm.internal.l.e("getTypeParameters(...)", typeParameters);
                return P3.q.l0(typeParameters);
        }
    }
}
