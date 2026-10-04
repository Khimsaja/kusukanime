package io.ktor.util.reflect;

import e6.AbstractC0839c;
import io.ktor.utils.io.InternalAPI;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import kotlinx.serialization.KSerializer;
import l4.InterfaceC1444w;
import q0.c;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0018\u0010\u0002\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0000\u0018\u0001H\u0086\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001d\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0004*\u00020\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001a\u0010\t\u001a\u0004\u0018\u00010\b\"\u0006\b\u0000\u0010\u0000\u0018\u0001H\u0081\b¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"T", "Lio/ktor/util/reflect/TypeInfo;", "typeInfo", "()Lio/ktor/util/reflect/TypeInfo;", "Lkotlinx/serialization/KSerializer;", "", "serializer", "(Lio/ktor/util/reflect/TypeInfo;)Lkotlinx/serialization/KSerializer;", "Ll4/w;", "typeOfOrNull", "()Ll4/w;", "ktor-utils"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TypeKt {
    @InternalAPI
    public static final KSerializer serializer(TypeInfo typeInfo) {
        l.f("<this>", typeInfo);
        InterfaceC1444w kotlinType = typeInfo.getKotlinType();
        return kotlinType != null ? c.N(AbstractC0839c.a, kotlinType) : c.O(typeInfo.getType());
    }

    public static final <T> TypeInfo typeInfo() {
        l.k();
        throw null;
    }

    public static final <T> InterfaceC1444w typeOfOrNull() {
        try {
            l.k();
            throw null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
