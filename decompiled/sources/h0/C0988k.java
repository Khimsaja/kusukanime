package h0;

import android.graphics.PathMeasure;

/* renamed from: h0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0988k {
    public final PathMeasure a;

    public C0988k(PathMeasure pathMeasure) {
        this.a = pathMeasure;
    }

    public final void a(float f5, float f7, C0987j c0987j) {
        if (c0987j == null) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        this.a.getSegment(f5, f7, c0987j.a, true);
    }
}
