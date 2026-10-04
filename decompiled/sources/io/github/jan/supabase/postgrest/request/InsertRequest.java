package io.github.jan.supabase.postgrest.request;

import A6.b;
import P3.r;
import Q3.c;
import b1.AbstractC0703b;
import io.github.jan.supabase.postgrest.query.Count;
import io.github.jan.supabase.postgrest.query.Returning;
import io.ktor.http.Headers;
import io.ktor.http.HttpMethod;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import kotlinx.serialization.json.a;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010&\u001a\u00020\u0003HÂ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0007HÂ\u0003J\t\u0010)\u001a\u00020\u0003HÂ\u0003J\t\u0010*\u001a\u00020\u0003HÂ\u0003J\t\u0010+\u001a\u00020\u000bHÆ\u0003J\u0015\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003J\t\u0010-\u001a\u00020\u000eHÆ\u0003J\t\u0010.\u001a\u00020\u0011HÆ\u0003Jq\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u0011HÆ\u0001J\u0013\u00100\u001a\u00020\u00032\b\u00101\u001a\u0004\u0018\u000102HÖ\u0003J\t\u00103\u001a\u000204HÖ\u0001J\t\u00105\u001a\u00020\u000eHÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u000f\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000e0#X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%¨\u00066"}, d2 = {"Lio/github/jan/supabase/postgrest/request/InsertRequest;", "Lio/github/jan/supabase/postgrest/request/PostgrestRequest;", "upsert", "", "returning", "Lio/github/jan/supabase/postgrest/query/Returning;", "count", "Lio/github/jan/supabase/postgrest/query/Count;", "ignoreDuplicates", "defaultToNull", "body", "Lkotlinx/serialization/json/JsonArray;", "urlParams", "", "", "schema", "headers", "Lio/ktor/http/Headers;", "<init>", "(ZLio/github/jan/supabase/postgrest/query/Returning;Lio/github/jan/supabase/postgrest/query/Count;ZZLkotlinx/serialization/json/JsonArray;Ljava/util/Map;Ljava/lang/String;Lio/ktor/http/Headers;)V", "getReturning", "()Lio/github/jan/supabase/postgrest/query/Returning;", "getBody", "()Lkotlinx/serialization/json/JsonArray;", "getUrlParams", "()Ljava/util/Map;", "getSchema", "()Ljava/lang/String;", "getHeaders", "()Lio/ktor/http/Headers;", "method", "Lio/ktor/http/HttpMethod;", "getMethod", "()Lio/ktor/http/HttpMethod;", "prefer", "", "getPrefer", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "", "toString", "postgrest-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class InsertRequest implements PostgrestRequest {
    private final a body;
    private final Count count;
    private final boolean defaultToNull;
    private final Headers headers;
    private final boolean ignoreDuplicates;
    private final HttpMethod method;
    private final List<String> prefer;
    private final Returning returning;
    private final String schema;
    private final boolean upsert;
    private final Map<String, String> urlParams;

    public InsertRequest(boolean z7, Returning returning, Count count, boolean z8, boolean z9, a aVar, Map<String, String> map, String str, Headers headers) {
        l.f("returning", returning);
        l.f("body", aVar);
        l.f("urlParams", map);
        l.f("schema", str);
        l.f("headers", headers);
        this.upsert = z7;
        this.returning = returning;
        this.count = count;
        this.ignoreDuplicates = z8;
        this.defaultToNull = z9;
        this.body = aVar;
        this.urlParams = map;
        this.schema = str;
        this.headers = headers;
        this.method = HttpMethod.INSTANCE.getPost();
        c cVarS = r.s();
        cVarS.add("return=" + getReturning().getIdentifier());
        if (z7) {
            StringBuilder sb = new StringBuilder("resolution=");
            sb.append(z8 ? "ignore" : "merge");
            sb.append("-duplicates");
            cVarS.add(sb.toString());
        }
        if (!z9) {
            cVarS.add("missing=default");
        }
        if (count != null) {
            cVarS.add("count=" + count.getIdentifier());
        }
        this.prefer = r.h(cVarS);
    }

    /* renamed from: component1, reason: from getter */
    private final boolean getUpsert() {
        return this.upsert;
    }

    /* renamed from: component3, reason: from getter */
    private final Count getCount() {
        return this.count;
    }

    /* renamed from: component4, reason: from getter */
    private final boolean getIgnoreDuplicates() {
        return this.ignoreDuplicates;
    }

    /* renamed from: component5, reason: from getter */
    private final boolean getDefaultToNull() {
        return this.defaultToNull;
    }

    public static /* synthetic */ InsertRequest copy$default(InsertRequest insertRequest, boolean z7, Returning returning, Count count, boolean z8, boolean z9, a aVar, Map map, String str, Headers headers, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z7 = insertRequest.upsert;
        }
        if ((i7 & 2) != 0) {
            returning = insertRequest.returning;
        }
        if ((i7 & 4) != 0) {
            count = insertRequest.count;
        }
        if ((i7 & 8) != 0) {
            z8 = insertRequest.ignoreDuplicates;
        }
        if ((i7 & 16) != 0) {
            z9 = insertRequest.defaultToNull;
        }
        if ((i7 & 32) != 0) {
            aVar = insertRequest.body;
        }
        if ((i7 & 64) != 0) {
            map = insertRequest.urlParams;
        }
        if ((i7 & 128) != 0) {
            str = insertRequest.schema;
        }
        if ((i7 & 256) != 0) {
            headers = insertRequest.headers;
        }
        String str2 = str;
        Headers headers2 = headers;
        a aVar2 = aVar;
        Map map2 = map;
        boolean z10 = z9;
        Count count2 = count;
        return insertRequest.copy(z7, returning, count2, z8, z10, aVar2, map2, str2, headers2);
    }

    /* renamed from: component2, reason: from getter */
    public final Returning getReturning() {
        return this.returning;
    }

    /* renamed from: component6, reason: from getter */
    public final a getBody() {
        return this.body;
    }

    public final Map<String, String> component7() {
        return this.urlParams;
    }

    /* renamed from: component8, reason: from getter */
    public final String getSchema() {
        return this.schema;
    }

    /* renamed from: component9, reason: from getter */
    public final Headers getHeaders() {
        return this.headers;
    }

    public final InsertRequest copy(boolean z7, Returning returning, Count count, boolean z8, boolean z9, a aVar, Map<String, String> map, String str, Headers headers) {
        l.f("returning", returning);
        l.f("body", aVar);
        l.f("urlParams", map);
        l.f("schema", str);
        l.f("headers", headers);
        return new InsertRequest(z7, returning, count, z8, z9, aVar, map, str, headers);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InsertRequest)) {
            return false;
        }
        InsertRequest insertRequest = (InsertRequest) other;
        return this.upsert == insertRequest.upsert && l.a(this.returning, insertRequest.returning) && this.count == insertRequest.count && this.ignoreDuplicates == insertRequest.ignoreDuplicates && this.defaultToNull == insertRequest.defaultToNull && l.a(this.body, insertRequest.body) && l.a(this.urlParams, insertRequest.urlParams) && l.a(this.schema, insertRequest.schema) && l.a(this.headers, insertRequest.headers);
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

    public int hashCode() {
        int iHashCode = (this.returning.hashCode() + (Boolean.hashCode(this.upsert) * 31)) * 31;
        Count count = this.count;
        return this.headers.hashCode() + b.b(this.schema, (this.urlParams.hashCode() + ((this.body.f12721k.hashCode() + AbstractC0703b.d(AbstractC0703b.d((iHashCode + (count == null ? 0 : count.hashCode())) * 31, 31, this.ignoreDuplicates), 31, this.defaultToNull)) * 31)) * 31, 31);
    }

    public String toString() {
        return "InsertRequest(upsert=" + this.upsert + ", returning=" + this.returning + ", count=" + this.count + ", ignoreDuplicates=" + this.ignoreDuplicates + ", defaultToNull=" + this.defaultToNull + ", body=" + this.body + ", urlParams=" + this.urlParams + ", schema=" + this.schema + ", headers=" + this.headers + ')';
    }

    @Override // io.github.jan.supabase.postgrest.request.PostgrestRequest
    public a getBody() {
        return this.body;
    }

    public /* synthetic */ InsertRequest(boolean z7, Returning returning, Count count, boolean z8, boolean z9, a aVar, Map map, String str, Headers headers, int i7, f fVar) {
        this((i7 & 1) != 0 ? false : z7, (i7 & 2) != 0 ? Returning.Minimal.INSTANCE : returning, (i7 & 4) != 0 ? null : count, (i7 & 8) != 0 ? false : z8, (i7 & 16) != 0 ? false : z9, aVar, map, str, (i7 & 256) != 0 ? Headers.INSTANCE.getEmpty() : headers);
    }
}
