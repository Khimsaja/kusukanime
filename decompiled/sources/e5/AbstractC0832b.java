package e5;

import A3.t;
import A4.AbstractC0011d;
import D.F0;
import H.C0184a;
import L.B0;
import L.C0375h;
import O.AbstractC0505m0;
import O.C0486d;
import O.C0487d0;
import O.C0493g0;
import O.C0502l;
import O.C0509o0;
import O.C0510p;
import O.InterfaceC0501k0;
import P3.B;
import P3.C;
import P3.F;
import P3.m;
import P3.r;
import P3.y;
import Y.s;
import Z4.g;
import a0.h;
import a0.n;
import a0.q;
import android.os.Build;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.O;
import b1.AbstractC0703b;
import com.kusukanime.R;
import e4.InterfaceC0821a;
import f.AbstractC0841b;
import f6.AbstractC0905c;
import f6.AbstractC0915m;
import f6.C0920r;
import g0.AbstractC0932a;
import i1.AbstractC1067u;
import i1.C1066t;
import io.ktor.client.utils.CIOKt;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import l4.InterfaceC1443v;
import m5.InterfaceC1524m;
import n5.AbstractC1586x;
import n5.P;
import n5.b0;
import o.AbstractC1601M;
import o.C1622t;
import o4.C1672c;
import p.AbstractC1745d;
import p.C1752g0;
import p.C1772x;
import p.J0;
import r.j;
import r.k;
import r.l;
import r4.AbstractC1887p;
import s0.w;
import t.C2027g;
import u4.AbstractC2108n;
import u4.EnumC2117x;
import u4.InterfaceC2099e;
import u4.InterfaceC2102h;
import u4.M;
import u4.Q;
import v.AbstractC2136o;
import v.Z;
import v4.C2158f;
import v4.C2159g;
import w0.AbstractC2181P;
import w0.InterfaceC2173H;
import x4.C2272S;
import x4.C2295v;
import y.C2302B;
import y.C2303C;
import y0.C2361h;
import y0.C2362i;
import y0.C2363j;
import y0.InterfaceC2364k;
import z.C2422a;
import z.C2425d;
import z.o;
import z.x;
import z0.AbstractC2455l0;
import z5.AbstractC2510o;

/* renamed from: e5.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0832b {
    public static boolean a = false;

    /* renamed from: b, reason: collision with root package name */
    public static Method f11357b;

    public static C0920r A(String... strArr) {
        if (strArr.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        String[] strArr2 = (String[]) strArr.clone();
        int length = strArr2.length;
        int i7 = 0;
        for (int i8 = 0; i8 < length; i8++) {
            String str = strArr2[i8];
            if (str == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            strArr2[i8] = AbstractC2510o.J0(str).toString();
        }
        int iB = r.B(0, strArr2.length - 1, 2);
        if (iB >= 0) {
            while (true) {
                String str2 = strArr2[i7];
                String str3 = strArr2[i7 + 1];
                j(str2);
                k(str3, str2);
                if (i7 == iB) {
                    break;
                }
                i7 += 2;
            }
        }
        return new C0920r(strArr2);
    }

    public static final boolean B(AbstractC1586x abstractC1586x) {
        InterfaceC2102h interfaceC2102hF = abstractC1586x.t0().f();
        if (interfaceC2102hF != null && ((g.b(interfaceC2102hF) && g.e(interfaceC2102hF) && !d5.e.g((InterfaceC2099e) interfaceC2102hF).equals(AbstractC1887p.f15025h)) || g.g(abstractC1586x))) {
            return true;
        }
        InterfaceC2102h interfaceC2102hF2 = abstractC1586x.t0().f();
        Q q6 = interfaceC2102hF2 instanceof Q ? (Q) interfaceC2102hF2 : null;
        return q6 != null && B(AbstractC0905c.r(q6));
    }

    public static long C(long j7, long j8) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(~j8) + Long.numberOfLeadingZeros(j8) + Long.numberOfLeadingZeros(~j7) + Long.numberOfLeadingZeros(j7);
        if (iNumberOfLeadingZeros > 65) {
            return j7 * j8;
        }
        long j9 = ((j7 ^ j8) >>> 63) + Long.MAX_VALUE;
        if (!((iNumberOfLeadingZeros < 64) | ((j8 == Long.MIN_VALUE) & (j7 < 0)))) {
            long j10 = j7 * j8;
            if (j7 == 0 || j10 / j7 == j8) {
                return j10;
            }
        }
        return j9;
    }

    public static final long D(float f5, long j7) {
        return AbstractC0915m.a(Math.max(0.0f, AbstractC0932a.b(j7) - f5), Math.max(0.0f, AbstractC0932a.c(j7) - f5));
    }

    public static final void a(l lVar, InterfaceC0821a interfaceC0821a, q qVar, t tVar, C0510p c0510p, int i7) {
        int i8;
        c0510p.T(645832757);
        if ((i7 & 6) == 0) {
            i8 = (c0510p.f(lVar) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= c0510p.h(interfaceC0821a) ? 32 : 16;
        }
        int i9 = i8 | 384;
        if ((i7 & 3072) == 0) {
            i9 |= c0510p.h(tVar) ? 2048 : 1024;
        }
        if ((i9 & 1171) == 1170 && c0510p.y()) {
            c0510p.M();
        } else {
            qVar = n.a;
            k kVar = (k) lVar.a.getValue();
            if (!(kVar instanceof j)) {
                C0509o0 c0509o0S = c0510p.s();
                if (c0509o0S != null) {
                    c0509o0S.f7111d = new C0184a(lVar, interfaceC0821a, tVar, i7);
                    return;
                }
                return;
            }
            boolean zF = c0510p.f(kVar);
            Object objH = c0510p.H();
            if (zF || objH == C0502l.a) {
                objH = new r.f(F.U(((j) kVar).a));
                c0510p.b0(objH);
            }
            r.n.c((r.f) objH, interfaceC0821a, tVar, c0510p, i9 & 8176);
        }
        q qVar2 = qVar;
        C0509o0 c0509o0S2 = c0510p.s();
        if (c0509o0S2 != null) {
            c0509o0S2.f7111d = new C0375h(lVar, interfaceC0821a, qVar2, tVar, i7);
        }
    }

    public static final void b(l lVar, InterfaceC0821a interfaceC0821a, t tVar, n nVar, boolean z7, W.a aVar, C0510p c0510p, int i7) {
        int i8;
        t tVar2;
        n nVar2;
        c0510p.T(-84584070);
        if ((i7 & 6) == 0) {
            i8 = (c0510p.f(lVar) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= c0510p.h(interfaceC0821a) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            tVar2 = tVar;
            i8 |= c0510p.h(tVar2) ? 256 : 128;
        } else {
            tVar2 = tVar;
        }
        int i9 = i8 | 3072;
        if ((i7 & 24576) == 0) {
            i9 |= c0510p.g(z7) ? 16384 : 8192;
        }
        if ((196608 & i7) == 0) {
            i9 |= c0510p.h(aVar) ? 131072 : 65536;
        }
        if ((74899 & i9) == 74898 && c0510p.y()) {
            c0510p.M();
            nVar2 = nVar;
        } else {
            nVar2 = n.a;
            q qVarA = z7 ? w.a(nVar2, r.e.a, new r.c(lVar, null)) : nVar2;
            InterfaceC2173H interfaceC2173HE = AbstractC2136o.e(a0.b.f10381k, true);
            int i10 = c0510p.f7128P;
            InterfaceC0501k0 interfaceC0501k0M = c0510p.m();
            q qVarC = a0.a.c(c0510p, qVarA);
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
            if (c0510p.f7127O || !kotlin.jvm.internal.l.a(c0510p.H(), Integer.valueOf(i10))) {
                AbstractC0703b.u(i10, c0510p, i10, c2361h);
            }
            C0486d.R(c0510p, C2363j.f17873d, qVarC);
            aVar.invoke(c0510p, Integer.valueOf((i9 >> 15) & 14));
            a(lVar, interfaceC0821a, null, tVar2, c0510p, (i9 & 126) | ((i9 << 3) & 7168));
            c0510p.p(true);
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new B0(lVar, interfaceC0821a, tVar, nVar2, z7, aVar, i7);
        }
    }

    public static final void c(C2425d c2425d, q qVar, Z z7, z.k kVar, float f5, h hVar, C2027g c2027g, boolean z8, C2422a c2422a, t.l lVar, W.a aVar, C0510p c0510p, int i7) {
        z.k kVar2;
        h hVar2;
        C2422a c2422a2;
        int i8;
        t.l lVar2;
        boolean z9;
        C2027g c2027g2;
        boolean z10;
        z.k kVar3;
        h hVar3;
        t.l lVar3;
        C2422a c2422a3;
        C2027g c2027g3;
        int i9 = 6;
        c0510p.T(1870896258);
        int i10 = i7 | (c0510p.f(c2425d) ? 4 : 2) | (c0510p.f(qVar) ? 32 : 16) | 911764480;
        if ((306783379 & i10) == 306783378 && c0510p.y()) {
            c0510p.M();
            kVar3 = kVar;
            hVar3 = hVar;
            c2027g3 = c2027g;
            z10 = z8;
            c2422a3 = c2422a;
            lVar3 = lVar;
        } else {
            c0510p.O();
            if ((i7 & 1) == 0 || c0510p.x()) {
                kVar2 = z.k.a;
                hVar2 = a0.b.f10391u;
                int i11 = (i10 & 14) | 196608;
                x xVar = new x();
                C1772x c1772xA = AbstractC1601M.a(c0510p);
                Object obj = J0.a;
                C1752g0 c1752g0P = AbstractC1745d.p(1, Float.valueOf(1));
                Object obj2 = (T0.b) c0510p.k(AbstractC2455l0.f18787f);
                Object obj3 = (T0.k) c0510p.k(AbstractC2455l0.f18793l);
                boolean zF = ((((i11 & 14) ^ 6) > 4 && c0510p.f(c2425d)) || (i11 & 6) == 4) | c0510p.f(c1772xA) | c0510p.f(c1752g0P) | c0510p.f(xVar) | c0510p.f(obj2) | c0510p.f(obj3);
                Object objH = c0510p.H();
                Object obj4 = C0502l.a;
                if (zF || objH == obj4) {
                    P p7 = new P(c2425d, new F0(i9, c2425d, obj3), xVar);
                    float f7 = t.k.a;
                    Object c2027g4 = new C2027g(p7, c1772xA, c1752g0P);
                    c0510p.b0(c2027g4);
                    objH = c2027g4;
                }
                C2027g c2027g5 = (C2027g) objH;
                int i12 = (-29360129) & i10;
                int i13 = (i10 & 14) | 432;
                boolean z11 = (((i13 & 14) ^ 6) > 4 && c0510p.f(c2425d)) || (6 & i13) == 4;
                Object objH2 = c0510p.H();
                if (z11 || objH2 == obj4) {
                    objH2 = new C2422a(c2425d);
                    c0510p.b0(objH2);
                }
                c2422a2 = (C2422a) objH2;
                i8 = i12;
                lVar2 = t.l.a;
                z9 = true;
                c2027g2 = c2027g5;
            } else {
                c0510p.M();
                i8 = i10 & (-29360129);
                kVar2 = kVar;
                hVar2 = hVar;
                c2027g2 = c2027g;
                z9 = z8;
                c2422a2 = c2422a;
                lVar2 = lVar;
            }
            c0510p.q();
            e3.c.c(qVar, c2425d, z7, c2027g2, z9, f5, kVar2, c2422a2, hVar2, lVar2, aVar, c0510p, ((i8 << 3) & 112) | ((i8 >> 3) & 14) | 24576 | 920128896, 224688);
            h hVar4 = hVar2;
            z10 = z9;
            kVar3 = kVar2;
            hVar3 = hVar4;
            lVar3 = lVar2;
            c2422a3 = c2422a2;
            c2027g3 = c2027g2;
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new o(c2425d, qVar, z7, kVar3, f5, hVar3, c2027g3, z10, c2422a3, lVar3, aVar, i7);
        }
    }

    public static final void d(Object obj, int i7, C2303C c2303c, W.a aVar, C0510p c0510p, int i8) {
        int i9;
        c0510p.T(-2079116560);
        if ((i8 & 6) == 0) {
            i9 = (c0510p.h(obj) ? 4 : 2) | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 48) == 0) {
            i9 |= c0510p.d(i7) ? 32 : 16;
        }
        if ((i8 & 384) == 0) {
            i9 |= c0510p.h(c2303c) ? 256 : 128;
        }
        if ((i8 & 3072) == 0) {
            i9 |= c0510p.h(aVar) ? 2048 : 1024;
        }
        if ((i9 & 1171) == 1170 && c0510p.y()) {
            c0510p.M();
        } else {
            boolean zF = c0510p.f(obj) | c0510p.f(c2303c);
            Object objH = c0510p.H();
            Object obj2 = C0502l.a;
            if (zF || objH == obj2) {
                objH = new C2302B(obj, c2303c);
                c0510p.b0(objH);
            }
            C2302B c2302b = (C2302B) objH;
            C0487d0 c0487d0 = c2302b.f17570c;
            C0493g0 c0493g0 = c2302b.f17572e;
            C0493g0 c0493g02 = c2302b.f17573f;
            c0487d0.g(i7);
            AbstractC0505m0 abstractC0505m0 = AbstractC2181P.a;
            C2302B c2302b2 = (C2302B) c0510p.k(abstractC0505m0);
            Y.h hVarC = s.c();
            e4.k kVarF = hVarC != null ? hVarC.f() : null;
            Y.h hVarD = s.d(hVarC);
            try {
                if (c2302b2 != ((C2302B) c0493g02.getValue())) {
                    c0493g02.setValue(c2302b2);
                    if (c2302b.f17571d.f() > 0) {
                        C2302B c2302b3 = (C2302B) c0493g0.getValue();
                        if (c2302b3 != null) {
                            c2302b3.b();
                        }
                        if (c2302b2 != null) {
                            c2302b2.a();
                        } else {
                            c2302b2 = null;
                        }
                        c0493g0.setValue(c2302b2);
                    }
                }
                s.f(hVarC, hVarD, kVarF);
                boolean zF2 = c0510p.f(c2302b);
                Object objH2 = c0510p.H();
                if (zF2 || objH2 == obj2) {
                    objH2 = new C1622t(13, c2302b);
                    c0510p.b0(objH2);
                }
                C0486d.c(c2302b, (e4.k) objH2, c0510p);
                C0486d.a(abstractC0505m0.a(c2302b), aVar, c0510p, ((i9 >> 6) & 112) | 8);
            } catch (Throwable th) {
                s.f(hVarC, hVarD, kVarF);
                throw th;
            }
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new W0.l(obj, i7, c2303c, aVar, i8);
        }
    }

    public static final long e(float f5, float f7) {
        return (Float.floatToRawIntBits(f7) & 4294967295L) | (Float.floatToRawIntBits(f5) << 32);
    }

    public static final String f(Method method) {
        StringBuilder sb = new StringBuilder();
        sb.append(method.getName());
        Class<?>[] parameterTypes = method.getParameterTypes();
        kotlin.jvm.internal.l.e("getParameterTypes(...)", parameterTypes);
        sb.append(m.n0(parameterTypes, "", "(", ")", C1672c.f13694y, 24));
        Class<?> returnType = method.getReturnType();
        kotlin.jvm.internal.l.e("getReturnType(...)", returnType);
        sb.append(AbstractC0011d.b(returnType));
        return sb.toString();
    }

    public static final void g(i6.a aVar, i6.c cVar, String str) {
        i6.d.f12052h.getClass();
        i6.d.f12054j.fine(cVar.f12047b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + aVar.a);
    }

    public static void h(Appendable appendable, Object obj, e4.k kVar) {
        kotlin.jvm.internal.l.f("<this>", appendable);
        if (kVar != null) {
            appendable.append((CharSequence) kVar.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            appendable.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            appendable.append(((Character) obj).charValue());
        } else {
            appendable.append(obj.toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i(androidx.lifecycle.AbstractC0690q r6, U3.c r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof g3.C0943b
            if (r0 == 0) goto L13
            r0 = r7
            g3.b r0 = (g3.C0943b) r0
            int r1 = r0.f11704n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11704n = r1
            goto L18
        L13:
            g3.b r0 = new g3.b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f11703m
            T3.a r1 = T3.a.f9048k
            int r2 = r0.f11704n
            O3.C r3 = O3.C.a
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            kotlin.jvm.internal.x r6 = r0.f11702l
            androidx.lifecycle.q r0 = r0.f11701k
            P3.r.Y(r7)     // Catch: java.lang.Throwable -> L2d
            goto L71
        L2d:
            r7 = move-exception
            goto L80
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            P3.r.Y(r7)
            androidx.lifecycle.p r7 = r6.b()
            androidx.lifecycle.p r2 = androidx.lifecycle.EnumC0689p.f10739n
            int r7 = r7.compareTo(r2)
            if (r7 < 0) goto L47
            return r3
        L47:
            kotlin.jvm.internal.x r7 = new kotlin.jvm.internal.x
            r7.<init>()
            r0.f11701k = r6     // Catch: java.lang.Throwable -> L7b
            r0.f11702l = r7     // Catch: java.lang.Throwable -> L7b
            r0.f11704n = r4     // Catch: java.lang.Throwable -> L7b
            H5.k r2 = new H5.k     // Catch: java.lang.Throwable -> L7b
            S3.c r0 = P3.r.E(r0)     // Catch: java.lang.Throwable -> L7b
            r2.<init>(r4, r0)     // Catch: java.lang.Throwable -> L7b
            r2.r()     // Catch: java.lang.Throwable -> L7b
            g3.c r0 = new g3.c     // Catch: java.lang.Throwable -> L7b
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L7b
            r7.f12720k = r0     // Catch: java.lang.Throwable -> L7b
            r6.a(r0)     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r0 = r2.q()     // Catch: java.lang.Throwable -> L7b
            if (r0 != r1) goto L6f
            return r1
        L6f:
            r0 = r6
            r6 = r7
        L71:
            java.lang.Object r6 = r6.f12720k
            androidx.lifecycle.u r6 = (androidx.lifecycle.InterfaceC0693u) r6
            if (r6 == 0) goto L7a
            r0.c(r6)
        L7a:
            return r3
        L7b:
            r0 = move-exception
            r5 = r0
            r0 = r6
            r6 = r7
            r7 = r5
        L80:
            java.lang.Object r6 = r6.f12720k
            androidx.lifecycle.u r6 = (androidx.lifecycle.InterfaceC0693u) r6
            if (r6 == 0) goto L89
            r0.c(r6)
        L89:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: e5.AbstractC0832b.i(androidx.lifecycle.q, U3.c):java.lang.Object");
    }

    public static void j(String str) {
        if (str.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i7 = 0; i7 < length; i7++) {
            char cCharAt = str.charAt(i7);
            if ('!' > cCharAt || cCharAt >= 127) {
                throw new IllegalArgumentException(g6.b.i("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i7), str).toString());
            }
        }
    }

    public static void k(String str, String str2) {
        int length = str.length();
        for (int i7 = 0; i7 < length; i7++) {
            char cCharAt = str.charAt(i7);
            if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                StringBuilder sb = new StringBuilder();
                sb.append(g6.b.i("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i7), str2));
                sb.append(g6.b.q(str2) ? "" : ": ".concat(str));
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    public static long l(long j7, long j8) {
        long j9 = j7 + j8;
        if (((j7 ^ j8) < 0) || ((j7 ^ j9) >= 0)) {
            return j9;
        }
        throw new ArithmeticException(A6.b.f(j8, ")", A6.b.k("overflow: checkedAdd(", j7, ", ")));
    }

    public static final Collection m(Collection collection, Collection collection2) {
        kotlin.jvm.internal.l.f("collection", collection2);
        if (collection2.isEmpty()) {
            return collection;
        }
        if (collection == null) {
            return collection2;
        }
        if (collection instanceof LinkedHashSet) {
            ((LinkedHashSet) collection).addAll(collection2);
            return collection;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        linkedHashSet.addAll(collection2);
        return linkedHashSet;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004d A[Catch: all -> 0x0067, TryCatch #1 {all -> 0x0067, blocks: (B:3:0x000a, B:10:0x002a, B:12:0x0044, B:13:0x0047, B:15:0x004d, B:17:0x0051, B:18:0x0061, B:20:0x0063, B:21:0x0066), top: B:37:0x000a, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0051 A[Catch: all -> 0x0067, TryCatch #1 {all -> 0x0067, blocks: (B:3:0x000a, B:10:0x002a, B:12:0x0044, B:13:0x0047, B:15:0x004d, B:17:0x0051, B:18:0x0061, B:20:0x0063, B:21:0x0066), top: B:37:0x000a, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static k5.C1399c n(W4.c r7, m5.C1523l r8, u4.InterfaceC2118y r9, java.io.InputStream r10) throws java.io.IOException {
        /*
            java.lang.String r0 = "fqName"
            kotlin.jvm.internal.l.f(r0, r7)
            java.lang.String r0 = "module"
            kotlin.jvm.internal.l.f(r0, r9)
            S4.a r0 = S4.a.f8770f     // Catch: java.lang.Throwable -> L67
            S4.a r6 = l4.AbstractC1420H.J(r10)     // Catch: java.lang.Throwable -> L67
            java.lang.String r0 = "ourVersion"
            S4.a r1 = S4.a.f8770f     // Catch: java.lang.Throwable -> L67
            kotlin.jvm.internal.l.f(r0, r1)     // Catch: java.lang.Throwable -> L67
            int r0 = r6.f9063c     // Catch: java.lang.Throwable -> L67
            int r2 = r1.f9063c     // Catch: java.lang.Throwable -> L67
            int r3 = r1.f9062b     // Catch: java.lang.Throwable -> L67
            int r4 = r6.f9062b     // Catch: java.lang.Throwable -> L67
            if (r4 != 0) goto L26
            if (r3 != 0) goto L6a
            if (r0 != r2) goto L6a
            goto L2a
        L26:
            if (r4 != r3) goto L6a
            if (r0 > r2) goto L6a
        L2a:
            X4.h r0 = new X4.h     // Catch: java.lang.Throwable -> L67
            r0.<init>()     // Catch: java.lang.Throwable -> L67
            S4.b.a(r0)     // Catch: java.lang.Throwable -> L67
            R4.a r2 = R4.H.f8169u     // Catch: java.lang.Throwable -> L67
            r2.getClass()     // Catch: java.lang.Throwable -> L67
            X4.f r3 = new X4.f     // Catch: java.lang.Throwable -> L67
            r3.<init>(r10)     // Catch: java.lang.Throwable -> L67
            java.lang.Object r0 = r2.a(r3, r0)     // Catch: java.lang.Throwable -> L67
            r2 = r0
            X4.b r2 = (X4.AbstractC0605b) r2     // Catch: java.lang.Throwable -> L67
            r0 = 0
            r3.a(r0)     // Catch: X4.r -> L62 java.lang.Throwable -> L67
            boolean r0 = r2.a()     // Catch: java.lang.Throwable -> L67
            if (r0 == 0) goto L51
            R4.H r2 = (R4.H) r2     // Catch: java.lang.Throwable -> L67
        L4f:
            r5 = r2
            goto L6c
        L51:
            D6.r r7 = new D6.r     // Catch: java.lang.Throwable -> L67
            r7.<init>()     // Catch: java.lang.Throwable -> L67
            X4.r r8 = new X4.r     // Catch: java.lang.Throwable -> L67
            java.lang.String r7 = r7.getMessage()     // Catch: java.lang.Throwable -> L67
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L67
            r8.f9907k = r2     // Catch: java.lang.Throwable -> L67
            throw r8     // Catch: java.lang.Throwable -> L67
        L62:
            r0 = move-exception
            r7 = r0
            r7.f9907k = r2     // Catch: java.lang.Throwable -> L67
            throw r7     // Catch: java.lang.Throwable -> L67
        L67:
            r0 = move-exception
            r7 = r0
            goto L9b
        L6a:
            r2 = 0
            goto L4f
        L6c:
            r10.close()
            if (r5 == 0) goto L7a
            k5.c r1 = new k5.c
            r2 = r7
            r3 = r8
            r4 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
        L7a:
            java.lang.UnsupportedOperationException r7 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Kotlin built-in definition format version is not supported: expected "
            r8.<init>(r9)
            r8.append(r1)
            java.lang.String r9 = ", actual "
            r8.append(r9)
            r8.append(r6)
            java.lang.String r9 = ". Please update Kotlin"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L9b:
            throw r7     // Catch: java.lang.Throwable -> L9c
        L9c:
            r0 = move-exception
            r8 = r0
            P3.r.o(r10, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: e5.AbstractC0832b.n(W4.c, m5.l, u4.y, java.io.InputStream):k5.c");
    }

    public static s4.f o(s4.c cVar, boolean z7) {
        String lowerCase;
        kotlin.jvm.internal.l.f("functionClass", cVar);
        s4.f fVar = new s4.f(cVar, null, 1, z7);
        C2295v c2295vR0 = cVar.r0();
        y yVar = y.f7779k;
        ArrayList arrayList = new ArrayList();
        List list = cVar.f15827u;
        for (Object obj : list) {
            if (((Q) obj).R() != b0.f13391n) {
                break;
            }
            arrayList.add(obj);
        }
        P3.o oVarY0 = P3.q.Y0(arrayList);
        ArrayList arrayList2 = new ArrayList(r.p(oVarY0, 10));
        Iterator it = oVarY0.iterator();
        while (true) {
            C c2 = (C) it;
            if (!c2.f7740l.hasNext()) {
                fVar.S0(null, c2295vR0, yVar, yVar, arrayList2, ((Q) P3.q.A0(list)).g(), EnumC2117x.f16345o, AbstractC2108n.f16322e);
                s4.f fVar2 = fVar;
                fVar2.f17487G = true;
                return fVar2;
            }
            B b4 = (B) c2.next();
            int i7 = b4.a;
            Q q6 = (Q) b4.f7738b;
            String strB = q6.getName().b();
            kotlin.jvm.internal.l.e("asString(...)", strB);
            if (strB.equals("T")) {
                lowerCase = "instance";
            } else if (strB.equals("E")) {
                lowerCase = "receiver";
            } else {
                lowerCase = strB.toLowerCase(Locale.ROOT);
                kotlin.jvm.internal.l.e("toLowerCase(...)", lowerCase);
            }
            s4.f fVar3 = fVar;
            String str = lowerCase;
            C2158f c2158f = C2159g.a;
            W4.e eVarE = W4.e.e(str);
            n5.B bG = q6.g();
            kotlin.jvm.internal.l.e("getDefaultType(...)", bG);
            ArrayList arrayList3 = arrayList2;
            arrayList3.add(new C2272S(fVar3, null, i7, c2158f, eVarE, bG, false, false, false, null, M.f16295i));
            fVar = fVar3;
            arrayList2 = arrayList3;
        }
    }

    public static O p(Class cls) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                throw new RuntimeException("Cannot create an instance of " + cls);
            }
            try {
                Object objNewInstance = declaredConstructor.newInstance(new Object[0]);
                kotlin.jvm.internal.l.c(objNewInstance);
                return (O) objNewInstance;
            } catch (IllegalAccessException e7) {
                throw new RuntimeException("Cannot create an instance of " + cls, e7);
            } catch (InstantiationException e8) {
                throw new RuntimeException("Cannot create an instance of " + cls, e8);
            }
        } catch (NoSuchMethodException e9) {
            throw new RuntimeException("Cannot create an instance of " + cls, e9);
        }
    }

    public static boolean q(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int iIndexOfKey;
        Field field = AbstractC1067u.a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = C1066t.f11982d;
        C1066t c1066t = (C1066t) view.getTag(R.id.tag_unhandled_key_event_manager);
        WeakReference weakReference = null;
        if (c1066t == null) {
            c1066t = new C1066t();
            c1066t.a = null;
            c1066t.f11983b = null;
            c1066t.f11984c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, c1066t);
        }
        WeakReference weakReference2 = c1066t.f11984c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        c1066t.f11984c = new WeakReference(keyEvent);
        if (c1066t.f11983b == null) {
            c1066t.f11983b = new SparseArray();
        }
        SparseArray sparseArray = c1066t.f11983b;
        if (keyEvent.getAction() == 1 && (iIndexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference = (WeakReference) sparseArray.valueAt(iIndexOfKey);
            sparseArray.removeAt(iIndexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
            return true;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
    
        if (r8 > 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
    
        if (r8 < 0) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long r(long r8, long r10, java.math.RoundingMode r12) {
        /*
            r12.getClass()
            long r0 = r8 / r10
            long r2 = r10 * r0
            long r2 = r8 - r2
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L10
            goto L53
        L10:
            long r8 = r8 ^ r10
            r7 = 63
            long r8 = r8 >> r7
            int r8 = (int) r8
            r8 = r8 | 1
            int[] r9 = l3.d.a
            int r7 = r12.ordinal()
            r9 = r9[r7]
            switch(r9) {
                case 1: goto L51;
                case 2: goto L53;
                case 3: goto L4c;
                case 4: goto L4e;
                case 5: goto L49;
                case 6: goto L28;
                case 7: goto L28;
                case 8: goto L28;
                default: goto L22;
            }
        L22:
            java.lang.AssertionError r8 = new java.lang.AssertionError
            r8.<init>()
            throw r8
        L28:
            long r2 = java.lang.Math.abs(r2)
            long r9 = java.lang.Math.abs(r10)
            long r9 = r9 - r2
            long r2 = r2 - r9
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 != 0) goto L46
            java.math.RoundingMode r9 = java.math.RoundingMode.HALF_UP
            if (r12 == r9) goto L4e
            java.math.RoundingMode r9 = java.math.RoundingMode.HALF_EVEN
            if (r12 != r9) goto L53
            r9 = 1
            long r9 = r9 & r0
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 == 0) goto L53
            goto L4e
        L46:
            if (r9 <= 0) goto L53
            goto L4e
        L49:
            if (r8 <= 0) goto L53
            goto L4e
        L4c:
            if (r8 >= 0) goto L53
        L4e:
            long r8 = (long) r8
            long r0 = r0 + r8
            return r0
        L51:
            if (r6 != 0) goto L54
        L53:
            return r0
        L54:
            java.lang.ArithmeticException r8 = new java.lang.ArithmeticException
            java.lang.String r9 = "mode was UNNECESSARY, but rounding was necessary"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: e5.AbstractC0832b.r(long, long, java.math.RoundingMode):long");
    }

    public static final String s(long j7) {
        String strF;
        if (j7 <= -999500000) {
            strF = A6.b.f((j7 - 500000000) / 1000000000, " s ", new StringBuilder());
        } else if (j7 <= -999500) {
            strF = A6.b.f((j7 - 500000) / 1000000, " ms", new StringBuilder());
        } else if (j7 <= 0) {
            strF = A6.b.f((j7 - 500) / CIOKt.DEFAULT_HTTP_POOL_SIZE, " µs", new StringBuilder());
        } else if (j7 < 999500) {
            strF = A6.b.f((j7 + 500) / CIOKt.DEFAULT_HTTP_POOL_SIZE, " µs", new StringBuilder());
        } else if (j7 < 999500000) {
            strF = A6.b.f((j7 + 500000) / 1000000, " ms", new StringBuilder());
        } else {
            strF = A6.b.f((j7 + 500000000) / 1000000000, " s ", new StringBuilder());
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{strF}, 1));
    }

    public static long t(long j7, long j8) {
        AbstractC0841b.g("a", j7);
        AbstractC0841b.g("b", j8);
        if (j7 == 0) {
            return j8;
        }
        if (j8 == 0) {
            return j7;
        }
        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j7);
        long jNumberOfTrailingZeros = j7 >> iNumberOfTrailingZeros;
        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(j8);
        long j9 = j8 >> iNumberOfTrailingZeros2;
        while (jNumberOfTrailingZeros != j9) {
            long j10 = jNumberOfTrailingZeros - j9;
            long j11 = (j10 >> 63) & j10;
            long j12 = (j10 - j11) - j11;
            j9 += j11;
            jNumberOfTrailingZeros = j12 >> Long.numberOfTrailingZeros(j12);
        }
        return jNumberOfTrailingZeros << Math.min(iNumberOfTrailingZeros, iNumberOfTrailingZeros2);
    }

    public static final Object u(InterfaceC1524m interfaceC1524m, InterfaceC1443v interfaceC1443v) {
        kotlin.jvm.internal.l.f("<this>", interfaceC1524m);
        kotlin.jvm.internal.l.f("p", interfaceC1443v);
        return interfaceC1524m.invoke();
    }

    public static String v(t5.e eVar, J4.f fVar) {
        if (eVar.b(fVar)) {
            return null;
        }
        return eVar.c();
    }

    public static final boolean w(long j7) {
        long j8 = (j7 & 9187343241974906880L) ^ 9187343241974906880L;
        return (((~j8) & (j8 - 4294967297L)) & (-9223372034707292160L)) == 0;
    }

    public static final boolean x(long j7) {
        return (j7 & 9223372034707292159L) != 9205357640488583168L;
    }

    public static final boolean y(long j7) {
        return (j7 & 9223372034707292159L) == 9205357640488583168L;
    }

    public static final w5.f z(ArrayList arrayList) {
        w5.f fVar = new w5.f();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            g5.o oVar = (g5.o) next;
            if (oVar != null && oVar != g5.n.f11759b) {
                fVar.add(next);
            }
        }
        return fVar;
    }
}
