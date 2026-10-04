package kotlin.jvm.internal;

import l4.InterfaceC1424c;
import l4.InterfaceC1428g;

/* loaded from: classes.dex */
public abstract class i extends AbstractC1403c implements h, InterfaceC1428g {
    private final int arity;
    private final int flags;

    public i(int i7, int i8, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, (i8 & 1) == 1);
        this.arity = i7;
        this.flags = 0;
    }

    @Override // kotlin.jvm.internal.AbstractC1403c
    public InterfaceC1424c computeReflected() {
        return y.a.a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            return getName().equals(iVar.getName()) && getSignature().equals(iVar.getSignature()) && this.flags == iVar.flags && this.arity == iVar.arity && l.a(getBoundReceiver(), iVar.getBoundReceiver()) && l.a(getOwner(), iVar.getOwner());
        }
        if (obj instanceof InterfaceC1428g) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.h
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    @Override // l4.InterfaceC1428g
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // l4.InterfaceC1428g
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // l4.InterfaceC1428g
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // l4.InterfaceC1428g
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // kotlin.jvm.internal.AbstractC1403c, l4.InterfaceC1424c
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        InterfaceC1424c interfaceC1424cCompute = compute();
        if (interfaceC1424cCompute != this) {
            return interfaceC1424cCompute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    @Override // kotlin.jvm.internal.AbstractC1403c
    public InterfaceC1428g getReflected() {
        InterfaceC1424c interfaceC1424cCompute = compute();
        if (interfaceC1424cCompute != this) {
            return (InterfaceC1428g) interfaceC1424cCompute;
        }
        throw new H5.C();
    }
}
