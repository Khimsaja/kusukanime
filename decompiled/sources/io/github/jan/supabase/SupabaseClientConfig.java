package io.github.jan.supabase;

import A6.b;
import H5.AbstractC0281w;
import e4.k;
import io.github.jan.supabase.logging.LogLevel;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012&\u0010\r\u001a\"\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000ej\u0004\u0018\u0001`\u0010\u0012&\u0010\u0011\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0013\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00140\u000ej\u0002`\u00150\u0012\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0006HÆ\u0003J\t\u0010/\u001a\u00020\bHÆ\u0003J\t\u00100\u001a\u00020\nHÆ\u0003J\t\u00101\u001a\u00020\fHÆ\u0003J.\u00102\u001a\"\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000ej\u0004\u0018\u0001`\u0010HÆ\u0003¢\u0006\u0002\u0010&J)\u00103\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0013\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00140\u000ej\u0002`\u00150\u0012HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0017HÆ\u0003Jª\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2(\b\u0002\u0010\r\u001a\"\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000ej\u0004\u0018\u0001`\u00102(\b\u0002\u0010\u0011\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0013\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00140\u000ej\u0002`\u00150\u00122\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÆ\u0001¢\u0006\u0002\u00106J\u0013\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010:\u001a\u00020;HÖ\u0001J\t\u0010<\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R3\u0010\r\u001a\"\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000ej\u0004\u0018\u0001`\u0010¢\u0006\n\n\u0002\u0010'\u001a\u0004\b%\u0010&R1\u0010\u0011\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0013\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00140\u000ej\u0002`\u00150\u0012¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+¨\u0006="}, d2 = {"Lio/github/jan/supabase/SupabaseClientConfig;", "", "supabaseUrl", "", "supabaseKey", "defaultLogLevel", "Lio/github/jan/supabase/logging/LogLevel;", "networkConfig", "Lio/github/jan/supabase/SupabaseNetworkConfig;", "defaultSerializer", "Lio/github/jan/supabase/SupabaseSerializer;", "coroutineDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "accessToken", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "Lio/github/jan/supabase/AccessTokenProvider;", "plugins", "", "Lio/github/jan/supabase/SupabaseClient;", "Lio/github/jan/supabase/plugins/SupabasePlugin;", "Lio/github/jan/supabase/PluginProvider;", "osInformation", "Lio/github/jan/supabase/OSInformation;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lio/github/jan/supabase/logging/LogLevel;Lio/github/jan/supabase/SupabaseNetworkConfig;Lio/github/jan/supabase/SupabaseSerializer;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/jvm/functions/Function1;Ljava/util/Map;Lio/github/jan/supabase/OSInformation;)V", "getSupabaseUrl", "()Ljava/lang/String;", "getSupabaseKey", "getDefaultLogLevel", "()Lio/github/jan/supabase/logging/LogLevel;", "getNetworkConfig", "()Lio/github/jan/supabase/SupabaseNetworkConfig;", "getDefaultSerializer", "()Lio/github/jan/supabase/SupabaseSerializer;", "getCoroutineDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "getAccessToken", "()Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function1;", "getPlugins", "()Ljava/util/Map;", "getOsInformation", "()Lio/github/jan/supabase/OSInformation;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Lio/github/jan/supabase/logging/LogLevel;Lio/github/jan/supabase/SupabaseNetworkConfig;Lio/github/jan/supabase/SupabaseSerializer;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/jvm/functions/Function1;Ljava/util/Map;Lio/github/jan/supabase/OSInformation;)Lio/github/jan/supabase/SupabaseClientConfig;", "equals", "", "other", "hashCode", "", "toString", "supabase-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SupabaseClientConfig {
    private final k accessToken;
    private final AbstractC0281w coroutineDispatcher;
    private final LogLevel defaultLogLevel;
    private final SupabaseSerializer defaultSerializer;
    private final SupabaseNetworkConfig networkConfig;
    private final OSInformation osInformation;
    private final Map<String, k> plugins;
    private final String supabaseKey;
    private final String supabaseUrl;

    /* JADX WARN: Multi-variable type inference failed */
    public SupabaseClientConfig(String str, String str2, LogLevel logLevel, SupabaseNetworkConfig supabaseNetworkConfig, SupabaseSerializer supabaseSerializer, AbstractC0281w abstractC0281w, k kVar, Map<String, ? extends k> map, OSInformation oSInformation) {
        l.f("supabaseUrl", str);
        l.f("supabaseKey", str2);
        l.f("defaultLogLevel", logLevel);
        l.f("networkConfig", supabaseNetworkConfig);
        l.f("defaultSerializer", supabaseSerializer);
        l.f("coroutineDispatcher", abstractC0281w);
        l.f("plugins", map);
        this.supabaseUrl = str;
        this.supabaseKey = str2;
        this.defaultLogLevel = logLevel;
        this.networkConfig = supabaseNetworkConfig;
        this.defaultSerializer = supabaseSerializer;
        this.coroutineDispatcher = abstractC0281w;
        this.accessToken = kVar;
        this.plugins = map;
        this.osInformation = oSInformation;
    }

    public static /* synthetic */ SupabaseClientConfig copy$default(SupabaseClientConfig supabaseClientConfig, String str, String str2, LogLevel logLevel, SupabaseNetworkConfig supabaseNetworkConfig, SupabaseSerializer supabaseSerializer, AbstractC0281w abstractC0281w, k kVar, Map map, OSInformation oSInformation, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = supabaseClientConfig.supabaseUrl;
        }
        if ((i7 & 2) != 0) {
            str2 = supabaseClientConfig.supabaseKey;
        }
        if ((i7 & 4) != 0) {
            logLevel = supabaseClientConfig.defaultLogLevel;
        }
        if ((i7 & 8) != 0) {
            supabaseNetworkConfig = supabaseClientConfig.networkConfig;
        }
        if ((i7 & 16) != 0) {
            supabaseSerializer = supabaseClientConfig.defaultSerializer;
        }
        if ((i7 & 32) != 0) {
            abstractC0281w = supabaseClientConfig.coroutineDispatcher;
        }
        if ((i7 & 64) != 0) {
            kVar = supabaseClientConfig.accessToken;
        }
        if ((i7 & 128) != 0) {
            map = supabaseClientConfig.plugins;
        }
        if ((i7 & 256) != 0) {
            oSInformation = supabaseClientConfig.osInformation;
        }
        Map map2 = map;
        OSInformation oSInformation2 = oSInformation;
        AbstractC0281w abstractC0281w2 = abstractC0281w;
        k kVar2 = kVar;
        SupabaseSerializer supabaseSerializer2 = supabaseSerializer;
        LogLevel logLevel2 = logLevel;
        return supabaseClientConfig.copy(str, str2, logLevel2, supabaseNetworkConfig, supabaseSerializer2, abstractC0281w2, kVar2, map2, oSInformation2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSupabaseUrl() {
        return this.supabaseUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSupabaseKey() {
        return this.supabaseKey;
    }

    /* renamed from: component3, reason: from getter */
    public final LogLevel getDefaultLogLevel() {
        return this.defaultLogLevel;
    }

    /* renamed from: component4, reason: from getter */
    public final SupabaseNetworkConfig getNetworkConfig() {
        return this.networkConfig;
    }

    /* renamed from: component5, reason: from getter */
    public final SupabaseSerializer getDefaultSerializer() {
        return this.defaultSerializer;
    }

    /* renamed from: component6, reason: from getter */
    public final AbstractC0281w getCoroutineDispatcher() {
        return this.coroutineDispatcher;
    }

    /* renamed from: component7, reason: from getter */
    public final k getAccessToken() {
        return this.accessToken;
    }

    public final Map<String, k> component8() {
        return this.plugins;
    }

    /* renamed from: component9, reason: from getter */
    public final OSInformation getOsInformation() {
        return this.osInformation;
    }

    public final SupabaseClientConfig copy(String str, String str2, LogLevel logLevel, SupabaseNetworkConfig supabaseNetworkConfig, SupabaseSerializer supabaseSerializer, AbstractC0281w abstractC0281w, k kVar, Map<String, ? extends k> map, OSInformation oSInformation) {
        l.f("supabaseUrl", str);
        l.f("supabaseKey", str2);
        l.f("defaultLogLevel", logLevel);
        l.f("networkConfig", supabaseNetworkConfig);
        l.f("defaultSerializer", supabaseSerializer);
        l.f("coroutineDispatcher", abstractC0281w);
        l.f("plugins", map);
        return new SupabaseClientConfig(str, str2, logLevel, supabaseNetworkConfig, supabaseSerializer, abstractC0281w, kVar, map, oSInformation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SupabaseClientConfig)) {
            return false;
        }
        SupabaseClientConfig supabaseClientConfig = (SupabaseClientConfig) other;
        return l.a(this.supabaseUrl, supabaseClientConfig.supabaseUrl) && l.a(this.supabaseKey, supabaseClientConfig.supabaseKey) && this.defaultLogLevel == supabaseClientConfig.defaultLogLevel && l.a(this.networkConfig, supabaseClientConfig.networkConfig) && l.a(this.defaultSerializer, supabaseClientConfig.defaultSerializer) && l.a(this.coroutineDispatcher, supabaseClientConfig.coroutineDispatcher) && l.a(this.accessToken, supabaseClientConfig.accessToken) && l.a(this.plugins, supabaseClientConfig.plugins) && l.a(this.osInformation, supabaseClientConfig.osInformation);
    }

    public final k getAccessToken() {
        return this.accessToken;
    }

    public final AbstractC0281w getCoroutineDispatcher() {
        return this.coroutineDispatcher;
    }

    public final LogLevel getDefaultLogLevel() {
        return this.defaultLogLevel;
    }

    public final SupabaseSerializer getDefaultSerializer() {
        return this.defaultSerializer;
    }

    public final SupabaseNetworkConfig getNetworkConfig() {
        return this.networkConfig;
    }

    public final OSInformation getOsInformation() {
        return this.osInformation;
    }

    public final Map<String, k> getPlugins() {
        return this.plugins;
    }

    public final String getSupabaseKey() {
        return this.supabaseKey;
    }

    public final String getSupabaseUrl() {
        return this.supabaseUrl;
    }

    public int hashCode() {
        int iHashCode = (this.coroutineDispatcher.hashCode() + ((this.defaultSerializer.hashCode() + ((this.networkConfig.hashCode() + ((this.defaultLogLevel.hashCode() + b.b(this.supabaseKey, this.supabaseUrl.hashCode() * 31, 31)) * 31)) * 31)) * 31)) * 31;
        k kVar = this.accessToken;
        int iHashCode2 = (this.plugins.hashCode() + ((iHashCode + (kVar == null ? 0 : kVar.hashCode())) * 31)) * 31;
        OSInformation oSInformation = this.osInformation;
        return iHashCode2 + (oSInformation != null ? oSInformation.hashCode() : 0);
    }

    public String toString() {
        return "SupabaseClientConfig(supabaseUrl=" + this.supabaseUrl + ", supabaseKey=" + this.supabaseKey + ", defaultLogLevel=" + this.defaultLogLevel + ", networkConfig=" + this.networkConfig + ", defaultSerializer=" + this.defaultSerializer + ", coroutineDispatcher=" + this.coroutineDispatcher + ", accessToken=" + this.accessToken + ", plugins=" + this.plugins + ", osInformation=" + this.osInformation + ')';
    }
}
