package O;

import android.os.Looper;

/* renamed from: O.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0482b {
    public static final long a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f7056b = 0;

    static {
        long id;
        z1.c.C(C0480a.f7053m);
        try {
            id = Looper.getMainLooper().getThread().getId();
        } catch (Exception unused) {
            id = -1;
        }
        a = id;
    }
}
