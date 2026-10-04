package Z5;

import java.util.List;
import l4.InterfaceC1425d;
import l4.InterfaceC1426e;
import l4.InterfaceC1444w;

/* loaded from: classes.dex */
public final class O implements InterfaceC1444w {

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC1444w f10303k;

    public O(InterfaceC1444w interfaceC1444w) {
        kotlin.jvm.internal.l.f("origin", interfaceC1444w);
        this.f10303k = interfaceC1444w;
    }

    @Override // l4.InterfaceC1444w
    public final List a() {
        return this.f10303k.a();
    }

    @Override // l4.InterfaceC1444w
    public final boolean b() {
        return this.f10303k.b();
    }

    @Override // l4.InterfaceC1444w
    public final InterfaceC1426e c() {
        return this.f10303k.c();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        O o7 = obj instanceof O ? (O) obj : null;
        InterfaceC1444w interfaceC1444w = o7 != null ? o7.f10303k : null;
        InterfaceC1444w interfaceC1444w2 = this.f10303k;
        if (!kotlin.jvm.internal.l.a(interfaceC1444w2, interfaceC1444w)) {
            return false;
        }
        InterfaceC1426e interfaceC1426eC = interfaceC1444w2.c();
        if (interfaceC1426eC instanceof InterfaceC1425d) {
            InterfaceC1444w interfaceC1444w3 = obj instanceof InterfaceC1444w ? (InterfaceC1444w) obj : null;
            InterfaceC1426e interfaceC1426eC2 = interfaceC1444w3 != null ? interfaceC1444w3.c() : null;
            if (interfaceC1426eC2 != null && (interfaceC1426eC2 instanceof InterfaceC1425d)) {
                return n6.m.F((InterfaceC1425d) interfaceC1426eC).equals(n6.m.F((InterfaceC1425d) interfaceC1426eC2));
            }
        }
        return false;
    }

    @Override // l4.InterfaceC1423b
    public final List getAnnotations() {
        return this.f10303k.getAnnotations();
    }

    public final int hashCode() {
        return this.f10303k.hashCode();
    }

    public final String toString() {
        return "KTypeWrapper: " + this.f10303k;
    }
}
