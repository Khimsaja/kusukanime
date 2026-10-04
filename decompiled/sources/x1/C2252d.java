package x1;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* renamed from: x1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2252d {
    public final C2251c a = new C2251c();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f17303b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f17304c = new LinkedHashSet();

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f17305d;

    public static void a(AutoCloseable autoCloseable) throws Exception {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (Exception e7) {
                throw new RuntimeException(e7);
            }
        }
    }
}
