package z0;

import android.view.MotionEvent;

/* renamed from: z0.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2482z0 {
    public static final C2482z0 a = new C2482z0();

    public final boolean a(MotionEvent motionEvent, int i7) {
        float rawX = motionEvent.getRawX(i7);
        if (Float.isInfinite(rawX) || Float.isNaN(rawX)) {
            return false;
        }
        float rawY = motionEvent.getRawY(i7);
        return (Float.isInfinite(rawY) || Float.isNaN(rawY)) ? false : true;
    }
}
