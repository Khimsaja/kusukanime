package io.github.jan.supabase.exceptions;

import io.ktor.client.statement.HttpResponse;
import io.ktor.client.statement.HttpResponseKt;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import z5.AbstractC2511p;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lio/github/jan/supabase/exceptions/RestException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "error", "", "description", "response", "Lio/ktor/client/statement/HttpResponse;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lio/ktor/client/statement/HttpResponse;)V", "getError", "()Ljava/lang/String;", "getDescription", "getResponse", "()Lio/ktor/client/statement/HttpResponse;", "statusCode", "", "getStatusCode", "()I", "supabase-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public class RestException extends Exception {
    private final String description;
    private final String error;
    private final HttpResponse response;
    private final int statusCode;

    public RestException(String str, String str2, HttpResponse httpResponse) {
        String strConcat;
        l.f("error", str);
        l.f("response", httpResponse);
        StringBuilder sb = new StringBuilder("\n        ");
        sb.append(str);
        sb.append((str2 == null || (strConcat = "\n".concat(str2)) == null) ? "" : strConcat);
        sb.append("\n        URL: ");
        sb.append(HttpResponseKt.getRequest(httpResponse).getUrl());
        sb.append("\n        Headers: ");
        sb.append(HttpResponseKt.getRequest(httpResponse).getHeaders().entries());
        sb.append("\n        Http Method: ");
        sb.append(HttpResponseKt.getRequest(httpResponse).getMethod().getValue());
        sb.append('\n');
        super(AbstractC2511p.E(sb.toString()));
        this.error = str;
        this.description = str2;
        this.response = httpResponse;
        this.statusCode = httpResponse.getStatus().getValue();
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getError() {
        return this.error;
    }

    public final HttpResponse getResponse() {
        return this.response;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }
}
