package D6;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class a0 implements ParameterizedType {
    public final Type a;

    /* renamed from: b, reason: collision with root package name */
    public final Type f1737b;

    /* renamed from: c, reason: collision with root package name */
    public final Type[] f1738c;

    public a0(Type type, Type type2, Type... typeArr) {
        if (type2 instanceof Class) {
            if ((type == null) != (((Class) type2).getEnclosingClass() == null)) {
                throw new IllegalArgumentException();
            }
        }
        for (Type type3 : typeArr) {
            Objects.requireNonNull(type3, "typeArgument == null");
            c0.d(type3);
        }
        this.a = type;
        this.f1737b = type2;
        this.f1738c = (Type[]) typeArr.clone();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && c0.e(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f1738c.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.a;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f1737b;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.f1738c) ^ this.f1737b.hashCode();
        Type type = this.a;
        return iHashCode ^ (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        Type[] typeArr = this.f1738c;
        int length = typeArr.length;
        Type type = this.f1737b;
        if (length == 0) {
            return c0.t(type);
        }
        StringBuilder sb = new StringBuilder((typeArr.length + 1) * 30);
        sb.append(c0.t(type));
        sb.append("<");
        sb.append(c0.t(typeArr[0]));
        for (int i7 = 1; i7 < typeArr.length; i7++) {
            sb.append(", ");
            sb.append(c0.t(typeArr[i7]));
        }
        sb.append(">");
        return sb.toString();
    }
}
