package Z5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes.dex */
public final class H extends AbstractC0623a {
    public final KSerializer a;

    /* renamed from: b, reason: collision with root package name */
    public final KSerializer f10293b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f10294c;

    /* renamed from: d, reason: collision with root package name */
    public final G f10295d;

    public H(KSerializer kSerializer, KSerializer kSerializer2, byte b4) {
        this.a = kSerializer;
        this.f10293b = kSerializer2;
    }

    @Override // Z5.AbstractC0623a
    public final Object a() {
        switch (this.f10294c) {
            case 0:
                return new HashMap();
            default:
                return new LinkedHashMap();
        }
    }

    @Override // Z5.AbstractC0623a
    public final int b(Object obj) {
        switch (this.f10294c) {
            case 0:
                HashMap map = (HashMap) obj;
                kotlin.jvm.internal.l.f("<this>", map);
                return map.size() * 2;
            default:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
                kotlin.jvm.internal.l.f("<this>", linkedHashMap);
                return linkedHashMap.size() * 2;
        }
    }

    @Override // Z5.AbstractC0623a
    public final Iterator c(Object obj) {
        switch (this.f10294c) {
            case 0:
                Map map = (Map) obj;
                kotlin.jvm.internal.l.f("<this>", map);
                return map.entrySet().iterator();
            default:
                Map map2 = (Map) obj;
                kotlin.jvm.internal.l.f("<this>", map2);
                return map2.entrySet().iterator();
        }
    }

    @Override // Z5.AbstractC0623a
    public final int d(Object obj) {
        switch (this.f10294c) {
            case 0:
                Map map = (Map) obj;
                kotlin.jvm.internal.l.f("<this>", map);
                return map.size();
            default:
                Map map2 = (Map) obj;
                kotlin.jvm.internal.l.f("<this>", map2);
                return map2.size();
        }
    }

    @Override // Z5.AbstractC0623a
    public final void f(Y5.a aVar, int i7, Object obj) {
        Map map = (Map) obj;
        kotlin.jvm.internal.l.f("builder", map);
        Object objS = aVar.s(getDescriptor(), i7, this.a, null);
        int iM = aVar.m(getDescriptor());
        if (iM != i7 + 1) {
            throw new IllegalArgumentException(A6.b.e(i7, iM, "Value must follow key in a map, index for key: ", ", returned index for value: ").toString());
        }
        boolean zContainsKey = map.containsKey(objS);
        KSerializer kSerializer = this.f10293b;
        map.put(objS, (!zContainsKey || (kSerializer.getDescriptor().c() instanceof X5.f)) ? aVar.s(getDescriptor(), iM, kSerializer, null) : aVar.s(getDescriptor(), iM, kSerializer, P3.E.m0(objS, map)));
    }

    @Override // Z5.AbstractC0623a
    public final Object g(Object obj) {
        switch (this.f10294c) {
            case 0:
                kotlin.jvm.internal.l.f("<this>", null);
                return new HashMap((Map) null);
            default:
                kotlin.jvm.internal.l.f("<this>", null);
                return new LinkedHashMap((Map) null);
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        switch (this.f10294c) {
        }
        return this.f10295d;
    }

    @Override // Z5.AbstractC0623a
    public final Object h(Object obj) {
        switch (this.f10294c) {
            case 0:
                HashMap map = (HashMap) obj;
                kotlin.jvm.internal.l.f("<this>", map);
                return map;
            default:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
                kotlin.jvm.internal.l.f("<this>", linkedHashMap);
                return linkedHashMap;
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        kotlin.jvm.internal.l.f("encoder", encoder);
        int iD = d(obj);
        SerialDescriptor descriptor = getDescriptor();
        Y5.b bVarI = encoder.i(descriptor, iD);
        Iterator itC = c(obj);
        int i7 = 0;
        while (itC.hasNext()) {
            Map.Entry entry = (Map.Entry) itC.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i8 = i7 + 1;
            bVarI.j(getDescriptor(), i7, this.a, key);
            i7 += 2;
            bVarI.j(getDescriptor(), i8, this.f10293b, value);
        }
        bVarI.b(descriptor);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public H(KSerializer kSerializer, KSerializer kSerializer2, int i7) {
        this(kSerializer, kSerializer2, (byte) 0);
        this.f10294c = i7;
        switch (i7) {
            case 1:
                kotlin.jvm.internal.l.f("kSerializer", kSerializer);
                kotlin.jvm.internal.l.f("vSerializer", kSerializer2);
                this(kSerializer, kSerializer2, (byte) 0);
                SerialDescriptor descriptor = kSerializer.getDescriptor();
                SerialDescriptor descriptor2 = kSerializer2.getDescriptor();
                kotlin.jvm.internal.l.f("keyDesc", descriptor);
                kotlin.jvm.internal.l.f("valueDesc", descriptor2);
                this.f10295d = new G("kotlin.collections.LinkedHashMap", descriptor, descriptor2);
                break;
            default:
                kotlin.jvm.internal.l.f("kSerializer", kSerializer);
                kotlin.jvm.internal.l.f("vSerializer", kSerializer2);
                SerialDescriptor descriptor3 = kSerializer.getDescriptor();
                SerialDescriptor descriptor4 = kSerializer2.getDescriptor();
                kotlin.jvm.internal.l.f("keyDesc", descriptor3);
                kotlin.jvm.internal.l.f("valueDesc", descriptor4);
                this.f10295d = new G("kotlin.collections.HashMap", descriptor3, descriptor4);
                break;
        }
    }
}
