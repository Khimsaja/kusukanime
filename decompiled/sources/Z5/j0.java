package Z5;

import java.util.Iterator;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes.dex */
public abstract class j0 extends r {

    /* renamed from: b, reason: collision with root package name */
    public final C0640i0 f10341b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(KSerializer kSerializer) {
        super(kSerializer);
        kotlin.jvm.internal.l.f("primitiveSerializer", kSerializer);
        this.f10341b = new C0640i0(kSerializer.getDescriptor());
    }

    @Override // Z5.AbstractC0623a
    public final Object a() {
        return (AbstractC0638h0) g(j());
    }

    @Override // Z5.AbstractC0623a
    public final int b(Object obj) {
        AbstractC0638h0 abstractC0638h0 = (AbstractC0638h0) obj;
        kotlin.jvm.internal.l.f("<this>", abstractC0638h0);
        return abstractC0638h0.d();
    }

    @Override // Z5.AbstractC0623a
    public final Iterator c(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // Z5.AbstractC0623a, kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        kotlin.jvm.internal.l.f("decoder", decoder);
        return e(decoder);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.f10341b;
    }

    @Override // Z5.AbstractC0623a
    public final Object h(Object obj) {
        AbstractC0638h0 abstractC0638h0 = (AbstractC0638h0) obj;
        kotlin.jvm.internal.l.f("<this>", abstractC0638h0);
        return abstractC0638h0.a();
    }

    @Override // Z5.r
    public final void i(int i7, Object obj, Object obj2) {
        kotlin.jvm.internal.l.f("<this>", (AbstractC0638h0) obj);
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    public abstract Object j();

    public abstract void k(Y5.b bVar, Object obj, int i7);

    @Override // Z5.r, kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        kotlin.jvm.internal.l.f("encoder", encoder);
        int iD = d(obj);
        C0640i0 c0640i0 = this.f10341b;
        Y5.b bVarI = encoder.i(c0640i0, iD);
        k(bVarI, obj, iD);
        bVarI.b(c0640i0);
    }
}
