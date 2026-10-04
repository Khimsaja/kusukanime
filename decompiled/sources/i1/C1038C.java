package i1;

import android.view.WindowInsetsAnimation;

/* renamed from: i1.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1038C extends AbstractC1039D {

    /* renamed from: d, reason: collision with root package name */
    public final WindowInsetsAnimation f11938d;

    public C1038C(WindowInsetsAnimation windowInsetsAnimation) {
        super(null, 0L);
        this.f11938d = windowInsetsAnimation;
    }

    @Override // i1.AbstractC1039D
    public final long a() {
        return this.f11938d.getDurationMillis();
    }

    @Override // i1.AbstractC1039D
    public final float b() {
        return this.f11938d.getInterpolatedFraction();
    }

    @Override // i1.AbstractC1039D
    public final void c(float f5) {
        this.f11938d.setFraction(f5);
    }
}
