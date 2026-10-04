package H3;

import G3.C;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Set;

/* loaded from: classes.dex */
public final class c implements ParameterizedType {
    public final Type a;

    /* renamed from: b, reason: collision with root package name */
    public final Type f3677b;

    /* renamed from: c, reason: collision with root package name */
    public final Type[] f3678c;

    public c(Type type, Type type2, Type... typeArr) {
        if (type2 instanceof Class) {
            Class<?> enclosingClass = ((Class) type2).getEnclosingClass();
            if (type != null) {
                if (enclosingClass == null || C.d(type) != enclosingClass) {
                    throw new IllegalArgumentException("unexpected owner type for " + type2 + ": " + type);
                }
            } else if (enclosingClass != null) {
                throw new IllegalArgumentException("unexpected owner type for " + type2 + ": null");
            }
        }
        this.a = type == null ? null : e.a(type);
        this.f3677b = e.a(type2);
        this.f3678c = (Type[]) typeArr.clone();
        int i7 = 0;
        while (true) {
            Type[] typeArr2 = this.f3678c;
            if (i7 >= typeArr2.length) {
                return;
            }
            typeArr2[i7].getClass();
            e.b(this.f3678c[i7]);
            Type[] typeArr3 = this.f3678c;
            typeArr3[i7] = e.a(typeArr3[i7]);
            i7++;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && C.b(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f3678c.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.a;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f3677b;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.f3678c) ^ this.f3677b.hashCode();
        Set set = e.a;
        Type type = this.a;
        return iHashCode ^ (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        Type[] typeArr = this.f3678c;
        StringBuilder sb = new StringBuilder((typeArr.length + 1) * 30);
        sb.append(e.j(this.f3677b));
        if (typeArr.length == 0) {
            return sb.toString();
        }
        sb.append("<");
        sb.append(e.j(typeArr[0]));
        for (int i7 = 1; i7 < typeArr.length; i7++) {
            sb.append(", ");
            sb.append(e.j(typeArr[i7]));
        }
        sb.append(">");
        return sb.toString();
    }
}
