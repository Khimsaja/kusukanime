package io.github.jan.supabase.auth.exception;

import io.ktor.client.statement.HttpResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lio/github/jan/supabase/auth/exception/AuthSessionMissingException;", "Lio/github/jan/supabase/auth/exception/AuthRestException;", "response", "Lio/ktor/client/statement/HttpResponse;", "<init>", "(Lio/ktor/client/statement/HttpResponse;)V", "Companion", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AuthSessionMissingException extends AuthRestException {
    public static final String CODE = "session_not_found";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthSessionMissingException(HttpResponse httpResponse) {
        super(CODE, "Session not found. This can happen if the user was logged out or deleted.", httpResponse);
        l.f("response", httpResponse);
    }
}
