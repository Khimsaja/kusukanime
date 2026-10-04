package D6;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* loaded from: classes.dex */
public final class b0 implements WildcardType {
    public final Type a;

    /* renamed from: b, reason: collision with root package name */
    public final Type f1746b;

    public b0(Type[] typeArr, Type[] typeArr2) {
        if (typeArr2.length > 1) {
            throw new IllegalArgumentException();
        }
        if (typeArr.length != 1) {
            throw new IllegalArgumentException();
        }
        if (typeArr2.length != 1) {
            typeArr[0].getClass();
            c0.d(typeArr[0]);
            this.f1746b = null;
            this.a = typeArr[0];
            return;
        }
        typeArr2[0].getClass();
        c0.d(typeArr2[0]);
        if (typeArr[0] != Object.class) {
            throw new IllegalArgumentException();
        }
        this.f1746b = typeArr2[0];
        this.a = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && c0.e(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f1746b;
        return type != null ? new Type[]{type} : c0.a;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.a};
    }

    public final int hashCode() {
        Type type = this.f1746b;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.a.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.f1746b;
        if (type != null) {
            return "? super " + c0.t(type);
        }
        Type type2 = this.a;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + c0.t(type2);
    }
}
