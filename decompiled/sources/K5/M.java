package K5;

import H5.C0267h;
import H5.C0270k;
import java.util.Arrays;

/* loaded from: classes.dex */
public class M extends L5.b implements F, InterfaceC0329h, L5.q {

    /* renamed from: o, reason: collision with root package name */
    public final int f4763o;

    /* renamed from: p, reason: collision with root package name */
    public final int f4764p;

    /* renamed from: q, reason: collision with root package name */
    public final J5.c f4765q;

    /* renamed from: r, reason: collision with root package name */
    public Object[] f4766r;

    /* renamed from: s, reason: collision with root package name */
    public long f4767s;

    /* renamed from: t, reason: collision with root package name */
    public long f4768t;

    /* renamed from: u, reason: collision with root package name */
    public int f4769u;

    /* renamed from: v, reason: collision with root package name */
    public int f4770v;

    public M(int i7, int i8, J5.c cVar) {
        this.f4763o = i7;
        this.f4764p = i8;
        this.f4765q = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0081 A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:15:0x0031, B:32:0x0079, B:34:0x0081, B:38:0x0094, B:41:0x009b, B:42:0x009f, B:43:0x00a0, B:22:0x004b), top: B:52:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v1, types: [L5.b] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [K5.M] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [K5.i] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v2, types: [L5.d] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [K5.O] */
    /* JADX WARN: Type inference failed for: r9v8, types: [K5.O] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00ae -> B:16:0x0034). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void j(K5.M r8, K5.InterfaceC0330i r9, S3.c r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof K5.L
            if (r0 == 0) goto L13
            r0 = r10
            K5.L r0 = (K5.L) r0
            int r1 = r0.f4762q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4762q = r1
            goto L18
        L13:
            K5.L r0 = new K5.L
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f4760o
            T3.a r1 = T3.a.f9048k
            int r2 = r0.f4762q
            r3 = 3
            r4 = 2
            if (r2 == 0) goto L5e
            r8 = 1
            if (r2 == r8) goto L4f
            if (r2 == r4) goto L43
            if (r2 != r3) goto L3b
            H5.f0 r8 = r0.f4759n
            K5.O r9 = r0.f4758m
            K5.i r2 = r0.f4757l
            K5.M r5 = r0.f4756k
            P3.r.Y(r10)     // Catch: java.lang.Throwable -> L38
        L34:
            r10 = r2
            r2 = r8
            r8 = r5
            goto L76
        L38:
            r8 = move-exception
            goto Lb4
        L3b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L43:
            H5.f0 r8 = r0.f4759n
            K5.O r9 = r0.f4758m
            K5.i r2 = r0.f4757l
            K5.M r5 = r0.f4756k
            P3.r.Y(r10)     // Catch: java.lang.Throwable -> L38
            goto L79
        L4f:
            K5.O r9 = r0.f4758m
            K5.i r8 = r0.f4757l
            K5.M r2 = r0.f4756k
            P3.r.Y(r10)     // Catch: java.lang.Throwable -> L5b
            r10 = r8
            r8 = r2
            goto L6a
        L5b:
            r8 = move-exception
            r5 = r2
            goto Lb4
        L5e:
            P3.r.Y(r10)
            L5.d r10 = r8.c()
            K5.O r10 = (K5.O) r10
            r7 = r10
            r10 = r9
            r9 = r7
        L6a:
            S3.h r2 = r0.getContext()     // Catch: java.lang.Throwable -> Lb1
            H5.e0 r5 = H5.C0263e0.f3843k     // Catch: java.lang.Throwable -> Lb1
            S3.f r2 = r2.get(r5)     // Catch: java.lang.Throwable -> Lb1
            H5.f0 r2 = (H5.InterfaceC0265f0) r2     // Catch: java.lang.Throwable -> Lb1
        L76:
            r5 = r8
            r8 = r2
            r2 = r10
        L79:
            java.lang.Object r10 = r5.r(r9)     // Catch: java.lang.Throwable -> L38
            F2.G r6 = K5.N.a     // Catch: java.lang.Throwable -> L38
            if (r10 != r6) goto L92
            r0.f4756k = r5     // Catch: java.lang.Throwable -> L38
            r0.f4757l = r2     // Catch: java.lang.Throwable -> L38
            r0.f4758m = r9     // Catch: java.lang.Throwable -> L38
            r0.f4759n = r8     // Catch: java.lang.Throwable -> L38
            r0.f4762q = r4     // Catch: java.lang.Throwable -> L38
            java.lang.Object r10 = r5.h(r9, r0)     // Catch: java.lang.Throwable -> L38
            if (r10 != r1) goto L79
            goto Lb0
        L92:
            if (r8 == 0) goto La0
            boolean r6 = r8.b()     // Catch: java.lang.Throwable -> L38
            if (r6 == 0) goto L9b
            goto La0
        L9b:
            java.util.concurrent.CancellationException r8 = r8.H()     // Catch: java.lang.Throwable -> L38
            throw r8     // Catch: java.lang.Throwable -> L38
        La0:
            r0.f4756k = r5     // Catch: java.lang.Throwable -> L38
            r0.f4757l = r2     // Catch: java.lang.Throwable -> L38
            r0.f4758m = r9     // Catch: java.lang.Throwable -> L38
            r0.f4759n = r8     // Catch: java.lang.Throwable -> L38
            r0.f4762q = r3     // Catch: java.lang.Throwable -> L38
            java.lang.Object r10 = r2.emit(r10, r0)     // Catch: java.lang.Throwable -> L38
            if (r10 != r1) goto L34
        Lb0:
            return
        Lb1:
            r10 = move-exception
            r5 = r8
            r8 = r10
        Lb4:
            r5.f(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: K5.M.j(K5.M, K5.i, S3.c):void");
    }

    @Override // K5.F
    public final boolean a(Object obj) {
        int i7;
        boolean z7;
        S3.c[] cVarArrM = L5.c.a;
        synchronized (this) {
            if (p(obj)) {
                cVarArrM = m(cVarArrM);
                z7 = true;
            } else {
                z7 = false;
            }
        }
        for (S3.c cVar : cVarArrM) {
            if (cVar != null) {
                cVar.resumeWith(O3.C.a);
            }
        }
        return z7;
    }

    @Override // L5.q
    public final InterfaceC0329h b(S3.h hVar, int i7, J5.c cVar) {
        return N.k(this, hVar, i7, cVar);
    }

    @Override // K5.InterfaceC0329h
    public final Object collect(InterfaceC0330i interfaceC0330i, S3.c cVar) throws Throwable {
        j(this, interfaceC0330i, cVar);
        return T3.a.f9048k;
    }

    @Override // L5.b
    public final L5.d d() {
        O o7 = new O();
        o7.a = -1L;
        return o7;
    }

    @Override // L5.b
    public final L5.d[] e() {
        return new O[2];
    }

    @Override // K5.InterfaceC0330i
    public final Object emit(Object obj, S3.c cVar) throws Throwable {
        Throwable th;
        S3.c[] cVarArrM;
        K k7;
        if (a(obj)) {
            return O3.C.a;
        }
        C0270k c0270k = new C0270k(1, P3.r.E(cVar));
        c0270k.r();
        S3.c[] cVarArrM2 = L5.c.a;
        synchronized (this) {
            try {
                if (p(obj)) {
                    try {
                        c0270k.resumeWith(O3.C.a);
                        cVarArrM = m(cVarArrM2);
                        k7 = null;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else {
                    try {
                        K k8 = new K(this, n() + this.f4769u + this.f4770v, obj, c0270k);
                        l(k8);
                        this.f4770v++;
                        if (this.f4764p == 0) {
                            cVarArrM2 = m(cVarArrM2);
                        }
                        cVarArrM = cVarArrM2;
                        k7 = k8;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        throw th;
                    }
                }
                if (k7 != null) {
                    c0270k.u(new C0267h(1, k7));
                }
                for (S3.c cVar2 : cVarArrM) {
                    if (cVar2 != null) {
                        cVar2.resumeWith(O3.C.a);
                    }
                }
                Object objQ = c0270k.q();
                T3.a aVar = T3.a.f9048k;
                if (objQ != aVar) {
                    objQ = O3.C.a;
                }
                return objQ == aVar ? objQ : O3.C.a;
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    public final Object h(O o7, L l7) {
        C0270k c0270k = new C0270k(1, P3.r.E(l7));
        c0270k.r();
        synchronized (this) {
            if (q(o7) < 0) {
                o7.f4773b = c0270k;
            } else {
                c0270k.resumeWith(O3.C.a);
            }
        }
        Object objQ = c0270k.q();
        return objQ == T3.a.f9048k ? objQ : O3.C.a;
    }

    public final void i() {
        if (this.f4764p != 0 || this.f4770v > 1) {
            Object[] objArr = this.f4766r;
            kotlin.jvm.internal.l.c(objArr);
            while (this.f4770v > 0) {
                long jN = n();
                int i7 = this.f4769u;
                int i8 = this.f4770v;
                if (objArr[((int) ((jN + (i7 + i8)) - 1)) & (objArr.length - 1)] != N.a) {
                    return;
                }
                this.f4770v = i8 - 1;
                N.d(objArr, n() + this.f4769u + this.f4770v, null);
            }
        }
    }

    public final void k() {
        L5.d[] dVarArr;
        Object[] objArr = this.f4766r;
        kotlin.jvm.internal.l.c(objArr);
        N.d(objArr, n(), null);
        this.f4769u--;
        long jN = n() + 1;
        if (this.f4767s < jN) {
            this.f4767s = jN;
        }
        if (this.f4768t < jN) {
            if (this.f6158l != 0 && (dVarArr = this.f6157k) != null) {
                for (L5.d dVar : dVarArr) {
                    if (dVar != null) {
                        O o7 = (O) dVar;
                        long j7 = o7.a;
                        if (j7 >= 0 && j7 < jN) {
                            o7.a = jN;
                        }
                    }
                }
            }
            this.f4768t = jN;
        }
    }

    public final void l(Object obj) {
        int i7 = this.f4769u + this.f4770v;
        Object[] objArrO = this.f4766r;
        if (objArrO == null) {
            objArrO = o(null, 0, 2);
        } else if (i7 >= objArrO.length) {
            objArrO = o(objArrO, i7, objArrO.length * 2);
        }
        N.d(objArrO, n() + i7, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, java.lang.Object[]] */
    public final S3.c[] m(S3.c[] cVarArr) {
        L5.d[] dVarArr;
        O o7;
        C0270k c0270k;
        int length = cVarArr.length;
        if (this.f6158l != 0 && (dVarArr = this.f6157k) != null) {
            int length2 = dVarArr.length;
            int i7 = 0;
            cVarArr = cVarArr;
            while (i7 < length2) {
                L5.d dVar = dVarArr[i7];
                if (dVar != null && (c0270k = (o7 = (O) dVar).f4773b) != null && q(o7) >= 0) {
                    int length3 = cVarArr.length;
                    cVarArr = cVarArr;
                    if (length >= length3) {
                        ?? CopyOf = Arrays.copyOf(cVarArr, Math.max(2, cVarArr.length * 2));
                        kotlin.jvm.internal.l.e("copyOf(...)", CopyOf);
                        cVarArr = CopyOf;
                    }
                    cVarArr[length] = c0270k;
                    o7.f4773b = null;
                    length++;
                }
                i7++;
                cVarArr = cVarArr;
            }
        }
        return cVarArr;
    }

    public final long n() {
        return Math.min(this.f4768t, this.f4767s);
    }

    public final Object[] o(Object[] objArr, int i7, int i8) {
        if (i8 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i8];
        this.f4766r = objArr2;
        if (objArr != null) {
            long jN = n();
            for (int i9 = 0; i9 < i7; i9++) {
                long j7 = i9 + jN;
                N.d(objArr2, j7, objArr[((int) j7) & (objArr.length - 1)]);
            }
        }
        return objArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean p(java.lang.Object r13) {
        /*
            r12 = this;
            int r1 = r12.f6158l
            int r2 = r12.f4763o
            r9 = 1
            if (r1 != 0) goto L23
            if (r2 != 0) goto Lb
            goto L7f
        Lb:
            r12.l(r13)
            int r1 = r12.f4769u
            int r1 = r1 + r9
            r12.f4769u = r1
            if (r1 <= r2) goto L18
            r12.k()
        L18:
            long r1 = r12.n()
            int r3 = r12.f4769u
            long r3 = (long) r3
            long r1 = r1 + r3
            r12.f4768t = r1
            return r9
        L23:
            int r1 = r12.f4769u
            int r3 = r12.f4764p
            if (r1 < r3) goto L47
            long r4 = r12.f4768t
            long r6 = r12.f4767s
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 > 0) goto L47
            J5.c r1 = r12.f4765q
            int r1 = r1.ordinal()
            if (r1 == 0) goto L45
            if (r1 == r9) goto L47
            r2 = 2
            if (r1 != r2) goto L3f
            goto L7f
        L3f:
            D6.r r1 = new D6.r
            r1.<init>()
            throw r1
        L45:
            r1 = 0
            return r1
        L47:
            r12.l(r13)
            int r1 = r12.f4769u
            int r1 = r1 + r9
            r12.f4769u = r1
            if (r1 <= r3) goto L54
            r12.k()
        L54:
            long r3 = r12.n()
            int r1 = r12.f4769u
            long r5 = (long) r1
            long r3 = r3 + r5
            long r5 = r12.f4767s
            long r3 = r3 - r5
            int r1 = (int) r3
            if (r1 <= r2) goto L7f
            r1 = 1
            long r1 = r1 + r5
            long r3 = r12.f4768t
            long r5 = r12.n()
            int r7 = r12.f4769u
            long r7 = (long) r7
            long r5 = r5 + r7
            long r7 = r12.n()
            int r10 = r12.f4769u
            long r10 = (long) r10
            long r7 = r7 + r10
            int r10 = r12.f4770v
            long r10 = (long) r10
            long r7 = r7 + r10
            r0 = r12
            r0.s(r1, r3, r5, r7)
        L7f:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: K5.M.p(java.lang.Object):boolean");
    }

    public final long q(O o7) {
        long j7 = o7.a;
        if (j7 < n() + this.f4769u) {
            return j7;
        }
        if (this.f4764p <= 0 && j7 <= n() && this.f4770v != 0) {
            return j7;
        }
        return -1L;
    }

    public final Object r(O o7) {
        Object obj;
        S3.c[] cVarArrT = L5.c.a;
        synchronized (this) {
            try {
                long jQ = q(o7);
                if (jQ < 0) {
                    obj = N.a;
                } else {
                    long j7 = o7.a;
                    Object[] objArr = this.f4766r;
                    kotlin.jvm.internal.l.c(objArr);
                    Object obj2 = objArr[((int) jQ) & (objArr.length - 1)];
                    if (obj2 instanceof K) {
                        obj2 = ((K) obj2).f4754m;
                    }
                    o7.a = jQ + 1;
                    Object obj3 = obj2;
                    cVarArrT = t(j7);
                    obj = obj3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (S3.c cVar : cVarArrT) {
            if (cVar != null) {
                cVar.resumeWith(O3.C.a);
            }
        }
        return obj;
    }

    public final void s(long j7, long j8, long j9, long j10) {
        long jMin = Math.min(j8, j7);
        for (long jN = n(); jN < jMin; jN++) {
            Object[] objArr = this.f4766r;
            kotlin.jvm.internal.l.c(objArr);
            N.d(objArr, jN, null);
        }
        this.f4767s = j7;
        this.f4768t = j8;
        this.f4769u = (int) (j9 - jMin);
        this.f4770v = (int) (j10 - j9);
    }

    public final S3.c[] t(long j7) {
        long j8;
        long j9;
        long j10;
        int i7;
        S3.c[] cVarArr;
        L5.d[] dVarArr;
        long j11 = this.f4768t;
        S3.c[] cVarArr2 = L5.c.a;
        if (j7 <= j11) {
            long jN = n();
            long j12 = this.f4769u + jN;
            int i8 = this.f4764p;
            if (i8 == 0 && this.f4770v > 0) {
                j12++;
            }
            int i9 = 0;
            if (this.f6158l != 0 && (dVarArr = this.f6157k) != null) {
                for (L5.d dVar : dVarArr) {
                    if (dVar != null) {
                        long j13 = ((O) dVar).a;
                        if (j13 >= 0 && j13 < j12) {
                            j12 = j13;
                        }
                    }
                }
            }
            if (j12 > this.f4768t) {
                long jN2 = n() + this.f4769u;
                int iMin = this.f6158l > 0 ? Math.min(this.f4770v, i8 - ((int) (jN2 - j12))) : this.f4770v;
                long j14 = this.f4770v + jN2;
                F2.G g4 = N.a;
                if (iMin > 0) {
                    S3.c[] cVarArr3 = new S3.c[iMin];
                    j10 = 1;
                    Object[] objArr = this.f4766r;
                    kotlin.jvm.internal.l.c(objArr);
                    i7 = i8;
                    long j15 = jN2;
                    while (true) {
                        if (jN2 >= j14) {
                            j8 = jN;
                            j9 = j12;
                            break;
                        }
                        j8 = jN;
                        Object obj = objArr[((int) jN2) & (objArr.length - 1)];
                        if (obj != g4) {
                            kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter", obj);
                            K k7 = (K) obj;
                            int i10 = i9 + 1;
                            j9 = j12;
                            cVarArr3[i9] = k7.f4755n;
                            N.d(objArr, jN2, g4);
                            N.d(objArr, j15, k7.f4754m);
                            j15++;
                            if (i10 >= iMin) {
                                break;
                            }
                            i9 = i10;
                        } else {
                            j9 = j12;
                        }
                        jN2++;
                        jN = j8;
                        j12 = j9;
                    }
                    jN2 = j15;
                    cVarArr = cVarArr3;
                } else {
                    j8 = jN;
                    j9 = j12;
                    j10 = 1;
                    i7 = i8;
                    cVarArr = cVarArr2;
                }
                int i11 = (int) (jN2 - j8);
                long j16 = this.f6158l == 0 ? jN2 : j9;
                long jMax = Math.max(this.f4767s, jN2 - Math.min(this.f4763o, i11));
                if (i7 == 0 && jMax < j14) {
                    Object[] objArr2 = this.f4766r;
                    kotlin.jvm.internal.l.c(objArr2);
                    if (kotlin.jvm.internal.l.a(objArr2[((int) jMax) & (objArr2.length - 1)], g4)) {
                        jN2 += j10;
                        jMax += j10;
                    }
                }
                s(jMax, j16, jN2, j14);
                i();
                return cVarArr.length == 0 ? cVarArr : m(cVarArr);
            }
        }
        return cVarArr2;
    }
}
