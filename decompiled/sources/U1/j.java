package U1;

import B1.AbstractC0015b;
import B1.C0024k;
import B1.G;
import B1.RunnableC0016c;
import H1.C0221b;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.util.Log;
import java.nio.Buffer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: classes.dex */
public final class j implements GLSurfaceView.Renderer, c {
    public final i a;

    /* renamed from: d, reason: collision with root package name */
    public final float[] f9171d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f9172e;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f9173f;

    /* renamed from: g, reason: collision with root package name */
    public float f9174g;

    /* renamed from: h, reason: collision with root package name */
    public float f9175h;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ k f9178k;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f9169b = new float[16];

    /* renamed from: c, reason: collision with root package name */
    public final float[] f9170c = new float[16];

    /* renamed from: i, reason: collision with root package name */
    public final float[] f9176i = new float[16];

    /* renamed from: j, reason: collision with root package name */
    public final float[] f9177j = new float[16];

    public j(k kVar, i iVar) {
        this.f9178k = kVar;
        float[] fArr = new float[16];
        this.f9171d = fArr;
        float[] fArr2 = new float[16];
        this.f9172e = fArr2;
        float[] fArr3 = new float[16];
        this.f9173f = fArr3;
        this.a = iVar;
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(fArr2, 0);
        Matrix.setIdentityM(fArr3, 0);
        this.f9175h = 3.1415927f;
    }

    @Override // U1.c
    public final synchronized void a(float[] fArr, float f5) {
        float[] fArr2 = this.f9171d;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        float f7 = -f5;
        this.f9175h = f7;
        Matrix.setRotateM(this.f9172e, 0, -this.f9174g, (float) Math.cos(f7), (float) Math.sin(this.f9175h), 0.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        Object objT;
        synchronized (this) {
            Matrix.multiplyMM(this.f9177j, 0, this.f9171d, 0, this.f9173f, 0);
            Matrix.multiplyMM(this.f9176i, 0, this.f9172e, 0, this.f9177j, 0);
        }
        Matrix.multiplyMM(this.f9170c, 0, this.f9169b, 0, this.f9176i, 0);
        i iVar = this.a;
        float[] fArr = this.f9170c;
        GLES20.glClear(16384);
        try {
            AbstractC0015b.d();
        } catch (C0024k e7) {
            AbstractC0015b.n("SceneRenderer", "Failed to draw a frame", e7);
        }
        if (iVar.f9156k.compareAndSet(true, false)) {
            SurfaceTexture surfaceTexture = iVar.f9165t;
            surfaceTexture.getClass();
            surfaceTexture.updateTexImage();
            try {
                AbstractC0015b.d();
            } catch (C0024k e8) {
                AbstractC0015b.n("SceneRenderer", "Failed to draw a frame", e8);
            }
            if (iVar.f9157l.compareAndSet(true, false)) {
                Matrix.setIdentityM(iVar.f9162q, 0);
            }
            long timestamp = iVar.f9165t.getTimestamp();
            G g4 = iVar.f9160o;
            synchronized (g4) {
                objT = g4.t(timestamp, false);
            }
            Long l7 = (Long) objT;
            if (l7 != null) {
                C0221b c0221b = iVar.f9159n;
                float[] fArr2 = iVar.f9162q;
                float[] fArr3 = (float[]) ((G) c0221b.f3407n).v(l7.longValue());
                if (fArr3 != null) {
                    float f5 = fArr3[0];
                    float f7 = -fArr3[1];
                    float f8 = -fArr3[2];
                    float length = Matrix.length(f5, f7, f8);
                    float[] fArr4 = (float[]) c0221b.f3406m;
                    if (length != 0.0f) {
                        Matrix.setRotateM(fArr4, 0, (float) Math.toDegrees(length), f5 / length, f7 / length, f8 / length);
                    } else {
                        Matrix.setIdentityM(fArr4, 0);
                    }
                    if (!c0221b.f3404k) {
                        C0221b.c((float[]) c0221b.f3405l, (float[]) c0221b.f3406m);
                        c0221b.f3404k = true;
                    }
                    Matrix.multiplyMM(fArr2, 0, (float[]) c0221b.f3405l, 0, (float[]) c0221b.f3406m, 0);
                }
            }
            f fVar = (f) iVar.f9161p.v(timestamp);
            if (fVar != null) {
                g gVar = iVar.f9158m;
                gVar.getClass();
                if (g.b(fVar)) {
                    gVar.a = fVar.f9143c;
                    gVar.f9148b = new G(fVar.a.a[0]);
                    if (!fVar.f9144d) {
                        G g7 = fVar.f9142b.a[0];
                        float[] fArr5 = (float[]) g7.f295d;
                        int length2 = fArr5.length;
                        AbstractC0015b.k(fArr5);
                        AbstractC0015b.k((float[]) g7.f296e);
                    }
                }
            }
        }
        Matrix.multiplyMM(iVar.f9163r, 0, fArr, 0, iVar.f9162q, 0);
        g gVar2 = iVar.f9158m;
        int i7 = iVar.f9164s;
        float[] fArr6 = iVar.f9163r;
        G g8 = gVar2.f9148b;
        if (g8 == null) {
            return;
        }
        int i8 = gVar2.a;
        GLES20.glUniformMatrix3fv(gVar2.f9151e, 1, false, i8 == 1 ? g.f9146j : i8 == 2 ? g.f9147k : g.f9145i, 0);
        GLES20.glUniformMatrix4fv(gVar2.f9150d, 1, false, fArr6, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i7);
        GLES20.glUniform1i(gVar2.f9154h, 0);
        try {
            AbstractC0015b.d();
        } catch (C0024k e9) {
            Log.e("ProjectionRenderer", "Failed to bind uniforms", e9);
        }
        GLES20.glVertexAttribPointer(gVar2.f9152f, 3, 5126, false, 12, (Buffer) g8.f295d);
        try {
            AbstractC0015b.d();
        } catch (C0024k e10) {
            Log.e("ProjectionRenderer", "Failed to load position data", e10);
        }
        GLES20.glVertexAttribPointer(gVar2.f9153g, 2, 5126, false, 8, (Buffer) g8.f296e);
        try {
            AbstractC0015b.d();
        } catch (C0024k e11) {
            Log.e("ProjectionRenderer", "Failed to load texture data", e11);
        }
        GLES20.glDrawArrays(g8.f294c, 0, g8.f293b);
        try {
            AbstractC0015b.d();
        } catch (C0024k e12) {
            Log.e("ProjectionRenderer", "Failed to render", e12);
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i7, int i8) {
        GLES20.glViewport(0, 0, i7, i8);
        float f5 = i7 / i8;
        Matrix.perspectiveM(this.f9169b, 0, f5 > 1.0f ? (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / f5)) * 2.0d) : 90.0f, f5, 0.1f, 100.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        k kVar = this.f9178k;
        kVar.f9183o.post(new RunnableC0016c(19, kVar, this.a.c()));
    }
}
