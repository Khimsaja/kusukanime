package Z5;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: Z5.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0647p implements KSerializer {
    public static final C0647p a = new C0647p();

    /* renamed from: b, reason: collision with root package name */
    public static final k0 f10349b = new k0("kotlin.Char", X5.e.f9931j);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        kotlin.jvm.internal.l.f("decoder", decoder);
        return Character.valueOf(decoder.k());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f10349b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        char cCharValue = ((Character) obj).charValue();
        kotlin.jvm.internal.l.f("encoder", encoder);
        encoder.w(cCharValue);
    }
}
