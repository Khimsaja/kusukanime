package Z5;

import b1.AbstractC0703b;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: Z5.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0628c0 implements KSerializer {
    public final Object a = z1.c.B(O3.j.f7525k, new B3.q(8, this));

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        kotlin.jvm.internal.l.f("decoder", decoder);
        SerialDescriptor descriptor = getDescriptor();
        Y5.a aVarA = decoder.a(descriptor);
        int iM = aVarA.m(getDescriptor());
        if (iM != -1) {
            throw new V5.j(AbstractC0703b.g(iM, "Unexpected index "));
        }
        aVarA.b(descriptor);
        return O3.C.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [O3.i, java.lang.Object] */
    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.a.getValue();
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        kotlin.jvm.internal.l.f("encoder", encoder);
        kotlin.jvm.internal.l.f("value", obj);
        encoder.a(getDescriptor()).b(getDescriptor());
    }
}
