package io.github.jan.supabase.postgrest.request;

import io.github.jan.supabase.annotations.SupabaseInternal;
import io.github.jan.supabase.postgrest.query.Returning;
import io.ktor.http.Headers;
import io.ktor.http.HttpMethod;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.json.b;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u0018X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0012\u0010\u001b\u001a\u00020\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\u0082\u0001\u0005\u001e\u001f !\"¨\u0006#À\u0006\u0003"}, d2 = {"Lio/github/jan/supabase/postgrest/request/PostgrestRequest;", "", "body", "Lkotlinx/serialization/json/JsonElement;", "getBody", "()Lkotlinx/serialization/json/JsonElement;", "method", "Lio/ktor/http/HttpMethod;", "getMethod", "()Lio/ktor/http/HttpMethod;", "urlParams", "", "", "getUrlParams", "()Ljava/util/Map;", "headers", "Lio/ktor/http/Headers;", "getHeaders", "()Lio/ktor/http/Headers;", "returning", "Lio/github/jan/supabase/postgrest/query/Returning;", "getReturning", "()Lio/github/jan/supabase/postgrest/query/Returning;", "prefer", "", "getPrefer", "()Ljava/util/List;", "schema", "getSchema", "()Ljava/lang/String;", "Lio/github/jan/supabase/postgrest/request/DeleteRequest;", "Lio/github/jan/supabase/postgrest/request/InsertRequest;", "Lio/github/jan/supabase/postgrest/request/RpcRequest;", "Lio/github/jan/supabase/postgrest/request/SelectRequest;", "Lio/github/jan/supabase/postgrest/request/UpdateRequest;", "postgrest-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SupabaseInternal
/* loaded from: classes.dex */
public interface PostgrestRequest {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static b getBody(PostgrestRequest postgrestRequest) {
            return PostgrestRequest.super.getBody();
        }

        @Deprecated
        public static Headers getHeaders(PostgrestRequest postgrestRequest) {
            return PostgrestRequest.super.getHeaders();
        }

        @Deprecated
        public static Returning getReturning(PostgrestRequest postgrestRequest) {
            return PostgrestRequest.super.getReturning();
        }
    }

    default b getBody() {
        return null;
    }

    default Headers getHeaders() {
        return Headers.INSTANCE.getEmpty();
    }

    HttpMethod getMethod();

    List<String> getPrefer();

    default Returning getReturning() {
        return Returning.Minimal.INSTANCE;
    }

    String getSchema();

    Map<String, String> getUrlParams();
}
