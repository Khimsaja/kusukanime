package L;

import O.C0486d;
import O.C0510p;
import O.InterfaceC0501k0;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import b1.AbstractC0703b;
import f.AbstractC0841b;
import io.ktor.util.GzipHeaderFlags;
import v.AbstractC2130i;
import v.AbstractC2136o;
import v.C2140t;
import v.C2141u;
import w0.InterfaceC2173H;
import y0.C2361h;
import y0.C2362i;
import y0.C2363j;
import y0.InterfaceC2364k;

/* renamed from: L.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0351b extends kotlin.jvm.internal.m implements e4.n {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f5458l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ W.a f5459m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0351b(W.a aVar, int i7, byte b4) {
        super(2);
        this.f5458l = i7;
        this.f5459m = aVar;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        C2141u c2141u = C2141u.a;
        a0.n nVar = a0.n.a;
        O3.C c2 = O3.C.a;
        W.a aVar = this.f5459m;
        switch (this.f5458l) {
            case 0:
                C0510p c0510p = (C0510p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0510p.y()) {
                    c0510p.M();
                } else {
                    if (1.0f <= 0.0d) {
                        throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero");
                    }
                    a0.q qVarK = androidx.compose.foundation.layout.a.g(new LayoutWeightElement(1.0f, false), AbstractC0379i.f5603g).k(new HorizontalAlignElement(a0.b.f10393w));
                    InterfaceC2173H interfaceC2173HE = AbstractC2136o.e(a0.b.f10381k, false);
                    int i7 = c0510p.f7128P;
                    InterfaceC0501k0 interfaceC0501k0M = c0510p.m();
                    a0.q qVarC = a0.a.c(c0510p, qVarK);
                    InterfaceC2364k.f17877j.getClass();
                    C2362i c2362i = C2363j.f17871b;
                    c0510p.V();
                    if (c0510p.f7127O) {
                        c0510p.l(c2362i);
                    } else {
                        c0510p.e0();
                    }
                    C0486d.R(c0510p, C2363j.f17875f, interfaceC2173HE);
                    C0486d.R(c0510p, C2363j.f17874e, interfaceC0501k0M);
                    C2361h c2361h = C2363j.f17876g;
                    if (c0510p.f7127O || !kotlin.jvm.internal.l.a(c0510p.H(), Integer.valueOf(i7))) {
                        AbstractC0703b.u(i7, c0510p, i7, c2361h);
                    }
                    C0486d.R(c0510p, C2363j.f17873d, qVarC);
                    aVar.invoke(c0510p, 0);
                    c0510p.p(true);
                }
                return c2;
            case 1:
                ((Number) obj2).intValue();
                int iV = C0486d.V(439);
                float f5 = AbstractC0379i.a;
                float f7 = AbstractC0379i.a;
                AbstractC0379i.b(aVar, (C0510p) obj, iV);
                return c2;
            case 2:
                C0510p c0510p2 = (C0510p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0510p2.y()) {
                    c0510p2.M();
                } else {
                    C2140t c2140tA = v.r.a(AbstractC2130i.f16445c, a0.b.f10393w, c0510p2, 0);
                    int i8 = c0510p2.f7128P;
                    InterfaceC0501k0 interfaceC0501k0M2 = c0510p2.m();
                    a0.q qVarC2 = a0.a.c(c0510p2, nVar);
                    InterfaceC2364k.f17877j.getClass();
                    C2362i c2362i2 = C2363j.f17871b;
                    c0510p2.V();
                    if (c0510p2.f7127O) {
                        c0510p2.l(c2362i2);
                    } else {
                        c0510p2.e0();
                    }
                    C0486d.R(c0510p2, C2363j.f17875f, c2140tA);
                    C0486d.R(c0510p2, C2363j.f17874e, interfaceC0501k0M2);
                    C2361h c2361h2 = C2363j.f17876g;
                    if (c0510p2.f7127O || !kotlin.jvm.internal.l.a(c0510p2.H(), Integer.valueOf(i8))) {
                        AbstractC0703b.u(i8, c0510p2, i8, c2361h2);
                    }
                    C0486d.R(c0510p2, C2363j.f17873d, qVarC2);
                    aVar.invoke(c2141u, c0510p2, 6);
                    c0510p2.p(true);
                }
                return c2;
            case 3:
                C0510p c0510p3 = (C0510p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0510p3.y()) {
                    c0510p3.M();
                } else {
                    C2140t c2140tA2 = v.r.a(AbstractC2130i.f16445c, a0.b.f10393w, c0510p3, 0);
                    int i9 = c0510p3.f7128P;
                    InterfaceC0501k0 interfaceC0501k0M3 = c0510p3.m();
                    a0.q qVarC3 = a0.a.c(c0510p3, nVar);
                    InterfaceC2364k.f17877j.getClass();
                    C2362i c2362i3 = C2363j.f17871b;
                    c0510p3.V();
                    if (c0510p3.f7127O) {
                        c0510p3.l(c2362i3);
                    } else {
                        c0510p3.e0();
                    }
                    C0486d.R(c0510p3, C2363j.f17875f, c2140tA2);
                    C0486d.R(c0510p3, C2363j.f17874e, interfaceC0501k0M3);
                    C2361h c2361h3 = C2363j.f17876g;
                    if (c0510p3.f7127O || !kotlin.jvm.internal.l.a(c0510p3.H(), Integer.valueOf(i9))) {
                        AbstractC0703b.u(i9, c0510p3, i9, c2361h3);
                    }
                    C0486d.R(c0510p3, C2363j.f17873d, qVarC3);
                    aVar.invoke(c2141u, c0510p3, 6);
                    c0510p3.p(true);
                }
                return c2;
            case GzipHeaderFlags.EXTRA /* 4 */:
                C0510p c0510p4 = (C0510p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0510p4.y()) {
                    c0510p4.M();
                } else {
                    if (1.0f <= 0.0d) {
                        throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero");
                    }
                    a0.q qVarL = androidx.compose.foundation.layout.a.l(new LayoutWeightElement(1.0f, true), 0, 0.0f, 0, 0.0f, 10);
                    InterfaceC2173H interfaceC2173HE2 = AbstractC2136o.e(a0.b.f10381k, false);
                    int i10 = c0510p4.f7128P;
                    InterfaceC0501k0 interfaceC0501k0M4 = c0510p4.m();
                    a0.q qVarC4 = a0.a.c(c0510p4, qVarL);
                    InterfaceC2364k.f17877j.getClass();
                    C2362i c2362i4 = C2363j.f17871b;
                    c0510p4.V();
                    if (c0510p4.f7127O) {
                        c0510p4.l(c2362i4);
                    } else {
                        c0510p4.e0();
                    }
                    C0486d.R(c0510p4, C2363j.f17875f, interfaceC2173HE2);
                    C0486d.R(c0510p4, C2363j.f17874e, interfaceC0501k0M4);
                    C2361h c2361h4 = C2363j.f17876g;
                    if (c0510p4.f7127O || !kotlin.jvm.internal.l.a(c0510p4.H(), Integer.valueOf(i10))) {
                        AbstractC0703b.u(i10, c0510p4, i10, c2361h4);
                    }
                    C0486d.R(c0510p4, C2363j.f17873d, qVarC4);
                    aVar.invoke(c0510p4, 0);
                    c0510p4.p(true);
                }
                return c2;
            case 5:
                C0510p c0510p5 = (C0510p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0510p5.y()) {
                    c0510p5.M();
                } else {
                    aVar.invoke(c0510p5, 0);
                }
                return c2;
            case 6:
                C0510p c0510p6 = (C0510p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0510p6.y()) {
                    c0510p6.M();
                } else {
                    a0.q qVarC5 = androidx.compose.ui.layout.a.c(nVar, "Container");
                    InterfaceC2173H interfaceC2173HE3 = AbstractC2136o.e(a0.b.f10381k, true);
                    int i11 = c0510p6.f7128P;
                    InterfaceC0501k0 interfaceC0501k0M5 = c0510p6.m();
                    a0.q qVarC6 = a0.a.c(c0510p6, qVarC5);
                    InterfaceC2364k.f17877j.getClass();
                    C2362i c2362i5 = C2363j.f17871b;
                    c0510p6.V();
                    if (c0510p6.f7127O) {
                        c0510p6.l(c2362i5);
                    } else {
                        c0510p6.e0();
                    }
                    C0486d.R(c0510p6, C2363j.f17875f, interfaceC2173HE3);
                    C0486d.R(c0510p6, C2363j.f17874e, interfaceC0501k0M5);
                    C2361h c2361h5 = C2363j.f17876g;
                    if (c0510p6.f7127O || !kotlin.jvm.internal.l.a(c0510p6.H(), Integer.valueOf(i11))) {
                        AbstractC0703b.u(i11, c0510p6, i11, c2361h5);
                    }
                    C0486d.R(c0510p6, C2363j.f17873d, qVarC6);
                    aVar.invoke(c0510p6, 0);
                    c0510p6.p(true);
                }
                return c2;
            case 7:
                C0510p c0510p7 = (C0510p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0510p7.y()) {
                    c0510p7.M();
                } else {
                    aVar.invoke(v.N.a, c0510p7, 6);
                }
                return c2;
            default:
                ((Number) obj2).intValue();
                AbstractC0841b.b(aVar, (C0510p) obj, C0486d.V(7));
                return c2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0351b(W.a aVar, int i7, int i8) {
        super(2);
        this.f5458l = i8;
        switch (i8) {
            case 8:
                this.f5459m = aVar;
                super(2);
                break;
            default:
                float f5 = AbstractC0379i.a;
                float f7 = AbstractC0379i.a;
                this.f5459m = aVar;
                break;
        }
    }
}
