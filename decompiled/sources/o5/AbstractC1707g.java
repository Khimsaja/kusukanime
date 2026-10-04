package o5;

import F2.G;
import a5.InterfaceC0668b;
import b1.AbstractC0703b;
import f6.AbstractC0905c;
import io.ktor.http.LinkHeader;
import io.ktor.util.GzipHeaderFlags;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.y;
import l5.C1452e;
import n5.AbstractC1566c;
import n5.AbstractC1580q;
import n5.AbstractC1586x;
import n5.B;
import n5.C1575l;
import n5.C1585w;
import n5.E;
import n5.I;
import n5.L;
import n5.M;
import n5.N;
import n5.Q;
import n5.V;
import n5.Y;
import n5.a0;
import n5.b0;
import r4.AbstractC1880i;
import r4.AbstractC1886o;
import u4.C2113t;
import u4.EnumC2100f;
import u4.EnumC2117x;
import u4.InterfaceC2099e;
import u4.InterfaceC2102h;
import u4.InterfaceC2105k;

/* renamed from: o5.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1707g {
    public static final G a = new G("KotlinTypeRefiner", 6);

    public static boolean A(q5.h hVar) {
        if (hVar instanceof M) {
            return AbstractC1880i.H((M) hVar, AbstractC1886o.a);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(hVar);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC0703b.o(y.a, hVar.getClass(), sb).toString());
    }

    public static boolean B(q5.h hVar) {
        kotlin.jvm.internal.l.f("$receiver", hVar);
        if (hVar instanceof M) {
            return ((M) hVar).f() instanceof InterfaceC2099e;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(hVar);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC0703b.o(y.a, hVar.getClass(), sb).toString());
    }

    public static boolean C(q5.h hVar) {
        if (hVar instanceof M) {
            InterfaceC2102h interfaceC2102hF = ((M) hVar).f();
            InterfaceC2099e interfaceC2099e = interfaceC2102hF instanceof InterfaceC2099e ? (InterfaceC2099e) interfaceC2102hF : null;
            return (interfaceC2099e == null || interfaceC2099e.e() != EnumC2117x.f16342l || interfaceC2099e.c() == EnumC2100f.f16313m || interfaceC2099e.c() == EnumC2100f.f16314n || interfaceC2099e.c() == EnumC2100f.f16315o) ? false : true;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(hVar);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC0703b.o(y.a, hVar.getClass(), sb).toString());
    }

    public static boolean D(q5.h hVar) {
        if (hVar instanceof M) {
            return ((M) hVar).e();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(hVar);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC0703b.o(y.a, hVar.getClass(), sb).toString());
    }

    public static boolean E(q5.d dVar) {
        kotlin.jvm.internal.l.f("$receiver", dVar);
        if (dVar instanceof AbstractC1586x) {
            return AbstractC1566c.k((AbstractC1586x) dVar);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(dVar);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC0703b.o(y.a, dVar.getClass(), sb).toString());
    }

    public static boolean F(q5.h hVar) {
        kotlin.jvm.internal.l.f("$receiver", hVar);
        if (hVar instanceof M) {
            InterfaceC2102h interfaceC2102hF = ((M) hVar).f();
            InterfaceC2099e interfaceC2099e = interfaceC2102hF instanceof InterfaceC2099e ? (InterfaceC2099e) interfaceC2102hF : null;
            return (interfaceC2099e != null ? interfaceC2099e.Z() : null) instanceof C2113t;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(hVar);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC0703b.o(y.a, hVar.getClass(), sb).toString());
    }

    public static boolean G(q5.h hVar) {
        kotlin.jvm.internal.l.f("$receiver", hVar);
        if (hVar instanceof M) {
            return hVar instanceof b5.n;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(hVar);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC0703b.o(y.a, hVar.getClass(), sb).toString());
    }

    public static boolean H(q5.h hVar) {
        kotlin.jvm.internal.l.f("$receiver", hVar);
        if (hVar instanceof M) {
            return hVar instanceof C1585w;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(hVar);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC0703b.o(y.a, hVar.getClass(), sb).toString());
    }

    public static boolean I(q5.d dVar) {
        kotlin.jvm.internal.l.f("$receiver", dVar);
        return (dVar instanceof B) && ((B) dVar).u0();
    }

    public static boolean J(q5.h hVar) {
        kotlin.jvm.internal.l.f("$receiver", hVar);
        if (hVar instanceof M) {
            return AbstractC1880i.H((M) hVar, AbstractC1886o.f14988b);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(hVar);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC0703b.o(y.a, hVar.getClass(), sb).toString());
    }

    public static boolean K(q5.d dVar) {
        kotlin.jvm.internal.l.f("$receiver", dVar);
        if (dVar instanceof AbstractC1586x) {
            return Y.e((AbstractC1586x) dVar);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(dVar);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC0703b.o(y.a, dVar.getClass(), sb).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean L(q5.f fVar) {
        kotlin.jvm.internal.l.f("$receiver", fVar);
        if (fVar instanceof AbstractC1586x) {
            return AbstractC1880i.F((AbstractC1586x) fVar);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(fVar);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC0703b.o(y.a, fVar.getClass(), sb).toString());
    }

    public static boolean M(q5.c cVar) {
        if (cVar instanceof C1708h) {
            return ((C1708h) cVar).f13804q;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(cVar);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC0703b.o(y.a, cVar.getClass(), sb).toString());
    }

    public static boolean N(Q q6) {
        kotlin.jvm.internal.l.f("$receiver", q6);
        if (q6 instanceof Q) {
            return q6.c();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(q6);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC0703b.o(y.a, q6.getClass(), sb).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void O(q5.e eVar) {
        kotlin.jvm.internal.l.f("$receiver", eVar);
        if (eVar instanceof B) {
            boolean z7 = ((AbstractC1586x) eVar) instanceof C1575l;
            return;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(eVar);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC0703b.o(y.a, eVar.getClass(), sb).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void P(q5.e eVar) {
        if (eVar instanceof B) {
            boolean z7 = ((AbstractC1586x) eVar) instanceof C1575l;
            return;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(eVar);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC0703b.o(y.a, eVar.getClass(), sb).toString());
    }

    public static B Q(AbstractC1580q abstractC1580q) {
        if (abstractC1580q instanceof AbstractC1580q) {
            return abstractC1580q.f13407l;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(abstractC1580q);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC0703b.o(y.a, abstractC1580q.getClass(), sb).toString());
    }

    public static a0 R(q5.c cVar) {
        if (cVar instanceof C1708h) {
            return ((C1708h) cVar).f13801n;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(cVar);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC0703b.o(y.a, cVar.getClass(), sb).toString());
    }

    public static a0 S(q5.d dVar) {
        if (dVar instanceof a0) {
            return AbstractC1566c.n((a0) dVar, false);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(dVar);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC0703b.o(y.a, dVar.getClass(), sb).toString());
    }

    public static int T(q5.h hVar) {
        kotlin.jvm.internal.l.f("$receiver", hVar);
        if (hVar instanceof M) {
            return ((M) hVar).getParameters().size();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(hVar);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC0703b.o(y.a, hVar.getClass(), sb).toString());
    }

    public static Collection U(InterfaceC1702b interfaceC1702b, q5.e eVar) {
        M mY = interfaceC1702b.y(eVar);
        if (mY instanceof b5.n) {
            return ((b5.n) mY).a;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(eVar);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC0703b.o(y.a, eVar.getClass(), sb).toString());
    }

    public static Q V(InterfaceC0668b interfaceC0668b) {
        kotlin.jvm.internal.l.f("$receiver", interfaceC0668b);
        if (interfaceC0668b instanceof C1709i) {
            return ((C1709i) interfaceC0668b).a;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC0668b);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC0703b.o(y.a, interfaceC0668b.getClass(), sb).toString());
    }

    public static AbstractC1586x W(q5.i iVar, q5.d dVar) {
        kotlin.jvm.internal.l.f("$receiver", iVar);
        kotlin.jvm.internal.l.f(LinkHeader.Parameters.Type, dVar);
        if (!(dVar instanceof a0)) {
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(dVar);
            sb.append(", ");
            throw new IllegalArgumentException(AbstractC0703b.o(y.a, dVar.getClass(), sb).toString());
        }
        if (iVar instanceof V) {
            return ((V) iVar).g((AbstractC1586x) dVar, b0.f13390m);
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(iVar);
        sb2.append(", ");
        throw new IllegalArgumentException(AbstractC0703b.o(y.a, iVar.getClass(), sb2).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C1701a X(InterfaceC1702b interfaceC1702b, q5.e eVar) {
        if (eVar instanceof B) {
            AbstractC1586x abstractC1586x = (AbstractC1586x) eVar;
            return new C1701a(interfaceC1702b, new V(N.f13375b.f(abstractC1586x.t0(), abstractC1586x.q0())));
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(eVar);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC0703b.o(y.a, eVar.getClass(), sb).toString());
    }

    public static Collection Y(q5.h hVar) {
        kotlin.jvm.internal.l.f("$receiver", hVar);
        if (hVar instanceof M) {
            Collection collectionG = ((M) hVar).g();
            kotlin.jvm.internal.l.e("getSupertypes(...)", collectionG);
            return collectionG;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(hVar);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC0703b.o(y.a, hVar.getClass(), sb).toString());
    }

    public static M Z(q5.e eVar) {
        kotlin.jvm.internal.l.f("$receiver", eVar);
        if (eVar instanceof B) {
            return ((B) eVar).t0();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(eVar);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC0703b.o(y.a, eVar.getClass(), sb).toString());
    }

    public static /* synthetic */ void a(int i7) {
        Object[] objArr = new Object[3];
        switch (i7) {
            case 1:
            case GzipHeaderFlags.EXTRA /* 4 */:
                objArr[0] = "b";
                break;
            case 2:
            case 7:
                objArr[0] = "typeCheckingProcedure";
                break;
            case 3:
            default:
                objArr[0] = "a";
                break;
            case 5:
            case 10:
                objArr[0] = "subtype";
                break;
            case 6:
            case 11:
                objArr[0] = "supertype";
                break;
            case 8:
                objArr[0] = LinkHeader.Parameters.Type;
                break;
            case 9:
                objArr[0] = "typeProjection";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerProcedureCallbacksImpl";
        switch (i7) {
            case 3:
            case GzipHeaderFlags.EXTRA /* 4 */:
                objArr[2] = "assertEqualTypeConstructors";
                break;
            case 5:
            case 6:
            case 7:
                objArr[2] = "assertSubtype";
                break;
            case 8:
            case 9:
                objArr[2] = "capture";
                break;
            case 10:
            case 11:
                objArr[2] = "noCorrespondingSupertype";
                break;
            default:
                objArr[2] = "assertEqualTypes";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static C1709i a0(q5.c cVar) {
        kotlin.jvm.internal.l.f("$receiver", cVar);
        if (cVar instanceof C1708h) {
            return ((C1708h) cVar).f13800m;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(cVar);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC0703b.o(y.a, cVar.getClass(), sb).toString());
    }

    public static boolean b(q5.h hVar, q5.h hVar2) {
        kotlin.jvm.internal.l.f("c1", hVar);
        kotlin.jvm.internal.l.f("c2", hVar2);
        if (!(hVar instanceof M)) {
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(hVar);
            sb.append(", ");
            throw new IllegalArgumentException(AbstractC0703b.o(y.a, hVar.getClass(), sb).toString());
        }
        if (hVar2 instanceof M) {
            return hVar.equals(hVar2);
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(hVar2);
        sb2.append(", ");
        throw new IllegalArgumentException(AbstractC0703b.o(y.a, hVar2.getClass(), sb2).toString());
    }

    public static B b0(AbstractC1580q abstractC1580q) {
        if (abstractC1580q instanceof AbstractC1580q) {
            return abstractC1580q.f13408m;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(abstractC1580q);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC0703b.o(y.a, abstractC1580q.getClass(), sb).toString());
    }

    public static int c(q5.d dVar) {
        kotlin.jvm.internal.l.f("$receiver", dVar);
        if (dVar instanceof AbstractC1586x) {
            return ((AbstractC1586x) dVar).q0().size();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(dVar);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC0703b.o(y.a, dVar.getClass(), sb).toString());
    }

    public static B c0(q5.e eVar, boolean z7) {
        kotlin.jvm.internal.l.f("$receiver", eVar);
        if (eVar instanceof B) {
            return ((B) eVar).x0(z7);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(eVar);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC0703b.o(y.a, eVar.getClass(), sb).toString());
    }

    public static q5.g d(q5.e eVar) {
        kotlin.jvm.internal.l.f("$receiver", eVar);
        if (eVar instanceof B) {
            return (q5.g) eVar;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(eVar);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC0703b.o(y.a, eVar.getClass(), sb).toString());
    }

    public static q5.d d0(InterfaceC1702b interfaceC1702b, q5.d dVar) {
        if (dVar instanceof q5.e) {
            return interfaceC1702b.R((q5.e) dVar);
        }
        if (!(dVar instanceof AbstractC1580q)) {
            throw new IllegalStateException("sealed");
        }
        AbstractC1580q abstractC1580q = (AbstractC1580q) dVar;
        return interfaceC1702b.M0(interfaceC1702b.R(interfaceC1702b.m(abstractC1580q)), interfaceC1702b.R(interfaceC1702b.i(abstractC1580q)));
    }

    public static q5.c e(InterfaceC1702b interfaceC1702b, q5.f fVar) {
        kotlin.jvm.internal.l.f("$receiver", fVar);
        if (fVar instanceof B) {
            if (fVar instanceof E) {
                return interfaceC1702b.g0(((E) fVar).f13356l);
            }
            if (fVar instanceof C1708h) {
                return (C1708h) fVar;
            }
            return null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(fVar);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC0703b.o(y.a, fVar.getClass(), sb).toString());
    }

    public static C1575l f(q5.e eVar) {
        kotlin.jvm.internal.l.f("$receiver", eVar);
        if (eVar instanceof B) {
            if (eVar instanceof C1575l) {
                return (C1575l) eVar;
            }
            return null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(eVar);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC0703b.o(y.a, eVar.getClass(), sb).toString());
    }

    public static AbstractC1580q g(q5.d dVar) {
        kotlin.jvm.internal.l.f("$receiver", dVar);
        if (dVar instanceof AbstractC1586x) {
            a0 a0VarW0 = ((AbstractC1586x) dVar).w0();
            if (a0VarW0 instanceof AbstractC1580q) {
                return (AbstractC1580q) a0VarW0;
            }
            return null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(dVar);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC0703b.o(y.a, dVar.getClass(), sb).toString());
    }

    public static B h(q5.d dVar) {
        kotlin.jvm.internal.l.f("$receiver", dVar);
        if (dVar instanceof AbstractC1586x) {
            a0 a0VarW0 = ((AbstractC1586x) dVar).w0();
            if (a0VarW0 instanceof B) {
                return (B) a0VarW0;
            }
            return null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(dVar);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC0703b.o(y.a, dVar.getClass(), sb).toString());
    }

    public static n5.G i(q5.d dVar) {
        if (dVar instanceof AbstractC1586x) {
            return AbstractC0905c.e((AbstractC1586x) dVar);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(dVar);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC0703b.o(y.a, dVar.getClass(), sb).toString());
    }

    public static B j(q5.e eVar) {
        List listQ0;
        ArrayList arrayList;
        C1705e c1705e;
        q5.b bVar = q5.b.f14745k;
        if (!(eVar instanceof B)) {
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(eVar);
            sb.append(", ");
            throw new IllegalArgumentException(AbstractC0703b.o(y.a, eVar.getClass(), sb).toString());
        }
        B b4 = (B) eVar;
        C1452e c1452e = null;
        if (b4.q0().size() == b4.t0().getParameters().size() && ((listQ0 = b4.q0()) == null || !listQ0.isEmpty())) {
            Iterator it = listQ0.iterator();
            while (it.hasNext()) {
                if (((Q) it.next()).a() != b0.f13390m) {
                    List parameters = b4.t0().getParameters();
                    kotlin.jvm.internal.l.e("getParameters(...)", parameters);
                    ArrayList arrayListZ0 = P3.q.Z0(listQ0, parameters);
                    arrayList = new ArrayList(P3.r.p(arrayListZ0, 10));
                    Iterator it2 = arrayListZ0.iterator();
                    while (it2.hasNext()) {
                        O3.l lVar = (O3.l) it2.next();
                        Q qE = (Q) lVar.f7528k;
                        u4.Q q6 = (u4.Q) lVar.f7529l;
                        if (qE.a() != b0.f13390m) {
                            a0 a0VarW0 = (qE.c() || qE.a() != b0.f13391n) ? null : qE.b().w0();
                            kotlin.jvm.internal.l.c(q6);
                            qE = AbstractC0905c.e(new C1708h(bVar, new C1709i(qE, c1452e, q6, 6), a0VarW0, (I) null, false, 56));
                        }
                        arrayList.add(qE);
                    }
                    V v5 = new V(N.f13375b.f(b4.t0(), arrayList));
                    int size = listQ0.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        Q q7 = (Q) listQ0.get(i7);
                        Q q8 = (Q) arrayList.get(i7);
                        if (q7.a() != b0.f13390m) {
                            List upperBounds = ((u4.Q) b4.t0().getParameters().get(i7)).getUpperBounds();
                            kotlin.jvm.internal.l.e("getUpperBounds(...)", upperBounds);
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it3 = upperBounds.iterator();
                            while (true) {
                                boolean zHasNext = it3.hasNext();
                                c1705e = C1705e.a;
                                if (!zHasNext) {
                                    break;
                                }
                                arrayList2.add(c1705e.a(v5.g((AbstractC1586x) it3.next(), b0.f13390m).w0()));
                            }
                            if (!q7.c() && q7.a() == b0.f13392o) {
                                arrayList2.add(c1705e.a(q7.b().w0()));
                            }
                            AbstractC1586x abstractC1586xB = q8.b();
                            kotlin.jvm.internal.l.d("null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedType", abstractC1586xB);
                            C1709i c1709i = ((C1708h) abstractC1586xB).f13800m;
                            c1709i.getClass();
                            c1709i.f13805b = new C1452e(2, arrayList2);
                        }
                    }
                }
            }
            arrayList = null;
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            return AbstractC1566c.u(arrayList, b4.s0(), b4.t0(), b4.u0());
        }
        return null;
    }

    public static q5.b k(q5.c cVar) {
        if (cVar instanceof C1708h) {
            return ((C1708h) cVar).f13799l;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(cVar);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC0703b.o(y.a, cVar.getClass(), sb).toString());
    }

    public static L l(boolean z7, InterfaceC1702b interfaceC1702b, C1705e c1705e, int i7) {
        C1706f c1706f = C1706f.a;
        if ((i7 & 4) != 0) {
            interfaceC1702b = C1713m.f13813k;
        }
        InterfaceC1702b interfaceC1702b2 = interfaceC1702b;
        if ((i7 & 8) != 0) {
            c1705e = C1705e.a;
        }
        return new L(z7, true, interfaceC1702b2, c1705e, c1706f);
    }

    public static a0 m(InterfaceC1702b interfaceC1702b, q5.f fVar, q5.f fVar2) {
        kotlin.jvm.internal.l.f("lowerBound", fVar);
        kotlin.jvm.internal.l.f("upperBound", fVar2);
        if (!(fVar instanceof B)) {
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(interfaceC1702b);
            sb.append(", ");
            throw new IllegalArgumentException(AbstractC0703b.o(y.a, interfaceC1702b.getClass(), sb).toString());
        }
        if (fVar2 instanceof B) {
            return AbstractC1566c.f((B) fVar, (B) fVar2);
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(interfaceC1702b);
        sb2.append(", ");
        throw new IllegalArgumentException(AbstractC0703b.o(y.a, interfaceC1702b.getClass(), sb2).toString());
    }

    public static final String n(M m7) {
        StringBuilder sb = new StringBuilder();
        o("type: " + m7, sb);
        o("hashCode: " + m7.hashCode(), sb);
        o("javaClass: " + m7.getClass().getCanonicalName(), sb);
        for (InterfaceC2105k interfaceC2105kF = m7.f(); interfaceC2105kF != null; interfaceC2105kF = interfaceC2105kF.k()) {
            o("fqName: " + Y4.h.f10162c.t(interfaceC2105kF), sb);
            o("javaClass: " + interfaceC2105kF.getClass().getCanonicalName(), sb);
        }
        return sb.toString();
    }

    public static final void o(String str, StringBuilder sb) {
        kotlin.jvm.internal.l.f("<this>", str);
        sb.append(str);
        sb.append('\n');
    }

    public static Q p(q5.d dVar, int i7) {
        kotlin.jvm.internal.l.f("$receiver", dVar);
        if (dVar instanceof AbstractC1586x) {
            return (Q) ((AbstractC1586x) dVar).q0().get(i7);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(dVar);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC0703b.o(y.a, dVar.getClass(), sb).toString());
    }

    public static List q(q5.d dVar) {
        kotlin.jvm.internal.l.f("$receiver", dVar);
        if (dVar instanceof AbstractC1586x) {
            return ((AbstractC1586x) dVar).q0();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(dVar);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC0703b.o(y.a, dVar.getClass(), sb).toString());
    }

    public static u4.Q r(q5.h hVar, int i7) {
        kotlin.jvm.internal.l.f("$receiver", hVar);
        if (hVar instanceof M) {
            Object obj = ((M) hVar).getParameters().get(i7);
            kotlin.jvm.internal.l.e("get(...)", obj);
            return (u4.Q) obj;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(hVar);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC0703b.o(y.a, hVar.getClass(), sb).toString());
    }

    public static List s(q5.h hVar) {
        kotlin.jvm.internal.l.f("$receiver", hVar);
        if (hVar instanceof M) {
            List parameters = ((M) hVar).getParameters();
            kotlin.jvm.internal.l.e("getParameters(...)", parameters);
            return parameters;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(hVar);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC0703b.o(y.a, hVar.getClass(), sb).toString());
    }

    public static a0 t(InterfaceC1702b interfaceC1702b, Q q6) {
        kotlin.jvm.internal.l.f("$receiver", q6);
        if (interfaceC1702b.r(q6)) {
            return null;
        }
        if (q6 instanceof Q) {
            return q6.b().w0();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(q6);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC0703b.o(y.a, q6.getClass(), sb).toString());
    }

    public static u4.Q u(q5.h hVar) {
        kotlin.jvm.internal.l.f("$receiver", hVar);
        if (hVar instanceof M) {
            InterfaceC2102h interfaceC2102hF = ((M) hVar).f();
            if (interfaceC2102hF instanceof u4.Q) {
                return (u4.Q) interfaceC2102hF;
            }
            return null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(hVar);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC0703b.o(y.a, hVar.getClass(), sb).toString());
    }

    public static q5.j v(Q q6) {
        kotlin.jvm.internal.l.f("$receiver", q6);
        if (q6 instanceof Q) {
            b0 b0VarA = q6.a();
            kotlin.jvm.internal.l.e("getProjectionKind(...)", b0VarA);
            return e3.c.r(b0VarA);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(q6);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC0703b.o(y.a, q6.getClass(), sb).toString());
    }

    public static q5.j w(u4.Q q6) {
        kotlin.jvm.internal.l.f("$receiver", q6);
        b0 b0VarR = q6.R();
        kotlin.jvm.internal.l.e("getVariance(...)", b0VarR);
        return e3.c.r(b0VarR);
    }

    public static boolean x(AbstractC1586x abstractC1586x, W4.c cVar) {
        kotlin.jvm.internal.l.f("$receiver", abstractC1586x);
        kotlin.jvm.internal.l.f("fqName", cVar);
        return abstractC1586x.getAnnotations().d(cVar);
    }

    public static boolean y(u4.Q q6, q5.h hVar) {
        if (hVar == null ? true : hVar instanceof M) {
            return AbstractC0905c.t(q6, (M) hVar, null);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(q6);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC0703b.o(y.a, q6.getClass(), sb).toString());
    }

    public static boolean z(q5.e eVar, q5.e eVar2) {
        kotlin.jvm.internal.l.f("a", eVar);
        kotlin.jvm.internal.l.f("b", eVar2);
        if (!(eVar instanceof B)) {
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(eVar);
            sb.append(", ");
            throw new IllegalArgumentException(AbstractC0703b.o(y.a, eVar.getClass(), sb).toString());
        }
        if (eVar2 instanceof B) {
            return ((B) eVar).q0() == ((B) eVar2).q0();
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(eVar2);
        sb2.append(", ");
        throw new IllegalArgumentException(AbstractC0703b.o(y.a, eVar2.getClass(), sb2).toString());
    }
}
