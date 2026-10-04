package a6;

import Z5.t0;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes.dex */
public final class x implements KSerializer {
    public static final x a = new x();

    /* renamed from: b, reason: collision with root package name */
    public static final w f10492b = w.f10490b;

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        kotlin.jvm.internal.l.f("decoder", decoder);
        n6.m.l(decoder);
        return new kotlinx.serialization.json.c((Map) n6.m.d(t0.a, m.a).deserialize(decoder));
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f10492b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        kotlinx.serialization.json.c cVar = (kotlinx.serialization.json.c) obj;
        kotlin.jvm.internal.l.f("encoder", encoder);
        kotlin.jvm.internal.l.f("value", cVar);
        n6.m.k(encoder);
        n6.m.d(t0.a, m.a).serialize(encoder, cVar);
    }
}
