package B1;

import android.graphics.Point;
import android.graphics.Rect;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackMetrics;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import android.view.ScrollCaptureTarget;
import android.view.View;

/* loaded from: classes.dex */
public abstract /* synthetic */ class t {
    public static /* bridge */ /* synthetic */ MediaMetricsManager b(Object obj) {
        return (MediaMetricsManager) obj;
    }

    public static /* bridge */ /* synthetic */ PlaybackMetrics.Builder g(Object obj) {
        return (PlaybackMetrics.Builder) obj;
    }

    public static /* bridge */ /* synthetic */ ScrollCaptureSession j(Object obj) {
        return (ScrollCaptureSession) obj;
    }

    public static /* synthetic */ ScrollCaptureTarget k(View view, Rect rect, Point point, ScrollCaptureCallback scrollCaptureCallback) {
        return new ScrollCaptureTarget(view, rect, point, scrollCaptureCallback);
    }
}
