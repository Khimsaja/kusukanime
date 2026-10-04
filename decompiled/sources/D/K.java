package D;

import G2.C0174k;
import L.F1;
import O.C0486d;
import O.C0510p;
import O.InterfaceC0501k0;
import b1.AbstractC0703b;
import f1.AbstractC0870c;
import io.ktor.util.GzipHeaderFlags;
import java.util.ArrayList;
import p.C1746d0;
import v.AbstractC2130i;
import v.AbstractC2136o;
import v.C2140t;
import v.C2141u;
import v.InterfaceC2126e;
import w0.InterfaceC2173H;
import x.C2227a;
import y0.C2361h;
import y0.C2362i;
import y0.C2363j;
import y0.InterfaceC2364k;
import z0.AbstractC2455l0;
import z0.C2435b0;
import z0.C2471u;

/* loaded from: classes.dex */
public final class K extends kotlin.jvm.internal.m implements e4.n {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1061l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f1062m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f1063n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f1064o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ K(Object obj, Object obj2, W.a aVar, int i7, int i8) {
        super(2);
        this.f1061l = i8;
        this.f1063n = obj;
        this.f1064o = obj2;
        this.f1062m = aVar;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        O3.C c2 = O3.C.a;
        Object obj3 = this.f1062m;
        Object obj4 = this.f1064o;
        Object obj5 = this.f1063n;
        switch (this.f1061l) {
            case 0:
                ((Number) obj2).intValue();
                AbstractC0047d0.d((a0.q) obj5, (H.S) obj4, (W.a) obj3, (C0510p) obj, C0486d.V(385));
                return c2;
            case 1:
                ((Number) obj2).intValue();
                q0.c.d((C0174k) obj5, (X.g) obj4, (W.a) obj3, (C0510p) obj, C0486d.V(385));
                return c2;
            case 2:
                float fFloatValue = ((Number) obj).floatValue();
                ((Number) obj2).floatValue();
                H5.D.x((H5.A) obj5, null, new H2.v(fFloatValue, (C1746d0) obj4, (C0174k) obj3, null), 3);
                return c2;
            case 3:
                C0510p c0510p = (C0510p) obj;
                if ((3 & ((Number) obj2).intValue()) == 2 && c0510p.y()) {
                    c0510p.M();
                } else {
                    a0.q qVarI0 = AbstractC0870c.i0(androidx.compose.foundation.layout.a.m(androidx.compose.foundation.layout.a.j((a0.n) obj5, 0.0f, L.C0.f4978d, 1)), (q.o0) obj4);
                    C2140t c2140tA = v.r.a(AbstractC2130i.f16445c, a0.b.f10393w, c0510p, 0);
                    int i7 = c0510p.f7128P;
                    InterfaceC0501k0 interfaceC0501k0M = c0510p.m();
                    a0.q qVarC = a0.a.c(c0510p, qVarI0);
                    InterfaceC2364k.f17877j.getClass();
                    C2362i c2362i = C2363j.f17871b;
                    c0510p.V();
                    if (c0510p.f7127O) {
                        c0510p.l(c2362i);
                    } else {
                        c0510p.e0();
                    }
                    C0486d.R(c0510p, C2363j.f17875f, c2140tA);
                    C0486d.R(c0510p, C2363j.f17874e, interfaceC0501k0M);
                    C2361h c2361h = C2363j.f17876g;
                    if (c0510p.f7127O || !kotlin.jvm.internal.l.a(c0510p.H(), Integer.valueOf(i7))) {
                        AbstractC0703b.u(i7, c0510p, i7, c2361h);
                    }
                    C0486d.R(c0510p, C2363j.f17873d, qVarC);
                    ((W.a) obj3).invoke(C2141u.a, c0510p, 6);
                    c0510p.p(true);
                }
                return c2;
            case GzipHeaderFlags.EXTRA /* 4 */:
                C0510p c0510p2 = (C0510p) obj;
                if ((3 & ((Number) obj2).intValue()) == 2 && c0510p2.y()) {
                    c0510p2.M();
                } else {
                    a0.q qVarC2 = androidx.compose.ui.layout.a.c(a0.n.a, "Container");
                    M.K k7 = new M.K(0, 0, O.Z.class, (O.Z) obj5, "value", "getValue()Ljava/lang/Object;");
                    float f5 = F1.a;
                    a0.q qVarC3 = androidx.compose.ui.draw.a.c(qVarC2, new A3.t(13, k7, (v.Z) obj4));
                    InterfaceC2173H interfaceC2173HE = AbstractC2136o.e(a0.b.f10381k, true);
                    int i8 = c0510p2.f7128P;
                    InterfaceC0501k0 interfaceC0501k0M2 = c0510p2.m();
                    a0.q qVarC4 = a0.a.c(c0510p2, qVarC3);
                    InterfaceC2364k.f17877j.getClass();
                    C2362i c2362i2 = C2363j.f17871b;
                    c0510p2.V();
                    if (c0510p2.f7127O) {
                        c0510p2.l(c2362i2);
                    } else {
                        c0510p2.e0();
                    }
                    C0486d.R(c0510p2, C2363j.f17875f, interfaceC2173HE);
                    C0486d.R(c0510p2, C2363j.f17874e, interfaceC0501k0M2);
                    C2361h c2361h2 = C2363j.f17876g;
                    if (c0510p2.f7127O || !kotlin.jvm.internal.l.a(c0510p2.H(), Integer.valueOf(i8))) {
                        AbstractC0703b.u(i8, c0510p2, i8, c2361h2);
                    }
                    C0486d.R(c0510p2, C2363j.f17873d, qVarC4);
                    ((W.a) obj3).invoke(c0510p2, 0);
                    c0510p2.p(true);
                }
                return c2;
            case 5:
                float fFloatValue2 = ((Number) obj).floatValue();
                ((Number) obj2).floatValue();
                kotlin.jvm.internal.u uVar = (kotlin.jvm.internal.u) obj5;
                s.D0 d02 = (s.D0) obj4;
                long jG = d02.g(d02.c(fFloatValue2 - uVar.f12717k));
                s.D0 d03 = ((s.A0) obj3).a;
                uVar.f12717k += d02.c(d02.f(s.D0.a(d03, d03.f15104h, jG, 1)));
                return c2;
            case 6:
                T0.b bVar = (T0.b) obj;
                long j7 = ((T0.a) obj2).a;
                if (T0.a.h(j7) == Integer.MAX_VALUE) {
                    throw new IllegalArgumentException("LazyVerticalGrid's width should be bound by parent.");
                }
                T0.k kVar = T0.k.f8844k;
                v.Z z7 = (v.Z) obj5;
                int iH = T0.a.h(j7) - bVar.O(androidx.compose.foundation.layout.a.e(z7, kVar) + androidx.compose.foundation.layout.a.f(z7, kVar));
                InterfaceC2126e interfaceC2126e = (InterfaceC2126e) obj3;
                int iO = bVar.O(interfaceC2126e.a());
                int i9 = ((C2227a) obj4).a;
                int i10 = iH - ((i9 - 1) * iO);
                int i11 = i10 / i9;
                int i12 = i10 % i9;
                ArrayList arrayList = new ArrayList(i9);
                int i13 = 0;
                while (i13 < i9) {
                    arrayList.add(Integer.valueOf((i13 < i12 ? 1 : 0) + i11));
                    i13++;
                }
                int[] iArrR0 = P3.q.R0(arrayList);
                int[] iArr = new int[iArrR0.length];
                interfaceC2126e.b(bVar, iH, iArrR0, kVar, iArr);
                return new x.p(iArrR0, iArr);
            case 7:
                C0510p c0510p3 = (C0510p) obj;
                if ((3 & ((Number) obj2).intValue()) == 2 && c0510p3.y()) {
                    c0510p3.M();
                } else {
                    AbstractC2455l0.a((C2471u) obj5, (C2435b0) obj4, (W.a) obj3, c0510p3, 0);
                }
                return c2;
            default:
                ((Number) obj2).intValue();
                AbstractC2455l0.a((y0.e0) obj5, (C2435b0) obj4, (W.a) obj3, (C0510p) obj, C0486d.V(1));
                return c2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ K(Object obj, Object obj2, Object obj3, int i7) {
        super(2);
        this.f1061l = i7;
        this.f1063n = obj;
        this.f1064o = obj2;
        this.f1062m = obj3;
    }
}
