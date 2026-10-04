package L;

import e4.InterfaceC0821a;
import java.util.List;
import java.util.NoSuchElementException;
import w0.InterfaceC2172G;
import w0.InterfaceC2173H;
import w0.InterfaceC2174I;
import w0.InterfaceC2175J;

/* renamed from: L.r1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0413r1 implements InterfaceC2173H {
    public final /* synthetic */ InterfaceC0821a a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ W.a f5761b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f5762c;

    public C0413r1(InterfaceC0821a interfaceC0821a, W.a aVar, boolean z7) {
        this.a = interfaceC0821a;
        this.f5761b = aVar;
        this.f5762c = z7;
    }

    @Override // w0.InterfaceC2173H
    public final InterfaceC2174I b(InterfaceC2175J interfaceC2175J, List list, long j7) {
        Object obj;
        w0.S sB;
        w0.S sB2;
        C0413r1 c0413r1 = this;
        float fFloatValue = ((Number) c0413r1.a.invoke()).floatValue();
        long jA = T0.a.a(j7, 0, 0, 0, 0, 10);
        int size = list.size();
        int i7 = 0;
        while (i7 < size) {
            InterfaceC2172G interfaceC2172G = (InterfaceC2172G) list.get(i7);
            if (kotlin.jvm.internal.l.a(androidx.compose.ui.layout.a.a(interfaceC2172G), "icon")) {
                w0.S sB3 = interfaceC2172G.b(jA);
                char c2 = 2;
                float f5 = 2;
                int iO = interfaceC2175J.O(AbstractC0422u1.f5861d * f5) + sB3.f16840k;
                int iW = P3.F.W(iO * fFloatValue);
                int iO2 = interfaceC2175J.O(AbstractC0422u1.f5862e * f5) + sB3.f16841l;
                int size2 = list.size();
                int i8 = 0;
                while (i8 < size2) {
                    InterfaceC2172G interfaceC2172G2 = (InterfaceC2172G) list.get(i8);
                    char c4 = c2;
                    float f7 = fFloatValue;
                    if (kotlin.jvm.internal.l.a(androidx.compose.ui.layout.a.a(interfaceC2172G2), "indicatorRipple")) {
                        if (!(iO >= 0 && iO2 >= 0)) {
                            android.support.v4.media.session.b.H("width(" + iO + ") and height(" + iO2 + ") must be >= 0");
                            throw null;
                        }
                        float f8 = f5;
                        w0.S sB4 = interfaceC2172G2.b(q0.c.x(iO, iO, iO2, iO2));
                        int size3 = list.size();
                        int i9 = 0;
                        while (true) {
                            if (i9 >= size3) {
                                obj = null;
                                break;
                            }
                            obj = list.get(i9);
                            int i10 = size3;
                            int i11 = i9;
                            if (kotlin.jvm.internal.l.a(androidx.compose.ui.layout.a.a((InterfaceC2172G) obj), "indicator")) {
                                break;
                            }
                            i9 = i11 + 1;
                            size3 = i10;
                        }
                        InterfaceC2172G interfaceC2172G3 = (InterfaceC2172G) obj;
                        if (interfaceC2172G3 == null) {
                            sB = null;
                        } else {
                            if (iW < 0 || iO2 < 0) {
                                android.support.v4.media.session.b.H("width(" + iW + ") and height(" + iO2 + ") must be >= 0");
                                throw null;
                            }
                            sB = interfaceC2172G3.b(q0.c.x(iW, iW, iO2, iO2));
                        }
                        W.a aVar = c0413r1.f5761b;
                        if (aVar != null) {
                            int size4 = list.size();
                            for (int i12 = 0; i12 < size4; i12++) {
                                InterfaceC2172G interfaceC2172G4 = (InterfaceC2172G) list.get(i12);
                                if (kotlin.jvm.internal.l.a(androidx.compose.ui.layout.a.a(interfaceC2172G4), "label")) {
                                    sB2 = interfaceC2172G4.b(jA);
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                        sB2 = null;
                        P3.z zVar = P3.z.f7780k;
                        if (aVar == null) {
                            int iH = T0.a.h(j7);
                            int iU = q0.c.u(interfaceC2175J.O(AbstractC0422u1.a), j7);
                            return interfaceC2175J.T(iH, iU, zVar, new C0416s1(sB, sB3, (iH - sB3.f16840k) / 2, (iU - sB3.f16841l) / 2, sB4, (iH - sB4.f16840k) / 2, (iU - sB4.f16841l) / 2, iH, iU));
                        }
                        kotlin.jvm.internal.l.c(sB2);
                        float f9 = sB3.f16841l;
                        float f10 = AbstractC0422u1.f5862e;
                        float fX = interfaceC2175J.x(f10) + f9;
                        float f11 = AbstractC0422u1.f5860c;
                        float fX2 = interfaceC2175J.x(f11) + fX + sB2.f16841l;
                        float fI = (T0.a.i(j7) - fX2) / f8;
                        float fX3 = interfaceC2175J.x(f10);
                        if (fI < fX3) {
                            fI = fX3;
                        }
                        float f12 = (fI * f8) + fX2;
                        boolean z7 = c0413r1.f5762c;
                        float f13 = (1 - f7) * ((z7 ? fI : (f12 - sB3.f16841l) / f8) - fI);
                        float fX4 = interfaceC2175J.x(f11) + interfaceC2175J.x(f10) + sB3.f16841l + fI;
                        int iH2 = T0.a.h(j7);
                        return interfaceC2175J.T(iH2, P3.F.W(f12), zVar, new C0419t1(sB, z7, f7, sB2, (iH2 - sB2.f16840k) / 2, fX4, f13, sB3, (iH2 - sB3.f16840k) / 2, fI, sB4, (iH2 - sB4.f16840k) / 2, fI - interfaceC2175J.x(f10), iH2, interfaceC2175J));
                    }
                    i8++;
                    c0413r1 = this;
                    c2 = c4;
                    fFloatValue = f7;
                    f5 = f5;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            i7++;
            c0413r1 = this;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
