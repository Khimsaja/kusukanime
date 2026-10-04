package kotlin.jvm.internal;

import java.util.List;
import l4.InterfaceC1425d;
import l4.InterfaceC1426e;
import l4.InterfaceC1444w;

/* loaded from: classes.dex */
public final class D implements InterfaceC1444w {

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC1426e f12708k;

    /* renamed from: l, reason: collision with root package name */
    public final List f12709l;

    /* renamed from: m, reason: collision with root package name */
    public final int f12710m;

    public D(InterfaceC1426e interfaceC1426e, List list, int i7) {
        l.f("classifier", interfaceC1426e);
        l.f("arguments", list);
        this.f12708k = interfaceC1426e;
        this.f12709l = list;
        this.f12710m = i7;
    }

    @Override // l4.InterfaceC1444w
    public final List a() {
        return this.f12709l;
    }

    @Override // l4.InterfaceC1444w
    public final boolean b() {
        return (this.f12710m & 1) != 0;
    }

    @Override // l4.InterfaceC1444w
    public final InterfaceC1426e c() {
        return this.f12708k;
    }

    public final String d(boolean z7) {
        String name;
        InterfaceC1426e interfaceC1426e = this.f12708k;
        InterfaceC1425d interfaceC1425d = interfaceC1426e instanceof InterfaceC1425d ? (InterfaceC1425d) interfaceC1426e : null;
        Class clsF = interfaceC1425d != null ? n6.m.F(interfaceC1425d) : null;
        if (clsF == null) {
            name = interfaceC1426e.toString();
        } else if ((this.f12710m & 4) != 0) {
            name = "kotlin.Nothing";
        } else if (clsF.isArray()) {
            name = clsF.equals(boolean[].class) ? "kotlin.BooleanArray" : clsF.equals(char[].class) ? "kotlin.CharArray" : clsF.equals(byte[].class) ? "kotlin.ByteArray" : clsF.equals(short[].class) ? "kotlin.ShortArray" : clsF.equals(int[].class) ? "kotlin.IntArray" : clsF.equals(float[].class) ? "kotlin.FloatArray" : clsF.equals(long[].class) ? "kotlin.LongArray" : clsF.equals(double[].class) ? "kotlin.DoubleArray" : "kotlin.Array";
        } else if (z7 && clsF.isPrimitive()) {
            l.d("null cannot be cast to non-null type kotlin.reflect.KClass<*>", interfaceC1426e);
            name = n6.m.G((InterfaceC1425d) interfaceC1426e).getName();
        } else {
            name = clsF.getName();
        }
        return name + (this.f12709l.isEmpty() ? "" : P3.q.y0(this.f12709l, ", ", "<", ">", new A3.d(24, this), 24)) + (b() ? "?" : "");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof D)) {
            return false;
        }
        D d4 = (D) obj;
        return l.a(this.f12708k, d4.f12708k) && l.a(this.f12709l, d4.f12709l) && this.f12710m == d4.f12710m;
    }

    @Override // l4.InterfaceC1423b
    public final List getAnnotations() {
        return P3.y.f7779k;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f12710m) + ((this.f12709l.hashCode() + (this.f12708k.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return d(false) + " (Kotlin reflection is not available)";
    }
}
