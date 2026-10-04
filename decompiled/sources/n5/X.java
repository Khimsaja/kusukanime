package n5;

import o5.C1706f;

/* loaded from: classes.dex */
public final class X extends AbstractC1576m {

    /* renamed from: l, reason: collision with root package name */
    public final String f13384l;

    public X(String str) {
        this.f13384l = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void F0(int r9) {
        /*
            r0 = 4
            r1 = 1
            if (r9 == r1) goto L9
            if (r9 == r0) goto L9
            java.lang.String r2 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto Lb
        L9:
            java.lang.String r2 = "@NotNull method %s.%s must not return null"
        Lb:
            r3 = 3
            r4 = 2
            if (r9 == r1) goto L13
            if (r9 == r0) goto L13
            r5 = r3
            goto L14
        L13:
            r5 = r4
        L14:
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType"
            r7 = 0
            if (r9 == r1) goto L30
            if (r9 == r4) goto L2b
            if (r9 == r3) goto L26
            if (r9 == r0) goto L30
            java.lang.String r8 = "newAttributes"
            r5[r7] = r8
            goto L32
        L26:
            java.lang.String r8 = "kotlinTypeRefiner"
            r5[r7] = r8
            goto L32
        L2b:
            java.lang.String r8 = "delegate"
            r5[r7] = r8
            goto L32
        L30:
            r5[r7] = r6
        L32:
            java.lang.String r7 = "refine"
            if (r9 == r1) goto L3e
            if (r9 == r0) goto L3b
            r5[r1] = r6
            goto L42
        L3b:
            r5[r1] = r7
            goto L42
        L3e:
            java.lang.String r6 = "toString"
            r5[r1] = r6
        L42:
            if (r9 == r1) goto L56
            if (r9 == r4) goto L52
            if (r9 == r3) goto L4f
            if (r9 == r0) goto L56
            java.lang.String r3 = "replaceAttributes"
            r5[r4] = r3
            goto L56
        L4f:
            r5[r4] = r7
            goto L56
        L52:
            java.lang.String r3 = "replaceDelegate"
            r5[r4] = r3
        L56:
            java.lang.String r2 = java.lang.String.format(r2, r5)
            if (r9 == r1) goto L64
            if (r9 == r0) goto L64
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r2)
            goto L69
        L64:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r2)
        L69:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.X.F0(int):void");
    }

    @Override // n5.B
    /* renamed from: A0 */
    public final B x0(boolean z7) {
        throw new IllegalStateException(this.f13384l);
    }

    @Override // n5.B
    /* renamed from: B0 */
    public final B z0(I i7) {
        if (i7 != null) {
            throw new IllegalStateException(this.f13384l);
        }
        F0(0);
        throw null;
    }

    @Override // n5.AbstractC1576m
    public final B C0() {
        throw new IllegalStateException(this.f13384l);
    }

    @Override // n5.AbstractC1576m
    /* renamed from: D0 */
    public final B y0(C1706f c1706f) {
        if (c1706f != null) {
            return this;
        }
        F0(3);
        throw null;
    }

    @Override // n5.AbstractC1576m
    public final AbstractC1576m E0(B b4) {
        throw new IllegalStateException(this.f13384l);
    }

    @Override // n5.B
    public final String toString() {
        String str = this.f13384l;
        if (str != null) {
            return str;
        }
        F0(1);
        throw null;
    }

    @Override // n5.AbstractC1576m, n5.AbstractC1586x
    /* renamed from: v0 */
    public final AbstractC1586x y0(C1706f c1706f) {
        if (c1706f != null) {
            return this;
        }
        F0(3);
        throw null;
    }

    @Override // n5.B, n5.a0
    public final /* bridge */ /* synthetic */ a0 x0(boolean z7) {
        x0(z7);
        throw null;
    }

    @Override // n5.AbstractC1576m, n5.a0
    public final a0 y0(C1706f c1706f) {
        if (c1706f != null) {
            return this;
        }
        F0(3);
        throw null;
    }

    @Override // n5.B, n5.a0
    public final /* bridge */ /* synthetic */ a0 z0(I i7) {
        z0(i7);
        throw null;
    }
}
