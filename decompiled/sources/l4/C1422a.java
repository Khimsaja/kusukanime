package l4;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* renamed from: l4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1422a implements GenericArrayType, Type {
    public final Type a;

    public C1422a(Type type) {
        kotlin.jvm.internal.l.f("elementType", type);
        this.a = type;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof GenericArrayType) {
            return kotlin.jvm.internal.l.a(this.a, ((GenericArrayType) obj).getGenericComponentType());
        }
        return false;
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.a;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        return AbstractC1420H.e(this.a) + "[]";
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return getTypeName();
    }
}
