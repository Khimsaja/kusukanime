package m;

import b1.AbstractC0703b;
import java.util.NoSuchElementException;

/* renamed from: m.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1494o {
    public long[] a = AbstractC1475E.a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f12900b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f12901c;

    /* renamed from: d, reason: collision with root package name */
    public int f12902d;

    /* renamed from: e, reason: collision with root package name */
    public int f12903e;

    /* renamed from: f, reason: collision with root package name */
    public int f12904f;

    public C1494o() {
        int[] iArr = AbstractC1490k.a;
        this.f12900b = iArr;
        this.f12901c = iArr;
        f(AbstractC1475E.f(6));
    }

    public final void a() {
        this.f12903e = 0;
        long[] jArr = this.a;
        if (jArr != AbstractC1475E.a) {
            P3.m.e0(jArr);
            long[] jArr2 = this.a;
            int i7 = this.f12902d;
            int i8 = i7 >> 3;
            long j7 = 255 << ((i7 & 7) << 3);
            jArr2[i8] = (jArr2[i8] & (~j7)) | j7;
        }
        this.f12904f = AbstractC1475E.c(this.f12902d) - this.f12903e;
    }

    public final int b(int i7) {
        int i8 = this.f12902d;
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

    public final int c(int i7) {
        int iHashCode = Integer.hashCode(i7) * (-862048943);
        int i8 = iHashCode ^ (iHashCode << 16);
        int i9 = i8 & 127;
        int i10 = this.f12902d;
        int i11 = (i8 >>> 7) & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.a;
            int i13 = i11 >> 3;
            int i14 = (i11 & 7) << 3;
            long j7 = ((jArr[i13 + 1] << (64 - i14)) & ((-i14) >> 63)) | (jArr[i13] >>> i14);
            long j8 = (i9 * 72340172838076673L) ^ j7;
            for (long j9 = (~j8) & (j8 - 72340172838076673L) & (-9187201950435737472L); j9 != 0; j9 &= j9 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j9) >> 3) + i11) & i10;
                if (this.f12900b[iNumberOfTrailingZeros] == i7) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j7 & ((~j7) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i12 += 8;
            i11 = (i11 + i12) & i10;
        }
    }

    public final int d(int i7) {
        int iC = c(i7);
        if (iC >= 0) {
            return this.f12901c[iC];
        }
        throw new NoSuchElementException(AbstractC0703b.g(i7, "Cannot find value for key "));
    }

    public final int e(int i7) {
        int iC = c(i7);
        if (iC >= 0) {
            return this.f12901c[iC];
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005c  */
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
            boolean r3 = r1 instanceof m.C1494o
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            m.o r1 = (m.C1494o) r1
            int r3 = r1.f12903e
            int r5 = r0.f12903e
            if (r3 == r5) goto L17
            return r4
        L17:
            int[] r3 = r0.f12900b
            int[] r5 = r0.f12901c
            long[] r6 = r0.a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L61
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
            if (r11 == 0) goto L5c
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r4
        L3d:
            if (r13 >= r11) goto L5a
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.32E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L56
            int r14 = r8 << 3
            int r14 = r14 + r13
            r15 = r3[r14]
            r14 = r5[r14]
            int r15 = r1.d(r15)
            if (r14 == r15) goto L56
            return r4
        L56:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L3d
        L5a:
            if (r11 != r12) goto L61
        L5c:
            if (r8 == r7) goto L61
            int r8 = r8 + 1
            goto L23
        L61:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: m.C1494o.equals(java.lang.Object):boolean");
    }

    public final void f(int i7) {
        long[] jArr;
        int iMax = i7 > 0 ? Math.max(7, AbstractC1475E.e(i7)) : 0;
        this.f12902d = iMax;
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
        this.f12904f = AbstractC1475E.c(this.f12902d) - this.f12903e;
        this.f12900b = new int[iMax];
        this.f12901c = new int[iMax];
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x006e, code lost:
    
        r21 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x007a, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x007c, code lost:
    
        r2 = b(r4);
        r11 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0084, code lost:
    
        if (r40.f12904f != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0098, code lost:
    
        if (((r40.a[r2 >> 3] >> ((r2 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x009a, code lost:
    
        r33 = r9;
        r28 = 255;
        r30 = 1;
        r26 = 0;
        r16 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a6, code lost:
    
        r2 = r40.f12902d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a8, code lost:
    
        if (r2 <= 8) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00aa, code lost:
    
        r16 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c2, code lost:
    
        if (java.lang.Long.compare((r40.f12903e * 32) ^ Long.MIN_VALUE, (r2 * 25) ^ Long.MIN_VALUE) > 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c4, code lost:
    
        r2 = r40.a;
        r3 = r40.f12902d;
        r5 = r40.f12900b;
        r6 = r40.f12901c;
        m.AbstractC1475E.a(r2, r3);
        r13 = 0;
        r7 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00d3, code lost:
    
        if (r13 == r3) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d5, code lost:
    
        r24 = r13 >> 3;
        r27 = (r13 & 7) << 3;
        r25 = (r2[r24] >> r27) & r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00e3, code lost:
    
        if (r25 != 128) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e5, code lost:
    
        r39 = r13;
        r13 = r13 + 1;
        r7 = r39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ef, code lost:
    
        if (r25 == 254) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00f1, code lost:
    
        r13 = r13 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00f4, code lost:
    
        r25 = java.lang.Integer.hashCode(r5[r13]) * r21;
        r28 = r11;
        r11 = (r25 ^ (r25 << 16)) >>> 7;
        r12 = b(r11);
        r11 = r11 & r3;
        r30 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x011b, code lost:
    
        if ((((r12 - r11) & r3) / 8) != (((r13 - r11) & r3) / 8)) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x011d, code lost:
    
        r33 = r9;
        r2[r24] = (r2[r24] & (~(r28 << r27))) | ((r25 & 127) << r27);
        r2[r2.length - 1] = (r2[r15] & 72057594037927935L) | Long.MIN_VALUE;
        r13 = r13 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x013b, code lost:
    
        r11 = r28;
        r14 = r30;
        r9 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0142, code lost:
    
        r33 = r9;
        r8 = r12 >> 3;
        r35 = r2[r8];
        r9 = (r12 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0152, code lost:
    
        if (((r35 >> r9) & r28) != 128) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0154, code lost:
    
        r26 = r15;
        r2[r8] = ((r25 & 127) << r9) | (r35 & (~(r28 << r9)));
        r2[r24] = (r2[r24] & (~(r28 << r27))) | (128 << r27);
        r5[r12] = r5[r13];
        r5[r13] = r26;
        r6[r12] = r6[r13];
        r6[r13] = r26;
        r7 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x017d, code lost:
    
        r26 = r15;
        r2[r8] = ((r25 & 127) << r9) | (r35 & (~(r28 << r9)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x018d, code lost:
    
        if (r7 != (-1)) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x018f, code lost:
    
        r7 = m.AbstractC1475E.b(r2, r13 + 1, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0195, code lost:
    
        r5[r7] = r5[r12];
        r5[r12] = r5[r13];
        r5[r13] = r5[r7];
        r6[r7] = r6[r12];
        r6[r12] = r6[r13];
        r6[r13] = r6[r7];
        r13 = r13 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01af, code lost:
    
        r2[r2.length - 1] = (r2[r26] & 72057594037927935L) | Long.MIN_VALUE;
        r13 = r13 + 1;
        r15 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01c0, code lost:
    
        r33 = r9;
        r28 = r11;
        r30 = r14;
        r26 = r15;
        r40.f12904f = m.AbstractC1475E.c(r40.f12902d) - r40.f12903e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01d5, code lost:
    
        r33 = r9;
        r28 = 255;
        r30 = 1;
        r26 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01de, code lost:
    
        r16 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01e1, code lost:
    
        r2 = m.AbstractC1475E.d(r40.f12902d);
        r3 = r40.a;
        r5 = r40.f12900b;
        r6 = r40.f12901c;
        r7 = r40.f12902d;
        f(r2);
        r2 = r40.a;
        r8 = r40.f12900b;
        r9 = r40.f12901c;
        r10 = r40.f12902d;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01fc, code lost:
    
        if (r11 >= r7) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x020b, code lost:
    
        if (((r3[r11 >> 3] >> ((r11 & 7) << 3)) & 255) >= r16) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x020d, code lost:
    
        r12 = r5[r11];
        r13 = java.lang.Integer.hashCode(r12) * r21;
        r13 = r13 ^ (r13 << 16);
        r14 = b(r13 >>> 7);
        r15 = r2;
        r1 = r13 & 127;
        r13 = r14 >> 3;
        r18 = (r14 & 7) << 3;
        r1 = (r15[r13] & (~(255 << r18))) | (r1 << r18);
        r15[r13] = r1;
        r15[(((r14 - 7) & r10) + (r10 & 7)) >> 3] = r1;
        r8[r14] = r12;
        r9[r14] = r6[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0249, code lost:
    
        r15 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x024a, code lost:
    
        r11 = r11 + 1;
        r2 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0250, code lost:
    
        r2 = b(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0254, code lost:
    
        r40.f12903e++;
        r1 = r40.f12904f;
        r3 = r40.a;
        r4 = r2 >> 3;
        r5 = r3[r4];
        r7 = (r2 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x026c, code lost:
    
        if (((r5 >> r7) & r28) != r16) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x026f, code lost:
    
        r30 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0271, code lost:
    
        r40.f12904f = r1 - r30;
        r1 = r40.f12902d;
        r5 = (r5 & (~(r28 << r7))) | (r33 << r7);
        r3[r4] = r5;
        r3[(((r2 - 7) & r1) + (r1 & 7)) >> 3] = r5;
        r13 = ~r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(int r41, int r42) {
        /*
            Method dump skipped, instructions count: 677
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m.C1494o.g(int, int):void");
    }

    public final int hashCode() {
        int[] iArr = this.f12900b;
        int[] iArr2 = this.f12901c;
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
                        int i11 = iArr[i10];
                        iHashCode += Integer.hashCode(iArr2[i10]) ^ Integer.hashCode(i11);
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

    /* JADX WARN: Removed duplicated region for block: B:20:0x0066 A[PHI: r8
      0x0066: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002c, B:19:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r18 = this;
            r0 = r18
            int r1 = r0.f12903e
            if (r1 != 0) goto L9
            java.lang.String r1 = "{}"
            return r1
        L9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "{"
            r1.<init>(r2)
            int[] r2 = r0.f12900b
            int[] r3 = r0.f12901c
            long[] r4 = r0.a
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L6b
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
            if (r11 == 0) goto L66
            int r11 = r7 - r5
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r6
        L38:
            if (r13 >= r11) goto L64
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.32E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L60
            int r14 = r7 << 3
            int r14 = r14 + r13
            r15 = r2[r14]
            r14 = r3[r14]
            r1.append(r15)
            java.lang.String r15 = "="
            r1.append(r15)
            r1.append(r14)
            int r8 = r8 + 1
            int r14 = r0.f12903e
            if (r8 >= r14) goto L60
            java.lang.String r14 = ", "
            r1.append(r14)
        L60:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L38
        L64:
            if (r11 != r12) goto L6b
        L66:
            if (r7 == r5) goto L6b
            int r7 = r7 + 1
            goto L1e
        L6b:
            r2 = 125(0x7d, float:1.75E-43)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "s.append('}').toString()"
            kotlin.jvm.internal.l.e(r2, r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: m.C1494o.toString():java.lang.String");
    }
}
