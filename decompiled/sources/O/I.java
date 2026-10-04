package O;

/* loaded from: classes.dex */
public final class I implements U0 {
    public final C0493g0 a;

    public I(C0493g0 c0493g0) {
        this.a = c0493g0;
    }

    @Override // O.U0
    public final Object a(InterfaceC0501k0 interfaceC0501k0) {
        return this.a.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof I) && this.a.equals(((I) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DynamicValueHolder(state=" + this.a + ')';
    }
}
