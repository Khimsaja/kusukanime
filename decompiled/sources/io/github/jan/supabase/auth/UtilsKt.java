package io.github.jan.supabase.auth;

import io.ktor.http.ContentType;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0004"}, d2 = {"invalidArg", "", ContentType.Message.TYPE, "", "auth-kt_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UtilsKt {
    public static final Void invalidArg(String str) {
        l.f(ContentType.Message.TYPE, str);
        throw new IllegalArgumentException(str);
    }
}
