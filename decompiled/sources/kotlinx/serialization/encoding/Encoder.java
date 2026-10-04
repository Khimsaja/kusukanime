package kotlinx.serialization.encoding;

import Y5.b;
import e6.AbstractC0838b;
import kotlin.jvm.internal.l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes.dex */
public interface Encoder {
    default void B(KSerializer kSerializer, Object obj) {
        l.f("serializer", kSerializer);
        if (kSerializer.getDescriptor().h()) {
            r(kSerializer, obj);
        } else if (obj == null) {
            f();
        } else {
            r(kSerializer, obj);
        }
    }

    void C(String str);

    b a(SerialDescriptor serialDescriptor);

    AbstractC0838b c();

    void f();

    void g(double d4);

    void h(short s7);

    default b i(SerialDescriptor serialDescriptor, int i7) {
        l.f("descriptor", serialDescriptor);
        return a(serialDescriptor);
    }

    void k(byte b4);

    void l(boolean z7);

    void m(SerialDescriptor serialDescriptor, int i7);

    void o(int i7);

    Encoder p(SerialDescriptor serialDescriptor);

    default void r(KSerializer kSerializer, Object obj) {
        l.f("serializer", kSerializer);
        kSerializer.serialize(this, obj);
    }

    void s(float f5);

    void v(long j7);

    void w(char c2);
}
