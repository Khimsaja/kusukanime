package O;

import e4.InterfaceC0821a;

/* renamed from: O.m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0505m0 {
    public final S a;

    public AbstractC0505m0(InterfaceC0821a interfaceC0821a) {
        this.a = new S(interfaceC0821a);
    }

    public abstract C0507n0 a(Object obj);

    public U0 b() {
        return this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final U0 c(C0507n0 c0507n0, U0 u02) {
        T0 t02;
        Object obj;
        Object obj2 = null;
        if (!(u02 instanceof I)) {
            if (u02 instanceof T0) {
                boolean z7 = c0507n0.f7103b;
                Object obj3 = c0507n0.f7106e;
                if ((z7 || obj3 != null) && !c0507n0.f7105d) {
                    if (z7) {
                        obj3 = null;
                    } else if (obj3 == null) {
                        C0486d.x("Unexpected form of a provided value");
                        throw null;
                    }
                    T0 t03 = (T0) u02;
                    boolean zA = kotlin.jvm.internal.l.a(obj3, t03.a);
                    t02 = t03;
                    if (!zA) {
                    }
                }
            } else if (u02 instanceof C0526z) {
                c0507n0.getClass();
                ((C0526z) u02).getClass();
            }
            t02 = null;
        } else if (c0507n0.f7105d) {
            I i7 = (I) u02;
            C0493g0 c0493g0 = i7.a;
            if (c0507n0.f7103b) {
                obj = null;
            } else {
                obj = c0507n0.f7106e;
                if (obj == null) {
                    C0486d.x("Unexpected form of a provided value");
                    throw null;
                }
            }
            c0493g0.setValue(obj);
            t02 = i7;
        } else {
            t02 = null;
        }
        if (t02 != null) {
            return t02;
        }
        boolean z8 = c0507n0.f7105d;
        Object obj4 = c0507n0.f7106e;
        if (z8) {
            I0 i02 = c0507n0.f7104c;
            if (i02 == null) {
                i02 = T.f7049p;
            }
            return new I(C0486d.K(obj4, i02));
        }
        if (!c0507n0.f7103b) {
            if (obj4 == null) {
                C0486d.x("Unexpected form of a provided value");
                throw null;
            }
            obj2 = obj4;
        }
        return new T0(obj2);
    }
}
