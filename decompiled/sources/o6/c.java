package o6;

import P3.E;
import f6.C0887A;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public abstract class c {
    public static final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    /* renamed from: b, reason: collision with root package name */
    public static final Map f13821b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r2 = C0887A.class.getPackage();
        String name = r2 != null ? r2.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(C0887A.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(m6.f.class.getName(), "okhttp.Http2");
        linkedHashMap.put(i6.d.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f13821b = E.s0(linkedHashMap);
    }
}
