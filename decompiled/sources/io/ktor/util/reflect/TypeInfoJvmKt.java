package io.ktor.util.reflect;

import O3.InterfaceC0554c;
import io.ktor.http.ContentType;
import io.ktor.http.LinkHeader;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import l4.AbstractC1420H;
import l4.InterfaceC1425d;
import l4.InterfaceC1444w;
import n6.m;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a1\u0010\b\u001a\u00020\u00072\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u00012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u001d\u0010\r\u001a\u00020\f*\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\r\u0010\u000e\"\u001b\u0010\u0002\u001a\u00020\u0000*\u00020\u00078F¢\u0006\f\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010\"\"\u0010\u0017\u001a\u00060\u0000j\u0002`\u0001*\u00020\u00058FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014*\u001a\b\u0007\u0010\u001b\"\u00020\u00002\u00020\u0000B\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a¨\u0006\u001c"}, d2 = {"Ljava/lang/reflect/Type;", "Lio/ktor/util/reflect/Type;", "reifiedType", "Ll4/d;", "kClass", "Ll4/w;", "kType", "Lio/ktor/util/reflect/TypeInfo;", "typeInfoImpl", "(Ljava/lang/reflect/Type;Ll4/d;Ll4/w;)Lio/ktor/util/reflect/TypeInfo;", "", LinkHeader.Parameters.Type, "", "instanceOf", "(Ljava/lang/Object;Ll4/d;)Z", "getReifiedType", "(Lio/ktor/util/reflect/TypeInfo;)Ljava/lang/reflect/Type;", "getReifiedType$annotations", "(Lio/ktor/util/reflect/TypeInfo;)V", "getPlatformType", "(Ll4/w;)Ljava/lang/reflect/Type;", "getPlatformType$annotations", "(Ll4/w;)V", "platformType", "LO3/c;", ContentType.Message.TYPE, "Not used anymore in common code as it was needed only for JVM target.", "Type", "ktor-utils"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TypeInfoJvmKt {
    @InterfaceC0554c
    public static /* synthetic */ void Type$annotations() {
    }

    public static final Type getPlatformType(InterfaceC1444w interfaceC1444w) {
        l.f("<this>", interfaceC1444w);
        return AbstractC1420H.D(interfaceC1444w);
    }

    public static final Type getReifiedType(TypeInfo typeInfo) {
        l.f("<this>", typeInfo);
        InterfaceC1444w kotlinType = typeInfo.getKotlinType();
        return kotlinType != null ? AbstractC1420H.D(kotlinType) : m.F(typeInfo.getType());
    }

    public static /* synthetic */ void getReifiedType$annotations(TypeInfo typeInfo) {
    }

    public static final boolean instanceOf(Object obj, InterfaceC1425d interfaceC1425d) {
        l.f("<this>", obj);
        l.f(LinkHeader.Parameters.Type, interfaceC1425d);
        return m.F(interfaceC1425d).isInstance(obj);
    }

    @InterfaceC0554c
    public static final TypeInfo typeInfoImpl(Type type, InterfaceC1425d interfaceC1425d, InterfaceC1444w interfaceC1444w) {
        l.f("reifiedType", type);
        l.f("kClass", interfaceC1425d);
        return new TypeInfo(interfaceC1425d, interfaceC1444w);
    }

    @InterfaceC0554c
    public static /* synthetic */ void getPlatformType$annotations(InterfaceC1444w interfaceC1444w) {
    }
}
