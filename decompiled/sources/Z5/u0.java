package Z5;

import b1.AbstractC0703b;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import l4.AbstractC1420H;

/* loaded from: classes.dex */
public final class u0 implements KSerializer {
    public final KSerializer a;

    /* renamed from: b, reason: collision with root package name */
    public final KSerializer f10358b;

    /* renamed from: c, reason: collision with root package name */
    public final KSerializer f10359c;

    /* renamed from: d, reason: collision with root package name */
    public final X5.g f10360d = AbstractC1420H.i("kotlin.Triple", new SerialDescriptor[0], new A3.d(5, this));

    public u0(KSerializer kSerializer, KSerializer kSerializer2, KSerializer kSerializer3) {
        this.a = kSerializer;
        this.f10358b = kSerializer2;
        this.f10359c = kSerializer3;
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        kotlin.jvm.internal.l.f("decoder", decoder);
        X5.g gVar = this.f10360d;
        Y5.a aVarA = decoder.a(gVar);
        KSerializer kSerializer = this.f10359c;
        KSerializer kSerializer2 = this.f10358b;
        KSerializer kSerializer3 = this.a;
        Object obj = AbstractC0632e0.f10322c;
        Object objS = obj;
        Object objS2 = objS;
        Object objS3 = objS2;
        while (true) {
            int iM = aVarA.m(gVar);
            if (iM == -1) {
                aVarA.b(gVar);
                if (objS == obj) {
                    throw new V5.j("Element 'first' is missing");
                }
                if (objS2 == obj) {
                    throw new V5.j("Element 'second' is missing");
                }
                if (objS3 != obj) {
                    return new O3.r(objS, objS2, objS3);
                }
                throw new V5.j("Element 'third' is missing");
            }
            if (iM == 0) {
                objS = aVarA.s(gVar, 0, kSerializer3, null);
            } else if (iM == 1) {
                objS2 = aVarA.s(gVar, 1, kSerializer2, null);
            } else {
                if (iM != 2) {
                    throw new V5.j(AbstractC0703b.g(iM, "Unexpected index "));
                }
                objS3 = aVarA.s(gVar, 2, kSerializer, null);
            }
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.f10360d;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        O3.r rVar = (O3.r) obj;
        kotlin.jvm.internal.l.f("encoder", encoder);
        kotlin.jvm.internal.l.f("value", rVar);
        X5.g gVar = this.f10360d;
        Y5.b bVarA = encoder.a(gVar);
        bVarA.j(gVar, 0, this.a, rVar.f7538k);
        bVarA.j(gVar, 1, this.f10358b, rVar.f7539l);
        bVarA.j(gVar, 2, this.f10359c, rVar.f7540m);
        bVarA.b(gVar);
    }
}
