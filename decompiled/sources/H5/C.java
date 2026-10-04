package H5;

import io.ktor.http.ContentType;

/* loaded from: classes.dex */
public final class C extends Error {
    public C() {
        super("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(String str) {
        super(str);
        kotlin.jvm.internal.l.f(ContentType.Message.TYPE, str);
    }
}
