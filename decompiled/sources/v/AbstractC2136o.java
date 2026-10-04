package v;

import O.C0486d;
import O.C0509o0;
import O.C0510p;
import O.InterfaceC0501k0;
import b1.AbstractC0703b;
import java.util.HashMap;
import l4.AbstractC1420H;
import w0.AbstractC2182Q;
import w0.InterfaceC2172G;
import w0.InterfaceC2173H;
import y0.C2361h;
import y0.C2362i;
import y0.C2363j;
import y0.InterfaceC2364k;

/* renamed from: v.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2136o {
    public static final HashMap a = c(true);

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f16491b = c(false);

    /* renamed from: c, reason: collision with root package name */
    public static final C2135n f16492c = C2135n.f16468b;

    public static final void a(a0.q qVar, C0510p c0510p, int i7) {
        int i8;
        c0510p.T(-211209833);
        if ((i7 & 6) == 0) {
            i8 = (c0510p.f(qVar) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i8 & 3) == 2 && c0510p.y()) {
            c0510p.M();
        } else {
            int i9 = c0510p.f7128P;
            a0.q qVarC = a0.a.c(c0510p, qVar);
            InterfaceC0501k0 interfaceC0501k0M = c0510p.m();
            InterfaceC2364k.f17877j.getClass();
            C2362i c2362i = C2363j.f17871b;
            c0510p.V();
            if (c0510p.f7127O) {
                c0510p.l(c2362i);
            } else {
                c0510p.e0();
            }
            C0486d.R(c0510p, C2363j.f17875f, f16492c);
            C0486d.R(c0510p, C2363j.f17874e, interfaceC0501k0M);
            C0486d.R(c0510p, C2363j.f17873d, qVarC);
            C2361h c2361h = C2363j.f17876g;
            if (c0510p.f7127O || !kotlin.jvm.internal.l.a(c0510p.H(), Integer.valueOf(i9))) {
                AbstractC0703b.u(i9, c0510p, i9, c2361h);
            }
            c0510p.p(true);
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new C2133l(i7, 0, qVar);
        }
    }

    public static final void b(AbstractC2182Q abstractC2182Q, w0.S s7, InterfaceC2172G interfaceC2172G, T0.k kVar, int i7, int i8, a0.i iVar) {
        a0.i iVar2;
        Object objH = interfaceC2172G.h();
        C2132k c2132k = objH instanceof C2132k ? (C2132k) objH : null;
        AbstractC2182Q.e(abstractC2182Q, s7, ((c2132k == null || (iVar2 = c2132k.f16455x) == null) ? iVar : iVar2).a(AbstractC1420H.a(s7.f16840k, s7.f16841l), AbstractC1420H.a(i7, i8), kVar));
    }

    public static final HashMap c(boolean z7) {
        HashMap map = new HashMap(9);
        d(map, z7, a0.b.f10381k);
        d(map, z7, a0.b.f10382l);
        d(map, z7, a0.b.f10383m);
        d(map, z7, a0.b.f10384n);
        d(map, z7, a0.b.f10385o);
        d(map, z7, a0.b.f10386p);
        d(map, z7, a0.b.f10387q);
        d(map, z7, a0.b.f10388r);
        d(map, z7, a0.b.f10389s);
        return map;
    }

    public static final void d(HashMap map, boolean z7, a0.i iVar) {
        map.put(iVar, new C2138q(iVar, z7));
    }

    public static final InterfaceC2173H e(a0.i iVar, boolean z7) {
        InterfaceC2173H interfaceC2173H = (InterfaceC2173H) (z7 ? a : f16491b).get(iVar);
        return interfaceC2173H == null ? new C2138q(iVar, z7) : interfaceC2173H;
    }
}
