package a6;

import b1.AbstractC0703b;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonNull;
import l4.AbstractC1420H;

/* loaded from: classes.dex */
public final class y implements KSerializer {
    public static final y a = new y();

    /* renamed from: b, reason: collision with root package name */
    public static final X5.g f10493b = AbstractC1420H.k("kotlinx.serialization.json.JsonPrimitive", X5.e.f9937p, new SerialDescriptor[0]);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        kotlin.jvm.internal.l.f("decoder", decoder);
        kotlinx.serialization.json.b bVarR = n6.m.l(decoder).r();
        if (bVarR instanceof kotlinx.serialization.json.d) {
            return (kotlinx.serialization.json.d) bVarR;
        }
        StringBuilder sb = new StringBuilder("Unexpected JSON element, expected JsonPrimitive, had ");
        throw b6.v.c(-1, bVarR.toString(), AbstractC0703b.o(kotlin.jvm.internal.y.a, bVarR.getClass(), sb));
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f10493b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        kotlinx.serialization.json.d dVar = (kotlinx.serialization.json.d) obj;
        kotlin.jvm.internal.l.f("encoder", encoder);
        kotlin.jvm.internal.l.f("value", dVar);
        n6.m.k(encoder);
        if (dVar instanceof JsonNull) {
            encoder.r(u.a, JsonNull.INSTANCE);
        } else {
            encoder.r(s.a, (r) dVar);
        }
    }
}
