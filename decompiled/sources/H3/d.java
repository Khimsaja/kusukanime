package H3;

import G3.C;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* loaded from: classes.dex */
public final class d implements WildcardType {
    public final Type a;

    /* renamed from: b, reason: collision with root package name */
    public final Type f3679b;

    public d(Type[] typeArr, Type[] typeArr2) {
        if (typeArr2.length > 1) {
            throw new IllegalArgumentException();
        }
        if (typeArr.length != 1) {
            throw new IllegalArgumentException();
        }
        if (typeArr2.length != 1) {
            typeArr[0].getClass();
            e.b(typeArr[0]);
            this.f3679b = null;
            this.a = e.a(typeArr[0]);
            return;
        }
        typeArr2[0].getClass();
        e.b(typeArr2[0]);
        if (typeArr[0] != Object.class) {
            throw new IllegalArgumentException();
        }
        this.f3679b = e.a(typeArr2[0]);
        this.a = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && C.b(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f3679b;
        return type != null ? new Type[]{type} : e.f3680b;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.a};
    }

    public final int hashCode() {
        Type type = this.f3679b;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.a.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.f3679b;
        if (type != null) {
            return "? super " + e.j(type);
        }
        Type type2 = this.a;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + e.j(type2);
    }
}
