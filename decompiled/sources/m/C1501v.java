package m;

import java.util.NoSuchElementException;
import n.AbstractC1529a;

/* renamed from: m.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1501v {
    public long[] a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f12929b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f12930c;

    /* renamed from: d, reason: collision with root package name */
    public int f12931d;

    /* renamed from: e, reason: collision with root package name */
    public int f12932e;

    /* renamed from: f, reason: collision with root package name */
    public int f12933f;

    public C1501v(int i7) {
        this.a = AbstractC1475E.a;
        this.f12929b = AbstractC1529a.f13115c;
        this.f12930c = AbstractC1490k.a;
        if (i7 >= 0) {
            d(AbstractC1475E.f(i7));
        } else {
            AbstractC1529a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final int a(int i7) {
        int i8 = this.f12931d;
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

    public final int b(Object obj) {
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
        int i12 = this.f12931d;
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
                if (kotlin.jvm.internal.l.a(this.f12929b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j12 &= j12 - 1;
                i8 = i20;
            }
            int i21 = i8;
            if ((((~j9) << 6) & j9 & (-9187201950435737472L)) != 0) {
                int iA = a(i10);
                long j13 = 128;
                long j14 = 255;
                if (this.f12933f != 0 || ((this.a[iA >> 3] >> ((iA & 7) << 3)) & 255) == 254) {
                    j7 = 128;
                    j8 = 255;
                } else {
                    int i22 = this.f12931d;
                    if (i22 <= 8 || Long.compare((this.f12932e * 32) ^ Long.MIN_VALUE, (i22 * 25) ^ Long.MIN_VALUE) > 0) {
                        j7 = 128;
                        j8 = 255;
                        int iD = AbstractC1475E.d(this.f12931d);
                        long[] jArr4 = this.a;
                        Object[] objArr2 = this.f12929b;
                        int[] iArr = this.f12930c;
                        int i23 = this.f12931d;
                        d(iD);
                        long[] jArr5 = this.a;
                        Object[] objArr3 = this.f12929b;
                        int[] iArr2 = this.f12930c;
                        int i24 = this.f12931d;
                        int i25 = 0;
                        while (i25 < i23) {
                            if (((jArr4[i25 >> 3] >> ((i25 & 7) << 3)) & 255) < 128) {
                                Object obj2 = objArr2[i25];
                                int iHashCode2 = (obj2 != null ? obj2.hashCode() : i19) * i21;
                                int i26 = iHashCode2 ^ (iHashCode2 << 16);
                                int iA2 = a(i26 >>> 7);
                                jArr = jArr5;
                                jArr2 = jArr4;
                                long j15 = i26 & 127;
                                int i27 = iA2 >> 3;
                                int i28 = (iA2 & 7) << 3;
                                long j16 = (jArr[i27] & (~(255 << i28))) | (j15 << i28);
                                jArr[i27] = j16;
                                jArr[(((iA2 - 7) & i24) + (i24 & 7)) >> 3] = j16;
                                objArr3[iA2] = obj2;
                                iArr2[iA2] = iArr[i25];
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
                        int i29 = this.f12931d;
                        Object[] objArr4 = this.f12929b;
                        int[] iArr3 = this.f12930c;
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
                                Object obj3 = objArr4[i30];
                                int iHashCode3 = (obj3 != null ? obj3.hashCode() : 0) * i21;
                                long j18 = j13;
                                int i34 = (iHashCode3 ^ (iHashCode3 << 16)) >>> 7;
                                int iA3 = a(i34);
                                int i35 = i34 & i29;
                                long j19 = j14;
                                if (((iA3 - i35) & i29) / 8 == ((i30 - i35) & i29) / 8) {
                                    jArr6[i31] = ((r24 & 127) << i32) | (jArr6[i31] & (~(j19 << i32)));
                                    jArr6[jArr6.length - 1] = (jArr6[0] & 72057594037927935L) | Long.MIN_VALUE;
                                    i30++;
                                    j13 = j18;
                                    j14 = j19;
                                } else {
                                    int i36 = i30;
                                    int i37 = iA3 >> 3;
                                    long j20 = jArr6[i37];
                                    int i38 = (iA3 & 7) << 3;
                                    if (((j20 >> i38) & j19) == j18) {
                                        objArr = objArr4;
                                        jArr6[i37] = ((~(j19 << i38)) & j20) | ((r24 & 127) << i38);
                                        jArr6[i31] = (jArr6[i31] & (~(j19 << i32))) | (j18 << i32);
                                        objArr[iA3] = objArr[i36];
                                        objArr[i36] = null;
                                        iArr3[iA3] = iArr3[i36];
                                        iArr3[i36] = 0;
                                        iB = i36;
                                        i7 = iB;
                                    } else {
                                        objArr = objArr4;
                                        jArr6[i37] = ((~(j19 << i38)) & j20) | ((r24 & 127) << i38);
                                        if (iB == -1) {
                                            iB = AbstractC1475E.b(jArr6, i36 + 1, i29);
                                        }
                                        objArr[iB] = objArr[iA3];
                                        objArr[iA3] = objArr[i36];
                                        objArr[i36] = objArr[iB];
                                        iArr3[iB] = iArr3[iA3];
                                        iArr3[iA3] = iArr3[i36];
                                        iArr3[i36] = iArr3[iB];
                                        i7 = i36 - 1;
                                    }
                                    jArr6[jArr6.length - 1] = (jArr6[0] & 72057594037927935L) | Long.MIN_VALUE;
                                    objArr4 = objArr;
                                    j14 = j19;
                                    i30 = i7 + 1;
                                    j13 = j18;
                                }
                            }
                        }
                        j7 = j13;
                        j8 = j14;
                        this.f12933f = AbstractC1475E.c(this.f12931d) - this.f12932e;
                    }
                    iA = a(i10);
                }
                this.f12932e++;
                int i39 = this.f12933f;
                long[] jArr7 = this.a;
                int i40 = iA >> 3;
                long j21 = jArr7[i40];
                int i41 = (iA & 7) << 3;
                if (((j21 >> i41) & j8) != j7) {
                    i17 = 0;
                }
                this.f12933f = i39 - i17;
                int i42 = this.f12931d;
                long j22 = (j21 & (~(j8 << i41))) | (j10 << i41);
                jArr7[i40] = j22;
                jArr7[(((iA - 7) & i42) + (i42 & 7)) >> 3] = j22;
                return ~iA;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
            i11 = i18;
            i8 = i21;
        }
    }

    public final int c(Object obj) {
        int i7 = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i8 = iHashCode ^ (iHashCode << 16);
        int i9 = i8 & 127;
        int i10 = this.f12931d;
        int i11 = i8 >>> 7;
        while (true) {
            int i12 = i11 & i10;
            long[] jArr = this.a;
            int i13 = i12 >> 3;
            int i14 = (i12 & 7) << 3;
            long j7 = ((jArr[i13 + 1] << (64 - i14)) & ((-i14) >> 63)) | (jArr[i13] >>> i14);
            long j8 = (i9 * 72340172838076673L) ^ j7;
            for (long j9 = (~j8) & (j8 - 72340172838076673L) & (-9187201950435737472L); j9 != 0; j9 &= j9 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j9) >> 3) + i12) & i10;
                if (kotlin.jvm.internal.l.a(this.f12929b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j7 & ((~j7) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i7 += 8;
            i11 = i12 + i7;
        }
    }

    public final void d(int i7) {
        long[] jArr;
        int iMax = i7 > 0 ? Math.max(7, AbstractC1475E.e(i7)) : 0;
        this.f12931d = iMax;
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
        this.f12933f = AbstractC1475E.c(this.f12931d) - this.f12932e;
        this.f12929b = new Object[iMax];
        this.f12930c = new int[iMax];
    }

    public final void e(int i7) {
        this.f12932e--;
        long[] jArr = this.a;
        int i8 = this.f12931d;
        int i9 = i7 >> 3;
        int i10 = (i7 & 7) << 3;
        long j7 = (jArr[i9] & (~(255 << i10))) | (254 << i10);
        jArr[i9] = j7;
        jArr[(((i7 - 7) & i8) + (i8 & 7)) >> 3] = j7;
        this.f12929b[i7] = null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1501v) {
            C1501v c1501v = (C1501v) obj;
            if (c1501v.f12932e == this.f12932e) {
                Object[] objArr = this.f12929b;
                int[] iArr = this.f12930c;
                long[] jArr = this.a;
                int length = jArr.length - 2;
                if (length < 0) {
                    return true;
                }
                int i7 = 0;
                loop0: while (true) {
                    long j7 = jArr[i7];
                    if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i8 = 8 - ((~(i7 - length)) >>> 31);
                        for (int i9 = 0; i9 < i8; i9++) {
                            if ((255 & j7) < 128) {
                                int i10 = (i7 << 3) + i9;
                                Object obj2 = objArr[i10];
                                int i11 = iArr[i10];
                                int iC = c1501v.c(obj2);
                                if (iC < 0) {
                                    throw new NoSuchElementException("There is no key " + obj2 + " in the map");
                                }
                                if (i11 != c1501v.f12930c[iC]) {
                                    break loop0;
                                }
                            }
                            j7 >>= 8;
                        }
                        if (i8 != 8) {
                            return true;
                        }
                    }
                    if (i7 == length) {
                        return true;
                    }
                    i7++;
                }
            }
        }
        return false;
    }

    public final void f(int i7, Object obj) {
        int iB = b(obj);
        if (iB < 0) {
            iB = ~iB;
        }
        this.f12929b[iB] = obj;
        this.f12930c[iB] = i7;
    }

    public final int hashCode() {
        Object[] objArr = this.f12929b;
        int[] iArr = this.f12930c;
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
                        iHashCode += Integer.hashCode(iArr[i10]) ^ (obj != null ? obj.hashCode() : 0);
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

    /* JADX WARN: Removed duplicated region for block: B:23:0x006a A[PHI: r8
      0x006a: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002c, B:22:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r18 = this;
            r0 = r18
            int r1 = r0.f12932e
            if (r1 != 0) goto L9
            java.lang.String r1 = "{}"
            return r1
        L9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "{"
            r1.<init>(r2)
            java.lang.Object[] r2 = r0.f12929b
            int[] r3 = r0.f12930c
            long[] r4 = r0.a
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L6f
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
            if (r11 == 0) goto L6a
            int r11 = r7 - r5
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r6
        L38:
            if (r13 >= r11) goto L68
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.32E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L64
            int r14 = r7 << 3
            int r14 = r14 + r13
            r15 = r2[r14]
            r14 = r3[r14]
            if (r15 != r0) goto L4e
            java.lang.String r15 = "(this)"
        L4e:
            r1.append(r15)
            java.lang.String r15 = "="
            r1.append(r15)
            r1.append(r14)
            int r8 = r8 + 1
            int r14 = r0.f12932e
            if (r8 >= r14) goto L64
            java.lang.String r14 = ", "
            r1.append(r14)
        L64:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L38
        L68:
            if (r11 != r12) goto L6f
        L6a:
            if (r7 == r5) goto L6f
            int r7 = r7 + 1
            goto L1e
        L6f:
            r2 = 125(0x7d, float:1.75E-43)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "s.append('}').toString()"
            kotlin.jvm.internal.l.e(r2, r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: m.C1501v.toString():java.lang.String");
    }

    public /* synthetic */ C1501v() {
        this(6);
    }
}
