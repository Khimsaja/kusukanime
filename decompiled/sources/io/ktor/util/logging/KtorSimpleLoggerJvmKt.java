package io.ktor.util.logging;

import io.ktor.http.ContentDisposition;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import z6.b;
import z6.d;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", ContentDisposition.Parameters.Name, "Lz6/b;", "Lio/ktor/util/logging/Logger;", "KtorSimpleLogger", "(Ljava/lang/String;)Lz6/b;", "ktor-utils"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class KtorSimpleLoggerJvmKt {
    public static final b KtorSimpleLogger(String str) {
        l.f(ContentDisposition.Parameters.Name, str);
        return d.b(str);
    }
}
