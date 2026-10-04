package Z5;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes.dex */
public final class x0 implements KSerializer {
    public static final x0 a = new x0();

    /* renamed from: b, reason: collision with root package name */
    public static final I f10369b = AbstractC0632e0.a("kotlin.UByte", C0641j.a);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        kotlin.jvm.internal.l.f("decoder", decoder);
        return new O3.s(decoder.q(f10369b).w());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f10369b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        byte b4 = ((O3.s) obj).f7541k;
        kotlin.jvm.internal.l.f("encoder", encoder);
        encoder.p(f10369b).k(b4);
    }
}
