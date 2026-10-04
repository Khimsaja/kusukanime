package Z5;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes.dex */
public final class D0 implements KSerializer {
    public static final D0 a = new D0();

    /* renamed from: b, reason: collision with root package name */
    public static final I f10286b = AbstractC0632e0.a("kotlin.ULong", T.a);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        kotlin.jvm.internal.l.f("decoder", decoder);
        return new O3.x(decoder.q(f10286b).d());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f10286b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        long j7 = ((O3.x) obj).f7548k;
        kotlin.jvm.internal.l.f("encoder", encoder);
        encoder.p(f10286b).v(j7);
    }
}
