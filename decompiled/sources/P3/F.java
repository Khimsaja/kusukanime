package P3;

import A3.C0006a;
import B1.C0017d;
import D4.N;
import D4.O;
import D4.P;
import D4.S;
import D4.T;
import D4.W;
import D4.Y;
import D4.a0;
import D4.d0;
import D4.g0;
import D4.h0;
import G2.C0180q;
import H0.C0209a;
import H0.C0214f;
import O3.EnumC0555d;
import R4.C0574e;
import R4.C0577h;
import R4.C0580k;
import R4.C0594z;
import R4.EnumC0593y;
import R4.Q;
import R4.U;
import R4.Z;
import R4.c0;
import R4.e0;
import R4.f0;
import R4.i0;
import X4.C0611h;
import X4.C0617n;
import Z5.n0;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import b1.AbstractC0703b;
import h0.C0975U;
import h0.C0981d;
import h0.C0985h;
import h0.C0998u;
import io.ktor.http.ContentDisposition;
import io.ktor.http.LinkHeader;
import j0.C1296b;
import j3.X;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l4.InterfaceC1425d;
import n0.AbstractC1530A;
import n0.C1537d;
import n0.C1538e;
import u4.InterfaceC2096b;
import u4.InterfaceC2099e;
import u4.InterfaceC2105k;
import u4.K;
import x4.C2266L;
import y0.AbstractC2359f;
import y0.C2372t;
import y1.C2392n;
import y1.C2393o;
import z5.AbstractC2499d;

/* loaded from: classes.dex */
public abstract class F {
    public static C0985h a;

    /* renamed from: b, reason: collision with root package name */
    public static C0981d f7742b;

    /* renamed from: c, reason: collision with root package name */
    public static C1296b f7743c;

    /* renamed from: d, reason: collision with root package name */
    public static C1538e f7744d;

    /* renamed from: e, reason: collision with root package name */
    public static C1538e f7745e;

    /* renamed from: f, reason: collision with root package name */
    public static C1538e f7746f;

    /* renamed from: g, reason: collision with root package name */
    public static C1538e f7747g;

    /* renamed from: h, reason: collision with root package name */
    public static C1538e f7748h;

    /* renamed from: i, reason: collision with root package name */
    public static C1538e f7749i;

    public static final C1538e A() {
        C1538e c1538e = f7748h;
        if (c1538e != null) {
            return c1538e;
        }
        C1537d c1537d = new C1537d("Filled.Search", false);
        int i7 = AbstractC1530A.a;
        C0975U c0975u = new C0975U(C0998u.f11829b);
        S s7 = new S(7, false);
        s7.u(15.5f, 14.0f);
        s7.r(-0.79f);
        s7.t(-0.28f, -0.27f);
        s7.n(15.41f, 12.59f, 16.0f, 11.11f, 16.0f, 9.5f);
        s7.n(16.0f, 5.91f, 13.09f, 3.0f, 9.5f, 3.0f);
        s7.v(3.0f, 5.91f, 3.0f, 9.5f);
        s7.v(5.91f, 16.0f, 9.5f, 16.0f);
        s7.o(1.61f, 0.0f, 3.09f, -0.59f, 4.23f, -1.57f);
        s7.t(0.27f, 0.28f);
        s7.A(0.79f);
        s7.t(5.0f, 4.99f);
        s7.s(20.49f, 19.0f);
        s7.t(-4.99f, -5.0f);
        s7.m();
        s7.u(9.5f, 14.0f);
        s7.n(7.01f, 14.0f, 5.0f, 11.99f, 5.0f, 9.5f);
        s7.v(7.01f, 5.0f, 9.5f, 5.0f);
        s7.v(14.0f, 7.01f, 14.0f, 9.5f);
        s7.v(11.99f, 14.0f, 9.5f, 14.0f);
        s7.m();
        C1537d.a(c1537d, s7.f1530k, c0975u);
        C1538e c1538eB = c1537d.b();
        f7748h = c1538eB;
        return c1538eB;
    }

    public static final C0214f B(N0.w wVar) {
        C0214f c0214f = wVar.a;
        c0214f.getClass();
        long j7 = wVar.f6896b;
        return c0214f.subSequence(H0.H.e(j7), H0.H.d(j7));
    }

    public static final C0214f C(N0.w wVar, int i7) {
        C0214f c0214f = wVar.a;
        long j7 = wVar.f6896b;
        return c0214f.subSequence(H0.H.d(j7), Math.min(H0.H.d(j7) + i7, wVar.a.a.length()));
    }

    public static final C0214f D(N0.w wVar, int i7) {
        C0214f c0214f = wVar.a;
        long j7 = wVar.f6896b;
        return c0214f.subSequence(Math.max(0, H0.H.e(j7) - i7), H0.H.e(j7));
    }

    public static final U E(C0580k c0580k, T4.i iVar) {
        kotlin.jvm.internal.l.f("<this>", c0580k);
        int i7 = c0580k.f8544m;
        if ((i7 & 16) == 16) {
            return c0580k.f8536H;
        }
        if ((i7 & 32) == 32) {
            return iVar.a(c0580k.I);
        }
        return null;
    }

    public static final boolean F(K k7) {
        kotlin.jvm.internal.l.f("<this>", k7);
        return k7.getGetter() == null;
    }

    public static final float G(float f5, float f7, float f8) {
        return (f8 * f7) + ((1 - f8) * f5);
    }

    public static final int H(float f5, int i7, int i8) {
        return i7 + ((int) Math.round((i8 - i7) * f5));
    }

    public static int I(int i7) {
        if (i7 < 0) {
            return i7;
        }
        if (i7 < 3) {
            return i7 + 1;
        }
        if (i7 < 1073741824) {
            return (int) ((i7 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map J(O3.l lVar) {
        kotlin.jvm.internal.l.f("pair", lVar);
        Map mapSingletonMap = Collections.singletonMap(lVar.f7528k, lVar.f7529l);
        kotlin.jvm.internal.l.e("singletonMap(...)", mapSingletonMap);
        return mapSingletonMap;
    }

    public static S3.h K(S3.f fVar, S3.g gVar) {
        kotlin.jvm.internal.l.f("key", gVar);
        return kotlin.jvm.internal.l.a(fVar.getKey(), gVar) ? S3.i.f8767k : fVar;
    }

    public static final U L(U u5, T4.i iVar) {
        kotlin.jvm.internal.l.f("<this>", u5);
        int i7 = u5.f8296m;
        if ((i7 & 256) == 256) {
            return u5.f8306w;
        }
        if ((i7 & 512) == 512) {
            return iVar.a(u5.f8307x);
        }
        return null;
    }

    public static S3.h M(S3.f fVar, S3.h hVar) {
        kotlin.jvm.internal.l.f("context", hVar);
        return hVar == S3.i.f8767k ? fVar : (S3.h) hVar.fold(fVar, new C0006a(22));
    }

    public static final C0017d N(int i7, E4.h hVar) {
        EnumC0555d enumC0555d;
        C0017d c0017d;
        h0 h0Var;
        g0 g0Var;
        C0017d c0017d2 = new C0017d();
        T4.g gVar = (T4.g) hVar.f1941l;
        kotlin.jvm.internal.l.f("nameResolver", gVar);
        R4.g0 g0Var2 = (R4.g0) q.u0(i7, ((T4.k) hVar.f1943n).a);
        T4.j jVar = T4.j.f9112d;
        if (g0Var2 == null) {
            c0017d = null;
        } else {
            Integer numValueOf = (g0Var2.f8473l & 1) == 1 ? Integer.valueOf(g0Var2.f8474m) : null;
            Integer numValueOf2 = (g0Var2.f8473l & 2) == 2 ? Integer.valueOf(g0Var2.f8475n) : null;
            T4.j jVar2 = numValueOf2 != null ? new T4.j(numValueOf2.intValue() & 255, (numValueOf2.intValue() >> 8) & 255, (numValueOf2.intValue() >> 16) & 255) : numValueOf != null ? new T4.j(numValueOf.intValue() & 7, (numValueOf.intValue() >> 3) & 15, (numValueOf.intValue() >> 7) & 127) : jVar;
            e0 e0Var = g0Var2.f8476o;
            kotlin.jvm.internal.l.c(e0Var);
            int iOrdinal = e0Var.ordinal();
            if (iOrdinal == 0) {
                enumC0555d = EnumC0555d.f7516k;
            } else if (iOrdinal == 1) {
                enumC0555d = EnumC0555d.f7517l;
            } else {
                if (iOrdinal != 2) {
                    throw new D6.r();
                }
                enumC0555d = EnumC0555d.f7518m;
            }
            EnumC0555d enumC0555d2 = enumC0555d;
            Integer numValueOf3 = (g0Var2.f8473l & 8) == 8 ? Integer.valueOf(g0Var2.f8477p) : null;
            String strA = (g0Var2.f8473l & 16) == 16 ? gVar.a(g0Var2.f8478q) : null;
            f0 f0Var = g0Var2.f8479r;
            kotlin.jvm.internal.l.e("getVersionKind(...)", f0Var);
            c0017d = new C0017d(jVar2, f0Var, enumC0555d2, numValueOf3, strA);
        }
        if (c0017d == null) {
            throw new A5.e("No VersionRequirement with the given id in the table", 1);
        }
        f0 f0Var2 = c0017d != null ? (f0) c0017d.f319m : null;
        int i8 = f0Var2 == null ? -1 : E4.j.a[f0Var2.ordinal()];
        if (i8 == -1) {
            h0Var = h0.f1593n;
        } else if (i8 == 1) {
            h0Var = h0.f1590k;
        } else if (i8 == 2) {
            h0Var = h0.f1591l;
        } else {
            if (i8 != 3) {
                throw new D6.r();
            }
            h0Var = h0.f1592m;
        }
        EnumC0555d enumC0555d3 = c0017d != null ? (EnumC0555d) c0017d.f320n : null;
        int i9 = enumC0555d3 == null ? -1 : E4.j.f1947b[enumC0555d3.ordinal()];
        if (i9 == -1) {
            g0Var = g0.f1587m;
        } else if (i9 == 1) {
            g0Var = g0.f1585k;
        } else if (i9 != 2) {
            if (i9 != 3) {
                throw new D6.r();
            }
            g0Var = g0.f1587m;
        } else {
            g0Var = g0.f1586l;
        }
        c0017d2.f318l = h0Var;
        c0017d2.f319m = g0Var;
        c0017d2.f320n = c0017d != null ? (Integer) c0017d.f321o : null;
        c0017d2.f321o = c0017d != null ? (String) c0017d.f322p : null;
        if (c0017d != null) {
            jVar = (T4.j) c0017d.f318l;
        }
        c0017d2.f322p = new D4.f0(jVar.a, jVar.f9113b, jVar.f9114c);
        return c0017d2;
    }

    public static final U O(R4.B b4, T4.i iVar) {
        kotlin.jvm.internal.l.f("<this>", b4);
        kotlin.jvm.internal.l.f("typeTable", iVar);
        int i7 = b4.f8128m;
        if ((i7 & 32) == 32) {
            return b4.f8135t;
        }
        if ((i7 & 64) == 64) {
            return iVar.a(b4.f8136u);
        }
        return null;
    }

    public static final U P(R4.J j7, T4.i iVar) {
        kotlin.jvm.internal.l.f("<this>", j7);
        int i7 = j7.f8212m;
        if ((i7 & 32) == 32) {
            return j7.f8219t;
        }
        if ((i7 & 64) == 64) {
            return iVar.a(j7.f8220u);
        }
        return null;
    }

    public static void Q(A1.a aVar) {
        aVar.f47k = -3.4028235E38f;
        aVar.f46j = Integer.MIN_VALUE;
        CharSequence charSequence = aVar.a;
        if (charSequence instanceof Spanned) {
            if (!(charSequence instanceof Spannable)) {
                aVar.a = SpannableString.valueOf(charSequence);
            }
            CharSequence charSequence2 = aVar.a;
            charSequence2.getClass();
            Spannable spannable = (Spannable) charSequence2;
            for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                if ((obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan)) {
                    spannable.removeSpan(obj);
                }
            }
        }
    }

    public static float R(int i7, float f5, int i8, int i9) {
        float f7;
        if (f5 == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i7 == 0) {
            f7 = i9;
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    return -3.4028235E38f;
                }
                return f5;
            }
            f7 = i8;
        }
        return f5 * f7;
    }

    public static final U S(R4.B b4, T4.i iVar) {
        kotlin.jvm.internal.l.f("<this>", b4);
        kotlin.jvm.internal.l.f("typeTable", iVar);
        int i7 = b4.f8128m;
        if ((i7 & 8) == 8) {
            U u5 = b4.f8132q;
            kotlin.jvm.internal.l.e("getReturnType(...)", u5);
            return u5;
        }
        if ((i7 & 16) == 16) {
            return iVar.a(b4.f8133r);
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Function");
    }

    public static final U T(R4.J j7, T4.i iVar) {
        kotlin.jvm.internal.l.f("<this>", j7);
        kotlin.jvm.internal.l.f("typeTable", iVar);
        int i7 = j7.f8212m;
        if ((i7 & 8) == 8) {
            U u5 = j7.f8216q;
            kotlin.jvm.internal.l.e("getReturnType(...)", u5);
            return u5;
        }
        if ((i7 & 16) == 16) {
            return iVar.a(j7.f8217r);
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Property");
    }

    public static final long U(long j7) {
        return (Math.round(g0.c.e(j7)) & 4294967295L) | (Math.round(g0.c.d(j7)) << 32);
    }

    public static int V(double d4) {
        if (Double.isNaN(d4)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        if (d4 > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        if (d4 < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d4);
    }

    public static int W(float f5) {
        if (Float.isNaN(f5)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f5);
    }

    public static long X(double d4) {
        if (Double.isNaN(d4)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(d4);
    }

    public static final Object Y(Set set, Enum r2, Enum r32, Enum r42, boolean z7) {
        if (!z7) {
            if (r42 != null) {
                set = q.X0(J.U(set, r42));
            }
            return q.L0(set);
        }
        Enum r12 = set.contains(r2) ? r2 : set.contains(r32) ? r32 : null;
        if (kotlin.jvm.internal.l.a(r12, r2) && kotlin.jvm.internal.l.a(r42, r32)) {
            return null;
        }
        return r42 == null ? r12 : r42;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public static final List Z(C0580k c0580k, T4.i iVar) {
        kotlin.jvm.internal.l.f("<this>", c0580k);
        List list = c0580k.f8549r;
        boolean zIsEmpty = list.isEmpty();
        ?? arrayList = list;
        if (zIsEmpty) {
            arrayList = 0;
        }
        if (arrayList == 0) {
            List<Integer> list2 = c0580k.f8550s;
            kotlin.jvm.internal.l.e("getSupertypeIdList(...)", list2);
            arrayList = new ArrayList(r.p(list2, 10));
            for (Integer num : list2) {
                kotlin.jvm.internal.l.c(num);
                arrayList.add(iVar.a(num.intValue()));
            }
        }
        return arrayList;
    }

    public static J5.e a(int i7, int i8, J5.c cVar) {
        if ((i8 & 1) != 0) {
            i7 = 0;
        }
        if ((i8 & 2) != 0) {
            cVar = J5.c.f4299k;
        }
        if (i7 == -2) {
            if (cVar != J5.c.f4299k) {
                return new J5.r(1, cVar);
            }
            J5.i.f4336b.getClass();
            return new J5.e(J5.h.f4335b);
        }
        if (i7 != -1) {
            return i7 != 0 ? i7 != Integer.MAX_VALUE ? cVar == J5.c.f4299k ? new J5.e(i7) : new J5.r(i7, cVar) : new J5.e(Integer.MAX_VALUE) : cVar == J5.c.f4299k ? new J5.e(0) : new J5.r(1, cVar);
        }
        if (cVar == J5.c.f4299k) {
            return new J5.r(1, J5.c.f4300l);
        }
        throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
    }

    public static final T a0(C0594z c0594z, E4.h hVar) {
        T t7 = new T(0);
        int i7 = c0594z.f8653m;
        if ((c0594z.f8652l & 4) == 4) {
            EnumC0593y enumC0593y = c0594z.f8655o;
            if (enumC0593y == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            int iOrdinal = enumC0593y.ordinal();
            if (iOrdinal != 0 && iOrdinal != 1 && iOrdinal != 2) {
                throw new D6.r();
            }
        }
        T4.i iVar = (T4.i) hVar.f1942m;
        int i8 = c0594z.f8652l;
        U uA = (i8 & 8) == 8 ? c0594z.f8656p : (i8 & 16) == 16 ? iVar.a(c0594z.f8657q) : null;
        if (uA != null) {
            c0(uA, hVar);
        }
        List<C0594z> list = c0594z.f8658r;
        kotlin.jvm.internal.l.e("getAndArgumentList(...)", list);
        ArrayList arrayList = t7.a;
        for (C0594z c0594z2 : list) {
            kotlin.jvm.internal.l.c(c0594z2);
            arrayList.add(a0(c0594z2, hVar));
        }
        List<C0594z> list2 = c0594z.f8659s;
        kotlin.jvm.internal.l.e("getOrArgumentList(...)", list2);
        ArrayList arrayList2 = t7.f1531b;
        for (C0594z c0594z3 : list2) {
            kotlin.jvm.internal.l.c(c0594z3);
            arrayList2.add(a0(c0594z3, hVar));
        }
        return t7;
    }

    public static final long b(int i7, int i8) {
        return (i8 & 4294967295L) | (i7 << 32);
    }

    public static final Y b0(R4.J j7, E4.h hVar) {
        T4.g gVar;
        kotlin.jvm.internal.l.f("<this>", j7);
        Y y7 = new Y(j7.f8213n, (j7.f8212m & 256) == 256 ? j7.f8201A : w(j7.f8213n), (j7.f8212m & 512) == 512 ? j7.f8202B : w(j7.f8213n), ((T4.g) hVar.f1941l).a(j7.f8215p));
        List list = j7.f8218s;
        kotlin.jvm.internal.l.e("getTypeParameterList(...)", list);
        E4.h hVarB = hVar.b(list);
        List<Z> list2 = j7.f8218s;
        kotlin.jvm.internal.l.e("getTypeParameterList(...)", list2);
        ArrayList arrayList = y7.f1548d;
        for (Z z7 : list2) {
            kotlin.jvm.internal.l.c(z7);
            arrayList.add(d0(z7, hVarB));
        }
        T4.i iVar = (T4.i) hVarB.f1942m;
        U uP = P(j7, iVar);
        if (uP != null) {
            c0(uP, hVarB);
        }
        List<c0> list3 = j7.f8224y;
        kotlin.jvm.internal.l.e("getContextParameterList(...)", list3);
        ArrayList arrayList2 = y7.f1550f;
        for (c0 c0Var : list3) {
            kotlin.jvm.internal.l.c(c0Var);
            arrayList2.add(e0(c0Var, hVarB));
        }
        if (j7.f8224y.isEmpty()) {
            List list4 = j7.f8221v;
            kotlin.jvm.internal.l.e("getContextReceiverTypeList(...)", list4);
            if (!list4.isEmpty()) {
                Iterator it = n(j7, iVar).iterator();
                while (it.hasNext()) {
                    c0((U) it.next(), hVarB);
                    arrayList2.add(new d0(0, "_"));
                }
            }
        }
        if ((j7.f8212m & 128) == 128) {
            c0 c0Var2 = j7.f8225z;
            kotlin.jvm.internal.l.e("getSetterValueParameter(...)", c0Var2);
            e0(c0Var2, hVarB);
        }
        c0(T(j7, iVar), hVarB);
        List<Integer> list5 = j7.f8203C;
        kotlin.jvm.internal.l.e("getVersionRequirementList(...)", list5);
        ArrayList arrayList3 = y7.f1551g;
        for (Integer num : list5) {
            kotlin.jvm.internal.l.c(num);
            arrayList3.add(N(num.intValue(), hVarB));
        }
        Iterator it2 = ((List) hVarB.f1945p).iterator();
        while (it2.hasNext()) {
            ((G4.d) ((F4.k) it2.next())).getClass();
            F4.d dVar = G4.e.a;
            kotlin.jvm.internal.l.f(LinkHeader.Parameters.Type, dVar);
            List list6 = j7.f8205E;
            kotlin.jvm.internal.l.e("getAnnotationList(...)", list6);
            ArrayList arrayList4 = y7.f1552h;
            Iterator it3 = list6.iterator();
            while (true) {
                boolean zHasNext = it3.hasNext();
                gVar = (T4.g) hVarB.f1941l;
                if (!zHasNext) {
                    break;
                }
                C0577h c0577h = (C0577h) it3.next();
                kotlin.jvm.internal.l.c(c0577h);
                arrayList4.add(android.support.v4.media.session.b.C(c0577h, gVar));
            }
            List<C0577h> list7 = j7.f8206F;
            kotlin.jvm.internal.l.e("getGetterAnnotationList(...)", list7);
            ArrayList arrayList5 = y7.f1546b.f1556b;
            for (C0577h c0577h2 : list7) {
                kotlin.jvm.internal.l.c(c0577h2);
                arrayList5.add(android.support.v4.media.session.b.C(c0577h2, gVar));
            }
            D4.Z z8 = y7.f1547c;
            if (z8 != null) {
                List<C0577h> list8 = j7.f8207G;
                kotlin.jvm.internal.l.e("getSetterAnnotationList(...)", list8);
                ArrayList arrayList6 = z8.f1556b;
                for (C0577h c0577h3 : list8) {
                    kotlin.jvm.internal.l.c(c0577h3);
                    arrayList6.add(android.support.v4.media.session.b.C(c0577h3, gVar));
                }
            }
            List<C0577h> list9 = j7.f8208H;
            kotlin.jvm.internal.l.e("getExtensionReceiverAnnotationList(...)", list9);
            ArrayList arrayList7 = y7.f1549e;
            for (C0577h c0577h4 : list9) {
                kotlin.jvm.internal.l.c(c0577h4);
                arrayList7.add(android.support.v4.media.session.b.C(c0577h4, gVar));
            }
            List<C0577h> list10 = j7.I;
            kotlin.jvm.internal.l.e("getBackingFieldAnnotationList(...)", list10);
            ArrayList arrayList8 = y7.f1553i;
            for (C0577h c0577h5 : list10) {
                kotlin.jvm.internal.l.c(c0577h5);
                arrayList8.add(android.support.v4.media.session.b.C(c0577h5, gVar));
            }
            List<C0577h> list11 = j7.J;
            kotlin.jvm.internal.l.e("getDelegateFieldAnnotationList(...)", list11);
            ArrayList arrayList9 = y7.f1554j;
            for (C0577h c0577h6 : list11) {
                kotlin.jvm.internal.l.c(c0577h6);
                arrayList9.add(android.support.v4.media.session.b.C(c0577h6, gVar));
            }
            C0611h c0611h = V4.g.a;
            V4.d dVarB = V4.g.b(j7, gVar, iVar, true);
            C0617n c0617n = U4.j.f9300d;
            kotlin.jvm.internal.l.e("propertySignature", c0617n);
            U4.d dVar2 = (U4.d) android.support.v4.media.session.b.w(j7, c0617n);
            U4.c cVar = null;
            U4.c cVar2 = (dVar2 == null || !dVar2.i()) ? null : dVar2.f9256o;
            U4.c cVar3 = (dVar2 == null || (dVar2.f9253l & 8) != 8) ? null : dVar2.f9257p;
            Object objK = j7.k(U4.j.f9301e);
            kotlin.jvm.internal.l.e("getExtension(...)", objK);
            ((Number) objK).intValue();
            if (dVarB != null) {
                kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, dVarB.f9482h);
                kotlin.jvm.internal.l.f("descriptor", dVarB.f9483i);
            }
            if (cVar2 != null) {
                gVar.a(cVar2.f9246m);
                gVar.a(cVar2.f9247n);
            }
            if (cVar3 != null) {
                gVar.a(cVar3.f9246m);
                gVar.a(cVar3.f9247n);
            }
            U4.c cVar4 = (dVar2 == null || (dVar2.f9253l & 2) != 2) ? null : dVar2.f9255n;
            if (cVar4 != null) {
                gVar.a(cVar4.f9246m);
                gVar.a(cVar4.f9247n);
            }
            if (dVar2 != null && (dVar2.f9253l & 16) == 16) {
                cVar = dVar2.f9258q;
            }
            if (cVar != null) {
                gVar.a(cVar.f9246m);
                gVar.a(cVar.f9247n);
            }
        }
        return y7;
    }

    public static C0209a c(String str, H0.I i7, long j7, T0.b bVar, M0.i iVar, int i8, int i9) {
        y yVar = y.f7779k;
        return new C0209a(new P0.c(str, i7, yVar, yVar, iVar, bVar), i8, false, j7);
    }

    public static final a0 c0(U u5, E4.h hVar) {
        n6.d p7;
        a0 a0Var = new a0((u5.f8298o ? 1 : 0) + (u5.f8292A << 1));
        boolean zP = u5.p();
        T4.g gVar = (T4.g) hVar.f1941l;
        if (zP) {
            p7 = new N(android.support.v4.media.session.b.v(gVar, u5.f8302s));
        } else {
            int i7 = u5.f8296m;
            if ((i7 & 128) == 128) {
                p7 = new O(android.support.v4.media.session.b.v(gVar, u5.f8305v));
            } else if ((i7 & 32) == 32) {
                p7 = new P(u5.f8303t);
            } else {
                if ((i7 & 64) != 64) {
                    throw new A5.e("No classifier (class, type alias or type parameter) recorded for Type", 1);
                }
                Integer numA = hVar.a(u5.f8304u);
                if (numA == null) {
                    throw new A5.e("No type parameter id for ".concat(gVar.a(u5.f8304u)), 1);
                }
                p7 = new P(numA.intValue());
            }
        }
        a0Var.f1561b = p7;
        Iterator it = u5.f8297n.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            T4.i iVar = (T4.i) hVar.f1942m;
            W w7 = null;
            D4.e0 e0Var = null;
            if (!zHasNext) {
                U uD = d(u5, iVar);
                a0Var.f1563d = uD != null ? c0(uD, hVar) : null;
                U uL = L(u5, iVar);
                a0Var.f1564e = uL != null ? c0(uL, hVar) : null;
                U uR = r(u5, iVar);
                if (uR != null) {
                    a0 a0VarC0 = c0(uR, hVar);
                    String strA = (u5.f8296m & 2) == 2 ? gVar.a(u5.f8299p) : null;
                    W w8 = new W();
                    w8.a = a0VarC0;
                    w8.f1537b = strA;
                    w7 = w8;
                }
                a0Var.f1565f = w7;
                Iterator it2 = ((List) hVar.f1945p).iterator();
                while (it2.hasNext()) {
                    ((G4.d) ((F4.k) it2.next())).getClass();
                    F4.d dVar = G4.f.f2866c;
                    kotlin.jvm.internal.l.f(LinkHeader.Parameters.Type, dVar);
                    G4.f fVar = (G4.f) ((F4.g) n6.d.d0(a0Var.f1566g, dVar));
                    Object objK = u5.k(U4.j.f9303g);
                    kotlin.jvm.internal.l.e("getExtension(...)", objK);
                    fVar.a = ((Boolean) objK).booleanValue();
                    for (C0577h c0577h : (List) u5.k(U4.j.f9302f)) {
                        ArrayList arrayList = fVar.f2867b;
                        kotlin.jvm.internal.l.c(c0577h);
                        arrayList.add(android.support.v4.media.session.b.C(c0577h, gVar));
                    }
                }
                return a0Var;
            }
            R4.S s7 = (R4.S) it.next();
            Q q6 = s7.f8270m;
            if (q6 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            int iOrdinal = q6.ordinal();
            if (iOrdinal == 0) {
                e0Var = D4.e0.f1578l;
            } else if (iOrdinal == 1) {
                e0Var = D4.e0.f1579m;
            } else if (iOrdinal == 2) {
                e0Var = D4.e0.f1577k;
            } else if (iOrdinal != 3) {
                throw new D6.r();
            }
            ArrayList arrayList2 = a0Var.f1562c;
            if (e0Var != null) {
                U uH0 = h0(s7, iVar);
                if (uH0 == null) {
                    throw new A5.e("No type argument for non-STAR projection in Type", 1);
                }
                arrayList2.add(new D4.c0(e0Var, c0(uH0, hVar)));
            } else {
                arrayList2.add(D4.c0.f1572c);
            }
        }
    }

    public static final U d(U u5, T4.i iVar) {
        kotlin.jvm.internal.l.f("<this>", u5);
        int i7 = u5.f8296m;
        if ((i7 & 1024) == 1024) {
            return u5.f8308y;
        }
        if ((i7 & 2048) == 2048) {
            return iVar.a(u5.f8309z);
        }
        return null;
    }

    public static final T d0(Z z7, E4.h hVar) {
        D4.e0 e0Var;
        R4.Y y7 = z7.f8356q;
        if (y7 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        int iOrdinal = y7.ordinal();
        if (iOrdinal == 0) {
            e0Var = D4.e0.f1578l;
        } else if (iOrdinal == 1) {
            e0Var = D4.e0.f1579m;
        } else {
            if (iOrdinal != 2) {
                throw new D6.r();
            }
            e0Var = D4.e0.f1577k;
        }
        boolean z8 = z7.f8355p;
        int i7 = z7.f8354o;
        T4.g gVar = (T4.g) hVar.f1941l;
        T t7 = new T(z8 ? 1 : 0, gVar.a(i7), e0Var);
        List listK0 = k0(z7, (T4.i) hVar.f1942m);
        ArrayList arrayList = t7.a;
        Iterator it = listK0.iterator();
        while (it.hasNext()) {
            arrayList.add(c0((U) it.next(), hVar));
        }
        Iterator it2 = ((List) hVar.f1945p).iterator();
        while (it2.hasNext()) {
            ((G4.d) ((F4.k) it2.next())).getClass();
            F4.d dVar = G4.g.f2868b;
            kotlin.jvm.internal.l.f(LinkHeader.Parameters.Type, dVar);
            G4.g gVar2 = (G4.g) ((F4.h) n6.d.d0(t7.f1531b, dVar));
            for (C0577h c0577h : (List) z7.k(U4.j.f9304h)) {
                ArrayList arrayList2 = gVar2.a;
                kotlin.jvm.internal.l.c(c0577h);
                arrayList2.add(android.support.v4.media.session.b.C(c0577h, gVar));
            }
        }
        return t7;
    }

    public static final W4.c e(W4.c cVar, String str) {
        return cVar.a(W4.e.e(str));
    }

    public static final d0 e0(c0 c0Var, E4.h hVar) {
        int i7 = c0Var.f8399n;
        int i8 = c0Var.f8400o;
        T4.g gVar = (T4.g) hVar.f1941l;
        d0 d0Var = new d0(i7, gVar.a(i8));
        T4.i iVar = (T4.i) hVar.f1942m;
        c0(i0(c0Var, iVar), hVar);
        U uL0 = l0(c0Var, iVar);
        if (uL0 != null) {
            c0(uL0, hVar);
        }
        if ((c0Var.f8398m & 64) == 64) {
            C0574e c0574e = c0Var.f8406u;
            kotlin.jvm.internal.l.e("getAnnotationParameterDefaultValue(...)", c0574e);
            android.support.v4.media.session.b.D(c0574e, gVar);
        }
        Iterator it = ((List) hVar.f1945p).iterator();
        while (it.hasNext()) {
            ((G4.d) ((F4.k) it.next())).getClass();
            List<C0577h> list = c0Var.f8405t;
            kotlin.jvm.internal.l.e("getAnnotationList(...)", list);
            ArrayList arrayList = d0Var.f1575b;
            for (C0577h c0577h : list) {
                kotlin.jvm.internal.l.c(c0577h);
                arrayList.add(android.support.v4.media.session.b.C(c0577h, gVar));
            }
        }
        return d0Var;
    }

    public static final boolean f(d0.e eVar, long j7) {
        if (!eVar.f10402k.f10414w) {
            return false;
        }
        C2372t c2372t = (C2372t) AbstractC2359f.v(eVar).f17660G.f7173c;
        if (!c2372t.f17894T.f10414w) {
            return false;
        }
        long j8 = c2372t.f16842m;
        long jS = c2372t.S(0L);
        float fD = g0.c.d(jS);
        float fE = g0.c.e(jS);
        float f5 = ((int) (j8 >> 32)) + fD;
        float f7 = ((int) (j8 & 4294967295L)) + fE;
        float fD2 = g0.c.d(j7);
        if (fD > fD2 || fD2 > f5) {
            return false;
        }
        float fE2 = g0.c.e(j7);
        return fE <= fE2 && fE2 <= f7;
    }

    public static final Map f0(Map map) {
        kotlin.jvm.internal.l.f("<this>", map);
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        kotlin.jvm.internal.l.e("with(...)", mapSingletonMap);
        return mapSingletonMap;
    }

    public static void g(c.x xVar, c.o oVar, e4.k kVar) {
        kotlin.jvm.internal.l.f("<this>", xVar);
        xVar.a(oVar, new C0180q(kVar));
    }

    public static W4.c g0(W4.e eVar) {
        kotlin.jvm.internal.l.f("shortName", eVar);
        String strB = eVar.b();
        kotlin.jvm.internal.l.e("asString(...)", strB);
        return new W4.c(new W4.d(strB, W4.c.f9618c.a, eVar));
    }

    public static void h(SpannableStringBuilder spannableStringBuilder, Object obj, int i7, int i8) {
        for (Object obj2 : spannableStringBuilder.getSpans(i7, i8, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i7 && spannableStringBuilder.getSpanEnd(obj2) == i8 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i7, i8, 33);
    }

    public static final U h0(R4.S s7, T4.i iVar) {
        int i7 = s7.f8269l;
        if ((i7 & 2) == 2) {
            return s7.f8271n;
        }
        if ((i7 & 4) == 4) {
            return iVar.a(s7.f8272o);
        }
        return null;
    }

    public static final void i(int i7, String str) {
        if (str.charAt(i7) == '-') {
            return;
        }
        StringBuilder sbP = AbstractC0703b.p(i7, "Expected '-' (hyphen) at index ", ", but was '");
        sbP.append(str.charAt(i7));
        sbP.append('\'');
        throw new IllegalArgumentException(sbP.toString().toString());
    }

    public static final U i0(c0 c0Var, T4.i iVar) {
        kotlin.jvm.internal.l.f("<this>", c0Var);
        kotlin.jvm.internal.l.f("typeTable", iVar);
        int i7 = c0Var.f8398m;
        if ((i7 & 4) == 4) {
            U u5 = c0Var.f8401p;
            kotlin.jvm.internal.l.e("getType(...)", u5);
            return u5;
        }
        if ((i7 & 8) == 8) {
            return iVar.a(c0Var.f8402q);
        }
        throw new IllegalStateException("No type in ProtoBuf.ValueParameter");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String j(u4.InterfaceC2112s r5, int r6) {
        /*
            r0 = 1
            r1 = r6 & 1
            r2 = 0
            if (r1 == 0) goto L8
            r1 = r0
            goto L9
        L8:
            r1 = r2
        L9:
            r6 = r6 & 2
            if (r6 == 0) goto Le
            goto Lf
        Le:
            r0 = r2
        Lf:
            java.lang.String r6 = "<this>"
            kotlin.jvm.internal.l.f(r6, r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            if (r0 == 0) goto L35
            boolean r0 = r5 instanceof u4.InterfaceC2104j
            if (r0 == 0) goto L22
            java.lang.String r0 = "<init>"
            goto L32
        L22:
            r0 = r5
            x4.n r0 = (x4.AbstractC2287n) r0
            W4.e r0 = r0.getName()
            java.lang.String r0 = r0.b()
            java.lang.String r2 = "asString(...)"
            kotlin.jvm.internal.l.e(r2, r0)
        L32:
            r6.append(r0)
        L35:
            java.lang.String r0 = "("
            r6.append(r0)
            x4.v r0 = r5.D()
            w5.c r2 = w5.c.f17096k
            if (r0 == 0) goto L51
            n5.x r0 = r0.getType()
            P4.q r3 = P4.q.f7813i
            java.lang.Object r0 = q0.c.G(r0, r3, r2)
            P4.k r0 = (P4.k) r0
            r6.append(r0)
        L51:
            java.util.List r0 = r5.m0()
            java.util.Iterator r0 = r0.iterator()
        L59:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L7c
            java.lang.Object r3 = r0.next()
            x4.S r3 = (x4.C2272S) r3
            x4.T r3 = (x4.AbstractC2273T) r3
            n5.x r3 = r3.getType()
            java.lang.String r4 = "getType(...)"
            kotlin.jvm.internal.l.e(r4, r3)
            P4.q r4 = P4.q.f7813i
            java.lang.Object r3 = q0.c.G(r3, r4, r2)
            P4.k r3 = (P4.k) r3
            r6.append(r3)
            goto L59
        L7c:
            java.lang.String r0 = ")"
            r6.append(r0)
            if (r1 == 0) goto Lc2
            boolean r0 = r5 instanceof u4.InterfaceC2104j
            if (r0 == 0) goto L88
            goto Laa
        L88:
            n5.x r0 = r5.getReturnType()
            kotlin.jvm.internal.l.c(r0)
            W4.e r1 = r4.AbstractC1880i.f14937e
            W4.d r1 = r4.AbstractC1886o.f14992d
            boolean r0 = r4.AbstractC1880i.D(r0, r1)
            if (r0 == 0) goto Lb0
            n5.x r0 = r5.getReturnType()
            kotlin.jvm.internal.l.c(r0)
            boolean r0 = n5.Y.e(r0)
            if (r0 != 0) goto Lb0
            boolean r0 = r5 instanceof x4.C2264J
            if (r0 != 0) goto Lb0
        Laa:
            java.lang.String r5 = "V"
            r6.append(r5)
            goto Lc2
        Lb0:
            n5.x r5 = r5.getReturnType()
            kotlin.jvm.internal.l.c(r5)
            P4.q r0 = P4.q.f7813i
            java.lang.Object r5 = q0.c.G(r5, r0, r2)
            P4.k r5 = (P4.k) r5
            r6.append(r5)
        Lc2:
            java.lang.String r5 = r6.toString()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: P3.F.j(u4.s, int):java.lang.String");
    }

    public static final U j0(R4.W w7, T4.i iVar) {
        int i7 = w7.f8324m;
        if ((i7 & 4) == 4) {
            U u5 = w7.f8328q;
            kotlin.jvm.internal.l.e("getUnderlyingType(...)", u5);
            return u5;
        }
        if ((i7 & 8) == 8) {
            return iVar.a(w7.f8329r);
        }
        throw new IllegalStateException("No underlyingType in ProtoBuf.TypeAlias");
    }

    public static final String k(InterfaceC2096b interfaceC2096b) {
        kotlin.jvm.internal.l.f("<this>", interfaceC2096b);
        if (!Z4.e.n(interfaceC2096b)) {
            InterfaceC2105k interfaceC2105kK = interfaceC2096b.k();
            InterfaceC2099e interfaceC2099e = interfaceC2105kK instanceof InterfaceC2099e ? (InterfaceC2099e) interfaceC2105kK : null;
            if (interfaceC2099e != null && !interfaceC2099e.getName().f9625l) {
                InterfaceC2096b interfaceC2096bA = interfaceC2096b.a();
                C2266L c2266l = interfaceC2096bA instanceof C2266L ? (C2266L) interfaceC2096bA : null;
                if (c2266l != null) {
                    return android.support.v4.media.session.b.G(interfaceC2099e, j(c2266l, 3));
                }
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public static final List k0(Z z7, T4.i iVar) {
        kotlin.jvm.internal.l.f("<this>", z7);
        List list = z7.f8357r;
        boolean zIsEmpty = list.isEmpty();
        ?? arrayList = list;
        if (zIsEmpty) {
            arrayList = 0;
        }
        if (arrayList == 0) {
            List<Integer> list2 = z7.f8358s;
            kotlin.jvm.internal.l.e("getUpperBoundIdList(...)", list2);
            arrayList = new ArrayList(r.p(list2, 10));
            for (Integer num : list2) {
                kotlin.jvm.internal.l.c(num);
                arrayList.add(iVar.a(num.intValue()));
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public static final List l(C0580k c0580k, T4.i iVar) {
        kotlin.jvm.internal.l.f("<this>", c0580k);
        List list = c0580k.f8554w;
        boolean zIsEmpty = list.isEmpty();
        ?? arrayList = list;
        if (zIsEmpty) {
            arrayList = 0;
        }
        if (arrayList == 0) {
            List<Integer> list2 = c0580k.f8555x;
            kotlin.jvm.internal.l.e("getContextReceiverTypeIdList(...)", list2);
            arrayList = new ArrayList(r.p(list2, 10));
            for (Integer num : list2) {
                kotlin.jvm.internal.l.c(num);
                arrayList.add(iVar.a(num.intValue()));
            }
        }
        return arrayList;
    }

    public static final U l0(c0 c0Var, T4.i iVar) {
        kotlin.jvm.internal.l.f("<this>", c0Var);
        int i7 = c0Var.f8398m;
        if ((i7 & 16) == 16) {
            return c0Var.f8403r;
        }
        if ((i7 & 32) == 32) {
            return iVar.a(c0Var.f8404s);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public static final List m(R4.B b4, T4.i iVar) {
        kotlin.jvm.internal.l.f("<this>", b4);
        List list = b4.f8137v;
        boolean zIsEmpty = list.isEmpty();
        ?? arrayList = list;
        if (zIsEmpty) {
            arrayList = 0;
        }
        if (arrayList == 0) {
            List<Integer> list2 = b4.f8138w;
            kotlin.jvm.internal.l.e("getContextReceiverTypeIdList(...)", list2);
            arrayList = new ArrayList(r.p(list2, 10));
            for (Integer num : list2) {
                kotlin.jvm.internal.l.c(num);
                arrayList.add(iVar.a(num.intValue()));
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public static final List n(R4.J j7, T4.i iVar) {
        kotlin.jvm.internal.l.f("<this>", j7);
        List list = j7.f8221v;
        boolean zIsEmpty = list.isEmpty();
        ?? arrayList = list;
        if (zIsEmpty) {
            arrayList = 0;
        }
        if (arrayList == 0) {
            List<Integer> list2 = j7.f8222w;
            kotlin.jvm.internal.l.e("getContextReceiverTypeIdList(...)", list2);
            arrayList = new ArrayList(r.p(list2, 10));
            for (Integer num : list2) {
                kotlin.jvm.internal.l.c(num);
                arrayList.add(iVar.a(num.intValue()));
            }
        }
        return arrayList;
    }

    public static int o(boolean z7) {
        List supportedPerformancePoints;
        try {
            C2392n c2392n = new C2392n();
            c2392n.f18074m = y1.D.m("video/avc");
            C2393o c2393o = new C2393o(c2392n);
            if (c2393o.f18112n != null) {
                X xG = M1.z.g(M1.k.f6460l, c2393o, z7, false);
                for (int i7 = 0; i7 < xG.f12306n; i7++) {
                    if (((M1.p) xG.get(i7)).f6464d != null && ((M1.p) xG.get(i7)).f6464d.getVideoCapabilities() != null && (supportedPerformancePoints = ((M1.p) xG.get(i7)).f6464d.getVideoCapabilities().getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                        C0.b.i();
                        MediaCodecInfo.VideoCapabilities.PerformancePoint performancePointB = C0.b.b();
                        for (int i8 = 0; i8 < supportedPerformancePoints.size(); i8++) {
                            if (C0.b.d(supportedPerformancePoints.get(i8)).covers(performancePointB)) {
                                return 2;
                            }
                        }
                        return 1;
                    }
                }
            }
        } catch (M1.w unused) {
        }
        return 0;
    }

    public static final U p(R4.W w7, T4.i iVar) {
        int i7 = w7.f8324m;
        if ((i7 & 16) == 16) {
            U u5 = w7.f8330s;
            kotlin.jvm.internal.l.e("getExpandedType(...)", u5);
            return u5;
        }
        if ((i7 & 32) == 32) {
            return iVar.a(w7.f8331t);
        }
        throw new IllegalStateException("No expandedType in ProtoBuf.TypeAlias");
    }

    public static final float q(float f5) {
        float fIntBitsToFloat = Float.intBitsToFloat(((int) ((Float.floatToRawIntBits(f5) & 8589934591L) / 3)) + 709952852);
        float f7 = fIntBitsToFloat - ((fIntBitsToFloat - (f5 / (fIntBitsToFloat * fIntBitsToFloat))) * 0.33333334f);
        return f7 - ((f7 - (f5 / (f7 * f7))) * 0.33333334f);
    }

    public static final U r(U u5, T4.i iVar) {
        kotlin.jvm.internal.l.f("<this>", u5);
        int i7 = u5.f8296m;
        if ((i7 & 4) == 4) {
            return u5.f8300q;
        }
        if ((i7 & 8) == 8) {
            return iVar.a(u5.f8301r);
        }
        return null;
    }

    public static Object s(S3.f fVar, Object obj, e4.n nVar) {
        kotlin.jvm.internal.l.f("operation", nVar);
        return nVar.invoke(obj, fVar);
    }

    public static final void t(long j7, byte[] bArr, int i7, int i8, int i9) {
        int i10 = 7 - i8;
        int i11 = 8 - i9;
        if (i11 > i10) {
            return;
        }
        while (true) {
            int i12 = AbstractC2499d.a[(int) ((j7 >> (i10 << 3)) & 255)];
            int i13 = i7 + 1;
            bArr[i7] = (byte) (i12 >> 8);
            i7 += 2;
            bArr[i13] = (byte) i12;
            if (i10 == i11) {
                return;
            } else {
                i10--;
            }
        }
    }

    public static S3.f u(S3.f fVar, S3.g gVar) {
        kotlin.jvm.internal.l.f("key", gVar);
        if (kotlin.jvm.internal.l.a(fVar.getKey(), gVar)) {
            return fVar;
        }
        return null;
    }

    public static final InterfaceC1425d v(SerialDescriptor serialDescriptor) {
        kotlin.jvm.internal.l.f("<this>", serialDescriptor);
        if (serialDescriptor instanceof X5.b) {
            return ((X5.b) serialDescriptor).f9925b;
        }
        if (serialDescriptor instanceof n0) {
            return v(((n0) serialDescriptor).a);
        }
        return null;
    }

    public static final int w(int i7) {
        return T4.e.b(T4.e.f9083c.c(i7).booleanValue(), (i0) T4.e.f9084d.c(i7), (R4.D) T4.e.f9085e.c(i7));
    }

    public static final C1538e x() {
        C1538e c1538e = f7747g;
        if (c1538e != null) {
            return c1538e;
        }
        C1537d c1537d = new C1537d("Filled.Info", false);
        int i7 = AbstractC1530A.a;
        C0975U c0975u = new C0975U(C0998u.f11829b);
        S s7 = new S(7, false);
        s7.u(12.0f, 2.0f);
        s7.n(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        s7.w(4.48f, 10.0f, 10.0f, 10.0f);
        s7.w(10.0f, -4.48f, 10.0f, -10.0f);
        s7.v(17.52f, 2.0f, 12.0f, 2.0f);
        s7.m();
        s7.u(13.0f, 17.0f);
        s7.r(-2.0f);
        s7.A(-6.0f);
        s7.r(2.0f);
        s7.A(6.0f);
        s7.m();
        s7.u(13.0f, 9.0f);
        s7.r(-2.0f);
        s7.s(11.0f, 7.0f);
        s7.r(2.0f);
        s7.A(2.0f);
        s7.m();
        C1537d.a(c1537d, s7.f1530k, c0975u);
        C1538e c1538eB = c1537d.b();
        f7747g = c1538eB;
        return c1538eB;
    }

    public static Intent y(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String strZ = z(context, componentName);
        if (strZ == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strZ);
        return z(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    public static String z(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }
}
