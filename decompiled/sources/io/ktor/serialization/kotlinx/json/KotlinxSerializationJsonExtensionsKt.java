package io.ktor.serialization.kotlinx.json;

import io.ktor.util.reflect.TypeInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import l4.C1447z;
import l4.InterfaceC1425d;
import l4.InterfaceC1426e;
import l4.InterfaceC1444w;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lio/ktor/util/reflect/TypeInfo;", "argumentTypeInfo", "(Lio/ktor/util/reflect/TypeInfo;)Lio/ktor/util/reflect/TypeInfo;", "ktor-serialization-kotlinx-json"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class KotlinxSerializationJsonExtensionsKt {
    public static final TypeInfo argumentTypeInfo(TypeInfo typeInfo) {
        l.f("<this>", typeInfo);
        InterfaceC1444w kotlinType = typeInfo.getKotlinType();
        l.c(kotlinType);
        InterfaceC1444w interfaceC1444w = ((C1447z) kotlinType.a().get(0)).f12759b;
        l.c(interfaceC1444w);
        InterfaceC1426e interfaceC1426eC = interfaceC1444w.c();
        l.d("null cannot be cast to non-null type kotlin.reflect.KClass<*>", interfaceC1426eC);
        return new TypeInfo((InterfaceC1425d) interfaceC1426eC, interfaceC1444w);
    }
}
