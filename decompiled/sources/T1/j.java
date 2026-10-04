package T1;

import B1.AbstractC0015b;
import B1.C0024k;
import B1.K;
import B1.RunnableC0022i;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.Locale;

/* loaded from: classes.dex */
public final class j extends HandlerThread implements Handler.Callback {

    /* renamed from: k, reason: collision with root package name */
    public RunnableC0022i f8919k;

    /* renamed from: l, reason: collision with root package name */
    public Handler f8920l;

    /* renamed from: m, reason: collision with root package name */
    public Error f8921m;

    /* renamed from: n, reason: collision with root package name */
    public RuntimeException f8922n;

    /* renamed from: o, reason: collision with root package name */
    public k f8923o;

    public final void a(int i7) throws C0024k {
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        this.f8919k.getClass();
        RunnableC0022i runnableC0022i = this.f8919k;
        runnableC0022i.getClass();
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        AbstractC0015b.e("eglGetDisplay failed", eGLDisplayEglGetDisplay != null);
        int[] iArr = new int[2];
        AbstractC0015b.e("eglInitialize failed", EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1));
        runnableC0022i.f332m = eGLDisplayEglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, RunnableC0022i.f329q, 0, eGLConfigArr, 0, 1, iArr2, 0);
        boolean z7 = zEglChooseConfig && iArr2[0] > 0 && eGLConfigArr[0] != null;
        Object[] objArr = {Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr2[0]), eGLConfigArr[0]};
        int i8 = K.a;
        AbstractC0015b.e(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr), z7);
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(runnableC0022i.f332m, eGLConfig, EGL14.EGL_NO_CONTEXT, i7 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        AbstractC0015b.e("eglCreateContext failed", eGLContextEglCreateContext != null);
        runnableC0022i.f333n = eGLContextEglCreateContext;
        EGLDisplay eGLDisplay = runnableC0022i.f332m;
        if (i7 == 1) {
            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i7 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            AbstractC0015b.e("eglCreatePbufferSurface failed", eGLSurfaceEglCreatePbufferSurface != null);
        }
        AbstractC0015b.e("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext));
        runnableC0022i.f334o = eGLSurfaceEglCreatePbufferSurface;
        int[] iArr3 = runnableC0022i.f331l;
        GLES20.glGenTextures(1, iArr3, 0);
        AbstractC0015b.d();
        SurfaceTexture surfaceTexture = new SurfaceTexture(iArr3[0]);
        runnableC0022i.f335p = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(runnableC0022i);
        SurfaceTexture surfaceTexture2 = this.f8919k.f335p;
        surfaceTexture2.getClass();
        this.f8923o = new k(this, surfaceTexture2, i7 != 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        this.f8919k.getClass();
        RunnableC0022i runnableC0022i = this.f8919k;
        runnableC0022i.f330k.removeCallbacks(runnableC0022i);
        try {
            SurfaceTexture surfaceTexture = runnableC0022i.f335p;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, runnableC0022i.f331l, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = runnableC0022i.f332m;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = runnableC0022i.f332m;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = runnableC0022i.f334o;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(runnableC0022i.f332m, runnableC0022i.f334o);
            }
            EGLContext eGLContext = runnableC0022i.f333n;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(runnableC0022i.f332m, eGLContext);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = runnableC0022i.f332m;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(runnableC0022i.f332m);
            }
            runnableC0022i.f332m = null;
            runnableC0022i.f333n = null;
            runnableC0022i.f334o = null;
            runnableC0022i.f335p = null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i7 = message.what;
        try {
            if (i7 == 1) {
                try {
                    a(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                    return true;
                } catch (C0024k e7) {
                    AbstractC0015b.n("PlaceholderSurface", "Failed to initialize placeholder surface", e7);
                    this.f8922n = new IllegalStateException(e7);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e8) {
                    AbstractC0015b.n("PlaceholderSurface", "Failed to initialize placeholder surface", e8);
                    this.f8921m = e8;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e9) {
                    AbstractC0015b.n("PlaceholderSurface", "Failed to initialize placeholder surface", e9);
                    this.f8922n = e9;
                    synchronized (this) {
                        notify();
                    }
                }
            } else if (i7 == 2) {
                try {
                    b();
                    return true;
                } catch (Throwable th) {
                    try {
                        AbstractC0015b.n("PlaceholderSurface", "Failed to release placeholder surface", th);
                    } finally {
                        quit();
                    }
                }
            }
            return true;
        } catch (Throwable th2) {
            synchronized (this) {
                notify();
                throw th2;
            }
        }
    }
}
