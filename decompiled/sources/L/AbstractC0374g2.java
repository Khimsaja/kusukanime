package L;

import O.C0510p;
import h0.AbstractC0968M;
import h0.InterfaceC0973S;
import io.ktor.util.GzipHeaderFlags;
import p.AbstractC1755i;

/* renamed from: L.g2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0374g2 {
    public static final O.S0 a = new O.S0(O.f5279v);

    public static final InterfaceC0973S a(int i7, C0510p c0510p) {
        C0370f2 c0370f2 = (C0370f2) c0510p.k(a);
        switch (AbstractC1755i.b(i7)) {
            case 0:
                return c0370f2.f5553e;
            case 1:
                return b(c0370f2.f5553e);
            case 2:
                return c0370f2.a;
            case 3:
                return b(c0370f2.a);
            case GzipHeaderFlags.EXTRA /* 4 */:
                return C.e.a;
            case 5:
                return c0370f2.f5552d;
            case 6:
                C.d dVar = c0370f2.f5552d;
                float f5 = (float) 0.0d;
                return C.d.a(dVar, new C.b(f5), null, new C.b(f5), 6);
            case 7:
                return b(c0370f2.f5552d);
            case 8:
                return c0370f2.f5551c;
            case 9:
                return AbstractC0968M.a;
            case 10:
                return c0370f2.f5550b;
            default:
                throw new D6.r();
        }
    }

    public static final C.d b(C.d dVar) {
        float f5 = (float) 0.0d;
        return C.d.a(dVar, null, new C.b(f5), new C.b(f5), 3);
    }
}
