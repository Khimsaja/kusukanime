package q2;

import B1.B;
import java.io.EOFException;
import y1.E;

/* loaded from: classes.dex */
public final class g {
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public long f14699b;

    /* renamed from: c, reason: collision with root package name */
    public int f14700c;

    /* renamed from: d, reason: collision with root package name */
    public int f14701d;

    /* renamed from: e, reason: collision with root package name */
    public int f14702e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f14703f = new int[255];

    /* renamed from: g, reason: collision with root package name */
    public final B f14704g = new B(255);

    public final boolean a(V1.k kVar, boolean z7) throws E, EOFException {
        boolean zH;
        boolean zH2;
        this.a = 0;
        this.f14699b = 0L;
        this.f14700c = 0;
        this.f14701d = 0;
        this.f14702e = 0;
        B b4 = this.f14704g;
        b4.C(27);
        try {
            zH = kVar.h(b4.a, 0, 27, z7);
        } catch (EOFException e7) {
            if (!z7) {
                throw e7;
            }
            zH = false;
        }
        if (zH && b4.v() == 1332176723) {
            if (b4.t() == 0) {
                this.a = b4.t();
                this.f14699b = b4.j();
                b4.k();
                b4.k();
                b4.k();
                int iT = b4.t();
                this.f14700c = iT;
                this.f14701d = iT + 27;
                b4.C(iT);
                try {
                    zH2 = kVar.h(b4.a, 0, this.f14700c, z7);
                } catch (EOFException e8) {
                    if (!z7) {
                        throw e8;
                    }
                    zH2 = false;
                }
                if (zH2) {
                    for (int i7 = 0; i7 < this.f14700c; i7++) {
                        int iT2 = b4.t();
                        this.f14703f[i7] = iT2;
                        this.f14702e += iT2;
                    }
                    return true;
                }
            } else if (!z7) {
                throw E.b("unsupported bit stream revision");
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        if (r13 == (-1)) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
    
        if (r12.f9392n >= r13) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004e, code lost:
    
        r0 = java.lang.Math.min(r12.f9395q, 1);
        r12.r(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0057, code lost:
    
        if (r0 != 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0059, code lost:
    
        r6 = r12.f9389k;
        r5 = r12;
        r0 = r5.q(r6, 0, java.lang.Math.min(1, r6.length), 0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0069, code lost:
    
        r5 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006b, code lost:
    
        if (r0 == (-1)) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006d, code lost:
    
        r5.f9392n += r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0074, code lost:
    
        if (r0 == (-1)) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0076, code lost:
    
        r12 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0078, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(V1.k r12, long r13) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            r11 = this;
            long r0 = r12.f9392n
            long r2 = r12.i()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 != 0) goto Le
            r0 = r2
            goto Lf
        Le:
            r0 = r1
        Lf:
            B1.AbstractC0015b.c(r0)
            B1.B r0 = r11.f14704g
            r3 = 4
            r0.C(r3)
        L18:
            r4 = -1
            int r4 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r4 == 0) goto L27
            long r5 = r12.f9392n
            r7 = 4
            long r5 = r5 + r7
            int r5 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r5 >= 0) goto L46
        L27:
            byte[] r5 = r0.a
            boolean r5 = r12.h(r5, r1, r3, r2)     // Catch: java.io.EOFException -> L2e
            goto L2f
        L2e:
            r5 = r1
        L2f:
            if (r5 == 0) goto L46
            r0.F(r1)
            long r4 = r0.v()
            r6 = 1332176723(0x4f676753, double:6.58182753E-315)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L42
            r12.f9394p = r1
            return r2
        L42:
            r12.f(r2)
            goto L18
        L46:
            if (r4 == 0) goto L4e
            long r5 = r12.f9392n
            int r0 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r0 >= 0) goto L78
        L4e:
            int r0 = r12.f9395q
            int r0 = java.lang.Math.min(r0, r2)
            r12.r(r0)
            if (r0 != 0) goto L69
            byte[] r6 = r12.f9389k
            int r0 = r6.length
            int r8 = java.lang.Math.min(r2, r0)
            r10 = 1
            r7 = 0
            r9 = 0
            r5 = r12
            int r0 = r5.q(r6, r7, r8, r9, r10)
            goto L6a
        L69:
            r5 = r12
        L6a:
            r12 = -1
            if (r0 == r12) goto L73
            long r6 = r5.f9392n
            long r8 = (long) r0
            long r6 = r6 + r8
            r5.f9392n = r6
        L73:
            r12 = -1
            if (r0 == r12) goto L78
            r12 = r5
            goto L46
        L78:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: q2.g.b(V1.k, long):boolean");
    }
}
