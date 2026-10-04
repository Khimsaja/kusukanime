package io.ktor.serialization;

import O3.C;
import e4.k;
import io.ktor.http.ContentType;
import io.ktor.network.sockets.b;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J?\u0010\n\u001a\u00020\b\"\b\b\u0000\u0010\u0003*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lio/ktor/serialization/Configuration;", "", "Lio/ktor/serialization/ContentConverter;", "T", "Lio/ktor/http/ContentType;", "contentType", "converter", "Lkotlin/Function1;", "LO3/C;", "configuration", "register", "(Lio/ktor/http/ContentType;Lio/ktor/serialization/ContentConverter;Le4/k;)V", "ktor-serialization"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public interface Configuration {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void register$default(Configuration configuration, ContentType contentType, ContentConverter contentConverter, k kVar, int i7, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: register");
            }
            if ((i7 & 4) != 0) {
                kVar = new b(5);
            }
            configuration.register(contentType, contentConverter, kVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static C register$lambda$0(ContentConverter contentConverter) {
            l.f("<this>", contentConverter);
            return C.a;
        }
    }

    <T extends ContentConverter> void register(ContentType contentType, T converter, k configuration);
}
