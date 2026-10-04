package C0;

import android.media.MediaCodecInfo;
import android.view.SurfaceControl;
import android.view.contentcapture.ContentCaptureSession;

/* loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint b() {
        return new MediaCodecInfo.VideoCapabilities.PerformancePoint(1280, 720, 60);
    }

    public static /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint c(int i7, int i8, int i9) {
        return new MediaCodecInfo.VideoCapabilities.PerformancePoint(i7, i8, i9);
    }

    public static /* bridge */ /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint d(Object obj) {
        return (MediaCodecInfo.VideoCapabilities.PerformancePoint) obj;
    }

    public static /* synthetic */ SurfaceControl.Transaction f() {
        return new SurfaceControl.Transaction();
    }

    public static /* bridge */ /* synthetic */ ContentCaptureSession g(Object obj) {
        return (ContentCaptureSession) obj;
    }

    public static /* synthetic */ void i() {
    }
}
