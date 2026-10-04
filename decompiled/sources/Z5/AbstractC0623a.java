package Z5;

import java.util.Iterator;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.Decoder;

/* renamed from: Z5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0623a implements KSerializer {
    public abstract Object a();

    public abstract int b(Object obj);

    public abstract Iterator c(Object obj);

    public abstract int d(Object obj);

    @Override // kotlinx.serialization.KSerializer
    public Object deserialize(Decoder decoder) {
        kotlin.jvm.internal.l.f("decoder", decoder);
        return e(decoder);
    }

    public final Object e(Decoder decoder) {
        kotlin.jvm.internal.l.f("decoder", decoder);
        Object objA = a();
        int iB = b(objA);
        Y5.a aVarA = decoder.a(getDescriptor());
        while (true) {
            int iM = aVarA.m(getDescriptor());
            if (iM == -1) {
                aVarA.b(getDescriptor());
                return h(objA);
            }
            f(aVarA, iM + iB, objA);
        }
    }

    public abstract void f(Y5.a aVar, int i7, Object obj);

    public abstract Object g(Object obj);

    public abstract Object h(Object obj);
}
