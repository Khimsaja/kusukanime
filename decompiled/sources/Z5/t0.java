package Z5;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes.dex */
public final class t0 implements KSerializer {
    public static final t0 a = new t0();

    /* renamed from: b, reason: collision with root package name */
    public static final k0 f10356b = new k0("kotlin.String", X5.e.f9937p);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        kotlin.jvm.internal.l.f("decoder", decoder);
        return decoder.A();
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f10356b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        String str = (String) obj;
        kotlin.jvm.internal.l.f("encoder", encoder);
        kotlin.jvm.internal.l.f("value", str);
        encoder.C(str);
    }
}
