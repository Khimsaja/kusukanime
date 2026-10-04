package io.ktor.serialization.kotlinx;

import P3.q;
import P3.r;
import Z5.C0629d;
import Z5.t0;
import e6.AbstractC0838b;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.utils.io.InternalAPI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.y;
import kotlin.jvm.internal.z;
import kotlinx.serialization.KSerializer;
import l4.InterfaceC1444w;
import n6.m;
import q0.c;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u001e\n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a/\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0003\"\b\b\u0000\u0010\u0007*\u00020\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\f\u0010\r\u001a#\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0003*\u0006\u0012\u0002\b\u00030\u000e2\u0006\u0010\u000b\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Le6/b;", "Lio/ktor/util/reflect/TypeInfo;", "typeInfo", "Lkotlinx/serialization/KSerializer;", "serializerForTypeInfo", "(Le6/b;Lio/ktor/util/reflect/TypeInfo;)Lkotlinx/serialization/KSerializer;", "", "T", "maybeNullable", "(Lkotlinx/serialization/KSerializer;Lio/ktor/util/reflect/TypeInfo;)Lkotlinx/serialization/KSerializer;", "value", "module", "guessSerializer", "(Ljava/lang/Object;Le6/b;)Lkotlinx/serialization/KSerializer;", "", "elementSerializer", "(Ljava/util/Collection;Le6/b;)Lkotlinx/serialization/KSerializer;", "ktor-serialization-kotlinx"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SerializerLookupKt {
    private static final KSerializer elementSerializer(Collection<?> collection, AbstractC0838b abstractC0838b) {
        Collection<?> collection2 = collection;
        Collection<?> collection3 = collection2;
        l.f("<this>", collection3);
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection3) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(r.p(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(guessSerializer(it.next(), abstractC0838b));
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (hashSet.add(((KSerializer) next).getDescriptor().e())) {
                arrayList3.add(next);
            }
        }
        if (arrayList3.size() > 1) {
            StringBuilder sb = new StringBuilder("Serializing collections of different element types is not yet supported. Selected serializers: ");
            ArrayList arrayList4 = new ArrayList(r.p(arrayList3, 10));
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                arrayList4.add(((KSerializer) it3.next()).getDescriptor().e());
            }
            sb.append(arrayList4);
            throw new IllegalStateException(sb.toString().toString());
        }
        KSerializer kSerializer = (KSerializer) q.M0(arrayList3);
        if (kSerializer == null) {
            kSerializer = t0.a;
        }
        if (!kSerializer.getDescriptor().h() && (!(collection2 instanceof Collection) || !collection2.isEmpty())) {
            Iterator<T> it4 = collection2.iterator();
            while (it4.hasNext()) {
                if (it4.next() == null) {
                    return m.K(kSerializer);
                }
            }
        }
        return kSerializer;
    }

    @InternalAPI
    public static final KSerializer guessSerializer(Object obj, AbstractC0838b abstractC0838b) {
        KSerializer kSerializerGuessSerializer;
        l.f("module", abstractC0838b);
        if (obj == null) {
            return m.K(t0.a);
        }
        if (obj instanceof List) {
            return m.c(elementSerializer((Collection) obj, abstractC0838b));
        }
        if (obj instanceof Object[]) {
            Object objI0 = P3.m.i0((Object[]) obj);
            return (objI0 == null || (kSerializerGuessSerializer = guessSerializer(objI0, abstractC0838b)) == null) ? m.c(t0.a) : kSerializerGuessSerializer;
        }
        if (obj instanceof Set) {
            KSerializer kSerializerElementSerializer = elementSerializer((Collection) obj, abstractC0838b);
            l.f("elementSerializer", kSerializerElementSerializer);
            return new C0629d(kSerializerElementSerializer, 2);
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            return m.d(elementSerializer(map.keySet(), abstractC0838b), elementSerializer(map.values(), abstractC0838b));
        }
        Class<?> cls = obj.getClass();
        z zVar = y.a;
        AbstractC0838b.a(abstractC0838b, zVar.b(cls));
        return c.O(zVar.b(obj.getClass()));
    }

    private static final <T> KSerializer maybeNullable(KSerializer kSerializer, TypeInfo typeInfo) {
        InterfaceC1444w kotlinType = typeInfo.getKotlinType();
        return (kotlinType == null || !kotlinType.b()) ? kSerializer : m.K(kSerializer);
    }

    public static final KSerializer serializerForTypeInfo(AbstractC0838b abstractC0838b, TypeInfo typeInfo) {
        l.f("<this>", abstractC0838b);
        l.f("typeInfo", typeInfo);
        InterfaceC1444w kotlinType = typeInfo.getKotlinType();
        if (kotlinType != null) {
            KSerializer kSerializerL = kotlinType.a().isEmpty() ? null : z1.c.L(abstractC0838b, kotlinType, false);
            if (kSerializerL != null) {
                return kSerializerL;
            }
        }
        AbstractC0838b.a(abstractC0838b, typeInfo.getType());
        return maybeNullable(c.O(typeInfo.getType()), typeInfo);
    }
}
