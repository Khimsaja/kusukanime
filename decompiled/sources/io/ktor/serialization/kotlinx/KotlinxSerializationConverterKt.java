package io.ktor.serialization.kotlinx;

import V5.a;
import io.ktor.http.ContentType;
import io.ktor.serialization.Configuration;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\t¨\u0006\n"}, d2 = {"Lio/ktor/serialization/Configuration;", "Lio/ktor/http/ContentType;", "contentType", "LV5/a;", "format", "LO3/C;", "serialization", "(Lio/ktor/serialization/Configuration;Lio/ktor/http/ContentType;LV5/a;)V", "LV5/l;", "(Lio/ktor/serialization/Configuration;Lio/ktor/http/ContentType;LV5/l;)V", "ktor-serialization-kotlinx"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class KotlinxSerializationConverterKt {
    public static final void serialization(Configuration configuration, ContentType contentType, a aVar) {
        l.f("<this>", configuration);
        l.f("contentType", contentType);
        l.f("format", aVar);
        Configuration.DefaultImpls.register$default(configuration, contentType, new KotlinxSerializationConverter(aVar), null, 4, null);
    }

    public static final void serialization(Configuration configuration, ContentType contentType, V5.l lVar) {
        l.f("<this>", configuration);
        l.f("contentType", contentType);
        l.f("format", lVar);
        Configuration.DefaultImpls.register$default(configuration, contentType, new KotlinxSerializationConverter(lVar), null, 4, null);
    }
}
