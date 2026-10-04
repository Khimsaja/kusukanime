package i1;

import android.view.animation.Interpolator;

/* renamed from: i1.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1039D {
    public float a;

    /* renamed from: b, reason: collision with root package name */
    public final Interpolator f11939b;

    /* renamed from: c, reason: collision with root package name */
    public final long f11940c;

    public AbstractC1039D(Interpolator interpolator, long j7) {
        this.f11939b = interpolator;
        this.f11940c = j7;
    }

    public long a() {
        return this.f11940c;
    }

    public float b() {
        Interpolator interpolator = this.f11939b;
        return interpolator != null ? interpolator.getInterpolation(this.a) : this.a;
    }

    public void c(float f5) {
        this.a = f5;
    }
}
