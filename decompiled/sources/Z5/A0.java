package Z5;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes.dex */
public final class A0 implements KSerializer {
    public static final A0 a = new A0();

    /* renamed from: b, reason: collision with root package name */
    public static final I f10280b = AbstractC0632e0.a("kotlin.UInt", N.a);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        kotlin.jvm.internal.l.f("decoder", decoder);
        return new O3.v(decoder.q(f10280b).t());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f10280b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        int i7 = ((O3.v) obj).f7546k;
        kotlin.jvm.internal.l.f("encoder", encoder);
        encoder.p(f10280b).o(i7);
    }
}
