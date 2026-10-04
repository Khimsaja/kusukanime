package v;

import O.C0486d;
import O.C0510p;
import O.InterfaceC0501k0;
import b1.AbstractC0703b;
import d1.C0782a;
import java.util.List;
import w0.InterfaceC2172G;
import w0.InterfaceC2174I;
import w0.InterfaceC2175J;
import y0.C2361h;
import y0.C2362i;
import y0.C2363j;
import y0.InterfaceC2364k;

/* renamed from: v.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2123b {
    public static final M a = new M(1);

    /* renamed from: b, reason: collision with root package name */
    public static final M f16430b = new M(2);

    /* renamed from: c, reason: collision with root package name */
    public static final int f16431c = 9;

    /* renamed from: d, reason: collision with root package name */
    public static final int f16432d = 6;

    /* renamed from: e, reason: collision with root package name */
    public static final int f16433e = 10;

    /* renamed from: f, reason: collision with root package name */
    public static final int f16434f = 5;

    /* renamed from: g, reason: collision with root package name */
    public static final int f16435g = 15;

    public static final void a(C0510p c0510p, a0.q qVar) {
        C2135n c2135n = C2135n.f16469c;
        int i7 = c0510p.f7128P;
        a0.q qVarC = a0.a.c(c0510p, qVar);
        InterfaceC0501k0 interfaceC0501k0M = c0510p.m();
        InterfaceC2364k.f17877j.getClass();
        C2362i c2362i = C2363j.f17871b;
        B2.l lVar = c0510p.a;
        c0510p.V();
        if (c0510p.f7127O) {
            c0510p.l(c2362i);
        } else {
            c0510p.e0();
        }
        C0486d.R(c0510p, C2363j.f17875f, c2135n);
        C0486d.R(c0510p, C2363j.f17874e, interfaceC0501k0M);
        C0486d.R(c0510p, C2363j.f17873d, qVarC);
        C2361h c2361h = C2363j.f17876g;
        if (c0510p.f7127O || !kotlin.jvm.internal.l.a(c0510p.H(), Integer.valueOf(i7))) {
            AbstractC0703b.u(i7, c0510p, i7, c2361h);
        }
        c0510p.p(true);
    }

    public static long c(int i7, long j7) {
        return q0.c.a(i7 == 1 ? T0.a.j(j7) : T0.a.i(j7), i7 == 1 ? T0.a.h(j7) : T0.a.g(j7), i7 == 1 ? T0.a.i(j7) : T0.a.j(j7), i7 == 1 ? T0.a.g(j7) : T0.a.h(j7));
    }

    public static long d(int i7, long j7) {
        return q0.c.a(0, T0.a.h(j7), (i7 & 4) != 0 ? T0.a.i(j7) : 0, T0.a.g(j7));
    }

    public static final d0 e(InterfaceC2172G interfaceC2172G) {
        Object objH = interfaceC2172G.h();
        if (objH instanceof d0) {
            return (d0) objH;
        }
        return null;
    }

    public static final float f(d0 d0Var) {
        if (d0Var != null) {
            return d0Var.a;
        }
        return 0.0f;
    }

    public static final InterfaceC2174I g(b0 b0Var, int i7, int i8, int i9, int i10, int i11, InterfaceC2175J interfaceC2175J, List list, w0.S[] sArr, int i12, int i13, int[] iArr, int i14) throws Throwable {
        int i15;
        String str;
        float f5;
        long j7;
        String str2;
        String str3;
        long j8;
        int iMax;
        int i16;
        int iK;
        String str4;
        int i17;
        String str5;
        float f7;
        boolean z7;
        int[] iArr2;
        int i18;
        int i19;
        List list2 = list;
        int i20 = i13;
        long j9 = i11;
        int i21 = i20 - i12;
        int[] iArr3 = new int[i21];
        int i22 = i12;
        float f8 = 0.0f;
        int i23 = 0;
        int i24 = 0;
        int iMin = 0;
        int iMax2 = 0;
        while (i22 < i20) {
            InterfaceC2172G interfaceC2172G = (InterfaceC2172G) list2.get(i22);
            float f9 = f(e(interfaceC2172G));
            if (f9 > 0.0f) {
                f8 += f9;
                i23++;
                iArr2 = iArr3;
                i18 = i22;
            } else {
                int i25 = i9 - i24;
                w0.S sB = sArr[i22];
                if (sB == null) {
                    i18 = i22;
                    iArr2 = iArr3;
                    i19 = i23;
                    sB = interfaceC2172G.b(b0Var.h(0, i9 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i25 < 0 ? 0 : i25, i10, false));
                } else {
                    iArr2 = iArr3;
                    i18 = i22;
                    i19 = i23;
                }
                w0.S s7 = sB;
                int iJ = b0Var.j(s7);
                int i26 = b0Var.i(s7);
                iArr2[i18 - i12] = iJ;
                int i27 = i25 - iJ;
                if (i27 < 0) {
                    i27 = 0;
                }
                iMin = Math.min(i11, i27);
                i24 += iJ + iMin;
                iMax2 = Math.max(iMax2, i26);
                sArr[i18] = s7;
                i23 = i19;
            }
            i22 = i18 + 1;
            iArr3 = iArr2;
        }
        int[] iArr4 = iArr3;
        int i28 = i23;
        int i29 = iMax2;
        if (i28 == 0) {
            i24 -= iMin;
            i15 = i21;
            iMax = i29;
            i16 = 0;
            iK = 0;
        } else {
            int i30 = i9 != Integer.MAX_VALUE ? i9 : i7;
            long j10 = (i28 - 1) * j9;
            float f10 = f8;
            long j11 = (i30 - i24) - j10;
            if (j11 < 0) {
                j11 = 0;
            }
            float f11 = j11 / f10;
            i15 = i21;
            long jRound = j11;
            int i31 = i12;
            while (true) {
                str = "weightedSize ";
                f5 = f11;
                j7 = j11;
                str2 = "fixedSpace ";
                str3 = "weightChildrenCount ";
                j8 = j10;
                if (i31 >= i20) {
                    break;
                }
                int i32 = i31;
                float f12 = f(e((InterfaceC2172G) list2.get(i31)));
                float f13 = f5 * f12;
                try {
                    jRound -= Math.round(f13);
                    i31 = i32 + 1;
                    list2 = list;
                    f11 = f5;
                    j11 = j7;
                    j10 = j8;
                } catch (IllegalArgumentException e7) {
                    StringBuilder sbB = c0.b("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/297974033 mainAxisMax ", i9, "mainAxisMin ", i7, "targetSpace ");
                    sbB.append(i30);
                    sbB.append("arrangementSpacingPx ");
                    sbB.append(j9);
                    sbB.append("weightChildrenCount ");
                    sbB.append(i28);
                    sbB.append("fixedSpace ");
                    sbB.append(i24);
                    sbB.append("arrangementSpacingTotal ");
                    sbB.append(j8);
                    sbB.append("remainingToTarget ");
                    sbB.append(j7);
                    sbB.append("totalWeight ");
                    sbB.append(f10);
                    sbB.append("weightUnitSpace ");
                    sbB.append(f5);
                    sbB.append("itemWeight ");
                    sbB.append(f12);
                    sbB.append(str);
                    sbB.append(f13);
                    throw new IllegalArgumentException(sbB.toString()).initCause(e7);
                }
            }
            iMax = i29;
            int i33 = 0;
            int i34 = i12;
            while (i34 < i20) {
                if (sArr[i34] == null) {
                    InterfaceC2172G interfaceC2172G2 = (InterfaceC2172G) list.get(i34);
                    i17 = i34;
                    d0 d0VarE = e(interfaceC2172G2);
                    int i35 = i24;
                    float f14 = f(d0VarE);
                    if (f14 <= 0.0f) {
                        throw new IllegalStateException("All weights <= 0 should have placeables");
                    }
                    int iSignum = Long.signum(jRound);
                    String str6 = str2;
                    String str7 = str3;
                    jRound -= iSignum;
                    float f15 = f5 * f14;
                    int iMax3 = Math.max(0, Math.round(f15) + iSignum);
                    if (d0VarE != null) {
                        try {
                            z7 = d0VarE.f16437b;
                        } catch (IllegalArgumentException e8) {
                            e = e8;
                            f7 = f15;
                            StringBuilder sbB2 = c0.b("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/300280216 mainAxisMax ", i9, "mainAxisMin ", i7, "targetSpace ");
                            sbB2.append(i30);
                            sbB2.append("arrangementSpacingPx ");
                            sbB2.append(j9);
                            sbB2.append(str7);
                            sbB2.append(i28);
                            sbB2.append(str6);
                            sbB2.append(i35);
                            sbB2.append("arrangementSpacingTotal ");
                            sbB2.append(j8);
                            sbB2.append("remainingToTarget ");
                            sbB2.append(j7);
                            sbB2.append("totalWeight ");
                            sbB2.append(f10);
                            sbB2.append("weightUnitSpace ");
                            sbB2.append(f5);
                            sbB2.append("weight ");
                            sbB2.append(f14);
                            sbB2.append(str);
                            sbB2.append(f7);
                            sbB2.append("crossAxisDesiredSize nullremainderUnit ");
                            sbB2.append(iSignum);
                            sbB2.append("childMainAxisSize ");
                            sbB2.append(iMax3);
                            throw new IllegalArgumentException(sbB2.toString()).initCause(e);
                        }
                    } else {
                        z7 = true;
                    }
                    f7 = f15;
                    try {
                        w0.S sB2 = interfaceC2172G2.b(b0Var.h((!z7 || iMax3 == Integer.MAX_VALUE) ? 0 : iMax3, iMax3, i10, true));
                        int iJ2 = b0Var.j(sB2);
                        int i36 = b0Var.i(sB2);
                        iArr4[i17 - i12] = iJ2;
                        i33 += iJ2;
                        iMax = Math.max(iMax, i36);
                        sArr[i17] = sB2;
                        i24 = i35;
                        str4 = str7;
                        str5 = str6;
                    } catch (IllegalArgumentException e9) {
                        e = e9;
                        StringBuilder sbB22 = c0.b("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/300280216 mainAxisMax ", i9, "mainAxisMin ", i7, "targetSpace ");
                        sbB22.append(i30);
                        sbB22.append("arrangementSpacingPx ");
                        sbB22.append(j9);
                        sbB22.append(str7);
                        sbB22.append(i28);
                        sbB22.append(str6);
                        sbB22.append(i35);
                        sbB22.append("arrangementSpacingTotal ");
                        sbB22.append(j8);
                        sbB22.append("remainingToTarget ");
                        sbB22.append(j7);
                        sbB22.append("totalWeight ");
                        sbB22.append(f10);
                        sbB22.append("weightUnitSpace ");
                        sbB22.append(f5);
                        sbB22.append("weight ");
                        sbB22.append(f14);
                        sbB22.append(str);
                        sbB22.append(f7);
                        sbB22.append("crossAxisDesiredSize nullremainderUnit ");
                        sbB22.append(iSignum);
                        sbB22.append("childMainAxisSize ");
                        sbB22.append(iMax3);
                        throw new IllegalArgumentException(sbB22.toString()).initCause(e);
                    }
                } else {
                    str4 = str3;
                    i17 = i34;
                    str5 = str2;
                }
                str = str;
                str2 = str5;
                i34 = i17 + 1;
                str3 = str4;
                i20 = i13;
            }
            i16 = 0;
            iK = e3.c.k((int) (i33 + j8), 0, i9 - i24);
        }
        int i37 = i24 + iK;
        if (i37 < 0) {
            i37 = i16;
        }
        int iMax4 = Math.max(i37, i7);
        int iMax5 = Math.max(iMax, Math.max(i8, i16));
        int i38 = i15;
        int[] iArr5 = new int[i38];
        for (int i39 = i16; i39 < i38; i39++) {
            iArr5[i39] = i16;
        }
        b0Var.g(iMax4, iArr4, iArr5, interfaceC2175J);
        return b0Var.f(sArr, interfaceC2175J, iArr5, iMax4, iMax5, iArr, i14, i12, i13);
    }

    public static final long h(long j7) {
        return q0.c.a(T0.a.j(j7), T0.a.h(j7), T0.a.i(j7), T0.a.g(j7));
    }

    public static final T i(C0782a c0782a) {
        return new T(c0782a.a, c0782a.f11200b, c0782a.f11201c, c0782a.f11202d);
    }

    public static final void j(String str, StringBuilder sb) {
        if (sb.length() > 0) {
            sb.append('+');
        }
        sb.append(str);
    }

    public abstract int b(int i7, T0.k kVar);
}
