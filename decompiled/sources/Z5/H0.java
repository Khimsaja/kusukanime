package Z5;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes.dex */
public final class H0 implements KSerializer {

    /* renamed from: b, reason: collision with root package name */
    public static final H0 f10296b = new H0();
    public final /* synthetic */ C0628c0 a = new C0628c0();

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        kotlin.jvm.internal.l.f("decoder", decoder);
        this.a.deserialize(decoder);
        return O3.C.a;
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.a.getDescriptor();
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        O3.C c2 = (O3.C) obj;
        kotlin.jvm.internal.l.f("encoder", encoder);
        kotlin.jvm.internal.l.f("value", c2);
        this.a.serialize(encoder, c2);
    }
}
