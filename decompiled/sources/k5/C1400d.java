package k5;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import kotlin.jvm.internal.l;

/* renamed from: k5.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1400d {
    public static InputStream a(String str) throws IOException {
        l.f("path", str);
        ClassLoader classLoader = C1400d.class.getClassLoader();
        if (classLoader == null) {
            return ClassLoader.getSystemResourceAsStream(str);
        }
        URL resource = classLoader.getResource(str);
        if (resource == null) {
            return null;
        }
        URLConnection uRLConnectionOpenConnection = resource.openConnection();
        uRLConnectionOpenConnection.setUseCaches(false);
        return uRLConnectionOpenConnection.getInputStream();
    }
}
