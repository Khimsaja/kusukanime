package Z5;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: Z5.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0641j implements KSerializer {
    public static final C0641j a = new C0641j();

    /* renamed from: b, reason: collision with root package name */
    public static final k0 f10340b = new k0("kotlin.Byte", X5.e.f9930i);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        kotlin.jvm.internal.l.f("decoder", decoder);
        return Byte.valueOf(decoder.w());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f10340b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        byte bByteValue = ((Number) obj).byteValue();
        kotlin.jvm.internal.l.f("encoder", encoder);
        encoder.k(bByteValue);
    }
}
