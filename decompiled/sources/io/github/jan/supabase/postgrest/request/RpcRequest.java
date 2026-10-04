package io.github.jan.supabase.postgrest.request;

import P3.r;
import P3.y;
import io.github.jan.supabase.postgrest.query.Count;
import io.github.jan.supabase.postgrest.query.Returning;
import io.ktor.client.utils.CacheControl;
import io.ktor.http.Headers;
import io.ktor.http.HttpMethod;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import kotlinx.serialization.json.b;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u000b\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u001dX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lio/github/jan/supabase/postgrest/request/RpcRequest;", "Lio/github/jan/supabase/postgrest/request/PostgrestRequest;", "method", "Lio/ktor/http/HttpMethod;", "count", "Lio/github/jan/supabase/postgrest/query/Count;", "urlParams", "", "", "body", "Lkotlinx/serialization/json/JsonElement;", "schema", "headers", "Lio/ktor/http/Headers;", "<init>", "(Lio/ktor/http/HttpMethod;Lio/github/jan/supabase/postgrest/query/Count;Ljava/util/Map;Lkotlinx/serialization/json/JsonElement;Ljava/lang/String;Lio/ktor/http/Headers;)V", "getMethod", "()Lio/ktor/http/HttpMethod;", "getCount", "()Lio/github/jan/supabase/postgrest/query/Count;", "getUrlParams", "()Ljava/util/Map;", "getBody", "()Lkotlinx/serialization/json/JsonElement;", "getSchema", "()Ljava/lang/String;", "getHeaders", "()Lio/ktor/http/Headers;", "prefer", "", "getPrefer", "()Ljava/util/List;", "postgrest-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RpcRequest implements PostgrestRequest {
    private final b body;
    private final Count count;
    private final Headers headers;
    private final HttpMethod method;
    private final List<String> prefer;
    private final String schema;
    private final Map<String, String> urlParams;

    public RpcRequest(HttpMethod httpMethod, Count count, Map<String, String> map, b bVar, String str, Headers headers) {
        List<String> listH;
        l.f("method", httpMethod);
        l.f("urlParams", map);
        l.f("schema", str);
        l.f("headers", headers);
        this.method = httpMethod;
        this.count = count;
        this.urlParams = map;
        this.body = bVar;
        this.schema = str;
        this.headers = headers;
        if (count != null) {
            listH = r.H("count=" + count.getIdentifier());
        } else {
            listH = y.f7779k;
        }
        this.prefer = listH;
    }

    @Override // io.github.jan.supabase.postgrest.request.PostgrestRequest
    public b getBody() {
        return this.body;
    }

    public final Count getCount() {
        return this.count;
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
    public /* bridge */ Returning getReturning() {
        return super.getReturning();
    }

    @Override // io.github.jan.supabase.postgrest.request.PostgrestRequest
    public String getSchema() {
        return this.schema;
    }

    @Override // io.github.jan.supabase.postgrest.request.PostgrestRequest
    public Map<String, String> getUrlParams() {
        return this.urlParams;
    }

    public /* synthetic */ RpcRequest(HttpMethod httpMethod, Count count, Map map, b bVar, String str, Headers headers, int i7, f fVar) {
        this(httpMethod, (i7 & 2) != 0 ? null : count, map, (i7 & 8) != 0 ? null : bVar, (i7 & 16) != 0 ? CacheControl.PUBLIC : str, (i7 & 32) != 0 ? Headers.INSTANCE.getEmpty() : headers);
    }
}
