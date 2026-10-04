package z0;

import android.os.Build;
import android.view.ViewConfiguration;

/* renamed from: z0.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2437c0 implements S0 {
    public final ViewConfiguration a;

    public C2437c0(ViewConfiguration viewConfiguration) {
        this.a = viewConfiguration;
    }

    @Override // z0.S0
    public final float a() {
        return this.a.getScaledMaximumFlingVelocity();
    }

    @Override // z0.S0
    public final long b() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // z0.S0
    public final long c() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // z0.S0
    public final float d() {
        return this.a.getScaledTouchSlop();
    }

    @Override // z0.S0
    public final float e() {
        if (Build.VERSION.SDK_INT >= 34) {
            return C2439d0.a.b(this.a);
        }
        return 2.0f;
    }

    @Override // z0.S0
    public final float f() {
        if (Build.VERSION.SDK_INT >= 34) {
            return C2439d0.a.a(this.a);
        }
        return 16.0f;
    }
}
