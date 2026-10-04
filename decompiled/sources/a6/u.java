package a6;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonNull;
import l4.AbstractC1420H;

/* loaded from: classes.dex */
public final class u implements KSerializer {
    public static final u a = new u();

    /* renamed from: b, reason: collision with root package name */
    public static final X5.g f10489b = AbstractC1420H.k("kotlinx.serialization.json.JsonNull", X5.i.f9950h, new SerialDescriptor[0]);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        kotlin.jvm.internal.l.f("decoder", decoder);
        n6.m.l(decoder);
        if (decoder.i()) {
            throw new b6.q("Expected 'null' literal");
        }
        return JsonNull.INSTANCE;
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f10489b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        kotlin.jvm.internal.l.f("encoder", encoder);
        kotlin.jvm.internal.l.f("value", (JsonNull) obj);
        n6.m.k(encoder);
        encoder.f();
    }
}
