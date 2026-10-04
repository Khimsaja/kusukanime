package io.github.jan.supabase.auth.exception;

import io.ktor.client.statement.HttpResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\u0018\u0000 \f2\u00020\u0001:\u0001\fB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lio/github/jan/supabase/auth/exception/AuthWeakPasswordException;", "Lio/github/jan/supabase/auth/exception/AuthRestException;", "description", "", "response", "Lio/ktor/client/statement/HttpResponse;", "reasons", "", "<init>", "(Ljava/lang/String;Lio/ktor/client/statement/HttpResponse;Ljava/util/List;)V", "getReasons", "()Ljava/util/List;", "Companion", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AuthWeakPasswordException extends AuthRestException {
    public static final String CODE = "weak_password";
    private final List<String> reasons;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthWeakPasswordException(String str, HttpResponse httpResponse, List<String> list) {
        super(CODE, str, httpResponse);
        l.f("description", str);
        l.f("response", httpResponse);
        l.f("reasons", list);
        this.reasons = list;
    }

    public final List<String> getReasons() {
        return this.reasons;
    }
}
