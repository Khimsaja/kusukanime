package a6;

import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class v {
    public final LinkedHashMap a = new LinkedHashMap();

    public final kotlinx.serialization.json.c a() {
        return new kotlinx.serialization.json.c(this.a);
    }

    public final kotlinx.serialization.json.b b(String str, kotlinx.serialization.json.b bVar) {
        kotlin.jvm.internal.l.f("key", str);
        kotlin.jvm.internal.l.f("element", bVar);
        return (kotlinx.serialization.json.b) this.a.put(str, bVar);
    }
}
