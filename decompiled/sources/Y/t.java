package Y;

import C2.C0034g;
import D.C0042b;
import O.C0486d;
import O.C0508o;
import O.E;
import e4.InterfaceC0821a;
import java.util.HashMap;
import m.C1472B;
import m.C1501v;
import m.C1504y;

/* loaded from: classes.dex */
public final class t {
    public final e4.k a;

    /* renamed from: b, reason: collision with root package name */
    public Object f10016b;

    /* renamed from: c, reason: collision with root package name */
    public C1501v f10017c;

    /* renamed from: j, reason: collision with root package name */
    public int f10024j;

    /* renamed from: d, reason: collision with root package name */
    public int f10018d = -1;

    /* renamed from: e, reason: collision with root package name */
    public final C0034g f10019e = new C0034g(27);

    /* renamed from: f, reason: collision with root package name */
    public final C1504y f10020f = new C1504y();

    /* renamed from: g, reason: collision with root package name */
    public final C1472B f10021g = new C1472B();

    /* renamed from: h, reason: collision with root package name */
    public final Q.d f10022h = new Q.d(new E[16]);

    /* renamed from: i, reason: collision with root package name */
    public final C0508o f10023i = new C0508o(1, this);

    /* renamed from: k, reason: collision with root package name */
    public final C0034g f10025k = new C0034g(27);

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f10026l = new HashMap();

    public t(e4.k kVar) {
        this.a = kVar;
    }

    public final void a(Object obj, C0042b c0042b, InterfaceC0821a interfaceC0821a) {
        boolean z7;
        int i7;
        int i8;
        Object obj2 = this.f10016b;
        C1501v c1501v = this.f10017c;
        int i9 = this.f10018d;
        this.f10016b = obj;
        this.f10017c = (C1501v) this.f10020f.e(obj);
        if (this.f10018d == -1) {
            this.f10018d = o.k().d();
        }
        C0508o c0508o = this.f10023i;
        Q.d dVarB = C0486d.B();
        boolean z8 = true;
        try {
            dVarB.b(c0508o);
            s.e(interfaceC0821a, c0042b);
            dVarB.n(dVarB.f7829m - 1);
            Object obj3 = this.f10016b;
            kotlin.jvm.internal.l.c(obj3);
            int i10 = this.f10018d;
            C1501v c1501v2 = this.f10017c;
            if (c1501v2 != null) {
                long[] jArr = c1501v2.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i11 = 0;
                    while (true) {
                        long j7 = jArr[i11];
                        if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i12 = 8;
                            int i13 = 8 - ((~(i11 - length)) >>> 31);
                            z7 = z8;
                            int i14 = 0;
                            while (i14 < i13) {
                                if ((j7 & 255) < 128) {
                                    int i15 = (i11 << 3) + i14;
                                    i8 = i12;
                                    Object obj4 = c1501v2.f12929b[i15];
                                    i7 = i14;
                                    boolean z9 = c1501v2.f12930c[i15] != i10 ? z7 : false;
                                    if (z9) {
                                        d(obj3, obj4);
                                    }
                                    if (z9) {
                                        c1501v2.e(i15);
                                    }
                                } else {
                                    i7 = i14;
                                    i8 = i12;
                                }
                                j7 >>= i8;
                                i14 = i7 + 1;
                                i12 = i8;
                            }
                            if (i13 != i12) {
                                break;
                            }
                        } else {
                            z7 = z8;
                        }
                        if (i11 == length) {
                            break;
                        }
                        i11++;
                        z8 = z7;
                    }
                }
            }
            this.f10016b = obj2;
            this.f10017c = c1501v;
            this.f10018d = i9;
        } catch (Throwable th) {
            dVarB.n(dVarB.f7829m - 1);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x02b3 A[PHI: r23
      0x02b3: PHI (r23v38 boolean) = (r23v37 boolean), (r23v39 boolean) binds: [B:112:0x028a, B:120:0x02b1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x041a A[PHI: r23
      0x041a: PHI (r23v21 boolean) = (r23v20 boolean), (r23v22 boolean) binds: [B:170:0x03e8, B:180:0x0418] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x04dc A[PHI: r23
      0x04dc: PHI (r23v11 boolean) = (r23v10 boolean), (r23v12 boolean) binds: [B:208:0x04b3, B:216:0x04da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0541 A[EDGE_INSN: B:239:0x0541->B:321:0x054b BREAK  A[LOOP:18: B:229:0x050e->B:240:0x0543], PHI: r23
      0x0541: PHI (r23v5 boolean) = (r23v4 boolean), (r23v6 boolean) binds: [B:230:0x0518, B:238:0x053f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:318:0x054b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0153 A[PHI: r23
      0x0153: PHI (r23v57 boolean) = (r23v56 boolean), (r23v58 boolean) binds: [B:47:0x0127, B:56:0x0151] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(java.util.Set r47) {
        /*
            Method dump skipped, instructions count: 1592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.t.b(java.util.Set):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(java.lang.Object r21, int r22, java.lang.Object r23, m.C1501v r24) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r24
            int r4 = r0.f10024j
            if (r4 <= 0) goto Le
            goto La4
        Le:
            int r4 = r3.b(r1)
            if (r4 >= 0) goto L17
            int r4 = ~r4
            r6 = -1
            goto L1b
        L17:
            int[] r6 = r3.f12930c
            r6 = r6[r4]
        L1b:
            java.lang.Object[] r7 = r3.f12929b
            r7[r4] = r1
            int[] r3 = r3.f12930c
            r3[r4] = r2
            boolean r3 = r1 instanceof O.E
            r4 = 2
            if (r3 == 0) goto L90
            if (r6 == r2) goto L90
            r2 = r1
            O.E r2 = (O.E) r2
            O.D r2 = r2.g()
            java.util.HashMap r3 = r0.f10026l
            java.lang.Object r7 = r2.f6965f
            r3.put(r1, r7)
            m.v r2 = r2.f6964e
            C2.g r3 = r0.f10025k
            r3.u(r1)
            java.lang.Object[] r7 = r2.f12929b
            long[] r2 = r2.a
            int r8 = r2.length
            int r8 = r8 - r4
            if (r8 < 0) goto L90
            r10 = 0
        L48:
            r11 = r2[r10]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto L8b
            int r13 = r10 - r8
            int r13 = ~r13
            int r13 = r13 >>> 31
            r14 = 8
            int r13 = 8 - r13
            r15 = 0
        L62:
            if (r15 >= r13) goto L89
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r11 & r16
            r18 = 128(0x80, double:6.32E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto L85
            int r16 = r10 << 3
            int r16 = r16 + r15
            r16 = r7[r16]
            r9 = r16
            Y.v r9 = (Y.v) r9
            boolean r5 = r9 instanceof Y.w
            if (r5 == 0) goto L82
            r5 = r9
            Y.w r5 = (Y.w) r5
            r5.e(r4)
        L82:
            r3.d(r9, r1)
        L85:
            long r11 = r11 >> r14
            int r15 = r15 + 1
            goto L62
        L89:
            if (r13 != r14) goto L90
        L8b:
            if (r10 == r8) goto L90
            int r10 = r10 + 1
            goto L48
        L90:
            r2 = -1
            if (r6 != r2) goto La4
            boolean r2 = r1 instanceof Y.w
            if (r2 == 0) goto L9d
            r2 = r1
            Y.w r2 = (Y.w) r2
            r2.e(r4)
        L9d:
            C2.g r2 = r0.f10019e
            r3 = r23
            r2.d(r1, r3)
        La4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.t.c(java.lang.Object, int, java.lang.Object, m.v):void");
    }

    public final void d(Object obj, Object obj2) {
        C0034g c0034g = this.f10019e;
        c0034g.t(obj2, obj);
        if (!(obj2 instanceof E) || ((C1504y) c0034g.f741l).b(obj2)) {
            return;
        }
        this.f10025k.u(obj2);
        this.f10026l.remove(obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.t.e():void");
    }
}
