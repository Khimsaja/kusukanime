package o4;

import A4.AbstractC0011d;
import C2.C0034g;
import H4.C0248b;
import j5.C1354i;
import j5.C1355j;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import k5.C1397a;
import m5.C1523l;
import m5.InterfaceC1525n;
import n5.C1574k;
import o5.C1710j;
import o5.C1712l;
import o5.InterfaceC1711k;
import r4.AbstractC1880i;
import r4.C1883l;
import r4.C1885n;
import s4.C2015a;
import t4.C2056g;
import t4.C2059j;
import t4.EnumC2057h;
import w4.C2211a;
import w4.InterfaceC2212b;
import w4.InterfaceC2214d;
import x4.C2255A;
import x4.C2286m;
import z4.C2490b;
import z4.C2493e;
import z4.C2494f;

/* loaded from: classes.dex */
public abstract class y0 {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();

    public static final C2494f a(Class cls) {
        InterfaceC2212b interfaceC2212bJ;
        InterfaceC2214d interfaceC2214dJ;
        kotlin.jvm.internal.l.f("<this>", cls);
        ClassLoader classLoaderD = AbstractC0011d.d(cls);
        G0 g02 = new G0(classLoaderD);
        ConcurrentHashMap concurrentHashMap = a;
        WeakReference weakReference = (WeakReference) concurrentHashMap.get(g02);
        if (weakReference != null) {
            C2494f c2494f = (C2494f) weakReference.get();
            if (c2494f != null) {
                return c2494f;
            }
            concurrentHashMap.remove(g02, weakReference);
        }
        C2490b c2490b = new C2490b(classLoaderD);
        ClassLoader classLoader = O3.C.class.getClassLoader();
        kotlin.jvm.internal.l.e("getClassLoader(...)", classLoader);
        C2490b c2490b2 = new C2490b(classLoader);
        C2490b c2490b3 = new C2490b(classLoaderD);
        String str = "runtime module for " + classLoaderD;
        C2493e c2493e = C2493e.f19032k;
        C2493e c2493e2 = C2493e.f19033l;
        kotlin.jvm.internal.l.f("moduleName", str);
        C1523l c1523l = new C1523l("DeserializationComponentsForJava.ModuleData");
        EnumC2057h[] enumC2057hArr = EnumC2057h.f16059k;
        C2059j c2059j = new C2059j(c1523l);
        C2255A c2255a = new C2255A(W4.e.g("<" + str + '>'), c1523l, c2059j, 56);
        InterfaceC1525n interfaceC1525n = c1523l.a;
        interfaceC1525n.l();
        try {
            if (c2059j.a != null) {
                throw new AssertionError("Built-ins module is already set: " + c2059j.a + " (attempting to reset to " + c2255a + ")");
            }
            c2059j.a = c2255a;
            interfaceC1525n.k();
            c2059j.f16061f = new C1883l(c2255a, 1);
            P4.e eVar = new P4.e();
            C0034g c0034g = new C0034g(16, false);
            A2.b bVar = new A2.b(c1523l, c2255a);
            P4.f fVar = P4.f.f7796l;
            O3.h hVar = new O3.h(1, 9, 0);
            H4.s sVar = H4.r.f3745d;
            O3.h hVar2 = sVar.f3747b;
            H4.B b4 = (hVar2 == null || hVar2.f7524n - hVar.f7524n > 0) ? sVar.a : sVar.f3748c;
            kotlin.jvm.internal.l.f("globalReportLevel", b4);
            H.N n7 = new H.N(new H4.v(b4, b4 == H4.B.f3683m ? null : b4), new A4.j(2, hVar));
            I4.h hVar3 = I4.h.f4062c;
            I4.h hVar4 = I4.h.a;
            P3.y yVar = P3.y.f7779k;
            R1.i iVar = new R1.i(c1523l);
            u4.N n8 = u4.N.f16297m;
            C4.b bVar2 = C4.b.a;
            C1885n c1885n = new C1885n(c2255a, bVar);
            C0248b c0248b = new C0248b(n7);
            K4.b bVar3 = K4.b.f4723k;
            O4.d dVar = new O4.d();
            H4.l lVar = H4.l.a;
            InterfaceC1711k.f13810b.getClass();
            C1712l c1712l = C1710j.f13809b;
            K4.d dVar2 = new K4.d(new K4.a(c1523l, c2490b3, c2490b, eVar, hVar3, c2493e, hVar4, iVar, c2493e2, c0034g, fVar, n8, bVar2, c2255a, c1885n, c0248b, dVar, lVar, bVar3, c1712l, n7, new P4.f()));
            T4.f fVar2 = T4.f.f9107g;
            kotlin.jvm.internal.l.f("metadataVersion", fVar2);
            L2.e eVar2 = new L2.e(8, c2490b, eVar);
            B0.b bVar4 = new B0.b(c2255a, bVar, c1523l, c2490b);
            bVar4.f280p = fVar2;
            List listH = P3.r.H(C1574k.a);
            AbstractC1880i abstractC1880i = c2255a.f17339n;
            C2059j c2059j2 = abstractC1880i instanceof C2059j ? (C2059j) abstractC1880i : null;
            P4.f fVar3 = P4.f.f7795k;
            if (c2059j2 == null || (interfaceC2212bJ = c2059j2.J()) == null) {
                interfaceC2212bJ = C2211a.f17092b;
            }
            InterfaceC2212b interfaceC2212b = interfaceC2212bJ;
            if (c2059j2 == null || (interfaceC2214dJ = c2059j2.J()) == null) {
                interfaceC2214dJ = C2211a.f17094d;
            }
            C1354i c1354i = new C1354i(c1523l, c2255a, eVar2, bVar4, dVar2, c2493e, fVar3, yVar, bVar, interfaceC2212b, interfaceC2214dJ, V4.g.a, c1712l, new R1.i(c1523l), listH, C1355j.f12436o);
            eVar.a = c1354i;
            c0034g.f741l = new X4.y(9, dVar2);
            t4.o oVarJ = c2059j.J();
            t4.o oVarJ2 = c2059j.J();
            R1.i iVar2 = new R1.i(c1523l);
            kotlin.jvm.internal.l.f("additionalClassPartsProvider", oVarJ);
            kotlin.jvm.internal.l.f("platformDependentDeclarationFilter", oVarJ2);
            t4.q qVar = new t4.q(c1523l, c2490b2, c2255a);
            X4.y yVar2 = new X4.y(18, qVar);
            C1397a c1397a = C1397a.f12688m;
            qVar.f16083c = new C1354i(c1523l, c2255a, yVar2, new L2.e(c2255a, bVar, c1397a), qVar, P3.r.I(new C2015a(c1523l, c2255a), new C2056g(c1523l, c2255a)), bVar, oVarJ, oVarJ2, c1397a.a, c1712l, iVar2, 262144);
            c2255a.f17342q = new T4.i(P3.m.u0(new C2255A[]{c2255a}));
            c2255a.f17343r = new C2286m("CompositeProvider@RuntimeModuleData for " + c2255a, P3.r.I(dVar2, qVar));
            C2494f c2494f2 = new C2494f(c1354i, new B2.l(eVar, c2490b));
            while (true) {
                WeakReference weakReference2 = (WeakReference) concurrentHashMap.putIfAbsent(g02, new WeakReference(c2494f2));
                if (weakReference2 == null) {
                    return c2494f2;
                }
                C2494f c2494f3 = (C2494f) weakReference2.get();
                if (c2494f3 != null) {
                    return c2494f3;
                }
                concurrentHashMap.remove(g02, weakReference2);
            }
        } finally {
        }
    }
}
