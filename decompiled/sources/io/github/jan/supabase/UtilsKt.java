package io.github.jan.supabase;

import A3.e;
import O3.C;
import V5.j;
import a6.d;
import a6.h;
import a6.v;
import e4.k;
import e6.C0837a;
import io.github.jan.supabase.SupabaseClient;
import io.github.jan.supabase.annotations.SupabaseInternal;
import io.github.jan.supabase.logging.LogLevel;
import io.github.jan.supabase.logging.SupabaseLogger;
import io.ktor.client.statement.HttpResponse;
import io.ktor.http.URLBuilder;
import io.ktor.http.URLUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import kotlinx.serialization.json.b;
import q0.c;

@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a&\u0010\u0006\u001a\u0002H\u0007\"\u0006\b\u0000\u0010\u0007\u0018\u0001*\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nH\u0087H¢\u0006\u0002\u0010\u000b\u001a-\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f¢\u0006\u0002\b\u0012H\u0087\bø\u0001\u0000\u001a\f\u0010\u0013\u001a\u00020\u0014*\u00020\nH\u0007\u001a\u0014\u0010\u0015\u001a\u00020\u0011*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0014H\u0007\u001a\"\u0010\u0018\u001a\u0002H\u0007\"\u0006\b\u0000\u0010\u0007\u0018\u0001*\u00020\u00142\u0006\u0010\u0019\u001a\u0002H\u0007H\u0087\b¢\u0006\u0002\u0010\u001a\u001a\u001c\u0010\u001b\u001a\u0004\u0018\u0001H\u0007\"\u0006\b\u0000\u0010\u0007\u0018\u0001*\u00020\bH\u0087H¢\u0006\u0002\u0010\u001c\"\u001c\u0010\u0000\u001a\u00020\u00018\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001d"}, d2 = {"supabaseJson", "Lkotlinx/serialization/json/Json;", "getSupabaseJson$annotations", "()V", "getSupabaseJson", "()Lkotlinx/serialization/json/Json;", "safeBody", "T", "Lio/ktor/client/statement/HttpResponse;", "context", "", "(Lio/ktor/client/statement/HttpResponse;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "buildUrl", "baseUrl", "init", "Lkotlin/Function1;", "Lio/ktor/http/URLBuilder;", "", "Lkotlin/ExtensionFunctionType;", "toJsonObject", "Lkotlinx/serialization/json/JsonObject;", "putJsonObject", "Lkotlinx/serialization/json/JsonObjectBuilder;", "jsonObject", "decodeIfNotEmptyOrDefault", "default", "(Lkotlinx/serialization/json/JsonObject;Ljava/lang/Object;)Ljava/lang/Object;", "bodyOrNull", "(Lio/ktor/client/statement/HttpResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "supabase-kt_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UtilsKt {
    private static final d supabaseJson = c.c(new e(23));

    @SupabaseInternal
    public static final <T> Object bodyOrNull(HttpResponse httpResponse, S3.c<? super T> cVar) {
        try {
            C0837a c0837a = getSupabaseJson().f10460b;
            l.k();
            throw null;
        } catch (j unused) {
            SupabaseClient.Companion companion = SupabaseClient.INSTANCE;
            SupabaseLogger logger = companion.getLOGGER();
            LogLevel logLevel = LogLevel.INFO;
            LogLevel level = logger.getLevel();
            if (level == null) {
                level = companion.getDEFAULT_LOG_LEVEL();
            }
            if (logLevel.compareTo(level) < 0) {
                return null;
            }
            l.k();
            throw null;
        }
    }

    @SupabaseInternal
    public static final String buildUrl(String str, k kVar) {
        l.f("baseUrl", str);
        l.f("init", kVar);
        URLBuilder URLBuilder = URLUtilsKt.URLBuilder(str);
        kVar.invoke(URLBuilder);
        return URLBuilder.buildString();
    }

    @SupabaseInternal
    public static final <T> T decodeIfNotEmptyOrDefault(kotlinx.serialization.json.c cVar, T t7) {
        l.f("<this>", cVar);
        if (cVar.f12722k.isEmpty()) {
            return t7;
        }
        C0837a c0837a = getSupabaseJson().f10460b;
        l.k();
        throw null;
    }

    public static final d getSupabaseJson() {
        return supabaseJson;
    }

    @SupabaseInternal
    public static /* synthetic */ void getSupabaseJson$annotations() {
    }

    @SupabaseInternal
    public static final void putJsonObject(v vVar, kotlinx.serialization.json.c cVar) {
        l.f("<this>", vVar);
        l.f("jsonObject", cVar);
        for (String str : cVar.f12722k.keySet()) {
            Object obj = cVar.get(str);
            l.c(obj);
            vVar.b(str, (b) obj);
        }
    }

    @SupabaseInternal
    public static final <T> Object safeBody(HttpResponse httpResponse, String str, S3.c<? super T> cVar) {
        if (str != null) {
            " in ".concat(str);
        }
        try {
            C0837a c0837a = getSupabaseJson().f10460b;
            l.k();
            throw null;
        } catch (V5.b unused) {
            l.k();
            throw null;
        }
    }

    public static Object safeBody$default(HttpResponse httpResponse, String str, S3.c cVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = null;
        }
        if (str != null) {
            " in ".concat(str);
        }
        try {
            C0837a c0837a = getSupabaseJson().f10460b;
            l.k();
            throw null;
        } catch (V5.b unused) {
            l.k();
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C supabaseJson$lambda$0(h hVar) {
        l.f("$this$Json", hVar);
        hVar.f10466c = true;
        hVar.a = false;
        return C.a;
    }

    @SupabaseInternal
    public static final kotlinx.serialization.json.c toJsonObject(String str) {
        l.f("<this>", str);
        d dVar = supabaseJson;
        dVar.getClass();
        return (kotlinx.serialization.json.c) dVar.b(str, kotlinx.serialization.json.c.Companion.serializer());
    }
}
