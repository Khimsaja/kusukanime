package I2;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* loaded from: classes.dex */
public abstract class j {
    public static final Y0.h a = new Y0.h();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f4036b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static A.e f4037c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? h.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static A.e b() {
        A.e eVar = new A.e(15);
        f4037c = eVar;
        Y0.h hVar = a;
        hVar.getClass();
        if (Y0.g.f10059f.o(hVar, null, eVar)) {
            Y0.g.b(hVar);
        }
        return f4037c;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x00f4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(android.content.Context r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: I2.j.c(android.content.Context, boolean):void");
    }
}
