package H;

import C2.C0028a;
import D.AbstractC0047d0;
import l4.AbstractC1420H;

/* renamed from: H.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0199p implements InterfaceC0194k {

    /* renamed from: b, reason: collision with root package name */
    public static final C0199p f2993b = new C0199p(0);

    /* renamed from: c, reason: collision with root package name */
    public static final C0199p f2994c = new C0199p(1);

    /* renamed from: d, reason: collision with root package name */
    public static final C0028a f2995d = new C0028a(6);

    /* renamed from: e, reason: collision with root package name */
    public static final C0028a f2996e = new C0028a(7);

    /* renamed from: f, reason: collision with root package name */
    public static final C0028a f2997f = new C0028a(8);

    /* renamed from: g, reason: collision with root package name */
    public static final C0028a f2998g = new C0028a(9);
    public final /* synthetic */ int a;

    public /* synthetic */ C0199p(int i7) {
        this.a = i7;
    }

    @Override // H.InterfaceC0194k
    public long a(B1.s sVar, int i7) {
        switch (this.a) {
            case 0:
                String str = ((H0.F) sVar.f361e).a.a.a;
                return AbstractC1420H.c(AbstractC0047d0.o(str, i7), AbstractC0047d0.n(str, i7));
            default:
                return ((H0.F) sVar.f361e).k(i7);
        }
    }
}
