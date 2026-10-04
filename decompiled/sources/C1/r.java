package C1;

import B1.A;
import B1.AbstractC0015b;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import y1.C2393o;
import y1.D;

/* loaded from: classes.dex */
public abstract class r {
    public static final byte[] a = {0, 0, 0, 1};

    /* renamed from: b, reason: collision with root package name */
    public static final float[] f623b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c, reason: collision with root package name */
    public static final Object f624c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static int[] f625d = new int[10];

    public static void a(boolean z7) {
        if (z7) {
            throw new s();
        }
    }

    public static void b(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static int c(byte[] bArr, int i7, int i8, boolean[] zArr) {
        int i9 = i8 - i7;
        AbstractC0015b.h(i9 >= 0);
        if (i9 == 0) {
            return i8;
        }
        if (zArr[0]) {
            b(zArr);
            return i7 - 3;
        }
        if (i9 > 1 && zArr[1] && bArr[i7] == 1) {
            b(zArr);
            return i7 - 2;
        }
        if (i9 > 2 && zArr[2] && bArr[i7] == 0 && bArr[i7 + 1] == 1) {
            b(zArr);
            return i7 - 1;
        }
        int i10 = i8 - 1;
        int i11 = i7 + 2;
        while (i11 < i10) {
            byte b4 = bArr[i11];
            if ((b4 & 254) == 0) {
                int i12 = i11 - 2;
                if (bArr[i12] == 0 && bArr[i11 - 1] == 0 && b4 == 1) {
                    b(zArr);
                    return i12;
                }
                i11 -= 2;
            }
            i11 += 3;
        }
        zArr[0] = i9 <= 2 ? !(i9 != 2 ? !(zArr[1] && bArr[i10] == 1) : !(zArr[2] && bArr[i8 + (-2)] == 0 && bArr[i10] == 1)) : bArr[i8 + (-3)] == 0 && bArr[i8 + (-2)] == 0 && bArr[i10] == 1;
        zArr[1] = i9 <= 1 ? zArr[2] && bArr[i10] == 0 : bArr[i8 + (-2)] == 0 && bArr[i10] == 0;
        zArr[2] = bArr[i10] == 0;
        return i8;
    }

    public static boolean d(byte[] bArr, int i7, C2393o c2393o) {
        int i8;
        if (Objects.equals(c2393o.f18112n, "video/avc")) {
            byte b4 = bArr[4];
            if (((b4 & 96) >> 5) == 0 && ((i8 = b4 & 31) == 1 || i8 == 9 || i8 == 14)) {
                return false;
            }
        } else if (Objects.equals(c2393o.f18112n, "video/hevc")) {
            i iVarF = f(new A(bArr, 4, i7 + 4));
            int i9 = iVarF.a;
            if (i9 == 35) {
                return false;
            }
            if (i9 <= 14 && i9 % 2 == 0) {
                if (iVarF.f581c == c2393o.f18090C - 1) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int e(C2393o c2393o) {
        if (Objects.equals(c2393o.f18112n, "video/avc")) {
            return 1;
        }
        return (Objects.equals(c2393o.f18112n, "video/hevc") || D.b(c2393o.f18109k, "video/hevc")) ? 2 : 0;
    }

    public static i f(A a7) {
        a7.s();
        return new i(a7.i(6), a7.i(6), a7.i(3) - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static C1.j g(B1.A r19, boolean r20, int r21, C1.j r22) {
        /*
            r0 = r19
            r1 = r21
            r2 = r22
            r3 = 6
            int[] r4 = new int[r3]
            r5 = 2
            r6 = 8
            r7 = 0
            if (r20 == 0) goto L42
            int r2 = r0.i(r5)
            boolean r8 = r0.h()
            r9 = 5
            int r9 = r0.i(r9)
            r10 = r7
            r11 = r10
        L1e:
            r12 = 32
            if (r10 >= r12) goto L2e
            boolean r12 = r0.h()
            if (r12 == 0) goto L2b
            r12 = 1
            int r12 = r12 << r10
            r11 = r11 | r12
        L2b:
            int r10 = r10 + 1
            goto L1e
        L2e:
            r10 = r7
        L2f:
            if (r10 >= r3) goto L3a
            int r12 = r0.i(r6)
            r4[r10] = r12
            int r10 = r10 + 1
            goto L2f
        L3a:
            r13 = r2
        L3b:
            r17 = r4
            r14 = r8
            r15 = r9
            r16 = r11
            goto L57
        L42:
            if (r2 == 0) goto L50
            int r3 = r2.a
            boolean r8 = r2.f582b
            int r9 = r2.f583c
            int r11 = r2.f584d
            int[] r4 = r2.f585e
            r13 = r3
            goto L3b
        L50:
            r17 = r4
            r13 = r7
            r14 = r13
            r15 = r14
            r16 = r15
        L57:
            int r18 = r0.i(r6)
            r2 = r7
        L5c:
            if (r7 >= r1) goto L71
            boolean r3 = r0.h()
            if (r3 == 0) goto L66
            int r2 = r2 + 88
        L66:
            boolean r3 = r0.h()
            if (r3 == 0) goto L6e
            int r2 = r2 + 8
        L6e:
            int r7 = r7 + 1
            goto L5c
        L71:
            r0.t(r2)
            if (r1 <= 0) goto L7b
            int r6 = r6 - r1
            int r6 = r6 * r5
            r0.t(r6)
        L7b:
            C1.j r12 = new C1.j
            r12.<init>(r13, r14, r15, r16, r17, r18)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: C1.r.g(B1.A, boolean, int, C1.j):C1.j");
    }

    public static m h(byte[] bArr, int i7, int i8) {
        byte b4;
        int i9 = i7 + 2;
        do {
            i8--;
            b4 = bArr[i8];
            if (b4 != 0) {
                break;
            }
        } while (i8 > i9);
        if (b4 == 0 || i8 <= i9) {
            return null;
        }
        A a7 = new A(bArr, i9, i8 + 1);
        while (a7.d(16)) {
            int i10 = a7.i(8);
            int i11 = 0;
            while (i10 == 255) {
                i11 += 255;
                i10 = a7.i(8);
            }
            int i12 = i11 + i10;
            int i13 = a7.i(8);
            int i14 = 0;
            while (i13 == 255) {
                i14 += 255;
                i13 = a7.i(8);
            }
            int i15 = i14 + i13;
            if (i15 == 0 || !a7.d(i15)) {
                return null;
            }
            if (i12 == 176) {
                int iM = a7.m();
                boolean zH = a7.h();
                int iM2 = zH ? a7.m() : 0;
                int iM3 = a7.m();
                int iM4 = -1;
                for (int i16 = 0; i16 <= iM3; i16++) {
                    iM4 = a7.m();
                    a7.m();
                    int i17 = a7.i(6);
                    if (i17 == 63) {
                        return null;
                    }
                    a7.i(i17 == 0 ? Math.max(0, iM - 30) : Math.max(0, (i17 + iM) - 31));
                    if (zH) {
                        int i18 = a7.i(6);
                        if (i18 == 63) {
                            return null;
                        }
                        a7.i(i18 == 0 ? Math.max(0, iM2 - 30) : Math.max(0, (i18 + iM2) - 31));
                    }
                    if (a7.h()) {
                        a7.t(10);
                    }
                }
                return new m(iM4);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static C1.n i(byte[] r30, int r31, int r32, A2.b r33) {
        /*
            Method dump skipped, instructions count: 959
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: C1.r.i(byte[], int, int, A2.b):C1.n");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static A2.b j(byte[] r40, int r41, int r42) {
        /*
            Method dump skipped, instructions count: 2185
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: C1.r.j(byte[], int, int):A2.b");
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x018e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static C1.q k(byte[] r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: C1.r.k(byte[], int, int):C1.q");
    }

    public static void l(A a7) {
        int iM = a7.m() + 1;
        a7.t(8);
        for (int i7 = 0; i7 < iM; i7++) {
            a7.m();
            a7.m();
            a7.s();
        }
        a7.t(20);
    }

    public static ArrayList m(ByteBuffer byteBuffer) {
        int iRemaining;
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        ArrayList arrayList = new ArrayList();
        while (byteBufferAsReadOnlyBuffer.hasRemaining()) {
            byte b4 = byteBufferAsReadOnlyBuffer.get();
            int i7 = (b4 >> 3) & 15;
            if (((b4 >> 2) & 1) != 0) {
                byteBufferAsReadOnlyBuffer.get();
            }
            if (((b4 >> 1) & 1) != 0) {
                iRemaining = 0;
                for (int i8 = 0; i8 < 8; i8++) {
                    byte b7 = byteBufferAsReadOnlyBuffer.get();
                    iRemaining |= (b7 & 127) << (i8 * 7);
                    if ((b7 & 128) == 0) {
                        break;
                    }
                }
            } else {
                iRemaining = byteBufferAsReadOnlyBuffer.remaining();
            }
            ByteBuffer byteBufferDuplicate = byteBufferAsReadOnlyBuffer.duplicate();
            byteBufferDuplicate.limit(byteBufferAsReadOnlyBuffer.position() + iRemaining);
            arrayList.add(new t(i7, byteBufferDuplicate));
            byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + iRemaining);
        }
        return arrayList;
    }

    public static int n(byte[] bArr, int i7) {
        int i8;
        synchronized (f624c) {
            int i9 = 0;
            int i10 = 0;
            while (i9 < i7) {
                while (true) {
                    if (i9 >= i7 - 2) {
                        i9 = i7;
                        break;
                    }
                    try {
                        if (bArr[i9] == 0 && bArr[i9 + 1] == 0 && bArr[i9 + 2] == 3) {
                            break;
                        }
                        i9++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i9 < i7) {
                    int[] iArr = f625d;
                    if (iArr.length <= i10) {
                        f625d = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f625d[i10] = i9;
                    i9 += 3;
                    i10++;
                }
            }
            i8 = i7 - i10;
            int i11 = 0;
            int i12 = 0;
            for (int i13 = 0; i13 < i10; i13++) {
                int i14 = f625d[i13] - i12;
                System.arraycopy(bArr, i12, bArr, i11, i14);
                int i15 = i11 + i14;
                int i16 = i15 + 1;
                bArr[i15] = 0;
                i11 = i15 + 2;
                bArr[i16] = 0;
                i12 += i14 + 3;
            }
            System.arraycopy(bArr, i12, bArr, i11, i8 - i11);
        }
        return i8;
    }
}
