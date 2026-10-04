package Z5;

import java.util.Iterator;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes.dex */
public abstract class r extends AbstractC0623a {
    public final KSerializer a;

    public r(KSerializer kSerializer) {
        this.a = kSerializer;
    }

    @Override // Z5.AbstractC0623a
    public void f(Y5.a aVar, int i7, Object obj) {
        i(i7, obj, aVar.s(getDescriptor(), i7, this.a, null));
    }

    public abstract void i(int i7, Object obj, Object obj2);

    @Override // kotlinx.serialization.KSerializer
    public void serialize(Encoder encoder, Object obj) {
        kotlin.jvm.internal.l.f("encoder", encoder);
        int iD = d(obj);
        SerialDescriptor descriptor = getDescriptor();
        Y5.b bVarI = encoder.i(descriptor, iD);
        Iterator itC = c(obj);
        for (int i7 = 0; i7 < iD; i7++) {
            bVarI.j(getDescriptor(), i7, this.a, itC.next());
        }
        bVarI.b(descriptor);
    }
}
