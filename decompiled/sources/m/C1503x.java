package m;

import java.util.NoSuchElementException;
import n.AbstractC1529a;

/* renamed from: m.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1503x {
    public long[] a = AbstractC1475E.a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f12935b = AbstractC1529a.f13115c;

    /* renamed from: c, reason: collision with root package name */
    public long[] f12936c = AbstractC1491l.a;

    /* renamed from: d, reason: collision with root package name */
    public int f12937d;

    /* renamed from: e, reason: collision with root package name */
    public int f12938e;

    /* renamed from: f, reason: collision with root package name */
    public int f12939f;

    public C1503x(int i7) {
        if (i7 >= 0) {
            d(AbstractC1475E.f(i7));
        } else {
            AbstractC1529a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final int a(int i7) {
        int i8 = this.f12937d;
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
        int i7 = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i8 = iHashCode ^ (iHashCode << 16);
        int i9 = i8 & 127;
        int i10 = this.f12937d;
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
                if (kotlin.jvm.internal.l.a(this.f12935b[iNumberOfTrailingZeros], obj)) {
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

    public final long c(Object obj) {
        int iB = b(obj);
        if (iB >= 0) {
            return this.f12936c[iB];
        }
        throw new NoSuchElementException("There is no key " + obj + " in the map");
    }

    public final void d(int i7) {
        long[] jArr;
        int iMax = i7 > 0 ? Math.max(7, AbstractC1475E.e(i7)) : 0;
        this.f12937d = iMax;
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
        this.f12939f = AbstractC1475E.c(this.f12937d) - this.f12938e;
        this.f12935b = new Object[iMax];
        this.f12936c = new long[iMax];
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0072, code lost:
    
        r21 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x007e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0080, code lost:
    
        r2 = a(r4);
        r11 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0088, code lost:
    
        if (r42.f12939f != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x009c, code lost:
    
        if (((r42.a[r2 >> 3] >> ((r2 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x009e, code lost:
    
        r35 = r9;
        r30 = 255;
        r32 = 1;
        r28 = 0;
        r16 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00aa, code lost:
    
        r2 = r42.f12937d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ac, code lost:
    
        if (r2 <= 8) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ae, code lost:
    
        r16 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c6, code lost:
    
        if (java.lang.Long.compare((r42.f12938e * 32) ^ Long.MIN_VALUE, (r2 * 25) ^ Long.MIN_VALUE) > 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c8, code lost:
    
        r2 = r42.a;
        r3 = r42.f12937d;
        r5 = r42.f12935b;
        r6 = r42.f12936c;
        m.AbstractC1475E.a(r2, r3);
        r13 = 0;
        r7 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00d7, code lost:
    
        if (r13 == r3) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d9, code lost:
    
        r26 = r13 >> 3;
        r29 = (r13 & 7) << 3;
        r27 = (r2[r26] >> r29) & r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00e7, code lost:
    
        if (r27 != 128) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e9, code lost:
    
        r41 = r13;
        r13 = r13 + 1;
        r7 = r41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00f3, code lost:
    
        if (r27 == 254) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00f5, code lost:
    
        r13 = r13 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00f8, code lost:
    
        r27 = r5[r13];
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00fa, code lost:
    
        if (r27 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00fc, code lost:
    
        r27 = r27.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0101, code lost:
    
        r27 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0103, code lost:
    
        r27 = r27 * r21;
        r30 = r11;
        r11 = (r27 ^ (r27 << 16)) >>> 7;
        r12 = a(r11);
        r11 = r11 & r3;
        r32 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0124, code lost:
    
        if ((((r12 - r11) & r3) / 8) != (((r13 - r11) & r3) / 8)) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0126, code lost:
    
        r35 = r9;
        r2[r26] = (r2[r26] & (~(r30 << r29))) | ((r27 & 127) << r29);
        r2[r2.length - 1] = (r2[r15] & 72057594037927935L) | Long.MIN_VALUE;
        r13 = r13 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0144, code lost:
    
        r11 = r30;
        r14 = r32;
        r9 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x014b, code lost:
    
        r35 = r9;
        r8 = r12 >> 3;
        r37 = r2[r8];
        r9 = (r12 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x015b, code lost:
    
        if (((r37 >> r9) & r30) != 128) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x015d, code lost:
    
        r28 = r15;
        r2[r8] = ((r27 & 127) << r9) | (r37 & (~(r30 << r9)));
        r2[r26] = (r2[r26] & (~(r30 << r29))) | (128 << r29);
        r5[r12] = r5[r13];
        r5[r13] = null;
        r6[r12] = r6[r13];
        r6[r13] = 0;
        r7 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0187, code lost:
    
        r28 = r15;
        r2[r8] = ((r27 & 127) << r9) | (r37 & (~(r30 << r9)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0197, code lost:
    
        if (r7 != (-1)) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0199, code lost:
    
        r7 = m.AbstractC1475E.b(r2, r13 + 1, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x019f, code lost:
    
        r5[r7] = r5[r12];
        r5[r12] = r5[r13];
        r5[r13] = r5[r7];
        r6[r7] = r6[r12];
        r6[r12] = r6[r13];
        r6[r13] = r6[r7];
        r13 = r13 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01b9, code lost:
    
        r2[r2.length - 1] = (r2[r28] & 72057594037927935L) | Long.MIN_VALUE;
        r13 = r13 + 1;
        r15 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01ca, code lost:
    
        r35 = r9;
        r30 = r11;
        r32 = r14;
        r28 = r15;
        r42.f12939f = m.AbstractC1475E.c(r42.f12937d) - r42.f12938e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01df, code lost:
    
        r35 = r9;
        r30 = 255;
        r32 = 1;
        r28 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01e8, code lost:
    
        r16 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01eb, code lost:
    
        r2 = m.AbstractC1475E.d(r42.f12937d);
        r3 = r42.a;
        r5 = r42.f12935b;
        r6 = r42.f12936c;
        r7 = r42.f12937d;
        d(r2);
        r2 = r42.a;
        r8 = r42.f12935b;
        r9 = r42.f12936c;
        r10 = r42.f12937d;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0206, code lost:
    
        if (r11 >= r7) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0215, code lost:
    
        if (((r3[r11 >> 3] >> ((r11 & 7) << 3)) & 255) >= r16) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0217, code lost:
    
        r12 = r5[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0219, code lost:
    
        if (r12 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x021b, code lost:
    
        r13 = r12.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0220, code lost:
    
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0222, code lost:
    
        r13 = r13 * r21;
        r13 = r13 ^ (r13 << 16);
        r14 = a(r13 >>> 7);
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
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0258, code lost:
    
        r15 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0259, code lost:
    
        r11 = r11 + 1;
        r2 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x025f, code lost:
    
        r2 = a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0263, code lost:
    
        r42.f12938e++;
        r1 = r42.f12939f;
        r3 = r42.a;
        r4 = r2 >> 3;
        r5 = r3[r4];
        r7 = (r2 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x027b, code lost:
    
        if (((r5 >> r7) & r30) != r16) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x027d, code lost:
    
        r28 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x027f, code lost:
    
        r42.f12939f = r1 - r28;
        r1 = r42.f12937d;
        r5 = (r5 & (~(r30 << r7))) | (r35 << r7);
        r3[r4] = r5;
        r3[(((r2 - 7) & r1) + (r1 & 7)) >> 3] = r5;
        r13 = ~r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(long r43, java.lang.Object r45) {
        /*
            Method dump skipped, instructions count: 691
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m.C1503x.e(long, java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005e  */
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
            boolean r3 = r1 instanceof m.C1503x
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            m.x r1 = (m.C1503x) r1
            int r3 = r1.f12938e
            int r5 = r0.f12938e
            if (r3 == r5) goto L17
            return r4
        L17:
            java.lang.Object[] r3 = r0.f12935b
            long[] r5 = r0.f12936c
            long[] r6 = r0.a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L63
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
            if (r11 == 0) goto L5e
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r4
        L3d:
            if (r13 >= r11) goto L5c
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.32E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L58
            int r14 = r8 << 3
            int r14 = r14 + r13
            r15 = r3[r14]
            r16 = r5[r14]
            long r14 = r1.c(r15)
            int r14 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r14 == 0) goto L58
            return r4
        L58:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L3d
        L5c:
            if (r11 != r12) goto L63
        L5e:
            if (r8 == r7) goto L63
            int r8 = r8 + 1
            goto L23
        L63:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: m.C1503x.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Object[] objArr = this.f12935b;
        long[] jArr = this.f12936c;
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
                        Object obj = objArr[i10];
                        iHashCode += (obj != null ? obj.hashCode() : 0) ^ Long.hashCode(jArr[i10]);
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
        if (this.f12938e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.f12935b;
        long[] jArr = this.f12936c;
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
                            Object obj = objArr[i13];
                            i8 = i9;
                            long j8 = jArr[i13];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            sb.append(j8);
                            i10++;
                            if (i10 < this.f12938e) {
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
