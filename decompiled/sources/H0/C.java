package H0;

import h0.C0998u;

/* loaded from: classes.dex */
public abstract class C {
    public static final long a = n6.d.F(14);

    /* renamed from: b, reason: collision with root package name */
    public static final long f3070b = n6.d.F(0);

    /* renamed from: c, reason: collision with root package name */
    public static final long f3071c = C0998u.f11833f;

    /* renamed from: d, reason: collision with root package name */
    public static final S0.m f3072d;

    static {
        long j7 = C0998u.f11829b;
        f3072d = j7 != 16 ? new S0.c(j7) : S0.l.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0029 A[PHI: r11
      0x0029: PHI (r11v8 long) = 
      (r11v1 long)
      (r11v1 long)
      (r11v1 long)
      (r11v1 long)
      (r11v1 long)
      (r11v1 long)
      (r11v1 long)
      (r11v1 long)
      (r11v1 long)
      (r11v1 long)
      (r11v1 long)
      (r11v9 long)
     binds: [B:36:0x0088, B:48:0x00b2, B:45:0x00a8, B:42:0x009e, B:39:0x0094, B:34:0x007c, B:29:0x006f, B:25:0x005f, B:22:0x0059, B:19:0x004f, B:16:0x0045, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x013b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final H0.B a(H0.B r19, long r20, h0.AbstractC0993p r22, float r23, long r24, M0.u r26, M0.q r27, M0.r r28, M0.j r29, java.lang.String r30, long r31, S0.a r33, S0.n r34, O0.b r35, long r36, S0.j r38, h0.C0972Q r39, H0.v r40, j0.AbstractC1299e r41) {
        /*
            Method dump skipped, instructions count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H0.C.a(H0.B, long, h0.p, float, long, M0.u, M0.q, M0.r, M0.j, java.lang.String, long, S0.a, S0.n, O0.b, long, S0.j, h0.Q, H0.v, j0.e):H0.B");
    }

    public static final Object b(Object obj, Object obj2, float f5) {
        return ((double) f5) < 0.5d ? obj : obj2;
    }

    public static final long c(float f5, long j7, long j8) {
        if (n6.d.N(j7) || n6.d.N(j8)) {
            return ((T0.m) b(new T0.m(j7), new T0.m(j8), f5)).a;
        }
        if (n6.d.N(j7) || n6.d.N(j8)) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.");
        }
        if (T0.n.a(T0.m.b(j7), T0.m.b(j8))) {
            return n6.d.T(P3.F.G(T0.m.c(j7), T0.m.c(j8), f5), 1095216660480L & j7);
        }
        throw new IllegalArgumentException(("Cannot perform operation for " + ((Object) T0.n.b(T0.m.b(j7))) + " and " + ((Object) T0.n.b(T0.m.b(j8)))).toString());
    }
}
