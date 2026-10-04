package Z5;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes.dex */
public final class N implements KSerializer {
    public static final N a = new N();

    /* renamed from: b, reason: collision with root package name */
    public static final k0 f10302b = new k0("kotlin.Int", X5.e.f9934m);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        kotlin.jvm.internal.l.f("decoder", decoder);
        return Integer.valueOf(decoder.t());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f10302b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        int iIntValue = ((Number) obj).intValue();
        kotlin.jvm.internal.l.f("encoder", encoder);
        encoder.o(iIntValue);
    }
}
