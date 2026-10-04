package D6;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* loaded from: classes.dex */
public final class Z implements GenericArrayType {
    public final Type a;

    public Z(Type type) {
        this.a = type;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && c0.e(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return c0.t(this.a) + "[]";
    }
}
