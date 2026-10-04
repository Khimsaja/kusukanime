package io.github.jan.supabase.postgrest;

import A3.e;
import O3.C;
import S3.c;
import e4.k;
import io.github.jan.supabase.SupabaseClient;
import io.github.jan.supabase.SupabaseClientBuilder;
import io.github.jan.supabase.SupabaseSerializer;
import io.github.jan.supabase.logging.SupabaseLogger;
import io.github.jan.supabase.plugins.CustomSerializationConfig;
import io.github.jan.supabase.plugins.CustomSerializationPlugin;
import io.github.jan.supabase.plugins.MainConfig;
import io.github.jan.supabase.plugins.MainPlugin;
import io.github.jan.supabase.plugins.SupabasePluginProvider;
import io.github.jan.supabase.postgrest.query.PostgrestQueryBuilder;
import io.github.jan.supabase.postgrest.query.request.RpcRequestBuilder;
import io.github.jan.supabase.postgrest.result.PostgrestResult;
import io.ktor.client.utils.CacheControl;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002\u0016\u0017J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0019\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0002J\u0011\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0002J1\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00072\u0019\b\u0002\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0002\b\u0011H¦@¢\u0006\u0002\u0010\u0012J9\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00142\u0019\b\u0002\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0002\b\u0011H¦@¢\u0006\u0002\u0010\u0015¨\u0006\u0018À\u0006\u0003"}, d2 = {"Lio/github/jan/supabase/postgrest/Postgrest;", "Lio/github/jan/supabase/plugins/MainPlugin;", "Lio/github/jan/supabase/postgrest/Postgrest$Config;", "Lio/github/jan/supabase/plugins/CustomSerializationPlugin;", "from", "Lio/github/jan/supabase/postgrest/query/PostgrestQueryBuilder;", "table", "", "schema", "get", "rpc", "Lio/github/jan/supabase/postgrest/result/PostgrestResult;", "function", "request", "Lkotlin/Function1;", "Lio/github/jan/supabase/postgrest/query/request/RpcRequestBuilder;", "", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "parameters", "Lkotlinx/serialization/json/JsonObject;", "(Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Config", "Companion", "postgrest-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public interface Postgrest extends MainPlugin<Config>, CustomSerializationPlugin {
    public static final int API_VERSION = 1;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u0010\u001a\u00020\u00022\u0017\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0002\b\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0002H\u0016R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lio/github/jan/supabase/postgrest/Postgrest$Companion;", "Lio/github/jan/supabase/plugins/SupabasePluginProvider;", "Lio/github/jan/supabase/postgrest/Postgrest$Config;", "Lio/github/jan/supabase/postgrest/Postgrest;", "<init>", "()V", "key", "", "getKey", "()Ljava/lang/String;", "logger", "Lio/github/jan/supabase/logging/SupabaseLogger;", "getLogger", "()Lio/github/jan/supabase/logging/SupabaseLogger;", "API_VERSION", "", "createConfig", "init", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "create", "supabaseClient", "Lio/github/jan/supabase/SupabaseClient;", "config", "postgrest-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion implements SupabasePluginProvider<Config, Postgrest> {
        public static final int API_VERSION = 1;
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final String key = "rest";
        private static final SupabaseLogger logger = SupabaseClient.Companion.createLogger$default(SupabaseClient.INSTANCE, "Supabase-PostgREST", null, 2, null);

        private Companion() {
        }

        @Override // io.github.jan.supabase.plugins.SupabasePluginProvider
        public String getKey() {
            return key;
        }

        @Override // io.github.jan.supabase.plugins.SupabasePluginProvider
        public SupabaseLogger getLogger() {
            return logger;
        }

        @Override // io.github.jan.supabase.plugins.SupabasePluginProvider
        public /* bridge */ void setup(SupabaseClientBuilder supabaseClientBuilder, Config config) {
            super.setup(supabaseClientBuilder, (SupabaseClientBuilder) config);
        }

        @Override // io.github.jan.supabase.plugins.SupabasePluginProvider
        public Postgrest create(SupabaseClient supabaseClient, Config config) {
            l.f("supabaseClient", supabaseClient);
            l.f("config", config);
            return new PostgrestImpl(supabaseClient, config);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.github.jan.supabase.plugins.SupabasePluginProvider
        public Config createConfig(k kVar) {
            l.f("init", kVar);
            Config config = new Config(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            kVar.invoke(config);
            return config;
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0017\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0004HÖ\u0001R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006!"}, d2 = {"Lio/github/jan/supabase/postgrest/Postgrest$Config;", "Lio/github/jan/supabase/plugins/MainConfig;", "Lio/github/jan/supabase/plugins/CustomSerializationConfig;", "defaultSchema", "", "propertyConversionMethod", "Lio/github/jan/supabase/postgrest/PropertyConversionMethod;", "<init>", "(Ljava/lang/String;Lio/github/jan/supabase/postgrest/PropertyConversionMethod;)V", "getDefaultSchema", "()Ljava/lang/String;", "setDefaultSchema", "(Ljava/lang/String;)V", "getPropertyConversionMethod", "()Lio/github/jan/supabase/postgrest/PropertyConversionMethod;", "setPropertyConversionMethod", "(Lio/github/jan/supabase/postgrest/PropertyConversionMethod;)V", "serializer", "Lio/github/jan/supabase/SupabaseSerializer;", "getSerializer", "()Lio/github/jan/supabase/SupabaseSerializer;", "setSerializer", "(Lio/github/jan/supabase/SupabaseSerializer;)V", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "postgrest-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Config extends MainConfig implements CustomSerializationConfig {
        private String defaultSchema;
        private PropertyConversionMethod propertyConversionMethod;
        private SupabaseSerializer serializer;

        /* JADX WARN: Multi-variable type inference failed */
        public Config() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Config copy$default(Config config, String str, PropertyConversionMethod propertyConversionMethod, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = config.defaultSchema;
            }
            if ((i7 & 2) != 0) {
                propertyConversionMethod = config.propertyConversionMethod;
            }
            return config.copy(str, propertyConversionMethod);
        }

        /* renamed from: component1, reason: from getter */
        public final String getDefaultSchema() {
            return this.defaultSchema;
        }

        /* renamed from: component2, reason: from getter */
        public final PropertyConversionMethod getPropertyConversionMethod() {
            return this.propertyConversionMethod;
        }

        public final Config copy(String defaultSchema, PropertyConversionMethod propertyConversionMethod) {
            l.f("defaultSchema", defaultSchema);
            l.f("propertyConversionMethod", propertyConversionMethod);
            return new Config(defaultSchema, propertyConversionMethod);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Config)) {
                return false;
            }
            Config config = (Config) other;
            return l.a(this.defaultSchema, config.defaultSchema) && l.a(this.propertyConversionMethod, config.propertyConversionMethod);
        }

        public final String getDefaultSchema() {
            return this.defaultSchema;
        }

        public final PropertyConversionMethod getPropertyConversionMethod() {
            return this.propertyConversionMethod;
        }

        @Override // io.github.jan.supabase.plugins.CustomSerializationConfig
        public SupabaseSerializer getSerializer() {
            return this.serializer;
        }

        public int hashCode() {
            return this.propertyConversionMethod.hashCode() + (this.defaultSchema.hashCode() * 31);
        }

        public final void setDefaultSchema(String str) {
            l.f("<set-?>", str);
            this.defaultSchema = str;
        }

        public final void setPropertyConversionMethod(PropertyConversionMethod propertyConversionMethod) {
            l.f("<set-?>", propertyConversionMethod);
            this.propertyConversionMethod = propertyConversionMethod;
        }

        @Override // io.github.jan.supabase.plugins.CustomSerializationConfig
        public void setSerializer(SupabaseSerializer supabaseSerializer) {
            this.serializer = supabaseSerializer;
        }

        public String toString() {
            return "Config(defaultSchema=" + this.defaultSchema + ", propertyConversionMethod=" + this.propertyConversionMethod + ')';
        }

        public Config(String str, PropertyConversionMethod propertyConversionMethod) {
            l.f("defaultSchema", str);
            l.f("propertyConversionMethod", propertyConversionMethod);
            this.defaultSchema = str;
            this.propertyConversionMethod = propertyConversionMethod;
        }

        public /* synthetic */ Config(String str, PropertyConversionMethod propertyConversionMethod, int i7, f fVar) {
            this((i7 & 1) != 0 ? CacheControl.PUBLIC : str, (i7 & 2) != 0 ? PropertyConversionMethod.INSTANCE.getCAMEL_CASE_TO_SNAKE_CASE() : propertyConversionMethod);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static Object close(Postgrest postgrest, c<? super C> cVar) {
            return Postgrest.super.close(cVar);
        }

        @Deprecated
        public static PostgrestQueryBuilder get(Postgrest postgrest, String str, String str2) {
            l.f("schema", str);
            l.f("table", str2);
            return Postgrest.super.get(str, str2);
        }

        @Deprecated
        public static void init(Postgrest postgrest) {
            Postgrest.super.init();
        }

        @Deprecated
        public static String resolveUrl(Postgrest postgrest, String str) {
            l.f("path", str);
            return Postgrest.super.resolveUrl(str);
        }

        @Deprecated
        public static PostgrestQueryBuilder get(Postgrest postgrest, String str) {
            l.f("table", str);
            return Postgrest.super.get(str);
        }
    }

    static /* synthetic */ Object rpc$default(Postgrest postgrest, String str, k kVar, c cVar, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rpc");
        }
        if ((i7 & 2) != 0) {
            kVar = new e(27);
        }
        return postgrest.rpc(str, kVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static C rpc$lambda$0(RpcRequestBuilder rpcRequestBuilder) {
        l.f("<this>", rpcRequestBuilder);
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static C rpc$lambda$1(RpcRequestBuilder rpcRequestBuilder) {
        l.f("<this>", rpcRequestBuilder);
        return C.a;
    }

    PostgrestQueryBuilder from(String table);

    PostgrestQueryBuilder from(String schema, String table);

    default PostgrestQueryBuilder get(String schema, String table) {
        l.f("schema", schema);
        l.f("table", table);
        return from(schema, table);
    }

    Object rpc(String str, k kVar, c<? super PostgrestResult> cVar);

    Object rpc(String str, kotlinx.serialization.json.c cVar, k kVar, c<? super PostgrestResult> cVar2);

    default PostgrestQueryBuilder get(String table) {
        l.f("table", table);
        return from(table);
    }

    static /* synthetic */ Object rpc$default(Postgrest postgrest, String str, kotlinx.serialization.json.c cVar, k kVar, c cVar2, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rpc");
        }
        if ((i7 & 4) != 0) {
            kVar = new e(28);
        }
        return postgrest.rpc(str, cVar, kVar, cVar2);
    }
}
