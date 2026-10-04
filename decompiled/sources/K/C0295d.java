package K;

import L.Y;
import L.Z;
import P3.F;
import b1.AbstractC0703b;
import e5.AbstractC0832b;
import h0.C0998u;
import j0.C1296b;
import j0.InterfaceC1298d;
import m.C1504y;
import p.C1743c;
import y0.C2351F;

/* renamed from: K.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0295d extends w {

    /* renamed from: H, reason: collision with root package name */
    public final C1504y f4375H;

    public C0295d(u.j jVar, boolean z7, float f5, Y y7, Z z8) {
        super(jVar, z7, f5, y7, z8);
        this.f4375H = new C1504y();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
    @Override // K.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G0(u.m r19, long r20, float r22) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            m.y r2 = r0.f4375H
            java.lang.Object[] r3 = r2.f12940b
            java.lang.Object[] r4 = r2.f12941c
            long[] r5 = r2.a
            int r6 = r5.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L5b
            r8 = 0
        L12:
            r9 = r5[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L56
            int r11 = r8 - r6
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = 0
        L2c:
            if (r13 >= r11) goto L54
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.32E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L50
            int r14 = r8 << 3
            int r14 = r14 + r13
            r15 = r3[r14]
            r14 = r4[r14]
            K.p r14 = (K.p) r14
            u.m r15 = (u.m) r15
            java.lang.Boolean r15 = java.lang.Boolean.TRUE
            O.g0 r7 = r14.f4410k
            r7.setValue(r15)
            O3.C r7 = O3.C.a
            H5.q r14 = r14.f4408i
            r14.F(r7)
        L50:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L2c
        L54:
            if (r11 != r12) goto L5b
        L56:
            if (r8 == r6) goto L5b
            int r8 = r8 + 1
            goto L12
        L5b:
            r3 = 0
            boolean r4 = r0.f4434y
            if (r4 == 0) goto L68
            long r5 = r1.a
            g0.c r7 = new g0.c
            r7.<init>(r5)
            goto L69
        L68:
            r7 = r3
        L69:
            K.p r5 = new K.p
            r6 = r22
            r5.<init>(r7, r6, r4)
            r2.i(r1, r5)
            H5.A r2 = r0.u0()
            K.c r4 = new K.c
            r4.<init>(r5, r0, r1, r3)
            r1 = 3
            H5.D.x(r2, r3, r4, r1)
            y0.AbstractC2359f.n(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: K.C0295d.G0(u.m, long, float):void");
    }

    @Override // K.w
    public final void H0(C2351F c2351f) {
        long[] jArr;
        Object[] objArr;
        long[] jArr2;
        Object[] objArr2;
        int i7;
        C0295d c0295d = this;
        c0295d.f4427B.invoke();
        float f5 = 0.1f;
        if (0.1f == 0.0f) {
            return;
        }
        C1504y c1504y = c0295d.f4375H;
        Object[] objArr3 = c1504y.f12940b;
        Object[] objArr4 = c1504y.f12941c;
        long[] jArr3 = c1504y.a;
        int length = jArr3.length - 2;
        if (length < 0) {
            return;
        }
        int i8 = 0;
        while (true) {
            long j7 = jArr3[i8];
            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i9 = 8;
                int i10 = 8 - ((~(i8 - length)) >>> 31);
                int i11 = 0;
                while (i11 < i10) {
                    if ((255 & j7) < 128) {
                        int i12 = (i8 << 3) + i11;
                        Object obj = objArr3[i12];
                        p pVar = (p) objArr4[i12];
                        long jB = C0998u.b(f5, c0295d.f4426A.a());
                        Float f7 = pVar.f4403d;
                        i7 = i9;
                        C1296b c1296b = c2351f.f17696k;
                        if (f7 == null) {
                            long jD = c1296b.d();
                            float f8 = q.a;
                            jArr2 = jArr3;
                            pVar.f4403d = Float.valueOf(Math.max(g0.f.d(jD), g0.f.b(jD)) * 0.3f);
                        } else {
                            jArr2 = jArr3;
                        }
                        if (pVar.a == null) {
                            pVar.a = new g0.c(c1296b.V());
                        }
                        if (pVar.f4404e == null) {
                            pVar.f4404e = new g0.c(AbstractC0832b.e(g0.f.d(c1296b.d()) / 2.0f, g0.f.b(c1296b.d()) / 2.0f));
                        }
                        float fFloatValue = (!((Boolean) pVar.f4410k.getValue()).booleanValue() || ((Boolean) pVar.f4409j.getValue()).booleanValue()) ? ((Number) pVar.f4405f.d()).floatValue() : 1.0f;
                        Float f9 = pVar.f4403d;
                        kotlin.jvm.internal.l.c(f9);
                        float f10 = fFloatValue;
                        float fG = F.G(f9.floatValue(), pVar.f4401b, ((Number) pVar.f4406g.d()).floatValue());
                        g0.c cVar = pVar.a;
                        kotlin.jvm.internal.l.c(cVar);
                        float fD = g0.c.d(cVar.a);
                        g0.c cVar2 = pVar.f4404e;
                        kotlin.jvm.internal.l.c(cVar2);
                        float fD2 = g0.c.d(cVar2.a);
                        C1743c c1743c = pVar.f4407h;
                        float fG2 = F.G(fD, fD2, ((Number) c1743c.d()).floatValue());
                        g0.c cVar3 = pVar.a;
                        kotlin.jvm.internal.l.c(cVar3);
                        float fE = g0.c.e(cVar3.a);
                        g0.c cVar4 = pVar.f4404e;
                        kotlin.jvm.internal.l.c(cVar4);
                        objArr2 = objArr3;
                        long jE = AbstractC0832b.e(fG2, F.G(fE, g0.c.e(cVar4.a), ((Number) c1743c.d()).floatValue()));
                        long jB2 = C0998u.b(C0998u.d(jB) * f10, jB);
                        if (pVar.f4402c) {
                            float fD3 = g0.f.d(c1296b.d());
                            float fB = g0.f.b(c1296b.d());
                            B2.l lVar = c1296b.f12205l;
                            long jA = lVar.A();
                            lVar.t().l();
                            try {
                                ((B2.l) ((X4.y) lVar.f416l).f9916l).t().e(0.0f, 0.0f, fD3, fB, 1);
                                InterfaceC1298d.u(c2351f, jB2, fG, jE, 120);
                            } finally {
                                AbstractC0703b.y(lVar, jA);
                            }
                        } else {
                            InterfaceC1298d.u(c2351f, jB2, fG, jE, 120);
                        }
                    } else {
                        jArr2 = jArr3;
                        objArr2 = objArr3;
                        i7 = i9;
                    }
                    j7 >>= i7;
                    i11++;
                    c0295d = this;
                    i9 = i7;
                    jArr3 = jArr2;
                    objArr3 = objArr2;
                    f5 = 0.1f;
                }
                jArr = jArr3;
                objArr = objArr3;
                if (i10 != i9) {
                    return;
                }
            } else {
                jArr = jArr3;
                objArr = objArr3;
            }
            if (i8 == length) {
                return;
            }
            i8++;
            c0295d = this;
            jArr3 = jArr;
            objArr3 = objArr;
            f5 = 0.1f;
        }
    }

    @Override // K.w
    public final void J0(u.m mVar) {
        p pVar = (p) this.f4375H.e(mVar);
        if (pVar != null) {
            pVar.f4410k.setValue(Boolean.TRUE);
            pVar.f4408i.F(O3.C.a);
        }
    }

    @Override // a0.p
    public final void z0() {
        this.f4375H.a();
    }
}
