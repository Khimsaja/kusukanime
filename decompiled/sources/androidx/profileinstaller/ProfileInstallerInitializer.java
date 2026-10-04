package androidx.profileinstaller;

import A.e;
import N2.b;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import io.ktor.client.utils.CIOKt;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements b {
    @Override // N2.b
    public final Object create(Context context) {
        final Context applicationContext = context.getApplicationContext();
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: I2.f
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j7) {
                this.f4029k.getClass();
                (Build.VERSION.SDK_INT >= 28 ? Handler.createAsync(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new g(applicationContext, 0), new Random().nextInt(Math.max(CIOKt.DEFAULT_HTTP_POOL_SIZE, 1)) + 5000);
            }
        });
        return new e(14);
    }

    @Override // N2.b
    public final List dependencies() {
        return Collections.EMPTY_LIST;
    }
}
