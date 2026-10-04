package Z5;

import b1.AbstractC0703b;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import l4.AbstractC1420H;

/* loaded from: classes.dex */
public final class W implements KSerializer {
    public final KSerializer a;

    /* renamed from: b, reason: collision with root package name */
    public final KSerializer f10312b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f10313c;

    /* renamed from: d, reason: collision with root package name */
    public final X5.g f10314d;

    public W(KSerializer kSerializer, KSerializer kSerializer2, byte b4) {
        this.a = kSerializer;
        this.f10312b = kSerializer2;
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        Object v5;
        kotlin.jvm.internal.l.f("decoder", decoder);
        SerialDescriptor descriptor = getDescriptor();
        Y5.a aVarA = decoder.a(descriptor);
        KSerializer kSerializer = this.f10312b;
        KSerializer kSerializer2 = this.a;
        Object obj = AbstractC0632e0.f10322c;
        Object objS = obj;
        Object objS2 = objS;
        while (true) {
            int iM = aVarA.m(getDescriptor());
            if (iM == -1) {
                if (objS == obj) {
                    throw new V5.j("Element 'key' is missing");
                }
                if (objS2 == obj) {
                    throw new V5.j("Element 'value' is missing");
                }
                switch (this.f10313c) {
                    case 0:
                        v5 = new V(objS, objS2);
                        break;
                    default:
                        v5 = new O3.l(objS, objS2);
                        break;
                }
                aVarA.b(descriptor);
                return v5;
            }
            if (iM == 0) {
                objS = aVarA.s(getDescriptor(), 0, kSerializer2, null);
            } else {
                if (iM != 1) {
                    throw new V5.j(AbstractC0703b.g(iM, "Invalid index: "));
                }
                objS2 = aVarA.s(getDescriptor(), 1, kSerializer, null);
            }
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        switch (this.f10313c) {
        }
        return this.f10314d;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        Object key;
        Object value;
        kotlin.jvm.internal.l.f("encoder", encoder);
        Y5.b bVarA = encoder.a(getDescriptor());
        SerialDescriptor descriptor = getDescriptor();
        KSerializer kSerializer = this.a;
        switch (this.f10313c) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                kotlin.jvm.internal.l.f("<this>", entry);
                key = entry.getKey();
                break;
            default:
                O3.l lVar = (O3.l) obj;
                kotlin.jvm.internal.l.f("<this>", lVar);
                key = lVar.f7528k;
                break;
        }
        bVarA.j(descriptor, 0, kSerializer, key);
        SerialDescriptor descriptor2 = getDescriptor();
        KSerializer kSerializer2 = this.f10312b;
        switch (this.f10313c) {
            case 0:
                Map.Entry entry2 = (Map.Entry) obj;
                kotlin.jvm.internal.l.f("<this>", entry2);
                value = entry2.getValue();
                break;
            default:
                O3.l lVar2 = (O3.l) obj;
                kotlin.jvm.internal.l.f("<this>", lVar2);
                value = lVar2.f7529l;
                break;
        }
        bVarA.j(descriptor2, 1, kSerializer2, value);
        bVarA.b(getDescriptor());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public W(final KSerializer kSerializer, final KSerializer kSerializer2, int i7) {
        this(kSerializer, kSerializer2, (byte) 0);
        this.f10313c = i7;
        switch (i7) {
            case 1:
                this(kSerializer, kSerializer2, (byte) 0);
                final int i8 = 1;
                this.f10314d = AbstractC1420H.i("kotlin.Pair", new SerialDescriptor[0], new e4.k() { // from class: Z5.U
                    @Override // e4.k
                    public final Object invoke(Object obj) {
                        X5.a aVar = (X5.a) obj;
                        switch (i8) {
                            case 0:
                                kotlin.jvm.internal.l.f("$this$buildSerialDescriptor", aVar);
                                aVar.a("key", kSerializer.getDescriptor(), (12 & 8) == 0);
                                aVar.a("value", kSerializer2.getDescriptor(), (12 & 8) == 0);
                                break;
                            default:
                                kotlin.jvm.internal.l.f("$this$buildClassSerialDescriptor", aVar);
                                aVar.a("first", kSerializer.getDescriptor(), (12 & 8) == 0);
                                aVar.a("second", kSerializer2.getDescriptor(), (12 & 8) == 0);
                                break;
                        }
                        return O3.C.a;
                    }
                });
                break;
            default:
                final int i9 = 0;
                this.f10314d = AbstractC1420H.j("kotlin.collections.Map.Entry", X5.j.f9953j, new SerialDescriptor[0], new e4.k() { // from class: Z5.U
                    @Override // e4.k
                    public final Object invoke(Object obj) {
                        X5.a aVar = (X5.a) obj;
                        switch (i9) {
                            case 0:
                                kotlin.jvm.internal.l.f("$this$buildSerialDescriptor", aVar);
                                aVar.a("key", kSerializer.getDescriptor(), (12 & 8) == 0);
                                aVar.a("value", kSerializer2.getDescriptor(), (12 & 8) == 0);
                                break;
                            default:
                                kotlin.jvm.internal.l.f("$this$buildClassSerialDescriptor", aVar);
                                aVar.a("first", kSerializer.getDescriptor(), (12 & 8) == 0);
                                aVar.a("second", kSerializer2.getDescriptor(), (12 & 8) == 0);
                                break;
                        }
                        return O3.C.a;
                    }
                });
                break;
        }
    }
}
