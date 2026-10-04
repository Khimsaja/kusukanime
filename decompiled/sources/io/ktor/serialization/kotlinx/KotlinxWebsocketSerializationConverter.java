package io.ktor.serialization.kotlinx;

import S3.c;
import V5.g;
import V5.j;
import a6.d;
import io.ktor.http.auth.HttpAuthHeader;
import io.ktor.serialization.WebsocketContentConverter;
import io.ktor.serialization.WebsocketConverterNotFoundException;
import io.ktor.serialization.WebsocketDeserializeException;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.websocket.Frame;
import io.ktor.websocket.FrameCommonKt;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import kotlinx.serialization.KSerializer;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\u000b\u001a\u00020\n2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ.\u0010\u0012\u001a\u00020\n2\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J.\u0010\u0015\u001a\u0004\u0018\u00010\b2\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001b¨\u0006\u001c"}, d2 = {"Lio/ktor/serialization/kotlinx/KotlinxWebsocketSerializationConverter;", "Lio/ktor/serialization/WebsocketContentConverter;", "LV5/g;", "format", "<init>", "(LV5/g;)V", "Lkotlinx/serialization/KSerializer;", "serializer", "", "value", "Lio/ktor/websocket/Frame;", "serializeContent", "(Lkotlinx/serialization/KSerializer;LV5/g;Ljava/lang/Object;)Lio/ktor/websocket/Frame;", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", HttpAuthHeader.Parameters.Charset, "Lio/ktor/util/reflect/TypeInfo;", "typeInfo", "serialize", "(Ljava/nio/charset/Charset;Lio/ktor/util/reflect/TypeInfo;Ljava/lang/Object;LS3/c;)Ljava/lang/Object;", "content", "deserialize", "(Ljava/nio/charset/Charset;Lio/ktor/util/reflect/TypeInfo;Lio/ktor/websocket/Frame;LS3/c;)Ljava/lang/Object;", "frame", "", "isApplicable", "(Lio/ktor/websocket/Frame;)Z", "LV5/g;", "ktor-serialization-kotlinx"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class KotlinxWebsocketSerializationConverter implements WebsocketContentConverter {
    private final g format;

    public KotlinxWebsocketSerializationConverter(g gVar) {
        l.f("format", gVar);
        this.format = gVar;
        if (gVar instanceof V5.l) {
            return;
        }
        throw new IllegalArgumentException(("Only binary and string formats are supported, " + gVar + " is not supported.").toString());
    }

    private final Frame serializeContent(KSerializer serializer, g format, Object value) {
        if (format instanceof V5.l) {
            l.d("null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any?>", serializer);
            return new Frame.Text(((d) ((V5.l) format)).d(serializer, value));
        }
        throw new IllegalStateException(("Unsupported format " + format).toString());
    }

    @Override // io.ktor.serialization.WebsocketContentConverter
    public Object deserialize(Charset charset, TypeInfo typeInfo, Frame frame, c<Object> cVar) throws WebsocketDeserializeException, WebsocketConverterNotFoundException {
        if (!isApplicable(frame)) {
            throw new WebsocketConverterNotFoundException("Unsupported frame " + frame.getFrameType().name(), null, 2, null);
        }
        KSerializer kSerializerSerializerForTypeInfo = SerializerLookupKt.serializerForTypeInfo(((d) this.format).f10460b, typeInfo);
        g gVar = this.format;
        if (!(gVar instanceof V5.l)) {
            throw new IllegalStateException(("Unsupported format " + this.format).toString());
        }
        if (frame instanceof Frame.Text) {
            return ((d) ((V5.l) gVar)).b(FrameCommonKt.readText((Frame.Text) frame), kSerializerSerializerForTypeInfo);
        }
        throw new WebsocketDeserializeException("Unsupported format " + this.format + " for " + frame.getFrameType().name(), null, frame, 2, null);
    }

    @Override // io.ktor.serialization.WebsocketContentConverter
    public boolean isApplicable(Frame frame) {
        l.f("frame", frame);
        return (frame instanceof Frame.Text) || (frame instanceof Frame.Binary);
    }

    @Override // io.ktor.serialization.WebsocketContentConverter
    public Object serialize(Charset charset, TypeInfo typeInfo, Object obj, c<? super Frame> cVar) {
        KSerializer kSerializerGuessSerializer;
        try {
            kSerializerGuessSerializer = SerializerLookupKt.serializerForTypeInfo(((d) this.format).f10460b, typeInfo);
        } catch (j unused) {
            kSerializerGuessSerializer = SerializerLookupKt.guessSerializer(obj, ((d) this.format).f10460b);
        }
        return serializeContent(kSerializerGuessSerializer, this.format, obj);
    }
}
