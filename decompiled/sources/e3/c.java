package e3;

import B1.InterfaceC0021h;
import H5.C;
import L.U1;
import O.C0486d;
import O.C0493g0;
import O.C0502l;
import O.C0509o0;
import O.C0510p;
import O.InterfaceC0501k0;
import O.T;
import O.Z;
import P3.q;
import P3.r;
import P3.v;
import a0.n;
import b1.AbstractC0703b;
import e4.k;
import f.AbstractC0841b;
import f1.AbstractC0871d;
import f6.C0912j;
import f6.C0918p;
import f6.C0919q;
import f6.EnumC0899M;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import k4.C1395d;
import k4.C1396e;
import kotlin.jvm.internal.l;
import l4.C1447z;
import l4.EnumC1413A;
import l4.EnumC1435n;
import l4.InterfaceC1424c;
import l4.InterfaceC1425d;
import l4.InterfaceC1426e;
import l4.InterfaceC1436o;
import l4.InterfaceC1440s;
import m.AbstractC1475E;
import m.C1504y;
import m4.AbstractC1511a;
import n5.AbstractC1566c;
import n5.AbstractC1586x;
import n5.B;
import n5.G;
import n5.I;
import n5.M;
import n5.Y;
import n5.b0;
import n6.m;
import o.C1605c;
import o.C1608f;
import o.C1612j;
import o.C1613k;
import o.C1623u;
import o4.AbstractC1694t;
import o4.C1669a0;
import o4.C1672c;
import o4.F0;
import o4.InterfaceC1650D;
import o4.v0;
import p.B0;
import p.C0;
import p.p0;
import p.u0;
import p.z0;
import r4.AbstractC1880i;
import s2.C1973a;
import s2.InterfaceC1976d;
import u4.C2119z;
import u4.InterfaceC2097c;
import u4.InterfaceC2099e;
import u4.InterfaceC2102h;
import u4.InterfaceC2104j;
import u4.InterfaceC2105k;
import u4.K;
import u4.Q;
import u4.S;
import u4.U;
import w6.o;
import w6.y;
import x0.C2248h;
import x4.C2295v;
import y.C2306F;
import y.C2342w;
import y0.C2361h;
import y0.C2362i;
import y0.C2363j;
import y0.InterfaceC2364k;

/* loaded from: classes.dex */
public abstract class c {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    public static final ArrayList A(B b4) {
        ?? H6;
        if (!Z4.g.g(b4)) {
            return null;
        }
        InterfaceC2102h interfaceC2102hF = b4.t0().f();
        l.d("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor", interfaceC2102hF);
        int i7 = d5.e.a;
        S sZ = ((InterfaceC2099e) interfaceC2102hF).Z();
        C2119z c2119z = sZ instanceof C2119z ? (C2119z) sZ : null;
        l.c(c2119z);
        ArrayList arrayList = new ArrayList();
        Iterator it = c2119z.a.iterator();
        while (it.hasNext()) {
            O3.l lVar = (O3.l) it.next();
            W4.e eVar = (W4.e) lVar.f7528k;
            ArrayList arrayListA = A((B) lVar.f7529l);
            if (arrayListA != null) {
                H6 = new ArrayList(r.p(arrayListA, 10));
                Iterator it2 = arrayListA.iterator();
                while (it2.hasNext()) {
                    H6.add(eVar.c() + '-' + ((String) it2.next()));
                }
            } else {
                H6 = r.H(eVar.c());
            }
            v.e0(arrayList, H6);
        }
        return arrayList;
    }

    public static String B(String str, Object... objArr) {
        int iIndexOf;
        String string;
        int i7 = 0;
        for (int i8 = 0; i8 < objArr.length; i8++) {
            Object obj = objArr[i8];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e7) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + str2, (Throwable) e7);
                    StringBuilder sbQ = AbstractC0703b.q("<", str2, " threw ");
                    sbQ.append(e7.getClass().getName());
                    sbQ.append(">");
                    string = sbQ.toString();
                }
            }
            objArr[i8] = string;
        }
        StringBuilder sb = new StringBuilder((objArr.length * 16) + str.length());
        int i9 = 0;
        while (i7 < objArr.length && (iIndexOf = str.indexOf("%s", i9)) != -1) {
            sb.append((CharSequence) str, i9, iIndexOf);
            sb.append(objArr[i7]);
            i9 = iIndexOf + 2;
            i7++;
        }
        sb.append((CharSequence) str, i9, str.length());
        if (i7 < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i7]);
            for (int i10 = i7 + 1; i10 < objArr.length; i10++) {
                sb.append(", ");
                sb.append(objArr[i10]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static void C(InterfaceC1976d interfaceC1976d, int i7, InterfaceC0021h interfaceC0021h) {
        long jE = interfaceC1976d.e(i7);
        List listI = interfaceC1976d.i(jE);
        if (listI.isEmpty()) {
            return;
        }
        if (i7 == interfaceC1976d.m() - 1) {
            throw new IllegalStateException();
        }
        long jE2 = interfaceC1976d.e(i7 + 1) - interfaceC1976d.e(i7);
        if (jE2 > 0) {
            interfaceC0021h.c(new C1973a(jE, jE2, listI));
        }
    }

    public static void D(StringBuilder sb, InterfaceC1425d interfaceC1425d, W4.d dVar, List list, boolean z7) throws IOException {
        if (interfaceC1425d.getTypeParameters().size() >= list.size() || m.F(interfaceC1425d).getDeclaringClass() == null) {
            sb.append(z1.c.I(W4.d.f(dVar)));
        } else {
            Class<?> declaringClass = m.F(interfaceC1425d).getDeclaringClass();
            l.e("getDeclaringClass(...)", declaringClass);
            D(sb, m.I(declaringClass), dVar.e(), q.o0(list, interfaceC1425d.getTypeParameters().size()), false);
            sb.append(".");
            sb.append(z1.c.G(dVar.g()));
        }
        F(sb, q.P0(list, interfaceC1425d.getTypeParameters().size()), z7);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x023b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String E(l4.InterfaceC1444w r17) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 591
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e3.c.E(l4.w):java.lang.String");
    }

    public static void F(StringBuilder sb, List list, boolean z7) throws IOException {
        StringBuilder sb2;
        if (list.isEmpty()) {
            sb2 = sb;
        } else {
            sb2 = sb;
            q.x0(list, sb2, null, "<", ">", null, 114);
        }
        if (z7) {
            sb2.append("?");
        }
    }

    public static C1396e G(k4.g gVar, int i7) {
        l.f("<this>", gVar);
        boolean z7 = i7 > 0;
        Integer numValueOf = Integer.valueOf(i7);
        if (z7) {
            if (gVar.f12674m <= 0) {
                i7 = -i7;
            }
            return new C1396e(gVar.f12672k, gVar.f12673l, i7);
        }
        throw new IllegalArgumentException("Step must be positive, was: " + numValueOf + '.');
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void H(s2.InterfaceC1976d r12, s2.C1981i r13, B1.InterfaceC0021h r14) {
        /*
            long r0 = r13.a
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r5 = 0
            if (r4 != 0) goto Le
            r4 = r5
            goto L27
        Le:
            int r4 = r12.d(r0)
            r6 = -1
            if (r4 != r6) goto L19
            int r4 = r12.m()
        L19:
            if (r4 <= 0) goto L27
            int r6 = r4 + (-1)
            long r6 = r12.e(r6)
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 != 0) goto L27
            int r4 = r4 + (-1)
        L27:
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L51
            int r2 = r12.m()
            if (r4 >= r2) goto L51
            java.util.List r11 = r12.i(r0)
            long r2 = r12.e(r4)
            boolean r6 = r11.isEmpty()
            if (r6 != 0) goto L51
            long r7 = r13.a
            int r6 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r6 >= 0) goto L51
            s2.a r6 = new s2.a
            long r9 = r2 - r7
            r6.<init>(r7, r9, r11)
            r14.c(r6)
            r2 = 1
            goto L52
        L51:
            r2 = r5
        L52:
            r3 = r4
        L53:
            int r6 = r12.m()
            if (r3 >= r6) goto L5f
            C(r12, r3, r14)
            int r3 = r3 + 1
            goto L53
        L5f:
            boolean r13 = r13.f15521b
            if (r13 == 0) goto L87
            if (r2 == 0) goto L67
            int r4 = r4 + (-1)
        L67:
            if (r5 >= r4) goto L6f
            C(r12, r5, r14)
            int r5 = r5 + 1
            goto L67
        L6f:
            if (r2 == 0) goto L87
            s2.a r6 = new s2.a
            java.util.List r11 = r12.i(r0)
            long r7 = r12.e(r4)
            long r12 = r12.e(r4)
            long r9 = r0 - r12
            r6.<init>(r7, r9, r11)
            r14.c(r6)
        L87:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e3.c.H(s2.d, s2.i, B1.h):void");
    }

    public static final Class I(AbstractC1586x abstractC1586x) {
        B bH;
        Class clsJ = J(abstractC1586x.t0().f());
        if (clsJ == null) {
            return null;
        }
        if (Y.e(abstractC1586x) && ((bH = Z4.g.h(abstractC1586x)) == null || Y.e(bH) || AbstractC1880i.F(bH))) {
            return null;
        }
        return clsJ;
    }

    public static final Class J(InterfaceC2105k interfaceC2105k) {
        if (!(interfaceC2105k instanceof InterfaceC2099e) || !Z4.g.b(interfaceC2105k)) {
            return null;
        }
        InterfaceC2099e interfaceC2099e = (InterfaceC2099e) interfaceC2105k;
        Class clsJ = F0.j(interfaceC2099e);
        if (clsJ != null) {
            return clsJ;
        }
        throw new C("Class object for the class " + interfaceC2099e.getName() + " cannot be found (classId=" + d5.e.f((InterfaceC2102h) interfaceC2105k) + ')');
    }

    public static final String K(float f5) {
        if (Float.isNaN(f5)) {
            return "NaN";
        }
        if (Float.isInfinite(f5)) {
            return f5 < 0.0f ? "-Infinity" : "Infinity";
        }
        int iMax = Math.max(1, 0);
        float fPow = (float) Math.pow(10.0f, iMax);
        float f7 = f5 * fPow;
        int i7 = (int) f7;
        if (f7 - i7 >= 0.5f) {
            i7++;
        }
        float f8 = i7 / fPow;
        return iMax > 0 ? String.valueOf(f8) : String.valueOf((int) f8);
    }

    public static k4.g L(int i7, int i8) {
        if (i8 > Integer.MIN_VALUE) {
            return new k4.g(i7, i8 - 1, 1);
        }
        k4.g gVar = k4.g.f12679n;
        return k4.g.f12679n;
    }

    public static final void a(u0 u0Var, a0.q qVar, k kVar, a0.i iVar, k kVar2, W.a aVar, C0510p c0510p, int i7) {
        int i8;
        k kVar3;
        C1613k c1613k;
        Y.r rVar;
        C0510p c0510p2;
        C1613k c1613k2;
        k kVar4 = kVar;
        c0510p.T(-114689412);
        if ((i7 & 6) == 0) {
            i8 = (c0510p.f(u0Var) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= c0510p.f(qVar) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i8 |= c0510p.h(kVar4) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            i8 |= c0510p.f(iVar) ? 2048 : 1024;
        }
        if ((i7 & 24576) == 0) {
            i8 |= c0510p.h(kVar2) ? 16384 : 8192;
        }
        W.a aVar2 = aVar;
        if ((196608 & i7) == 0) {
            i8 |= c0510p.h(aVar2) ? 131072 : 65536;
        }
        if ((74899 & i8) == 74898 && c0510p.y()) {
            c0510p.M();
            kVar3 = kVar4;
            c0510p2 = c0510p;
        } else {
            int i9 = i8 & 14;
            boolean z7 = i9 == 4;
            Object objH = c0510p.H();
            Object obj = C0502l.a;
            if (z7 || objH == obj) {
                objH = new C1613k(u0Var, iVar);
                c0510p.b0(objH);
            }
            C1613k c1613k3 = (C1613k) objH;
            boolean z8 = i9 == 4;
            Object objH2 = c0510p.H();
            Object obj2 = objH2;
            if (z8 || objH2 == obj) {
                Object[] objArr = {u0Var.a.v0()};
                Y.r rVar2 = new Y.r();
                rVar2.addAll(P3.m.u0(objArr));
                c0510p.b0(rVar2);
                obj2 = rVar2;
            }
            Y.r rVar3 = (Y.r) obj2;
            boolean z9 = i9 == 4;
            Object objH3 = c0510p.H();
            if (z9 || objH3 == obj) {
                long[] jArr = AbstractC1475E.a;
                objH3 = new C1504y();
                c0510p.b0(objH3);
            }
            C1504y c1504y = (C1504y) objH3;
            boolean zContains = rVar3.contains(u0Var.a.v0());
            Q4.c cVar = u0Var.a;
            if (!zContains) {
                rVar3.clear();
                rVar3.add(cVar.v0());
            }
            Object objV0 = cVar.v0();
            C0493g0 c0493g0 = u0Var.f14136d;
            if (l.a(objV0, c0493g0.getValue())) {
                if (rVar3.size() != 1 || !l.a(rVar3.get(0), cVar.v0())) {
                    rVar3.clear();
                    rVar3.add(cVar.v0());
                }
                if (c1504y.f12943e != 1 || c1504y.b(cVar.v0())) {
                    c1504y.a();
                }
                c1613k3.f13508b = iVar;
            }
            if (!l.a(cVar.v0(), c0493g0.getValue()) && !rVar3.contains(c0493g0.getValue())) {
                ListIterator listIterator = rVar3.listIterator();
                int i10 = 0;
                while (true) {
                    Q3.a aVar3 = (Q3.a) listIterator;
                    ListIterator listIterator2 = listIterator;
                    if (!aVar3.hasNext()) {
                        i10 = -1;
                        break;
                    } else {
                        if (l.a(kVar2.invoke(aVar3.next()), kVar2.invoke(c0493g0.getValue()))) {
                            break;
                        }
                        i10++;
                        listIterator = listIterator2;
                    }
                }
                if (i10 == -1) {
                    rVar3.add(c0493g0.getValue());
                } else {
                    rVar3.set(i10, c0493g0.getValue());
                }
            }
            if (c1504y.b(c0493g0.getValue()) && c1504y.b(cVar.v0())) {
                c0510p.R(915535767);
                c0510p.p(false);
                kVar3 = kVar4;
                c1613k = c1613k3;
            } else {
                c0510p.R(912931457);
                c1504y.a();
                int size = rVar3.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj3 = rVar3.get(i11);
                    c1504y.i(obj3, W.f.b(885640742, new C1605c(u0Var, obj3, kVar4, c1613k3, rVar3, aVar2), c0510p));
                    i11++;
                    kVar4 = kVar4;
                    aVar2 = aVar;
                }
                kVar3 = kVar4;
                c1613k = c1613k3;
                c0510p.p(false);
            }
            boolean zF = c0510p.f(u0Var.f()) | c0510p.f(c1613k);
            Object objH4 = c0510p.H();
            if (zF || objH4 == obj) {
                objH4 = (C1623u) kVar3.invoke(c1613k);
                c0510p.b0(objH4);
            }
            C1623u c1623u = (C1623u) objH4;
            c1613k.getClass();
            boolean zF2 = c0510p.f(c1613k);
            Object objH5 = c0510p.H();
            if (zF2 || objH5 == obj) {
                objH5 = C0486d.K(Boolean.FALSE, T.f7049p);
                c0510p.b0(objH5);
            }
            Z z10 = (Z) objH5;
            Z zN = C0486d.N(c1623u.f13537d, c0510p);
            u0 u0Var2 = c1613k.a;
            if (l.a(u0Var2.a.v0(), u0Var2.f14136d.getValue())) {
                z10.setValue(Boolean.FALSE);
            } else if (zN.getValue() != null) {
                z10.setValue(Boolean.TRUE);
            }
            boolean zBooleanValue = ((Boolean) z10.getValue()).booleanValue();
            a0.q qVar2 = n.a;
            if (zBooleanValue) {
                c0510p.R(249037309);
                B0 b02 = C0.f13845h;
                C1613k c1613k4 = c1613k;
                u0 u0Var3 = c1613k4.a;
                rVar = rVar3;
                c1613k2 = c1613k4;
                c0510p2 = c0510p;
                p0 p0VarA = z0.a(u0Var3, b02, null, c0510p2, 0, 2);
                boolean zF3 = c0510p2.f(p0VarA);
                Object objH6 = c0510p2.H();
                if (zF3 || objH6 == obj) {
                    objH6 = q0.c.p(qVar2).k(new C1612j(c1613k2, p0VarA, zN));
                    c0510p2.b0(objH6);
                }
                qVar2 = (a0.q) objH6;
                c0510p2.p(false);
            } else {
                rVar = rVar3;
                c0510p2 = c0510p;
                c1613k2 = c1613k;
                c0510p2.R(249353726);
                c0510p2.p(false);
            }
            a0.q qVarK = qVar.k(qVar2);
            Object objH7 = c0510p2.H();
            if (objH7 == obj) {
                objH7 = new C1608f(c1613k2);
                c0510p2.b0(objH7);
            }
            C1608f c1608f = (C1608f) objH7;
            int i12 = c0510p2.f7128P;
            InterfaceC0501k0 interfaceC0501k0M = c0510p2.m();
            a0.q qVarC = a0.a.c(c0510p2, qVarK);
            InterfaceC2364k.f17877j.getClass();
            C2362i c2362i = C2363j.f17871b;
            c0510p2.V();
            if (c0510p2.f7127O) {
                c0510p2.l(c2362i);
            } else {
                c0510p2.e0();
            }
            C0486d.R(c0510p2, C2363j.f17875f, c1608f);
            C0486d.R(c0510p2, C2363j.f17874e, interfaceC0501k0M);
            C2361h c2361h = C2363j.f17876g;
            if (c0510p2.f7127O || !l.a(c0510p2.H(), Integer.valueOf(i12))) {
                AbstractC0703b.u(i12, c0510p2, i12, c2361h);
            }
            C0486d.R(c0510p2, C2363j.f17873d, qVarC);
            c0510p2.R(-1491001814);
            int size2 = rVar.size();
            int i13 = 0;
            while (i13 < size2) {
                Y.r rVar4 = rVar;
                Object obj4 = rVar4.get(i13);
                c0510p2.N(1908315325, 0, kVar2.invoke(obj4), null);
                e4.n nVar = (e4.n) c1504y.e(obj4);
                if (nVar == null) {
                    c0510p2.R(-971711888);
                } else {
                    c0510p2.R(1908317105);
                    nVar.invoke(c0510p2, 0);
                }
                c0510p2.p(false);
                c0510p2.p(false);
                i13++;
                rVar = rVar4;
            }
            c0510p2.p(false);
            c0510p2.p(true);
        }
        C0509o0 c0509o0S = c0510p2.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new U1(u0Var, qVar, kVar3, iVar, kVar2, aVar, i7);
        }
    }

    public static final void b(InterfaceC1440s interfaceC1440s, a0.q qVar, C2306F c2306f, e4.n nVar, C0510p c0510p, int i7) {
        c0510p.T(2002163445);
        if ((((c0510p.h(interfaceC1440s) ? 4 : 2) | i7 | (c0510p.f(qVar) ? 32 : 16) | (c0510p.f(c2306f) ? 256 : 128) | (c0510p.h(nVar) ? 2048 : 1024)) & 1171) == 1170 && c0510p.y()) {
            c0510p.M();
        } else {
            AbstractC0841b.b(W.f.b(-1488997347, new androidx.compose.foundation.lazy.layout.b(c2306f, qVar, nVar, C0486d.N(interfaceC1440s, c0510p)), c0510p), c0510p, 6);
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new C2342w(interfaceC1440s, qVar, c2306f, nVar, i7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:214:0x0327 A[PHI: r1
      0x0327: PHI (r1v48 z.k) = (r1v37 z.k), (r1v49 z.k) binds: [B:213:0x0325, B:209:0x031e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0348 A[PHI: r8 r20
      0x0348: PHI (r8v22 t.l) = (r8v23 t.l), (r8v24 t.l) binds: [B:224:0x0346, B:221:0x033e] A[DONT_GENERATE, DONT_INLINE]
      0x0348: PHI (r20v6 boolean) = (r20v7 boolean), (r20v9 boolean) binds: [B:224:0x0346, B:221:0x033e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x037a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x03c3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0485 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0487  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(a0.q r40, z.C2425d r41, v.Z r42, t.C2027g r43, boolean r44, float r45, z.k r46, z.C2422a r47, a0.h r48, t.l r49, W.a r50, O.C0510p r51, int r52, int r53) {
        /*
            Method dump skipped, instructions count: 1288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e3.c.c(a0.q, z.d, v.Z, t.g, boolean, float, z.k, z.a, a0.h, t.l, W.a, O.p, int, int):void");
    }

    public static final boolean d(String str) {
        for (int i7 = 0; i7 < str.length(); i7++) {
            char cCharAt = str.charAt(i7);
            if (l.g(cCharAt, 128) >= 0 || Character.isLetter(cCharAt)) {
                return true;
            }
        }
        return false;
    }

    public static void e(StringBuilder sb, InterfaceC1424c interfaceC1424c) throws IOException {
        l.f("<this>", interfaceC1424c);
        List parameters = interfaceC1424c.getParameters();
        ArrayList arrayList = new ArrayList();
        for (Object obj : parameters) {
            if (((C1669a0) ((InterfaceC1436o) obj)).f13676m == EnumC1435n.f12754l) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        q.x0(arrayList, sb, null, "context(", ") ", C1672c.f13690u, 50);
    }

    public static void f(StringBuilder sb, InterfaceC1424c interfaceC1424c) {
        l.d("null cannot be cast to non-null type kotlin.reflect.jvm.internal.KCallableImpl<*>", interfaceC1424c);
        Object objInvoke = ((AbstractC1694t) interfaceC1424c).f13751l.invoke();
        l.e("invoke(...)", objInvoke);
        ArrayList arrayList = new ArrayList();
        for (Object obj : (List) objInvoke) {
            EnumC1435n enumC1435n = ((C1669a0) ((InterfaceC1436o) obj)).f13676m;
            if (enumC1435n == EnumC1435n.f12753k || enumC1435n == EnumC1435n.f12755m) {
                arrayList.add(obj);
            }
        }
        InterfaceC1436o interfaceC1436o = (InterfaceC1436o) q.u0(0, arrayList);
        if (interfaceC1436o != null) {
            sb.append(E(((C1669a0) interfaceC1436o).e()));
            sb.append(".");
        }
        InterfaceC1436o interfaceC1436o2 = (InterfaceC1436o) q.u0(1, arrayList);
        if (interfaceC1436o2 != null) {
            sb.append("(");
            sb.append(E(((C1669a0) interfaceC1436o2).e()));
            sb.append(".");
            sb.append(")");
        }
    }

    public static void g(String str, Object obj) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int h(int i7, int i8) {
        long j7 = i7 + i8;
        int i9 = (int) j7;
        if (j7 == ((long) i9)) {
            return i9;
        }
        throw new ArithmeticException("overflow: checkedAdd(" + i7 + ", " + i8 + ")");
    }

    public static double i(double d4, double d6, double d7) {
        if (d6 <= d7) {
            return d4 < d6 ? d6 : d4 > d7 ? d7 : d4;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d7 + " is less than minimum " + d6 + '.');
    }

    public static float j(float f5, float f7, float f8) {
        if (f7 <= f8) {
            return f5 < f7 ? f7 : f5 > f8 ? f8 : f5;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f8 + " is less than minimum " + f7 + '.');
    }

    public static int k(int i7, int i8, int i9) {
        if (i8 <= i9) {
            return i7 < i8 ? i8 : i7 > i9 ? i9 : i7;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i9 + " is less than minimum " + i8 + '.');
    }

    public static long l(long j7, long j8, long j9) {
        if (j8 <= j9) {
            return j7 < j8 ? j8 : j7 > j9 ? j9 : j7;
        }
        StringBuilder sbK = A6.b.k("Cannot coerce value to an empty range: maximum ", j9, " is less than minimum ");
        sbK.append(j8);
        sbK.append('.');
        throw new IllegalArgumentException(sbK.toString());
    }

    public static long m(long j7, k4.j jVar) {
        if (jVar.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + jVar + '.');
        }
        long j8 = jVar.f12680k;
        if (j7 < Long.valueOf(j8).longValue()) {
            return Long.valueOf(j8).longValue();
        }
        long j9 = jVar.f12681l;
        return j7 > Long.valueOf(j9).longValue() ? Long.valueOf(j9).longValue() : j7;
    }

    public static Comparable n(Comparable comparable, C1395d c1395d) {
        if (c1395d.c()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + c1395d + '.');
        }
        float f5 = c1395d.a;
        if (C1395d.d(comparable, Float.valueOf(f5)) && !C1395d.d(Float.valueOf(f5), comparable)) {
            return Float.valueOf(f5);
        }
        float f7 = c1395d.f12671b;
        return (!C1395d.d(Float.valueOf(f7), comparable) || C1395d.d(comparable, Float.valueOf(f7))) ? comparable : Float.valueOf(f7);
    }

    public static final Object o(Object obj, InterfaceC2097c interfaceC2097c) {
        AbstractC1586x abstractC1586xX;
        Class clsI;
        return (((interfaceC2097c instanceof K) && Z4.g.d((U) interfaceC2097c)) || (abstractC1586xX = x(interfaceC2097c)) == null || (clsI = I(abstractC1586xX)) == null) ? obj : y(clsI, interfaceC2097c).invoke(obj, new Object[0]);
    }

    public static final v4.h p(v4.h hVar, v4.h hVar2) {
        l.f("first", hVar);
        l.f("second", hVar2);
        return hVar.isEmpty() ? hVar2 : hVar2.isEmpty() ? hVar : new v4.i(new v4.h[]{hVar, hVar2});
    }

    public static final q5.j r(b0 b0Var) {
        int iOrdinal = b0Var.ordinal();
        if (iOrdinal == 0) {
            return q5.j.f14749n;
        }
        if (iOrdinal == 1) {
            return q5.j.f14747l;
        }
        if (iOrdinal == 2) {
            return q5.j.f14748m;
        }
        throw new D6.r();
    }

    public static final v0 s(InterfaceC1426e interfaceC1426e, List list, boolean z7, List list2) {
        InterfaceC2102h descriptor;
        I i7;
        G g4;
        l.f("<this>", interfaceC1426e);
        l.f("arguments", list);
        l.f("annotations", list2);
        InterfaceC1650D interfaceC1650D = interfaceC1426e instanceof InterfaceC1650D ? (InterfaceC1650D) interfaceC1426e : null;
        if (interfaceC1650D == null || (descriptor = interfaceC1650D.getDescriptor()) == null) {
            throw new C("Cannot create type for an unsupported classifier: " + interfaceC1426e + " (" + interfaceC1426e.getClass() + ')');
        }
        M mV = descriptor.v();
        l.e("getTypeConstructor(...)", mV);
        List parameters = mV.getParameters();
        l.e("getParameters(...)", parameters);
        if (parameters.size() != list.size()) {
            throw new IllegalArgumentException("Class declares " + parameters.size() + " type parameters, but " + list.size() + " were provided.");
        }
        if (list2.isEmpty()) {
            I.f13362l.getClass();
            i7 = I.f13363m;
        } else {
            I.f13362l.getClass();
            i7 = I.f13363m;
        }
        List parameters2 = mV.getParameters();
        l.e("getParameters(...)", parameters2);
        ArrayList arrayList = new ArrayList(r.p(list, 10));
        int i8 = 0;
        for (Object obj : list) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                r.X();
                throw null;
            }
            C1447z c1447z = (C1447z) obj;
            v0 v0Var = (v0) c1447z.f12759b;
            AbstractC1586x abstractC1586x = v0Var != null ? v0Var.f13766k : null;
            EnumC1413A enumC1413A = c1447z.a;
            int i10 = enumC1413A == null ? -1 : AbstractC1511a.a[enumC1413A.ordinal()];
            if (i10 == -1) {
                Object obj2 = parameters2.get(i8);
                l.e("get(...)", obj2);
                g4 = new G((Q) obj2);
            } else if (i10 == 1) {
                b0 b0Var = b0.f13390m;
                l.c(abstractC1586x);
                g4 = new G(abstractC1586x, b0Var);
            } else if (i10 == 2) {
                b0 b0Var2 = b0.f13391n;
                l.c(abstractC1586x);
                g4 = new G(abstractC1586x, b0Var2);
            } else {
                if (i10 != 3) {
                    throw new D6.r();
                }
                b0 b0Var3 = b0.f13392o;
                l.c(abstractC1586x);
                g4 = new G(abstractC1586x, b0Var3);
            }
            arrayList.add(g4);
            i8 = i9;
        }
        return new v0(AbstractC1566c.u(arrayList, i7, mV, z7), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final p4.InterfaceC1801g t(p4.InterfaceC1801g r3, u4.InterfaceC2112s r4, boolean r5) {
        /*
            java.lang.String r0 = "descriptor"
            kotlin.jvm.internal.l.f(r0, r4)
            boolean r0 = Z4.g.a(r4)
            if (r0 != 0) goto L90
            java.util.List r0 = r4.M()
            java.lang.String r1 = "getContextReceiverParameters(...)"
            kotlin.jvm.internal.l.e(r1, r0)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L1b
            goto L36
        L1b:
            java.util.Iterator r0 = r0.iterator()
        L1f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L36
            java.lang.Object r1 = r0.next()
            x4.v r1 = (x4.C2295v) r1
            n5.x r1 = r1.getType()
            boolean r1 = Z4.g.f(r1)
            if (r1 == 0) goto L1f
            goto L90
        L36:
            java.util.List r0 = r4.m0()
            java.lang.String r1 = "getValueParameters(...)"
            kotlin.jvm.internal.l.e(r1, r0)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L46
            goto L68
        L46:
            java.util.Iterator r0 = r0.iterator()
        L4a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L68
            java.lang.Object r1 = r0.next()
            x4.S r1 = (x4.C2272S) r1
            x4.T r1 = (x4.AbstractC2273T) r1
            n5.x r1 = r1.getType()
            java.lang.String r2 = "getType(...)"
            kotlin.jvm.internal.l.e(r2, r1)
            boolean r1 = Z4.g.f(r1)
            if (r1 == 0) goto L4a
            goto L90
        L68:
            n5.x r0 = r4.getReturnType()
            r1 = 1
            if (r0 == 0) goto L82
            n5.M r0 = r0.t0()
            u4.h r0 = r0.f()
            if (r0 == 0) goto L7e
            boolean r0 = Z4.g.b(r0)
            goto L7f
        L7e:
            r0 = 0
        L7f:
            if (r0 != r1) goto L82
            goto L90
        L82:
            n5.x r0 = x(r4)
            if (r0 == 0) goto L8f
            boolean r0 = Z4.g.f(r0)
            if (r0 != r1) goto L8f
            goto L90
        L8f:
            return r3
        L90:
            p4.D r0 = new p4.D
            r0.<init>(r3, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e3.c.t(p4.g, u4.s, boolean):p4.g");
    }

    public static final void u(o oVar, y yVar) throws IOException {
        try {
            IOException iOException = null;
            for (y yVar2 : oVar.i(yVar)) {
                try {
                    if (oVar.j(yVar2).f17164b) {
                        u(oVar, yVar2);
                    }
                    oVar.b(yVar2);
                } catch (IOException e7) {
                    if (iOException == null) {
                        iOException = e7;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    public static C0919q v(SSLSession sSLSession) throws IOException {
        Certificate[] peerCertificates;
        List listL = P3.y.f7779k;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") ? true : cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            throw new IOException("cipherSuite == ".concat(cipherSuite));
        }
        C0912j c0912jC = C0912j.f11550b.c(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        EnumC0899M enumC0899MU = AbstractC0871d.U(protocol);
        try {
            peerCertificates = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException unused) {
        }
        List listL2 = peerCertificates != null ? g6.b.l(Arrays.copyOf(peerCertificates, peerCertificates.length)) : listL;
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        if (localCertificates != null) {
            listL = g6.b.l(Arrays.copyOf(localCertificates, localCertificates.length));
        }
        return new C0919q(enumC0899MU, c0912jC, listL, new C0918p(0, listL2));
    }

    public static final AbstractC1586x x(InterfaceC2097c interfaceC2097c) {
        C2295v c2295vD = interfaceC2097c.D();
        C2295v c2295vT = interfaceC2097c.t();
        if (c2295vD != null) {
            return c2295vD.getType();
        }
        if (c2295vT != null) {
            if (interfaceC2097c instanceof InterfaceC2104j) {
                return c2295vT.getType();
            }
            InterfaceC2105k interfaceC2105kK = interfaceC2097c.k();
            InterfaceC2099e interfaceC2099e = interfaceC2105kK instanceof InterfaceC2099e ? (InterfaceC2099e) interfaceC2105kK : null;
            if (interfaceC2099e != null) {
                return interfaceC2099e.g();
            }
        }
        return null;
    }

    public static final Method y(Class cls, InterfaceC2097c interfaceC2097c) throws NoSuchMethodException, SecurityException {
        l.f("descriptor", interfaceC2097c);
        try {
            Method declaredMethod = cls.getDeclaredMethod("unbox-impl", new Class[0]);
            l.c(declaredMethod);
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            throw new C("No unbox method found in inline class: " + cls + " (calling " + interfaceC2097c + ')');
        }
    }

    public static final ArrayList z(B b4) {
        ArrayList arrayListA = A(AbstractC1566c.b(b4));
        if (arrayListA == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(r.p(arrayListA, 10));
        Iterator it = arrayListA.iterator();
        while (it.hasNext()) {
            arrayList.add("unbox-impl-" + ((String) it.next()));
        }
        InterfaceC2102h interfaceC2102hF = b4.t0().f();
        l.d("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor", interfaceC2102hF);
        Class clsJ = F0.j((InterfaceC2099e) interfaceC2102hF);
        l.c(clsJ);
        ArrayList arrayList2 = new ArrayList(r.p(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(clsJ.getDeclaredMethod((String) it2.next(), new Class[0]));
        }
        return arrayList2;
    }

    public abstract boolean q(C2248h c2248h);

    public abstract Object w(C2248h c2248h);
}
