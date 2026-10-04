package m;

/* renamed from: m.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1498s {
    public long[] a;

    /* renamed from: b, reason: collision with root package name */
    public long[] f12915b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f12916c;

    /* renamed from: d, reason: collision with root package name */
    public int f12917d;

    /* renamed from: e, reason: collision with root package name */
    public int f12918e;

    /* renamed from: f, reason: collision with root package name */
    public int f12919f;

    public final int a(int i7) {
        int i8 = this.f12917d;
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

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0063, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0065, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r15) {
        /*
            r14 = this;
            int r0 = java.lang.Long.hashCode(r15)
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r0 = r0 * r1
            int r1 = r0 << 16
            r0 = r0 ^ r1
            r1 = r0 & 127(0x7f, float:1.78E-43)
            int r2 = r14.f12917d
            int r0 = r0 >>> 7
            r0 = r0 & r2
            r3 = 0
        L13:
            long[] r4 = r14.a
            int r5 = r0 >> 3
            r6 = r0 & 7
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
            long r6 = (long) r1
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L3f:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L5c
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r0
            r10 = r10 & r2
            long[] r11 = r14.f12915b
            r12 = r11[r10]
            int r11 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r11 != 0) goto L56
            goto L66
        L56:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L3f
        L5c:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L6f
            r10 = -1
        L66:
            if (r10 < 0) goto L6d
            java.lang.Object[] r0 = r14.f12916c
            r0 = r0[r10]
            return r0
        L6d:
            r0 = 0
            return r0
        L6f:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: m.C1498s.b(long):java.lang.Object");
    }

    public final void c(int i7) {
        long[] jArr;
        int iMax = i7 > 0 ? Math.max(7, AbstractC1475E.e(i7)) : 0;
        this.f12917d = iMax;
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
        this.f12919f = AbstractC1475E.c(this.f12917d) - this.f12918e;
        this.f12915b = new long[iMax];
        this.f12916c = new Object[iMax];
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x006c, code lost:
    
        r19 = r2;
        r6 = '\b';
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0077, code lost:
    
        if (((((~r8) << 6) & r8) & (-9187201950435737472L)) == 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0079, code lost:
    
        r1 = a(r3);
        r7 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0081, code lost:
    
        if (r39.f12919f != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0093, code lost:
    
        if (((r39.a[r1 >> 3] >> ((r1 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0095, code lost:
    
        r31 = 255;
        r35 = 0;
        r36 = 1;
        r24 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x009f, code lost:
    
        r1 = r39.f12917d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a1, code lost:
    
        if (r1 <= 8) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b9, code lost:
    
        if (java.lang.Long.compare((r39.f12918e * 32) ^ Long.MIN_VALUE, (r1 * 25) ^ Long.MIN_VALUE) > 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00bb, code lost:
    
        r1 = r39.a;
        r2 = r39.f12917d;
        r9 = r39.f12915b;
        r14 = r39.f12916c;
        m.AbstractC1475E.a(r1, r2);
        r4 = 0;
        r5 = -1;
        r24 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00cb, code lost:
    
        if (r4 == r2) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00cd, code lost:
    
        r18 = r4 >> 3;
        r28 = (r4 & 7) << 3;
        r26 = (r1[r18] >> r28) & r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00db, code lost:
    
        if (r26 != 128) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00dd, code lost:
    
        r5 = r4;
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e7, code lost:
    
        if (r26 == 254) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e9, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ec, code lost:
    
        r26 = java.lang.Long.hashCode(r9[r4]) * r19;
        r27 = r6;
        r6 = (r26 ^ (r26 << 16)) >>> 7;
        r29 = a(r6);
        r6 = r6 & r2;
        r31 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0113, code lost:
    
        if ((((r29 - r6) & r2) / 8) != (((r4 - r6) & r2) / 8)) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0115, code lost:
    
        r35 = r12;
        r8 = r13;
        r1[r18] = ((r26 & 127) << r28) | (r1[r18] & (~(r31 << r28)));
        r1[r1.length - r8] = (r1[r35] & 72057594037927935L) | Long.MIN_VALUE;
        r4 = r4 + 1;
        r13 = r8;
        r6 = r27;
        r7 = r31;
        r12 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x013b, code lost:
    
        r35 = r12;
        r8 = r13;
        r6 = r29 >> 3;
        r12 = r1[r6];
        r7 = (r29 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x014c, code lost:
    
        if (((r12 >> r7) & r31) != 128) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x014e, code lost:
    
        r36 = r8;
        r30 = r9;
        r37 = r4;
        r1[r6] = ((~(r31 << r7)) & r12) | ((r26 & 127) << r7);
        r1[r18] = (r1[r18] & (~(r31 << r28))) | (128 << r28);
        r30[r29] = r30[r37];
        r30[r37] = 0;
        r14[r29] = r14[r37];
        r14[r37] = null;
        r4 = r37;
        r5 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x017c, code lost:
    
        r37 = r4;
        r36 = r8;
        r30 = r9;
        r1[r6] = ((~(r31 << r7)) & r12) | ((r26 & 127) << r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0190, code lost:
    
        if (r5 != (-1)) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0192, code lost:
    
        r5 = m.AbstractC1475E.b(r1, r37 + 1, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0198, code lost:
    
        r30[r5] = r30[r29];
        r30[r29] = r30[r37];
        r30[r37] = r30[r5];
        r14[r5] = r14[r29];
        r14[r29] = r14[r37];
        r14[r37] = r14[r5];
        r4 = r37 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01b2, code lost:
    
        r1[r1.length - 1] = (r1[r35] & 72057594037927935L) | Long.MIN_VALUE;
        r4 = r4 + 1;
        r6 = r27;
        r9 = r30;
        r7 = r31;
        r12 = r35;
        r13 = r36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01cb, code lost:
    
        r31 = r7;
        r35 = r12;
        r36 = r13;
        r39.f12919f = m.AbstractC1475E.c(r39.f12917d) - r39.f12918e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01de, code lost:
    
        r31 = 255;
        r35 = 0;
        r36 = 1;
        r24 = 128;
        r1 = m.AbstractC1475E.d(r39.f12917d);
        r2 = r39.a;
        r4 = r39.f12915b;
        r5 = r39.f12916c;
        r6 = r39.f12917d;
        c(r1);
        r1 = r39.a;
        r7 = r39.f12915b;
        r8 = r39.f12916c;
        r9 = r39.f12917d;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0201, code lost:
    
        if (r12 >= r6) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0210, code lost:
    
        if (((r2[r12 >> 3] >> ((r12 & 7) << 3)) & 255) >= 128) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0212, code lost:
    
        r13 = r4[r12];
        r15 = java.lang.Long.hashCode(r13) * r19;
        r15 = r15 ^ (r15 << 16);
        r16 = r1;
        r1 = a(r15 >>> 7);
        r17 = r2;
        r1 = r15 & 127;
        r15 = r1 >> 3;
        r20 = (r1 & 7) << 3;
        r1 = (r16[r15] & (~(255 << r20))) | (r1 << r20);
        r16[r15] = r1;
        r16[(((r1 - 7) & r9) + (r9 & 7)) >> 3] = r1;
        r7[r1] = r13;
        r8[r1] = r5[r12];
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0254, code lost:
    
        r16 = r1;
        r17 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0258, code lost:
    
        r12 = r12 + 1;
        r1 = r16;
        r2 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x025f, code lost:
    
        r1 = a(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0263, code lost:
    
        r16 = r1;
        r39.f12918e++;
        r1 = r39.f12919f;
        r2 = r39.a;
        r3 = r16 >> 3;
        r4 = r2[r3];
        r6 = (r16 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x027d, code lost:
    
        if (((r4 >> r6) & r31) != r24) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x027f, code lost:
    
        r35 = r36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0281, code lost:
    
        r39.f12919f = r1 - r35;
        r1 = r39.f12917d;
        r4 = (r4 & (~(r31 << r6))) | (r10 << r6);
        r2[r3] = r4;
        r2[(((r16 - 7) & r1) + (r1 & 7)) >> 3] = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(long r40, m.C1502w r42) {
        /*
            Method dump skipped, instructions count: 687
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m.C1498s.d(long, m.w):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00db, code lost:
    
        if (((r2 & ((~r2) << 6)) & r20) == 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00dd, code lost:
    
        r0 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r30) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m.C1498s.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        long[] jArr = this.f12915b;
        Object[] objArr = this.f12916c;
        long[] jArr2 = this.a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i7 = 0;
        int iHashCode = 0;
        while (true) {
            long j7 = jArr2[i7];
            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i7 - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j7) < 128) {
                        int i10 = (i7 << 3) + i9;
                        long j8 = jArr[i10];
                        Object obj = objArr[i10];
                        iHashCode += (obj != null ? obj.hashCode() : 0) ^ Long.hashCode(j8);
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

    public final String toString() {
        int i7;
        int i8;
        if (this.f12918e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        long[] jArr = this.f12915b;
        Object[] objArr = this.f12916c;
        long[] jArr2 = this.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i9 = 0;
            int i10 = 0;
            while (true) {
                long j7 = jArr2[i9];
                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i9 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((255 & j7) < 128) {
                            int i13 = (i9 << 3) + i12;
                            i8 = i9;
                            long j8 = jArr[i13];
                            Object obj = objArr[i13];
                            sb.append(j8);
                            sb.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            i10++;
                            if (i10 < this.f12918e) {
                                sb.append(", ");
                            }
                        } else {
                            i8 = i9;
                        }
                        j7 >>= 8;
                        i12++;
                        i9 = i8;
                    }
                    int i14 = i9;
                    if (i11 != 8) {
                        break;
                    }
                    i7 = i14;
                } else {
                    i7 = i9;
                }
                if (i7 == length) {
                    break;
                }
                i9 = i7 + 1;
            }
        }
        sb.append('}');
        String string = sb.toString();
        kotlin.jvm.internal.l.e("s.append('}').toString()", string);
        return string;
    }
}
