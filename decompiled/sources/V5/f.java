package V5;

import B3.q;
import P3.E;
import P3.F;
import P3.y;
import Z5.AbstractC0625b;
import java.lang.annotation.Annotation;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import l4.InterfaceC1425d;

/* loaded from: classes.dex */
public final class f extends AbstractC0625b {
    public final InterfaceC1425d a;

    /* renamed from: b, reason: collision with root package name */
    public final List f9493b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f9494c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f9495d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f9496e;

    public f(InterfaceC1425d interfaceC1425d, InterfaceC1425d[] interfaceC1425dArr, KSerializer[] kSerializerArr, Annotation[] annotationArr) {
        kotlin.jvm.internal.l.f("baseClass", interfaceC1425d);
        this.a = interfaceC1425d;
        this.f9493b = y.f7779k;
        this.f9494c = z1.c.B(O3.j.f7525k, new q(5, this));
        if (interfaceC1425dArr.length != kSerializerArr.length) {
            throw new IllegalArgumentException("All subclasses of sealed class " + interfaceC1425d.n() + " should be marked @Serializable");
        }
        Map mapR0 = E.r0(P3.m.w0(interfaceC1425dArr, kSerializerArr));
        this.f9495d = mapR0;
        Set<Map.Entry> setEntrySet = mapR0.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : setEntrySet) {
            String strE = ((KSerializer) entry.getValue()).getDescriptor().e();
            Object obj = linkedHashMap.get(strE);
            if (obj == null) {
                linkedHashMap.containsKey(strE);
            }
            Map.Entry entry2 = (Map.Entry) obj;
            if (entry2 != null) {
                throw new IllegalStateException(("Multiple sealed subclasses of '" + this.a + "' have the same serial name '" + strE + "': '" + entry2.getKey() + "', '" + entry.getKey() + '\'').toString());
            }
            linkedHashMap.put(strE, entry);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(F.I(linkedHashMap.size()));
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry3.getKey(), (KSerializer) ((Map.Entry) entry3.getValue()).getValue());
        }
        this.f9496e = linkedHashMap2;
        this.f9493b = P3.m.P(annotationArr);
    }

    @Override // Z5.AbstractC0625b
    public final KSerializer a(Y5.a aVar, String str) {
        KSerializer kSerializer = (KSerializer) this.f9496e.get(str);
        if (kSerializer != null) {
            return kSerializer;
        }
        super.a(aVar, str);
        return null;
    }

    @Override // Z5.AbstractC0625b
    public final KSerializer b(Encoder encoder, Object obj) {
        KSerializer kSerializer;
        kotlin.jvm.internal.l.f("encoder", encoder);
        kotlin.jvm.internal.l.f("value", obj);
        KSerializer kSerializer2 = (KSerializer) this.f9495d.get(kotlin.jvm.internal.y.a.b(obj.getClass()));
        if (kSerializer2 != null) {
            kSerializer = kSerializer2;
        } else {
            super.b(encoder, obj);
            kSerializer = null;
        }
        if (kSerializer != null) {
            return kSerializer;
        }
        return null;
    }

    @Override // Z5.AbstractC0625b
    public final InterfaceC1425d c() {
        return this.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [O3.i, java.lang.Object] */
    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.f9494c.getValue();
    }
}
