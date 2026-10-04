package y0;

import w0.C2193k;
import w0.C2199q;
import w0.InterfaceC2172G;
import w0.InterfaceC2174I;
import w0.InterfaceC2175J;

/* renamed from: y0.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC2375w extends InterfaceC2366m {
    default int b(N n7, InterfaceC2172G interfaceC2172G, int i7) {
        int i8 = 1;
        return e(new C2199q(n7, n7.getLayoutDirection()), new C2193k(interfaceC2172G, i8, i8, 2), q0.c.b(0, i7, 7)).l();
    }

    default int c(N n7, InterfaceC2172G interfaceC2172G, int i7) {
        int i8 = 2;
        return e(new C2199q(n7, n7.getLayoutDirection()), new C2193k(interfaceC2172G, i8, i8, 2), q0.c.b(i7, 0, 13)).e();
    }

    InterfaceC2174I e(InterfaceC2175J interfaceC2175J, InterfaceC2172G interfaceC2172G, long j7);

    default int g(N n7, InterfaceC2172G interfaceC2172G, int i7) {
        return e(new C2199q(n7, n7.getLayoutDirection()), new C2193k(interfaceC2172G, 1, 2, 2), q0.c.b(i7, 0, 13)).e();
    }

    default int i(N n7, InterfaceC2172G interfaceC2172G, int i7) {
        return e(new C2199q(n7, n7.getLayoutDirection()), new C2193k(interfaceC2172G, 2, 1, 2), q0.c.b(0, i7, 7)).l();
    }
}
