package Z4;

import H.N;
import P3.q;
import e4.n;
import java.util.Collection;
import o5.InterfaceC1703c;
import u4.InterfaceC2088D;
import u4.InterfaceC2096b;
import u4.InterfaceC2097c;
import u4.InterfaceC2099e;
import u4.InterfaceC2105k;
import u4.InterfaceC2116w;
import u4.M;
import u4.Q;
import x4.AbstractC2257C;

/* loaded from: classes.dex */
public final class c implements InterfaceC1703c {
    public static final c a = new c();

    public static /* synthetic */ void b(int i7) {
        Object[] objArr = new Object[3];
        if (i7 != 1) {
            objArr[0] = "a";
        } else {
            objArr[0] = "b";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$1";
        objArr[2] = "equals";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static M e(InterfaceC2096b interfaceC2096b) {
        while (interfaceC2096b instanceof InterfaceC2097c) {
            InterfaceC2097c interfaceC2097c = (InterfaceC2097c) interfaceC2096b;
            if (interfaceC2097c.c() != 2) {
                break;
            }
            Collection collectionM = interfaceC2097c.m();
            kotlin.jvm.internal.l.e("getOverriddenDescriptors(...)", collectionM);
            interfaceC2096b = (InterfaceC2097c) q.L0(collectionM);
            if (interfaceC2096b == null) {
                return null;
            }
        }
        return interfaceC2096b.l();
    }

    @Override // o5.InterfaceC1703c
    public boolean a(n5.M m7, n5.M m8) {
        if (m7 == null) {
            b(0);
            throw null;
        }
        if (m8 != null) {
            return m7.equals(m8);
        }
        b(1);
        throw null;
    }

    public boolean c(InterfaceC2105k interfaceC2105k, InterfaceC2105k interfaceC2105k2, boolean z7) {
        if ((interfaceC2105k instanceof InterfaceC2099e) && (interfaceC2105k2 instanceof InterfaceC2099e)) {
            return kotlin.jvm.internal.l.a(((InterfaceC2099e) interfaceC2105k).v(), ((InterfaceC2099e) interfaceC2105k2).v());
        }
        if ((interfaceC2105k instanceof Q) && (interfaceC2105k2 instanceof Q)) {
            return d((Q) interfaceC2105k, (Q) interfaceC2105k2, z7, a.f10265k);
        }
        if (!(interfaceC2105k instanceof InterfaceC2096b) || !(interfaceC2105k2 instanceof InterfaceC2096b)) {
            return ((interfaceC2105k instanceof InterfaceC2088D) && (interfaceC2105k2 instanceof InterfaceC2088D)) ? kotlin.jvm.internal.l.a(((AbstractC2257C) ((InterfaceC2088D) interfaceC2105k)).f17354o, ((AbstractC2257C) ((InterfaceC2088D) interfaceC2105k2)).f17354o) : kotlin.jvm.internal.l.a(interfaceC2105k, interfaceC2105k2);
        }
        InterfaceC2096b interfaceC2096b = (InterfaceC2096b) interfaceC2105k;
        InterfaceC2096b interfaceC2096b2 = (InterfaceC2096b) interfaceC2105k2;
        kotlin.jvm.internal.l.f("a", interfaceC2096b);
        kotlin.jvm.internal.l.f("b", interfaceC2096b2);
        if (!interfaceC2096b.equals(interfaceC2096b2)) {
            if (kotlin.jvm.internal.l.a(interfaceC2096b.getName(), interfaceC2096b2.getName()) && ((!(interfaceC2096b instanceof InterfaceC2116w) || !(interfaceC2096b2 instanceof InterfaceC2116w) || ((InterfaceC2116w) interfaceC2096b).Q() == ((InterfaceC2116w) interfaceC2096b2).Q()) && ((!kotlin.jvm.internal.l.a(interfaceC2096b.k(), interfaceC2096b2.k()) || (z7 && kotlin.jvm.internal.l.a(e(interfaceC2096b), e(interfaceC2096b2)))) && !e.n(interfaceC2096b) && !e.n(interfaceC2096b2)))) {
                InterfaceC2105k interfaceC2105kK = interfaceC2096b.k();
                InterfaceC2105k interfaceC2105kK2 = interfaceC2096b2.k();
                if (((interfaceC2105kK instanceof InterfaceC2097c) || (interfaceC2105kK2 instanceof InterfaceC2097c)) ? false : c(interfaceC2105kK, interfaceC2105kK2, z7)) {
                    k kVar = new k(new N(2, interfaceC2096b, interfaceC2096b2, z7));
                    if (kVar.m(interfaceC2096b, interfaceC2096b2, null, true).b() != 1 || kVar.m(interfaceC2096b2, interfaceC2096b, null, true).b() != 1) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public boolean d(Q q6, Q q7, boolean z7, n nVar) {
        kotlin.jvm.internal.l.f("a", q6);
        kotlin.jvm.internal.l.f("b", q7);
        if (q6.equals(q7)) {
            return true;
        }
        if (kotlin.jvm.internal.l.a(q6.k(), q7.k())) {
            return false;
        }
        InterfaceC2105k interfaceC2105kK = q6.k();
        InterfaceC2105k interfaceC2105kK2 = q7.k();
        return (((interfaceC2105kK instanceof InterfaceC2097c) || (interfaceC2105kK2 instanceof InterfaceC2097c)) ? ((Boolean) nVar.invoke(interfaceC2105kK, interfaceC2105kK2)).booleanValue() : c(interfaceC2105kK, interfaceC2105kK2, z7)) && q6.getIndex() == q7.getIndex();
    }
}
