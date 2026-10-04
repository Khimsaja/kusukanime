package io.github.jan.supabase.auth.exception;

import b1.AbstractC0703b;
import io.github.jan.supabase.exceptions.RestException;
import io.ktor.client.statement.HttpResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lio/github/jan/supabase/auth/exception/AuthRestException;", "Lio/github/jan/supabase/exceptions/RestException;", "errorCode", "", "errorDescription", "response", "Lio/ktor/client/statement/HttpResponse;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lio/ktor/client/statement/HttpResponse;)V", "getErrorDescription", "()Ljava/lang/String;", "Lio/github/jan/supabase/auth/exception/AuthErrorCode;", "getErrorCode", "()Lio/github/jan/supabase/auth/exception/AuthErrorCode;", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public class AuthRestException extends RestException {
    private final AuthErrorCode errorCode;
    private final String errorDescription;

    public AuthRestException(String str, String str2, HttpResponse httpResponse) {
        l.f("errorCode", str);
        l.f("errorDescription", str2);
        l.f("response", httpResponse);
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        super(str, AbstractC0703b.m(sb, ": ", str), httpResponse);
        this.errorDescription = str2;
        this.errorCode = AuthErrorCode.INSTANCE.fromValue(str);
    }

    public final AuthErrorCode getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorDescription() {
        return this.errorDescription;
    }
}
