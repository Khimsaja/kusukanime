package B1;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;

/* renamed from: B1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0022i implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f329q = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: k, reason: collision with root package name */
    public final Handler f330k;

    /* renamed from: l, reason: collision with root package name */
    public final int[] f331l = new int[1];

    /* renamed from: m, reason: collision with root package name */
    public EGLDisplay f332m;

    /* renamed from: n, reason: collision with root package name */
    public EGLContext f333n;

    /* renamed from: o, reason: collision with root package name */
    public EGLSurface f334o;

    /* renamed from: p, reason: collision with root package name */
    public SurfaceTexture f335p;

    public RunnableC0022i(Handler handler) {
        this.f330k = handler;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f330k.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture = this.f335p;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
