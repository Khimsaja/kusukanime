package H3;

import G3.C;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* loaded from: classes.dex */
public final class b implements GenericArrayType {
    public final Type a;

    public b(Type type) {
        this.a = e.a(type);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && C.b(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return e.j(this.a) + "[]";
    }
}
