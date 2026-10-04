package a6;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import l4.AbstractC1420H;

/* loaded from: classes.dex */
public final class m implements KSerializer {
    public static final m a = new m();

    /* renamed from: b, reason: collision with root package name */
    public static final X5.g f10484b = AbstractC1420H.j("kotlinx.serialization.json.JsonElement", X5.c.f9928i, new SerialDescriptor[0], new A3.e(16));

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        kotlin.jvm.internal.l.f("decoder", decoder);
        return n6.m.l(decoder).r();
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f10484b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        kotlinx.serialization.json.b bVar = (kotlinx.serialization.json.b) obj;
        kotlin.jvm.internal.l.f("encoder", encoder);
        kotlin.jvm.internal.l.f("value", bVar);
        n6.m.k(encoder);
        if (bVar instanceof kotlinx.serialization.json.d) {
            encoder.r(y.a, bVar);
        } else if (bVar instanceof kotlinx.serialization.json.c) {
            encoder.r(x.a, bVar);
        } else {
            if (!(bVar instanceof kotlinx.serialization.json.a)) {
                throw new D6.r();
            }
            encoder.r(g.a, bVar);
        }
    }
}
