package kotlinx.serialization.encoding;

import Y5.a;
import kotlin.jvm.internal.l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes.dex */
public interface Decoder {
    String A();

    float B();

    double D();

    a a(SerialDescriptor serialDescriptor);

    long d();

    default Object f(KSerializer kSerializer) {
        l.f("deserializer", kSerializer);
        return kSerializer.deserialize(this);
    }

    boolean g();

    boolean i();

    char k();

    int l(SerialDescriptor serialDescriptor);

    Decoder q(SerialDescriptor serialDescriptor);

    int t();

    byte w();

    short z();
}
