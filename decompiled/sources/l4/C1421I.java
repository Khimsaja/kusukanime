package l4;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;

/* renamed from: l4.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1421I implements WildcardType, Type {

    /* renamed from: c, reason: collision with root package name */
    public static final C1421I f12751c = new C1421I(null, null);
    public final Type a;

    /* renamed from: b, reason: collision with root package name */
    public final Type f12752b;

    public C1421I(Type type, Type type2) {
        this.a = type;
        this.f12752b = type2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof WildcardType)) {
            return false;
        }
        WildcardType wildcardType = (WildcardType) obj;
        return Arrays.equals(getUpperBounds(), wildcardType.getUpperBounds()) && Arrays.equals(getLowerBounds(), wildcardType.getLowerBounds());
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f12752b;
        return type == null ? new Type[0] : new Type[]{type};
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        Type type = this.f12752b;
        if (type != null) {
            return "? super " + AbstractC1420H.e(type);
        }
        Type type2 = this.a;
        if (type2 == null || kotlin.jvm.internal.l.a(type2, Object.class)) {
            return "?";
        }
        return "? extends " + AbstractC1420H.e(type2);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        Type type = this.a;
        if (type == null) {
            type = Object.class;
        }
        return new Type[]{type};
    }

    public final int hashCode() {
        return Arrays.hashCode(getUpperBounds()) ^ Arrays.hashCode(getLowerBounds());
    }

    public final String toString() {
        return getTypeName();
    }
}
