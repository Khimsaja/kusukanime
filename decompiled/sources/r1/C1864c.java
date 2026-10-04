package r1;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: r1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1864c {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14814b;

    /* renamed from: c, reason: collision with root package name */
    public final long f14815c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f14816d;

    public C1864c(byte[] bArr, int i7, int i8) {
        this(-1L, bArr, i7, i8);
    }

    public static C1864c a(long j7, ByteOrder byteOrder) {
        long[] jArr = {j7};
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C1868g.f14823C[4]]);
        byteBufferWrap.order(byteOrder);
        byteBufferWrap.putInt((int) jArr[0]);
        return new C1864c(byteBufferWrap.array(), 4, 1);
    }

    public static C1864c b(C1866e c1866e, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C1868g.f14823C[5]]);
        byteBufferWrap.order(byteOrder);
        C1866e c1866e2 = new C1866e[]{c1866e}[0];
        byteBufferWrap.putInt((int) c1866e2.a);
        byteBufferWrap.putInt((int) c1866e2.f14820b);
        return new C1864c(byteBufferWrap.array(), 5, 1);
    }

    public static C1864c c(int i7, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C1868g.f14823C[3]]);
        byteBufferWrap.order(byteOrder);
        byteBufferWrap.putShort((short) new int[]{i7}[0]);
        return new C1864c(byteBufferWrap.array(), 3, 1);
    }

    public final double d(ByteOrder byteOrder) throws Throwable {
        Object objG = g(byteOrder);
        if (objG == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        }
        if (objG instanceof String) {
            return Double.parseDouble((String) objG);
        }
        if (objG instanceof long[]) {
            if (((long[]) objG).length == 1) {
                return r5[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objG instanceof int[]) {
            if (((int[]) objG).length == 1) {
                return r5[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objG instanceof double[]) {
            double[] dArr = (double[]) objG;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objG instanceof C1866e[])) {
            throw new NumberFormatException("Couldn't find a double value");
        }
        C1866e[] c1866eArr = (C1866e[]) objG;
        if (c1866eArr.length != 1) {
            throw new NumberFormatException("There are more than one component");
        }
        C1866e c1866e = c1866eArr[0];
        return c1866e.a / c1866e.f14820b;
    }

    public final int e(ByteOrder byteOrder) {
        Object objG = g(byteOrder);
        if (objG == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (objG instanceof String) {
            return Integer.parseInt((String) objG);
        }
        if (objG instanceof long[]) {
            long[] jArr = (long[]) objG;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objG instanceof int[])) {
            throw new NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) objG;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new NumberFormatException("There are more than one component");
    }

    public final String f(ByteOrder byteOrder) throws Throwable {
        Object objG = g(byteOrder);
        if (objG == null) {
            return null;
        }
        if (objG instanceof String) {
            return (String) objG;
        }
        StringBuilder sb = new StringBuilder();
        int i7 = 0;
        if (objG instanceof long[]) {
            long[] jArr = (long[]) objG;
            while (i7 < jArr.length) {
                sb.append(jArr[i7]);
                i7++;
                if (i7 != jArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (objG instanceof int[]) {
            int[] iArr = (int[]) objG;
            while (i7 < iArr.length) {
                sb.append(iArr[i7]);
                i7++;
                if (i7 != iArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (objG instanceof double[]) {
            double[] dArr = (double[]) objG;
            while (i7 < dArr.length) {
                sb.append(dArr[i7]);
                i7++;
                if (i7 != dArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (!(objG instanceof C1866e[])) {
            return null;
        }
        C1866e[] c1866eArr = (C1866e[]) objG;
        while (i7 < c1866eArr.length) {
            sb.append(c1866eArr[i7].a);
            sb.append('/');
            sb.append(c1866eArr[i7].f14820b);
            i7++;
            if (i7 != c1866eArr.length) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0033: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:52), block:B:16:0x0033 */
    /* JADX WARN: Removed duplicated region for block: B:153:0x016d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r15v22, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v23, types: [java.io.Serializable, long[]] */
    /* JADX WARN: Type inference failed for: r15v24, types: [java.io.Serializable, r1.e[]] */
    /* JADX WARN: Type inference failed for: r15v25, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v26, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v27, types: [java.io.Serializable, r1.e[]] */
    /* JADX WARN: Type inference failed for: r15v28, types: [double[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v29, types: [double[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable g(java.nio.ByteOrder r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r1.C1864c.g(java.nio.ByteOrder):java.io.Serializable");
    }

    public final String toString() {
        return "(" + C1868g.f14822B[this.a] + ", data length:" + this.f14816d.length + ")";
    }

    public C1864c(long j7, byte[] bArr, int i7, int i8) {
        this.a = i7;
        this.f14814b = i8;
        this.f14815c = j7;
        this.f14816d = bArr;
    }
}
