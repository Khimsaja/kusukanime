package H1;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* loaded from: classes.dex */
public final class D implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ G f3212k;

    public D(G g4) {
        this.f3212k = g4;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i8) {
        G g4 = this.f3212k;
        g4.getClass();
        Surface surface = new Surface(surfaceTexture);
        g4.p1(surface);
        g4.f3242a0 = surface;
        g4.g1(i7, i8);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        G g4 = this.f3212k;
        g4.p1(null);
        g4.g1(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i8) {
        this.f3212k.g1(i7, i8);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i7, int i8, int i9) {
        this.f3212k.g1(i8, i9);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        G g4 = this.f3212k;
        if (g4.f3245d0) {
            g4.p1(surfaceHolder.getSurface());
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        G g4 = this.f3212k;
        if (g4.f3245d0) {
            g4.p1(null);
        }
        g4.g1(0, 0);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
