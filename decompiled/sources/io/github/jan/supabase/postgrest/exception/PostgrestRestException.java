package io.github.jan.supabase.postgrest.exception;

import io.github.jan.supabase.exceptions.RestException;
import io.ktor.client.statement.HttpResponse;
import io.ktor.http.ContentType;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import kotlinx.serialization.json.b;
import z5.AbstractC2511p;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u0011"}, d2 = {"Lio/github/jan/supabase/postgrest/exception/PostgrestRestException;", "Lio/github/jan/supabase/exceptions/RestException;", ContentType.Message.TYPE, "", "hint", "details", "Lkotlinx/serialization/json/JsonElement;", "code", "response", "Lio/ktor/client/statement/HttpResponse;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;Ljava/lang/String;Lio/ktor/client/statement/HttpResponse;)V", "getHint", "()Ljava/lang/String;", "getDetails", "()Lkotlinx/serialization/json/JsonElement;", "getCode", "postgrest-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PostgrestRestException extends RestException {
    private final String code;
    private final b details;
    private final String hint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostgrestRestException(String str, String str2, b bVar, String str3, HttpResponse httpResponse) {
        super(str, AbstractC2511p.E("\n    Code: " + str3 + "\n    Hint: " + str2 + "\n    Details: " + bVar + '\n'), httpResponse);
        l.f(ContentType.Message.TYPE, str);
        l.f("response", httpResponse);
        this.hint = str2;
        this.details = bVar;
        this.code = str3;
    }

    public final String getCode() {
        return this.code;
    }

    public final b getDetails() {
        return this.details;
    }

    public final String getHint() {
        return this.hint;
    }
}
