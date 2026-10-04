package e5;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import r4.EnumC1882k;

/* renamed from: e5.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC0834d {
    BOOLEAN(EnumC1882k.f14944p, "boolean", "Z", "java.lang.Boolean"),
    CHAR(EnumC1882k.f14945q, "char", "C", "java.lang.Character"),
    BYTE(EnumC1882k.f14946r, "byte", "B", "java.lang.Byte"),
    SHORT(EnumC1882k.f14947s, "short", "S", "java.lang.Short"),
    INT(EnumC1882k.f14948t, "int", "I", "java.lang.Integer"),
    FLOAT(EnumC1882k.f14949u, "float", "F", "java.lang.Float"),
    LONG(EnumC1882k.f14950v, "long", "J", "java.lang.Long"),
    DOUBLE(EnumC1882k.f14951w, "double", "D", "java.lang.Double");


    /* renamed from: k, reason: collision with root package name */
    public final EnumC1882k f11372k;

    /* renamed from: l, reason: collision with root package name */
    public final String f11373l;

    /* renamed from: m, reason: collision with root package name */
    public final String f11374m;

    /* renamed from: n, reason: collision with root package name */
    public final W4.c f11375n;

    /* renamed from: w, reason: collision with root package name */
    public static final HashMap f11368w = new HashMap();

    /* renamed from: x, reason: collision with root package name */
    public static final EnumMap f11369x = new EnumMap(EnumC1882k.class);

    /* renamed from: y, reason: collision with root package name */
    public static final HashMap f11370y = new HashMap();

    /* renamed from: z, reason: collision with root package name */
    public static final HashSet f11371z = new HashSet();

    /* renamed from: A, reason: collision with root package name */
    public static final HashMap f11358A = new HashMap();

    static {
        for (EnumC0834d enumC0834d : values()) {
            f11368w.put(enumC0834d.f11373l, enumC0834d);
            f11369x.put((EnumMap) enumC0834d.d(), (EnumC1882k) enumC0834d);
            f11370y.put(enumC0834d.c(), enumC0834d);
            String strReplace = enumC0834d.f11375n.a.a.replace('.', '/');
            f11371z.add(strReplace);
            f11358A.put(strReplace, "(" + enumC0834d.f11374m + ")L" + strReplace + ";");
        }
    }

    EnumC0834d(EnumC1882k enumC1882k, String str, String str2, String str3) {
        if (enumC1882k == null) {
            a(8);
            throw null;
        }
        this.f11372k = enumC1882k;
        this.f11373l = str;
        this.f11374m = str2;
        this.f11375n = new W4.c(str3);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(int r8) {
        /*
            r0 = 6
            r1 = 4
            if (r8 == r1) goto Lc
            if (r8 == r0) goto Lc
            switch(r8) {
                case 12: goto Lc;
                case 13: goto Lc;
                case 14: goto Lc;
                case 15: goto Lc;
                default: goto L9;
            }
        L9:
            java.lang.String r2 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto Le
        Lc:
            java.lang.String r2 = "@NotNull method %s.%s must not return null"
        Le:
            r3 = 2
            if (r8 == r1) goto L18
            if (r8 == r0) goto L18
            switch(r8) {
                case 12: goto L18;
                case 13: goto L18;
                case 14: goto L18;
                case 15: goto L18;
                default: goto L16;
            }
        L16:
            r4 = 3
            goto L19
        L18:
            r4 = r3
        L19:
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType"
            r6 = 0
            switch(r8) {
                case 1: goto L47;
                case 2: goto L42;
                case 3: goto L3d;
                case 4: goto L3a;
                case 5: goto L35;
                case 6: goto L3a;
                case 7: goto L30;
                case 8: goto L2b;
                case 9: goto L3d;
                case 10: goto L30;
                case 11: goto L26;
                case 12: goto L3a;
                case 13: goto L3a;
                case 14: goto L3a;
                case 15: goto L3a;
                default: goto L21;
            }
        L21:
            java.lang.String r7 = "internalName"
            r4[r6] = r7
            goto L4b
        L26:
            java.lang.String r7 = "wrapperClassName"
            r4[r6] = r7
            goto L4b
        L2b:
            java.lang.String r7 = "primitiveType"
            r4[r6] = r7
            goto L4b
        L30:
            java.lang.String r7 = "desc"
            r4[r6] = r7
            goto L4b
        L35:
            java.lang.String r7 = "type"
            r4[r6] = r7
            goto L4b
        L3a:
            r4[r6] = r5
            goto L4b
        L3d:
            java.lang.String r7 = "name"
            r4[r6] = r7
            goto L4b
        L42:
            java.lang.String r7 = "methodDescriptor"
            r4[r6] = r7
            goto L4b
        L47:
            java.lang.String r7 = "owner"
            r4[r6] = r7
        L4b:
            java.lang.String r6 = "get"
            r7 = 1
            if (r8 == r1) goto L6c
            if (r8 == r0) goto L6c
            switch(r8) {
                case 12: goto L67;
                case 13: goto L62;
                case 14: goto L5d;
                case 15: goto L58;
                default: goto L55;
            }
        L55:
            r4[r7] = r5
            goto L6e
        L58:
            java.lang.String r5 = "getWrapperFqName"
            r4[r7] = r5
            goto L6e
        L5d:
            java.lang.String r5 = "getDesc"
            r4[r7] = r5
            goto L6e
        L62:
            java.lang.String r5 = "getJavaKeywordName"
            r4[r7] = r5
            goto L6e
        L67:
            java.lang.String r5 = "getPrimitiveType"
            r4[r7] = r5
            goto L6e
        L6c:
            r4[r7] = r6
        L6e:
            switch(r8) {
                case 1: goto L83;
                case 2: goto L83;
                case 3: goto L80;
                case 4: goto L87;
                case 5: goto L80;
                case 6: goto L87;
                case 7: goto L7b;
                case 8: goto L76;
                case 9: goto L76;
                case 10: goto L76;
                case 11: goto L76;
                case 12: goto L87;
                case 13: goto L87;
                case 14: goto L87;
                case 15: goto L87;
                default: goto L71;
            }
        L71:
            java.lang.String r5 = "isWrapperClassInternalName"
            r4[r3] = r5
            goto L87
        L76:
            java.lang.String r5 = "<init>"
            r4[r3] = r5
            goto L87
        L7b:
            java.lang.String r5 = "getByDesc"
            r4[r3] = r5
            goto L87
        L80:
            r4[r3] = r6
            goto L87
        L83:
            java.lang.String r5 = "isBoxingMethodDescriptor"
            r4[r3] = r5
        L87:
            java.lang.String r2 = java.lang.String.format(r2, r4)
            if (r8 == r1) goto L98
            if (r8 == r0) goto L98
            switch(r8) {
                case 12: goto L98;
                case 13: goto L98;
                case 14: goto L98;
                case 15: goto L98;
                default: goto L92;
            }
        L92:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r2)
            goto L9d
        L98:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r2)
        L9d:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: e5.EnumC0834d.a(int):void");
    }

    public static EnumC0834d b(String str) {
        EnumC0834d enumC0834d = (EnumC0834d) f11368w.get(str);
        if (enumC0834d != null) {
            return enumC0834d;
        }
        throw new AssertionError("Non-primitive type name passed: ".concat(str));
    }

    public final String c() {
        String str = this.f11374m;
        if (str != null) {
            return str;
        }
        a(14);
        throw null;
    }

    public final EnumC1882k d() {
        EnumC1882k enumC1882k = this.f11372k;
        if (enumC1882k != null) {
            return enumC1882k;
        }
        a(12);
        throw null;
    }
}
