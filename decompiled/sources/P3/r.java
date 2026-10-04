package P3;

import B1.AbstractC0015b;
import D.C0053g0;
import D.C0056i;
import D.InterfaceC0071p0;
import D4.i0;
import D4.j0;
import D4.k0;
import G2.P;
import H.C0190g;
import H.InterfaceC0196m;
import H.Q;
import H.S;
import H.U;
import O.C0486d;
import O.C0502l;
import O.C0509o0;
import O.C0510p;
import O.T;
import O.Z;
import android.content.Context;
import android.os.Bundle;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.InterfaceC0694v;
import b1.AbstractC0703b;
import d.AbstractC0774h;
import d.C0770d;
import d.C0771e;
import e4.InterfaceC0821a;
import h0.C0975U;
import h0.C0998u;
import io.ktor.http.ContentDisposition;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import n0.AbstractC1530A;
import n0.C1537d;
import n0.C1538e;
import n0.C1541h;
import n0.C1545l;
import n0.C1550q;
import n0.C1553t;
import u4.AbstractC2108n;
import u4.f0;
import v.c0;
import y0.AbstractC2359f;
import y0.InterfaceC2366m;
import y0.Y;

/* loaded from: classes.dex */
public abstract class r {
    public static C1538e a;

    /* renamed from: b, reason: collision with root package name */
    public static C1538e f7772b;

    /* renamed from: c, reason: collision with root package name */
    public static C1538e f7773c;

    /* renamed from: d, reason: collision with root package name */
    public static C1538e f7774d;

    /* renamed from: e, reason: collision with root package name */
    public static C1538e f7775e;

    public static final C1538e A() {
        C1538e c1538e = f7774d;
        if (c1538e != null) {
            return c1538e;
        }
        C1537d c1537d = new C1537d("Filled.PlayArrow", false);
        int i7 = AbstractC1530A.a;
        C0975U c0975u = new C0975U(C0998u.f11829b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new C1545l(8.0f, 5.0f));
        arrayList.add(new C1553t(14.0f));
        arrayList.add(new C1550q(11.0f, -7.0f));
        arrayList.add(C1541h.f13175b);
        C1537d.a(c1537d, arrayList, c0975u);
        C1538e c1538eB = c1537d.b();
        f7774d = c1538eB;
        return c1538eB;
    }

    public static final int B(int i7, int i8, int i9) {
        if (i9 > 0) {
            if (i7 < i8) {
                int i10 = i8 % i9;
                if (i10 < 0) {
                    i10 += i9;
                }
                int i11 = i7 % i9;
                if (i11 < 0) {
                    i11 += i9;
                }
                int i12 = (i10 - i11) % i9;
                if (i12 < 0) {
                    i12 += i9;
                }
                return i8 - i12;
            }
        } else {
            if (i9 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i7 > i8) {
                int i13 = -i9;
                int i14 = i7 % i13;
                if (i14 < 0) {
                    i14 += i13;
                }
                int i15 = i8 % i13;
                if (i15 < 0) {
                    i15 += i13;
                }
                int i16 = (i14 - i15) % i13;
                if (i16 < 0) {
                    i16 += i13;
                }
                return i16 + i8;
            }
        }
        return i8;
    }

    public static final Bundle C(String str, Bundle bundle) {
        kotlin.jvm.internal.l.f("key", str);
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 != null) {
            return bundle2;
        }
        throw new IllegalArgumentException(AbstractC0703b.j("No valid saved state was found for the key '", str, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
    }

    public static final int D(int i7, int i8) {
        return (i7 >> i8) & 31;
    }

    public static S3.c E(S3.c cVar) {
        S3.c<Object> cVarIntercepted;
        kotlin.jvm.internal.l.f("<this>", cVar);
        U3.c cVar2 = cVar instanceof U3.c ? (U3.c) cVar : null;
        return (cVar2 == null || (cVarIntercepted = cVar2.intercepted()) == null) ? cVar : cVarIntercepted;
    }

    public static boolean F(int i7) {
        int type = Character.getType(i7);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static final boolean G(S s7, boolean z7) {
        w0.r rVarC;
        C0053g0 c0053g0 = s7.f2915d;
        if (c0053g0 == null || (rVarC = c0053g0.c()) == null) {
            return false;
        }
        g0.d dVarU = q0.c.U(rVarC);
        long jI = s7.i(z7);
        float fD = g0.c.d(jI);
        if (dVarU.a > fD || fD > dVarU.f11660c) {
            return false;
        }
        float fE = g0.c.e(jI);
        return dVarU.f11659b <= fE && fE <= dVarU.f11661d;
    }

    public static List H(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        kotlin.jvm.internal.l.e("singletonList(...)", listSingletonList);
        return listSingletonList;
    }

    public static List I(Object... objArr) {
        kotlin.jvm.internal.l.f("elements", objArr);
        return objArr.length > 0 ? m.P(objArr) : y.f7779k;
    }

    public static List J(Object obj) {
        return obj != null ? H(obj) : y.f7779k;
    }

    public static final void K(kotlin.jvm.internal.o oVar) {
        kotlin.jvm.internal.l.e("MEMBER_KIND", T4.e.f9096p);
        V3.b bVar = i0.f1597m;
        ArrayList arrayList = new ArrayList(p(bVar, 10));
        O3.t tVar = new O3.t(4, bVar);
        while (tVar.hasNext()) {
            arrayList.add(((i0) tVar.next()).f1598k);
        }
    }

    public static final B2.l L(kotlin.jvm.internal.o oVar) {
        T4.c cVar = T4.e.f9085e;
        kotlin.jvm.internal.l.e("MODALITY", cVar);
        V3.b bVar = j0.f1605q;
        ArrayList arrayList = new ArrayList(p(bVar, 10));
        O3.t tVar = new O3.t(4, bVar);
        while (tVar.hasNext()) {
            arrayList.add(((j0) tVar.next()).f1606k);
        }
        return new B2.l(oVar, cVar, bVar, arrayList);
    }

    public static ArrayList M(Object... objArr) {
        kotlin.jvm.internal.l.f("elements", objArr);
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new k(objArr, true));
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String N(android.content.Context r8) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r8.getPackageName()
            r0.append(r1)
            java.lang.String r1 = ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            int r1 = android.os.Process.myPid()
            int r2 = android.os.Process.myUid()
            java.lang.String r3 = r8.getPackageName()
            int r1 = r8.checkPermission(r0, r1, r2)
            r4 = -1
            if (r1 != r4) goto L2a
            goto L9a
        L2a:
            java.lang.String r1 = android.app.AppOpsManager.permissionToOp(r0)
            r5 = 0
            if (r1 != 0) goto L33
            goto L97
        L33:
            if (r3 != 0) goto L45
            android.content.pm.PackageManager r3 = r8.getPackageManager()
            java.lang.String[] r3 = r3.getPackagesForUid(r2)
            if (r3 == 0) goto L9a
            int r6 = r3.length
            if (r6 > 0) goto L43
            goto L9a
        L43:
            r3 = r3[r5]
        L45:
            int r4 = android.os.Process.myUid()
            java.lang.String r6 = r8.getPackageName()
            java.lang.Class<android.app.AppOpsManager> r7 = android.app.AppOpsManager.class
            if (r4 != r2) goto L8b
            boolean r4 = java.util.Objects.equals(r6, r3)
            if (r4 == 0) goto L8b
            int r4 = android.os.Build.VERSION.SDK_INT
            r6 = 29
            if (r4 < r6) goto L80
            java.lang.Object r4 = r8.getSystemService(r7)
            android.app.AppOpsManager r4 = (android.app.AppOpsManager) r4
            int r6 = android.os.Binder.getCallingUid()
            r7 = 1
            if (r4 != 0) goto L6c
            r3 = r7
            goto L70
        L6c:
            int r3 = r4.checkOpNoThrow(r1, r6, r3)
        L70:
            if (r3 == 0) goto L73
            goto L95
        L73:
            java.lang.String r8 = a1.AbstractC0657a.a(r8)
            if (r4 != 0) goto L7a
            goto L7e
        L7a:
            int r7 = r4.checkOpNoThrow(r1, r2, r8)
        L7e:
            r3 = r7
            goto L95
        L80:
            java.lang.Object r8 = r8.getSystemService(r7)
            android.app.AppOpsManager r8 = (android.app.AppOpsManager) r8
            int r3 = r8.noteProxyOpNoThrow(r1, r3)
            goto L95
        L8b:
            java.lang.Object r8 = r8.getSystemService(r7)
            android.app.AppOpsManager r8 = (android.app.AppOpsManager) r8
            int r3 = r8.noteProxyOpNoThrow(r1, r3)
        L95:
            if (r3 != 0) goto L99
        L97:
            r4 = r5
            goto L9a
        L99:
            r4 = -2
        L9a:
            if (r4 != 0) goto L9d
            return r0
        L9d:
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            java.lang.String r1 = "Permission "
            java.lang.String r2 = " is required by your application to receive broadcasts, please add it to your manifest"
            java.lang.String r0 = b1.AbstractC0703b.j(r1, r0, r2)
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: P3.r.N(android.content.Context):java.lang.String");
    }

    public static final List O(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? list : H(list.get(0)) : y.f7779k;
    }

    public static final void P(C1.i iVar) {
        int i7 = E4.d.f1936k;
        if (iVar.f580b != 1 || iVar.f581c != 1) {
            throw new IllegalArgumentException(A6.b.g("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", iVar, " was passed").toString());
        }
    }

    public static final void Q(int i7, int i8) {
        if (i8 < 0) {
            throw new IllegalArgumentException(c0.a(i8, "fromIndex (0) is greater than toIndex (", ")."));
        }
        if (i8 <= i7) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i8 + ") is greater than size (" + i7 + ").");
    }

    public static int R(B1.A a7, int i7, int i8, int i9) {
        AbstractC0015b.c(Math.max(Math.max(i7, i8), i9) <= 31);
        int i10 = (1 << i7) - 1;
        int i11 = (1 << i8) - 1;
        e3.c.h(e3.c.h(i10, i11), 1 << i9);
        if (a7.b() < i7) {
            return -1;
        }
        int i12 = a7.i(i7);
        if (i12 == i10) {
            if (a7.b() < i8) {
                return -1;
            }
            int i13 = a7.i(i8);
            i12 += i13;
            if (i13 == i11) {
                if (a7.b() < i9) {
                    return -1;
                }
                return a7.i(i9) + i12;
            }
        }
        return i12;
    }

    public static final X.g S(C0510p c0510p) {
        c0510p.R(-796080049);
        X.g gVar = (X.g) z1.c.F(new Object[0], X.g.f9684d, X.h.f9687m, c0510p, 3072, 4);
        gVar.f9686c = (X.j) c0510p.k(X.l.a);
        c0510p.p(false);
        return gVar;
    }

    public static final Object T(InterfaceC2366m interfaceC2366m, g0.d dVar, U3.c cVar) {
        A.a aVar;
        Object objC;
        boolean z7 = ((a0.p) interfaceC2366m).f10402k.f10414w;
        O3.C c2 = O3.C.a;
        if (z7) {
            Y yU = AbstractC2359f.u(interfaceC2366m);
            if (((a0.p) interfaceC2366m).f10402k.f10414w) {
                A.a lVar = (A.a) AbstractC2359f.j(interfaceC2366m, A.k.f31z);
                if (lVar == null) {
                    lVar = new A.l(interfaceC2366m);
                }
                aVar = lVar;
            } else {
                aVar = null;
            }
            if (aVar != null && (objC = aVar.C(yU, new A.m(0, dVar, yU), cVar)) == T3.a.f9048k) {
                return objC;
            }
        }
        return c2;
    }

    public static void U(B1.A a7) {
        a7.t(3);
        a7.t(8);
        boolean zH = a7.h();
        boolean zH2 = a7.h();
        if (zH) {
            a7.t(5);
        }
        if (zH2) {
            a7.t(6);
        }
    }

    public static void V(B1.A a7) {
        int i7;
        int i8 = a7.i(2);
        if (i8 == 0) {
            a7.t(6);
            return;
        }
        int iR = R(a7, 5, 8, 16) + 1;
        if (i8 == 1) {
            a7.t(iR * 7);
            return;
        }
        if (i8 == 2) {
            boolean zH = a7.h();
            int i9 = zH ? 1 : 5;
            int i10 = zH ? 7 : 5;
            int i11 = zH ? 8 : 6;
            int i12 = 0;
            while (i12 < iR) {
                if (a7.h()) {
                    a7.t(7);
                    i7 = 0;
                } else {
                    if (a7.i(2) == 3 && a7.i(i10) * i9 != 0) {
                        a7.s();
                    }
                    i7 = a7.i(i11) * i9;
                    if (i7 != 0 && i7 != 180) {
                        a7.s();
                    }
                    a7.s();
                }
                if (i7 != 0 && i7 != 180 && a7.h()) {
                    i12++;
                }
                i12++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object W(int r7, java.lang.Object r8, M0.z r9, M0.u r10, int r11) {
        /*
            boolean r0 = r8 instanceof android.graphics.Typeface
            if (r0 != 0) goto L5
            return r8
        L5:
            r0 = 2
            r1 = 1
            r2 = 0
            if (r7 != r1) goto Lb
            goto Ld
        Lb:
            if (r7 != r0) goto L2b
        Ld:
            M0.u r3 = r9.a
            boolean r3 = kotlin.jvm.internal.l.a(r3, r10)
            if (r3 != 0) goto L2b
            M0.u r3 = M0.u.f6414n
            int r4 = r10.compareTo(r3)
            if (r4 < 0) goto L2b
            M0.u r4 = r9.a
            int r4 = r4.f6419k
            int r3 = r3.f6419k
            int r3 = kotlin.jvm.internal.l.g(r4, r3)
            if (r3 >= 0) goto L2b
            r3 = r1
            goto L2c
        L2b:
            r3 = r2
        L2c:
            r4 = 3
            if (r7 != r1) goto L30
            goto L32
        L30:
            if (r7 != r4) goto L3a
        L32:
            r9.getClass()
            if (r11 != 0) goto L38
            goto L3a
        L38:
            r7 = r1
            goto L3b
        L3a:
            r7 = r2
        L3b:
            if (r7 != 0) goto L40
            if (r3 != 0) goto L40
            return r8
        L40:
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 28
            if (r5 >= r6) goto L62
            if (r7 == 0) goto L4c
            if (r11 != r1) goto L4c
            r7 = r1
            goto L4d
        L4c:
            r7 = r2
        L4d:
            if (r7 == 0) goto L53
            if (r3 == 0) goto L53
            r0 = r4
            goto L5b
        L53:
            if (r3 == 0) goto L57
            r0 = r1
            goto L5b
        L57:
            if (r7 == 0) goto L5a
            goto L5b
        L5a:
            r0 = r2
        L5b:
            android.graphics.Typeface r8 = (android.graphics.Typeface) r8
            android.graphics.Typeface r7 = android.graphics.Typeface.create(r8, r0)
            return r7
        L62:
            if (r3 == 0) goto L67
            int r10 = r10.f6419k
            goto L6b
        L67:
            M0.u r10 = r9.a
            int r10 = r10.f6419k
        L6b:
            if (r7 == 0) goto L73
            if (r11 != r1) goto L70
            goto L71
        L70:
            r1 = r2
        L71:
            r2 = r1
            goto L76
        L73:
            r9.getClass()
        L76:
            M0.D r7 = M0.D.a
            android.graphics.Typeface r8 = (android.graphics.Typeface) r8
            android.graphics.Typeface r7 = r7.a(r8, r10, r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: P3.r.W(int, java.lang.Object, M0.z, M0.u, int):java.lang.Object");
    }

    public static void X() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static final void Y(Object obj) throws Throwable {
        if (obj instanceof O3.n) {
            throw ((O3.n) obj).f7530k;
        }
    }

    public static final H4.o Z(f0 f0Var) {
        kotlin.jvm.internal.l.f("<this>", f0Var);
        H4.o oVar = (H4.o) H4.p.f3742d.get(f0Var);
        return oVar == null ? AbstractC2108n.f(f0Var) : oVar;
    }

    public static final void a(boolean z7, InterfaceC0821a interfaceC0821a, C0510p c0510p, int i7) {
        c0510p.T(-361453782);
        int i8 = (c0510p.g(z7) ? 4 : 2) | i7 | (c0510p.h(interfaceC0821a) ? 32 : 16);
        if ((i8 & 19) == 18 && c0510p.y()) {
            c0510p.M();
        } else {
            Z zN = C0486d.N(interfaceC0821a, c0510p);
            Object objH = c0510p.H();
            T t7 = C0502l.a;
            if (objH == t7) {
                objH = new C0771e(zN, z7);
                c0510p.b0(objH);
            }
            C0771e c0771e = (C0771e) objH;
            boolean z8 = (i8 & 14) == 4;
            Object objH2 = c0510p.H();
            if (z8 || objH2 == t7) {
                objH2 = new B.d(z7, 1, c0771e);
                c0510p.b0(objH2);
            }
            C0486d.g((InterfaceC0821a) objH2, c0510p);
            c.y yVarA = AbstractC0774h.a(c0510p);
            if (yVarA == null) {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
            }
            c.x xVarA = yVarA.a();
            InterfaceC0694v interfaceC0694v = (InterfaceC0694v) c0510p.k(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            boolean zH = c0510p.h(xVarA) | c0510p.h(interfaceC0694v);
            Object objH3 = c0510p.H();
            if (zH || objH3 == t7) {
                objH3 = new C0056i(xVarA, interfaceC0694v, c0771e, 8);
                c0510p.b0(objH3);
            }
            C0486d.d(interfaceC0694v, xVarA, (e4.k) objH3, c0510p);
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new C0770d(z7, interfaceC0821a, i7, 0);
        }
    }

    public static final void a0(C1.i iVar) {
        int i7 = E4.g.f1939k;
        if (iVar.f580b != 1 || iVar.f581c != 1) {
            throw new IllegalArgumentException(A6.b.g("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", iVar, " was passed").toString());
        }
    }

    public static final long b(float f5, float f7) {
        return (Float.floatToRawIntBits(f7) & 4294967295L) | (Float.floatToRawIntBits(f5) << 32);
    }

    public static final void b0(kotlin.jvm.internal.o oVar) {
        kotlin.jvm.internal.l.e("VISIBILITY", T4.e.f9084d);
        V3.b bVar = k0.f1609m;
        ArrayList arrayList = new ArrayList(p(bVar, 10));
        O3.t tVar = new O3.t(4, bVar);
        while (tVar.hasNext()) {
            arrayList.add(((k0) tVar.next()).f1610k);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0063 A[LOOP:0: B:4:0x000d->B:35:0x0063, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0066 A[EDGE_INSN: B:40:0x0066->B:36:0x0066 BREAK  A[LOOP:0: B:4:0x000d->B:35:0x0063], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final F0.n c(y0.C2349D r8, boolean r9) {
        /*
            O.t r0 = r8.f17660G
            java.lang.Object r0 = r0.f7176f
            a0.p r0 = (a0.p) r0
            int r1 = r0.f10405n
            r1 = r1 & 8
            r2 = 0
            if (r1 == 0) goto L66
        Ld:
            if (r0 == 0) goto L66
            int r1 = r0.f10404m
            r1 = r1 & 8
            if (r1 == 0) goto L5d
            r1 = r0
            r3 = r2
        L17:
            if (r1 == 0) goto L5d
            boolean r4 = r1 instanceof y0.l0
            if (r4 == 0) goto L1f
            r2 = r1
            goto L66
        L1f:
            int r4 = r1.f10404m
            r4 = r4 & 8
            if (r4 == 0) goto L58
            boolean r4 = r1 instanceof y0.AbstractC2367n
            if (r4 == 0) goto L58
            r4 = r1
            y0.n r4 = (y0.AbstractC2367n) r4
            a0.p r4 = r4.f17880y
            r5 = 0
        L2f:
            r6 = 1
            if (r4 == 0) goto L55
            int r7 = r4.f10404m
            r7 = r7 & 8
            if (r7 == 0) goto L52
            int r5 = r5 + 1
            if (r5 != r6) goto L3e
            r1 = r4
            goto L52
        L3e:
            if (r3 != 0) goto L49
            Q.d r3 = new Q.d
            r6 = 16
            a0.p[] r6 = new a0.p[r6]
            r3.<init>(r6)
        L49:
            if (r1 == 0) goto L4f
            r3.b(r1)
            r1 = r2
        L4f:
            r3.b(r4)
        L52:
            a0.p r4 = r4.f10407p
            goto L2f
        L55:
            if (r5 != r6) goto L58
            goto L17
        L58:
            a0.p r1 = y0.AbstractC2359f.f(r3)
            goto L17
        L5d:
            int r1 = r0.f10405n
            r1 = r1 & 8
            if (r1 == 0) goto L66
            a0.p r0 = r0.f10407p
            goto Ld
        L66:
            kotlin.jvm.internal.l.c(r2)
            y0.l0 r2 = (y0.l0) r2
            a0.p r2 = (a0.p) r2
            a0.p r0 = r2.f10402k
            F0.i r1 = r8.o()
            kotlin.jvm.internal.l.c(r1)
            F0.n r2 = new F0.n
            r2.<init>(r0, r9, r8, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: P3.r.c(y0.D, boolean):F0.n");
    }

    public static Object c0(e4.n nVar, Object obj, S3.c cVar) {
        kotlin.jvm.internal.l.f("<this>", nVar);
        S3.h context = cVar.getContext();
        Object fVar = context == S3.i.f8767k ? new T3.f(cVar) : new T3.g(cVar, context);
        kotlin.jvm.internal.B.e(2, nVar);
        return nVar.invoke(obj, fVar);
    }

    public static final void d(boolean z7, S0.h hVar, S s7, C0510p c0510p, int i7) {
        int i8;
        c0510p.T(-1344558920);
        if ((i7 & 6) == 0) {
            i8 = (c0510p.g(z7) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= c0510p.f(hVar) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i8 |= c0510p.h(s7) ? 256 : 128;
        }
        if ((i8 & 147) == 146 && c0510p.y()) {
            c0510p.M();
        } else {
            int i9 = i8 & 14;
            boolean zF = (i9 == 4) | c0510p.f(s7);
            Object objH = c0510p.H();
            Object obj = C0502l.a;
            if (zF || objH == obj) {
                objH = new Q(s7, z7);
                c0510p.b0(objH);
            }
            InterfaceC0071p0 interfaceC0071p0 = (InterfaceC0071p0) objH;
            boolean zH = c0510p.h(s7) | (i9 == 4);
            Object objH2 = c0510p.H();
            if (zH || objH2 == obj) {
                objH2 = new H.T(s7, z7);
                c0510p.b0(objH2);
            }
            InterfaceC0196m interfaceC0196m = (InterfaceC0196m) objH2;
            boolean zF2 = H0.H.f(s7.j().f6896b);
            a0.n nVar = a0.n.a;
            boolean zH2 = c0510p.h(interfaceC0071p0);
            Object objH3 = c0510p.H();
            if (zH2 || objH3 == obj) {
                objH3 = new U(interfaceC0071p0, null);
                c0510p.b0(objH3);
            }
            android.support.v4.media.session.b.g(interfaceC0196m, z7, hVar, zF2, 0L, s0.w.a(nVar, interfaceC0071p0, (e4.n) objH3), c0510p, (i8 << 3) & 1008);
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new C0190g(z7, hVar, s7, i7);
        }
    }

    public static final G2.E e(Context context) {
        kotlin.jvm.internal.l.f("context", context);
        G2.E e7 = new G2.E(context);
        P p7 = e7.f2653v;
        p7.a(new H2.g(p7));
        e7.f2653v.a(new H2.i());
        e7.f2653v.a(new H2.p());
        return e7;
    }

    public static ArrayList f(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new k(objArr, true));
    }

    public static int g(ArrayList arrayList, Comparable comparable) {
        int size = arrayList.size();
        kotlin.jvm.internal.l.f("<this>", arrayList);
        Q(arrayList.size(), size);
        int i7 = size - 1;
        int i8 = 0;
        while (i8 <= i7) {
            int i9 = (i8 + i7) >>> 1;
            int iH = z1.c.h((Comparable) arrayList.get(i9), comparable);
            if (iH < 0) {
                i8 = i9 + 1;
            } else {
                if (iH <= 0) {
                    return i9;
                }
                i7 = i9 - 1;
            }
        }
        return -(i8 + 1);
    }

    public static Q3.c h(Q3.c cVar) {
        cVar.p();
        cVar.f7967m = true;
        return cVar.f7966l > 0 ? cVar : Q3.c.f7964n;
    }

    public static final void i(int i7, int i8) {
        if (i7 < 0 || i7 >= i8) {
            throw new IndexOutOfBoundsException(A6.b.e(i7, i8, "index: ", ", size: "));
        }
    }

    public static final void j(int i7, int i8) {
        if (i7 < 0 || i7 >= i8) {
            throw new IndexOutOfBoundsException(A6.b.e(i7, i8, "index: ", ", size: "));
        }
    }

    public static final void k(int i7, int i8) {
        if (i7 < 0 || i7 > i8) {
            throw new IndexOutOfBoundsException(A6.b.e(i7, i8, "index: ", ", size: "));
        }
    }

    public static final void l(int i7, int i8) {
        if (i7 < 0 || i7 > i8) {
            throw new IndexOutOfBoundsException(A6.b.e(i7, i8, "index: ", ", size: "));
        }
    }

    public static final void m(int i7, int i8, int i9) {
        if (i7 < 0 || i8 > i9) {
            StringBuilder sbB = c0.b("fromIndex: ", i7, ", toIndex: ", i8, ", size: ");
            sbB.append(i9);
            throw new IndexOutOfBoundsException(sbB.toString());
        }
        if (i7 > i8) {
            throw new IllegalArgumentException(A6.b.e(i7, i8, "fromIndex: ", " > toIndex: "));
        }
    }

    public static final void n(int i7, int i8, int i9) {
        if (i7 < 0 || i8 > i9) {
            StringBuilder sbB = c0.b("fromIndex: ", i7, ", toIndex: ", i8, ", size: ");
            sbB.append(i9);
            throw new IndexOutOfBoundsException(sbB.toString());
        }
        if (i7 > i8) {
            throw new IllegalArgumentException(A6.b.e(i7, i8, "fromIndex: ", " > toIndex: "));
        }
    }

    public static final void o(Closeable closeable, Throwable th) throws IOException {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                q0.c.j(th, th2);
            }
        }
    }

    public static int p(Iterable iterable, int i7) {
        kotlin.jvm.internal.l.f("<this>", iterable);
        return iterable instanceof Collection ? ((Collection) iterable).size() : i7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static S3.c q(S3.c cVar, S3.c cVar2, e4.n nVar) {
        kotlin.jvm.internal.l.f("<this>", nVar);
        if (nVar instanceof U3.a) {
            return ((U3.a) nVar).create(cVar, cVar2);
        }
        S3.h context = cVar2.getContext();
        return context == S3.i.f8767k ? new T3.d(cVar2, cVar, nVar) : new T3.e(cVar2, context, nVar, cVar);
    }

    public static final O3.n r(Throwable th) {
        kotlin.jvm.internal.l.f("exception", th);
        return new O3.n(th);
    }

    public static Q3.c s() {
        return new Q3.c(10);
    }

    public static ArrayList t(Iterable iterable) {
        kotlin.jvm.internal.l.f("<this>", iterable);
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            v.e0(arrayList, (Iterable) it.next());
        }
        return arrayList;
    }

    public static P4.o u(n6.d dVar) {
        if (dVar instanceof V4.e) {
            V4.e eVar = (V4.e) dVar;
            String str = eVar.f9484h;
            kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, str);
            String str2 = eVar.f9485i;
            kotlin.jvm.internal.l.f("desc", str2);
            return new P4.o(str.concat(str2));
        }
        if (!(dVar instanceof V4.d)) {
            throw new D6.r();
        }
        V4.d dVar2 = (V4.d) dVar;
        String str3 = dVar2.f9482h;
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, str3);
        String str4 = dVar2.f9483i;
        kotlin.jvm.internal.l.f("desc", str4);
        return new P4.o(str3 + '#' + str4);
    }

    public static final void v(C1.i iVar) {
        int i7 = E4.c.f1935k;
        if (iVar.f580b != 1 || iVar.f581c != 1) {
            throw new IllegalArgumentException(A6.b.g("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", iVar, " was passed").toString());
        }
    }

    public static final C1538e w() {
        C1538e c1538e = f7772b;
        if (c1538e != null) {
            return c1538e;
        }
        C1537d c1537d = new C1537d("Filled.Close", false);
        int i7 = AbstractC1530A.a;
        C0975U c0975u = new C0975U(C0998u.f11829b);
        D4.S s7 = new D4.S(7, false);
        s7.u(19.0f, 6.41f);
        s7.s(17.59f, 5.0f);
        s7.s(12.0f, 10.59f);
        s7.s(6.41f, 5.0f);
        s7.s(5.0f, 6.41f);
        s7.s(10.59f, 12.0f);
        s7.s(5.0f, 17.59f);
        s7.s(6.41f, 19.0f);
        s7.s(12.0f, 13.41f);
        s7.s(17.59f, 19.0f);
        s7.s(19.0f, 17.59f);
        s7.s(13.41f, 12.0f);
        s7.m();
        C1537d.a(c1537d, s7.f1530k, c0975u);
        C1538e c1538eB = c1537d.b();
        f7772b = c1538eB;
        return c1538eB;
    }

    public static final C1538e x() {
        C1538e c1538e = f7773c;
        if (c1538e != null) {
            return c1538e;
        }
        C1537d c1537d = new C1537d("Filled.History", false);
        int i7 = AbstractC1530A.a;
        C0975U c0975u = new C0975U(C0998u.f11829b);
        D4.S s7 = new D4.S(7, false);
        s7.u(13.0f, 3.0f);
        s7.o(-4.97f, 0.0f, -9.0f, 4.03f, -9.0f, 9.0f);
        s7.s(1.0f, 12.0f);
        s7.t(3.89f, 3.89f);
        s7.t(0.07f, 0.14f);
        s7.s(9.0f, 12.0f);
        s7.s(6.0f, 12.0f);
        s7.o(0.0f, -3.87f, 3.13f, -7.0f, 7.0f, -7.0f);
        s7.w(7.0f, 3.13f, 7.0f, 7.0f);
        s7.w(-3.13f, 7.0f, -7.0f, 7.0f);
        s7.o(-1.93f, 0.0f, -3.68f, -0.79f, -4.94f, -2.06f);
        s7.t(-1.42f, 1.42f);
        s7.n(8.27f, 19.99f, 10.51f, 21.0f, 13.0f, 21.0f);
        s7.o(4.97f, 0.0f, 9.0f, -4.03f, 9.0f, -9.0f);
        s7.w(-4.03f, -9.0f, -9.0f, -9.0f);
        s7.m();
        s7.u(12.0f, 8.0f);
        s7.A(5.0f);
        s7.t(4.28f, 2.54f);
        s7.t(0.72f, -1.21f);
        s7.t(-3.5f, -2.08f);
        s7.s(13.5f, 8.0f);
        s7.s(12.0f, 8.0f);
        s7.m();
        C1537d.a(c1537d, s7.f1530k, c0975u);
        C1538e c1538eB = c1537d.b();
        f7773c = c1538eB;
        return c1538eB;
    }

    public static int y(List list) {
        kotlin.jvm.internal.l.f("<this>", list);
        return list.size() - 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x006c A[LOOP:0: B:4:0x000d->B:37:0x006c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006f A[EDGE_INSN: B:42:0x006f->B:38:0x006f BREAK  A[LOOP:0: B:4:0x000d->B:37:0x006c], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final y0.l0 z(y0.C2349D r7) {
        /*
            O.t r7 = r7.f17660G
            java.lang.Object r7 = r7.f7176f
            a0.p r7 = (a0.p) r7
            int r0 = r7.f10405n
            r0 = r0 & 8
            r1 = 0
            if (r0 == 0) goto L6f
        Ld:
            if (r7 == 0) goto L6f
            int r0 = r7.f10404m
            r0 = r0 & 8
            if (r0 == 0) goto L66
            r0 = r7
            r2 = r1
        L17:
            if (r0 == 0) goto L66
            boolean r3 = r0 instanceof y0.l0
            if (r3 == 0) goto L28
            r3 = r0
            y0.l0 r3 = (y0.l0) r3
            boolean r3 = r3.j0()
            if (r3 == 0) goto L61
            r1 = r0
            goto L6f
        L28:
            int r3 = r0.f10404m
            r3 = r3 & 8
            if (r3 == 0) goto L61
            boolean r3 = r0 instanceof y0.AbstractC2367n
            if (r3 == 0) goto L61
            r3 = r0
            y0.n r3 = (y0.AbstractC2367n) r3
            a0.p r3 = r3.f17880y
            r4 = 0
        L38:
            r5 = 1
            if (r3 == 0) goto L5e
            int r6 = r3.f10404m
            r6 = r6 & 8
            if (r6 == 0) goto L5b
            int r4 = r4 + 1
            if (r4 != r5) goto L47
            r0 = r3
            goto L5b
        L47:
            if (r2 != 0) goto L52
            Q.d r2 = new Q.d
            r5 = 16
            a0.p[] r5 = new a0.p[r5]
            r2.<init>(r5)
        L52:
            if (r0 == 0) goto L58
            r2.b(r0)
            r0 = r1
        L58:
            r2.b(r3)
        L5b:
            a0.p r3 = r3.f10407p
            goto L38
        L5e:
            if (r4 != r5) goto L61
            goto L17
        L61:
            a0.p r0 = y0.AbstractC2359f.f(r2)
            goto L17
        L66:
            int r0 = r7.f10405n
            r0 = r0 & 8
            if (r0 == 0) goto L6f
            a0.p r7 = r7.f10407p
            goto Ld
        L6f:
            y0.l0 r1 = (y0.l0) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: P3.r.z(y0.D):y0.l0");
    }
}
