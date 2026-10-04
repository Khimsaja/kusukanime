package io.github.jan.supabase.exceptions;

import io.ktor.client.statement.HttpResponse;
import io.ktor.http.ContentType;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/github/jan/supabase/exceptions/UnknownRestException;", "Lio/github/jan/supabase/exceptions/RestException;", "error", "", "response", "Lio/ktor/client/statement/HttpResponse;", ContentType.Message.TYPE, "<init>", "(Ljava/lang/String;Lio/ktor/client/statement/HttpResponse;Ljava/lang/String;)V", "supabase-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UnknownRestException extends RestException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnknownRestException(String str, HttpResponse httpResponse, String str2) {
        super(str, str2, httpResponse);
        l.f("error", str);
        l.f("response", httpResponse);
    }

    public /* synthetic */ UnknownRestException(String str, HttpResponse httpResponse, String str2, int i7, f fVar) {
        this(str, httpResponse, (i7 & 4) != 0 ? null : str2);
    }
}
