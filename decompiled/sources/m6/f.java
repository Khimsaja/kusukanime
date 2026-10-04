package m6;

import b1.AbstractC0703b;
import p.I0;
import z5.AbstractC2517v;

/* loaded from: classes.dex */
public abstract class f {
    public static final w6.l a;

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f13018b;

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f13019c;

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f13020d;

    static {
        w6.l lVar = w6.l.f17157n;
        a = I0.s("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        f13018b = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        f13019c = new String[64];
        String[] strArr = new String[256];
        for (int i7 = 0; i7 < 256; i7++) {
            String binaryString = Integer.toBinaryString(i7);
            kotlin.jvm.internal.l.e("toBinaryString(it)", binaryString);
            strArr[i7] = AbstractC2517v.Q(g6.b.i("%8s", binaryString), ' ', '0');
        }
        f13020d = strArr;
        String[] strArr2 = f13019c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i8 = iArr[0];
        strArr2[i8 | 8] = AbstractC0703b.m(new StringBuilder(), strArr2[i8], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i9 = 0; i9 < 3; i9++) {
            int i10 = iArr2[i9];
            int i11 = iArr[0];
            String[] strArr3 = f13019c;
            int i12 = i11 | i10;
            strArr3[i12] = strArr3[i11] + '|' + strArr3[i10];
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i11]);
            sb.append('|');
            strArr3[i12 | 8] = AbstractC0703b.m(sb, strArr3[i10], "|PADDED");
        }
        int length = f13019c.length;
        for (int i13 = 0; i13 < length; i13++) {
            String[] strArr4 = f13019c;
            if (strArr4[i13] == null) {
                strArr4[i13] = f13020d[i13];
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(boolean r4, int r5, int r6, int r7, int r8) {
        /*
            java.lang.String[] r0 = m6.f.f13018b
            int r1 = r0.length
            if (r7 >= r1) goto L8
            r0 = r0[r7]
            goto L16
        L8:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "0x%02x"
            java.lang.String r0 = g6.b.i(r1, r0)
        L16:
            if (r8 != 0) goto L1b
            java.lang.String r7 = ""
            goto L69
        L1b:
            r1 = 2
            java.lang.String[] r2 = m6.f.f13020d
            if (r7 == r1) goto L67
            r1 = 3
            if (r7 == r1) goto L67
            r1 = 4
            if (r7 == r1) goto L5e
            r1 = 6
            if (r7 == r1) goto L5e
            r1 = 7
            if (r7 == r1) goto L67
            r1 = 8
            if (r7 == r1) goto L67
            java.lang.String[] r1 = m6.f.f13019c
            int r3 = r1.length
            if (r8 >= r3) goto L3b
            r1 = r1[r8]
            kotlin.jvm.internal.l.c(r1)
            goto L3d
        L3b:
            r1 = r2[r8]
        L3d:
            r2 = 5
            if (r7 != r2) goto L4d
            r2 = r8 & 4
            if (r2 == 0) goto L4d
            java.lang.String r7 = "PUSH_PROMISE"
            java.lang.String r8 = "HEADERS"
            java.lang.String r7 = z5.AbstractC2517v.R(r1, r8, r7)
            goto L69
        L4d:
            if (r7 != 0) goto L5c
            r7 = r8 & 32
            if (r7 == 0) goto L5c
            java.lang.String r7 = "COMPRESSED"
            java.lang.String r8 = "PRIORITY"
            java.lang.String r7 = z5.AbstractC2517v.R(r1, r8, r7)
            goto L69
        L5c:
            r7 = r1
            goto L69
        L5e:
            r7 = 1
            if (r8 != r7) goto L64
            java.lang.String r7 = "ACK"
            goto L69
        L64:
            r7 = r2[r8]
            goto L69
        L67:
            r7 = r2[r8]
        L69:
            if (r4 == 0) goto L6e
            java.lang.String r4 = "<<"
            goto L70
        L6e:
            java.lang.String r4 = ">>"
        L70:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r5, r6, r0, r7}
            java.lang.String r5 = "%s 0x%08x %5d %-13s %s"
            java.lang.String r4 = g6.b.i(r5, r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: m6.f.a(boolean, int, int, int, int):java.lang.String");
    }
}
