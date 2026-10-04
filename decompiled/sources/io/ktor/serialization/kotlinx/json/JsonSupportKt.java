package io.ktor.serialization.kotlinx.json;

import O3.C;
import a6.d;
import a6.h;
import io.ktor.http.ContentType;
import io.ktor.network.sockets.b;
import io.ktor.serialization.Configuration;
import io.ktor.serialization.kotlinx.KotlinxSerializationConverterKt;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import q0.c;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a%\u0010\u0002\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0002\u0010\u0006\u001a'\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0007\u0010\u0006\"\u0017\u0010\b\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lio/ktor/serialization/Configuration;", "La6/d;", "json", "Lio/ktor/http/ContentType;", "contentType", "LO3/C;", "(Lio/ktor/serialization/Configuration;La6/d;Lio/ktor/http/ContentType;)V", "jsonIo", "DefaultJson", "La6/d;", "getDefaultJson", "()La6/d;", "ktor-serialization-kotlinx-json"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class JsonSupportKt {
    private static final d DefaultJson = c.c(new b(6));

    /* JADX INFO: Access modifiers changed from: private */
    public static final C DefaultJson$lambda$0(h hVar) {
        l.f("$this$Json", hVar);
        hVar.a = true;
        hVar.f10467d = true;
        hVar.f10472i = true;
        hVar.f10473j = true;
        return C.a;
    }

    public static final d getDefaultJson() {
        return DefaultJson;
    }

    public static final void json(Configuration configuration, d dVar, ContentType contentType) {
        l.f("<this>", configuration);
        l.f("json", dVar);
        l.f("contentType", contentType);
        KotlinxSerializationConverterKt.serialization(configuration, contentType, dVar);
    }

    public static /* synthetic */ void json$default(Configuration configuration, d dVar, ContentType contentType, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            dVar = DefaultJson;
        }
        if ((i7 & 2) != 0) {
            contentType = ContentType.Application.INSTANCE.getJson();
        }
        json(configuration, dVar, contentType);
    }

    public static final void jsonIo(Configuration configuration, d dVar, ContentType contentType) {
        l.f("<this>", configuration);
        l.f("json", dVar);
        l.f("contentType", contentType);
        Configuration.DefaultImpls.register$default(configuration, contentType, new ExperimentalJsonConverter(dVar), null, 4, null);
    }

    public static /* synthetic */ void jsonIo$default(Configuration configuration, d dVar, ContentType contentType, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            dVar = DefaultJson;
        }
        if ((i7 & 2) != 0) {
            contentType = ContentType.Application.INSTANCE.getJson();
        }
        jsonIo(configuration, dVar, contentType);
    }
}
