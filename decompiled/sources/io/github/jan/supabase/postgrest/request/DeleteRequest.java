package io.github.jan.supabase.postgrest.request;

import P3.r;
import Q3.c;
import io.github.jan.supabase.postgrest.query.Count;
import io.github.jan.supabase.postgrest.query.Returning;
import io.ktor.http.Headers;
import io.ktor.http.HttpMethod;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import kotlinx.serialization.json.b;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\t\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u001bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lio/github/jan/supabase/postgrest/request/DeleteRequest;", "Lio/github/jan/supabase/postgrest/request/PostgrestRequest;", "returning", "Lio/github/jan/supabase/postgrest/query/Returning;", "count", "Lio/github/jan/supabase/postgrest/query/Count;", "urlParams", "", "", "schema", "headers", "Lio/ktor/http/Headers;", "<init>", "(Lio/github/jan/supabase/postgrest/query/Returning;Lio/github/jan/supabase/postgrest/query/Count;Ljava/util/Map;Ljava/lang/String;Lio/ktor/http/Headers;)V", "getReturning", "()Lio/github/jan/supabase/postgrest/query/Returning;", "getUrlParams", "()Ljava/util/Map;", "getSchema", "()Ljava/lang/String;", "getHeaders", "()Lio/ktor/http/Headers;", "method", "Lio/ktor/http/HttpMethod;", "getMethod", "()Lio/ktor/http/HttpMethod;", "prefer", "", "getPrefer", "()Ljava/util/List;", "postgrest-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DeleteRequest implements PostgrestRequest {
    private final Count count;
    private final Headers headers;
    private final HttpMethod method;
    private final List<String> prefer;
    private final Returning returning;
    private final String schema;
    private final Map<String, String> urlParams;

    public DeleteRequest(Returning returning, Count count, Map<String, String> map, String str, Headers headers) {
        l.f("returning", returning);
        l.f("urlParams", map);
        l.f("schema", str);
        l.f("headers", headers);
        this.returning = returning;
        this.count = count;
        this.urlParams = map;
        this.schema = str;
        this.headers = headers;
        this.method = HttpMethod.INSTANCE.getDelete();
        c cVarS = r.s();
        cVarS.add("return=" + getReturning().getIdentifier());
        if (count != null) {
            cVarS.add("count=" + count.getIdentifier());
        }
        this.prefer = r.h(cVarS);
    }

    @Override // io.github.jan.supabase.postgrest.request.PostgrestRequest
    public /* bridge */ b getBody() {
        return super.getBody();
    }

    @Override // io.github.jan.supabase.postgrest.request.PostgrestRequest
    public Headers getHeaders() {
        return this.headers;
    }

    @Override // io.github.jan.supabase.postgrest.request.PostgrestRequest
    public HttpMethod getMethod() {
        return this.method;
    }

    @Override // io.github.jan.supabase.postgrest.request.PostgrestRequest
    public List<String> getPrefer() {
        return this.prefer;
    }

    @Override // io.github.jan.supabase.postgrest.request.PostgrestRequest
    public Returning getReturning() {
        return this.returning;
    }

    @Override // io.github.jan.supabase.postgrest.request.PostgrestRequest
    public String getSchema() {
        return this.schema;
    }

    @Override // io.github.jan.supabase.postgrest.request.PostgrestRequest
    public Map<String, String> getUrlParams() {
        return this.urlParams;
    }

    public /* synthetic */ DeleteRequest(Returning returning, Count count, Map map, String str, Headers headers, int i7, f fVar) {
        this((i7 & 1) != 0 ? Returning.Minimal.INSTANCE : returning, (i7 & 2) != 0 ? null : count, map, str, (i7 & 16) != 0 ? Headers.INSTANCE.getEmpty() : headers);
    }
}
