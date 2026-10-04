package y1;

import java.util.HashSet;

/* renamed from: y1.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2402y {
    public static final HashSet a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public static String f18143b = "media3.common";

    public static synchronized void a(String str) {
        if (a.add(str)) {
            f18143b += ", " + str;
        }
    }
}
