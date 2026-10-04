package Z5;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes.dex */
public final class E implements KSerializer {
    public static final E a = new E();

    /* renamed from: b, reason: collision with root package name */
    public static final k0 f10287b = new k0("kotlin.Float", X5.e.f9933l);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        kotlin.jvm.internal.l.f("decoder", decoder);
        return Float.valueOf(decoder.B());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f10287b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        float fFloatValue = ((Number) obj).floatValue();
        kotlin.jvm.internal.l.f("encoder", encoder);
        encoder.s(fFloatValue);
    }
}
