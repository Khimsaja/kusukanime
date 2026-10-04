package O;

/* loaded from: classes.dex */
public final class T0 implements U0 {
    public final Object a;

    public T0(Object obj) {
        this.a = obj;
    }

    @Override // O.U0
    public final Object a(InterfaceC0501k0 interfaceC0501k0) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof T0) && kotlin.jvm.internal.l.a(this.a, ((T0) obj).a);
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return A6.b.i(new StringBuilder("StaticValueHolder(value="), this.a, ')');
    }
}
