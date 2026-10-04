package l4;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: l4.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1416D implements ParameterizedType, Type {
    public final Class a;

    /* renamed from: b, reason: collision with root package name */
    public final Type f12741b;

    /* renamed from: c, reason: collision with root package name */
    public final Type[] f12742c;

    public C1416D(Class cls, Type type, ArrayList arrayList) {
        this.a = cls;
        this.f12741b = type;
        this.f12742c = (Type[]) arrayList.toArray(new Type[0]);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ParameterizedType)) {
            return false;
        }
        ParameterizedType parameterizedType = (ParameterizedType) obj;
        if (kotlin.jvm.internal.l.a(this.a, parameterizedType.getRawType()) && kotlin.jvm.internal.l.a(this.f12741b, parameterizedType.getOwnerType())) {
            return Arrays.equals(this.f12742c, parameterizedType.getActualTypeArguments());
        }
        return false;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return this.f12742c;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f12741b;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.a;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        StringBuilder sb = new StringBuilder();
        Class cls = this.a;
        Type type = this.f12741b;
        if (type != null) {
            sb.append(AbstractC1420H.e(type));
            sb.append("$");
            sb.append(cls.getSimpleName());
        } else {
            sb.append(AbstractC1420H.e(cls));
        }
        Type[] typeArr = this.f12742c;
        if (typeArr.length != 0) {
            P3.m.m0(typeArr, sb, ", ", "<", ">", "...", C1415C.f12740k);
        }
        return sb.toString();
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode();
        Type type = this.f12741b;
        return (iHashCode ^ (type != null ? type.hashCode() : 0)) ^ Arrays.hashCode(this.f12742c);
    }

    public final String toString() {
        return getTypeName();
    }
}
