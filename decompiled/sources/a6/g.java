package a6;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes.dex */
public final class g implements KSerializer {
    public static final g a = new g();

    /* renamed from: b, reason: collision with root package name */
    public static final f f10464b = f.f10462b;

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        kotlin.jvm.internal.l.f("decoder", decoder);
        n6.m.l(decoder);
        return new kotlinx.serialization.json.a((List) n6.m.c(m.a).deserialize(decoder));
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f10464b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        kotlinx.serialization.json.a aVar = (kotlinx.serialization.json.a) obj;
        kotlin.jvm.internal.l.f("encoder", encoder);
        kotlin.jvm.internal.l.f("value", aVar);
        n6.m.k(encoder);
        n6.m.c(m.a).serialize(encoder, aVar);
    }
}
