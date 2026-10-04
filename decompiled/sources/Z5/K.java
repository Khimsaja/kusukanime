package Z5;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes.dex */
public final class K implements KSerializer {
    public static final K a = new K();

    /* renamed from: b, reason: collision with root package name */
    public static final k0 f10299b = new k0("kotlin.time.Instant", X5.e.f9937p);

    /* JADX WARN: Removed duplicated region for block: B:194:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x04b9  */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder r28) {
        /*
            Method dump skipped, instructions count: 1232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Z5.K.deserialize(kotlinx.serialization.encoding.Decoder):java.lang.Object");
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f10299b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        A5.d dVar = (A5.d) obj;
        kotlin.jvm.internal.l.f("encoder", encoder);
        kotlin.jvm.internal.l.f("value", dVar);
        encoder.C(dVar.toString());
    }
}
