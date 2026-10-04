package io.github.jan.supabase.postgrest.query.request;

import io.github.jan.supabase.postgrest.PropertyConversionMethod;
import io.github.jan.supabase.postgrest.RpcMethod;
import io.github.jan.supabase.postgrest.query.PostgrestRequestBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lio/github/jan/supabase/postgrest/query/request/RpcRequestBuilder;", "Lio/github/jan/supabase/postgrest/query/PostgrestRequestBuilder;", "defaultSchema", "", "propertyConversionMethod", "Lio/github/jan/supabase/postgrest/PropertyConversionMethod;", "<init>", "(Ljava/lang/String;Lio/github/jan/supabase/postgrest/PropertyConversionMethod;)V", "method", "Lio/github/jan/supabase/postgrest/RpcMethod;", "getMethod", "()Lio/github/jan/supabase/postgrest/RpcMethod;", "setMethod", "(Lio/github/jan/supabase/postgrest/RpcMethod;)V", "schema", "getSchema", "()Ljava/lang/String;", "setSchema", "(Ljava/lang/String;)V", "postgrest-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RpcRequestBuilder extends PostgrestRequestBuilder {
    private RpcMethod method;
    private String schema;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RpcRequestBuilder(String str, PropertyConversionMethod propertyConversionMethod) {
        super(propertyConversionMethod);
        l.f("defaultSchema", str);
        l.f("propertyConversionMethod", propertyConversionMethod);
        this.method = RpcMethod.POST;
        this.schema = str;
    }

    public final RpcMethod getMethod() {
        return this.method;
    }

    public final String getSchema() {
        return this.schema;
    }

    public final void setMethod(RpcMethod rpcMethod) {
        l.f("<set-?>", rpcMethod);
        this.method = rpcMethod;
    }

    public final void setSchema(String str) {
        l.f("<set-?>", str);
        this.schema = str;
    }
}
