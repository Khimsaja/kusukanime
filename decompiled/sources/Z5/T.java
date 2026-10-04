package Z5;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes.dex */
public final class T implements KSerializer {
    public static final T a = new T();

    /* renamed from: b, reason: collision with root package name */
    public static final k0 f10306b = new k0("kotlin.Long", X5.e.f9935n);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        kotlin.jvm.internal.l.f("decoder", decoder);
        return Long.valueOf(decoder.d());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f10306b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        long jLongValue = ((Number) obj).longValue();
        kotlin.jvm.internal.l.f("encoder", encoder);
        encoder.v(jLongValue);
    }
}
