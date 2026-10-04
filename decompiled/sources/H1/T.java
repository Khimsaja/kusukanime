package H1;

import B1.AbstractC0015b;
import D6.RunnableC0121o;
import android.util.Pair;
import java.util.ArrayList;
import y1.C2380b;

/* loaded from: classes.dex */
public final class T {

    /* renamed from: c, reason: collision with root package name */
    public final I1.f f3368c;

    /* renamed from: d, reason: collision with root package name */
    public final B1.F f3369d;

    /* renamed from: e, reason: collision with root package name */
    public final C2.G f3370e;

    /* renamed from: f, reason: collision with root package name */
    public long f3371f;

    /* renamed from: g, reason: collision with root package name */
    public int f3372g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3373h;

    /* renamed from: i, reason: collision with root package name */
    public Q f3374i;

    /* renamed from: j, reason: collision with root package name */
    public Q f3375j;

    /* renamed from: k, reason: collision with root package name */
    public Q f3376k;

    /* renamed from: l, reason: collision with root package name */
    public Q f3377l;

    /* renamed from: m, reason: collision with root package name */
    public Q f3378m;

    /* renamed from: n, reason: collision with root package name */
    public int f3379n;

    /* renamed from: o, reason: collision with root package name */
    public Object f3380o;

    /* renamed from: p, reason: collision with root package name */
    public long f3381p;
    public final y1.N a = new y1.N();

    /* renamed from: b, reason: collision with root package name */
    public final y1.O f3367b = new y1.O();

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f3382q = new ArrayList();

    public T(I1.f fVar, B1.F f5, C2.G g4, C0237s c0237s) {
        this.f3368c = fVar;
        this.f3369d = f5;
        this.f3370e = g4;
    }

    public static O1.B n(y1.P p7, Object obj, long j7, long j8, y1.O o7, y1.N n7) {
        p7.g(obj, n7);
        p7.n(n7.f17948c, o7);
        p7.b(obj);
        int i7 = n7.f17952g.a;
        if (i7 != 0) {
            if (i7 == 1) {
                n7.f(0);
            }
            n7.f17952g.getClass();
            n7.g(0);
        }
        p7.g(obj, n7);
        int iC = n7.c(j7);
        return iC == -1 ? new O1.B(n7.b(j7), j8, obj) : new O1.B(obj, iC, n7.e(iC), j8, -1);
    }

    public final Q a() {
        Q q6 = this.f3374i;
        if (q6 == null) {
            return null;
        }
        if (q6 == this.f3375j) {
            this.f3375j = q6.f3354m;
        }
        if (q6 == this.f3376k) {
            this.f3376k = q6.f3354m;
        }
        q6.i();
        int i7 = this.f3379n - 1;
        this.f3379n = i7;
        if (i7 == 0) {
            this.f3377l = null;
            Q q7 = this.f3374i;
            this.f3380o = q7.f3343b;
            this.f3381p = q7.f3348g.a.f7254d;
        }
        this.f3374i = this.f3374i.f3354m;
        k();
        return this.f3374i;
    }

    public final void b() {
        if (this.f3379n == 0) {
            return;
        }
        Q q6 = this.f3374i;
        AbstractC0015b.i(q6);
        this.f3380o = q6.f3343b;
        this.f3381p = q6.f3348g.a.f7254d;
        while (q6 != null) {
            q6.i();
            q6 = q6.f3354m;
        }
        this.f3374i = null;
        this.f3377l = null;
        this.f3375j = null;
        this.f3376k = null;
        this.f3379n = 0;
        k();
    }

    public final S c(y1.P p7, Q q6, long j7) {
        y1.P p8;
        long j8;
        y1.N n7;
        Object obj;
        long j9;
        long j10;
        long j11;
        long jP;
        S s7 = q6.f3348g;
        long j12 = (q6.f3357p + s7.f3361e) - j7;
        if (s7.f3364h) {
            S s8 = q6.f3348g;
            O1.B b4 = s8.a;
            int iD = p7.d(p7.b(b4.a), this.a, this.f3367b, this.f3372g, this.f3373h);
            if (iD != -1) {
                y1.N n8 = this.a;
                int i7 = p7.f(iD, n8, true).f17948c;
                Object obj2 = n8.f17947b;
                obj2.getClass();
                long j13 = b4.f7254d;
                if (p7.m(i7, this.f3367b, 0L).f17966m == iD) {
                    Pair pairJ = p7.j(this.f3367b, this.a, i7, -9223372036854775807L, Math.max(0L, j12));
                    if (pairJ != null) {
                        Object obj3 = pairJ.first;
                        long jLongValue = ((Long) pairJ.second).longValue();
                        Q q7 = q6.f3354m;
                        if (q7 == null || !q7.f3343b.equals(obj3)) {
                            jP = p(obj3);
                            if (jP == -1) {
                                jP = this.f3371f;
                                this.f3371f = 1 + jP;
                            }
                        } else {
                            jP = q7.f3348g.a.f7254d;
                        }
                        obj = obj3;
                        j9 = jLongValue;
                        j11 = jP;
                        j10 = -9223372036854775807L;
                    }
                } else {
                    obj = obj2;
                    j9 = 0;
                    j10 = 0;
                    j11 = j13;
                }
                O1.B bN = n(p7, obj, j9, j11, this.f3367b, this.a);
                if (j10 != -9223372036854775807L && s8.f3359c != -9223372036854775807L) {
                    int i8 = p7.g(b4.a, n8).f17952g.a;
                    n8.f17952g.getClass();
                    if (i8 > 0) {
                        n8.g(0);
                    }
                }
                return d(p7, bN, j10, j9);
            }
            return null;
        }
        O1.B b7 = s7.a;
        Object obj4 = b7.a;
        y1.N n9 = this.a;
        p7.g(obj4, n9);
        boolean zB = b7.b();
        Object obj5 = b7.a;
        boolean z7 = s7.f3363g;
        if (!zB) {
            int i9 = b7.f7255e;
            if (i9 != -1) {
                n9.f(i9);
            }
            int iE = n9.e(i9);
            n9.g(i9);
            if (iE != n9.f17952g.a(i9).a) {
                return e(p7, b7.a, b7.f7255e, iE, s7.f3361e, b7.f7254d, z7);
            }
            p7.g(obj5, n9);
            n9.d(i9);
            n9.f17952g.a(i9).getClass();
            return f(p7, b7.a, 0L, s7.f3361e, b7.f7254d, false);
        }
        C2380b c2380b = n9.f17952g;
        int i10 = b7.f7252b;
        int i11 = c2380b.a(i10).a;
        if (i11 == -1) {
            return null;
        }
        int iA = n9.f17952g.a(i10).a(b7.f7253c);
        if (iA < i11) {
            return e(p7, b7.a, i10, iA, s7.f3359c, b7.f7254d, z7);
        }
        long jLongValue2 = s7.f3359c;
        if (jLongValue2 == -9223372036854775807L) {
            int i12 = n9.f17948c;
            long jMax = Math.max(0L, j12);
            j8 = 0;
            n7 = n9;
            p8 = p7;
            Pair pairJ2 = p8.j(this.f3367b, n7, i12, -9223372036854775807L, jMax);
            if (pairJ2 == null) {
                return null;
            }
            jLongValue2 = ((Long) pairJ2.second).longValue();
        } else {
            p8 = p7;
            j8 = 0;
            n7 = n9;
        }
        p8.g(obj5, n7);
        int i13 = b7.f7252b;
        n7.d(i13);
        n7.f17952g.a(i13).getClass();
        return f(p8, b7.a, Math.max(j8, jLongValue2), s7.f3359c, b7.f7254d, z7);
    }

    public final S d(y1.P p7, O1.B b4, long j7, long j8) {
        p7.g(b4.a, this.a);
        if (b4.b()) {
            return e(p7, b4.a, b4.f7252b, b4.f7253c, j7, b4.f7254d, false);
        }
        return f(p7, b4.a, j8, j7, b4.f7254d, false);
    }

    public final S e(y1.P p7, Object obj, int i7, int i8, long j7, long j8, boolean z7) {
        O1.B b4 = new O1.B(obj, i7, i8, j8, -1);
        y1.N n7 = this.a;
        long jA = p7.g(obj, n7).a(i7, i8);
        if (i8 == n7.e(i7)) {
            n7.f17952g.getClass();
        }
        n7.g(i7);
        long jMax = 0;
        if (jA != -9223372036854775807L && 0 >= jA) {
            jMax = Math.max(0L, jA - 1);
        }
        return new S(b4, jMax, j7, -9223372036854775807L, jA, z7, false, false, false, false);
    }

    public final S f(y1.P p7, Object obj, long j7, long j8, long j9, boolean z7) {
        long j10;
        y1.N n7 = this.a;
        p7.g(obj, n7);
        int iB = n7.b(j7);
        if (iB != -1) {
            n7.f(iB);
        }
        boolean z8 = false;
        if (iB != -1) {
            n7.g(iB);
        } else if (n7.f17952g.a > 0) {
            n7.g(0);
        }
        O1.B b4 = new O1.B(iB, j9, obj);
        if (!b4.b() && iB == -1) {
            z8 = true;
        }
        boolean zI = i(p7, b4);
        boolean zH = h(p7, b4, z8);
        if (iB != -1) {
            n7.g(iB);
        }
        if (iB != -1) {
            n7.d(iB);
            j10 = 0;
        } else {
            j10 = -9223372036854775807L;
        }
        long j11 = (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? n7.f17949d : j10;
        return new S(b4, (j11 == -9223372036854775807L || j7 < j11) ? j7 : Math.max(0L, j11 - 1), j8, j10, j11, z7, false, z8, zI, zH);
    }

    public final S g(y1.P p7, S s7) {
        long j7;
        O1.B b4 = s7.a;
        boolean zB = b4.b();
        int i7 = b4.f7255e;
        boolean z7 = !zB && i7 == -1;
        boolean zI = i(p7, b4);
        boolean zH = h(p7, b4, z7);
        Object obj = b4.a;
        y1.N n7 = this.a;
        p7.g(obj, n7);
        if (b4.b() || i7 == -1) {
            j7 = -9223372036854775807L;
        } else {
            n7.d(i7);
            j7 = 0;
        }
        boolean zB2 = b4.b();
        int i8 = b4.f7252b;
        long jA = zB2 ? n7.a(i8, b4.f7253c) : (j7 == -9223372036854775807L || j7 == Long.MIN_VALUE) ? n7.f17949d : j7;
        if (b4.b()) {
            n7.g(i8);
        } else if (i7 != -1) {
            n7.g(i7);
        }
        return new S(b4, s7.f3358b, s7.f3359c, j7, jA, s7.f3362f, false, z7, zI, zH);
    }

    public final boolean h(y1.P p7, O1.B b4, boolean z7) {
        int iB = p7.b(b4.a);
        if (!p7.m(p7.f(iB, this.a, false).f17948c, this.f3367b, 0L).f17961h) {
            if (p7.d(iB, this.a, this.f3367b, this.f3372g, this.f3373h) == -1 && z7) {
                return true;
            }
        }
        return false;
    }

    public final boolean i(y1.P p7, O1.B b4) {
        if (!b4.b() && b4.f7255e == -1) {
            Object obj = b4.a;
            if (p7.m(p7.g(obj, this.a).f17948c, this.f3367b, 0L).f17967n == p7.b(obj)) {
                return true;
            }
        }
        return false;
    }

    public final void j() {
        Q q6 = this.f3378m;
        if (q6 == null || q6.h()) {
            this.f3378m = null;
            for (int i7 = 0; i7 < this.f3382q.size(); i7++) {
                Q q7 = (Q) this.f3382q.get(i7);
                if (!q7.h()) {
                    this.f3378m = q7;
                    return;
                }
            }
        }
    }

    public final void k() {
        j3.D dR = j3.G.r();
        for (Q q6 = this.f3374i; q6 != null; q6 = q6.f3354m) {
            dR.a(q6.f3348g.a);
        }
        Q q7 = this.f3375j;
        this.f3369d.c(new RunnableC0121o(this, dR, q7 == null ? null : q7.f3348g.a, 3));
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [O1.b0, java.lang.Object] */
    public final void l(long j7) {
        Q q6 = this.f3377l;
        if (q6 != null) {
            AbstractC0015b.h(q6.f3354m == null);
            if (q6.f3346e) {
                q6.a.t(j7 - q6.f3357p);
            }
        }
    }

    public final int m(Q q6) {
        AbstractC0015b.i(q6);
        int i7 = 0;
        if (q6.equals(this.f3377l)) {
            return 0;
        }
        this.f3377l = q6;
        while (true) {
            q6 = q6.f3354m;
            if (q6 == null) {
                break;
            }
            if (q6 == this.f3375j) {
                Q q7 = this.f3374i;
                this.f3375j = q7;
                this.f3376k = q7;
                i7 = 3;
            }
            if (q6 == this.f3376k) {
                this.f3376k = this.f3375j;
                i7 |= 2;
            }
            q6.i();
            this.f3379n--;
        }
        Q q8 = this.f3377l;
        q8.getClass();
        if (q8.f3354m != null) {
            q8.b();
            q8.f3354m = null;
            q8.c();
        }
        k();
        return i7;
    }

    public final O1.B o(y1.P p7, Object obj, long j7) {
        long jP;
        int iB;
        Object obj2 = obj;
        y1.N n7 = this.a;
        int i7 = p7.g(obj2, n7).f17948c;
        Object obj3 = this.f3380o;
        if (obj3 == null || (iB = p7.b(obj3)) == -1 || p7.f(iB, n7, false).f17948c != i7) {
            Q q6 = this.f3374i;
            while (true) {
                if (q6 == null) {
                    Q q7 = this.f3374i;
                    while (true) {
                        if (q7 != null) {
                            int iB2 = p7.b(q7.f3343b);
                            if (iB2 != -1 && p7.f(iB2, n7, false).f17948c == i7) {
                                jP = q7.f3348g.a.f7254d;
                                break;
                            }
                            q7 = q7.f3354m;
                        } else {
                            jP = p(obj2);
                            if (jP == -1) {
                                jP = this.f3371f;
                                this.f3371f = 1 + jP;
                                if (this.f3374i == null) {
                                    this.f3380o = obj2;
                                    this.f3381p = jP;
                                }
                            }
                        }
                    }
                } else {
                    if (q6.f3343b.equals(obj2)) {
                        jP = q6.f3348g.a.f7254d;
                        break;
                    }
                    q6 = q6.f3354m;
                }
            }
        } else {
            jP = this.f3381p;
        }
        p7.g(obj2, n7);
        int i8 = n7.f17948c;
        y1.O o7 = this.f3367b;
        p7.n(i8, o7);
        boolean z7 = false;
        for (int iB3 = p7.b(obj); iB3 >= o7.f17966m; iB3--) {
            p7.f(iB3, n7, true);
            boolean z8 = n7.f17952g.a > 0;
            z7 |= z8;
            if (n7.c(n7.f17949d) != -1) {
                obj2 = n7.f17947b;
                obj2.getClass();
            }
            if (z7 && (!z8 || n7.f17949d != 0)) {
                break;
            }
        }
        return n(p7, obj2, j7, jP, this.f3367b, this.a);
    }

    public final long p(Object obj) {
        for (int i7 = 0; i7 < this.f3382q.size(); i7++) {
            Q q6 = (Q) this.f3382q.get(i7);
            if (q6.f3343b.equals(obj)) {
                return q6.f3348g.a.f7254d;
            }
        }
        return -1L;
    }

    public final int q(y1.P p7) {
        y1.P p8;
        Q q6;
        Q q7 = this.f3374i;
        if (q7 == null) {
            return 0;
        }
        int iB = p7.b(q7.f3343b);
        while (true) {
            p8 = p7;
            iB = p8.d(iB, this.a, this.f3367b, this.f3372g, this.f3373h);
            while (true) {
                q7.getClass();
                q6 = q7.f3354m;
                if (q6 == null || q7.f3348g.f3364h) {
                    break;
                }
                q7 = q6;
            }
            if (iB == -1 || q6 == null || p8.b(q6.f3343b) != iB) {
                break;
            }
            q7 = q6;
            p7 = p8;
        }
        int iM = m(q7);
        q7.f3348g = g(p8, q7.f3348g);
        return iM;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0090, code lost:
    
        return m(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int r(y1.P r14, long r15, long r17, long r19) {
        /*
            r13 = this;
            H1.Q r0 = r13.f3374i
            r1 = 0
        L3:
            r2 = 0
            if (r0 == 0) goto L91
            H1.S r3 = r0.f3348g
            if (r1 != 0) goto L10
            H1.S r1 = r13.g(r14, r3)
            r4 = r15
            goto L2a
        L10:
            r4 = r15
            H1.S r6 = r13.c(r14, r1, r4)
            if (r6 == 0) goto L8c
            long r7 = r3.f3358b
            long r9 = r6.f3358b
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 != 0) goto L8c
            O1.B r7 = r3.a
            O1.B r8 = r6.a
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L8c
            r1 = r6
        L2a:
            long r6 = r3.f3359c
            H1.S r6 = r1.a(r6)
            r0.f3348g = r6
            long r6 = r3.f3361e
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 == 0) goto L85
            long r10 = r1.f3361e
            int r1 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r1 != 0) goto L44
            goto L85
        L44:
            r0.k()
            int r14 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r14 != 0) goto L51
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L54
        L51:
            long r3 = r0.f3357p
            long r3 = r3 + r10
        L54:
            H1.Q r14 = r13.f3375j
            r1 = 1
            r5 = -9223372036854775808
            if (r0 != r14) goto L6b
            H1.S r14 = r0.f3348g
            boolean r14 = r14.f3363g
            if (r14 != 0) goto L6b
            int r14 = (r17 > r5 ? 1 : (r17 == r5 ? 0 : -1))
            if (r14 == 0) goto L69
            int r14 = (r17 > r3 ? 1 : (r17 == r3 ? 0 : -1))
            if (r14 < 0) goto L6b
        L69:
            r14 = r1
            goto L6c
        L6b:
            r14 = r2
        L6c:
            H1.Q r7 = r13.f3376k
            if (r0 != r7) goto L79
            int r5 = (r19 > r5 ? 1 : (r19 == r5 ? 0 : -1))
            if (r5 == 0) goto L78
            int r3 = (r19 > r3 ? 1 : (r19 == r3 ? 0 : -1))
            if (r3 < 0) goto L79
        L78:
            r2 = r1
        L79:
            int r0 = r13.m(r0)
            if (r0 == 0) goto L80
            return r0
        L80:
            if (r2 == 0) goto L84
            r14 = r14 | 2
        L84:
            return r14
        L85:
            H1.Q r1 = r0.f3354m
            r12 = r1
            r1 = r0
            r0 = r12
            goto L3
        L8c:
            int r14 = r13.m(r1)
            return r14
        L91:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: H1.T.r(y1.P, long, long, long):int");
    }
}
