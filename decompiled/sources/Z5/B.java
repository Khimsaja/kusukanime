package Z5;

import java.util.Arrays;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes.dex */
public final class B implements KSerializer {
    public final Enum[] a;

    /* renamed from: b, reason: collision with root package name */
    public final O3.q f10281b;

    public B(String str, Enum[] enumArr) {
        kotlin.jvm.internal.l.f("values", enumArr);
        this.a = enumArr;
        this.f10281b = z1.c.C(new A(0, this, str));
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        kotlin.jvm.internal.l.f("decoder", decoder);
        int iL = decoder.l(getDescriptor());
        Enum[] enumArr = this.a;
        if (iL >= 0 && iL < enumArr.length) {
            return enumArr[iL];
        }
        throw new V5.j(iL + " is not among valid " + getDescriptor().e() + " enum values, values size is " + enumArr.length);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.f10281b.getValue();
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        Enum r52 = (Enum) obj;
        kotlin.jvm.internal.l.f("encoder", encoder);
        kotlin.jvm.internal.l.f("value", r52);
        Enum[] enumArr = this.a;
        int iL0 = P3.m.l0(r52, enumArr);
        if (iL0 != -1) {
            encoder.m(getDescriptor(), iL0);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(r52);
        sb.append(" is not a valid enum ");
        sb.append(getDescriptor().e());
        sb.append(", must be one of ");
        String string = Arrays.toString(enumArr);
        kotlin.jvm.internal.l.e("toString(...)", string);
        sb.append(string);
        throw new V5.j(sb.toString());
    }

    public final String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().e() + '>';
    }
}
