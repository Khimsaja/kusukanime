package b1;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.view.ViewConfiguration;
import x3.d;

/* renamed from: b1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0702a {
    public static float a(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public static float b(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }

    public static Intent c(Context context, d dVar, IntentFilter intentFilter) {
        return context.registerReceiver(dVar, intentFilter, null, null, 4);
    }
}
