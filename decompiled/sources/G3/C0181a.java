package G3;

import java.lang.reflect.Type;

/* renamed from: G3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0181a {
    public final /* synthetic */ int a;

    public /* synthetic */ C0181a(int i7) {
        this.a = i7;
    }

    public static void b(Type type, Class cls) {
        Class<?> clsD = C.d(type);
        if (cls.isAssignableFrom(clsD)) {
            throw new IllegalArgumentException("No JsonAdapter for " + type + ", you should probably use " + cls.getSimpleName() + " instead of " + clsD.getSimpleName() + " (Moshi only supports the collection interfaces by default) or else register a custom JsonAdapter.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0385  */
    /* JADX WARN: Type inference failed for: r0v93, types: [O3.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v47 */
    /* JADX WARN: Type inference failed for: r13v48 */
    /* JADX WARN: Type inference failed for: r13v49, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final G3.j a(java.lang.reflect.Type r26, java.util.Set r27, G3.x r28) throws java.lang.NoSuchFieldException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.ClassNotFoundException {
        /*
            Method dump skipped, instructions count: 2318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: G3.C0181a.a(java.lang.reflect.Type, java.util.Set, G3.x):G3.j");
    }
}
