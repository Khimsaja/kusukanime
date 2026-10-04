package T1;

import B1.K;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.os.Build;
import android.view.Surface;

/* loaded from: classes.dex */
public final class k extends Surface {

    /* renamed from: n, reason: collision with root package name */
    public static int f8924n;

    /* renamed from: o, reason: collision with root package name */
    public static boolean f8925o;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f8926k;

    /* renamed from: l, reason: collision with root package name */
    public final j f8927l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f8928m;

    public k(j jVar, SurfaceTexture surfaceTexture, boolean z7) {
        super(surfaceTexture);
        this.f8927l = jVar;
        this.f8926k = z7;
    }

    public static synchronized boolean a(Context context) {
        String strEglQueryString;
        int i7;
        try {
            if (!f8925o) {
                int i8 = K.a;
                if (i8 >= 24 && ((i8 >= 26 || !("samsung".equals(Build.MANUFACTURER) || "XT1650".equals(Build.MODEL))) && ((i8 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains("EGL_EXT_protected_content")))) {
                    String strEglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                    i7 = strEglQueryString2 != null && strEglQueryString2.contains("EGL_KHR_surfaceless_context") ? 1 : 2;
                } else {
                    i7 = 0;
                }
                f8924n = i7;
                f8925o = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return f8924n != 0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f8927l) {
            try {
                if (!this.f8928m) {
                    j jVar = this.f8927l;
                    jVar.f8920l.getClass();
                    jVar.f8920l.sendEmptyMessage(2);
                    this.f8928m = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
