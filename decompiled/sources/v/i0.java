package v;

import D.L0;
import w0.InterfaceC2172G;
import w0.InterfaceC2174I;
import w0.InterfaceC2175J;
import y0.InterfaceC2375w;

/* loaded from: classes.dex */
public final class i0 extends a0.p implements InterfaceC2375w {

    /* renamed from: A, reason: collision with root package name */
    public float f16448A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f16449B;

    /* renamed from: x, reason: collision with root package name */
    public float f16450x;

    /* renamed from: y, reason: collision with root package name */
    public float f16451y;

    /* renamed from: z, reason: collision with root package name */
    public float f16452z;

    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long G0(w0.InterfaceC2197o r8) {
        /*
            r7 = this;
            float r0 = r7.f16452z
            r1 = 2143289344(0x7fc00000, float:NaN)
            boolean r0 = T0.e.a(r0, r1)
            r2 = 2147483647(0x7fffffff, float:NaN)
            r3 = 0
            if (r0 != 0) goto L18
            float r0 = r7.f16452z
            int r0 = r8.O(r0)
            if (r0 >= 0) goto L19
            r0 = r3
            goto L19
        L18:
            r0 = r2
        L19:
            float r4 = r7.f16448A
            boolean r4 = T0.e.a(r4, r1)
            if (r4 != 0) goto L2b
            float r4 = r7.f16448A
            int r4 = r8.O(r4)
            if (r4 >= 0) goto L2c
            r4 = r3
            goto L2c
        L2b:
            r4 = r2
        L2c:
            float r5 = r7.f16450x
            boolean r5 = T0.e.a(r5, r1)
            if (r5 != 0) goto L43
            float r5 = r7.f16450x
            int r5 = r8.O(r5)
            if (r5 <= r0) goto L3d
            r5 = r0
        L3d:
            if (r5 >= 0) goto L40
            r5 = r3
        L40:
            if (r5 == r2) goto L43
            goto L44
        L43:
            r5 = r3
        L44:
            float r6 = r7.f16451y
            boolean r1 = T0.e.a(r6, r1)
            if (r1 != 0) goto L5b
            float r1 = r7.f16451y
            int r8 = r8.O(r1)
            if (r8 <= r4) goto L55
            r8 = r4
        L55:
            if (r8 >= 0) goto L58
            r8 = r3
        L58:
            if (r8 == r2) goto L5b
            r3 = r8
        L5b:
            long r0 = q0.c.a(r5, r0, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: v.i0.G0(w0.o):long");
    }

    @Override // y0.InterfaceC2375w
    public final int b(y0.N n7, InterfaceC2172G interfaceC2172G, int i7) {
        long jG0 = G0(n7);
        return T0.a.f(jG0) ? T0.a.h(jG0) : q0.c.v(interfaceC2172G.W(i7), jG0);
    }

    @Override // y0.InterfaceC2375w
    public final int c(y0.N n7, InterfaceC2172G interfaceC2172G, int i7) {
        long jG0 = G0(n7);
        return T0.a.e(jG0) ? T0.a.g(jG0) : q0.c.u(interfaceC2172G.c(i7), jG0);
    }

    @Override // y0.InterfaceC2375w
    public final InterfaceC2174I e(InterfaceC2175J interfaceC2175J, InterfaceC2172G interfaceC2172G, long j7) {
        int iJ;
        int iH;
        int i7;
        int iG;
        long jA;
        long jG0 = G0(interfaceC2175J);
        if (this.f16449B) {
            jA = q0.c.t(j7, jG0);
        } else {
            if (T0.e.a(this.f16450x, Float.NaN)) {
                iJ = T0.a.j(j7);
                int iH2 = T0.a.h(jG0);
                if (iJ > iH2) {
                    iJ = iH2;
                }
            } else {
                iJ = T0.a.j(jG0);
            }
            if (T0.e.a(this.f16452z, Float.NaN)) {
                iH = T0.a.h(j7);
                int iJ2 = T0.a.j(jG0);
                if (iH < iJ2) {
                    iH = iJ2;
                }
            } else {
                iH = T0.a.h(jG0);
            }
            if (T0.e.a(this.f16451y, Float.NaN)) {
                i7 = T0.a.i(j7);
                int iG2 = T0.a.g(jG0);
                if (i7 > iG2) {
                    i7 = iG2;
                }
            } else {
                i7 = T0.a.i(jG0);
            }
            if (T0.e.a(this.f16448A, Float.NaN)) {
                iG = T0.a.g(j7);
                int i8 = T0.a.i(jG0);
                if (iG < i8) {
                    iG = i8;
                }
            } else {
                iG = T0.a.g(jG0);
            }
            jA = q0.c.a(iJ, iH, i7, iG);
        }
        w0.S sB = interfaceC2172G.b(jA);
        return interfaceC2175J.T(sB.f16840k, sB.f16841l, P3.z.f7780k, new L0(sB, 12));
    }

    @Override // y0.InterfaceC2375w
    public final int g(y0.N n7, InterfaceC2172G interfaceC2172G, int i7) {
        long jG0 = G0(n7);
        return T0.a.e(jG0) ? T0.a.g(jG0) : q0.c.u(interfaceC2172G.b0(i7), jG0);
    }

    @Override // y0.InterfaceC2375w
    public final int i(y0.N n7, InterfaceC2172G interfaceC2172G, int i7) {
        long jG0 = G0(n7);
        return T0.a.f(jG0) ? T0.a.h(jG0) : q0.c.v(interfaceC2172G.Y(i7), jG0);
    }
}
