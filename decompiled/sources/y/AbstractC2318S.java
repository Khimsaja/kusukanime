package y;

import android.os.Build;
import java.util.Locale;

/* renamed from: y.S, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2318S {
    public static final C2340u a;

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.l.e("this as java.lang.String).toLowerCase(Locale.ROOT)", lowerCase);
        a = lowerCase.equals("robolectric") ? new C2340u() : null;
    }
}
