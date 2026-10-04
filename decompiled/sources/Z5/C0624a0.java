package Z5;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: Z5.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0624a0 implements KSerializer {
    public static final C0624a0 a = new C0624a0();

    /* renamed from: b, reason: collision with root package name */
    public static final Z f10315b = Z.a;

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        kotlin.jvm.internal.l.f("decoder", decoder);
        throw new V5.j("'kotlin.Nothing' does not have instances");
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f10315b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        kotlin.jvm.internal.l.f("encoder", encoder);
        kotlin.jvm.internal.l.f("value", (Void) obj);
        throw new V5.j("'kotlin.Nothing' cannot be serialized");
    }
}
