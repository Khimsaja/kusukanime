package q;

import android.content.Context;
import android.widget.EdgeEffect;

/* loaded from: classes.dex */
public final class L extends EdgeEffect {
    public final float a;

    /* renamed from: b, reason: collision with root package name */
    public float f14493b;

    public L(Context context) {
        super(context);
        this.a = n6.m.a(context).f8836k * 1;
    }

    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int i7) {
        this.f14493b = 0.0f;
        super.onAbsorb(i7);
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f5, float f7) {
        this.f14493b = 0.0f;
        super.onPull(f5, f7);
    }

    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        this.f14493b = 0.0f;
        super.onRelease();
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f5) {
        this.f14493b = 0.0f;
        super.onPull(f5);
    }
}
