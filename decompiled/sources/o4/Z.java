package o4;

import java.lang.reflect.Type;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class Z implements Type {
    public final Type[] a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13672b;

    public Z(Type[] typeArr) {
        kotlin.jvm.internal.l.f("types", typeArr);
        this.a = typeArr;
        this.f13672b = Arrays.hashCode(typeArr);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Z) {
            return Arrays.equals(this.a, ((Z) obj).a);
        }
        return false;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        return P3.m.n0(this.a, ", ", "[", "]", null, 56);
    }

    public final int hashCode() {
        return this.f13672b;
    }

    public final String toString() {
        return getTypeName();
    }
}
