package d1;

import K2.d0;
import android.content.res.Resources;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;
import l4.AbstractC1420H;
import n6.m;

/* renamed from: d1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0784c {
    public static final AbstractC1420H a;

    /* renamed from: b, reason: collision with root package name */
    public static final d0 f11203b;

    static {
        m.m("TypefaceCompat static init");
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 29) {
            a = new h();
        } else if (i7 >= 28) {
            a = new g();
        } else if (i7 >= 26) {
            a = new f();
        } else {
            Method method = e.f11211k;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                a = new e();
            } else {
                a = new d();
            }
        }
        f11203b = new d0(16);
        Trace.endSection();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Typeface a(android.content.Context r9, c1.InterfaceC0747a r10, android.content.res.Resources r11, int r12, java.lang.String r13, int r14, n6.d r15) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.AbstractC0784c.a(android.content.Context, c1.a, android.content.res.Resources, int, java.lang.String, int, n6.d):android.graphics.Typeface");
    }

    public static String b(Resources resources, int i7, String str, int i8) {
        return resources.getResourcePackageName(i7) + '-' + str + '-' + i8 + '-' + i7 + "-0";
    }
}
