package kotlin.jvm.internal;

import l4.InterfaceC1424c;
import l4.InterfaceC1443v;

/* loaded from: classes.dex */
public abstract class s extends AbstractC1403c implements InterfaceC1443v {
    private final boolean syntheticJavaProperty;

    public s(Object obj, Class cls, String str, String str2, int i7) {
        super(obj, cls, str, str2, (i7 & 1) == 1);
        this.syntheticJavaProperty = (i7 & 2) == 2;
    }

    @Override // kotlin.jvm.internal.AbstractC1403c
    public InterfaceC1424c compute() {
        return this.syntheticJavaProperty ? this : super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof s) {
            s sVar = (s) obj;
            return getOwner().equals(sVar.getOwner()) && getName().equals(sVar.getName()) && getSignature().equals(sVar.getSignature()) && l.a(getBoundReceiver(), sVar.getBoundReceiver());
        }
        if (obj instanceof InterfaceC1443v) {
            return obj.equals(compute());
        }
        return false;
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    @Override // l4.InterfaceC1443v
    public boolean isConst() {
        return getReflected().isConst();
    }

    @Override // l4.InterfaceC1443v
    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        InterfaceC1424c interfaceC1424cCompute = compute();
        if (interfaceC1424cCompute != this) {
            return interfaceC1424cCompute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    @Override // kotlin.jvm.internal.AbstractC1403c
    public InterfaceC1443v getReflected() {
        if (this.syntheticJavaProperty) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        InterfaceC1424c interfaceC1424cCompute = compute();
        if (interfaceC1424cCompute != this) {
            return (InterfaceC1443v) interfaceC1424cCompute;
        }
        throw new H5.C();
    }
}
