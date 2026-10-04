package n5;

import f6.AbstractC0915m;
import io.ktor.http.LinkHeader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import l5.C1467t;
import o5.C1708h;
import o5.C1709i;
import o5.C1713m;
import o5.InterfaceC1702b;
import r5.C1892a;
import u4.InterfaceC2102h;
import v4.InterfaceC2153a;
import v4.InterfaceC2154b;
import x4.AbstractC2279f;
import x4.AbstractC2287n;
import x4.C2270P;
import x4.C2278e;

/* renamed from: n5.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1567d {
    public static final C1567d a = new C1567d();

    public static final boolean b(InterfaceC1702b interfaceC1702b, q5.e eVar) {
        if (!AbstractC0915m.z(interfaceC1702b, eVar)) {
            if (!(eVar instanceof q5.c)) {
                return false;
            }
            kotlin.jvm.internal.l.f("c", interfaceC1702b);
            C1709i c1709iE0 = interfaceC1702b.E0((q5.c) eVar);
            kotlin.jvm.internal.l.f("c", interfaceC1702b);
            kotlin.jvm.internal.l.f("<this>", c1709iE0);
            q5.d dVarV = AbstractC0915m.v(interfaceC1702b, interfaceC1702b.C0(c1709iE0));
            if (dVarV == null) {
                return false;
            }
            kotlin.jvm.internal.l.f("c", interfaceC1702b);
            if (!AbstractC0915m.z(interfaceC1702b, interfaceC1702b.E(dVarV))) {
                return false;
            }
        }
        return true;
    }

    public static final boolean c(InterfaceC1702b interfaceC1702b, L l7, q5.e eVar, q5.e eVar2, boolean z7) {
        kotlin.jvm.internal.l.f("c", interfaceC1702b);
        Collection<q5.d> collectionQ0 = interfaceC1702b.q0(eVar);
        if ((collectionQ0 instanceof Collection) && collectionQ0.isEmpty()) {
            return false;
        }
        for (q5.d dVar : collectionQ0) {
            if (kotlin.jvm.internal.l.a(AbstractC0915m.L(interfaceC1702b, dVar), AbstractC0915m.M(interfaceC1702b, eVar2))) {
                return true;
            }
            if (z7 && m(a, l7, eVar2, dVar)) {
                return true;
            }
        }
        return false;
    }

    public static List d(L l7, InterfaceC1702b interfaceC1702b, q5.e eVar, q5.h hVar) {
        AbstractC1566c abstractC1566cH0;
        kotlin.jvm.internal.l.f("c", interfaceC1702b);
        interfaceC1702b.C(eVar, hVar);
        boolean zZ0 = interfaceC1702b.Z0(hVar);
        P3.y yVar = P3.y.f7779k;
        if (zZ0 || !interfaceC1702b.f0(eVar)) {
            if (!interfaceC1702b.Z(hVar)) {
                w5.f fVar = new w5.f();
                l7.b();
                ArrayDeque arrayDeque = l7.f13373g;
                kotlin.jvm.internal.l.c(arrayDeque);
                w5.h hVar2 = l7.f13374h;
                kotlin.jvm.internal.l.c(hVar2);
                arrayDeque.push(eVar);
                while (!arrayDeque.isEmpty()) {
                    q5.e eVar2 = (q5.e) arrayDeque.pop();
                    kotlin.jvm.internal.l.c(eVar2);
                    if (hVar2.add(eVar2)) {
                        q5.b bVar = q5.b.f14745k;
                        B bW = interfaceC1702b.w(eVar2);
                        if (bW == null) {
                            bW = eVar2;
                        }
                        boolean zL = interfaceC1702b.l(AbstractC0915m.M(interfaceC1702b, bW), hVar);
                        K k7 = K.f13366c;
                        InterfaceC1702b interfaceC1702b2 = l7.f13369c;
                        if (zL) {
                            fVar.add(bW);
                            abstractC1566cH0 = k7;
                        } else {
                            abstractC1566cH0 = interfaceC1702b.U0(bW) == 0 ? K.f13365b : interfaceC1702b2.h0(bW);
                        }
                        if (abstractC1566cH0.equals(k7)) {
                            abstractC1566cH0 = null;
                        }
                        if (abstractC1566cH0 != null) {
                            Iterator it = interfaceC1702b2.X0(interfaceC1702b2.y(eVar2)).iterator();
                            while (it.hasNext()) {
                                arrayDeque.add(abstractC1566cH0.E(l7, (q5.d) it.next()));
                            }
                        }
                    }
                }
                l7.a();
                return fVar;
            }
            if (interfaceC1702b.l(AbstractC0915m.M(interfaceC1702b, eVar), hVar)) {
                q5.b bVar2 = q5.b.f14745k;
                B bW2 = interfaceC1702b.w(eVar);
                if (bW2 != null) {
                    eVar = bW2;
                }
                return P3.r.H(eVar);
            }
        }
        return yVar;
    }

    public static List e(L l7, InterfaceC1702b interfaceC1702b, q5.e eVar, q5.h hVar) {
        int i7;
        List listD = d(l7, interfaceC1702b, eVar, hVar);
        if (listD.size() >= 2) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : listD) {
                q5.g gVarC = AbstractC0915m.c(interfaceC1702b, (q5.e) obj);
                int iX = interfaceC1702b.X(gVarC);
                while (true) {
                    if (i7 >= iX) {
                        arrayList.add(obj);
                        break;
                    }
                    q5.d dVarV = AbstractC0915m.v(interfaceC1702b, interfaceC1702b.t0(gVarC, i7));
                    i7 = (dVarV != null ? interfaceC1702b.p0(dVarV) : null) == null ? i7 + 1 : 0;
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
        }
        return listD;
    }

    public static boolean g(L l7, q5.d dVar, q5.d dVar2) {
        kotlin.jvm.internal.l.f("a", dVar);
        kotlin.jvm.internal.l.f("b", dVar2);
        if (dVar == dVar2) {
            return true;
        }
        C1567d c1567d = a;
        InterfaceC1702b interfaceC1702b = l7.f13369c;
        if (k(interfaceC1702b, dVar) && k(interfaceC1702b, dVar2)) {
            a0 a0VarC = l7.c(l7.d(dVar));
            a0 a0VarC2 = l7.c(l7.d(dVar2));
            B bO0 = interfaceC1702b.O0(a0VarC);
            if (!interfaceC1702b.l(interfaceC1702b.H0(a0VarC), interfaceC1702b.H0(a0VarC2))) {
                return false;
            }
            if (interfaceC1702b.U0(bO0) == 0) {
                return interfaceC1702b.u0(a0VarC) || interfaceC1702b.u0(a0VarC2) || interfaceC1702b.Q0(bO0) == interfaceC1702b.Q0(interfaceC1702b.O0(a0VarC2));
            }
        }
        return m(c1567d, l7, dVar, dVar2) && m(c1567d, l7, dVar2, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0068, code lost:
    
        r9 = f6.AbstractC0915m.L(r8, r9);
        kotlin.jvm.internal.l.f("c", r8);
        kotlin.jvm.internal.l.f("<this>", r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0076, code lost:
    
        return r8.b0(r9, r3);
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static u4.Q j(o5.InterfaceC1702b r8, q5.d r9, q5.e r10) {
        /*
            java.lang.String r0 = "c"
            kotlin.jvm.internal.l.f(r0, r8)
            int r1 = r8.U0(r9)
            r2 = 0
            r3 = r2
        Lb:
            r4 = 0
            if (r3 >= r1) goto L7a
            kotlin.jvm.internal.l.f(r0, r8)
            n5.Q r5 = r8.Q(r9, r3)
            kotlin.jvm.internal.l.f(r0, r8)
            java.lang.String r6 = "<this>"
            kotlin.jvm.internal.l.f(r6, r5)
            boolean r7 = r8.r(r5)
            if (r7 != 0) goto L24
            r4 = r5
        L24:
            if (r4 == 0) goto L77
            q5.d r4 = f6.AbstractC0915m.v(r8, r4)
            if (r4 != 0) goto L2d
            goto L77
        L2d:
            q5.e r5 = f6.AbstractC0915m.E(r8, r4)
            kotlin.jvm.internal.l.f(r0, r8)
            boolean r5 = r8.e0(r5)
            if (r5 == 0) goto L49
            q5.e r5 = f6.AbstractC0915m.E(r8, r10)
            kotlin.jvm.internal.l.f(r0, r8)
            boolean r5 = r8.e0(r5)
            if (r5 == 0) goto L49
            r5 = 1
            goto L4a
        L49:
            r5 = r2
        L4a:
            boolean r7 = r4.equals(r10)
            if (r7 != 0) goto L68
            if (r5 == 0) goto L61
            q5.h r5 = f6.AbstractC0915m.L(r8, r4)
            q5.h r7 = f6.AbstractC0915m.L(r8, r10)
            boolean r5 = kotlin.jvm.internal.l.a(r5, r7)
            if (r5 == 0) goto L61
            goto L68
        L61:
            u4.Q r4 = j(r8, r4, r10)
            if (r4 == 0) goto L77
            return r4
        L68:
            q5.h r9 = f6.AbstractC0915m.L(r8, r9)
            kotlin.jvm.internal.l.f(r0, r8)
            kotlin.jvm.internal.l.f(r6, r9)
            u4.Q r8 = r8.b0(r9, r3)
            return r8
        L77:
            int r3 = r3 + 1
            goto Lb
        L7a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.C1567d.j(o5.b, q5.d, q5.e):u4.Q");
    }

    public static boolean k(InterfaceC1702b interfaceC1702b, q5.d dVar) {
        q5.h hVarL = AbstractC0915m.L(interfaceC1702b, dVar);
        kotlin.jvm.internal.l.f("<this>", hVarL);
        if (!interfaceC1702b.H(hVarL)) {
            return false;
        }
        interfaceC1702b.N0(dVar);
        return (interfaceC1702b.w0(dVar) || interfaceC1702b.B(dVar) || interfaceC1702b.T0(dVar)) ? false : true;
    }

    public static boolean l(L l7, InterfaceC1702b interfaceC1702b, q5.g gVar, q5.e eVar) {
        boolean zM;
        kotlin.jvm.internal.l.f("c", interfaceC1702b);
        kotlin.jvm.internal.l.f("capturedSubArguments", gVar);
        q5.h hVarM = AbstractC0915m.M(interfaceC1702b, eVar);
        int iX = interfaceC1702b.X(gVar);
        int iF = AbstractC0915m.F(interfaceC1702b, hVarM);
        if (iX == iF && iX == interfaceC1702b.U0(eVar)) {
            for (int i7 = 0; i7 < iF; i7++) {
                Q Q6 = interfaceC1702b.Q(eVar, i7);
                q5.d dVarV = AbstractC0915m.v(interfaceC1702b, Q6);
                if (dVarV != null) {
                    Q qT0 = interfaceC1702b.t0(gVar, i7);
                    kotlin.jvm.internal.l.f("<this>", qT0);
                    interfaceC1702b.U(qT0);
                    q5.j jVar = q5.j.f14749n;
                    q5.d dVarV2 = AbstractC0915m.v(interfaceC1702b, qT0);
                    kotlin.jvm.internal.l.c(dVarV2);
                    q5.j jVarL0 = interfaceC1702b.l0(interfaceC1702b.b0(hVarM, i7));
                    q5.j jVarU = interfaceC1702b.U(Q6);
                    if (jVarL0 == jVar) {
                        jVarL0 = jVarU;
                    } else if (jVarU != jVar && jVarL0 != jVarU) {
                        jVarL0 = null;
                    }
                    if (jVarL0 == null) {
                        return l7.a;
                    }
                    if (jVarL0 == jVar) {
                        n(interfaceC1702b, dVarV2, dVarV);
                        n(interfaceC1702b, dVarV, dVarV2);
                    }
                    int i8 = l7.f13372f;
                    if (i8 > 100) {
                        throw new IllegalStateException(("Arguments depth is too high. Some related argument: " + dVarV2).toString());
                    }
                    l7.f13372f = i8 + 1;
                    int iOrdinal = jVarL0.ordinal();
                    C1567d c1567d = a;
                    if (iOrdinal == 0) {
                        zM = m(c1567d, l7, dVarV, dVarV2);
                    } else if (iOrdinal == 1) {
                        zM = m(c1567d, l7, dVarV2, dVarV);
                    } else {
                        if (iOrdinal != 2) {
                            throw new D6.r();
                        }
                        zM = g(l7, dVarV2, dVarV);
                    }
                    l7.f13372f--;
                    if (!zM) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x023c A[PHI: r4
      0x023c: PHI (r4v1 boolean) = (r4v0 boolean), (r4v0 boolean), (r4v0 boolean), (r4v0 boolean), (r4v0 boolean), (r4v28 boolean), (r4v0 boolean) binds: [B:72:0x0187, B:75:0x018f, B:78:0x0197, B:86:0x01ae, B:98:0x01d9, B:120:0x0239, B:83:0x01a6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02b8 A[EDGE_INSN: B:324:0x02b8->B:156:0x02b8 BREAK  A[LOOP:11: B:146:0x0295->B:326:0x0295]] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012f  */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v6, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, o5.b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m(n5.C1567d r18, n5.L r19, q5.d r20, q5.d r21) {
        /*
            Method dump skipped, instructions count: 1351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.C1567d.m(n5.d, n5.L, q5.d, q5.d):boolean");
    }

    public static void n(InterfaceC1702b interfaceC1702b, q5.d dVar, q5.d dVar2) {
        q5.e eVarD = AbstractC0915m.d(interfaceC1702b, dVar);
        if (eVarD instanceof q5.c) {
            q5.c cVar = (q5.c) eVarD;
            kotlin.jvm.internal.l.f("<this>", cVar);
            if (interfaceC1702b.N(cVar)) {
                return;
            }
            C1709i c1709iE0 = interfaceC1702b.E0(cVar);
            kotlin.jvm.internal.l.f("<this>", c1709iE0);
            Q qC0 = interfaceC1702b.C0(c1709iE0);
            kotlin.jvm.internal.l.f("<this>", qC0);
            if (interfaceC1702b.r(qC0) && interfaceC1702b.W0(cVar) == q5.b.f14745k) {
                AbstractC0915m.L(interfaceC1702b, dVar2);
            }
        }
    }

    public static C1575l o(a0 a0Var, boolean z7) {
        boolean zE;
        kotlin.jvm.internal.l.f(LinkHeader.Parameters.Type, a0Var);
        if (a0Var instanceof C1575l) {
            return (C1575l) a0Var;
        }
        a0Var.t0();
        if ((a0Var.t0().f() instanceof u4.Q) || (a0Var instanceof C1708h)) {
            InterfaceC2102h interfaceC2102hF = a0Var.t0().f();
            C2270P c2270p = interfaceC2102hF instanceof C2270P ? (C2270P) interfaceC2102hF : null;
            zE = true;
            if (c2270p == null || c2270p.f17406v) {
                zE = (z7 && (a0Var.t0().f() instanceof u4.Q)) ? Y.e(a0Var) : true ^ AbstractC1566c.h(C1713m.f13813k.a(), AbstractC1566c.m(a0Var), K.f13365b);
            }
        } else {
            zE = false;
        }
        if (!zE) {
            return null;
        }
        if (a0Var instanceof AbstractC1580q) {
            AbstractC1580q abstractC1580q = (AbstractC1580q) a0Var;
            kotlin.jvm.internal.l.a(abstractC1580q.f13407l.t0(), abstractC1580q.f13408m.t0());
        }
        return new C1575l(AbstractC1566c.m(a0Var).x0(false), z7);
    }

    public void a(v4.h hVar, v4.h hVar2) {
        HashSet hashSet = new HashSet();
        Iterator it = hVar.iterator();
        while (it.hasNext()) {
            hashSet.add(((InterfaceC2154b) it.next()).a());
        }
        Iterator it2 = hVar2.iterator();
        while (it2.hasNext()) {
            hashSet.contains(((InterfaceC2154b) it2.next()).a());
        }
    }

    public T f(M m7, List list) {
        kotlin.jvm.internal.l.f("typeConstructor", m7);
        kotlin.jvm.internal.l.f("arguments", list);
        List parameters = m7.getParameters();
        kotlin.jvm.internal.l.e("getParameters(...)", parameters);
        u4.Q q6 = (u4.Q) P3.q.B0(parameters);
        if (q6 == null || !q6.I()) {
            return new C1582t((u4.Q[]) parameters.toArray(new u4.Q[0]), (Q[]) list.toArray(new Q[0]), false);
        }
        List parameters2 = m7.getParameters();
        kotlin.jvm.internal.l.e("getParameters(...)", parameters2);
        ArrayList arrayList = new ArrayList(P3.r.p(parameters2, 10));
        Iterator it = parameters2.iterator();
        while (it.hasNext()) {
            arrayList.add(((u4.Q) it.next()).v());
        }
        return new H(1, P3.E.r0(P3.q.Z0(arrayList, list)));
    }

    public B h(A2.b bVar, I i7, boolean z7, int i8, boolean z8) {
        I iB1;
        b0 b0Var = b0.f13390m;
        u4.P p7 = (u4.P) bVar.f111m;
        Q qI = i(new G(((C1467t) p7).P0(), b0Var), bVar, null, i8);
        AbstractC1586x abstractC1586xB = qI.b();
        kotlin.jvm.internal.l.e("getType(...)", abstractC1586xB);
        B b4 = AbstractC1566c.b(abstractC1586xB);
        if (AbstractC1566c.k(b4)) {
            return b4;
        }
        qI.a();
        a(b4.getAnnotations(), AbstractC1571h.a(i7));
        if (!AbstractC1566c.k(b4)) {
            if (AbstractC1566c.k(b4)) {
                iB1 = b4.s0();
            } else {
                I iS0 = b4.s0();
                kotlin.jvm.internal.l.f("other", iS0);
                if (i7.isEmpty() && iS0.isEmpty()) {
                    iB1 = i7;
                } else {
                    ArrayList arrayList = new ArrayList();
                    Collection collectionValues = ((ConcurrentHashMap) I.f13362l.f6045l).values();
                    kotlin.jvm.internal.l.e("<get-values>(...)", collectionValues);
                    Iterator it = collectionValues.iterator();
                    while (it.hasNext()) {
                        int iIntValue = ((Number) it.next()).intValue();
                        C1570g c1570g = (C1570g) i7.f16095k.get(iIntValue);
                        C1570g c1570g2 = (C1570g) iS0.f16095k.get(iIntValue);
                        if (c1570g != null) {
                            if (c1570g2 != null) {
                                c1570g = new C1570g(e3.c.p(c1570g.a, c1570g2.a));
                            }
                            c1570g2 = c1570g;
                        } else if (c1570g2 == null) {
                            c1570g2 = null;
                        } else if (c1570g != null) {
                            c1570g2 = new C1570g(e3.c.p(c1570g2.a, c1570g.a));
                        }
                        w5.k.a(arrayList, c1570g2);
                    }
                    iB1 = L2.e.b1(arrayList);
                }
            }
            b4 = AbstractC1566c.r(b4, null, iB1, 1);
        }
        B bI = Y.i(b4, z7);
        if (!z8) {
            return bI;
        }
        C2278e c2278e = ((AbstractC2279f) p7).f17424r;
        kotlin.jvm.internal.l.e("getTypeConstructor(...)", c2278e);
        return AbstractC1566c.G(bI, AbstractC1566c.v(g5.n.f11759b, (List) bVar.f112n, i7, c2278e, z7));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Q i(Q q6, A2.b bVar, u4.Q q7, int i7) {
        b0 b0VarR;
        b0 b0Var;
        b0 b0Var2;
        InterfaceC2153a interfaceC2153a = (u4.P) bVar.f111m;
        if (i7 > 100) {
            throw new AssertionError("Too deep recursion while expanding type alias " + ((AbstractC2287n) interfaceC2153a).getName());
        }
        if (q6.c()) {
            kotlin.jvm.internal.l.c(q7);
            return Y.j(q7);
        }
        AbstractC1586x abstractC1586xB = q6.b();
        kotlin.jvm.internal.l.e("getType(...)", abstractC1586xB);
        M mT0 = abstractC1586xB.t0();
        kotlin.jvm.internal.l.f("constructor", mT0);
        InterfaceC2102h interfaceC2102hF = mT0.f();
        Q q8 = interfaceC2102hF instanceof u4.Q ? (Q) ((Map) bVar.f113o).get(interfaceC2102hF) : null;
        if (q8 != null) {
            if (q8.c()) {
                kotlin.jvm.internal.l.c(q7);
                return Y.j(q7);
            }
            a0 a0VarW0 = q8.b().w0();
            b0 b0VarA = q8.a();
            kotlin.jvm.internal.l.e("getProjectionKind(...)", b0VarA);
            b0 b0VarA2 = q6.a();
            kotlin.jvm.internal.l.e("getProjectionKind(...)", b0VarA2);
            if (b0VarA2 != b0VarA && b0VarA2 != (b0Var2 = b0.f13390m)) {
                if (b0VarA == b0Var2) {
                    b0VarA = b0VarA2;
                } else {
                    kotlin.jvm.internal.l.f("typeAlias", interfaceC2153a);
                }
            }
            if (q7 == null || (b0VarR = q7.R()) == null) {
                b0VarR = b0.f13390m;
            }
            if (b0VarR != b0VarA && b0VarR != (b0Var = b0.f13390m)) {
                if (b0VarA == b0Var) {
                    b0VarA = b0Var;
                } else {
                    kotlin.jvm.internal.l.f("typeAlias", interfaceC2153a);
                }
            }
            a(abstractC1586xB.getAnnotations(), a0VarW0.getAnnotations());
            B bI = Y.i(AbstractC1566c.b(a0VarW0), abstractC1586xB.u0());
            I iS0 = abstractC1586xB.s0();
            if (!AbstractC1566c.k(bI)) {
                if (AbstractC1566c.k(bI)) {
                    iS0 = bI.s0();
                } else {
                    I iS02 = bI.s0();
                    iS0.getClass();
                    kotlin.jvm.internal.l.f("other", iS02);
                    if (!iS0.isEmpty() || !iS02.isEmpty()) {
                        ArrayList arrayList = new ArrayList();
                        Collection collectionValues = ((ConcurrentHashMap) I.f13362l.f6045l).values();
                        kotlin.jvm.internal.l.e("<get-values>(...)", collectionValues);
                        Iterator it = collectionValues.iterator();
                        while (it.hasNext()) {
                            int iIntValue = ((Number) it.next()).intValue();
                            C1570g c1570g = (C1570g) iS0.f16095k.get(iIntValue);
                            C1570g c1570g2 = (C1570g) iS02.f16095k.get(iIntValue);
                            if (c1570g != null) {
                                if (c1570g2 != null) {
                                    c1570g = new C1570g(e3.c.p(c1570g.a, c1570g2.a));
                                }
                                c1570g2 = c1570g;
                            } else if (c1570g2 == null) {
                                c1570g2 = null;
                            } else if (c1570g != null) {
                                c1570g2 = new C1570g(e3.c.p(c1570g2.a, c1570g.a));
                            }
                            w5.k.a(arrayList, c1570g2);
                        }
                        iS0 = L2.e.b1(arrayList);
                    }
                }
                bI = AbstractC1566c.r(bI, null, iS0, 1);
            }
            return new G(bI, b0VarA);
        }
        B b4 = AbstractC1566c.b(q6.b().w0());
        if (!AbstractC1566c.k(b4) && Y.c(b4, C1892a.f15049m, null)) {
            M mT02 = b4.t0();
            InterfaceC2102h interfaceC2102hF2 = mT02.f();
            mT02.getParameters().size();
            b4.q0().size();
            if (!(interfaceC2102hF2 instanceof u4.Q)) {
                int i8 = 0;
                if (!(interfaceC2102hF2 instanceof u4.P)) {
                    B bP = p(b4, bVar, i7);
                    V.d(bP);
                    for (Object obj : bP.q0()) {
                        int i9 = i8 + 1;
                        if (i8 < 0) {
                            P3.r.X();
                            throw null;
                        }
                        Q q9 = (Q) obj;
                        if (!q9.c()) {
                            AbstractC1586x abstractC1586xB2 = q9.b();
                            kotlin.jvm.internal.l.e("getType(...)", abstractC1586xB2);
                            if (!Y.c(abstractC1586xB2, C1892a.f15048l, null)) {
                            }
                        }
                        i8 = i9;
                    }
                    return new G(bP, q6.a());
                }
                u4.P p7 = (u4.P) interfaceC2102hF2;
                if (bVar.x(p7)) {
                    b0 b0Var3 = b0.f13390m;
                    p5.k kVar = p5.k.f14442p;
                    String str = ((AbstractC2287n) p7).getName().f9624k;
                    kotlin.jvm.internal.l.e("toString(...)", str);
                    return new G(p5.l.c(kVar, str), b0Var3);
                }
                List listQ0 = b4.q0();
                ArrayList arrayList2 = new ArrayList(P3.r.p(listQ0, 10));
                for (Object obj2 : listQ0) {
                    int i10 = i8 + 1;
                    if (i8 < 0) {
                        P3.r.X();
                        throw null;
                    }
                    arrayList2.add(i((Q) obj2, bVar, (u4.Q) mT02.getParameters().get(i8), i7 + 1));
                    i8 = i10;
                }
                List parameters = ((AbstractC2279f) p7).f17424r.getParameters();
                ArrayList arrayList3 = new ArrayList(P3.r.p(parameters, 10));
                Iterator it2 = parameters.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(((u4.Q) it2.next()).a());
                }
                return new G(AbstractC1566c.G(h(new A2.b(bVar, p7, arrayList2, P3.E.r0(P3.q.Z0(arrayList3, arrayList2)), 11), b4.s0(), b4.u0(), i7 + 1, false), p(b4, bVar, i7)), q6.a());
            }
        }
        return q6;
    }

    public B p(B b4, A2.b bVar, int i7) {
        M mT0 = b4.t0();
        List listQ0 = b4.q0();
        ArrayList arrayList = new ArrayList(P3.r.p(listQ0, 10));
        int i8 = 0;
        for (Object obj : listQ0) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                P3.r.X();
                throw null;
            }
            Q q6 = (Q) obj;
            Q qI = i(q6, bVar, (u4.Q) mT0.getParameters().get(i8), i7 + 1);
            if (!qI.c()) {
                qI = new G(Y.h(qI.b(), q6.b().u0()), qI.a());
            }
            arrayList.add(qI);
            i8 = i9;
        }
        return AbstractC1566c.r(b4, arrayList, null, 2);
    }
}
