package D3;

import A3.C0006a;
import H0.I;
import L.AbstractC0384j0;
import L.E0;
import L.H2;
import L.M2;
import L.N;
import L.N2;
import L.P;
import L.q2;
import O.C0486d;
import O.C0509o0;
import O.C0510p;
import O.InterfaceC0501k0;
import O.S0;
import O3.C;
import b1.AbstractC0703b;
import io.ktor.utils.io.ByteChannelKt;
import n0.C1538e;
import v.AbstractC2123b;
import v.AbstractC2130i;
import v.C2140t;
import v.e0;
import v.f0;
import v.g0;
import v.h0;
import y0.C2361h;
import y0.C2362i;
import y0.C2363j;
import y0.InterfaceC2364k;
import z5.AbstractC2510o;

/* loaded from: classes.dex */
public abstract class t {
    public static final C.d a = C.e.b(20);

    /* renamed from: b, reason: collision with root package name */
    public static final float f1503b = 56;

    public static final void a(int i7, C0510p c0510p) {
        C0510p c0510p2;
        c0510p.T(-1642996412);
        if (i7 == 0 && c0510p.y()) {
            c0510p.M();
            c0510p2 = c0510p;
        } else {
            c0510p2 = c0510p;
            E0.e(androidx.compose.foundation.layout.a.l(a0.n.a, 72, 0.0f, 0.0f, 0.0f, 14), 0.0f, ((N) c0510p.k(P.a)).f5225B, c0510p2, 6, 2);
        }
        C0509o0 c0509o0S = c0510p2.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new C0006a(i7, 12);
        }
    }

    public static final void b(int i7, C0510p c0510p) {
        C0510p c0510p2;
        c0510p.T(680526891);
        if (i7 == 0 && c0510p.y()) {
            c0510p.M();
            c0510p2 = c0510p;
        } else {
            c0510p2 = c0510p;
            AbstractC0384j0.a(g.f1447h, null, androidx.compose.foundation.layout.c.j(a0.n.a, 14), ((N) c0510p.k(P.a)).f5260s, c0510p2, 438, 0);
        }
        C0509o0 c0509o0S = c0510p2.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new C0006a(i7, 13);
        }
    }

    public static final void c(final C1538e c1538e, final String str, final String str2, final a0.q qVar, final boolean z7, final long j7, final long j8, e4.o oVar, C0510p c0510p, final int i7) {
        int i8;
        C.d dVar;
        float f5;
        long j9;
        boolean z8;
        long j10;
        e4.o oVar2;
        h0 h0Var;
        boolean z9;
        C0510p c0510p2 = c0510p;
        c0510p2.T(-1459181265);
        if ((i7 & 6) == 0) {
            i8 = (c0510p2.f(c1538e) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= c0510p2.f(str) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i8 |= c0510p2.f(str2) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            i8 |= c0510p2.f(qVar) ? 2048 : 1024;
        }
        if ((i7 & 24576) == 0) {
            i8 |= c0510p2.g(z7) ? 16384 : 8192;
        }
        if ((196608 & i7) == 0) {
            i8 |= c0510p2.e(j7) ? 131072 : 65536;
        }
        if ((1572864 & i7) == 0) {
            i8 |= c0510p2.e(j8) ? ByteChannelKt.CHANNEL_MAX_SIZE : 524288;
        }
        if ((12582912 & i7) == 0) {
            i8 |= c0510p2.h(oVar) ? 8388608 : 4194304;
        }
        int i9 = i8;
        if ((i9 & 4793491) == 4793490 && c0510p2.y()) {
            c0510p2.M();
            oVar2 = oVar;
        } else {
            float f7 = 16;
            a0.q qVarI = androidx.compose.foundation.layout.a.i(androidx.compose.foundation.layout.c.g(androidx.compose.foundation.layout.c.d(qVar, 1.0f), f1503b, 0.0f, 2), f7, 8);
            f0 f0VarB = e0.b(AbstractC2130i.a, a0.b.f10391u, c0510p2, 48);
            int i10 = c0510p2.f7128P;
            InterfaceC0501k0 interfaceC0501k0M = c0510p2.m();
            a0.q qVarC = a0.a.c(c0510p2, qVarI);
            InterfaceC2364k.f17877j.getClass();
            C2362i c2362i = C2363j.f17871b;
            c0510p2.V();
            if (c0510p2.f7127O) {
                c0510p2.l(c2362i);
            } else {
                c0510p2.e0();
            }
            C2361h c2361h = C2363j.f17875f;
            C0486d.R(c0510p2, c2361h, f0VarB);
            C2361h c2361h2 = C2363j.f17874e;
            C0486d.R(c0510p2, c2361h2, interfaceC0501k0M);
            C2361h c2361h3 = C2363j.f17876g;
            if (c0510p2.f7127O || !kotlin.jvm.internal.l.a(c0510p2.H(), Integer.valueOf(i10))) {
                AbstractC0703b.u(i10, c0510p2, i10, c2361h3);
            }
            C2361h c2361h4 = C2363j.f17873d;
            C0486d.R(c0510p2, c2361h4, qVarC);
            h0 h0Var2 = h0.a;
            C.d dVarB = C.e.b(12);
            if (z7) {
                c0510p2.R(-1504868217);
                dVar = dVarB;
                f5 = f7;
                j9 = ((N) c0510p2.k(P.a)).f5230G;
                c0510p2.p(false);
            } else {
                dVar = dVarB;
                f5 = f7;
                c0510p2.R(-1504866170);
                j9 = ((N) c0510p2.k(P.a)).I;
                c0510p2.p(false);
            }
            a0.n nVar = a0.n.a;
            q2.a(androidx.compose.foundation.layout.c.j(nVar, 40), dVar, j9, 0L, 0.0f, 0.0f, W.f.b(326191982, new e4.n() { // from class: D3.r
                @Override // e4.n
                public final Object invoke(Object obj, Object obj2) {
                    long j11;
                    C0510p c0510p3 = (C0510p) obj;
                    if ((((Integer) obj2).intValue() & 3) == 2 && c0510p3.y()) {
                        c0510p3.M();
                    } else {
                        if (z7) {
                            c0510p3.R(-62114026);
                            c0510p3.p(false);
                            j11 = j8;
                        } else {
                            c0510p3.R(-62112738);
                            long j12 = ((N) c0510p3.k(P.a)).f5260s;
                            c0510p3.p(false);
                            j11 = j12;
                        }
                        AbstractC0384j0.a(c1538e, null, androidx.compose.foundation.layout.a.h(a0.n.a, 9), j11, c0510p3, 432, 0);
                    }
                    return C.a;
                }
            }, c0510p2), c0510p, 12582918, 120);
            AbstractC2123b.a(c0510p, androidx.compose.foundation.layout.c.n(f5));
            a0.q qVarA = h0Var2.a(nVar);
            C2140t c2140tA = v.r.a(AbstractC2130i.f16445c, a0.b.f10393w, c0510p, 0);
            int i11 = c0510p.f7128P;
            InterfaceC0501k0 interfaceC0501k0M2 = c0510p.m();
            a0.q qVarC2 = a0.a.c(c0510p, qVarA);
            c0510p.V();
            if (c0510p.f7127O) {
                c0510p.l(c2362i);
            } else {
                c0510p.e0();
            }
            C0486d.R(c0510p, c2361h, c2140tA);
            C0486d.R(c0510p, c2361h2, interfaceC0501k0M2);
            if (c0510p.f7127O || !kotlin.jvm.internal.l.a(c0510p.H(), Integer.valueOf(i11))) {
                AbstractC0703b.u(i11, c0510p, i11, c2361h3);
            }
            C0486d.R(c0510p, c2361h4, qVarC2);
            S0 s02 = N2.a;
            I i12 = ((M2) c0510p.k(s02)).f5218j;
            if (z7) {
                c0510p.R(464216019);
                c0510p.p(false);
                j10 = j7;
                z8 = false;
            } else {
                c0510p.R(464217369);
                long j11 = ((N) c0510p.k(P.a)).f5260s;
                z8 = false;
                c0510p.p(false);
                j10 = j11;
            }
            H2.b(str, null, j10, 0L, null, 0L, null, 0L, 2, false, 1, 0, i12, c0510p, (i9 >> 3) & 14, 3120, 55290);
            c0510p2 = c0510p;
            if (str2 == null || AbstractC2510o.g0(str2)) {
                oVar2 = oVar;
                h0Var = h0Var2;
                z9 = z8;
                c0510p2.R(1501249049);
            } else {
                c0510p2.R(1506015237);
                I i13 = ((M2) c0510p2.k(s02)).f5220l;
                h0Var = h0Var2;
                z9 = z8;
                oVar2 = oVar;
                H2.b(str2, null, ((N) c0510p2.k(P.a)).f5260s, 0L, null, 0L, null, 0L, 2, false, 2, 0, i13, c0510p, (i9 >> 6) & 14, 3120, 55290);
                c0510p2 = c0510p;
            }
            c0510p2.p(z9);
            c0510p2.p(true);
            if (oVar2 == null) {
                c0510p2.R(594855170);
            } else {
                c0510p2.R(-1504831777);
                oVar2.invoke(h0Var, c0510p2, Integer.valueOf(((i9 >> 18) & 112) | 6));
            }
            c0510p2.p(z9);
            c0510p2.p(true);
        }
        C0509o0 c0509o0S = c0510p2.s();
        if (c0509o0S != null) {
            final e4.o oVar3 = oVar2;
            c0509o0S.f7111d = new e4.n() { // from class: D3.s
                @Override // e4.n
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    t.c(c1538e, str, str2, qVar, z7, j7, j8, oVar3, (C0510p) obj, C0486d.V(i7 | 1));
                    return C.a;
                }
            };
        }
    }

    public static final void d(String str, String str2, a0.q qVar, C0510p c0510p, int i7) {
        boolean z7;
        C0510p c0510p2 = c0510p;
        c0510p2.T(2090431459);
        int i8 = i7 | (c0510p2.f(str2) ? 32 : 16);
        if ((i8 & 147) == 146 && c0510p2.y()) {
            c0510p2.M();
        } else {
            a0.q qVarD = androidx.compose.foundation.layout.c.d(qVar, 1.0f);
            C2140t c2140tA = v.r.a(AbstractC2130i.f16445c, a0.b.f10393w, c0510p2, 0);
            int i9 = c0510p2.f7128P;
            InterfaceC0501k0 interfaceC0501k0M = c0510p2.m();
            a0.q qVarC = a0.a.c(c0510p2, qVarD);
            InterfaceC2364k.f17877j.getClass();
            C2362i c2362i = C2363j.f17871b;
            c0510p2.V();
            if (c0510p2.f7127O) {
                c0510p2.l(c2362i);
            } else {
                c0510p2.e0();
            }
            C0486d.R(c0510p2, C2363j.f17875f, c2140tA);
            C0486d.R(c0510p2, C2363j.f17874e, interfaceC0501k0M);
            C2361h c2361h = C2363j.f17876g;
            if (c0510p2.f7127O || !kotlin.jvm.internal.l.a(c0510p2.H(), Integer.valueOf(i9))) {
                AbstractC0703b.u(i9, c0510p2, i9, c2361h);
            }
            C0486d.R(c0510p2, C2363j.f17873d, qVarC);
            S0 s02 = N2.a;
            H2.b(str, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((M2) c0510p2.k(s02)).f5213e, c0510p2, 6, 0, 65534);
            c0510p2 = c0510p2;
            if (str2 == null || AbstractC2510o.g0(str2)) {
                z7 = false;
                c0510p2.R(796133513);
            } else {
                c0510p2.R(803356637);
                AbstractC2123b.a(c0510p2, androidx.compose.foundation.layout.c.j(a0.n.a, 2));
                H2.b(str2, null, ((N) c0510p2.k(P.a)).f5260s, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((M2) c0510p2.k(s02)).f5220l, c0510p, (i8 >> 3) & 14, 0, 65530);
                c0510p2 = c0510p;
                z7 = false;
            }
            c0510p2.p(z7);
            c0510p2.p(true);
        }
        C0509o0 c0509o0S = c0510p2.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new i(str, str2, qVar, i7, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(final java.lang.String r29, a0.n r30, W.a r31, W.a r32, O.C0510p r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 507
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D3.t.e(java.lang.String, a0.n, W.a, W.a, O.p, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x012e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(final n0.C1538e r19, final java.lang.String r20, final java.lang.String r21, final e4.InterfaceC0821a r22, e4.o r23, long r24, long r26, boolean r28, O.C0510p r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D3.t.f(n0.e, java.lang.String, java.lang.String, e4.a, e4.o, long, long, boolean, O.p, int, int):void");
    }

    public static final void g(final C1538e c1538e, final String str, final String str2, final boolean z7, final e4.k kVar, boolean z8, C0510p c0510p, final int i7) {
        final boolean z9;
        kotlin.jvm.internal.l.f("icon", c1538e);
        kotlin.jvm.internal.l.f("onCheckedChange", kVar);
        c0510p.T(-690857519);
        int i8 = i7 | (c0510p.f(c1538e) ? 4 : 2) | (c0510p.g(z7) ? 2048 : 1024) | (c0510p.h(kVar) ? 16384 : 8192) | 196608;
        if ((74899 & i8) == 74898 && c0510p.y()) {
            c0510p.M();
            z9 = z8;
        } else {
            a0.q qVarA = a0.a.a(a0.n.a, new B.c(z7, new F0.f(2), kVar, 0));
            S0 s02 = P.a;
            c(c1538e, str, str2, qVarA, true, ((N) c0510p.k(s02)).f5258q, ((N) c0510p.k(s02)).a, W.f.b(-1066442341, new e4.o() { // from class: D3.o
                @Override // e4.o
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    C0510p c0510p2 = (C0510p) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    kotlin.jvm.internal.l.f("$this$RowScaffold", (g0) obj);
                    if ((iIntValue & 17) == 16 && c0510p2.y()) {
                        c0510p2.M();
                    } else {
                        androidx.compose.material3.a.a(z7, null, null, c0510p2, 48);
                    }
                    return C.a;
                }
            }, c0510p), c0510p, (i8 & 14) | 12607920);
            z9 = true;
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new e4.n(str, str2, z7, kVar, z9, i7) { // from class: D3.p

                /* renamed from: l, reason: collision with root package name */
                public final /* synthetic */ String f1476l;

                /* renamed from: m, reason: collision with root package name */
                public final /* synthetic */ String f1477m;

                /* renamed from: n, reason: collision with root package name */
                public final /* synthetic */ boolean f1478n;

                /* renamed from: o, reason: collision with root package name */
                public final /* synthetic */ e4.k f1479o;

                /* renamed from: p, reason: collision with root package name */
                public final /* synthetic */ boolean f1480p;

                @Override // e4.n
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iV = C0486d.V(433);
                    String str3 = this.f1476l;
                    e4.k kVar2 = this.f1479o;
                    boolean z10 = this.f1480p;
                    t.g(this.f1475k, str3, this.f1477m, this.f1478n, kVar2, z10, (C0510p) obj, iV);
                    return C.a;
                }
            };
        }
    }
}
