package n5;

import b1.AbstractC0703b;
import f6.AbstractC0905c;
import io.ktor.http.LinkHeader;
import io.ktor.util.GzipHeaderFlags;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import o5.AbstractC1707g;
import o5.C1706f;
import o5.InterfaceC1702b;
import r4.AbstractC1880i;
import u4.InterfaceC2099e;
import u4.InterfaceC2102h;
import u4.InterfaceC2103i;
import u4.InterfaceC2105k;
import u4.InterfaceC2112s;
import v4.C2159g;
import x4.AbstractC2287n;
import x4.AbstractC2299z;

/* renamed from: n5.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1566c {
    public static V A(List list, T t7, InterfaceC2105k interfaceC2105k, ArrayList arrayList) {
        if (t7 == null) {
            a(1);
            throw null;
        }
        if (interfaceC2105k == null) {
            a(2);
            throw null;
        }
        if (arrayList == null) {
            a(3);
            throw null;
        }
        V vB = B(list, t7, interfaceC2105k, arrayList, null);
        if (vB != null) {
            return vB;
        }
        throw new AssertionError("Substitution failed");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static n5.V B(java.util.List r16, n5.T r17, u4.InterfaceC2105k r18, java.util.ArrayList r19, boolean[] r20) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.AbstractC1566c.B(java.util.List, n5.T, u4.k, java.util.ArrayList, boolean[]):n5.V");
    }

    public static final q5.d C(P4.f fVar, q5.d dVar, q5.d dVar2) {
        if (AbstractC1707g.u(fVar.H0(dVar)) != null) {
            return AbstractC1707g.K(dVar) ? fVar.j(dVar2) : dVar2;
        }
        Q q6 = (Q) P3.q.K0(AbstractC1707g.q(dVar));
        if (AbstractC1579p.a[AbstractC1707g.v(q6).ordinal()] == 1) {
            fVar.d();
            throw null;
        }
        a0 a0VarT = AbstractC1707g.t(fVar, q6);
        kotlin.jvm.internal.l.c(a0VarT);
        q5.d dVarC = C(fVar, a0VarT, dVar2);
        kotlin.jvm.internal.l.f("componentType", dVarC);
        if (dVarC instanceof AbstractC1586x) {
            fVar.d();
            throw null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(fVar);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC0703b.o(kotlin.jvm.internal.y.a, fVar.getClass(), sb).toString());
    }

    public static final I D(v4.h hVar) {
        kotlin.jvm.internal.l.f("<this>", hVar);
        if (hVar.isEmpty()) {
            I.f13362l.getClass();
            return I.f13363m;
        }
        L2.e eVar = I.f13362l;
        List listH = P3.r.H(new C1570g(hVar));
        eVar.getClass();
        return L2.e.b1(listH);
    }

    public static final B F(AbstractC1586x abstractC1586x) {
        kotlin.jvm.internal.l.f("<this>", abstractC1586x);
        a0 a0VarW0 = abstractC1586x.w0();
        if (a0VarW0 instanceof AbstractC1580q) {
            return ((AbstractC1580q) a0VarW0).f13408m;
        }
        if (a0VarW0 instanceof B) {
            return (B) a0VarW0;
        }
        throw new D6.r();
    }

    public static final B G(B b4, B b7) {
        kotlin.jvm.internal.l.f("<this>", b4);
        kotlin.jvm.internal.l.f("abbreviatedType", b7);
        return k(b4) ? b4 : new C1564a(b4, b7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final a0 H(a0 a0Var, AbstractC1586x abstractC1586x) {
        kotlin.jvm.internal.l.f("<this>", a0Var);
        if (a0Var instanceof Z) {
            return H(((Z) a0Var).j0(), abstractC1586x);
        }
        if (abstractC1586x == null || abstractC1586x.equals(a0Var)) {
            return a0Var;
        }
        if (a0Var instanceof B) {
            return new E((B) a0Var, abstractC1586x);
        }
        if (a0Var instanceof AbstractC1580q) {
            return new C1581s((AbstractC1580q) a0Var, abstractC1586x);
        }
        throw new D6.r();
    }

    public static /* synthetic */ void a(int i7) {
        String str = i7 != 4 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i7 != 4 ? 3 : 2];
        switch (i7) {
            case 1:
            case 6:
                objArr[0] = "originalSubstitution";
                break;
            case 2:
            case 7:
                objArr[0] = "newContainingDeclaration";
                break;
            case 3:
            case 8:
                objArr[0] = "result";
                break;
            case GzipHeaderFlags.EXTRA /* 4 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
                break;
            case 5:
            default:
                objArr[0] = "typeParameters";
                break;
        }
        if (i7 != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
        } else {
            objArr[1] = "substituteTypeParameters";
        }
        if (i7 != 4) {
            objArr[2] = "substituteTypeParameters";
        }
        String str2 = String.format(str, objArr);
        if (i7 == 4) {
            throw new IllegalStateException(str2);
        }
    }

    public static final B b(AbstractC1586x abstractC1586x) {
        kotlin.jvm.internal.l.f("<this>", abstractC1586x);
        a0 a0VarW0 = abstractC1586x.w0();
        B b4 = a0VarW0 instanceof B ? (B) a0VarW0 : null;
        if (b4 != null) {
            return b4;
        }
        throw new IllegalStateException(("This is should be simple type: " + abstractC1586x).toString());
    }

    public static final u4.Q c(P4.f fVar, q5.d dVar) {
        a0 a0VarT;
        u4.Q qU = AbstractC1707g.u(fVar.H0(dVar));
        if (qU != null) {
            return qU;
        }
        if (dVar instanceof AbstractC1586x) {
            if (AbstractC1880i.y((AbstractC1586x) dVar) && (a0VarT = AbstractC1707g.t(fVar, (Q) P3.q.K0(AbstractC1707g.q(dVar)))) != null) {
                return c(fVar, a0VarT);
            }
            return null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(dVar);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC0703b.o(kotlin.jvm.internal.y.a, dVar.getClass(), sb).toString());
    }

    public static final AbstractC1586x d(ArrayList arrayList, List list, AbstractC1880i abstractC1880i) {
        AbstractC1586x abstractC1586xI = new V(new H(0, arrayList)).i((AbstractC1586x) P3.q.r0(list), b0.f13392o);
        return abstractC1586xI == null ? abstractC1880i.o() : abstractC1586xI;
    }

    public static final q5.d e(P4.f fVar, q5.d dVar, HashSet hashSet) {
        q5.d dVarW;
        q5.d dVarE;
        M mH0 = fVar.H0(dVar);
        if (hashSet.add(mH0)) {
            u4.Q qU = AbstractC1707g.u(mH0);
            int i7 = 0;
            if (qU == null) {
                if (AbstractC1707g.F(mH0)) {
                    List<u4.Q> listS = AbstractC1707g.s(fVar.H0(dVar));
                    List listQ = AbstractC1707g.q(dVar);
                    ArrayList arrayList = new ArrayList(P3.r.p(listQ, 10));
                    for (Object obj : listQ) {
                        int i8 = i7 + 1;
                        if (i7 < 0) {
                            P3.r.X();
                            throw null;
                        }
                        AbstractC1586x abstractC1586xT = AbstractC1707g.t(fVar, (Q) obj);
                        if (abstractC1586xT == null) {
                            u4.Q q6 = (u4.Q) listS.get(i7);
                            fVar.getClass();
                            kotlin.jvm.internal.l.f("$receiver", q6);
                            abstractC1586xT = AbstractC0905c.r(q6);
                        }
                        arrayList.add(abstractC1586xT);
                        i7 = i8;
                    }
                    ArrayList arrayList2 = new ArrayList(P3.r.p(listS, 10));
                    for (u4.Q q7 : listS) {
                        kotlin.jvm.internal.l.f("$receiver", q7);
                        M mV = q7.v();
                        kotlin.jvm.internal.l.e("getTypeConstructor(...)", mV);
                        arrayList2.add(mV);
                    }
                    Map mapR0 = P3.E.r0(P3.q.Z0(arrayList2, arrayList));
                    ArrayList arrayList3 = new ArrayList(mapR0.size());
                    for (Map.Entry entry : mapR0.entrySet()) {
                        q5.h hVar = (q5.h) entry.getKey();
                        q5.d dVar2 = (q5.d) entry.getValue();
                        kotlin.jvm.internal.l.d("null cannot be cast to non-null type org.jetbrains.kotlin.types.TypeConstructor", hVar);
                        kotlin.jvm.internal.l.d("null cannot be cast to non-null type org.jetbrains.kotlin.types.KotlinType", dVar2);
                        arrayList3.add(new O3.l((M) hVar, AbstractC0905c.e((AbstractC1586x) dVar2)));
                    }
                    V v5 = new V(new H(1, P3.E.r0(arrayList3)));
                    kotlin.jvm.internal.l.f("$receiver", dVar);
                    if (!(dVar instanceof AbstractC1586x)) {
                        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                        sb.append(dVar);
                        sb.append(", ");
                        throw new IllegalArgumentException(AbstractC0703b.o(kotlin.jvm.internal.y.a, dVar.getClass(), sb).toString());
                    }
                    B bH = Z4.g.h((AbstractC1586x) dVar);
                    if (bH == null) {
                        dVarW = null;
                    } else {
                        u4.Q qC = c(fVar, bH);
                        dVarW = qC == null ? AbstractC1707g.W(v5, bH) : C(fVar, bH, AbstractC1707g.W(v5, AbstractC0905c.r(qC)));
                    }
                    if (dVarW != null && (dVarE = e(fVar, dVarW, hashSet)) != null) {
                        if (!AbstractC1707g.K(dVar)) {
                            return dVarE;
                        }
                        if (!AbstractC1707g.K(dVarE) && (!(dVarE instanceof q5.f) || !AbstractC1707g.L((q5.f) dVarE))) {
                            return fVar.j(dVarE);
                        }
                    }
                }
                return dVar;
            }
            q5.d dVarR = AbstractC0905c.r(qU);
            q5.d dVarE2 = e(fVar, dVarR, hashSet);
            if (dVarE2 != null) {
                if (AbstractC1707g.F(fVar.H0(dVarR)) || ((dVarR instanceof q5.f) && AbstractC1707g.L((q5.f) dVarR))) {
                    i7 = 1;
                }
                return ((dVarE2 instanceof q5.f) && AbstractC1707g.L((q5.f) dVarE2) && AbstractC1707g.K(dVar) && i7 != 0) ? fVar.j(dVarR) : (AbstractC1707g.K(dVarE2) || !AbstractC1707g.I(dVar)) ? dVarE2 : fVar.j(dVarE2);
            }
        }
        return null;
    }

    public static final a0 f(B b4, B b7) {
        kotlin.jvm.internal.l.f("lowerBound", b4);
        kotlin.jvm.internal.l.f("upperBound", b7);
        return b4.equals(b7) ? b4 : new r(b4, b7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final AbstractC1586x g(AbstractC1586x abstractC1586x) {
        kotlin.jvm.internal.l.f("<this>", abstractC1586x);
        if (abstractC1586x instanceof Z) {
            return ((Z) abstractC1586x).q();
        }
        return null;
    }

    public static boolean h(L l7, q5.e eVar, AbstractC1566c abstractC1566c) {
        kotlin.jvm.internal.l.f("<this>", l7);
        kotlin.jvm.internal.l.f(LinkHeader.Parameters.Type, eVar);
        InterfaceC1702b interfaceC1702b = l7.f13369c;
        if ((interfaceC1702b.f0(eVar) && !interfaceC1702b.Q0(eVar)) || interfaceC1702b.x(eVar)) {
            return true;
        }
        l7.b();
        ArrayDeque arrayDeque = l7.f13373g;
        kotlin.jvm.internal.l.c(arrayDeque);
        w5.h hVar = l7.f13374h;
        kotlin.jvm.internal.l.c(hVar);
        arrayDeque.push(eVar);
        while (!arrayDeque.isEmpty()) {
            q5.e eVar2 = (q5.e) arrayDeque.pop();
            kotlin.jvm.internal.l.c(eVar2);
            if (hVar.add(eVar2)) {
                boolean zQ0 = interfaceC1702b.Q0(eVar2);
                K k7 = K.f13366c;
                AbstractC1566c abstractC1566c2 = zQ0 ? k7 : abstractC1566c;
                if (abstractC1566c2.equals(k7)) {
                    abstractC1566c2 = null;
                }
                if (abstractC1566c2 == null) {
                    continue;
                } else {
                    Iterator it = interfaceC1702b.X0(interfaceC1702b.y(eVar2)).iterator();
                    while (it.hasNext()) {
                        q5.e eVarE = abstractC1566c2.E(l7, (q5.d) it.next());
                        if ((interfaceC1702b.f0(eVarE) && !interfaceC1702b.Q0(eVarE)) || interfaceC1702b.x(eVarE)) {
                            l7.a();
                            return true;
                        }
                        arrayDeque.add(eVarE);
                    }
                }
            }
        }
        l7.a();
        return false;
    }

    public static final a0 i(a0 a0Var, AbstractC1586x abstractC1586x) {
        kotlin.jvm.internal.l.f("<this>", a0Var);
        kotlin.jvm.internal.l.f("origin", abstractC1586x);
        return H(a0Var, g(abstractC1586x));
    }

    public static boolean j(L l7, q5.e eVar, q5.h hVar) {
        InterfaceC1702b interfaceC1702b = l7.f13369c;
        if (interfaceC1702b.O(eVar)) {
            return true;
        }
        if (interfaceC1702b.Q0(eVar)) {
            return false;
        }
        if (l7.f13368b) {
            interfaceC1702b.I0(eVar);
        }
        return interfaceC1702b.l(interfaceC1702b.y(eVar), hVar);
    }

    public static final boolean k(AbstractC1586x abstractC1586x) {
        kotlin.jvm.internal.l.f("<this>", abstractC1586x);
        a0 a0VarW0 = abstractC1586x.w0();
        if (a0VarW0 instanceof p5.i) {
            return true;
        }
        return (a0VarW0 instanceof AbstractC1580q) && (((AbstractC1580q) a0VarW0).A0() instanceof p5.i);
    }

    public static final boolean l(AbstractC1586x abstractC1586x) {
        kotlin.jvm.internal.l.f("<this>", abstractC1586x);
        return abstractC1586x.w0() instanceof AbstractC1580q;
    }

    public static final B m(AbstractC1586x abstractC1586x) {
        kotlin.jvm.internal.l.f("<this>", abstractC1586x);
        a0 a0VarW0 = abstractC1586x.w0();
        if (a0VarW0 instanceof AbstractC1580q) {
            return ((AbstractC1580q) a0VarW0).f13407l;
        }
        if (a0VarW0 instanceof B) {
            return (B) a0VarW0;
        }
        throw new D6.r();
    }

    public static final a0 n(a0 a0Var, boolean z7) {
        kotlin.jvm.internal.l.f("<this>", a0Var);
        C1575l c1575lO = C1567d.o(a0Var, z7);
        if (c1575lO != null) {
            return c1575lO;
        }
        B bO = o(a0Var);
        return bO != null ? bO : a0Var.x0(false);
    }

    public static final B o(a0 a0Var) {
        C1585w c1585w;
        M mT0 = a0Var.t0();
        C1585w c1585w2 = mT0 instanceof C1585w ? (C1585w) mT0 : null;
        if (c1585w2 != null) {
            LinkedHashSet<AbstractC1586x> linkedHashSet = c1585w2.f13418b;
            ArrayList arrayList = new ArrayList(P3.r.p(linkedHashSet, 10));
            boolean z7 = false;
            for (AbstractC1586x abstractC1586xN : linkedHashSet) {
                if (Y.e(abstractC1586xN)) {
                    abstractC1586xN = n(abstractC1586xN.w0(), false);
                    z7 = true;
                }
                arrayList.add(abstractC1586xN);
            }
            if (z7) {
                AbstractC1586x abstractC1586xN2 = c1585w2.a;
                if (abstractC1586xN2 == null) {
                    abstractC1586xN2 = null;
                } else if (Y.e(abstractC1586xN2)) {
                    abstractC1586xN2 = n(abstractC1586xN2.w0(), false);
                }
                arrayList.isEmpty();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(arrayList);
                linkedHashSet2.hashCode();
                c1585w = new C1585w(linkedHashSet2);
                c1585w.a = abstractC1586xN2;
            } else {
                c1585w = null;
            }
            if (c1585w != null) {
                return c1585w.b();
            }
        }
        return null;
    }

    public static final B p(B b4, List list, I i7) {
        kotlin.jvm.internal.l.f("<this>", b4);
        kotlin.jvm.internal.l.f("newArguments", list);
        kotlin.jvm.internal.l.f("newAttributes", i7);
        if (list.isEmpty() && i7 == b4.s0()) {
            return b4;
        }
        if (list.isEmpty()) {
            return b4.z0(i7);
        }
        if (!(b4 instanceof p5.i)) {
            return u(list, i7, b4.t0(), b4.u0());
        }
        p5.i iVar = (p5.i) b4;
        String[] strArr = iVar.f14421q;
        return new p5.i(iVar.f14416l, iVar.f14417m, iVar.f14418n, list, iVar.f14420p, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static AbstractC1586x q(AbstractC1586x abstractC1586x, List list, v4.h hVar, int i7) {
        if ((i7 & 2) != 0) {
            hVar = abstractC1586x.getAnnotations();
        }
        kotlin.jvm.internal.l.f("<this>", abstractC1586x);
        if ((list.isEmpty() || list == abstractC1586x.q0()) && hVar == abstractC1586x.getAnnotations()) {
            return abstractC1586x;
        }
        I iS0 = abstractC1586x.s0();
        if ((hVar instanceof v4.l) && ((v4.l) hVar).isEmpty()) {
            hVar = C2159g.a;
        }
        I iS = s(iS0, hVar);
        a0 a0VarW0 = abstractC1586x.w0();
        if (a0VarW0 instanceof AbstractC1580q) {
            AbstractC1580q abstractC1580q = (AbstractC1580q) a0VarW0;
            return f(p(abstractC1580q.f13407l, list, iS), p(abstractC1580q.f13408m, list, iS));
        }
        if (a0VarW0 instanceof B) {
            return p((B) a0VarW0, list, iS);
        }
        throw new D6.r();
    }

    public static /* synthetic */ B r(B b4, List list, I i7, int i8) {
        if ((i8 & 1) != 0) {
            list = b4.q0();
        }
        if ((i8 & 2) != 0) {
            i7 = b4.s0();
        }
        return p(b4, list, i7);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final n5.I s(n5.I r5, v4.h r6) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.l.f(r0, r5)
            v4.h r0 = n5.AbstractC1571h.a(r5)
            if (r0 != r6) goto Lc
            return r5
        Lc:
            l4.v[] r0 = n5.AbstractC1571h.a
            r1 = 0
            r0 = r0[r1]
            C1.m r1 = n5.AbstractC1571h.f13398b
            java.lang.Object r0 = r1.getValue(r5, r0)
            n5.g r0 = (n5.C1570g) r0
            if (r0 == 0) goto L5f
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L22
            goto L50
        L22:
            t5.a r1 = r5.f16095k
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L2d:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L44
            java.lang.Object r3 = r1.next()
            r4 = r3
            n5.g r4 = (n5.C1570g) r4
            boolean r4 = kotlin.jvm.internal.l.a(r4, r0)
            if (r4 != 0) goto L2d
            r2.add(r3)
            goto L2d
        L44:
            int r0 = r2.size()
            t5.a r1 = r5.f16095k
            int r1 = r1.a()
            if (r0 != r1) goto L52
        L50:
            r0 = r5
            goto L5b
        L52:
            L2.e r0 = n5.I.f13362l
            r0.getClass()
            n5.I r0 = L2.e.b1(r2)
        L5b:
            if (r0 != 0) goto L5e
            goto L5f
        L5e:
            r5 = r0
        L5f:
            java.util.Iterator r0 = r6.iterator()
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L70
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L70
            goto L95
        L70:
            n5.g r0 = new n5.g
            r0.<init>(r6)
            kotlin.jvm.internal.z r6 = kotlin.jvm.internal.y.a
            java.lang.Class<n5.g> r1 = n5.C1570g.class
            l4.d r6 = r6.b(r1)
            L2.e r1 = n5.I.f13362l
            r1.getClass()
            java.lang.String r6 = r6.k()
            kotlin.jvm.internal.l.c(r6)
            int r6 = r1.j1(r6)
            t5.a r1 = r5.f16095k
            java.lang.Object r6 = r1.get(r6)
            if (r6 == 0) goto L96
        L95:
            return r5
        L96:
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto La6
            n5.I r5 = new n5.I
            java.util.List r6 = P3.r.H(r0)
            r5.<init>(r6)
            return r5
        La6:
            java.util.List r5 = P3.q.S0(r5)
            java.util.ArrayList r5 = P3.q.H0(r5, r0)
            n5.I r5 = L2.e.b1(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.AbstractC1566c.s(n5.I, v4.h):n5.I");
    }

    public static final B t(I i7, InterfaceC2099e interfaceC2099e, List list) {
        kotlin.jvm.internal.l.f("attributes", i7);
        kotlin.jvm.internal.l.f("descriptor", interfaceC2099e);
        kotlin.jvm.internal.l.f("arguments", list);
        M mV = interfaceC2099e.v();
        kotlin.jvm.internal.l.e("getTypeConstructor(...)", mV);
        return u(list, i7, mV, false);
    }

    public static B u(List list, I i7, M m7, boolean z7) {
        g5.o oVarG;
        AbstractC2299z abstractC2299z;
        g5.o oVarF;
        g5.o oVar;
        kotlin.jvm.internal.l.f("attributes", i7);
        kotlin.jvm.internal.l.f("constructor", m7);
        kotlin.jvm.internal.l.f("arguments", list);
        if (i7.isEmpty() && list.isEmpty() && !z7 && m7.f() != null) {
            InterfaceC2102h interfaceC2102hF = m7.f();
            kotlin.jvm.internal.l.c(interfaceC2102hF);
            B bG = interfaceC2102hF.g();
            kotlin.jvm.internal.l.e("getDefaultType(...)", bG);
            return bG;
        }
        InterfaceC2102h interfaceC2102hF2 = m7.f();
        if (interfaceC2102hF2 instanceof u4.Q) {
            oVarG = ((u4.Q) interfaceC2102hF2).g().k0();
        } else {
            if (interfaceC2102hF2 instanceof InterfaceC2099e) {
                d5.e.i(d5.e.j(interfaceC2102hF2));
                C1706f c1706f = C1706f.a;
                if (list.isEmpty()) {
                    InterfaceC2099e interfaceC2099e = (InterfaceC2099e) interfaceC2102hF2;
                    kotlin.jvm.internal.l.f("<this>", interfaceC2099e);
                    abstractC2299z = interfaceC2099e instanceof AbstractC2299z ? (AbstractC2299z) interfaceC2099e : null;
                    if (abstractC2299z == null || (oVarF = abstractC2299z.q(c1706f)) == null) {
                        oVarG = interfaceC2099e.g0();
                        kotlin.jvm.internal.l.e("getUnsubstitutedMemberScope(...)", oVarG);
                    }
                    oVar = oVarF;
                } else {
                    InterfaceC2099e interfaceC2099e2 = (InterfaceC2099e) interfaceC2102hF2;
                    T tF = N.f13375b.f(m7, list);
                    kotlin.jvm.internal.l.f("<this>", interfaceC2099e2);
                    abstractC2299z = interfaceC2099e2 instanceof AbstractC2299z ? (AbstractC2299z) interfaceC2099e2 : null;
                    if (abstractC2299z == null || (oVarF = abstractC2299z.f(tF, c1706f)) == null) {
                        oVarG = interfaceC2099e2.N(tF);
                        kotlin.jvm.internal.l.e("getMemberScope(...)", oVarG);
                    }
                    oVar = oVarF;
                }
                return w(i7, m7, list, z7, oVar, new C1587y(list, i7, m7, z7));
            }
            if (interfaceC2102hF2 instanceof u4.P) {
                p5.h hVar = p5.h.f14411n;
                String str = ((AbstractC2287n) ((u4.P) interfaceC2102hF2)).getName().f9624k;
                kotlin.jvm.internal.l.e("toString(...)", str);
                oVarG = p5.l.a(hVar, true, str);
            } else {
                if (!(m7 instanceof C1585w)) {
                    throw new IllegalStateException("Unsupported classifier: " + interfaceC2102hF2 + " for constructor: " + m7);
                }
                oVarG = AbstractC0905c.g("member scope for intersection type", ((C1585w) m7).f13418b);
            }
        }
        oVar = oVarG;
        return w(i7, m7, list, z7, oVar, new C1587y(list, i7, m7, z7));
    }

    public static final B v(g5.o oVar, List list, I i7, M m7, boolean z7) {
        kotlin.jvm.internal.l.f("attributes", i7);
        kotlin.jvm.internal.l.f("constructor", m7);
        kotlin.jvm.internal.l.f("arguments", list);
        kotlin.jvm.internal.l.f("memberScope", oVar);
        C c2 = new C(m7, list, z7, oVar, new C1587y(oVar, list, i7, m7, z7));
        return i7.isEmpty() ? c2 : new D(c2, i7);
    }

    public static final B w(I i7, M m7, List list, boolean z7, g5.o oVar, e4.k kVar) {
        kotlin.jvm.internal.l.f("attributes", i7);
        kotlin.jvm.internal.l.f("constructor", m7);
        kotlin.jvm.internal.l.f("arguments", list);
        kotlin.jvm.internal.l.f("memberScope", oVar);
        C c2 = new C(m7, list, z7, oVar, kVar);
        return i7.isEmpty() ? c2 : new D(c2, i7);
    }

    public static final AbstractC1586x x(u4.Q q6) {
        kotlin.jvm.internal.l.f("<this>", q6);
        InterfaceC2105k interfaceC2105kK = q6.k();
        kotlin.jvm.internal.l.e("getContainingDeclaration(...)", interfaceC2105kK);
        if (interfaceC2105kK instanceof InterfaceC2103i) {
            List parameters = ((InterfaceC2103i) interfaceC2105kK).v().getParameters();
            kotlin.jvm.internal.l.e("getParameters(...)", parameters);
            ArrayList arrayList = new ArrayList(P3.r.p(parameters, 10));
            Iterator it = parameters.iterator();
            while (it.hasNext()) {
                M mV = ((u4.Q) it.next()).v();
                kotlin.jvm.internal.l.e("getTypeConstructor(...)", mV);
                arrayList.add(mV);
            }
            List upperBounds = q6.getUpperBounds();
            kotlin.jvm.internal.l.e("getUpperBounds(...)", upperBounds);
            return d(arrayList, upperBounds, d5.e.e(q6));
        }
        if (!(interfaceC2105kK instanceof InterfaceC2112s)) {
            throw new IllegalArgumentException("Unsupported descriptor type to build star projection type based on type parameters of it");
        }
        List typeParameters = ((InterfaceC2112s) interfaceC2105kK).getTypeParameters();
        kotlin.jvm.internal.l.e("getTypeParameters(...)", typeParameters);
        ArrayList arrayList2 = new ArrayList(P3.r.p(typeParameters, 10));
        Iterator it2 = typeParameters.iterator();
        while (it2.hasNext()) {
            M mV2 = ((u4.Q) it2.next()).v();
            kotlin.jvm.internal.l.e("getTypeConstructor(...)", mV2);
            arrayList2.add(mV2);
        }
        List upperBounds2 = q6.getUpperBounds();
        kotlin.jvm.internal.l.e("getUpperBounds(...)", upperBounds2);
        return d(arrayList2, upperBounds2, d5.e.e(q6));
    }

    public static boolean y(InterfaceC1702b interfaceC1702b, q5.e eVar, q5.e eVar2) {
        if (interfaceC1702b.U0(eVar) == interfaceC1702b.U0(eVar2) && interfaceC1702b.Q0(eVar) == interfaceC1702b.Q0(eVar2) && interfaceC1702b.x(eVar) == interfaceC1702b.x(eVar2) && interfaceC1702b.l(interfaceC1702b.y(eVar), interfaceC1702b.y(eVar2))) {
            if (interfaceC1702b.i0(eVar, eVar2)) {
                return true;
            }
            int iU0 = interfaceC1702b.U0(eVar);
            for (int i7 = 0; i7 < iU0; i7++) {
                Q Q6 = interfaceC1702b.Q(eVar, i7);
                Q Q7 = interfaceC1702b.Q(eVar2, i7);
                if (interfaceC1702b.r(Q6) == interfaceC1702b.r(Q7)) {
                    if (!interfaceC1702b.r(Q6)) {
                        if (interfaceC1702b.U(Q6) == interfaceC1702b.U(Q7)) {
                            a0 a0VarV = interfaceC1702b.V(Q6);
                            kotlin.jvm.internal.l.c(a0VarV);
                            a0 a0VarV2 = interfaceC1702b.V(Q7);
                            kotlin.jvm.internal.l.c(a0VarV2);
                            if (!z(interfaceC1702b, a0VarV, a0VarV2)) {
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static boolean z(InterfaceC1702b interfaceC1702b, q5.d dVar, q5.d dVar2) {
        if (dVar == dVar2) {
            return true;
        }
        B bV = interfaceC1702b.v(dVar);
        B bV2 = interfaceC1702b.v(dVar2);
        if (bV != null && bV2 != null) {
            return y(interfaceC1702b, bV, bV2);
        }
        AbstractC1580q abstractC1580qP0 = interfaceC1702b.p0(dVar);
        AbstractC1580q abstractC1580qP02 = interfaceC1702b.p0(dVar2);
        return abstractC1580qP0 != null && abstractC1580qP02 != null && y(interfaceC1702b, interfaceC1702b.m0(abstractC1580qP0), interfaceC1702b.m0(abstractC1580qP02)) && y(interfaceC1702b, interfaceC1702b.v0(abstractC1580qP0), interfaceC1702b.v0(abstractC1580qP02));
    }

    public abstract q5.e E(L l7, q5.d dVar);
}
