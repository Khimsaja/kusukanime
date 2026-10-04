package m;

import n.AbstractC1529a;

/* renamed from: m.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1472B {
    public long[] a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f12864b;

    /* renamed from: c, reason: collision with root package name */
    public int f12865c;

    /* renamed from: d, reason: collision with root package name */
    public int f12866d;

    /* renamed from: e, reason: collision with root package name */
    public int f12867e;

    public C1472B(int i7) {
        this.a = AbstractC1475E.a;
        this.f12864b = AbstractC1529a.f13115c;
        if (i7 >= 0) {
            f(AbstractC1475E.f(i7));
        } else {
            AbstractC1529a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean a(Object obj) {
        int i7 = this.f12866d;
        this.f12864b[d(obj)] = obj;
        return this.f12866d != i7;
    }

    public final void b() {
        this.f12866d = 0;
        long[] jArr = this.a;
        if (jArr != AbstractC1475E.a) {
            P3.m.e0(jArr);
            long[] jArr2 = this.a;
            int i7 = this.f12865c;
            int i8 = i7 >> 3;
            long j7 = 255 << ((i7 & 7) << 3);
            jArr2[i8] = (jArr2[i8] & (~j7)) | j7;
        }
        P3.m.c0(this.f12864b, 0, this.f12865c);
        this.f12867e = AbstractC1475E.c(this.f12865c) - this.f12866d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r1 == 0) goto Lc
            int r3 = r1.hashCode()
            goto Ld
        Lc:
            r3 = r2
        Ld:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0.f12865c
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.a
            int r8 = r3 >> 3
            r9 = r3 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r12 = 1
            int r8 = r8 + r12
            r13 = r7[r8]
            int r7 = 64 - r9
            long r7 = r13 << r7
            long r13 = (long) r9
            long r13 = -r13
            r9 = 63
            long r13 = r13 >> r9
            long r7 = r7 & r13
            long r7 = r7 | r10
            long r9 = (long) r4
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L48:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L67
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r3
            r11 = r11 & r5
            java.lang.Object[] r15 = r0.f12864b
            r15 = r15[r11]
            boolean r15 = kotlin.jvm.internal.l.a(r15, r1)
            if (r15 == 0) goto L61
            goto L71
        L61:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L48
        L67:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 == 0) goto L75
            r11 = -1
        L71:
            if (r11 < 0) goto L74
            return r12
        L74:
            return r2
        L75:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: m.C1472B.c(java.lang.Object):boolean");
    }

    public final int d(Object obj) {
        long j7;
        long j8;
        long j9;
        long[] jArr;
        long[] jArr2;
        Object[] objArr;
        long j10;
        int i7 = -862048943;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i8 = iHashCode ^ (iHashCode << 16);
        int i9 = i8 >>> 7;
        int i10 = i8 & 127;
        int i11 = this.f12865c;
        int i12 = i9 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr3 = this.a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j11 = ((jArr3[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr3[i14] >>> i15);
            long j12 = i10;
            int i16 = i10;
            long j13 = j11 ^ (j12 * 72340172838076673L);
            long j14 = (~j13) & (j13 - 72340172838076673L) & (-9187201950435737472L);
            while (j14 != 0) {
                int iNumberOfTrailingZeros = (i12 + (Long.numberOfTrailingZeros(j14) >> 3)) & i11;
                int i17 = i7;
                if (kotlin.jvm.internal.l.a(this.f12864b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j14 &= j14 - 1;
                i7 = i17;
            }
            int i18 = i7;
            char c2 = '\b';
            if ((((~j11) << 6) & j11 & (-9187201950435737472L)) != 0) {
                int iE = e(i9);
                long j15 = 128;
                long j16 = 255;
                if (this.f12867e != 0 || ((this.a[iE >> 3] >> ((iE & 7) << 3)) & 255) == 254) {
                    j7 = 128;
                    j8 = 255;
                    j9 = j12;
                } else {
                    int i19 = this.f12865c;
                    if (i19 <= 8 || Long.compare((this.f12866d * 32) ^ Long.MIN_VALUE, (i19 * 25) ^ Long.MIN_VALUE) > 0) {
                        j7 = 128;
                        j8 = 255;
                        j9 = j12;
                        int iD = AbstractC1475E.d(this.f12865c);
                        long[] jArr4 = this.a;
                        Object[] objArr2 = this.f12864b;
                        int i20 = this.f12865c;
                        f(iD);
                        long[] jArr5 = this.a;
                        Object[] objArr3 = this.f12864b;
                        int i21 = this.f12865c;
                        int i22 = 0;
                        while (i22 < i20) {
                            if (((jArr4[i22 >> 3] >> ((i22 & 7) << 3)) & 255) < 128) {
                                Object obj2 = objArr2[i22];
                                int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i18;
                                int i23 = iHashCode2 ^ (iHashCode2 << 16);
                                int iE2 = e(i23 >>> 7);
                                long j17 = i23 & 127;
                                int i24 = iE2 >> 3;
                                int i25 = (iE2 & 7) << 3;
                                jArr = jArr5;
                                jArr2 = jArr4;
                                long j18 = (jArr5[i24] & (~(255 << i25))) | (j17 << i25);
                                jArr[i24] = j18;
                                jArr[(((iE2 - 7) & i21) + (i21 & 7)) >> 3] = j18;
                                objArr3[iE2] = obj2;
                            } else {
                                jArr = jArr5;
                                jArr2 = jArr4;
                            }
                            i22++;
                            jArr4 = jArr2;
                            jArr5 = jArr;
                        }
                    } else {
                        long[] jArr6 = this.a;
                        int i26 = this.f12865c;
                        Object[] objArr4 = this.f12864b;
                        AbstractC1475E.a(jArr6, i26);
                        int i27 = 0;
                        int iB = -1;
                        while (i27 != i26) {
                            int i28 = i27 >> 3;
                            int i29 = (i27 & 7) << 3;
                            long j19 = (jArr6[i28] >> i29) & j16;
                            if (j19 == j15) {
                                iB = i27;
                                i27++;
                            } else if (j19 != 254) {
                                i27++;
                            } else {
                                Object obj3 = objArr4[i27];
                                int iHashCode3 = (obj3 != null ? obj3.hashCode() : 0) * i18;
                                char c4 = c2;
                                int i30 = (iHashCode3 ^ (iHashCode3 << 16)) >>> 7;
                                int iE3 = e(i30);
                                int i31 = i30 & i26;
                                long j20 = j15;
                                if (((iE3 - i31) & i26) / 8 == ((i27 - i31) & i26) / 8) {
                                    long j21 = j16;
                                    jArr6[i28] = ((r23 & 127) << i29) | (jArr6[i28] & (~(j21 << i29)));
                                    jArr6[jArr6.length - 1] = (jArr6[0] & 72057594037927935L) | Long.MIN_VALUE;
                                    i27++;
                                    c2 = c4;
                                    j15 = j20;
                                    j16 = j21;
                                } else {
                                    long j22 = j16;
                                    int i32 = iE3 >> 3;
                                    long j23 = jArr6[i32];
                                    int i33 = (iE3 & 7) << 3;
                                    if (((j23 >> i33) & j22) == j20) {
                                        j10 = j12;
                                        objArr = objArr4;
                                        jArr6[i32] = ((~(j22 << i33)) & j23) | ((r23 & 127) << i33);
                                        jArr6[i28] = (jArr6[i28] & (~(j22 << i29))) | (j20 << i29);
                                        objArr[iE3] = objArr[i27];
                                        objArr[i27] = null;
                                        iB = i27;
                                    } else {
                                        objArr = objArr4;
                                        j10 = j12;
                                        jArr6[i32] = ((r23 & 127) << i33) | (j23 & (~(j22 << i33)));
                                        if (iB == -1) {
                                            iB = AbstractC1475E.b(jArr6, i27 + 1, i26);
                                        }
                                        objArr[iB] = objArr[iE3];
                                        objArr[iE3] = objArr[i27];
                                        objArr[i27] = objArr[iB];
                                        i27--;
                                    }
                                    jArr6[jArr6.length - 1] = (jArr6[0] & 72057594037927935L) | Long.MIN_VALUE;
                                    i27++;
                                    objArr4 = objArr;
                                    c2 = c4;
                                    j15 = j20;
                                    j16 = j22;
                                    j12 = j10;
                                }
                            }
                        }
                        j7 = j15;
                        j8 = j16;
                        j9 = j12;
                        this.f12867e = AbstractC1475E.c(this.f12865c) - this.f12866d;
                    }
                    iE = e(i9);
                }
                this.f12866d++;
                int i34 = this.f12867e;
                long[] jArr7 = this.a;
                int i35 = iE >> 3;
                long j24 = jArr7[i35];
                int i36 = (iE & 7) << 3;
                this.f12867e = i34 - (((j24 >> i36) & j8) == j7 ? 1 : 0);
                int i37 = this.f12865c;
                long j25 = (j24 & (~(j8 << i36))) | (j9 << i36);
                jArr7[i35] = j25;
                jArr7[(((iE - 7) & i37) + (i37 & 7)) >> 3] = j25;
                return iE;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
            i10 = i16;
            i7 = i18;
        }
    }

    public final int e(int i7) {
        int i8 = this.f12865c;
        int i9 = i7 & i8;
        int i10 = 0;
        while (true) {
            long[] jArr = this.a;
            int i11 = i9 >> 3;
            int i12 = (i9 & 7) << 3;
            long j7 = ((jArr[i11 + 1] << (64 - i12)) & ((-i12) >> 63)) | (jArr[i11] >>> i12);
            long j8 = j7 & ((~j7) << 7) & (-9187201950435737472L);
            if (j8 != 0) {
                return (i9 + (Long.numberOfTrailingZeros(j8) >> 3)) & i8;
            }
            i10 += 8;
            i9 = (i9 + i10) & i8;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 1
            if (r1 != r0) goto L8
            return r2
        L8:
            boolean r3 = r1 instanceof m.C1472B
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            m.B r1 = (m.C1472B) r1
            int r3 = r1.f12866d
            int r5 = r0.f12866d
            if (r3 == r5) goto L17
            return r4
        L17:
            java.lang.Object[] r3 = r0.f12864b
            long[] r5 = r0.a
            int r6 = r5.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L5d
            r7 = r4
        L21:
            r8 = r5[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L58
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r4
        L3b:
            if (r12 >= r10) goto L56
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.32E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L52
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r3[r13]
            boolean r13 = r1.c(r13)
            if (r13 != 0) goto L52
            return r4
        L52:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L3b
        L56:
            if (r10 != r11) goto L5d
        L58:
            if (r7 == r6) goto L5d
            int r7 = r7 + 1
            goto L21
        L5d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: m.C1472B.equals(java.lang.Object):boolean");
    }

    public final void f(int i7) {
        long[] jArr;
        int iMax = i7 > 0 ? Math.max(7, AbstractC1475E.e(i7)) : 0;
        this.f12865c = iMax;
        if (iMax == 0) {
            jArr = AbstractC1475E.a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            P3.m.e0(jArr);
        }
        this.a = jArr;
        int i8 = iMax >> 3;
        long j7 = 255 << ((iMax & 7) << 3);
        jArr[i8] = (jArr[i8] & (~j7)) | j7;
        this.f12867e = AbstractC1475E.c(this.f12865c) - this.f12866d;
        this.f12864b = new Object[iMax];
    }

    public final boolean g() {
        return this.f12866d == 0;
    }

    public final boolean h() {
        return this.f12866d != 0;
    }

    public final int hashCode() {
        Object[] objArr = this.f12864b;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i7 = 0;
        int iHashCode = 0;
        while (true) {
            long j7 = jArr[i7];
            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i7 - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j7) < 128) {
                        Object obj = objArr[(i7 << 3) + i9];
                        iHashCode += obj != null ? obj.hashCode() : 0;
                    }
                    j7 >>= 8;
                }
                if (i8 != 8) {
                    return iHashCode;
                }
            }
            if (i7 == length) {
                return iHashCode;
            }
            i7++;
        }
    }

    public final void i(C1472B c1472b) {
        kotlin.jvm.internal.l.f("elements", c1472b);
        Object[] objArr = c1472b.f12864b;
        long[] jArr = c1472b.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i7 = 0;
        while (true) {
            long j7 = jArr[i7];
            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i7 - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j7) < 128) {
                        Object obj = objArr[(i7 << 3) + i9];
                        this.f12864b[d(obj)] = obj;
                    }
                    j7 >>= 8;
                }
                if (i8 != 8) {
                    return;
                }
            }
            if (i7 == length) {
                return;
            } else {
                i7++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean j(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r1 == 0) goto Lc
            int r3 = r1.hashCode()
            goto Ld
        Lc:
            r3 = r2
        Ld:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0.f12865c
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.a
            int r8 = r3 >> 3
            r9 = r3 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r12 = 1
            int r8 = r8 + r12
            r13 = r7[r8]
            int r7 = 64 - r9
            long r7 = r13 << r7
            long r13 = (long) r9
            long r13 = -r13
            r9 = 63
            long r13 = r13 >> r9
            long r7 = r7 & r13
            long r7 = r7 | r10
            long r9 = (long) r4
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L48:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L67
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r3
            r11 = r11 & r5
            java.lang.Object[] r15 = r0.f12864b
            r15 = r15[r11]
            boolean r15 = kotlin.jvm.internal.l.a(r15, r1)
            if (r15 == 0) goto L61
            goto L71
        L61:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L48
        L67:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 == 0) goto L7a
            r11 = -1
        L71:
            if (r11 < 0) goto L74
            r2 = r12
        L74:
            if (r2 == 0) goto L79
            r0.k(r11)
        L79:
            return r2
        L7a:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: m.C1472B.j(java.lang.Object):boolean");
    }

    public final void k(int i7) {
        this.f12866d--;
        long[] jArr = this.a;
        int i8 = this.f12865c;
        int i9 = i7 >> 3;
        int i10 = (i7 & 7) << 3;
        long j7 = (jArr[i9] & (~(255 << i10))) | (254 << i10);
        jArr[i9] = j7;
        jArr[(((i7 - 7) & i8) + (i8 & 7)) >> 3] = j7;
        this.f12864b[i7] = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0066 A[PHI: r7
      0x0066: PHI (r7v2 int) = (r7v1 int), (r7v3 int) binds: [B:6:0x0026, B:21:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r17 = this;
            r0 = r17
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "["
            r1.append(r2)
            java.lang.Object[] r2 = r0.f12864b
            long[] r3 = r0.a
            int r4 = r3.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto L6b
            r5 = 0
            r6 = r5
            r7 = r6
        L18:
            r8 = r3[r6]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L66
            int r10 = r6 - r4
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r5
        L32:
            if (r12 >= r10) goto L64
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.32E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L60
            int r13 = r6 << 3
            int r13 = r13 + r12
            r13 = r2[r13]
            r14 = -1
            if (r7 != r14) goto L4b
            java.lang.String r2 = "..."
            r1.append(r2)
            goto L70
        L4b:
            if (r7 == 0) goto L52
            java.lang.String r14 = ", "
            r1.append(r14)
        L52:
            if (r13 != r0) goto L57
            java.lang.String r13 = "(this)"
            goto L5b
        L57:
            java.lang.String r13 = java.lang.String.valueOf(r13)
        L5b:
            r1.append(r13)
            int r7 = r7 + 1
        L60:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L32
        L64:
            if (r10 != r11) goto L6b
        L66:
            if (r6 == r4) goto L6b
            int r6 = r6 + 1
            goto L18
        L6b:
            java.lang.String r2 = "]"
            r1.append(r2)
        L70:
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.l.e(r2, r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: m.C1472B.toString():java.lang.String");
    }

    public /* synthetic */ C1472B() {
        this(6);
    }
}
