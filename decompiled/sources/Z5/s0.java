package Z5;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes.dex */
public final class s0 implements KSerializer {
    public static final s0 a = new s0();

    /* renamed from: b, reason: collision with root package name */
    public static final k0 f10354b = new k0("kotlin.Short", X5.e.f9936o);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        kotlin.jvm.internal.l.f("decoder", decoder);
        return Short.valueOf(decoder.z());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f10354b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        short sShortValue = ((Number) obj).shortValue();
        kotlin.jvm.internal.l.f("encoder", encoder);
        encoder.h(sShortValue);
    }
}
