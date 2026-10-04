package k0;

import android.os.Build;
import java.util.Locale;

/* renamed from: k0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1382i {
    public static final /* synthetic */ int a = 0;

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.l.e("this as java.lang.String).toLowerCase(Locale.ROOT)", lowerCase);
        lowerCase.equals("robolectric");
    }
}
