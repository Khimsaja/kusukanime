package g1;

import K2.d0;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import m.C1477G;

/* renamed from: g1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0940h {
    public static final d0 a = new d0(16);

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f11683b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f11684c;

    /* renamed from: d, reason: collision with root package name */
    public static final C1477G f11685d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new k());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f11683b = threadPoolExecutor;
        f11684c = new Object();
        f11685d = new C1477G(0);
    }

    public static String a(List list) {
        StringBuilder sb = new StringBuilder();
        for (int i7 = 0; i7 < list.size(); i7++) {
            sb.append(((C0936d) list.get(i7)).f11678e);
            sb.append("-0");
            if (i7 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00b6, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ba, code lost:
    
        throw r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static g1.C0939g b(java.lang.String r8, android.content.Context r9, java.util.List r10) {
        /*
            r0 = 1
            java.lang.String r1 = "getFontSync"
            n6.m.m(r1)
            K2.d0 r1 = g1.AbstractC0940h.a
            java.lang.Object r2 = r1.g(r8)     // Catch: java.lang.Throwable -> Lb6
            android.graphics.Typeface r2 = (android.graphics.Typeface) r2     // Catch: java.lang.Throwable -> Lb6
            if (r2 == 0) goto L19
            g1.g r8 = new g1.g     // Catch: java.lang.Throwable -> Lb6
            r8.<init>(r2)     // Catch: java.lang.Throwable -> Lb6
            android.os.Trace.endSection()
            return r8
        L19:
            F5.o r10 = g1.AbstractC0935c.a(r9, r10)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lac java.lang.Throwable -> Lb6
            int r2 = r10.f2541l     // Catch: java.lang.Throwable -> Lb6
            r3 = 0
            java.lang.Object r10 = r10.f2542m
            java.util.List r10 = (java.util.List) r10
            r4 = -3
            if (r2 == 0) goto L2d
            if (r2 == r0) goto L2b
        L29:
            r2 = r4
            goto L4d
        L2b:
            r2 = -2
            goto L4d
        L2d:
            java.lang.Object r2 = r10.get(r3)     // Catch: java.lang.Throwable -> Lb6
            g1.i[] r2 = (g1.i[]) r2     // Catch: java.lang.Throwable -> Lb6
            if (r2 == 0) goto L4c
            int r5 = r2.length     // Catch: java.lang.Throwable -> Lb6
            if (r5 != 0) goto L39
            goto L4c
        L39:
            int r5 = r2.length     // Catch: java.lang.Throwable -> Lb6
            r6 = r3
        L3b:
            if (r6 >= r5) goto L4a
            r7 = r2[r6]     // Catch: java.lang.Throwable -> Lb6
            int r7 = r7.f11689e     // Catch: java.lang.Throwable -> Lb6
            if (r7 == 0) goto L48
            if (r7 >= 0) goto L46
            goto L29
        L46:
            r2 = r7
            goto L4d
        L48:
            int r6 = r6 + r0
            goto L3b
        L4a:
            r2 = r3
            goto L4d
        L4c:
            r2 = r0
        L4d:
            if (r2 == 0) goto L58
            g1.g r8 = new g1.g     // Catch: java.lang.Throwable -> Lb6
            r8.<init>(r2)     // Catch: java.lang.Throwable -> Lb6
            android.os.Trace.endSection()
            return r8
        L58:
            int r2 = r10.size()     // Catch: java.lang.Throwable -> Lb6
            if (r2 <= r0) goto L7a
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Lb6
            r2 = 29
            if (r0 < r2) goto L7a
            l4.H r0 = d1.AbstractC0784c.a     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r0 = "TypefaceCompat.createFromFontInfoWithFallback"
            n6.m.m(r0)     // Catch: java.lang.Throwable -> Lb6
            l4.H r0 = d1.AbstractC0784c.a     // Catch: java.lang.Throwable -> L75
            android.graphics.Typeface r9 = r0.u(r9, r10)     // Catch: java.lang.Throwable -> L75
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> Lb6
            goto L90
        L75:
            r8 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> Lb6
            throw r8     // Catch: java.lang.Throwable -> Lb6
        L7a:
            java.lang.Object r10 = r10.get(r3)     // Catch: java.lang.Throwable -> Lb6
            g1.i[] r10 = (g1.i[]) r10     // Catch: java.lang.Throwable -> Lb6
            l4.H r0 = d1.AbstractC0784c.a     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r0 = "TypefaceCompat.createFromFontInfo"
            n6.m.m(r0)     // Catch: java.lang.Throwable -> Lb6
            l4.H r0 = d1.AbstractC0784c.a     // Catch: java.lang.Throwable -> La7
            android.graphics.Typeface r9 = r0.t(r9, r10)     // Catch: java.lang.Throwable -> La7
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> Lb6
        L90:
            if (r9 == 0) goto L9e
            r1.k(r8, r9)     // Catch: java.lang.Throwable -> Lb6
            g1.g r8 = new g1.g     // Catch: java.lang.Throwable -> Lb6
            r8.<init>(r9)     // Catch: java.lang.Throwable -> Lb6
            android.os.Trace.endSection()
            return r8
        L9e:
            g1.g r8 = new g1.g     // Catch: java.lang.Throwable -> Lb6
            r8.<init>(r4)     // Catch: java.lang.Throwable -> Lb6
            android.os.Trace.endSection()
            return r8
        La7:
            r8 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> Lb6
            throw r8     // Catch: java.lang.Throwable -> Lb6
        Lac:
            g1.g r8 = new g1.g     // Catch: java.lang.Throwable -> Lb6
            r9 = -1
            r8.<init>(r9)     // Catch: java.lang.Throwable -> Lb6
            android.os.Trace.endSection()
            return r8
        Lb6:
            r8 = move-exception
            android.os.Trace.endSection()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.AbstractC0940h.b(java.lang.String, android.content.Context, java.util.List):g1.g");
    }
}
