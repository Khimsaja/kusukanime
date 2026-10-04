package Z5;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes.dex */
public final class J implements F {
    public final /* synthetic */ KSerializer a;

    public J(KSerializer kSerializer) {
        this.a = kSerializer;
    }

    @Override // Z5.F
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{this.a};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        kotlin.jvm.internal.l.f("decoder", decoder);
        throw new IllegalStateException("unsupported");
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        throw new IllegalStateException("unsupported");
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        kotlin.jvm.internal.l.f("encoder", encoder);
        throw new IllegalStateException("unsupported");
    }

    @Override // Z5.F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC0632e0.f10321b;
    }
}
