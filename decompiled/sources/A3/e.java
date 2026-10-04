package A3;

import H5.AbstractC0281w;
import O3.C;
import Z5.AbstractC0632e0;
import b6.L;
import com.kusukanime.data.CrashLog;
import com.kusukanime.data.SbClient;
import com.kusukanime.data.SearchSuggestion;
import com.kusukanime.data.SessionImport;
import com.kusukanime.data.VideoCache;
import io.github.jan.supabase.SupabaseClientBuilder;
import io.github.jan.supabase.UtilsKt;
import io.github.jan.supabase.auth.AuthConfig;
import io.github.jan.supabase.auth.mfa.MfaApi;
import io.github.jan.supabase.auth.providers.builtin.OTP;
import io.github.jan.supabase.collections.AtomicMutableList;
import io.github.jan.supabase.collections.AtomicMutableMap;
import io.github.jan.supabase.network.KtorSupabaseHttpClient;
import io.github.jan.supabase.postgrest.Postgrest;
import io.github.jan.supabase.postgrest.query.request.RpcRequestBuilder;
import io.github.jan.supabase.storage.AndroidUtilsKt;
import io.github.jan.supabase.storage.UploadOptionBuilder;
import io.ktor.client.plugins.contentnegotiation.ContentNegotiationConfig;
import io.ktor.http.auth.HttpAuthHeaderKt;
import io.ktor.util.GzipHeaderFlags;
import j0.InterfaceC1298d;
import java.io.File;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import l4.InterfaceC1425d;
import z5.InterfaceC2505j;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements e4.k {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f141k;

    public /* synthetic */ e(int i7) {
        this.f141k = i7;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f141k) {
            case 0:
                SearchSuggestion searchSuggestion = (SearchSuggestion) obj;
                kotlin.jvm.internal.l.f("it", searchSuggestion);
                return searchSuggestion.getSlug();
            case 1:
                String str = (String) obj;
                kotlin.jvm.internal.l.f("it", str);
                return "h-".concat(str);
            case 2:
                return Boolean.valueOf(((Character) obj).charValue() == '-');
            case 3:
                return Boolean.valueOf(((Character) obj).charValue() == '-');
            case GzipHeaderFlags.EXTRA /* 4 */:
                char cCharValue = ((Character) obj).charValue();
                return Boolean.valueOf(cCharValue == 'T' || cCharValue == 't');
            case 5:
                return Boolean.valueOf(((Character) obj).charValue() == ':');
            case 6:
                return Boolean.valueOf(((Character) obj).charValue() == ':');
            case 7:
                char cCharValue2 = ((Character) obj).charValue();
                return Boolean.valueOf('0' <= cCharValue2 && cCharValue2 < ':');
            case 8:
                return CrashLog.INSTANCE.read((File) obj);
            case 9:
                kotlin.jvm.internal.l.f("$this$LinearProgressIndicator", (InterfaceC1298d) obj);
                return C.a;
            case 10:
                S3.f fVar = (S3.f) obj;
                if (fVar instanceof AbstractC0281w) {
                    return (AbstractC0281w) fVar;
                }
                return null;
            case 11:
                return AtomicMutableList.clear$lambda$0((D5.b) obj);
            case 12:
                return AtomicMutableMap.clear$lambda$0((D5.c) obj);
            case 13:
                return HttpAuthHeaderKt.unescaped$lambda$2((InterfaceC2505j) obj);
            case 14:
                InterfaceC1425d interfaceC1425d = (InterfaceC1425d) obj;
                kotlin.jvm.internal.l.f("it", interfaceC1425d);
                KSerializer kSerializerP = q0.c.P(interfaceC1425d);
                if (kSerializerP != null) {
                    return kSerializerP;
                }
                if (AbstractC0632e0.g(interfaceC1425d)) {
                    return new V5.d(interfaceC1425d);
                }
                return null;
            case 15:
                InterfaceC1425d interfaceC1425d2 = (InterfaceC1425d) obj;
                kotlin.jvm.internal.l.f("it", interfaceC1425d2);
                KSerializer kSerializerP2 = q0.c.P(interfaceC1425d2);
                if (kSerializerP2 == null) {
                    kSerializerP2 = AbstractC0632e0.g(interfaceC1425d2) ? new V5.d(interfaceC1425d2) : null;
                }
                if (kSerializerP2 != null) {
                    return n6.m.K(kSerializerP2);
                }
                return null;
            case 16:
                X5.a aVar = (X5.a) obj;
                kotlin.jvm.internal.l.f("$this$buildSerialDescriptor", aVar);
                aVar.a("JsonPrimitive", new a6.n(new J3.a(5)), (12 & 8) == 0);
                aVar.a("JsonNull", new a6.n(new J3.a(6)), (12 & 8) == 0);
                aVar.a("JsonLiteral", new a6.n(new J3.a(7)), (12 & 8) == 0);
                aVar.a("JsonObject", new a6.n(new J3.a(8)), (12 & 8) == 0);
                aVar.a("JsonArray", new a6.n(new J3.a(9)), (12 & 8) == 0);
                return C.a;
            case 17:
                Map.Entry entry = (Map.Entry) obj;
                kotlin.jvm.internal.l.f("<destruct>", entry);
                String str2 = (String) entry.getKey();
                kotlinx.serialization.json.b bVar = (kotlinx.serialization.json.b) entry.getValue();
                StringBuilder sb = new StringBuilder();
                L.a(str2, sb);
                sb.append(':');
                sb.append(bVar);
                return sb.toString();
            case 18:
                return SbClient.getOrNull$lambda$0$0$0((AuthConfig) obj);
            case 19:
                return SessionImport.json$lambda$0((a6.h) obj);
            case 20:
                return Boolean.valueOf(VideoCache.watchCacheBytes$lambda$0((File) obj));
            case 21:
                return SupabaseClientBuilder.defaultSerializer$lambda$0((a6.h) obj);
            case 22:
                return SupabaseClientBuilder.install$lambda$0(obj);
            case 23:
                return UtilsKt.supabaseJson$lambda$0((a6.h) obj);
            case 24:
                return MfaApi.enroll$lambda$0(obj);
            case 25:
                return OTP.login$lambda$0((OTP.Config) obj);
            case 26:
                return KtorSupabaseHttpClient.applyDefaultConfiguration$lambda$1((ContentNegotiationConfig) obj);
            case 27:
                return Postgrest.rpc$lambda$0((RpcRequestBuilder) obj);
            case 28:
                return Postgrest.rpc$lambda$1((RpcRequestBuilder) obj);
            default:
                return AndroidUtilsKt.uploadToSignedUrl$lambda$0((UploadOptionBuilder) obj);
        }
    }
}
