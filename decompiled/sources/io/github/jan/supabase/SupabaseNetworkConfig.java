package io.github.jan.supabase;

import A5.a;
import e4.k;
import io.ktor.client.engine.HttpClientEngine;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001BH\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012%\u0010\u0006\u001a!\u0012\u001d\u0012\u001b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\n0\bj\u0002`\f¢\u0006\u0002\b\u000b0\u0007\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J(\u0010\u001c\u001a!\u0012\u001d\u0012\u001b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\n0\bj\u0002`\f¢\u0006\u0002\b\u000b0\u0007HÆ\u0003J\u0010\u0010\u001d\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0018JY\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052'\b\u0002\u0010\u0006\u001a!\u0012\u001d\u0012\u001b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\n0\bj\u0002`\f¢\u0006\u0002\b\u000b0\u00072\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b \u0010!J\u0013\u0010\"\u001a\u00020\u00032\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R0\u0010\u0006\u001a!\u0012\u001d\u0012\u001b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\n0\bj\u0002`\f¢\u0006\u0002\b\u000b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\r\u001a\u00020\u000e¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018¨\u0006("}, d2 = {"Lio/github/jan/supabase/SupabaseNetworkConfig;", "", "useHTTPS", "", "httpEngine", "Lio/ktor/client/engine/HttpClientEngine;", "httpConfigOverrides", "", "Lkotlin/Function1;", "Lio/ktor/client/HttpClientConfig;", "", "Lkotlin/ExtensionFunctionType;", "Lio/github/jan/supabase/HttpConfigOverride;", "requestTimeout", "Lkotlin/time/Duration;", "<init>", "(ZLio/ktor/client/engine/HttpClientEngine;Ljava/util/List;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getUseHTTPS", "()Z", "getHttpEngine", "()Lio/ktor/client/engine/HttpClientEngine;", "getHttpConfigOverrides", "()Ljava/util/List;", "getRequestTimeout-UwyO8pc", "()J", "J", "component1", "component2", "component3", "component4", "component4-UwyO8pc", "copy", "copy-Wn2Vu4Y", "(ZLio/ktor/client/engine/HttpClientEngine;Ljava/util/List;J)Lio/github/jan/supabase/SupabaseNetworkConfig;", "equals", "other", "hashCode", "", "toString", "", "supabase-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SupabaseNetworkConfig {
    private final List<k> httpConfigOverrides;
    private final HttpClientEngine httpEngine;
    private final long requestTimeout;
    private final boolean useHTTPS;

    public /* synthetic */ SupabaseNetworkConfig(boolean z7, HttpClientEngine httpClientEngine, List list, long j7, f fVar) {
        this(z7, httpClientEngine, list, j7);
    }

    /* renamed from: copy-Wn2Vu4Y$default, reason: not valid java name */
    public static /* synthetic */ SupabaseNetworkConfig m7copyWn2Vu4Y$default(SupabaseNetworkConfig supabaseNetworkConfig, boolean z7, HttpClientEngine httpClientEngine, List list, long j7, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z7 = supabaseNetworkConfig.useHTTPS;
        }
        if ((i7 & 2) != 0) {
            httpClientEngine = supabaseNetworkConfig.httpEngine;
        }
        if ((i7 & 4) != 0) {
            list = supabaseNetworkConfig.httpConfigOverrides;
        }
        if ((i7 & 8) != 0) {
            j7 = supabaseNetworkConfig.requestTimeout;
        }
        List list2 = list;
        return supabaseNetworkConfig.m9copyWn2Vu4Y(z7, httpClientEngine, list2, j7);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getUseHTTPS() {
        return this.useHTTPS;
    }

    /* renamed from: component2, reason: from getter */
    public final HttpClientEngine getHttpEngine() {
        return this.httpEngine;
    }

    public final List<k> component3() {
        return this.httpConfigOverrides;
    }

    /* renamed from: component4-UwyO8pc, reason: not valid java name and from getter */
    public final long getRequestTimeout() {
        return this.requestTimeout;
    }

    /* renamed from: copy-Wn2Vu4Y, reason: not valid java name */
    public final SupabaseNetworkConfig m9copyWn2Vu4Y(boolean useHTTPS, HttpClientEngine httpEngine, List<? extends k> httpConfigOverrides, long requestTimeout) {
        l.f("httpConfigOverrides", httpConfigOverrides);
        return new SupabaseNetworkConfig(useHTTPS, httpEngine, httpConfigOverrides, requestTimeout, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof SupabaseNetworkConfig) {
            SupabaseNetworkConfig supabaseNetworkConfig = (SupabaseNetworkConfig) other;
            if (this.useHTTPS == supabaseNetworkConfig.useHTTPS && l.a(this.httpEngine, supabaseNetworkConfig.httpEngine) && l.a(this.httpConfigOverrides, supabaseNetworkConfig.httpConfigOverrides)) {
                long j7 = this.requestTimeout;
                long j8 = supabaseNetworkConfig.requestTimeout;
                int i7 = a.f239n;
                return j7 == j8;
            }
        }
        return false;
    }

    public final List<k> getHttpConfigOverrides() {
        return this.httpConfigOverrides;
    }

    public final HttpClientEngine getHttpEngine() {
        return this.httpEngine;
    }

    /* renamed from: getRequestTimeout-UwyO8pc, reason: not valid java name */
    public final long m10getRequestTimeoutUwyO8pc() {
        return this.requestTimeout;
    }

    public final boolean getUseHTTPS() {
        return this.useHTTPS;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.useHTTPS) * 31;
        HttpClientEngine httpClientEngine = this.httpEngine;
        int iHashCode2 = (this.httpConfigOverrides.hashCode() + ((iHashCode + (httpClientEngine == null ? 0 : httpClientEngine.hashCode())) * 31)) * 31;
        long j7 = this.requestTimeout;
        int i7 = a.f239n;
        return Long.hashCode(j7) + iHashCode2;
    }

    public String toString() {
        return "SupabaseNetworkConfig(useHTTPS=" + this.useHTTPS + ", httpEngine=" + this.httpEngine + ", httpConfigOverrides=" + this.httpConfigOverrides + ", requestTimeout=" + ((Object) a.i(this.requestTimeout)) + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    private SupabaseNetworkConfig(boolean z7, HttpClientEngine httpClientEngine, List<? extends k> list, long j7) {
        l.f("httpConfigOverrides", list);
        this.useHTTPS = z7;
        this.httpEngine = httpClientEngine;
        this.httpConfigOverrides = list;
        this.requestTimeout = j7;
    }
}
