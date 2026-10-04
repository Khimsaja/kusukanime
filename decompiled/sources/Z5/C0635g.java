package Z5;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: Z5.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0635g implements KSerializer {
    public static final C0635g a = new C0635g();

    /* renamed from: b, reason: collision with root package name */
    public static final k0 f10326b = new k0("kotlin.Boolean", X5.e.f9929h);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        kotlin.jvm.internal.l.f("decoder", decoder);
        return Boolean.valueOf(decoder.g());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f10326b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        kotlin.jvm.internal.l.f("encoder", encoder);
        encoder.l(zBooleanValue);
    }
}
