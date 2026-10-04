package io.github.jan.supabase.postgrest;

import V3.a;
import io.ktor.http.HttpMethod;
import kotlin.Metadata;
import l4.AbstractC1420H;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lio/github/jan/supabase/postgrest/RpcMethod;", "", "httpMethod", "Lio/ktor/http/HttpMethod;", "<init>", "(Ljava/lang/String;ILio/ktor/http/HttpMethod;)V", "getHttpMethod", "()Lio/ktor/http/HttpMethod;", "HEAD", "POST", "GET", "postgrest-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RpcMethod {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ RpcMethod[] $VALUES;
    public static final RpcMethod GET;
    public static final RpcMethod HEAD;
    public static final RpcMethod POST;
    private final HttpMethod httpMethod;

    private static final /* synthetic */ RpcMethod[] $values() {
        return new RpcMethod[]{HEAD, POST, GET};
    }

    static {
        HttpMethod.Companion companion = HttpMethod.INSTANCE;
        HEAD = new RpcMethod("HEAD", 0, companion.getHead());
        POST = new RpcMethod("POST", 1, companion.getPost());
        GET = new RpcMethod("GET", 2, companion.getGet());
        RpcMethod[] rpcMethodArr$values = $values();
        $VALUES = rpcMethodArr$values;
        $ENTRIES = AbstractC1420H.z(rpcMethodArr$values);
    }

    private RpcMethod(String str, int i7, HttpMethod httpMethod) {
        this.httpMethod = httpMethod;
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static RpcMethod valueOf(String str) {
        return (RpcMethod) Enum.valueOf(RpcMethod.class, str);
    }

    public static RpcMethod[] values() {
        return (RpcMethod[]) $VALUES.clone();
    }

    public final HttpMethod getHttpMethod() {
        return this.httpMethod;
    }
}
