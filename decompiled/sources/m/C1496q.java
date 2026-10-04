package m;

import n.AbstractC1529a;

/* renamed from: m.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1496q {
    public long[] a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f12906b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f12907c;

    /* renamed from: d, reason: collision with root package name */
    public int f12908d;

    /* renamed from: e, reason: collision with root package name */
    public int f12909e;

    /* renamed from: f, reason: collision with root package name */
    public int f12910f;

    public C1496q(int i7) {
        this.a = AbstractC1475E.a;
        this.f12906b = AbstractC1490k.a;
        this.f12907c = AbstractC1529a.f13115c;
        if (i7 >= 0) {
            f(AbstractC1475E.f(i7));
        } else {
            AbstractC1529a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void a() {
        this.f12909e = 0;
        long[] jArr = this.a;
        if (jArr != AbstractC1475E.a) {
            P3.m.e0(jArr);
            long[] jArr2 = this.a;
            int i7 = this.f12908d;
            int i8 = i7 >> 3;
            long j7 = 255 << ((i7 & 7) << 3);
            jArr2[i8] = (jArr2[i8] & (~j7)) | j7;
        }
        P3.m.c0(this.f12907c, 0, this.f12908d);
        this.f12910f = AbstractC1475E.c(this.f12908d) - this.f12909e;
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
    public final boolean b(int r19) {
        /*
            r18 = this;
            r0 = r18
            int r1 = java.lang.Integer.hashCode(r19)
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r0.f12908d
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
            int[] r14 = r0.f12906b
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
        throw new UnsupportedOperationException("Method not decompiled: m.C1496q.b(int):boolean");
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
            int r3 = r0.f12908d
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
            int[] r14 = r0.f12906b
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
        throw new UnsupportedOperationException("Method not decompiled: m.C1496q.c(int):boolean");
    }

    public final int d(int i7) {
        int i8 = this.f12908d;
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

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0061, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0063, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(int r14) {
        /*
            r13 = this;
            int r0 = java.lang.Integer.hashCode(r14)
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r0 = r0 * r1
            int r1 = r0 << 16
            r0 = r0 ^ r1
            r1 = r0 & 127(0x7f, float:1.78E-43)
            int r2 = r13.f12908d
            int r0 = r0 >>> 7
            r0 = r0 & r2
            r3 = 0
        L13:
            long[] r4 = r13.a
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
            if (r12 == 0) goto L5a
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r0
            r10 = r10 & r2
            int[] r11 = r13.f12906b
            r11 = r11[r10]
            if (r11 != r14) goto L54
            goto L64
        L54:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L3f
        L5a:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L6d
            r10 = -1
        L64:
            if (r10 < 0) goto L6b
            java.lang.Object[] r14 = r13.f12907c
            r14 = r14[r10]
            return r14
        L6b:
            r14 = 0
            return r14
        L6d:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: m.C1496q.e(int):java.lang.Object");
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
            boolean r3 = r1 instanceof m.C1496q
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            m.q r1 = (m.C1496q) r1
            int r3 = r1.f12909e
            int r5 = r0.f12909e
            if (r3 == r5) goto L17
            return r4
        L17:
            int[] r3 = r0.f12906b
            java.lang.Object[] r5 = r0.f12907c
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
            boolean r14 = r1.c(r15)
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
        throw new UnsupportedOperationException("Method not decompiled: m.C1496q.equals(java.lang.Object):boolean");
    }

    public final void f(int i7) {
        long[] jArr;
        int iMax = i7 > 0 ? Math.max(7, AbstractC1475E.e(i7)) : 0;
        this.f12908d = iMax;
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
        this.f12910f = AbstractC1475E.c(this.f12908d) - this.f12909e;
        this.f12906b = new int[iMax];
        this.f12907c = new Object[iMax];
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0061, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0063, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(int r14) {
        /*
            r13 = this;
            int r0 = java.lang.Integer.hashCode(r14)
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r0 = r0 * r1
            int r1 = r0 << 16
            r0 = r0 ^ r1
            r1 = r0 & 127(0x7f, float:1.78E-43)
            int r2 = r13.f12908d
            int r0 = r0 >>> 7
            r0 = r0 & r2
            r3 = 0
        L13:
            long[] r4 = r13.a
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
            if (r12 == 0) goto L5a
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r0
            r10 = r10 & r2
            int[] r11 = r13.f12906b
            r11 = r11[r10]
            if (r11 != r14) goto L54
            goto L64
        L54:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L3f
        L5a:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L97
            r10 = -1
        L64:
            r14 = 0
            if (r10 < 0) goto L96
            int r0 = r13.f12909e
            int r0 = r0 + (-1)
            r13.f12909e = r0
            long[] r0 = r13.a
            int r1 = r13.f12908d
            int r2 = r10 >> 3
            r3 = r10 & 7
            int r3 = r3 << 3
            r4 = r0[r2]
            r6 = 255(0xff, double:1.26E-321)
            long r6 = r6 << r3
            long r6 = ~r6
            long r4 = r4 & r6
            r6 = 254(0xfe, double:1.255E-321)
            long r6 = r6 << r3
            long r3 = r4 | r6
            r0[r2] = r3
            int r2 = r10 + (-7)
            r2 = r2 & r1
            r1 = r1 & 7
            int r2 = r2 + r1
            int r1 = r2 >> 3
            r0[r1] = r3
            java.lang.Object[] r0 = r13.f12907c
            r1 = r0[r10]
            r0[r10] = r14
            return r1
        L96:
            return r14
        L97:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: m.C1496q.g(int):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x006e, code lost:
    
        r21 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x007a, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x007c, code lost:
    
        r2 = d(r4);
        r11 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0084, code lost:
    
        if (r40.f12910f != 0) goto L16;
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
    
        r2 = r40.f12908d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a8, code lost:
    
        if (r2 <= 8) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00aa, code lost:
    
        r16 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c2, code lost:
    
        if (java.lang.Long.compare((r40.f12909e * 32) ^ Long.MIN_VALUE, (r2 * 25) ^ Long.MIN_VALUE) > 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c4, code lost:
    
        r2 = r40.a;
        r3 = r40.f12908d;
        r5 = r40.f12906b;
        r6 = r40.f12907c;
        m.AbstractC1475E.a(r2, r3);
        r13 = 0;
        r7 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00d3, code lost:
    
        if (r13 == r3) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d5, code lost:
    
        r24 = r13 >> 3;
        r27 = (r13 & 7) << 3;
        r25 = (r2[r24] >> r27) & r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00e3, code lost:
    
        if (r25 != 128) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e5, code lost:
    
        r39 = r13;
        r13 = r13 + 1;
        r7 = r39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ef, code lost:
    
        if (r25 == 254) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00f1, code lost:
    
        r13 = r13 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00f4, code lost:
    
        r25 = java.lang.Integer.hashCode(r5[r13]) * r21;
        r28 = r11;
        r11 = (r25 ^ (r25 << 16)) >>> 7;
        r12 = d(r11);
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
        r6[r13] = null;
        r7 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x017e, code lost:
    
        r26 = r15;
        r2[r8] = ((r25 & 127) << r9) | (r35 & (~(r28 << r9)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x018e, code lost:
    
        if (r7 != (-1)) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0190, code lost:
    
        r7 = m.AbstractC1475E.b(r2, r13 + 1, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0196, code lost:
    
        r5[r7] = r5[r12];
        r5[r12] = r5[r13];
        r5[r13] = r5[r7];
        r6[r7] = r6[r12];
        r6[r12] = r6[r13];
        r6[r13] = r6[r7];
        r13 = r13 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01b0, code lost:
    
        r2[r2.length - 1] = (r2[r26] & 72057594037927935L) | Long.MIN_VALUE;
        r13 = r13 + 1;
        r15 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01c1, code lost:
    
        r33 = r9;
        r28 = r11;
        r30 = r14;
        r26 = r15;
        r40.f12910f = m.AbstractC1475E.c(r40.f12908d) - r40.f12909e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01d6, code lost:
    
        r33 = r9;
        r28 = 255;
        r30 = 1;
        r26 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01df, code lost:
    
        r16 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01e2, code lost:
    
        r2 = m.AbstractC1475E.d(r40.f12908d);
        r3 = r40.a;
        r5 = r40.f12906b;
        r6 = r40.f12907c;
        r7 = r40.f12908d;
        f(r2);
        r2 = r40.a;
        r8 = r40.f12906b;
        r9 = r40.f12907c;
        r10 = r40.f12908d;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01fd, code lost:
    
        if (r11 >= r7) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x020c, code lost:
    
        if (((r3[r11 >> 3] >> ((r11 & 7) << 3)) & 255) >= r16) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x020e, code lost:
    
        r12 = r5[r11];
        r13 = java.lang.Integer.hashCode(r12) * r21;
        r13 = r13 ^ (r13 << 16);
        r14 = d(r13 >>> 7);
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
    /* JADX WARN: Code restructure failed: missing block: B:49:0x024a, code lost:
    
        r15 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x024b, code lost:
    
        r11 = r11 + 1;
        r2 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0251, code lost:
    
        r13 = d(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0257, code lost:
    
        r13 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0258, code lost:
    
        r40.f12909e++;
        r1 = r40.f12910f;
        r2 = r40.a;
        r3 = r13 >> 3;
        r4 = r2[r3];
        r6 = (r13 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0270, code lost:
    
        if (((r4 >> r6) & r28) != r16) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0272, code lost:
    
        r7 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0275, code lost:
    
        r7 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0277, code lost:
    
        r40.f12910f = r1 - r7;
        r1 = r40.f12908d;
        r4 = (r4 & (~(r28 << r6))) | (r33 << r6);
        r2[r3] = r4;
        r2[(((r13 - 7) & r1) + (r1 & 7)) >> 3] = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(int r41, java.lang.Object r42) {
        /*
            Method dump skipped, instructions count: 678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m.C1496q.h(int, java.lang.Object):void");
    }

    public final int hashCode() {
        int[] iArr = this.f12906b;
        Object[] objArr = this.f12907c;
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
                        Object obj = objArr[i10];
                        iHashCode += (obj != null ? obj.hashCode() : 0) ^ Integer.hashCode(i11);
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
            int r1 = r0.f12909e
            if (r1 != 0) goto L9
            java.lang.String r1 = "{}"
            return r1
        L9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "{"
            r1.<init>(r2)
            int[] r2 = r0.f12906b
            java.lang.Object[] r3 = r0.f12907c
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
            r1.append(r15)
            java.lang.String r15 = "="
            r1.append(r15)
            if (r14 != r0) goto L56
            java.lang.String r14 = "(this)"
        L56:
            r1.append(r14)
            int r8 = r8 + 1
            int r14 = r0.f12909e
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
        throw new UnsupportedOperationException("Method not decompiled: m.C1496q.toString():java.lang.String");
    }

    public /* synthetic */ C1496q() {
        this(6);
    }
}
