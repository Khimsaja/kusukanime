package v;

import java.util.List;
import w0.InterfaceC2173H;
import w0.InterfaceC2174I;
import w0.InterfaceC2175J;

/* renamed from: v.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2135n implements InterfaceC2173H {

    /* renamed from: b, reason: collision with root package name */
    public static final C2135n f16468b = new C2135n(0);

    /* renamed from: c, reason: collision with root package name */
    public static final C2135n f16469c = new C2135n(1);
    public final /* synthetic */ int a;

    public /* synthetic */ C2135n(int i7) {
        this.a = i7;
    }

    @Override // w0.InterfaceC2173H
    public final InterfaceC2174I b(InterfaceC2175J interfaceC2175J, List list, long j7) {
        switch (this.a) {
            case 0:
                return interfaceC2175J.T(T0.a.j(j7), T0.a.i(j7), P3.z.f7780k, C2134m.f16462m);
            default:
                return interfaceC2175J.T(T0.a.f(j7) ? T0.a.h(j7) : 0, T0.a.e(j7) ? T0.a.g(j7) : 0, P3.z.f7780k, C2134m.f16466q);
        }
    }
}
