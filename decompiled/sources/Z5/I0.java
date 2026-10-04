package Z5;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import z5.AbstractC2499d;

/* loaded from: classes.dex */
public final class I0 implements KSerializer {
    public static final I0 a = new I0();

    /* renamed from: b, reason: collision with root package name */
    public static final k0 f10298b = new k0("kotlin.uuid.Uuid", X5.e.f9937p);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        String strConcat;
        kotlin.jvm.internal.l.f("decoder", decoder);
        String strA = decoder.A();
        kotlin.jvm.internal.l.f("uuidString", strA);
        int length = strA.length();
        C5.a aVar = C5.a.f968m;
        if (length == 32) {
            long jB = AbstractC2499d.b(strA, 0, 16);
            long jB2 = AbstractC2499d.b(strA, 16, 32);
            if (jB != 0 || jB2 != 0) {
                return new C5.a(jB, jB2);
            }
        } else {
            if (length != 36) {
                StringBuilder sb = new StringBuilder("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"");
                if (strA.length() <= 64) {
                    strConcat = strA;
                } else {
                    String strSubstring = strA.substring(0, 64);
                    kotlin.jvm.internal.l.e("substring(...)", strSubstring);
                    strConcat = strSubstring.concat("...");
                }
                sb.append(strConcat);
                sb.append("\" of length ");
                sb.append(strA.length());
                throw new IllegalArgumentException(sb.toString());
            }
            long jB3 = AbstractC2499d.b(strA, 0, 8);
            P3.F.i(8, strA);
            long jB4 = AbstractC2499d.b(strA, 9, 13);
            P3.F.i(13, strA);
            long jB5 = AbstractC2499d.b(strA, 14, 18);
            P3.F.i(18, strA);
            long jB6 = AbstractC2499d.b(strA, 19, 23);
            P3.F.i(23, strA);
            long j7 = (jB4 << 16) | (jB3 << 32) | jB5;
            long jB7 = AbstractC2499d.b(strA, 24, 36) | (jB6 << 48);
            if (j7 != 0 || jB7 != 0) {
                return new C5.a(j7, jB7);
            }
        }
        return aVar;
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f10298b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C5.a aVar = (C5.a) obj;
        kotlin.jvm.internal.l.f("encoder", encoder);
        kotlin.jvm.internal.l.f("value", aVar);
        encoder.C(aVar.toString());
    }
}
