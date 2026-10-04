package io.ktor.util.date;

import O3.InterfaceC0554c;
import O3.i;
import V5.m;
import Y5.a;
import Y5.b;
import Z5.AbstractC0632e0;
import Z5.C0636g0;
import Z5.F;
import Z5.N;
import Z5.T;
import io.ktor.util.GzipHeaderFlags;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"io/ktor/util/date/GMTDate.$serializer", "LZ5/F;", "Lio/ktor/util/date/GMTDate;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LO3/C;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lio/ktor/util/date/GMTDate;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lio/ktor/util/date/GMTDate;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = 48)
@InterfaceC0554c
/* loaded from: classes.dex */
public /* synthetic */ class GMTDate$$serializer implements F {
    public static final GMTDate$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        GMTDate$$serializer gMTDate$$serializer = new GMTDate$$serializer();
        INSTANCE = gMTDate$$serializer;
        C0636g0 c0636g0 = new C0636g0("io.ktor.util.date.GMTDate", gMTDate$$serializer, 9);
        c0636g0.b("seconds", false);
        c0636g0.b("minutes", false);
        c0636g0.b("hours", false);
        c0636g0.b("dayOfWeek", false);
        c0636g0.b("dayOfMonth", false);
        c0636g0.b("dayOfYear", false);
        c0636g0.b("month", false);
        c0636g0.b("year", false);
        c0636g0.b("timestamp", false);
        descriptor = c0636g0;
    }

    private GMTDate$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Z5.F
    public final KSerializer[] childSerializers() {
        i[] iVarArr = GMTDate.$childSerializers;
        N n7 = N.a;
        return new KSerializer[]{n7, n7, n7, iVarArr[3].getValue(), n7, n7, iVarArr[6].getValue(), n7, T.a};
    }

    @Override // kotlinx.serialization.KSerializer
    public final GMTDate deserialize(Decoder decoder) {
        l.f("decoder", decoder);
        SerialDescriptor serialDescriptor = descriptor;
        a aVarA = decoder.a(serialDescriptor);
        i[] iVarArr = GMTDate.$childSerializers;
        Month month = null;
        int i7 = 0;
        int iU = 0;
        int iU2 = 0;
        int iU3 = 0;
        int iU4 = 0;
        int iU5 = 0;
        int iU6 = 0;
        WeekDay weekDay = null;
        long jN = 0;
        boolean z7 = true;
        while (z7) {
            int iM = aVarA.m(serialDescriptor);
            switch (iM) {
                case -1:
                    z7 = false;
                    break;
                case 0:
                    iU = aVarA.u(serialDescriptor, 0);
                    i7 |= 1;
                    break;
                case 1:
                    iU2 = aVarA.u(serialDescriptor, 1);
                    i7 |= 2;
                    break;
                case 2:
                    iU3 = aVarA.u(serialDescriptor, 2);
                    i7 |= 4;
                    break;
                case 3:
                    weekDay = (WeekDay) aVarA.s(serialDescriptor, 3, (KSerializer) iVarArr[3].getValue(), weekDay);
                    i7 |= 8;
                    break;
                case GzipHeaderFlags.EXTRA /* 4 */:
                    iU4 = aVarA.u(serialDescriptor, 4);
                    i7 |= 16;
                    break;
                case 5:
                    iU5 = aVarA.u(serialDescriptor, 5);
                    i7 |= 32;
                    break;
                case 6:
                    month = (Month) aVarA.s(serialDescriptor, 6, (KSerializer) iVarArr[6].getValue(), month);
                    i7 |= 64;
                    break;
                case 7:
                    iU6 = aVarA.u(serialDescriptor, 7);
                    i7 |= 128;
                    break;
                case 8:
                    jN = aVarA.n(serialDescriptor, 8);
                    i7 |= 256;
                    break;
                default:
                    throw new m(iM);
            }
        }
        aVarA.b(serialDescriptor);
        return new GMTDate(i7, iU, iU2, iU3, weekDay, iU4, iU5, month, iU6, jN, null);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, GMTDate value) {
        l.f("encoder", encoder);
        l.f("value", value);
        SerialDescriptor serialDescriptor = descriptor;
        b bVarA = encoder.a(serialDescriptor);
        GMTDate.write$Self$ktor_utils(value, bVarA, serialDescriptor);
        bVarA.b(serialDescriptor);
    }

    @Override // Z5.F
    public /* bridge */ /* synthetic */ KSerializer[] typeParametersSerializers() {
        return AbstractC0632e0.f10321b;
    }
}
