package m;

import n.AbstractC1529a;

/* renamed from: m.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1497r {
    public long[] a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f12911b;

    /* renamed from: c, reason: collision with root package name */
    public int f12912c;

    /* renamed from: d, reason: collision with root package name */
    public int f12913d;

    /* renamed from: e, reason: collision with root package name */
    public int f12914e;

    public C1497r(int i7) {
        this.a = AbstractC1475E.a;
        this.f12911b = AbstractC1490k.a;
        if (i7 >= 0) {
            e(AbstractC1475E.f(i7));
        } else {
            AbstractC1529a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0073, code lost:
    
        r22 = r4;
        r8 = (r8 & ((~r8) << 6)) & (-9187201950435737472L);
        r8 = '\b';
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x007f, code lost:
    
        if (r8 == 0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0081, code lost:
    
        r3 = d(r5);
        r12 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0089, code lost:
    
        if (r38.f12914e != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x009d, code lost:
    
        if (((r38.a[r3 >> 3] >> ((r3 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x009f, code lost:
    
        r30 = 255;
        r19 = true;
        r17 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a7, code lost:
    
        r3 = r38.f12912c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a9, code lost:
    
        if (r3 <= 8) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ab, code lost:
    
        r17 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c3, code lost:
    
        if (java.lang.Long.compare((r38.f12913d * 32) ^ Long.MIN_VALUE, (r3 * 25) ^ Long.MIN_VALUE) > 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c5, code lost:
    
        r3 = r38.a;
        r4 = r38.f12912c;
        r6 = r38.f12911b;
        m.AbstractC1475E.a(r3, r4);
        r9 = 0;
        r14 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00d1, code lost:
    
        if (r9 == r4) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d3, code lost:
    
        r21 = r9 >> 3;
        r27 = (r9 & 7) << 3;
        r25 = (r3[r21] >> r27) & r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00e1, code lost:
    
        if (r25 != 128) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e3, code lost:
    
        r14 = r9;
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ed, code lost:
    
        if (r25 == 254) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ef, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00f2, code lost:
    
        r25 = java.lang.Integer.hashCode(r6[r9]) * r22;
        r26 = r8;
        r8 = (r25 ^ (r25 << 16)) >>> 7;
        r28 = d(r8);
        r8 = r8 & r4;
        r30 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0119, code lost:
    
        if ((((r28 - r8) & r4) / 8) != (((r9 - r8) & r4) / 8)) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x011b, code lost:
    
        r3[r21] = (r3[r21] & (~(r30 << r27))) | ((r25 & 127) << r27);
        r3[r3.length - 1] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
        r9 = r9 + 1;
        r8 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0138, code lost:
    
        r12 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x013b, code lost:
    
        r7 = r28 >> 3;
        r12 = r3[r7];
        r8 = (r28 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0149, code lost:
    
        if (((r12 >> r8) & r30) != 128) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x014b, code lost:
    
        r29 = r6;
        r3[r7] = ((~(r30 << r8)) & r12) | ((r25 & 127) << r8);
        r3[r21] = (r3[r21] & (~(r30 << r27))) | (128 << r27);
        r29[r28] = r29[r9];
        r29[r9] = 0;
        r14 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0171, code lost:
    
        r29 = r6;
        r3[r7] = ((~(r30 << r8)) & r12) | ((r25 & 127) << r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0184, code lost:
    
        if (r14 != (-1)) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0186, code lost:
    
        r14 = m.AbstractC1475E.b(r3, r9 + 1, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x018c, code lost:
    
        r29[r14] = r29[r28];
        r29[r28] = r29[r9];
        r29[r9] = r29[r14];
        r9 = r9 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x019a, code lost:
    
        r3[r3.length - 1] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
        r9 = r9 + 1;
        r8 = r26;
        r6 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01aa, code lost:
    
        r30 = r12;
        r38.f12914e = m.AbstractC1475E.c(r38.f12912c) - r38.f12913d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01b7, code lost:
    
        r19 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01bb, code lost:
    
        r30 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01be, code lost:
    
        r17 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01c1, code lost:
    
        r3 = m.AbstractC1475E.d(r38.f12912c);
        r4 = r38.a;
        r6 = r38.f12911b;
        r7 = r38.f12912c;
        e(r3);
        r3 = r38.a;
        r8 = r38.f12911b;
        r9 = r38.f12912c;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01d8, code lost:
    
        if (r12 >= r7) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01e8, code lost:
    
        if (((r4[r12 >> 3] >> ((r12 & 7) << 3)) & 255) >= r17) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01ea, code lost:
    
        r13 = r6[r12];
        r14 = java.lang.Integer.hashCode(r13) * r22;
        r14 = r14 ^ (r14 << 16);
        r19 = r15;
        r15 = d(r14 >>> 7);
        r21 = r3;
        r20 = r4;
        r3 = r14 & 127;
        r14 = r15 >> 3;
        r23 = (r15 & 7) << 3;
        r3 = (r21[r14] & (~(255 << r23))) | (r3 << r23);
        r21[r14] = r3;
        r21[(((r15 - 7) & r9) + (r9 & 7)) >> 3] = r3;
        r8[r15] = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0228, code lost:
    
        r21 = r3;
        r20 = r4;
        r19 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x022e, code lost:
    
        r12 = r12 + 1;
        r15 = r19;
        r4 = r20;
        r3 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0237, code lost:
    
        r3 = d(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x023b, code lost:
    
        r14 = r3;
        r38.f12913d++;
        r3 = r38.f12914e;
        r4 = r38.a;
        r5 = r14 >> 3;
        r6 = r4[r5];
        r8 = (r14 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0254, code lost:
    
        if (((r6 >> r8) & r30) != r17) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0256, code lost:
    
        r9 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0259, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x025b, code lost:
    
        r38.f12914e = r3 - r9;
        r3 = r38.f12912c;
        r6 = (r6 & (~(r30 << r8))) | (r10 << r8);
        r4[r5] = r6;
        r4[(((r14 - 7) & r3) + (r3 & 7)) >> 3] = r6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [int] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(int r39) {
        /*
            Method dump skipped, instructions count: 647
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m.C1497r.a(int):boolean");
    }

    public final void b() {
        this.f12913d = 0;
        long[] jArr = this.a;
        if (jArr != AbstractC1475E.a) {
            P3.m.e0(jArr);
            long[] jArr2 = this.a;
            int i7 = this.f12912c;
            int i8 = i7 >> 3;
            long j7 = 255 << ((i7 & 7) << 3);
            jArr2[i8] = (jArr2[i8] & (~j7)) | j7;
        }
        this.f12914e = AbstractC1475E.c(this.f12912c) - this.f12913d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0067, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0069, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(int r19) {
        /*
            r18 = this;
            r0 = r18
            int r1 = java.lang.Integer.hashCode(r19)
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r0.f12912c
            int r1 = r1 >>> 7
            r1 = r1 & r3
            r4 = 0
            r5 = r4
        L16:
            long[] r6 = r0.a
            int r7 = r1 >> 3
            r8 = r1 & 7
            int r8 = r8 << 3
            r9 = r6[r7]
            long r9 = r9 >>> r8
            r11 = 1
            int r7 = r7 + r11
            r12 = r6[r7]
            int r6 = 64 - r8
            long r6 = r12 << r6
            long r12 = (long) r8
            long r12 = -r12
            r8 = 63
            long r12 = r12 >> r8
            long r6 = r6 & r12
            long r6 = r6 | r9
            long r8 = (long) r2
            r12 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r8 = r8 * r12
            long r8 = r8 ^ r6
            long r12 = r8 - r12
            long r8 = ~r8
            long r8 = r8 & r12
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r12
        L42:
            r14 = 0
            int r10 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r10 == 0) goto L60
            int r10 = java.lang.Long.numberOfTrailingZeros(r8)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            int[] r14 = r0.f12911b
            r14 = r14[r10]
            r15 = r19
            if (r14 != r15) goto L59
            goto L6a
        L59:
            r16 = 1
            long r16 = r8 - r16
            long r8 = r8 & r16
            goto L42
        L60:
            long r8 = ~r6
            r10 = 6
            long r8 = r8 << r10
            long r6 = r6 & r8
            long r6 = r6 & r12
            int r6 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r6 == 0) goto L6e
            r10 = -1
        L6a:
            if (r10 < 0) goto L6d
            return r11
        L6d:
            return r4
        L6e:
            int r5 = r5 + 8
            int r1 = r1 + r5
            r1 = r1 & r3
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: m.C1497r.c(int):boolean");
    }

    public final int d(int i7) {
        int i8 = this.f12912c;
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

    public final void e(int i7) {
        long[] jArr;
        int iMax = i7 > 0 ? Math.max(7, AbstractC1475E.e(i7)) : 0;
        this.f12912c = iMax;
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
        this.f12914e = AbstractC1475E.c(this.f12912c) - this.f12913d;
        this.f12911b = new int[iMax];
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
            boolean r3 = r1 instanceof m.C1497r
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            m.r r1 = (m.C1497r) r1
            int r3 = r1.f12913d
            int r5 = r0.f12913d
            if (r3 == r5) goto L17
            return r4
        L17:
            int[] r3 = r0.f12911b
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
        throw new UnsupportedOperationException("Method not decompiled: m.C1497r.equals(java.lang.Object):boolean");
    }

    public final void f(int i7) {
        this.f12913d--;
        long[] jArr = this.a;
        int i8 = this.f12912c;
        int i9 = i7 >> 3;
        int i10 = (i7 & 7) << 3;
        long j7 = (jArr[i9] & (~(255 << i10))) | (254 << i10);
        jArr[i9] = j7;
        jArr[(((i7 - 7) & i8) + (i8 & 7)) >> 3] = j7;
    }

    public final int hashCode() {
        int[] iArr = this.f12911b;
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
                        iHashCode = Integer.hashCode(iArr[(i7 << 3) + i9]) + iHashCode;
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

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d A[PHI: r7
      0x005d: PHI (r7v2 int) = (r7v1 int), (r7v3 int) binds: [B:6:0x0026, B:18:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
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
            int[] r2 = r0.f12911b
            long[] r3 = r0.a
            int r4 = r3.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto L62
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
            if (r10 == 0) goto L5d
            int r10 = r6 - r4
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r5
        L32:
            if (r12 >= r10) goto L5b
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.32E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L57
            int r13 = r6 << 3
            int r13 = r13 + r12
            r13 = r2[r13]
            r14 = -1
            if (r7 != r14) goto L4b
            java.lang.String r2 = "..."
            r1.append(r2)
            goto L67
        L4b:
            if (r7 == 0) goto L52
            java.lang.String r14 = ", "
            r1.append(r14)
        L52:
            r1.append(r13)
            int r7 = r7 + 1
        L57:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L32
        L5b:
            if (r10 != r11) goto L62
        L5d:
            if (r6 == r4) goto L62
            int r6 = r6 + 1
            goto L18
        L62:
            java.lang.String r2 = "]"
            r1.append(r2)
        L67:
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.l.e(r2, r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: m.C1497r.toString():java.lang.String");
    }

    public /* synthetic */ C1497r() {
        this(6);
    }
}
