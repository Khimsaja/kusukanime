package Y5;

import Z5.C0640i0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes.dex */
public interface b {
    void A(SerialDescriptor serialDescriptor, int i7, boolean z7);

    void D(C0640i0 c0640i0, int i7, short s7);

    void E(SerialDescriptor serialDescriptor, int i7, String str);

    void F(SerialDescriptor serialDescriptor, int i7, KSerializer kSerializer, Object obj);

    void b(SerialDescriptor serialDescriptor);

    void d(C0640i0 c0640i0, int i7, byte b4);

    void e(C0640i0 c0640i0, int i7, char c2);

    void j(SerialDescriptor serialDescriptor, int i7, KSerializer kSerializer, Object obj);

    void n(C0640i0 c0640i0, int i7, double d4);

    void q(int i7, int i8, SerialDescriptor serialDescriptor);

    Encoder t(C0640i0 c0640i0, int i7);

    void u(C0640i0 c0640i0, int i7, float f5);

    void x(SerialDescriptor serialDescriptor, int i7, long j7);

    boolean z(SerialDescriptor serialDescriptor);
}
