package Z5;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: Z5.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0652v implements KSerializer {
    public static final C0652v a = new C0652v();

    /* renamed from: b, reason: collision with root package name */
    public static final k0 f10361b = new k0("kotlin.Double", X5.e.f9932k);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        kotlin.jvm.internal.l.f("decoder", decoder);
        return Double.valueOf(decoder.D());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f10361b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        double dDoubleValue = ((Number) obj).doubleValue();
        kotlin.jvm.internal.l.f("encoder", encoder);
        encoder.g(dDoubleValue);
    }
}
