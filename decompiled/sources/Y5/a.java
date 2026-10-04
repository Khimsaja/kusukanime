package Y5;

import Z5.C0640i0;
import e6.AbstractC0838b;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* loaded from: classes.dex */
public interface a {
    char C(C0640i0 c0640i0, int i7);

    void b(SerialDescriptor serialDescriptor);

    AbstractC0838b c();

    boolean e(SerialDescriptor serialDescriptor, int i7);

    String h(SerialDescriptor serialDescriptor, int i7);

    short j(C0640i0 c0640i0, int i7);

    int m(SerialDescriptor serialDescriptor);

    long n(SerialDescriptor serialDescriptor, int i7);

    float o(C0640i0 c0640i0, int i7);

    Object p(SerialDescriptor serialDescriptor, int i7, KSerializer kSerializer, Object obj);

    Object s(SerialDescriptor serialDescriptor, int i7, KSerializer kSerializer, Object obj);

    int u(SerialDescriptor serialDescriptor, int i7);

    Decoder v(C0640i0 c0640i0, int i7);

    byte x(C0640i0 c0640i0, int i7);

    double y(C0640i0 c0640i0, int i7);
}
