package m;

import n.AbstractC1529a;

/* renamed from: m.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1504y {
    public long[] a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f12940b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f12941c;

    /* renamed from: d, reason: collision with root package name */
    public int f12942d;

    /* renamed from: e, reason: collision with root package name */
    public int f12943e;

    /* renamed from: f, reason: collision with root package name */
    public int f12944f;

    public C1504y(int i7) {
        this.a = AbstractC1475E.a;
        Object[] objArr = AbstractC1529a.f13115c;
        this.f12940b = objArr;
        this.f12941c = objArr;
        if (i7 >= 0) {
            f(AbstractC1475E.f(i7));
        } else {
            AbstractC1529a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void a() {
        this.f12943e = 0;
        long[] jArr = this.a;
        if (jArr != AbstractC1475E.a) {
            P3.m.e0(jArr);
            long[] jArr2 = this.a;
            int i7 = this.f12942d;
            int i8 = i7 >> 3;
            long j7 = 255 << ((i7 & 7) << 3);
            jArr2[i8] = (jArr2[i8] & (~j7)) | j7;
        }
        P3.m.c0(this.f12941c, 0, this.f12942d);
        P3.m.c0(this.f12940b, 0, this.f12942d);
        this.f12944f = AbstractC1475E.c(this.f12942d) - this.f12943e;
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
    public final boolean b(java.lang.Object r18) {
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
            int r5 = r0.f12942d
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
            java.lang.Object[] r15 = r0.f12940b
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
        throw new UnsupportedOperationException("Method not decompiled: m.C1504y.b(java.lang.Object):boolean");
    }

    public final int c(int i7) {
        int i8 = this.f12942d;
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

    public final int d(Object obj) {
        long j7;
        long j8;
        long[] jArr;
        long[] jArr2;
        Object[] objArr;
        int i7;
        int i8 = -862048943;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i9 = iHashCode ^ (iHashCode << 16);
        int i10 = i9 >>> 7;
        int i11 = i9 & 127;
        int i12 = this.f12942d;
        int i13 = i10 & i12;
        int i14 = 0;
        while (true) {
            long[] jArr3 = this.a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            int i17 = 1;
            long j9 = ((jArr3[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr3[i15] >>> i16);
            long j10 = i11;
            int i18 = i11;
            int i19 = 0;
            long j11 = j9 ^ (j10 * 72340172838076673L);
            long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L);
            while (j12 != 0) {
                int iNumberOfTrailingZeros = (i13 + (Long.numberOfTrailingZeros(j12) >> 3)) & i12;
                int i20 = i8;
                if (kotlin.jvm.internal.l.a(this.f12940b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j12 &= j12 - 1;
                i8 = i20;
            }
            int i21 = i8;
            if ((((~j9) << 6) & j9 & (-9187201950435737472L)) != 0) {
                int iC = c(i10);
                long j13 = 128;
                long j14 = 255;
                if (this.f12944f != 0 || ((this.a[iC >> 3] >> ((iC & 7) << 3)) & 255) == 254) {
                    j7 = 128;
                    j8 = 255;
                } else {
                    int i22 = this.f12942d;
                    if (i22 <= 8 || Long.compare((this.f12943e * 32) ^ Long.MIN_VALUE, (i22 * 25) ^ Long.MIN_VALUE) > 0) {
                        j7 = 128;
                        j8 = 255;
                        int iD = AbstractC1475E.d(this.f12942d);
                        long[] jArr4 = this.a;
                        Object[] objArr2 = this.f12940b;
                        Object[] objArr3 = this.f12941c;
                        int i23 = this.f12942d;
                        f(iD);
                        long[] jArr5 = this.a;
                        Object[] objArr4 = this.f12940b;
                        Object[] objArr5 = this.f12941c;
                        int i24 = this.f12942d;
                        int i25 = 0;
                        while (i25 < i23) {
                            if (((jArr4[i25 >> 3] >> ((i25 & 7) << 3)) & 255) < 128) {
                                Object obj2 = objArr2[i25];
                                int iHashCode2 = (obj2 != null ? obj2.hashCode() : i19) * i21;
                                int i26 = iHashCode2 ^ (iHashCode2 << 16);
                                int iC2 = c(i26 >>> 7);
                                jArr = jArr5;
                                jArr2 = jArr4;
                                long j15 = i26 & 127;
                                int i27 = iC2 >> 3;
                                int i28 = (iC2 & 7) << 3;
                                long j16 = (jArr[i27] & (~(255 << i28))) | (j15 << i28);
                                jArr[i27] = j16;
                                jArr[(((iC2 - 7) & i24) + (i24 & 7)) >> 3] = j16;
                                objArr4[iC2] = obj2;
                                objArr5[iC2] = objArr3[i25];
                            } else {
                                jArr = jArr5;
                                jArr2 = jArr4;
                            }
                            i25++;
                            jArr4 = jArr2;
                            jArr5 = jArr;
                            i19 = 0;
                        }
                    } else {
                        long[] jArr6 = this.a;
                        int i29 = this.f12942d;
                        Object[] objArr6 = this.f12940b;
                        Object[] objArr7 = this.f12941c;
                        AbstractC1475E.a(jArr6, i29);
                        int i30 = 0;
                        int iB = -1;
                        while (i30 != i29) {
                            int i31 = i30 >> 3;
                            int i32 = (i30 & 7) << 3;
                            long j17 = (jArr6[i31] >> i32) & j14;
                            if (j17 == j13) {
                                int i33 = i30;
                                i30++;
                                iB = i33;
                            } else if (j17 != 254) {
                                i30++;
                            } else {
                                Object obj3 = objArr6[i30];
                                int iHashCode3 = (obj3 != null ? obj3.hashCode() : 0) * i21;
                                long j18 = j13;
                                int i34 = (iHashCode3 ^ (iHashCode3 << 16)) >>> 7;
                                int iC3 = c(i34);
                                int i35 = i34 & i29;
                                long j19 = j14;
                                if (((iC3 - i35) & i29) / 8 == ((i30 - i35) & i29) / 8) {
                                    jArr6[i31] = ((r22 & 127) << i32) | (jArr6[i31] & (~(j19 << i32)));
                                    jArr6[jArr6.length - 1] = jArr6[0];
                                    i30++;
                                    j13 = j18;
                                    j14 = j19;
                                } else {
                                    int i36 = i30;
                                    int i37 = iC3 >> 3;
                                    long j20 = jArr6[i37];
                                    int i38 = (iC3 & 7) << 3;
                                    if (((j20 >> i38) & j19) == j18) {
                                        objArr = objArr6;
                                        jArr6[i37] = ((~(j19 << i38)) & j20) | ((r22 & 127) << i38);
                                        jArr6[i31] = (jArr6[i31] & (~(j19 << i32))) | (j18 << i32);
                                        objArr[iC3] = objArr[i36];
                                        objArr[i36] = null;
                                        objArr7[iC3] = objArr7[i36];
                                        objArr7[i36] = null;
                                        iB = i36;
                                        i7 = iB;
                                    } else {
                                        objArr = objArr6;
                                        jArr6[i37] = ((~(j19 << i38)) & j20) | ((r22 & 127) << i38);
                                        if (iB == -1) {
                                            iB = AbstractC1475E.b(jArr6, i36 + 1, i29);
                                        }
                                        objArr[iB] = objArr[iC3];
                                        objArr[iC3] = objArr[i36];
                                        objArr[i36] = objArr[iB];
                                        objArr7[iB] = objArr7[iC3];
                                        objArr7[iC3] = objArr7[i36];
                                        objArr7[i36] = objArr7[iB];
                                        i7 = i36 - 1;
                                    }
                                    jArr6[jArr6.length - 1] = jArr6[0];
                                    objArr6 = objArr;
                                    j14 = j19;
                                    i30 = i7 + 1;
                                    j13 = j18;
                                }
                            }
                        }
                        j7 = j13;
                        j8 = j14;
                        this.f12944f = AbstractC1475E.c(this.f12942d) - this.f12943e;
                    }
                    iC = c(i10);
                }
                this.f12943e++;
                int i39 = this.f12944f;
                long[] jArr7 = this.a;
                int i40 = iC >> 3;
                long j21 = jArr7[i40];
                int i41 = (iC & 7) << 3;
                if (((j21 >> i41) & j8) != j7) {
                    i17 = 0;
                }
                this.f12944f = i39 - i17;
                int i42 = this.f12942d;
                long j22 = (j21 & (~(j8 << i41))) | (j10 << i41);
                jArr7[i40] = j22;
                jArr7[(((iC - 7) & i42) + (i42 & 7)) >> 3] = j22;
                return ~iC;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
            i11 = i18;
            i8 = i21;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.Object r14) {
        /*
            r13 = this;
            r0 = 0
            if (r14 == 0) goto L8
            int r1 = r14.hashCode()
            goto L9
        L8:
            r1 = r0
        L9:
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r13.f12942d
            int r1 = r1 >>> 7
        L16:
            r1 = r1 & r3
            long[] r4 = r13.a
            int r5 = r1 >> 3
            r6 = r1 & 7
            int r6 = r6 << 3
            r7 = r4[r5]
            long r7 = r7 >>> r6
            int r5 = r5 + 1
            r9 = r4[r5]
            int r4 = 64 - r6
            long r4 = r9 << r4
            long r9 = (long) r6
            long r9 = -r9
            r6 = 63
            long r9 = r9 >> r6
            long r4 = r4 & r9
            long r4 = r4 | r7
            long r6 = (long) r2
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L43:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L62
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            java.lang.Object[] r11 = r13.f12940b
            r11 = r11[r10]
            boolean r11 = kotlin.jvm.internal.l.a(r11, r14)
            if (r11 == 0) goto L5c
            goto L6c
        L5c:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L43
        L62:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L75
            r10 = -1
        L6c:
            if (r10 < 0) goto L73
            java.lang.Object[] r14 = r13.f12941c
            r14 = r14[r10]
            return r14
        L73:
            r14 = 0
            return r14
        L75:
            int r0 = r0 + 8
            int r1 = r1 + r0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: m.C1504y.e(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
    
        return false;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = 1
            if (r1 != r0) goto L8
            return r2
        L8:
            boolean r3 = r1 instanceof m.C1504y
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            m.y r1 = (m.C1504y) r1
            int r3 = r1.f12943e
            int r5 = r0.f12943e
            if (r3 == r5) goto L17
            return r4
        L17:
            java.lang.Object[] r3 = r0.f12940b
            java.lang.Object[] r5 = r0.f12941c
            long[] r6 = r0.a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L74
            r8 = r4
        L23:
            r9 = r6[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L6f
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r4
        L3d:
            if (r13 >= r11) goto L6d
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.32E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L69
            int r14 = r8 << 3
            int r14 = r14 + r13
            r15 = r3[r14]
            r14 = r5[r14]
            if (r14 != 0) goto L5e
            java.lang.Object r14 = r1.e(r15)
            if (r14 != 0) goto L5d
            boolean r14 = r1.b(r15)
            if (r14 != 0) goto L69
        L5d:
            return r4
        L5e:
            java.lang.Object r15 = r1.e(r15)
            boolean r14 = r14.equals(r15)
            if (r14 != 0) goto L69
            return r4
        L69:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L3d
        L6d:
            if (r11 != r12) goto L74
        L6f:
            if (r8 == r7) goto L74
            int r8 = r8 + 1
            goto L23
        L74:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: m.C1504y.equals(java.lang.Object):boolean");
    }

    public final void f(int i7) {
        long[] jArr;
        int iMax = i7 > 0 ? Math.max(7, AbstractC1475E.e(i7)) : 0;
        this.f12942d = iMax;
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
        this.f12944f = AbstractC1475E.c(this.f12942d) - this.f12943e;
        this.f12940b = new Object[iMax];
        this.f12941c = new Object[iMax];
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.Object r14) {
        /*
            r13 = this;
            r0 = 0
            if (r14 == 0) goto L8
            int r1 = r14.hashCode()
            goto L9
        L8:
            r1 = r0
        L9:
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r13.f12942d
            int r1 = r1 >>> 7
        L16:
            r1 = r1 & r3
            long[] r4 = r13.a
            int r5 = r1 >> 3
            r6 = r1 & 7
            int r6 = r6 << 3
            r7 = r4[r5]
            long r7 = r7 >>> r6
            int r5 = r5 + 1
            r9 = r4[r5]
            int r4 = 64 - r6
            long r4 = r9 << r4
            long r9 = (long) r6
            long r9 = -r9
            r6 = 63
            long r9 = r9 >> r6
            long r4 = r4 & r9
            long r4 = r4 | r7
            long r6 = (long) r2
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L43:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L62
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            java.lang.Object[] r11 = r13.f12940b
            r11 = r11[r10]
            boolean r11 = kotlin.jvm.internal.l.a(r11, r14)
            if (r11 == 0) goto L5c
            goto L6c
        L5c:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L43
        L62:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L75
            r10 = -1
        L6c:
            if (r10 < 0) goto L73
            java.lang.Object r14 = r13.h(r10)
            return r14
        L73:
            r14 = 0
            return r14
        L75:
            int r0 = r0 + 8
            int r1 = r1 + r0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: m.C1504y.g(java.lang.Object):java.lang.Object");
    }

    public final Object h(int i7) {
        this.f12943e--;
        long[] jArr = this.a;
        int i8 = this.f12942d;
        int i9 = i7 >> 3;
        int i10 = (i7 & 7) << 3;
        long j7 = (jArr[i9] & (~(255 << i10))) | (254 << i10);
        jArr[i9] = j7;
        jArr[(((i7 - 7) & i8) + (i8 & 7)) >> 3] = j7;
        this.f12940b[i7] = null;
        Object[] objArr = this.f12941c;
        Object obj = objArr[i7];
        objArr[i7] = null;
        return obj;
    }

    public final int hashCode() {
        Object[] objArr = this.f12940b;
        Object[] objArr2 = this.f12941c;
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
                        int i10 = (i7 << 3) + i9;
                        Object obj = objArr[i10];
                        Object obj2 = objArr2[i10];
                        iHashCode += (obj2 != null ? obj2.hashCode() : 0) ^ (obj != null ? obj.hashCode() : 0);
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

    public final void i(Object obj, Object obj2) {
        int iD = d(obj);
        if (iD < 0) {
            iD = ~iD;
        }
        this.f12940b[iD] = obj;
        this.f12941c[iD] = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0070 A[PHI: r8
      0x0070: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002c, B:25:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r18 = this;
            r0 = r18
            int r1 = r0.f12943e
            if (r1 != 0) goto L9
            java.lang.String r1 = "{}"
            return r1
        L9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "{"
            r1.<init>(r2)
            java.lang.Object[] r2 = r0.f12940b
            java.lang.Object[] r3 = r0.f12941c
            long[] r4 = r0.a
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L75
            r6 = 0
            r7 = r6
            r8 = r7
        L1e:
            r9 = r4[r7]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L70
            int r11 = r7 - r5
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r6
        L38:
            if (r13 >= r11) goto L6e
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.32E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L6a
            int r14 = r7 << 3
            int r14 = r14 + r13
            r15 = r2[r14]
            r14 = r3[r14]
            java.lang.String r16 = "(this)"
            if (r15 != r0) goto L50
            r15 = r16
        L50:
            r1.append(r15)
            java.lang.String r15 = "="
            r1.append(r15)
            if (r14 != r0) goto L5c
            r14 = r16
        L5c:
            r1.append(r14)
            int r8 = r8 + 1
            int r14 = r0.f12943e
            if (r8 >= r14) goto L6a
            java.lang.String r14 = ", "
            r1.append(r14)
        L6a:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L38
        L6e:
            if (r11 != r12) goto L75
        L70:
            if (r7 == r5) goto L75
            int r7 = r7 + 1
            goto L1e
        L75:
            r2 = 125(0x7d, float:1.75E-43)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "s.append('}').toString()"
            kotlin.jvm.internal.l.e(r2, r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: m.C1504y.toString():java.lang.String");
    }

    public /* synthetic */ C1504y() {
        this(6);
    }
}
