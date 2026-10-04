package L;

import w0.InterfaceC2172G;
import w0.InterfaceC2175J;

/* loaded from: classes.dex */
public final class M1 extends kotlin.jvm.internal.m implements e4.o {

    /* renamed from: l, reason: collision with root package name */
    public static final M1 f5209l = new M1(3);

    @Override // e4.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        InterfaceC2175J interfaceC2175J = (InterfaceC2175J) obj;
        long j7 = ((T0.a) obj3).a;
        int iO = interfaceC2175J.O(Q1.a);
        int i7 = iO * 2;
        w0.S sB = ((InterfaceC2172G) obj2).b(q0.c.H(0, i7, j7));
        int i8 = sB.f16841l - i7;
        return interfaceC2175J.T(sB.f16840k, i8, P3.z.f7780k, new L1(iO, 0, sB));
    }
}
