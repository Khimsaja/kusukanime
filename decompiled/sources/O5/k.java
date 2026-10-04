package O5;

import M5.s;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class k {
    public static final String a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f7630b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f7631c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f7632d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f7633e;

    /* renamed from: f, reason: collision with root package name */
    public static final g f7634f;

    static {
        String property;
        int i7 = s.a;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        a = property;
        f7630b = M5.a.k("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i8 = s.a;
        if (i8 < 2) {
            i8 = 2;
        }
        f7631c = M5.a.l("kotlinx.coroutines.scheduler.core.pool.size", i8, 8);
        f7632d = M5.a.l("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 4);
        f7633e = TimeUnit.SECONDS.toNanos(M5.a.k("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f7634f = g.a;
    }
}
