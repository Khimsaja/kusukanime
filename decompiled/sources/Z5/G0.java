package Z5;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes.dex */
public final class G0 implements KSerializer {
    public static final G0 a = new G0();

    /* renamed from: b, reason: collision with root package name */
    public static final I f10292b = AbstractC0632e0.a("kotlin.UShort", s0.a);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        kotlin.jvm.internal.l.f("decoder", decoder);
        return new O3.A(decoder.q(f10292b).z());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f10292b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        short s7 = ((O3.A) obj).f7509k;
        kotlin.jvm.internal.l.f("encoder", encoder);
        encoder.p(f10292b).h(s7);
    }
}
