package Z5;

import b1.AbstractC0703b;
import io.ktor.util.date.GMTDateParser;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: Z5.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0653w implements KSerializer {
    public static final C0653w a = new C0653w();

    /* renamed from: b, reason: collision with root package name */
    public static final k0 f10363b = new k0("kotlin.time.Duration", X5.e.f9937p);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        kotlin.jvm.internal.l.f("decoder", decoder);
        int i7 = A5.a.f239n;
        String strA = decoder.A();
        kotlin.jvm.internal.l.f("value", strA);
        try {
            return new A5.a(A5.g.a(strA));
        } catch (IllegalArgumentException e7) {
            throw new IllegalArgumentException(AbstractC0703b.j("Invalid ISO duration string format: '", strA, "'."), e7);
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f10363b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        long j7;
        int iH;
        long j8 = ((A5.a) obj).f240k;
        kotlin.jvm.internal.l.f("encoder", encoder);
        int i7 = A5.a.f239n;
        StringBuilder sb = new StringBuilder();
        if (j8 < 0) {
            sb.append('-');
        }
        sb.append("PT");
        long j9 = j8 < 0 ? A5.a.j(j8) : j8;
        long jH = A5.a.h(j9, A5.c.f245p);
        boolean z7 = false;
        if (A5.a.e(j9)) {
            j7 = 0;
            iH = 0;
        } else {
            j7 = 0;
            iH = (int) (A5.a.h(j9, A5.c.f244o) % 60);
        }
        int iH2 = A5.a.e(j9) ? 0 : (int) (A5.a.h(j9, A5.c.f243n) % 60);
        int iD = A5.a.d(j9);
        if (A5.a.e(j8)) {
            jH = 9999999999999L;
        }
        boolean z8 = jH != j7;
        boolean z9 = (iH2 == 0 && iD == 0) ? false : true;
        if (iH != 0 || (z9 && z8)) {
            z7 = true;
        }
        if (z8) {
            sb.append(jH);
            sb.append('H');
        }
        if (z7) {
            sb.append(iH);
            sb.append(GMTDateParser.MONTH);
        }
        if (z9 || (!z8 && !z7)) {
            A5.a.b(sb, iH2, iD, 9, "S", true);
        }
        encoder.C(sb.toString());
    }
}
