package n5;

import java.util.Collection;
import java.util.List;
import m5.C1515d;
import m5.C1523l;
import m5.InterfaceC1526o;
import u4.InterfaceC2102h;

/* renamed from: n5.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1569f implements M {
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public final C1515d f13397b;

    public AbstractC1569f(InterfaceC1526o interfaceC1526o) {
        kotlin.jvm.internal.l.f("storageManager", interfaceC1526o);
        this.f13397b = new C1515d((C1523l) interfaceC1526o, new H4.u(14, this), new A4.j(19, this));
    }

    public abstract Collection b();

    public abstract AbstractC1586x c();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof M) && obj.hashCode() == hashCode()) {
            M m7 = (M) obj;
            if (m7.getParameters().size() == getParameters().size()) {
                InterfaceC2102h interfaceC2102hF = f();
                InterfaceC2102h interfaceC2102hF2 = m7.f();
                if (interfaceC2102hF2 == null || p5.l.f(interfaceC2102hF) || Z4.e.n(interfaceC2102hF) || p5.l.f(interfaceC2102hF2) || Z4.e.n(interfaceC2102hF2)) {
                    return false;
                }
                return j(interfaceC2102hF2);
            }
        }
        return false;
    }

    public abstract u4.N h();

    public final int hashCode() {
        int i7 = this.a;
        if (i7 != 0) {
            return i7;
        }
        InterfaceC2102h interfaceC2102hF = f();
        int iIdentityHashCode = (p5.l.f(interfaceC2102hF) || Z4.e.n(interfaceC2102hF)) ? System.identityHashCode(this) : Z4.e.g(interfaceC2102hF).a.hashCode();
        this.a = iIdentityHashCode;
        return iIdentityHashCode;
    }

    @Override // n5.M
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final List g() {
        return ((C1568e) this.f13397b.invoke()).f13396b;
    }

    public abstract boolean j(InterfaceC2102h interfaceC2102h);

    public List k(List list) {
        return list;
    }
}
