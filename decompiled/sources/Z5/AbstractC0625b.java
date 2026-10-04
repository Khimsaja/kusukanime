package Z5;

import b1.AbstractC0703b;
import e6.AbstractC0838b;
import e6.C0837a;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import l4.InterfaceC1425d;

/* renamed from: Z5.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0625b implements KSerializer {
    public KSerializer a(Y5.a aVar, String str) {
        AbstractC0838b abstractC0838bC = aVar.c();
        InterfaceC1425d interfaceC1425dC = c();
        ((C0837a) abstractC0838bC).getClass();
        kotlin.jvm.internal.l.f("baseClass", interfaceC1425dC);
        kotlin.jvm.internal.B.g(1, null);
        return null;
    }

    public KSerializer b(Encoder encoder, Object obj) {
        kotlin.jvm.internal.l.f("encoder", encoder);
        kotlin.jvm.internal.l.f("value", obj);
        AbstractC0838b abstractC0838bC = encoder.c();
        InterfaceC1425d interfaceC1425dC = c();
        ((C0837a) abstractC0838bC).getClass();
        kotlin.jvm.internal.l.f("baseClass", interfaceC1425dC);
        if (!interfaceC1425dC.m(obj)) {
            return null;
        }
        kotlin.jvm.internal.B.g(1, null);
        return null;
    }

    public abstract InterfaceC1425d c();

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        kotlin.jvm.internal.l.f("decoder", decoder);
        SerialDescriptor descriptor = getDescriptor();
        Y5.a aVarA = decoder.a(descriptor);
        Object objS = null;
        String strH = null;
        while (true) {
            int iM = aVarA.m(getDescriptor());
            if (iM == -1) {
                if (objS == null) {
                    throw new IllegalArgumentException(AbstractC0703b.i("Polymorphic value has not been read for class ", strH).toString());
                }
                aVarA.b(descriptor);
                return objS;
            }
            if (iM == 0) {
                strH = aVarA.h(getDescriptor(), iM);
            } else {
                if (iM != 1) {
                    StringBuilder sb = new StringBuilder("Invalid index in polymorphic deserialization of ");
                    if (strH == null) {
                        strH = "unknown class";
                    }
                    sb.append(strH);
                    sb.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                    sb.append(iM);
                    throw new V5.j(sb.toString());
                }
                if (strH == null) {
                    throw new IllegalArgumentException("Cannot read polymorphic value before its type token");
                }
                objS = aVarA.s(getDescriptor(), iM, n6.m.y(this, aVarA, strH), null);
            }
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        kotlin.jvm.internal.l.f("encoder", encoder);
        kotlin.jvm.internal.l.f("value", obj);
        KSerializer kSerializerZ = n6.m.z(this, encoder, obj);
        SerialDescriptor descriptor = getDescriptor();
        Y5.b bVarA = encoder.a(descriptor);
        bVarA.E(getDescriptor(), 0, kSerializerZ.getDescriptor().e());
        bVarA.j(getDescriptor(), 1, kSerializerZ, obj);
        bVarA.b(descriptor);
    }
}
