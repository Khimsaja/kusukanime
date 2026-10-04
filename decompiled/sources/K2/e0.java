package K2;

/* loaded from: classes.dex */
public final class e0 {
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public int f4585b;

    /* renamed from: c, reason: collision with root package name */
    public int f4586c;

    /* renamed from: d, reason: collision with root package name */
    public int f4587d;

    /* renamed from: e, reason: collision with root package name */
    public int f4588e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static K2.e0 b(java.lang.String r10) {
        /*
            r0 = 1
            java.lang.String r1 = "Format:"
            boolean r1 = r10.startsWith(r1)
            B1.AbstractC0015b.c(r1)
            r1 = 7
            java.lang.String r10 = r10.substring(r1)
            java.lang.String r1 = ","
            java.lang.String[] r10 = android.text.TextUtils.split(r10, r1)
            r1 = -1
            r2 = 0
            r4 = r1
            r5 = r4
            r6 = r5
            r7 = r6
            r3 = r2
        L1c:
            int r8 = r10.length
            if (r3 >= r8) goto L6d
            r8 = r10[r3]
            java.lang.String r8 = r8.trim()
            java.lang.String r8 = f1.AbstractC0871d.r0(r8)
            r8.getClass()
            int r9 = r8.hashCode()
            switch(r9) {
                case 100571: goto L56;
                case 3556653: goto L4b;
                case 109757538: goto L40;
                case 109780401: goto L35;
                default: goto L33;
            }
        L33:
            r8 = r1
            goto L60
        L35:
            java.lang.String r9 = "style"
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L3e
            goto L33
        L3e:
            r8 = 3
            goto L60
        L40:
            java.lang.String r9 = "start"
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L49
            goto L33
        L49:
            r8 = 2
            goto L60
        L4b:
            java.lang.String r9 = "text"
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L54
            goto L33
        L54:
            r8 = r0
            goto L60
        L56:
            java.lang.String r9 = "end"
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L5f
            goto L33
        L5f:
            r8 = r2
        L60:
            switch(r8) {
                case 0: goto L6a;
                case 1: goto L68;
                case 2: goto L66;
                case 3: goto L64;
                default: goto L63;
            }
        L63:
            goto L6b
        L64:
            r7 = r3
            goto L6b
        L66:
            r4 = r3
            goto L6b
        L68:
            r6 = r3
            goto L6b
        L6a:
            r5 = r3
        L6b:
            int r3 = r3 + r0
            goto L1c
        L6d:
            if (r4 == r1) goto L84
            if (r5 == r1) goto L84
            if (r6 == r1) goto L84
            K2.e0 r0 = new K2.e0
            int r10 = r10.length
            r0.<init>()
            r0.a = r4
            r0.f4585b = r5
            r0.f4586c = r7
            r0.f4587d = r6
            r0.f4588e = r10
            return r0
        L84:
            r10 = 0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: K2.e0.b(java.lang.String):K2.e0");
    }

    public boolean a() {
        int i7 = this.a;
        int i8 = 2;
        if ((i7 & 7) != 0) {
            int i9 = this.f4587d;
            int i10 = this.f4585b;
            if (((i9 > i10 ? 1 : i9 == i10 ? 2 : 4) & i7) == 0) {
                return false;
            }
        }
        if ((i7 & 112) != 0) {
            int i11 = this.f4587d;
            int i12 = this.f4586c;
            if ((((i11 > i12 ? 1 : i11 == i12 ? 2 : 4) << 4) & i7) == 0) {
                return false;
            }
        }
        if ((i7 & 1792) != 0) {
            int i13 = this.f4588e;
            int i14 = this.f4585b;
            if ((((i13 > i14 ? 1 : i13 == i14 ? 2 : 4) << 8) & i7) == 0) {
                return false;
            }
        }
        if ((i7 & 28672) != 0) {
            int i15 = this.f4588e;
            int i16 = this.f4586c;
            if (i15 > i16) {
                i8 = 1;
            } else if (i15 != i16) {
                i8 = 4;
            }
            if ((i7 & (i8 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }
}
