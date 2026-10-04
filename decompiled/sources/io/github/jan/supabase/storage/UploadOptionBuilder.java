package io.github.jan.supabase.storage;

import a6.C0673c;
import a6.v;
import e4.k;
import io.github.jan.supabase.SupabaseSerializer;
import io.ktor.http.ContentType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001BV\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012#\b\u0002\u0010\n\u001a\u001d\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fj\u0002`\u0010¢\u0006\u0002\b\u000f0\u000b¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010%\u001a\u00020\u000e2\u001b\u0010&\u001a\u0017\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fj\u0002`\u0010¢\u0006\u0002\b\u000fJ\"\u0010\u0006\u001a\u00020\u000e\"\n\b\u0000\u0010'\u0018\u0001*\u00020\u00012\u0006\u0010(\u001a\u0002H'H\u0086\b¢\u0006\u0002\u0010)J%\u0010\u0006\u001a\u00020\u000e2\u0017\u0010*\u001a\u0013\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000fH\u0086\bø\u0001\u0000R\u001c\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R/\u0010\n\u001a\u001d\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fj\u0002`\u0010¢\u0006\u0002\b\u000f0\u000bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006,"}, d2 = {"Lio/github/jan/supabase/storage/UploadOptionBuilder;", "", "serializer", "Lio/github/jan/supabase/SupabaseSerializer;", "upsert", "", "userMetadata", "Lkotlinx/serialization/json/JsonObject;", "contentType", "Lio/ktor/http/ContentType;", "httpRequestOverrides", "", "Lkotlin/Function1;", "Lio/ktor/client/request/HttpRequestBuilder;", "", "Lkotlin/ExtensionFunctionType;", "Lio/github/jan/supabase/network/HttpRequestOverride;", "<init>", "(Lio/github/jan/supabase/SupabaseSerializer;ZLkotlinx/serialization/json/JsonObject;Lio/ktor/http/ContentType;Ljava/util/List;)V", "getSerializer$annotations", "()V", "getSerializer", "()Lio/github/jan/supabase/SupabaseSerializer;", "getUpsert", "()Z", "setUpsert", "(Z)V", "getUserMetadata", "()Lkotlinx/serialization/json/JsonObject;", "setUserMetadata", "(Lkotlinx/serialization/json/JsonObject;)V", "getContentType", "()Lio/ktor/http/ContentType;", "setContentType", "(Lio/ktor/http/ContentType;)V", "getHttpRequestOverrides$storage_kt_release", "()Ljava/util/List;", "httpOverride", "override", "T", "data", "(Ljava/lang/Object;)V", "builder", "Lkotlinx/serialization/json/JsonObjectBuilder;", "storage-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UploadOptionBuilder {
    private ContentType contentType;
    private final List<k> httpRequestOverrides;
    private final SupabaseSerializer serializer;
    private boolean upsert;
    private kotlinx.serialization.json.c userMetadata;

    public UploadOptionBuilder(SupabaseSerializer supabaseSerializer, boolean z7, kotlinx.serialization.json.c cVar, ContentType contentType, List<k> list) {
        l.f("serializer", supabaseSerializer);
        l.f("httpRequestOverrides", list);
        this.serializer = supabaseSerializer;
        this.upsert = z7;
        this.userMetadata = cVar;
        this.contentType = contentType;
        this.httpRequestOverrides = list;
    }

    public static /* synthetic */ void getSerializer$annotations() {
    }

    public final ContentType getContentType() {
        return this.contentType;
    }

    public final List<k> getHttpRequestOverrides$storage_kt_release() {
        return this.httpRequestOverrides;
    }

    public final SupabaseSerializer getSerializer() {
        return this.serializer;
    }

    public final boolean getUpsert() {
        return this.upsert;
    }

    public final kotlinx.serialization.json.c getUserMetadata() {
        return this.userMetadata;
    }

    public final void httpOverride(k kVar) {
        l.f("override", kVar);
        this.httpRequestOverrides.add(kVar);
    }

    public final void setContentType(ContentType contentType) {
        this.contentType = contentType;
    }

    public final void setUpsert(boolean z7) {
        this.upsert = z7;
    }

    public final void setUserMetadata(kotlinx.serialization.json.c cVar) {
        this.userMetadata = cVar;
    }

    public final <T> void userMetadata(T data) {
        l.f("data", data);
        getSerializer();
        C0673c c0673c = a6.d.f10459d;
        l.k();
        throw null;
    }

    public final void userMetadata(k kVar) {
        l.f("builder", kVar);
        v vVar = new v();
        kVar.invoke(vVar);
        setUserMetadata(vVar.a());
    }

    public /* synthetic */ UploadOptionBuilder(SupabaseSerializer supabaseSerializer, boolean z7, kotlinx.serialization.json.c cVar, ContentType contentType, List list, int i7, kotlin.jvm.internal.f fVar) {
        this(supabaseSerializer, (i7 & 2) != 0 ? false : z7, (i7 & 4) != 0 ? null : cVar, (i7 & 8) != 0 ? null : contentType, (i7 & 16) != 0 ? new ArrayList() : list);
    }
}
