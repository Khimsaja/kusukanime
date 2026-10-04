package Z5;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: Z5.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0626b0 implements KSerializer {
    public final KSerializer a;

    /* renamed from: b, reason: collision with root package name */
    public final n0 f10316b;

    public C0626b0(KSerializer kSerializer) {
        kotlin.jvm.internal.l.f("serializer", kSerializer);
        this.a = kSerializer;
        this.f10316b = new n0(kSerializer.getDescriptor());
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        kotlin.jvm.internal.l.f("decoder", decoder);
        if (decoder.i()) {
            return decoder.f(this.a);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C0626b0.class == obj.getClass() && kotlin.jvm.internal.l.a(this.a, ((C0626b0) obj).a);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.f10316b;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        kotlin.jvm.internal.l.f("encoder", encoder);
        if (obj != null) {
            encoder.r(this.a, obj);
        } else {
            encoder.f();
        }
    }
}
