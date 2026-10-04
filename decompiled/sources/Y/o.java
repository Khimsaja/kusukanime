package Y;

import C2.H;
import O.C0488e;
import O.V0;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import m.C1472B;

/* loaded from: classes.dex */
public abstract class o {
    public static final B2.l a = new B2.l(14);

    /* renamed from: b, reason: collision with root package name */
    public static final Object f10002b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static m f10003c;

    /* renamed from: d, reason: collision with root package name */
    public static int f10004d;

    /* renamed from: e, reason: collision with root package name */
    public static final k f10005e;

    /* renamed from: f, reason: collision with root package name */
    public static final H f10006f;

    /* renamed from: g, reason: collision with root package name */
    public static Object f10007g;

    /* renamed from: h, reason: collision with root package name */
    public static Object f10008h;

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicReference f10009i;

    /* renamed from: j, reason: collision with root package name */
    public static final h f10010j;

    /* renamed from: k, reason: collision with root package name */
    public static final C0488e f10011k;

    static {
        m mVar = m.f9994o;
        f10003c = mVar;
        f10004d = 2;
        k kVar = new k();
        kVar.f9985c = new int[16];
        kVar.f9986d = new int[16];
        int[] iArr = new int[16];
        int i7 = 0;
        while (i7 < 16) {
            int i8 = i7 + 1;
            iArr[i7] = i8;
            i7 = i8;
        }
        kVar.f9987e = iArr;
        f10005e = kVar;
        H h7 = new H(4, (byte) 0);
        h7.f667m = new int[16];
        h7.f668n = new V0[16];
        f10006f = h7;
        P3.y yVar = P3.y.f7779k;
        f10007g = yVar;
        f10008h = yVar;
        int i9 = f10004d;
        f10004d = i9 + 1;
        c cVar = new c(i9, mVar);
        f10003c = f10003c.o(cVar.f9980b);
        AtomicReference atomicReference = new AtomicReference(cVar);
        f10009i = atomicReference;
        f10010j = (h) atomicReference.get();
        f10011k = new C0488e(0);
    }

    public static final void a() {
        f(n.f9999m);
    }

    public static final e4.k b(e4.k kVar, e4.k kVar2) {
        return (kVar == null || kVar2 == null || kVar == kVar2) ? kVar == null ? kVar2 : kVar : new b(kVar, kVar2, 2);
    }

    public static final HashMap c(d dVar, d dVar2, m mVar) {
        long[] jArr;
        int i7;
        m mVar2;
        long[] jArr2;
        int i8;
        m mVar3;
        int i9;
        C1472B c1472bW = dVar2.w();
        int iD = dVar.d();
        if (c1472bW != null) {
            m mVarM = dVar2.e().o(dVar2.d()).m(dVar2.f9970j);
            Object[] objArr = c1472bW.f12864b;
            long[] jArr3 = c1472bW.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i10 = 0;
                HashMap map = null;
                while (true) {
                    long j7 = jArr3[i10];
                    if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i11 = 8;
                        int i12 = 8 - ((~(i10 - length)) >>> 31);
                        int i13 = 0;
                        while (i13 < i12) {
                            if ((255 & j7) < 128) {
                                v vVar = (v) objArr[(i10 << 3) + i13];
                                x xVarA = vVar.a();
                                i9 = i11;
                                x xVarS = s(xVarA, iD, mVar);
                                if (xVarS == null) {
                                    jArr2 = jArr3;
                                } else {
                                    jArr2 = jArr3;
                                    x xVarS2 = s(xVarA, iD, mVarM);
                                    if (xVarS2 != null && !xVarS.equals(xVarS2)) {
                                        i8 = iD;
                                        mVar3 = mVarM;
                                        x xVarS3 = s(xVarA, dVar2.d(), dVar2.e());
                                        if (xVarS3 == null) {
                                            r();
                                            throw null;
                                        }
                                        x xVarH = vVar.h(xVarS2, xVarS, xVarS3);
                                        if (xVarH == null) {
                                            return null;
                                        }
                                        if (map == null) {
                                            map = new HashMap();
                                        }
                                        map.put(xVarS, xVarH);
                                        map = map;
                                    }
                                }
                                i8 = iD;
                                mVar3 = mVarM;
                            } else {
                                jArr2 = jArr3;
                                i8 = iD;
                                mVar3 = mVarM;
                                i9 = i11;
                            }
                            j7 >>= i9;
                            i13++;
                            i11 = i9;
                            jArr3 = jArr2;
                            iD = i8;
                            mVarM = mVar3;
                        }
                        jArr = jArr3;
                        i7 = iD;
                        mVar2 = mVarM;
                        if (i12 != i11) {
                            return map;
                        }
                    } else {
                        jArr = jArr3;
                        i7 = iD;
                        mVar2 = mVarM;
                    }
                    if (i10 == length) {
                        return map;
                    }
                    i10++;
                    jArr3 = jArr;
                    iD = i7;
                    mVarM = mVar2;
                }
            }
        }
        return null;
    }

    public static final void d(h hVar) {
        int i7;
        if (f10003c.j(hVar.d())) {
            return;
        }
        StringBuilder sb = new StringBuilder("Snapshot is not open: id=");
        sb.append(hVar.d());
        sb.append(", disposed=");
        sb.append(hVar.f9981c);
        sb.append(", applied=");
        d dVar = hVar instanceof d ? (d) hVar : null;
        sb.append(dVar != null ? Boolean.valueOf(dVar.f9973m) : "read-only");
        sb.append(", lowestPin=");
        synchronized (f10002b) {
            k kVar = f10005e;
            i7 = kVar.a > 0 ? ((int[]) kVar.f9985c)[0] : -1;
        }
        sb.append(i7);
        throw new IllegalStateException(sb.toString().toString());
    }

    public static final m e(m mVar, int i7, int i8) {
        while (i7 < i8) {
            mVar = mVar.o(i7);
            i7++;
        }
        return mVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00a1  */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(e4.k r15) {
        /*
            Y.h r0 = Y.o.f10010j
            java.lang.String r1 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.GlobalSnapshot"
            kotlin.jvm.internal.l.d(r1, r0)
            Y.c r0 = (Y.c) r0
            java.lang.Object r0 = Y.o.f10002b
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicReference r1 = Y.o.f10009i     // Catch: java.lang.Throwable -> L20
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L20
            r2 = r1
            Y.c r2 = (Y.c) r2     // Catch: java.lang.Throwable -> L20
            m.B r2 = r2.f9968h     // Catch: java.lang.Throwable -> L20
            if (r2 == 0) goto L23
            O.e r3 = Y.o.f10011k     // Catch: java.lang.Throwable -> L20
            r4 = 1
            r3.addAndGet(r4)     // Catch: java.lang.Throwable -> L20
            goto L23
        L20:
            r15 = move-exception
            goto Laa
        L23:
            r3 = r1
            Y.h r3 = (Y.h) r3     // Catch: java.lang.Throwable -> L20
            java.lang.Object r15 = v(r3, r15)     // Catch: java.lang.Throwable -> L20
            monitor-exit(r0)
            r0 = 0
            if (r2 == 0) goto L57
            r3 = -1
            java.lang.Object r4 = Y.o.f10007g     // Catch: java.lang.Throwable -> L49
            int r5 = r4.size()     // Catch: java.lang.Throwable -> L49
            r6 = r0
        L36:
            if (r6 >= r5) goto L4b
            java.lang.Object r7 = r4.get(r6)     // Catch: java.lang.Throwable -> L49
            e4.n r7 = (e4.n) r7     // Catch: java.lang.Throwable -> L49
            Q.f r8 = new Q.f     // Catch: java.lang.Throwable -> L49
            r8.<init>(r2)     // Catch: java.lang.Throwable -> L49
            r7.invoke(r8, r1)     // Catch: java.lang.Throwable -> L49
            int r6 = r6 + 1
            goto L36
        L49:
            r15 = move-exception
            goto L51
        L4b:
            O.e r1 = Y.o.f10011k
            r1.addAndGet(r3)
            goto L57
        L51:
            O.e r0 = Y.o.f10011k
            r0.addAndGet(r3)
            throw r15
        L57:
            java.lang.Object r1 = Y.o.f10002b
            monitor-enter(r1)
            g()     // Catch: java.lang.Throwable -> L99
            if (r2 == 0) goto La6
            java.lang.Object[] r3 = r2.f12864b     // Catch: java.lang.Throwable -> L99
            long[] r2 = r2.a     // Catch: java.lang.Throwable -> L99
            int r4 = r2.length     // Catch: java.lang.Throwable -> L99
            int r4 = r4 + (-2)
            if (r4 < 0) goto La6
            r5 = r0
        L69:
            r6 = r2[r5]     // Catch: java.lang.Throwable -> L99
            long r8 = ~r6     // Catch: java.lang.Throwable -> L99
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto La1
            int r8 = r5 - r4
            int r8 = ~r8     // Catch: java.lang.Throwable -> L99
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r0
        L83:
            if (r10 >= r8) goto L9f
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.32E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L9b
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r3[r11]     // Catch: java.lang.Throwable -> L99
            Y.v r11 = (Y.v) r11     // Catch: java.lang.Throwable -> L99
            q(r11)     // Catch: java.lang.Throwable -> L99
            goto L9b
        L99:
            r15 = move-exception
            goto La8
        L9b:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L83
        L9f:
            if (r8 != r9) goto La6
        La1:
            if (r5 == r4) goto La6
            int r5 = r5 + 1
            goto L69
        La6:
            monitor-exit(r1)
            return r15
        La8:
            monitor-exit(r1)
            throw r15
        Laa:
            monitor-exit(r0)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.o.f(e4.k):java.lang.Object");
    }

    public static final void g() {
        H h7 = f10006f;
        int i7 = h7.f666l;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            if (i8 >= i7) {
                break;
            }
            V0 v0 = ((V0[]) h7.f668n)[i8];
            Object obj = v0 != null ? v0.get() : null;
            if (obj != null && p((v) obj)) {
                if (i9 != i8) {
                    ((V0[]) h7.f668n)[i9] = v0;
                    int[] iArr = (int[]) h7.f667m;
                    iArr[i9] = iArr[i8];
                }
                i9++;
            }
            i8++;
        }
        for (int i10 = i9; i10 < i7; i10++) {
            ((V0[]) h7.f668n)[i10] = null;
            ((int[]) h7.f667m)[i10] = 0;
        }
        if (i9 != i7) {
            h7.f666l = i9;
        }
    }

    public static final h h(h hVar, e4.k kVar, boolean z7) {
        boolean z8 = hVar instanceof d;
        if (z8 || hVar == null) {
            return new z(z8 ? (d) hVar : null, kVar, null, false, z7);
        }
        return new A(hVar, kVar, z7);
    }

    public static final x i(x xVar) {
        x xVarS;
        h hVarK = k();
        x xVarS2 = s(xVar, hVarK.d(), hVarK.e());
        if (xVarS2 != null) {
            return xVarS2;
        }
        synchronized (f10002b) {
            h hVarK2 = k();
            xVarS = s(xVar, hVarK2.d(), hVarK2.e());
        }
        if (xVarS != null) {
            return xVarS;
        }
        r();
        throw null;
    }

    public static final x j(x xVar, h hVar) {
        x xVarS = s(xVar, hVar.d(), hVar.e());
        if (xVarS != null) {
            return xVarS;
        }
        r();
        throw null;
    }

    public static final h k() {
        h hVar = (h) a.s();
        return hVar == null ? (h) f10009i.get() : hVar;
    }

    public static final e4.k l(e4.k kVar, e4.k kVar2, boolean z7) {
        if (!z7) {
            kVar2 = null;
        }
        return (kVar == null || kVar2 == null || kVar == kVar2) ? kVar == null ? kVar2 : kVar : new b(kVar, kVar2, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0053, code lost:
    
        r3 = r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0057 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final Y.x m(Y.x r12, Y.v r13) {
        /*
            Y.x r0 = r13.a()
            int r1 = Y.o.f10004d
            Y.k r2 = Y.o.f10005e
            int r3 = r2.a
            r4 = 0
            if (r3 <= 0) goto L13
            java.lang.Object r1 = r2.f9985c
            int[] r1 = (int[]) r1
            r1 = r1[r4]
        L13:
            r2 = 1
            int r1 = r1 - r2
            r3 = 0
            r5 = r3
        L17:
            if (r0 == 0) goto L5a
            int r6 = r0.a
            if (r6 != 0) goto L1e
            goto L53
        L1e:
            if (r6 == 0) goto L57
            if (r6 > r1) goto L57
            int r6 = r6 + 0
            r7 = 0
            r9 = 1
            r11 = 64
            if (r6 < 0) goto L38
            if (r6 >= r11) goto L38
            long r9 = r9 << r6
            long r9 = r9 & r7
            int r6 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r6 == 0) goto L36
        L34:
            r6 = r2
            goto L47
        L36:
            r6 = r4
            goto L47
        L38:
            if (r6 < r11) goto L36
            r11 = 128(0x80, float:1.794E-43)
            if (r6 >= r11) goto L36
            int r6 = r6 + (-64)
            long r9 = r9 << r6
            long r9 = r9 & r7
            int r6 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r6 == 0) goto L36
            goto L34
        L47:
            if (r6 != 0) goto L57
            if (r5 != 0) goto L4d
            r5 = r0
            goto L57
        L4d:
            int r1 = r0.a
            int r2 = r5.a
            if (r1 >= r2) goto L55
        L53:
            r3 = r0
            goto L5a
        L55:
            r3 = r5
            goto L5a
        L57:
            Y.x r0 = r0.f10036b
            goto L17
        L5a:
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r3 == 0) goto L62
            r3.a = r0
            return r3
        L62:
            Y.x r12 = r12.b()
            r12.a = r0
            Y.x r0 = r13.a()
            r12.f10036b = r0
            r13.j(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.o.m(Y.x, Y.v):Y.x");
    }

    public static final void n(h hVar, v vVar) {
        hVar.s(hVar.h() + 1);
        e4.k kVarI = hVar.i();
        if (kVarI != null) {
            kVarI.invoke(vVar);
        }
    }

    public static final x o(x xVar, w wVar, h hVar, x xVar2) {
        x xVarM;
        if (hVar.g()) {
            hVar.n(wVar);
        }
        int iD = hVar.d();
        if (xVar2.a == iD) {
            return xVar2;
        }
        synchronized (f10002b) {
            xVarM = m(xVar, wVar);
        }
        xVarM.a = iD;
        if (xVar2.a != 1) {
            hVar.n(wVar);
        }
        return xVarM;
    }

    public static final boolean p(v vVar) {
        x xVar;
        int i7 = f10004d;
        k kVar = f10005e;
        if (kVar.a > 0) {
            i7 = ((int[]) kVar.f9985c)[0];
        }
        x xVar2 = null;
        x xVarA = null;
        int i8 = 0;
        for (x xVarA2 = vVar.a(); xVarA2 != null; xVarA2 = xVarA2.f10036b) {
            int i9 = xVarA2.a;
            if (i9 != 0) {
                if (i9 >= i7) {
                    i8++;
                } else if (xVar2 == null) {
                    i8++;
                    xVar2 = xVarA2;
                } else {
                    if (i9 < xVar2.a) {
                        xVar = xVar2;
                        xVar2 = xVarA2;
                    } else {
                        xVar = xVarA2;
                    }
                    if (xVarA == null) {
                        xVarA = vVar.a();
                        x xVar3 = xVarA;
                        while (true) {
                            if (xVarA == null) {
                                xVarA = xVar3;
                                break;
                            }
                            int i10 = xVarA.a;
                            if (i10 >= i7) {
                                break;
                            }
                            if (xVar3.a < i10) {
                                xVar3 = xVarA;
                            }
                            xVarA = xVarA.f10036b;
                        }
                    }
                    xVar2.a = 0;
                    xVar2.a(xVarA);
                    xVar2 = xVar;
                }
            }
        }
        return i8 > 1;
    }

    public static final void q(v vVar) {
        if (p(vVar)) {
            H h7 = f10006f;
            int i7 = h7.f666l;
            int iIdentityHashCode = System.identityHashCode(vVar);
            int i8 = -1;
            if (i7 > 0) {
                int i9 = h7.f666l - 1;
                int i10 = 0;
                while (true) {
                    if (i10 > i9) {
                        i8 = -(i10 + 1);
                        break;
                    }
                    int i11 = (i10 + i9) >>> 1;
                    int i12 = ((int[]) h7.f667m)[i11];
                    if (i12 < iIdentityHashCode) {
                        i10 = i11 + 1;
                    } else if (i12 > iIdentityHashCode) {
                        i9 = i11 - 1;
                    } else {
                        V0 v0 = ((V0[]) h7.f668n)[i11];
                        if (vVar == (v0 != null ? v0.get() : null)) {
                            i8 = i11;
                        } else {
                            for (int i13 = i11 - 1; -1 < i13 && ((int[]) h7.f667m)[i13] == iIdentityHashCode; i13--) {
                                V0 v02 = ((V0[]) h7.f668n)[i13];
                                if ((v02 != null ? v02.get() : null) == vVar) {
                                    i8 = i13;
                                    break;
                                }
                            }
                            i11++;
                            int i14 = h7.f666l;
                            while (true) {
                                if (i11 >= i14) {
                                    i8 = -(h7.f666l + 1);
                                    break;
                                } else {
                                    if (((int[]) h7.f667m)[i11] != iIdentityHashCode) {
                                        i8 = -(i11 + 1);
                                        break;
                                    }
                                    V0 v03 = ((V0[]) h7.f668n)[i11];
                                    if ((v03 != null ? v03.get() : null) == vVar) {
                                        break;
                                    } else {
                                        i11++;
                                    }
                                }
                            }
                            i8 = i11;
                        }
                    }
                }
                if (i8 >= 0) {
                    return;
                }
            }
            int i15 = -(i8 + 1);
            V0[] v0Arr = (V0[]) h7.f668n;
            int length = v0Arr.length;
            if (i7 == length) {
                int i16 = length * 2;
                V0[] v0Arr2 = new V0[i16];
                int[] iArr = new int[i16];
                int i17 = i15 + 1;
                P3.m.W(i17, i15, i7, v0Arr, v0Arr2);
                P3.m.Z(0, i15, 6, (V0[]) h7.f668n, v0Arr2);
                P3.m.V(i17, i15, i7, (int[]) h7.f667m, iArr);
                P3.m.Y(0, i15, 6, (int[]) h7.f667m, iArr);
                h7.f668n = v0Arr2;
                h7.f667m = iArr;
            } else {
                int i18 = i15 + 1;
                P3.m.W(i18, i15, i7, v0Arr, v0Arr);
                int[] iArr2 = (int[]) h7.f667m;
                P3.m.V(i18, i15, i7, iArr2, iArr2);
            }
            ((V0[]) h7.f668n)[i15] = new V0(vVar);
            ((int[]) h7.f667m)[i15] = iIdentityHashCode;
            h7.f666l++;
        }
    }

    public static final void r() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final x s(x xVar, int i7, m mVar) {
        x xVar2 = null;
        while (xVar != null) {
            int i8 = xVar.a;
            if (i8 != 0 && i8 <= i7 && !mVar.j(i8) && (xVar2 == null || xVar2.a < xVar.a)) {
                xVar2 = xVar;
            }
            xVar = xVar.f10036b;
        }
        if (xVar2 != null) {
            return xVar2;
        }
        return null;
    }

    public static final x t(x xVar, v vVar) {
        x xVarS;
        h hVarK = k();
        e4.k kVarF = hVarK.f();
        if (kVarF != null) {
            kVarF.invoke(vVar);
        }
        x xVarS2 = s(xVar, hVarK.d(), hVarK.e());
        if (xVarS2 != null) {
            return xVarS2;
        }
        synchronized (f10002b) {
            h hVarK2 = k();
            x xVarA = vVar.a();
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable$lambda$9", xVarA);
            xVarS = s(xVarA, hVarK2.d(), hVarK2.e());
            if (xVarS == null) {
                r();
                throw null;
            }
        }
        return xVarS;
    }

    public static final void u(int i7) {
        int i8;
        k kVar = f10005e;
        int i9 = ((int[]) kVar.f9987e)[i7];
        kVar.b(i9, kVar.a - 1);
        kVar.a--;
        int[] iArr = (int[]) kVar.f9985c;
        int i10 = iArr[i9];
        int i11 = i9;
        while (i11 > 0) {
            int i12 = ((i11 + 1) >> 1) - 1;
            if (iArr[i12] <= i10) {
                break;
            }
            kVar.b(i12, i11);
            i11 = i12;
        }
        int[] iArr2 = (int[]) kVar.f9985c;
        int i13 = kVar.a >> 1;
        while (i9 < i13) {
            int i14 = (i9 + 1) << 1;
            int i15 = i14 - 1;
            if (i14 < kVar.a && (i8 = iArr2[i14]) < iArr2[i15]) {
                if (i8 >= iArr2[i9]) {
                    break;
                }
                kVar.b(i14, i9);
                i9 = i14;
            } else {
                if (iArr2[i15] >= iArr2[i9]) {
                    break;
                }
                kVar.b(i15, i9);
                i9 = i15;
            }
        }
        ((int[]) kVar.f9987e)[i7] = kVar.f9984b;
        kVar.f9984b = i7;
    }

    public static final Object v(h hVar, e4.k kVar) {
        Object objInvoke = kVar.invoke(f10003c.h(hVar.d()));
        synchronized (f10002b) {
            int i7 = f10004d;
            f10004d = i7 + 1;
            m mVarH = f10003c.h(hVar.d());
            f10003c = mVarH;
            f10009i.set(new c(i7, mVarH));
            hVar.c();
            f10003c = f10003c.o(i7);
        }
        return objInvoke;
    }

    public static final x w(x xVar, v vVar, h hVar) {
        x xVarS;
        if (hVar.g()) {
            hVar.n(vVar);
        }
        int iD = hVar.d();
        x xVarS2 = s(xVar, iD, hVar.e());
        if (xVarS2 == null) {
            r();
            throw null;
        }
        if (xVarS2.a == hVar.d()) {
            return xVarS2;
        }
        synchronized (f10002b) {
            xVarS = s(vVar.a(), iD, hVar.e());
            if (xVarS == null) {
                r();
                throw null;
            }
            if (xVarS.a != iD) {
                x xVarM = m(xVarS, vVar);
                xVarM.a(xVarS);
                xVarM.a = hVar.d();
                xVarS = xVarM;
            }
        }
        if (xVarS2.a != 1) {
            hVar.n(vVar);
        }
        return xVarS;
    }
}
